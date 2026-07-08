package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.model.message.linkcore.InviteResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class InviteResult {
    public final Map<String, byte[]> extraItems;
    public final String logId;
    public final InviteResponse originData;

    public InviteResult(Map<String, byte[]> map, String str, InviteResponse inviteResponse) {
        this.extraItems = map;
        this.logId = str;
        this.originData = inviteResponse;
    }
}
