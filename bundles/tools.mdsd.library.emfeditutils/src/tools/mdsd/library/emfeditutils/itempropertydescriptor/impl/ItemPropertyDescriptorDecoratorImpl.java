package tools.mdsd.library.emfeditutils.itempropertydescriptor.impl;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.ItemPropertyDescriptorDecorator;
import tools.mdsd.library.emfeditutils.itempropertydescriptor.ValueChoiceCalculator;

/**
 * Decorator class for {@link IItemPropertyDescriptor} entities. It is possible to influence a
 * predefined set of behaviors. Please refer to the setters for information about which behavior can
 * be overridden.
 */
public class ItemPropertyDescriptorDecoratorImpl extends ItemPropertyDescriptorWrapper
        implements ItemPropertyDescriptorDecorator {

    private ValueChoiceCalculator valueChoiceCalculator;

    /**
     * Constructs the decorator for the given delegate.
     * 
     * @param delegate
     *            The delegate to decorate.
     */
    public ItemPropertyDescriptorDecoratorImpl(IItemPropertyDescriptor delegate) {
        super(delegate);
        this.valueChoiceCalculator = ((object, list) -> list);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValueChoiceCalculator(ValueChoiceCalculator transformator) {
        this.valueChoiceCalculator = transformator;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<?> getChoiceOfValues(Object thisObject) {
        var superChoice = super.getChoiceOfValues(thisObject);
        return valueChoiceCalculator.getValueChoice(thisObject, superChoice);
    }

}
