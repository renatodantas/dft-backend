package br.com.grupoprojectum.dft.converter;

import javax.persistence.AttributeConverter;

import br.com.grupoprojectum.dft.enums.TipoIndicadorEnum;

public class TipoIndicadorEnumConverter implements AttributeConverter<TipoIndicadorEnum, Character> {

    @Override
    public Character convertToDatabaseColumn(TipoIndicadorEnum tipo) {
        return (tipo == null) ? null : tipo.getCodigo();
    }

    @Override
    public TipoIndicadorEnum convertToEntityAttribute(Character codigo) {
        return TipoIndicadorEnum.criar(codigo);
    }

}
