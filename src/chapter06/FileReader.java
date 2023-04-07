package chapter06;

import java.io.IOException;
import java.io.InputStream;

/**
 * Brief summary of this class, ending with a period.
 *
 * It is common to leave a blank line between the summary and further details.
 * The summary (everything before the first period) is used in the class or package
 * overview section.
 *
 * The following inline tags can be used (not an exhaustive list):
 * {@code code goes here} for formatting as code
 * {@literal <>[]()foo} for interpreting literal text without converting to HTML markup
 * or other tags.
 *
 * Optionally, the following tags may be used at the end of class documentation
 * (not an exhaustive list):
 *
 * @author John Doe
 * @version 1.0
 * @since 5/10/15
 * @deprecated This class has been replaced by some.other.package.BetterFileReader
 *
 * You can also have custom tags for displaying additional information.
 * Using the @custom.<NAME> tag and the -tag custom.<NAME>:htmltag:"context"
 * command line option, you can create a custom tag.
 *
 * Example custom tag and generation:
 * @custom.updated 2.0
 * Javadoc flag: -tag custom.updated:a:"Updated in version:"
 * The above flag will display the value of @custom.updated under "Updated in version:"
 *
 */
public class FileReader {
    /**
     * Brief summary of method, ending with a period.
     *
     * Further description of method and what it does, including as much detail as is
     * appropriate. Inline tags such as
     * {@code code here}  and {@literal text here} can be used.
     *
     * If a method overrides a superclass method, {@inheritDoc} can be used to copy the
     * documentation
     * from the superclass method
     *
     * @param stream Describe this parameter. Include as much detail as is appropriate
     * Parameter docs are commonly aligned as here, but this is optional.
     * As with other docs, the documentation before the first period is
     * used as a summary.
     *
     * @return Describe the return values. Include as much detail as is appropriate
     * Return type docs are commonly aligned as here, but this is optional.
     * As with other docs, the documentation before the first period is used as a
     * summary.
     *
     * @throws IOException Describe when and why this exception can be thrown.
     * Exception docs are commonly aligned as here, but this is
     * optional.
     * As with other docs, the documentation before the first period
     * is used as a summary.
     * Instead of @throws, @exception can also be used.
     *
     * @since 2.1.0
     * @deprecated Describe why this method is outdated. A replacement can also be specified.
     */
    public String[] read(InputStream stream) throws IOException {
        return null;
    }
}
