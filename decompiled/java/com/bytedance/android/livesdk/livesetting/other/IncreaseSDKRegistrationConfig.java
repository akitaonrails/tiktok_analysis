package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class IncreaseSDKRegistrationConfig {
    public static final TypeAdapter ADAPTER = new IncreaseSDKRegistrationConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("avoid_component_loaded")
    public boolean avoidComponentLoading;

    @C09CT("avoid_first_frame")
    public boolean avoidFirstFrame;

    @C09CT("parse_rule_locally")
    public boolean parseRuleLocally;

    @C09CT("register_on_demand")
    public boolean registerOnDemand;

    public IncreaseSDKRegistrationConfig() {
        this(false, false, false, false);
    }

    public IncreaseSDKRegistrationConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.avoidFirstFrame = z;
        this.avoidComponentLoading = z2;
        this.registerOnDemand = z3;
        this.parseRuleLocally = z4;
    }
}
