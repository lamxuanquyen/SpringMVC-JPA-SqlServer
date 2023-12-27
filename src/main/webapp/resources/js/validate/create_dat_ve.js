$(document).ready(function () {
    function validateCccd() {
        let cccd = $("#cccd").val();

        if (cccd === "") {
            $("#errorCCCD").text("* Không được để trống!")
            return false;
        }
        $("#errorCCCD").text("")
        return true;
    }

    function validateHoTen() {
        let hoTen = $("#hoTen").val();

        if (hoTen === "") {
            $("#errorHoTen").text("* Không được để trống!")
            return false;
        }
        $("#errorHoTen").text("")
        return true;
    }

    function validateNgaySinh() {
        let ngaySinh = $("#ngaySinh").val();

        if (ngaySinh === "") {
            $("#errorNgaySinh").text("* Không được để trống!")
            return false;
        }
        $("#errorNgaySinh").text("")
        return true;
    }

    function validateSoDienThoai() {
        let soDienThoai = $("#soDienThoai").val();

        if (soDienThoai === "") {
            $("#errorSoDienThoai").text("* Không được để trống!")
            return false;
        }
        $("#errorSoDienThoai").text("")
        return true;
    }

    function validateNgayXetNghiem() {
        let ngayXetNghiem = $("#ngayXetNghiem").val();

        if (ngayXetNghiem === "") {
            $("#errorNgayXetNghiem").text("* Không được để trống!")
            return false;
        }
        $("#errorNgayXetNghiem").text("")
        return true;
    }

    function validateMaDatVe() {
        let maDV = $("#maDatVe").val();

        if (maDV === "") {
            $("#errorMaDatVe").text("* Không được để trống!")
            return false;
        }
        $("#errorMaDatVe").text("")
        return true;
    }

    function validateNgayDatVe() {
        let ngayDatVe = $("#ngayDatVe").val();

        if (ngayDatVe === "") {
            $("#errorNgayDatVe").text("* Không được để trống!")
            return false;
        }
        $("#errorNgayDatVe").text("")
        return true;
    }

    function validateBienSoXe() {
        let bienSoXe = $("#bienSoXe").val();

        if (bienSoXe === "") {
            $("#errorBienSoXe").text("* Không được để trống!")
            return false;
        }
        $("#errorBienSoXe").text("")
        return true;
    }

    function validateDiaDiemXuatPhat() {
        let diaDiemXuatPhat = $("#diaDiemXuatPhat").val();

        if (diaDiemXuatPhat === "") {
            $("#errorDiaDiemXuatPhat").text("* Không được để trống!")
            return false;
        }
        $("#errorDiaDiemXuatPhat").text("")
        return true;
    }

    function validateDiaDiemDen() {
        let diaDiemDen = $("#diaDiemDen").val();

        if (diaDiemDen === "") {
            $("#errorDiaDiemDen").text("* Không được để trống!")
            return false;
        }
        $("#errorDiaDiemDen").text("")
        return true;
    }
    
    function getToday() {
		var now = new Date();
		return new Date(now.getFullYear(), now.getMonth(), now.getDate());
	}

    function validateNgayXuatPhat() {
        let ngayXuatPhat = $("#ngayXuatPhat").val();

        if (ngayXuatPhat === "") {
            $("#errorNgayXuatPhat").text("* Không được để trống!")
            return false;
        }else {
			let day = parseInt(ngayXuatPhat.split("-")[2]);
	        let month = parseInt(ngayXuatPhat.split("-")[1]);
	        let year = parseInt(ngayXuatPhat.split("-")[0]);
			
			let ngayXuatPhatDate = new Date(year, month-1, day);
			
			if (ngayXuatPhatDate.getTime() < getToday().getTime()) {
            	$("#errorNgayXuatPhat").text("* Ngày xuất phát phải lớn hơn hoặc bằng ngày hiện tại!")
           		return false;
            }			
		}

        $("#errorNgayXuatPhat").text("")
        return true;
    }


    $(document).on("submit", "#formDatVe", function (event) {
        event.preventDefault();

        if (!validateCccd() | !validateHoTen() | !validateNgaySinh() | !validateSoDienThoai()
            | !validateNgayXetNghiem() | !validateNgayDatVe() | !validateBienSoXe() | !validateDiaDiemXuatPhat()
            | !validateDiaDiemDen() | !validateNgayXuatPhat()) {
            return;
        }

        this.submit();
    })
})