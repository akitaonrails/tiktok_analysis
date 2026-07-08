package com.ss.android.ugc.aweme.live.notification.repository;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationGameStatus {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public NotificationGameStatus(String str, int i) {
        this.statusMsg = str;
        this.statusCode = i;
    }
}
