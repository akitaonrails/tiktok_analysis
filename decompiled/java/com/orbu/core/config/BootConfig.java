package com.orbu.core.config;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BootConfig {

    @C09CT("ag_config")
    public final AgConfig agConfig;

    @C09CT("compliance_prefix_list")
    public final List<String> compliancePrefixList;

    @C09CT("third_party_config")
    public final List<NetConfig> thirdPartyConfig;

    @C09CT("third_party_fallback_dfid")
    public final String thirdPartyFallbackDFID;

    public BootConfig() {
        this(new AgConfig(null, null, null, 7, null), BootConfigKt.getDefaultThirdPartyConfig(), "671089669", C1697810uHb.LJIIJJI("http://", "https://", "wss://", "tcp://", "udp://", "tls://", "quic://"));
    }

    public BootConfig(AgConfig agConfig, List<NetConfig> list, String str, List<String> list2) {
        this.agConfig = agConfig;
        this.thirdPartyConfig = list;
        this.thirdPartyFallbackDFID = str;
        this.compliancePrefixList = list2;
    }
}
