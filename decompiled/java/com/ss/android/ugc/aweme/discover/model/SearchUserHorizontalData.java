package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUserHorizontalData implements Serializable {

    @C09CT("backtrace")
    public String backtrace;

    @C09CT("common_data")
    public SearchHorCommonData commonData;

    public final String getBacktrace() {
        return this.backtrace;
    }

    public final SearchHorCommonData getCommonData() {
        return this.commonData;
    }

    public final void setBacktrace(String str) {
        this.backtrace = str;
    }

    public final void setCommonData(SearchHorCommonData searchHorCommonData) {
        this.commonData = searchHorCommonData;
    }
}
