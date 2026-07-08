package com.bytedance.android.livesdk.signaling.model.uplink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.signaling.model.BaseUplinkData;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class UplinkAnchorIdSubscribeData extends BaseUplinkData {

    @C09CT("register_anchor_id_list")
    public Set<String> registerAnchorIdList;

    public UplinkAnchorIdSubscribeData() {
        this(null);
    }

    public final UplinkAnchorIdSubscribeData copy(Set<String> set) {
        return new UplinkAnchorIdSubscribeData(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UplinkAnchorIdSubscribeData) && Intrinsics.LJFF(this.registerAnchorIdList, ((UplinkAnchorIdSubscribeData) obj).registerAnchorIdList);
    }

    public int hashCode() {
        Set<String> set = this.registerAnchorIdList;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UplinkAnchorIdSubscribeData(registerAnchorIdList=");
        sbLIZ.append(this.registerAnchorIdList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Set<String> getRegisterAnchorIdList() {
        return this.registerAnchorIdList;
    }

    public UplinkAnchorIdSubscribeData(Set<String> set) {
        this.registerAnchorIdList = set;
    }

    public final void setRegisterAnchorIdList(Set<String> set) {
        this.registerAnchorIdList = set;
    }
}
