/*
 * This is the source code of Yomi.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright lingyicute 2024-2025.
 */

package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class TextPaintUrlSpan extends MetricAffectingSpan {

    private TextPaint textPaint;
    private int textSize;
    private int color;
    private String currentUrl;

    public TextPaintUrlSpan(TextPaint paint, String url) {
        textPaint = paint;
        currentUrl = url;
    }

    public String getUrl() {
        return currentUrl;
    }

    public TextPaint getTextPaint() {
        return textPaint;
    }

    @Override
    public void updateMeasureState(TextPaint p) {
        if (textPaint != null) {
            p.setColor(textPaint.getColor());
            p.setTypeface(textPaint.getTypeface());
            p.setFlags(textPaint.getFlags());
            p.setTextSize(textPaint.getTextSize());
            p.baselineShift = textPaint.baselineShift;
            p.bgColor = textPaint.bgColor;
        }
    }

    @Override
    public void updateDrawState(TextPaint p) {
        if (textPaint != null) {
            p.setColor(textPaint.getColor());
            p.setTypeface(textPaint.getTypeface());
            p.setFlags(textPaint.getFlags());
            p.setTextSize(textPaint.getTextSize());
            p.baselineShift = textPaint.baselineShift;
            p.bgColor = textPaint.bgColor;
        }
    }
}
