package com.ss.android.ugc.aweme.ecommercebase.pagesource;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PageSource {

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("page_name")
    public final String pageName;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageSource(pageName=");
        sbLIZ.append(this.pageName);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PageSource(String str, Map<String, String> map) {
        this.pageName = str;
        this.extra = map;
    }
}
