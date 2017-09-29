package es.upm.miw.forge.ecp2;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {
	static final String MESSAGE_EMPTY = "Empty collection";

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }
    
    public boolean isEmpty() {
    	return this.collection.isEmpty();
    }

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(MESSAGE_EMPTY);
        }
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(MESSAGE_EMPTY);
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    
    public double lower() {
    	  assert collection != null;
          if (this.collection.isEmpty()) {
              throw new ArithmeticException(MESSAGE_EMPTY);
          }
          double result = Double.POSITIVE_INFINITY;
          for (double item : this.collection) {
              if (item <result) {
                  result = item;
              }
          }
          return result;	
    }
    
    public double getFirst() {
    	assert this.collection != null;
    	if (this.collection.isEmpty()) {
            throw new ArithmeticException(MESSAGE_EMPTY);
        }
    	return this.collection.get(0);
    }

}
