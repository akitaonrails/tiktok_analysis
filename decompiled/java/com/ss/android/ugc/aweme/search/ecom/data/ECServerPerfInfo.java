package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ECServerPerfInfo implements Serializable {

    @C09CT("detail_info")
    public final Map<String, Object> detailInfo;
    public String searchId;

    public ECServerPerfInfo() {
        this(null);
    }

    public ECServerPerfInfo(Map<String, Object> map) {
        this.detailInfo = map;
        this.searchId = "";
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }
}
