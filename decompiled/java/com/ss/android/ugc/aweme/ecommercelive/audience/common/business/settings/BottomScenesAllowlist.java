package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomScenesAllowlist {

    @C09CT("allowlist")
    public final List<String> allowlist;

    @C09CT("enable")
    public final boolean enable;

    public BottomScenesAllowlist() {
        this(false, C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow"));
    }

    public BottomScenesAllowlist(boolean z, List<String> list) {
        this.enable = z;
        this.allowlist = list;
    }
}
