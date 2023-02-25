
package acme.worbook;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import acme.activity.Activity;
import acme.framework.data.AbstractEntity;

public class Worbook extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			summary;

	protected List<Activity>	activities;

}
