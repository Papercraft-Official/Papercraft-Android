/*
 * This is the source code of Yomi.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright lingyicute 2024-2025.
 */

package com.android.internal.telephony;

public interface ITelephony {
    boolean endCall();

    void answerRingingCall();

    void silenceRinger();
}
