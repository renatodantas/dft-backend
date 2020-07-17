package br.com.grupoprojectum.dft.converter;

import javax.persistence.AttributeConverter;

import br.com.grupoprojectum.dft.enums.StatusResultadoEnum;

public class StatusResultadoEnumConverter implements AttributeConverter<StatusResultadoEnum, Character> {

    @Override
    public Character convertToDatabaseColumn(StatusResultadoEnum tipo) {
        return (tipo == null) ? null : tipo.getCodigo();
    }

    @Override
    public StatusResultadoEnum convertToEntityAttribute(Character codigo) {
        return StatusResultadoEnum.criar(codigo);
    }

}
