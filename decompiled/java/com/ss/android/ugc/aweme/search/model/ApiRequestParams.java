package com.ss.android.ugc.aweme.search.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ApiRequestParams implements Serializable {
    public final String apiControlInfo;
    public final Integer disableEcomContentType;
    public final boolean enableFirstCardSplit;
    public final boolean enableFrameReplace;
    public final String enterFromSecond;
    public String prefetchId;
    public String prefetchType;
    public final String searchSource;
    public final String visionSearchAction;

    public ApiRequestParams() {
        this("", "", null, false, null, null, null, null, false);
    }

    public final ApiRequestParams copy(String str, String str2, String str3, boolean z, String str4, String str5, Integer num, String str6, boolean z2) {
        return new ApiRequestParams(str, str2, str3, z, str4, str5, num, str6, z2);
    }

    public final void setPrefetchId(String str) {
        this.prefetchId = str;
    }

    public final void setPrefetchType(String str) {
        this.prefetchType = str;
    }

    public ApiRequestParams(String str, String str2, String str3, boolean z, String str4, String str5, Integer num, String str6, boolean z2) {
        this.searchSource = str;
        this.enterFromSecond = str2;
        this.visionSearchAction = str3;
        this.enableFrameReplace = z;
        this.prefetchId = str4;
        this.prefetchType = str5;
        this.disableEcomContentType = num;
        this.apiControlInfo = str6;
        this.enableFirstCardSplit = z2;
    }
}
