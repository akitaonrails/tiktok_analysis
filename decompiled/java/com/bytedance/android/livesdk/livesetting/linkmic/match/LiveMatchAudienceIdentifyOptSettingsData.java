package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMatchAudienceIdentifyOptSettingsData {
    public static final TypeAdapter ADAPTER = new LiveMatchAudienceIdentifyOptSettingsData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_armies_fallback")
    public boolean enable_armies_fallback;

    @C09CT("enable_block_match_open_msg")
    public boolean enable_block_match_open_msg;

    @C09CT("enable_open_message_cache")
    public boolean enable_open_message_cache;

    @C09CT("enable_sei_fallback")
    public boolean enable_sei_fallback;

    public LiveMatchAudienceIdentifyOptSettingsData() {
        this(false, false, false, false);
    }

    public LiveMatchAudienceIdentifyOptSettingsData(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enable_open_message_cache = z;
        this.enable_sei_fallback = z2;
        this.enable_armies_fallback = z3;
        this.enable_block_match_open_msg = z4;
    }
}
