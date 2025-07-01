package entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

import entities.Installment;

public class Contract {

    private Integer number;
    private LocalDate dueDate;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer number, LocalDate dueDate, Double totalValue) {
        this.number = number;
        this.dueDate = dueDate;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}
