package com.ss.android.ugc.aweme.net.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkMonitorConfig {

    @C09CT("enableHttpClientMonitor")
    public boolean enableHttpClientMonitor;

    @C09CT("enableNetworkMonitor")
    public boolean enableNetworkMonitor;

    @C09CT("enableOkHttpMonitor")
    public boolean enableOkHttpMonitor;

    @C09CT("enableTTNetMonitor")
    public boolean enableTTNetMonitor;

    @C09CT("enableUrlConnectionMonitor")
    public boolean enableUrlConnectionMonitor;

    @C09CT("enableWebMonitor")
    public boolean enableWebMonitor;

    public NetworkMonitorConfig() {
        this(true, true, true, true, true, true);
    }

    public NetworkMonitorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableNetworkMonitor = z;
        this.enableTTNetMonitor = z2;
        this.enableOkHttpMonitor = z3;
        this.enableUrlConnectionMonitor = z4;
        this.enableHttpClientMonitor = z5;
        this.enableWebMonitor = z6;
    }
}
