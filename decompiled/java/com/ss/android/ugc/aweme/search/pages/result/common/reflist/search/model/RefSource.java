package com.ss.android.ugc.aweme.search.pages.result.common.reflist.search.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class RefSource implements Serializable {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("key")
    public final String key;

    @C09CT("type")
    public final Integer type;

    @C09CT("web_doc")
    public final RefWebDoc webDoc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefSource)) {
            return false;
        }
        RefSource refSource = (RefSource) obj;
        return Intrinsics.LJFF(this.type, refSource.type) && Intrinsics.LJFF(this.awemeId, refSource.awemeId) && Intrinsics.LJFF(this.webDoc, refSource.webDoc) && Intrinsics.LJFF(this.key, refSource.key);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.awemeId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RefWebDoc refWebDoc = this.webDoc;
        int iHashCode3 = (iHashCode2 + (refWebDoc == null ? 0 : refWebDoc.hashCode())) * 31;
        String str2 = this.key;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefSource(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", webDoc=");
        sbLIZ.append(this.webDoc);
        sbLIZ.append(", key=");
        sbLIZ.append(this.key);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RefSource(Integer num, String str, RefWebDoc refWebDoc, String str2) {
        this.type = num;
        this.awemeId = str;
        this.webDoc = refWebDoc;
        this.key = str2;
    }
}
