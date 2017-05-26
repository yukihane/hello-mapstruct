package jp.himeji_cs.hello_mapstruct.src;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;
}
