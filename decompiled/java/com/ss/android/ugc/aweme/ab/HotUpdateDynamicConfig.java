package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HotUpdateDynamicConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("ext_room_status")
    public final List<Integer> extraRoomStatusList;

    public HotUpdateDynamicConfig() {
        this(false, C1697810uHb.LJIIJJI(100201, 100202, 100203));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotUpdateDynamicConfig)) {
            return false;
        }
        HotUpdateDynamicConfig hotUpdateDynamicConfig = (HotUpdateDynamicConfig) obj;
        return this.enable == hotUpdateDynamicConfig.enable && Intrinsics.LJFF(this.extraRoomStatusList, hotUpdateDynamicConfig.extraRoomStatusList);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.extraRoomStatusList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HotUpdateDynamicConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", extraRoomStatusList=");
        sbLIZ.append(this.extraRoomStatusList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HotUpdateDynamicConfig(boolean z, List<Integer> list) {
        this.enable = z;
        this.extraRoomStatusList = list;
    }
}
