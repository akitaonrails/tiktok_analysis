package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestAnchorBatchInviteConfigModel {
    public static final TypeAdapter ADAPTER;

    @C09CT("batch_invite_sheet_auto_dismiss_ms")
    public long batchInviteSheetAutoDismissMs;

    @C09CT("quick_connect_invite_bubble_delay_sec")
    public long quickConnectInviteBubbleDelaySec;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestAnchorBatchInviteConfigModel_OptTypeAdapter();
    }

    public MultiGuestAnchorBatchInviteConfigModel() {
        this(8000L, 30L);
    }

    public MultiGuestAnchorBatchInviteConfigModel(long j, long j2) {
        this.batchInviteSheetAutoDismissMs = j;
        this.quickConnectInviteBubbleDelaySec = j2;
    }
}
