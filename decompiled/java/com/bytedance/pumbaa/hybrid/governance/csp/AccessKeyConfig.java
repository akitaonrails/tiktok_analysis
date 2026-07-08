package com.bytedance.pumbaa.hybrid.governance.csp;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class AccessKeyConfig {
    public final Map<String, ChannelConfig> channels;
    public final String csp;
    public final String cspro;
    public final String reversion;

    public AccessKeyConfig(String str, String str2, String str3, Map<String, ChannelConfig> map) {
        this.csp = str;
        this.cspro = str2;
        this.reversion = str3;
        this.channels = map;
    }
}
