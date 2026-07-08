package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchTechMonitorConfig {
    public static final TypeAdapter ADAPTER = new MatchTechMonitorConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_funnel_detail")
    public boolean enableFunnelDetail;

    @C09CT("enable_invitee_request_from_passing")
    public boolean enableInviteeRequestFromPassing;

    @C09CT("enable_request_from")
    public boolean enableRequestFrom;

    public MatchTechMonitorConfig() {
        this(true, true, true);
    }

    public MatchTechMonitorConfig(boolean z, boolean z2, boolean z3) {
        this.enableRequestFrom = z;
        this.enableFunnelDetail = z2;
        this.enableInviteeRequestFromPassing = z3;
    }
}
