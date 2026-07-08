package com.bytedance.pumbaa.hybrid.governance.csp;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class CspHeaderConfig {
    public final Map<String, AccessKeyConfig> accessKey;
    public final String csp;
    public final String cspro;
    public final String reportUri;

    public CspHeaderConfig(String str, String str2, String str3, Map<String, AccessKeyConfig> map) {
        this.reportUri = str;
        this.cspro = str2;
        this.csp = str3;
        this.accessKey = map;
    }
}
