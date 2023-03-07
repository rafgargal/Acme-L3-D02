
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assistant extends AbstractRole {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			supervisor;

	@NotBlank
	@Length(max = 100)
	protected String			resume;

	@NotBlank
	@Length(max = 100)
	@Pattern(regexp = "^(\\w+)(,\\s*\\w+)*$")
	protected String			expertiseFields;

	@URL
	protected String			furtherInfo;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
