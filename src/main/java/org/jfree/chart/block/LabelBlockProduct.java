package org.jfree.chart.block;


import org.jfree.chart.text.TextBlock;
import java.awt.Font;
import java.awt.Paint;
import org.jfree.chart.util.Args;
import org.jfree.chart.text.TextUtils;
import java.io.Serializable;
import org.jfree.chart.util.PublicCloneable;

public class LabelBlockProduct implements Serializable, PublicCloneable {
	private String text;
	private TextBlock label;
	private Font font;
	private transient Paint paint;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextBlock getLabel() {
		return label;
	}

	public void setLabel(TextBlock label) {
		this.label = label;
	}

	public Font getFont() {
		return font;
	}

	public void setFont2(Font font) {
		this.font = font;
	}

	public Paint getPaint() {
		return paint;
	}

	public void setPaint2(Paint paint) {
		this.paint = paint;
	}

	/**
	* Sets the font and regenerates the label.
	* @param font   the font ( {@code  null}  not permitted).
	* @see #getFont()
	*/
	public void setFont(Font font) {
		Args.nullNotPermitted(font, "font");
		this.font = font;
		this.label = TextUtils.createTextBlock(this.text, font, this.paint);
	}

	/**
	* Sets the paint and regenerates the label.
	* @param paint   the paint ( {@code  null}  not permitted).
	* @see #getPaint()
	*/
	public void setPaint(Paint paint) {
		Args.nullNotPermitted(paint, "paint");
		this.paint = paint;
		this.label = TextUtils.createTextBlock(this.text, this.font, this.paint);
	}

	public Object clone() throws CloneNotSupportedException {
		return (LabelBlockProduct) super.clone();
	}
}