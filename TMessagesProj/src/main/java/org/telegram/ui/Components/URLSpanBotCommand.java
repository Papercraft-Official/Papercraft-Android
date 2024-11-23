/*
 * This is the source code of Yomi.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright lingyicute 2024-2025.
 */

package org.telegram.ui.Components;

import android.text.TextPaint;

import org.telegram.ui.ActionBar.Theme;

public class URLSpanBotCommand extends URLSpanNoUnderline {

    public static boolean enabled = true;
    public int currentType;
    private TextStyleSpan.TextStyleRun style;

    public URLSpanBotCommand(String url, int type) {
        this(url, type, null);
    }

    public URLSpanBotCommand(String url, int type, TextStyleSpan.TextStyleRun run) {
        super(url);
        currentType = type;
        style = run;
    }

    @Override
    public void updateDrawState(TextPaint p) {
        super.updateDrawState(p);
        if (currentType == 2) {
            p.setColor(0xffffffff);
        } else if (currentType == 1) {
            p.setColor(Theme.getColor(enabled ? Theme.key_chat_messageLinkOut : Theme.key_chat_messageTextOut));
        } else {
            p.setColor(Theme.getColor(enabled ? Theme.key_chat_messageLinkIn : Theme.key_chat_messageTextIn));
        }
        if (style != null) {
            style.applyStyle(p);
        } else {
            p.setUnderlineText(false);
        }
    }
}
