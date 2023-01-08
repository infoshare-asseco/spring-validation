package pl.infoshare.validation.raise.model;

import lombok.Value;
import pl.infoshare.validation.raise.validators.MaxPercentageRaise;
import pl.infoshare.validation.raise.validators.MaxRaiseDate;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@MaxPercentageRaise(maxPercents = 30)
public class RaiseRequest {

    @NotNull
    private final BigDecimal currentSalary;

    @Future
    @MaxRaiseDate
    private final LocalDate proposedRaiseDate;
    private final BigDecimal proposedSalary;

    @NotNull
    @Size(max = 2)
    @Valid
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
