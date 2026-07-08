package com.ss.android.ugc.aweme.music.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicNetworkMonitorConfig {

    @C09CT("network_log_enabled")
    public final boolean networkLogEnable = true;

    @C09CT("business_log_enabled")
    public final boolean businessLogEnable = true;

    @C09CT("tt2dsp_network_log_enabled")
    public final boolean tt2dspNetworkLogEnable = true;

    public final boolean getBusinessLogEnable() {
        return this.businessLogEnable;
    }

    public final boolean getNetworkLogEnable() {
        return this.networkLogEnable;
    }

    public final boolean getTt2dspNetworkLogEnable() {
        return this.tt2dspNetworkLogEnable;
    }
}
