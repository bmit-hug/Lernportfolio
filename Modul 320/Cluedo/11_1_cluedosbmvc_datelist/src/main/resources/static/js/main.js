const parallax = {
    element: document.getElementById('parallax'),
    speed: 0.8,
}

function handleScroll() {
    parallax.element.style.top = `${window.scrollY * parallax.speed}px`
}

window.addEventListener('scroll', handleScroll)
