package tools.mdsd.library.emfeditutils.itempropertydescriptor;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * Interface for decorators of {@link IItemPropertyDescriptor}. There are setters to define
 * decorators of specified features.
 */
public interface ItemPropertyDescriptorDecorator {

    /**
     * Set a calculator for value choices that intercepts the regular value selection process.
     * 
     * @param calculator
     *            The intercepting calculator to use.
     * @see ValueChoiceCalculator
     */
    void setValueChoiceCalculator(ValueChoiceCalculator calculator);

}
