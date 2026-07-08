package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchTabLynxEventConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("lynx_event_name")
    public final String lynxEventName;

    public SearchTabLynxEventConfig() {
        this(null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTabLynxEventConfig(lynxEventName=");
        sbLIZ.append(this.lynxEventName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchTabLynxEventConfig(String str) {
        this.lynxEventName = str;
    }
}
