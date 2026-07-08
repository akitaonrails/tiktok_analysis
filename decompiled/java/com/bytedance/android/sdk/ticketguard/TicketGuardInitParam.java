package com.bytedance.android.sdk.ticketguard;

import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public interface TicketGuardInitParam {
    long getAppStartTimeMs();

    Context getApplicationContext();

    ILogger getLogger();

    IMonitor getMonitor();
}
