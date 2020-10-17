package tools.mdsd.library.emfeditutils.itempropertydescriptor.impl;

import java.util.Collection;

import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;

/**
 * Wrapper for {@link IItemPropertyDescriptor} entities. The implementation does not change the
 * processing logic but just delegates every method to the given delegate.
 * 
 * Unfortunately, EMF does not provide such a class. In contrast to this implementation, the EMF
 * {@link ItemPropertyDescriptorDecorator} changes the object the {@link IItemPropertyDescriptor}
 * operates on.
 */
public class ItemPropertyDescriptorWrapper implements IItemPropertyDescriptor {

    private final IItemPropertyDescriptor delegate;

    /**
     * {@inheritDoc}
     */
    public ItemPropertyDescriptorWrapper(IItemPropertyDescriptor delegate) {
        this.delegate = delegate;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canSetProperty(Object arg0) {
        return delegate.canSetProperty(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public String getCategory(Object arg0) {
        return delegate.getCategory(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public Collection<?> getChoiceOfValues(Object arg0) {
        return delegate.getChoiceOfValues(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public String getDescription(Object arg0) {
        return delegate.getDescription(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public String getDisplayName(Object arg0) {
        return delegate.getDisplayName(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public Object getFeature(Object arg0) {
        return delegate.getFeature(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public String[] getFilterFlags(Object arg0) {
        return delegate.getFilterFlags(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public Object getHelpContextIds(Object arg0) {
        return delegate.getHelpContextIds(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public String getId(Object arg0) {
        return delegate.getId(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public IItemLabelProvider getLabelProvider(Object arg0) {
        return delegate.getLabelProvider(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public Object getPropertyValue(Object arg0) {
        return delegate.getPropertyValue(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isCompatibleWith(Object arg0, Object arg1, IItemPropertyDescriptor arg2) {
        return delegate.isCompatibleWith(arg0, arg1, arg2);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isMany(Object arg0) {
        return delegate.isMany(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isMultiLine(Object arg0) {
        return delegate.isMultiLine(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isPropertySet(Object arg0) {
        return delegate.isPropertySet(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public boolean isSortChoices(Object arg0) {
        return delegate.isSortChoices(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public void resetPropertyValue(Object arg0) {
        delegate.resetPropertyValue(arg0);
    }

    /**
     * {@inheritDoc}
     */
    public void setPropertyValue(Object arg0, Object arg1) {
        delegate.setPropertyValue(arg0, arg1);
    }

}
