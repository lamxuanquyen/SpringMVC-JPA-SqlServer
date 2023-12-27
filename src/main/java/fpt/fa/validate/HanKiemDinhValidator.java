package fpt.fa.validate;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HanKiemDinhValidator implements ConstraintValidator<HanKiemDinh, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if (value == null) {
			return false;
		}
	
		try {
			LocalDate parsedDate = LocalDate.parse(value.toString());
			LocalDate currentDate = LocalDate.now();
			return parsedDate.isAfter((currentDate.plusMonths(1)));
		} catch (Exception e) {
			return false;
		}
	}


}
