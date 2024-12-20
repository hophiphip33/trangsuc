const apiUrl = 'http://localhost:8080/api/users'; // Địa chỉ API của backend

// Lấy tất cả người dùng và hiển thị
function getAllUsers() {
  fetch(apiUrl, {
    method: 'GET',
    headers: {
      'Authorization': 'Bearer ' + localStorage.getItem('token'), // Token (nếu có)
    }
  })
  .then(response => response.json())
  .then(users => {
    const userList = document.getElementById('users');
    userList.innerHTML = '';
    users.forEach(user => {
      const li = document.createElement('li');
      li.innerHTML = `${user.username} (${user.email}) 
                      <button onclick="deleteUser(${user.id})">Delete</button>
                      <button onclick="editUser(${user.id})">Edit</button>`;
      userList.appendChild(li);
    });
  })
  .catch(error => console.error('Error fetching users:', error));
}

// Tạo người dùng mới
function createUser(event) {
  event.preventDefault();
  const username = document.getElementById('username').value;
  const email = document.getElementById('email').value;

  fetch(apiUrl, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token'),
    },
    body: JSON.stringify({
      username: username,
      email: email,
    }),
  })
  .then(response => response.json())
  .then(user => {
    alert('User created successfully');
    getAllUsers(); // Reload the user list
  })
  .catch(error => console.error('Error creating user:', error));
}

// Cập nhật thông tin người dùng
function updateUser(event) {
  event.preventDefault();
  const id = document.getElementById('update-id').value;
  const username = document.getElementById('update-username').value;
  const email = document.getElementById('update-email').value;

  fetch(`${apiUrl}/${id}`, {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json',
      'Authorization': 'Bearer ' + localStorage.getItem('token'),
    },
    body: JSON.stringify({
      username: username,
      email: email,
    }),
  })
  .then(response => response.json())
  .then(user => {
    alert('User updated successfully');
    getAllUsers(); // Reload the user list
  })
  .catch(error => console.error('Error updating user:', error));
}

// Xóa người dùng
function deleteUser(id) {
  fetch(`${apiUrl}/${id}`, {
    method: 'DELETE',
    headers: {
      'Authorization': 'Bearer ' + localStorage.getItem('token'),
    },
  })
  .then(() => {
    alert('User deleted successfully');
    getAllUsers(); // Reload the user list
  })
  .catch(error => console.error('Error deleting user:', error));
}

// Sửa thông tin người dùng
function editUser(id) {
  fetch(`${apiUrl}/${id}`, {
    method: 'GET',
    headers: {
      'Authorization': 'Bearer ' + localStorage.getItem('token'),
    },
  })
  .then(response => response.json())
  .then(user => {
    document.getElementById('update-id').value = user.id;
    document.getElementById('update-username').value = user.username;
    document.getElementById('update-email').value = user.email;
  })
  .catch(error => console.error('Error fetching user:', error));
}

// Lắng nghe sự kiện khi submit form
document.getElementById('create-user-form').addEventListener('submit', createUser);
document.getElementById('update-user-form').addEventListener('submit', updateUser);

// Load tất cả người dùng khi trang được tải
getAllUsers();
