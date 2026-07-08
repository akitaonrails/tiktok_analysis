package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveDirectMatchData {
    public static final TypeAdapter ADAPTER;

    @C09CT("enable_quick_match_from_profile_card")
    public int enableQuickMatchFromProfileCard;

    @C09CT("enabled")
    public int enabled;

    @C09CT("invitee_timeout_duration")
    public int inviteeTimeout;

    @C09CT("inviter_timeout_duration")
    public int inviterTimeout;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveDirectMatchData_OptTypeAdapter();
    }

    public LiveDirectMatchData() {
        this(0, 20, 15, 0);
    }

    public LiveDirectMatchData(int i, int i2, int i3, int i4) {
        this.enabled = i;
        this.inviterTimeout = i2;
        this.inviteeTimeout = i3;
        this.enableQuickMatchFromProfileCard = i4;
    }
}
