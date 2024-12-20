const slider = document.querySelector('.slider');
const slides = document.querySelectorAll('.slide');
const prev = document.querySelector('.prev');
const next = document.querySelector('.next');
const dots = document.querySelectorAll('.dot');

let currentIndex = 0;
const totalSlides = slides.length;

// Hàm hiển thị slide theo index
function showSlide(index) {
    slider.style.transform = `translateX(-${index * 100}%)`;
    dots.forEach(dot => dot.classList.remove('active'));
    dots[index].classList.add('active');
}

// Chuyển sang slide tiếp theo
function nextSlide() {
    currentIndex = (currentIndex + 1) % totalSlides;
    showSlide(currentIndex);
}

// Chuyển về slide trước đó
function prevSlide() {
    currentIndex = (currentIndex - 1 + totalSlides) % totalSlides;
    showSlide(currentIndex);
}

// Tự động chuyển slide sau mỗi 3 giây
let autoSlide = setInterval(nextSlide, 3000);

// Dừng tự động chuyển khi hover vào slider
document.querySelector('.slider-container').addEventListener('mouseenter', () => {
    clearInterval(autoSlide);
});

// Khởi động lại tự động chuyển khi rời chuột khỏi slider
document.querySelector('.slider-container').addEventListener('mouseleave', () => {
    autoSlide = setInterval(nextSlide, 3000);
});

// Gán sự kiện click cho nút prev và next
prev.addEventListener('click', prevSlide);
next.addEventListener('click', nextSlide);

// Gán sự kiện click cho các dot
dots.forEach(dot => {
    dot.addEventListener('click', () => {
        currentIndex = parseInt(dot.dataset.index);
        showSlide(currentIndex);
    });
});
