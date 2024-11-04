package org.example;

import java.util.Date;

public class Electronics extends Product{

    private Date warranty;

    public void setWarranty(Date warranty) {
        this.warranty = warranty;
    }

    public Date getWarranty() {
        return warranty;
    }

    public Electronics(String name, double price, Date warranty) {
        super(name, price);
        setWarranty(warranty);
    }
}
