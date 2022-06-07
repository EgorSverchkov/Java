package parse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CBRparse {
    public static void main(String[] args) {
        List<parse> parseList = new ArrayList<>();


    }

}



class parse{
private LocalDateTime localDateTime;
private Double percentCbr;

    public parse(LocalDateTime localDateTime, Double percentCbr) {
        this.localDateTime = localDateTime;
        this.percentCbr = percentCbr;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Double getPercentCbr() {
        return percentCbr;
    }

    public void setPercentCbr(Double percentCbr) {
        this.percentCbr = percentCbr;
    }
}
