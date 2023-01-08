package pl.infoshare.validation.raise.model;

import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RaiseRequest {
    private final BigDecimal currentSalary;
    private final LocalDate proposedRaiseDate;
    private final BigDecimal proposedSalary;
    private final List<AcceptedRaise> previousRaises;

    public RaiseRequest(BigDecimal currentSalary, LocalDate proposedRaiseDate, BigDecimal proposedSalary, List<AcceptedRaise> previousRaises) {
        this.currentSalary = currentSalary;
        this.proposedRaiseDate = proposedRaiseDate;
        this.proposedSalary = proposedSalary;
        this.previousRaises = previousRaises;
    }

    public BigDecimal getCurrentSalary() {
        return currentSalary;
    }

    public LocalDate getProposedRaiseDate() {
        return proposedRaiseDate;
    }

    public BigDecimal getProposedSalary() {
        return proposedSalary;
    }

    public List<AcceptedRaise> getPreviousRaises() {
        return previousRaises;
    }
}
