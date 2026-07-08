package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class WordingOptions implements Serializable {

    @C09CT("top1Optimization_searchHighlights_facepile_label")
    public final String facepileLabel;

    @C09CT("top1Optimization_searchHighlights_v1_subheader1")
    public final String v1Subheader1;

    @C09CT("top1Optimization_searchHighlights_v3_subheader1")
    public final String v3Subheader1;

    public int hashCode() {
        String str = this.facepileLabel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.v1Subheader1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.v3Subheader1;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public WordingOptions(String str, String str2, String str3) {
        this.facepileLabel = str;
        this.v1Subheader1 = str2;
        this.v3Subheader1 = str3;
    }
}
