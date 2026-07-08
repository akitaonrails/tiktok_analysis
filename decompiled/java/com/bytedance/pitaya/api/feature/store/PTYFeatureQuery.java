package com.bytedance.pitaya.api.feature.store;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PTYFeatureQuery implements ReflectionCall {
    public final String extParams;
    public final String featureName;
    public final int n;
    public final int queryType;
    public final String returnFeatureName;
    public final int returnType;
    public final String subFeatureName;

    public final PTYFeatureQuery copy(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        return new PTYFeatureQuery(str, str2, str3, i, i2, i3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYFeatureQuery)) {
            return false;
        }
        PTYFeatureQuery pTYFeatureQuery = (PTYFeatureQuery) obj;
        return Intrinsics.LJFF(this.returnFeatureName, pTYFeatureQuery.returnFeatureName) && Intrinsics.LJFF(this.featureName, pTYFeatureQuery.featureName) && Intrinsics.LJFF(this.subFeatureName, pTYFeatureQuery.subFeatureName) && this.n == pTYFeatureQuery.n && this.queryType == pTYFeatureQuery.queryType && this.returnType == pTYFeatureQuery.returnType && Intrinsics.LJFF(this.extParams, pTYFeatureQuery.extParams);
    }

    public int hashCode() {
        int iHashCode = ((this.returnFeatureName.hashCode() * 31) + this.featureName.hashCode()) * 31;
        String str = this.subFeatureName;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.n) * 31) + this.queryType) * 31) + this.returnType) * 31;
        String str2 = this.extParams;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYFeatureQuery(returnFeatureName=");
        sbLIZ.append(this.returnFeatureName);
        sbLIZ.append(", featureName=");
        sbLIZ.append(this.featureName);
        sbLIZ.append(", subFeatureName=");
        sbLIZ.append(this.subFeatureName);
        sbLIZ.append(", n=");
        sbLIZ.append(this.n);
        sbLIZ.append(", queryType=");
        sbLIZ.append(this.queryType);
        sbLIZ.append(", returnType=");
        sbLIZ.append(this.returnType);
        sbLIZ.append(", extParams=");
        sbLIZ.append(this.extParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getExtParams() {
        return this.extParams;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final int getN() {
        return this.n;
    }

    public final int getQueryType() {
        return this.queryType;
    }

    public final String getReturnFeatureName() {
        return this.returnFeatureName;
    }

    public final int getReturnType() {
        return this.returnType;
    }

    public final String getSubFeatureName() {
        return this.subFeatureName;
    }

    public PTYFeatureQuery(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        this.returnFeatureName = str;
        this.featureName = str2;
        this.subFeatureName = str3;
        this.n = i;
        this.queryType = i2;
        this.returnType = i3;
        this.extParams = str4;
    }
}
