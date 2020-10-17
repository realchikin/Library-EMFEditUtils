package tools.mdsd.library.emfeditutils.itempropertydescriptor;

import java.util.List;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import tools.mdsd.library.emfeditutils.itempropertydescriptor.impl.ItemPropertyDescriptorDecoratorImpl;

/**
 * Collection of various utility function to handle {@link IItemPropertyDescriptor} entities.
 */
public final class ItemPropertyDescriptorUtils {

    /**
     * Constructor not available because the class is a utility class.
     */
    private ItemPropertyDescriptorUtils() {
        // intentionally left blank
    }

    /**
     * Replace the last descriptor of a given list with a decorated descriptor.
     * 
     * @param descriptors
     *            The list of {@link IItemPropertyDescriptor} entities.
     * @return The decorated version of the last {@link IItemPropertyDescriptor} from the given
     *         list.
     * @throws IllegalArgumentException
     *             Thrown if the given list of {@link IItemPropertyDescriptor} entities is empty.
     * 
     * @see ItemPropertyDescriptorDecorator
     */
    public static ItemPropertyDescriptorDecorator decorateLastDescriptor(List<IItemPropertyDescriptor> descriptors) {
        if (descriptors.isEmpty()) {
            throw new IllegalArgumentException(
                    "In order to replace a descriptor, there has to be at least one descriptor available.");
        }
        var delegate = descriptors.remove(descriptors.size() - 1);
        var decorator = new ItemPropertyDescriptorDecoratorImpl(delegate);
        descriptors.add(decorator);
        return decorator;
    }

}
