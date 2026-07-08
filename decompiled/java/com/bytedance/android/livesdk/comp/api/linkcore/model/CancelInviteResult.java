package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class CancelInviteResult {
    public final Map<String, byte[]> extraItems;
    public final String logId;

    public CancelInviteResult(Map<String, byte[]> map, String str) {
        this.extraItems = map;
        this.logId = str;
    }
}
