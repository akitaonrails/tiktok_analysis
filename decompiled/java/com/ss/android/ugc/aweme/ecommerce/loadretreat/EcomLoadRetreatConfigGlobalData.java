package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLoadRetreatConfigGlobalData {

    @C09CT("debug")
    public final boolean debug;

    @C09CT("debug_page_name")
    public final List<String> debugPageName;

    @C09CT("enable")
    public final boolean enable;

    public EcomLoadRetreatConfigGlobalData() {
        this(false, null, false);
    }

    public EcomLoadRetreatConfigGlobalData(boolean z, List<String> list, boolean z2) {
        this.debug = z;
        this.debugPageName = list;
        this.enable = z2;
    }
}
