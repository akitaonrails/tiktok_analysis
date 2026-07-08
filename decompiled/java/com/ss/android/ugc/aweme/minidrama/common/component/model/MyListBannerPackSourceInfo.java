package com.ss.android.ugc.aweme.minidrama.common.component.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MyListBannerPackSourceInfo implements Serializable {

    @C09CT("biz_pack_source")
    public final String bizPackSource;

    @C09CT("pack_scene")
    public final String packScene;

    @C09CT("tenant")
    public final String tenant;

    public MyListBannerPackSourceInfo() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListBannerPackSourceInfo)) {
            return false;
        }
        MyListBannerPackSourceInfo myListBannerPackSourceInfo = (MyListBannerPackSourceInfo) obj;
        return Intrinsics.LJFF(this.tenant, myListBannerPackSourceInfo.tenant) && Intrinsics.LJFF(this.packScene, myListBannerPackSourceInfo.packScene) && Intrinsics.LJFF(this.bizPackSource, myListBannerPackSourceInfo.bizPackSource);
    }

    public int hashCode() {
        String str = this.tenant;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packScene;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizPackSource;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MyListBannerPackSourceInfo(tenant=");
        sbLIZ.append(this.tenant);
        sbLIZ.append(", packScene=");
        sbLIZ.append(this.packScene);
        sbLIZ.append(", bizPackSource=");
        sbLIZ.append(this.bizPackSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MyListBannerPackSourceInfo(String str, String str2, String str3) {
        this.tenant = str;
        this.packScene = str2;
        this.bizPackSource = str3;
    }
}
