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

public class NotificationRepeat extends IntentService {

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        final int currentAccount = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        if (!UserConfig.isValidAccount(currentAccount)) {
            return;
        }
        AndroidUtilities.runOnUIThread(() -> NotificationsController.getInstance(currentAccount).repeatNotificationMaybe());
    }
}
