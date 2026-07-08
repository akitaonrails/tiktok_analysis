package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreForwardStreamConfig {
    public static final TypeAdapter ADAPTER = new PreForwardStreamConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_forward_refact")
    public boolean enableForwardRefact;

    @C09CT("enable_opt_subscrip")
    public boolean enableOptSubscrip;

    @C09CT("enable_pre_forward")
    public boolean enablePreForward;

    public PreForwardStreamConfig() {
        this(true, true, true);
    }

    public PreForwardStreamConfig(boolean z, boolean z2, boolean z3) {
        this.enablePreForward = z;
        this.enableForwardRefact = z2;
        this.enableOptSubscrip = z3;
    }
}
