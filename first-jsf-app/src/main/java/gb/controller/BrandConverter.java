package gb.controller;

import gb.persist.Brand;
import gb.persist.BrandRepository;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;


@RequestScoped
@Named
public class BrandConverter implements Converter<Brand> {

    @Inject
    private BrandRepository brandRepository;

    @Override
    public Brand getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        return brandRepository.findById(Long.parseLong(value))
                .orElseThrow(() -> new ConverterException(new FacesMessage(String.format("%s is not correct id", value))));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Brand value) {
        if (value == null) {
            return "";
        }
        return String.valueOf(value.getId());
    }
}
