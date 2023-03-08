
package acme.entities.enrolment;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.entities.activity.Activity;
import acme.entities.worbook.Worbook;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enrolment extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0-9]{3}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			motivation;

	@NotBlank
	@Length(max = 100)
	protected String			goals;


	// Derived attributes -----------------------------------------------------
	public Long worktimeCalculation() {
		long res = 0L;
		final List<Activity> ls = this.worbook.getActivities();
		Long tiempo;
		for (final Activity a : ls) {
			tiempo = a.calcularTiempo();
			res += tiempo;
		}

		return res;
	}


	@NotNull
	@Valid
	@OneToOne()
	protected Worbook worbook;

}
