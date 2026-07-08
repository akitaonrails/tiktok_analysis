package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class PipoGeckoConfigModel {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("prefix_list")
    public final List<String> prefixList;

    @C09CT("use_gecko_whitelist_url")
    public final List<String> useGeckoWhitelistUrl;

    public PipoGeckoConfigModel() {
        this(null, null, null);
    }

    public PipoGeckoConfigModel(Boolean bool, List<String> list, List<String> list2) {
        this.enable = bool;
        this.prefixList = list;
        this.useGeckoWhitelistUrl = list2;
    }
}
