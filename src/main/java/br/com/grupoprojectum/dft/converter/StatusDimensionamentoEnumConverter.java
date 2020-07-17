package br.com.grupoprojectum.dft.converter;

import javax.persistence.AttributeConverter;

import br.com.grupoprojectum.dft.enums.StatusDimensionamentoEnum;

public class StatusDimensionamentoEnumConverter implements AttributeConverter<StatusDimensionamentoEnum, Character> {

    @Override
    public Character convertToDatabaseColumn(StatusDimensionamentoEnum tipo) {
        return (tipo == null) ? null : tipo.getCodigo();
    }

    @Override
    public StatusDimensionamentoEnum convertToEntityAttribute(Character codigo) {
        return StatusDimensionamentoEnum.criar(codigo);
    }

}
