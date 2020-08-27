package gb.controller;

import gb.persist.Category;
import gb.persist.CategoryRepository;

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
public class CategoryConverter implements Converter<Category> {

    @Inject
    private CategoryRepository categoryRepository;

    @Override
    public Category getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        return categoryRepository.findById(Long.parseLong(value))
                .orElseThrow(() -> new ConverterException(new FacesMessage(String.format("%s is not correct id", value))));
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Category value) {
        if (value == null) {
            return "";
        }
        return String.valueOf(value.getId());
    }
}
