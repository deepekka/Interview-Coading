package Collection;

import java.util.Comparator;

public class My_Custom implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {

		Integer I1=(Integer)ob1;
		Integer I2=(Integer)ob2;
		return  I2.compareTo(I1);
	}

	
	}


