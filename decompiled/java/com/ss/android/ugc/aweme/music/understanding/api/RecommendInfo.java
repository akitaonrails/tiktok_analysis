package com.ss.android.ugc.aweme.music.understanding.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class RecommendInfo {

    @C09CT("models")
    public final String models;

    @C09CT("understanding_key")
    public final String understandingKey;

    @C09CT("understanding_type")
    public final String understandingType;

    public RecommendInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendInfo)) {
            return false;
        }
        RecommendInfo recommendInfo = (RecommendInfo) obj;
        return Intrinsics.LJFF(this.understandingKey, recommendInfo.understandingKey) && Intrinsics.LJFF(this.understandingType, recommendInfo.understandingType) && Intrinsics.LJFF(this.models, recommendInfo.models);
    }

    public int hashCode() {
        String str = this.understandingKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.understandingType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.models;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendInfo(understandingKey=");
        sbLIZ.append(this.understandingKey);
        sbLIZ.append(", understandingType=");
        sbLIZ.append(this.understandingType);
        sbLIZ.append(", models=");
        sbLIZ.append(this.models);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendInfo(String str, String str2, String str3) {
        this.understandingKey = str;
        this.understandingType = str2;
        this.models = str3;
    }
}
