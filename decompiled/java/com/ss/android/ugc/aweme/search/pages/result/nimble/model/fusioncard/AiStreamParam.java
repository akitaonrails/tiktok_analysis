package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class AiStreamParam implements Serializable {

    @C09CT("doc_id")
    public final String docId;

    @C09CT("dynamic_param")
    public final String dynamicParam;

    @C09CT("next_key")
    public final String nextKey;

    @C09CT("stream_key")
    public final String streamKey;

    public AiStreamParam() {
        this(null, null, null, null);
    }

    public final AiStreamParam copy(String str, String str2, String str3, String str4) {
        return new AiStreamParam(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiStreamParam)) {
            return false;
        }
        AiStreamParam aiStreamParam = (AiStreamParam) obj;
        return Intrinsics.LJFF(this.docId, aiStreamParam.docId) && Intrinsics.LJFF(this.streamKey, aiStreamParam.streamKey) && Intrinsics.LJFF(this.nextKey, aiStreamParam.nextKey) && Intrinsics.LJFF(this.dynamicParam, aiStreamParam.dynamicParam);
    }

    public int hashCode() {
        String str = this.docId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streamKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dynamicParam;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiStreamParam(docId=");
        sbLIZ.append(this.docId);
        sbLIZ.append(", streamKey=");
        sbLIZ.append(this.streamKey);
        sbLIZ.append(", nextKey=");
        sbLIZ.append(this.nextKey);
        sbLIZ.append(", dynamicParam=");
        sbLIZ.append(this.dynamicParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDocId() {
        return this.docId;
    }

    public final String getDynamicParam() {
        return this.dynamicParam;
    }

    public final String getNextKey() {
        return this.nextKey;
    }

    public final String getStreamKey() {
        return this.streamKey;
    }

    public AiStreamParam(String str, String str2, String str3, String str4) {
        this.docId = str;
        this.streamKey = str2;
        this.nextKey = str3;
        this.dynamicParam = str4;
    }
}
