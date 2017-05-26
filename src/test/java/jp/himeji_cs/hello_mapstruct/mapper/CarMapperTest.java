package jp.himeji_cs.hello_mapstruct.mapper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import jp.himeji_cs.hello_mapstruct.dest.CarDto;
import jp.himeji_cs.hello_mapstruct.src.Car;
import jp.himeji_cs.hello_mapstruct.src.CarType;
import org.junit.Test;

public class CarMapperTest {

    @Test
    public void test() {
        // given
        Car car = new Car("Morris", 5, CarType.SEDAN);

        // when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        // then
        assertThat(carDto, is(notNullValue()));
        assertThat(carDto.getMake(), is("Morris"));
        assertThat(carDto.getSeatCount(), is(5));
        assertThat(carDto.getType(), is("SEDAN"));

        Car convCar = CarMapper.INSTANCE.carDtoToCar(carDto);
        assertEquals(car, convCar);
    }

}
