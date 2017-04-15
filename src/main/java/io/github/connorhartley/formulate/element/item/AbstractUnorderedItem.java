package io.github.connorhartley.formulate.element.item;

import io.github.connorhartley.formulate.element.FormElement;
import io.github.connorhartley.formulate.template.UnorderedTemplate;

public abstract class AbstractUnorderedItem implements ElementItem<UnorderedTemplate> {

    private final FormElement<UnorderedTemplate, AbstractUnorderedItem> formElement;
    private int index;

    public AbstractUnorderedItem(FormElement<UnorderedTemplate, AbstractUnorderedItem> formElement, int initialIndex) {
        this.formElement = formElement;
        this.index = initialIndex;
    }

    public FormElement<UnorderedTemplate, AbstractUnorderedItem> getFormElement() {
        return this.formElement;
    }

    public int getIndex() {
        return this.index;
    }

}
