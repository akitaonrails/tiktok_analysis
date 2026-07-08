package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BottomQuoteSources implements Serializable {

    @C09CT("bottom_source_view_all_text")
    public final String bottomSourceViewAllText;

    @C09CT("ref_source_key_list")
    public final List<String> refSourceKeyList;

    @C09CT("sources_text")
    public final String sourcesText;

    public BottomQuoteSources() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomQuoteSources)) {
            return false;
        }
        BottomQuoteSources bottomQuoteSources = (BottomQuoteSources) obj;
        return Intrinsics.LJFF(this.refSourceKeyList, bottomQuoteSources.refSourceKeyList) && Intrinsics.LJFF(this.bottomSourceViewAllText, bottomQuoteSources.bottomSourceViewAllText) && Intrinsics.LJFF(this.sourcesText, bottomQuoteSources.sourcesText);
    }

    public int hashCode() {
        List<String> list = this.refSourceKeyList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.bottomSourceViewAllText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourcesText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomQuoteSources(refSourceKeyList=");
        sbLIZ.append(this.refSourceKeyList);
        sbLIZ.append(", bottomSourceViewAllText=");
        sbLIZ.append(this.bottomSourceViewAllText);
        sbLIZ.append(", sourcesText=");
        sbLIZ.append(this.sourcesText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BottomQuoteSources(List<String> list, String str, String str2) {
        this.refSourceKeyList = list;
        this.bottomSourceViewAllText = str;
        this.sourcesText = str2;
    }
}
