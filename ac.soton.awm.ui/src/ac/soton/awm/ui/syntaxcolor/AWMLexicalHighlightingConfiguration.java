/**
 * 
 */
package ac.soton.awm.ui.syntaxcolor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * @author vitaly
 *
 */
public class AWMLexicalHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	public static final String PROCESS_ID = "process";
	public static final String REGISTER_ID = "register";
	public static final String ADDRESS_ID = "address";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);

		// acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword",
		// keywordTextStyle());
		// acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment",
		// commentTextStyle());
		acceptor.acceptDefaultHighlighting(PROCESS_ID, "Process",
				processTextStyle());
		acceptor.acceptDefaultHighlighting(REGISTER_ID, "Register",
				registerTextStyle());
		acceptor.acceptDefaultHighlighting(ADDRESS_ID, "Address",
				addressTextStyle());
	}

	public TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(34, 74, 251));
		return textStyle;
	}

	public TextStyle commentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(60, 130, 5));
		return textStyle;
	}

	public TextStyle processTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(130, 49, 128));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	private TextStyle registerTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(129, 34, 21));
		return textStyle;
	}

	private TextStyle addressTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(10, 33, 128));
		return textStyle;
	}
}
