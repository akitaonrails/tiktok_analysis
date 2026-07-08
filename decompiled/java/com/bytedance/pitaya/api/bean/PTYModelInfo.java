package com.bytedance.pitaya.api.bean;

import X.C1514020pVA;
import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class PTYModelInfo implements ReflectionCall {
    public static final C1514020pVA Companion = new Object() { // from class: X.0pVA
    };
    public final int engineType;
    public final String extraParams;
    public final String modelGroup;
    public final String name;
    public final String originModelPath;
    public final String version;

    public final PTYModelInfo copy(String str, String str2, int i, String str3, String str4, String str5) {
        return new PTYModelInfo(str, str2, i, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYModelInfo)) {
            return false;
        }
        PTYModelInfo pTYModelInfo = (PTYModelInfo) obj;
        return Intrinsics.LJFF(this.name, pTYModelInfo.name) && Intrinsics.LJFF(this.version, pTYModelInfo.version) && this.engineType == pTYModelInfo.engineType && Intrinsics.LJFF(this.modelGroup, pTYModelInfo.modelGroup) && Intrinsics.LJFF(this.originModelPath, pTYModelInfo.originModelPath) && Intrinsics.LJFF(this.extraParams, pTYModelInfo.extraParams);
    }

    public int hashCode() {
        int iHashCode = ((((this.name.hashCode() * 31) + this.version.hashCode()) * 31) + this.engineType) * 31;
        String str = this.modelGroup;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originModelPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extraParams;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYModelInfo(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", engineType=");
        sbLIZ.append(this.engineType);
        sbLIZ.append(", modelGroup=");
        sbLIZ.append(this.modelGroup);
        sbLIZ.append(", originModelPath=");
        sbLIZ.append(this.originModelPath);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getEngineType() {
        return this.engineType;
    }

    public final String getExtraParams() {
        return this.extraParams;
    }

    public final String getModelGroup() {
        return this.modelGroup;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginModelPath() {
        return this.originModelPath;
    }

    public final String getVersion() {
        return this.version;
    }

    public PTYModelInfo(String str, String str2, int i, String str3, String str4, String str5) {
        this.name = str;
        this.version = str2;
        this.engineType = i;
        this.modelGroup = str3;
        this.originModelPath = str4;
        this.extraParams = str5;
    }
}
