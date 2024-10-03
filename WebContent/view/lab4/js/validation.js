function validateForm() {
	const username = document.getElementById('username').value;
	const password = document.getElementById('password').value;

	if (username === '') {
		Swal.fire({
			icon: "error",
			title: "Oops...",
			text: "Chưa nhập Username!",
		});
		return false;
	} else if (password === '') {
		Swal.fire({
			icon: "error",
			title: "Oops...",
			text: "Chưa nhập mật khẩu!",
		});
		console.log("Sai");
		return false;  // Ngăn không cho submit form
	}
	else {
	        event.preventDefault(); // Ngăn form submit ngay lập tức
	        Swal.fire({
	            title: "Good job!",
	            text: "Tạo User thành công!",
	            icon: "success"
	        }).then(() => {
	            document.querySelector("form").submit();
	        });
	        return true;
	    }
}
