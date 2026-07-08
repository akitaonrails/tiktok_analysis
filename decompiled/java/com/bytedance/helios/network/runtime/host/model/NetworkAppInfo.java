package com.bytedance.helios.network.runtime.host.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkAppInfo {
    public final int appId;
    public final String appVersion;
    public final long appVersionCode;
    public final Application application;
    public final String channel;
    public final boolean isDebug;
    public final boolean isFirstLaunch;
    public final String networkEnv;
    public final String networkLane;
    public final String releaseBuild;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkAppInfo)) {
            return false;
        }
        NetworkAppInfo networkAppInfo = (NetworkAppInfo) obj;
        return Intrinsics.LJFF(this.application, networkAppInfo.application) && this.appId == networkAppInfo.appId && this.appVersionCode == networkAppInfo.appVersionCode && Intrinsics.LJFF(this.appVersion, networkAppInfo.appVersion) && Intrinsics.LJFF(this.channel, networkAppInfo.channel) && this.isDebug == networkAppInfo.isDebug && this.isFirstLaunch == networkAppInfo.isFirstLaunch && Intrinsics.LJFF(this.releaseBuild, networkAppInfo.releaseBuild) && Intrinsics.LJFF(this.networkEnv, networkAppInfo.networkEnv) && Intrinsics.LJFF(this.networkLane, networkAppInfo.networkLane);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public int hashCode() {
        int iHashCode = ((((((((this.application.hashCode() * 31) + this.appId) * 31) + C786410Ut5.Y2(this.appVersionCode)) * 31) + this.appVersion.hashCode()) * 31) + this.channel.hashCode()) * 31;
        boolean z = this.isDebug;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((((((((iHashCode + r0) * 31) + (this.isFirstLaunch ? 1 : 0)) * 31) + this.releaseBuild.hashCode()) * 31) + this.networkEnv.hashCode()) * 31) + this.networkLane.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkAppInfo(application=");
        sbLIZ.append(this.application);
        sbLIZ.append(", appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", appVersionCode=");
        sbLIZ.append(this.appVersionCode);
        sbLIZ.append(", appVersion=");
        sbLIZ.append(this.appVersion);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.channel);
        sbLIZ.append(", isDebug=");
        sbLIZ.append(this.isDebug);
        sbLIZ.append(", isFirstLaunch=");
        sbLIZ.append(this.isFirstLaunch);
        sbLIZ.append(", releaseBuild=");
        sbLIZ.append(this.releaseBuild);
        sbLIZ.append(", networkEnv=");
        sbLIZ.append(this.networkEnv);
        sbLIZ.append(", networkLane=");
        sbLIZ.append(this.networkLane);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final boolean isFirstLaunch() {
        return this.isFirstLaunch;
    }

    public NetworkAppInfo(Application application, int i, long j, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5) {
        this.application = application;
        this.appId = i;
        this.appVersionCode = j;
        this.appVersion = str;
        this.channel = str2;
        this.isDebug = z;
        this.isFirstLaunch = z2;
        this.releaseBuild = str3;
        this.networkEnv = str4;
        this.networkLane = str5;
    }
}
