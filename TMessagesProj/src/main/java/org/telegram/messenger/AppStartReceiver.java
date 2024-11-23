/*
 * This is the source code of Yomi.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright lingyicute 2024-2025.
 */

package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppStartReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {
        if (intent != null && Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            AndroidUtilities.runOnUIThread(() -> {
                SharedConfig.loadConfig();
                if (SharedConfig.passcodeHash.length() > 0) {
                    SharedConfig.appLocked = true;
                    SharedConfig.saveConfig();
                }
                ApplicationLoader.startPushService();
            });
        }
    }
}
