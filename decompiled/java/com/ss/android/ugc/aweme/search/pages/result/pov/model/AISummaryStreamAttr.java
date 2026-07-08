package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class AISummaryStreamAttr implements Serializable {

    @C09CT("doc_id")
    public final String docId;

    @C09CT("doc_type")
    public final String docType;

    @C09CT("search_id")
    public final String searchId;

    public AISummaryStreamAttr() {
        this(null, null, null);
    }

    public int hashCode() {
        String str = this.docType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.docId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public AISummaryStreamAttr(String str, String str2, String str3) {
        this.docType = str;
        this.docId = str2;
        this.searchId = str3;
    }
}
