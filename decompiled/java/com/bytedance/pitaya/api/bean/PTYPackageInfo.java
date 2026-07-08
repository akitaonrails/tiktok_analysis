package com.bytedance.pitaya.api.bean;

import X.C01GW;
import X.C1514030pVB;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PTYPackageInfo implements ReflectionCall {
    public static final C1514030pVB Companion = new Object() { // from class: X.0pVB
    };
    public final String buildTime;
    public final String deployment;
    public final C01GW extra$delegate = C452501pT.LIZIZ(new AwS567S0100000_23(this, 71));
    public final String extraStr;
    public final int from;
    public final List<PTYModelInfo> models;
    public final String name;
    public final int taskType;
    public final String version;

    public final PTYPackageInfo copy(String str, String str2, String str3, int i, int i2, String str4, String str5, List<PTYModelInfo> list) {
        return new PTYPackageInfo(str, str2, str3, i, i2, str4, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYPackageInfo)) {
            return false;
        }
        PTYPackageInfo pTYPackageInfo = (PTYPackageInfo) obj;
        return Intrinsics.LJFF(this.name, pTYPackageInfo.name) && Intrinsics.LJFF(this.version, pTYPackageInfo.version) && Intrinsics.LJFF(this.deployment, pTYPackageInfo.deployment) && this.taskType == pTYPackageInfo.taskType && this.from == pTYPackageInfo.from && Intrinsics.LJFF(this.buildTime, pTYPackageInfo.buildTime) && Intrinsics.LJFF(this.extraStr, pTYPackageInfo.extraStr) && Intrinsics.LJFF(this.models, pTYPackageInfo.models);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.version.hashCode()) * 31) + this.deployment.hashCode()) * 31) + this.taskType) * 31) + this.from) * 31) + this.buildTime.hashCode()) * 31;
        String str = this.extraStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PTYModelInfo> list = this.models;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYPackageInfo(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", deployment=");
        sbLIZ.append(this.deployment);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", from=");
        sbLIZ.append(this.from);
        sbLIZ.append(", buildTime=");
        sbLIZ.append(this.buildTime);
        sbLIZ.append(", extraStr=");
        sbLIZ.append(this.extraStr);
        sbLIZ.append(", models=");
        sbLIZ.append(this.models);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final JSONObject getExtra() {
        return (JSONObject) this.extra$delegate.getValue();
    }

    public final String getBuildTime() {
        return this.buildTime;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final String getExtraStr() {
        return this.extraStr;
    }

    public final int getFrom() {
        return this.from;
    }

    public final List<PTYModelInfo> getModels() {
        return this.models;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public final String getVersion() {
        return this.version;
    }

    public PTYPackageInfo(String str, String str2, String str3, int i, int i2, String str4, String str5, List<PTYModelInfo> list) {
        this.name = str;
        this.version = str2;
        this.deployment = str3;
        this.taskType = i;
        this.from = i2;
        this.buildTime = str4;
        this.extraStr = str5;
        this.models = list;
    }
}
