package com.bytedance.android.livesdk.signaling.model.uplink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.signaling.model.BaseUplinkData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UplinkLiveStatusData extends BaseUplinkData {

    @C09CT("register_anchor_id_list")
    public Set<String> registerAnchorIdList;

    @C09CT("unregister_anchor_id_list")
    public Set<String> unRegisterAnchorIdList;

    public UplinkLiveStatusData() {
        this(null, null);
    }

    public final UplinkLiveStatusData copy(Set<String> set, Set<String> set2) {
        return new UplinkLiveStatusData(set, set2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UplinkLiveStatusData)) {
            return false;
        }
        UplinkLiveStatusData uplinkLiveStatusData = (UplinkLiveStatusData) obj;
        return Intrinsics.LJFF(this.registerAnchorIdList, uplinkLiveStatusData.registerAnchorIdList) && Intrinsics.LJFF(this.unRegisterAnchorIdList, uplinkLiveStatusData.unRegisterAnchorIdList);
    }

    public int hashCode() {
        Set<String> set = this.registerAnchorIdList;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<String> set2 = this.unRegisterAnchorIdList;
        return iHashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UplinkLiveStatusData(registerAnchorIdList=");
        sbLIZ.append(this.registerAnchorIdList);
        sbLIZ.append(", unRegisterAnchorIdList=");
        sbLIZ.append(this.unRegisterAnchorIdList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Set<String> getRegisterAnchorIdList() {
        return this.registerAnchorIdList;
    }

    public final Set<String> getUnRegisterAnchorIdList() {
        return this.unRegisterAnchorIdList;
    }

    public final void setRegisterAnchorIdList(Set<String> set) {
        this.registerAnchorIdList = set;
    }

    public final void setUnRegisterAnchorIdList(Set<String> set) {
        this.unRegisterAnchorIdList = set;
    }

    public UplinkLiveStatusData(Set<String> set, Set<String> set2) {
        this.registerAnchorIdList = set;
        this.unRegisterAnchorIdList = set2;
    }
}
