package es.upm.miw.forge.ecp2;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

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
            throw new ArithmeticException("Empty collection");
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
            throw new ArithmeticException("Empty collection");
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
              throw new ArithmeticException("Empty collection");
          }
          double result = Double.POSITIVE_INFINITY;
          for (double item : this.collection) {
              if (item <result) {
                  result = item;
              }
          }
          return result;	
    }

}
