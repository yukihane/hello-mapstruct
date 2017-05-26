package jp.himeji_cs.hello_mapstruct.mapper;

import jp.himeji_cs.hello_mapstruct.dest.CarDto;
import jp.himeji_cs.hello_mapstruct.src.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}
