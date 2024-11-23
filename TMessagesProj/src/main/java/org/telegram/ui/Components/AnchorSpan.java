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

public class AnchorSpan extends MetricAffectingSpan {

    private String name;

    public AnchorSpan(String n) {
         name = n.toLowerCase();
    }

    public String getName() {
        return name;
    }

    @Override
    public void updateMeasureState(TextPaint p) {

    }

    @Override
    public void updateDrawState(TextPaint tp) {

    }
}
