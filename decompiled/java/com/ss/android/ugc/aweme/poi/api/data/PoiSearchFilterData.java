package com.ss.android.ugc.aweme.poi.api.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchFilterData implements Serializable {

    @C09CT("filter_id")
    public final String filterId;

    @C09CT("need_cache_state")
    public final boolean needCacheState;

    @C09CT("text")
    public final String text;

    public PoiSearchFilterData() {
        this(null, null, false);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchFilterData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", filterId=");
        sbLIZ.append(this.filterId);
        sbLIZ.append(", needCacheState=");
        sbLIZ.append(this.needCacheState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiSearchFilterData(String str, String str2, boolean z) {
        this.text = str;
        this.filterId = str2;
        this.needCacheState = z;
    }
}
