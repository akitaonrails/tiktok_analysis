package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialResourceBaseInfo {

    @C09CT("ac")
    public final String ac;

    @C09CT("aid")
    public final String aid;

    @C09CT("app_version")
    public final String appVersion;

    @C09CT("device_id")
    public final String deviceId;

    @C09CT("device_platform")
    public final String devicePlatform;

    @C09CT("device_type")
    public final String deviceType;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("uid")
    public final String uid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialResourceBaseInfo)) {
            return false;
        }
        MaterialResourceBaseInfo materialResourceBaseInfo = (MaterialResourceBaseInfo) obj;
        return Intrinsics.LJFF(this.ac, materialResourceBaseInfo.ac) && Intrinsics.LJFF(this.aid, materialResourceBaseInfo.aid) && Intrinsics.LJFF(this.appVersion, materialResourceBaseInfo.appVersion) && Intrinsics.LJFF(this.deviceId, materialResourceBaseInfo.deviceId) && Intrinsics.LJFF(this.devicePlatform, materialResourceBaseInfo.devicePlatform) && Intrinsics.LJFF(this.deviceType, materialResourceBaseInfo.deviceType) && this.status == materialResourceBaseInfo.status && Intrinsics.LJFF(this.uid, materialResourceBaseInfo.uid);
    }

    public int hashCode() {
        return (((((((((((((this.ac.hashCode() * 31) + this.aid.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.devicePlatform.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.status) * 31) + this.uid.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialResourceBaseInfo(ac=");
        sbLIZ.append(this.ac);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.aid);
        sbLIZ.append(", appVersion=");
        sbLIZ.append(this.appVersion);
        sbLIZ.append(", deviceId=");
        sbLIZ.append(this.deviceId);
        sbLIZ.append(", devicePlatform=");
        sbLIZ.append(this.devicePlatform);
        sbLIZ.append(", deviceType=");
        sbLIZ.append(this.deviceType);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaterialResourceBaseInfo() {
        this("", "", "", "", "", "", -1, "");
    }

    public MaterialResourceBaseInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.ac = str;
        this.aid = str2;
        this.appVersion = str3;
        this.deviceId = str4;
        this.devicePlatform = str5;
        this.deviceType = str6;
        this.status = i;
        this.uid = str7;
    }
}
