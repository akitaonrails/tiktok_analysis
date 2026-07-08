package com.ss.android.ugc.tiktok.pns.upc.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class UPCSignalSampleConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("signal_list")
    public final List<SampleData> signalList;

    public UPCSignalSampleConfig() {
        this(Boolean.FALSE, null);
    }

    public UPCSignalSampleConfig(Boolean bool, List<SampleData> list) {
        this.enable = bool;
        this.signalList = list;
    }
}
