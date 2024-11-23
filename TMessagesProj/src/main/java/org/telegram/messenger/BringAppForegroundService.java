/*
 * This is the source code of Yomi.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright lingyicute 2024-2025.
 */

package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;

import org.telegram.ui.LaunchActivity;

public class BringAppForegroundService extends IntentService {

    public BringAppForegroundService() {
        super("BringAppForegroundService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Intent intent2 = new Intent(this, LaunchActivity.class);
        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent2.setAction(Intent.ACTION_MAIN);
        startActivity(intent2);
    }
}
