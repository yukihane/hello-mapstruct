package jp.himeji_cs.hello_mapstruct.mapper;

import jp.himeji_cs.hello_mapstruct.dest.CarDto;
import jp.himeji_cs.hello_mapstruct.src.Car;
import jp.himeji_cs.hello_mapstruct.src.CarType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CarDtoMapper.CarTypeMapper.class)
public interface CarDtoMapper {

    CarDtoMapper INSTANCE = Mappers.getMapper(CarDtoMapper.class);

    @Mapping(source = "seatCount", target = "numberOfSeats")
    Car carDtoToCar(CarDto car);

    static class CarTypeMapper {
        CarType convCarType(String text) {
            if (text == null) {
                return null;
            }
            return CarType.valueOf(text);
        }
    }

}
