package tools.mdsd.library.emfeditutils.itempropertydescriptor;

import java.util.Collection;

/**
 * A calculator that derives a set of values to be chosen from an existing list of available
 * choices.
 */
@FunctionalInterface
public interface ValueChoiceCalculator {

    /**
     * Derives a list of value choices from a given list of available values and a given object.
     * 
     * The method usually applies a filter on the given values but it is free to yield an arbitrary
     * list of values.
     * 
     * @param object
     *            The object for which the choice of values shall be calculated.
     * @param originalChoice
     *            The set of available values to choose from.
     * @return A new set of values to choose from.
     */
    Collection<?> getValueChoice(Object object, Collection<?> originalChoice);

}
