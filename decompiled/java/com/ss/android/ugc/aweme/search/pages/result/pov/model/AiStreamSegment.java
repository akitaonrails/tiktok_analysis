package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class AiStreamSegment implements Serializable {

    @C09CT("global_data")
    public final List<GlobalData> globalData;

    @C09CT("landing_page_content")
    public final List<AiContentInfo> landingPageContent;

    @C09CT("result_page_content")
    public final List<AiContentInfo> resultPageContent;

    public AiStreamSegment() {
        this(null, null, null);
    }

    public int hashCode() {
        List<AiContentInfo> list = this.resultPageContent;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AiContentInfo> list2 = this.landingPageContent;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GlobalData> list3 = this.globalData;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public AiStreamSegment(List<AiContentInfo> list, List<AiContentInfo> list2, List<GlobalData> list3) {
        this.resultPageContent = list;
        this.landingPageContent = list2;
        this.globalData = list3;
    }
}
