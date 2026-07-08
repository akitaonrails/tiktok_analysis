package com.bytedance.pitaya.api.bean;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PTYNativeTaskConfig implements ReflectionCall {
    public final String aid;
    public final String appVersion;
    public final String pluginVersion;
    public final PTYNativeService service;

    public final PTYNativeTaskConfig copy(PTYNativeService pTYNativeService, String str, String str2, String str3) {
        return new PTYNativeTaskConfig(pTYNativeService, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYNativeTaskConfig)) {
            return false;
        }
        PTYNativeTaskConfig pTYNativeTaskConfig = (PTYNativeTaskConfig) obj;
        return this.service == pTYNativeTaskConfig.service && Intrinsics.LJFF(this.aid, pTYNativeTaskConfig.aid) && Intrinsics.LJFF(this.appVersion, pTYNativeTaskConfig.appVersion) && Intrinsics.LJFF(this.pluginVersion, pTYNativeTaskConfig.pluginVersion);
    }

    public int hashCode() {
        int iHashCode = ((this.service.hashCode() * 31) + this.aid.hashCode()) * 31;
        String str = this.appVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pluginVersion;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYNativeTaskConfig(service=");
        sbLIZ.append(this.service);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", appVersion=");
        sbLIZ.append(this.appVersion);
        sbLIZ.append(", pluginVersion=");
        sbLIZ.append(this.pluginVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    public final PTYNativeService getService() {
        return this.service;
    }

    public PTYNativeTaskConfig(PTYNativeService pTYNativeService, String str, String str2, String str3) {
        this.service = pTYNativeService;
        this.aid = str;
        this.appVersion = str2;
        this.pluginVersion = str3;
    }
}
