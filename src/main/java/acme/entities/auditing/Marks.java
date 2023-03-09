
package acme.entities.auditing;

public enum Marks {
	A_PLUS {

		@Override
		public String toString() {
			return "A+";
		}
	},
	A, B, C, F, F_MINUS {

		@Override
		public String toString() {
			return "F-";
		}
	},
}
