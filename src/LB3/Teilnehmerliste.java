package LB3;

public class Teilnehmerliste {
	private Element start = null;
	private Element end = null;
	private int count = 0;
	
	public void add(Teilnehmer t)
	{
		Element e = new Element(t);
		if (this.start == null)
		{
			this.start = e;		
		}
		else
		{
			this.end.setNext(e);		
	    }
		this.end = e;
		this.count++;
	}

	public int size()
	{
		return this.count;
	}

	@Override
	public String toString()
	{
		String s = "[";
		Element e = this.start;
		while (e != null)
		{
			if (!s.equals("["))
			{
				s += ", ";
			}
			s += e.getTeilnehmer().toString();
			e = e.getNext();
		}
		return s + "]";
	}

	// Ist Liste leer?
	public boolean isEmpty() {

		if (this.size() == 0) {
			return true;
		}else {
			return false;
		}

	}

	public int indexOf(Teilnehmer t) {

		Element temp = this.start;

		int index = 0;



		while ((!temp.getTeilnehmer().getName().equals(t.getName())) && (!temp.getTeilnehmer().getVorname().equals((t.getVorname())))) {

			if (temp.getNext() == null) {
				return -1;
			}

			temp = temp.getNext();

			index++;

		}
		return index;
	}

	//Remove last element
	public boolean removeLast() {

		if (this.size() < 1) {
			return false;
		}else {

			Element temp = this.start;
			Element previous;

			boolean deleted = false;

			if (temp.getNext() == null) {

				start = start.getNext();

				deleted = true;

			} else {

				previous = start;
				temp = start.getNext();

				while (temp != null) {

					if (temp.getNext() == null) {

						previous.setNext(null);

						temp = null;

						return true;
					} else {

						previous = temp;
						temp = temp.getNext();

					}


				}

			}

			return deleted;

		}
	}

	// Turn around order of the list
	public Teilnehmerliste reverse() {

		Teilnehmerliste result = new Teilnehmerliste();

		return result;

	}

}
