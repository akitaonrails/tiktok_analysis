package com.ss.android.ugc.aweme.search.visualsearch.history.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VisualSearchHistoryExtraInfo implements Serializable {

    @C09CT("api_control_info")
    public final String apiControlInfo;

    @C09CT("disable_ecom_content_type")
    public final Integer disableEcomContentType;

    public VisualSearchHistoryExtraInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualSearchHistoryExtraInfo)) {
            return false;
        }
        VisualSearchHistoryExtraInfo visualSearchHistoryExtraInfo = (VisualSearchHistoryExtraInfo) obj;
        return Intrinsics.LJFF(this.disableEcomContentType, visualSearchHistoryExtraInfo.disableEcomContentType) && Intrinsics.LJFF(this.apiControlInfo, visualSearchHistoryExtraInfo.apiControlInfo);
    }

    public int hashCode() {
        Integer num = this.disableEcomContentType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.apiControlInfo;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public VisualSearchHistoryExtraInfo(Integer num, String str) {
        this.disableEcomContentType = num;
        this.apiControlInfo = str;
    }
}
