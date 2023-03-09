
package acme.entities.activity;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			summary;

	protected ActivityType		activityType;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@PastOrPresent
	protected Date				startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@PastOrPresent
	protected Date				endDate;

	@URL
	protected String			moreInfo;

	// Derived attributes -----------------------------------------------------


	public Long calcularTiempo() {
		final Long duracionMillis = this.startDate.getTime() - this.endDate.getTime(); //calcular la duración en milisegundos

		final Long minutos = TimeUnit.MILLISECONDS.toMinutes(duracionMillis); //obtener la duración en minutos

		return minutos;
	}

}
