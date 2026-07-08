package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class EcomImageMonitorOptData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("monitor_size")
    public final int monitorSize;

    public EcomImageMonitorOptData() {
        this(false, 30);
    }

    public EcomImageMonitorOptData(boolean z, int i) {
        this.enable = z;
        this.monitorSize = i;
    }
}
