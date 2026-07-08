package com.bytedance.touchpoint.data.experiment;

import X.C09CT;
import X.C1697810uHb;
import X.C2097908Jt;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IncentiveDiversionAppInfo {

    @C09CT("android_app_installed_config")
    public final Map<String, String> config;

    @C09CT("app_installed_url_path_list")
    public final List<String> pathList;

    public IncentiveDiversionAppInfo() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveDiversionAppInfo)) {
            return false;
        }
        IncentiveDiversionAppInfo incentiveDiversionAppInfo = (IncentiveDiversionAppInfo) obj;
        return Intrinsics.LJFF(this.config, incentiveDiversionAppInfo.config) && Intrinsics.LJFF(this.pathList, incentiveDiversionAppInfo.pathList);
    }

    public final int hashCode() {
        Map<String, String> map = this.config;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<String> list = this.pathList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveDiversionAppInfo(config=");
        sbLIZ.append(this.config);
        sbLIZ.append(", pathList=");
        sbLIZ.append(this.pathList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveDiversionAppInfo(Map<String, String> map, List<String> list) {
        this.config = map;
        this.pathList = list;
    }

    public IncentiveDiversionAppInfo(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2097908Jt.LIZJ(new Pair("pine_drama", "com.ss.android.ttmd.video")) : map, (i & 2) != 0 ? C1697810uHb.LJIIJJI("incentive", "touchpoint") : list);
    }
}
