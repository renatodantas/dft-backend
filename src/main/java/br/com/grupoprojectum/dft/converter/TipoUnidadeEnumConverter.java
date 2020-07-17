package br.com.grupoprojectum.dft.converter;

import javax.persistence.AttributeConverter;

import br.com.grupoprojectum.dft.enums.TipoUnidadeEnum;

public class TipoUnidadeEnumConverter implements AttributeConverter<TipoUnidadeEnum, Character> {

    @Override
    public Character convertToDatabaseColumn(TipoUnidadeEnum tipo) {
        return (tipo == null) ? null : tipo.getCodigo();
    }

    @Override
    public TipoUnidadeEnum convertToEntityAttribute(Character codigo) {
        return TipoUnidadeEnum.criar(codigo);
    }

}
