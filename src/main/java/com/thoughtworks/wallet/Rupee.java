package com.thoughtworks.wallet;

public class Rupee {

    private final double value;
    public Rupee(double value) throws Exception {

        if(value<0) {
            throw new Exception();
        }

        this.value = value;
    }
    public Rupee add(Rupee rupee) throws Exception {
        return new Rupee(this.value+rupee.value);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || !(obj.getClass()== Rupee.class) ) {
            return false;
        }

        Rupee rupee = (Rupee) obj;
        return this.value == rupee.value;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    
}
