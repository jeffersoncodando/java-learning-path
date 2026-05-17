package ch04_inheritance_polymorphism.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    public static final DateTimeFormatter OUTPUT_DATE_FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate manufactureDate;

    public UsedProduct(){
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.getName()
                + " (used) $"
                + String.format(" %.2f ", super.getPrice())
                + "(Manufacture date: " + OUTPUT_DATE_FMT.format(manufactureDate) + ")";
    }
}
