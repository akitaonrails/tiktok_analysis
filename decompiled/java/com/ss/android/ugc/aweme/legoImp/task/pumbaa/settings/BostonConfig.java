package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class BostonConfig {

    @C09CT("auto_isolate_for_1st_cdn")
    public boolean autoIsolateFor1stCDN;

    @C09CT("auto_isolate_for_3rd")
    public boolean autoIsolateFor3rd;

    @C09CT("auto_isolate_for_all_3rd")
    public boolean autoIsolateForAll3rd;

    @C09CT("enable_pumbaa_3rd_network_identifier")
    public boolean enablePumbaa3rdNetworkIdentifier;

    public BostonConfig() {
        this(false, false, false, true);
    }

    public BostonConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.autoIsolateFor3rd = z;
        this.autoIsolateForAll3rd = z2;
        this.autoIsolateFor1stCDN = z3;
        this.enablePumbaa3rdNetworkIdentifier = z4;
    }
}
