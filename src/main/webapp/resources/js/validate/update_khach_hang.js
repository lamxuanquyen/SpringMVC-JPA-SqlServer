$(document).ready(function () {
    
    function validateNgayXetNghiem() {
		let ketQuaXetNghiem = $("#ketQuaXetNghiem").val();
        let ngayXetNghiem = $("#ngayXetNghiem").val();

        if (ketQuaXetNghiem !== "") {
			if (ngayXetNghiem === "") {
				$("#errorNgayXetNghiem").text("* ban can nhap du lieu cho truong nay!")
            	return false;
			}            
        }
        $("#errorNgayXetNghiem").text("")
        return true;
    }

    $(document).on("submit", "#formUpdate", function (event) {
        event.preventDefault();

        if (!validateNgayXetNghiem()) {
            return;
        }

        this.submit();
    })
})