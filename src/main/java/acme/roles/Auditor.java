
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditor extends AbstractRole {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank
	@Size(max = 76)
	protected String			firm;

	@NotBlank
	@Size(max = 26)
	protected String			profesional_ID;

	@NotBlank
	@Size(max = 101)
	protected String			list_Certification;

	protected String			link;

}
