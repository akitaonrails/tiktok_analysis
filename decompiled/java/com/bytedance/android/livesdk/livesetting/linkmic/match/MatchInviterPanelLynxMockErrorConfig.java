package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchInviterPanelLynxMockErrorConfig {
    public static final TypeAdapter ADAPTER = new MatchInviterPanelLynxMockErrorConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("error_after_invite")
    public boolean errorAfterInvite;

    @C09CT("error_before_invite")
    public boolean errorBeforeInvite;

    @C09CT("start_up_error")
    public boolean startUpError;

    @C09CT("time_up_error")
    public boolean timeUpError;

    public MatchInviterPanelLynxMockErrorConfig() {
        this(false, false, false, false);
    }

    public MatchInviterPanelLynxMockErrorConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.startUpError = z;
        this.timeUpError = z2;
        this.errorBeforeInvite = z3;
        this.errorAfterInvite = z4;
    }
}
