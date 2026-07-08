package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class CancelApplyResult {
    public final Map<String, byte[]> extraItems;
    public final String logId;

    public CancelApplyResult(Map<String, byte[]> map, String str) {
        this.extraItems = map;
        this.logId = str;
    }
}
