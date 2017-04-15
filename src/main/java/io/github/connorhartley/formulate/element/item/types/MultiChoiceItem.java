package io.github.connorhartley.formulate.element.item.types;

import io.github.connorhartley.formulate.element.FormElement;
import io.github.connorhartley.formulate.element.item.AbstractUnorderedItem;
import io.github.connorhartley.formulate.template.UnorderedTemplate;
import org.spongepowered.api.text.Text;

public class MultiChoiceItem extends AbstractUnorderedItem {

    private final Text name;
    private UnorderedTemplate template;

    public MultiChoiceItem(FormElement<UnorderedTemplate, AbstractUnorderedItem> formElement, int initialIndex, Text name) {
        super(formElement, initialIndex);
        this.name = name;
    }

    @Override
    public Text getActions() {
        return this.name;
    }

    @Override
    public int getPosition(boolean absolute) {
        if (absolute) {
            return this.getIndex() + this.getFormElement().getPosition();
        }

        return this.getFormElement().getPosition() + this.getFormElement().getHeight();
    }

    @Override
    public UnorderedTemplate getTemplate() {
        return this.template;
    }

    @Override
    public void setTemplate(UnorderedTemplate template) {
        this.template = template;
    }

}
