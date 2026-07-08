package com.orbu.core.config;

import X.C1697810uHb;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BootConfigKt {
    public static final List<NetConfig> getDefaultThirdPartyConfig() {
        return C1697810uHb.LJIIJJI(new NetConfig(Collections.singletonList("dns.google.com"), Collections.singletonList("/resolve"), "671088910"), new NetConfig(Collections.singletonList("34.102.215.99"), Collections.singletonList("/q"), "671088898"), new NetConfig(Collections.singletonList("35.213.190.132"), Collections.singletonList("/q"), "671088898"));
    }
}
