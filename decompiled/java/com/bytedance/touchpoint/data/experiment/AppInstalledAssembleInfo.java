package com.bytedance.touchpoint.data.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AppInstalledAssembleInfo {

    @C09CT("app_name")
    public final String appName;

    @C09CT("installed")
    public final int installed;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInstalledAssembleInfo)) {
            return false;
        }
        AppInstalledAssembleInfo appInstalledAssembleInfo = (AppInstalledAssembleInfo) obj;
        return Intrinsics.LJFF(this.appName, appInstalledAssembleInfo.appName) && this.installed == appInstalledAssembleInfo.installed;
    }

    public final int hashCode() {
        String str = this.appName;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.installed;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppInstalledAssembleInfo(appName=");
        sbLIZ.append(this.appName);
        sbLIZ.append(", installed=");
        sbLIZ.append(this.installed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AppInstalledAssembleInfo() {
        this("", 0);
    }

    public AppInstalledAssembleInfo(String str, int i) {
        this.appName = str;
        this.installed = i;
    }
}
