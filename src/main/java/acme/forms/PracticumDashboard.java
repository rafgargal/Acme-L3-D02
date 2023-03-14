
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PracticumDashboard extends AbstractForm {

	//Serialisation Identifier

	protected static final long	serialVersionUID	= 1L;

	//Attributes

	Map<String, Integer>		totalPracticaByMonth;

	double						averageSessionLength;

	double						deviationSessionLength;

	double						minimunSessionLength;

	double						maximumSessiongLength;
}
