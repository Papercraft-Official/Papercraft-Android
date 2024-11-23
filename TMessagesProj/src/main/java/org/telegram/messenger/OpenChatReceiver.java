/*
 * This is the source code of Yomi.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright lingyicute 2024-2025.
 */

package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.telegram.ui.LaunchActivity;

public class OpenChatReceiver extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openchat")) {
            finish();
            return;
        }
        try {
            long chatId = intent.getLongExtra("chatId", intent.getIntExtra("chatId", 0));
            long userId = intent.getLongExtra("userId", intent.getIntExtra("userId", 0));
            int encId = intent.getIntExtra("encId", 0);
            if (chatId == 0 && userId == 0 && encId == 0) {
                return;
            }
        } catch (Throwable e) {
            FileLog.e(e);
            return;
        }
        Intent intent2 = new Intent(this, LaunchActivity.class);
        intent2.setAction(intent.getAction());
        intent2.putExtras(intent);
        startActivity(intent2);
        finish();

        /*

         */
    }
}
