package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FcpSlotConfig implements Serializable {

    @C09CT("blacklist_component_keys")
    public List<String> blacklistComponentKeys;

    @C09CT("delay_ms")
    public Long delayMS;

    @C09CT("enable_one_way_lifecycle")
    public boolean enableOneWayLifecycle;

    @C09CT("container_key")
    public String slotId;

    @C09CT("timing_keys")
    public List<String> timingKeys;

    @C09CT("whitelist_component_keys")
    public List<String> whitelistComponentKeys;

    public FcpSlotConfig() {
        this(null, null, null, null, null, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FcpSlotConfig)) {
            return false;
        }
        FcpSlotConfig fcpSlotConfig = (FcpSlotConfig) obj;
        return Intrinsics.LJFF(this.slotId, fcpSlotConfig.slotId) && Intrinsics.LJFF(this.delayMS, fcpSlotConfig.delayMS) && Intrinsics.LJFF(this.timingKeys, fcpSlotConfig.timingKeys) && Intrinsics.LJFF(this.whitelistComponentKeys, fcpSlotConfig.whitelistComponentKeys) && Intrinsics.LJFF(this.blacklistComponentKeys, fcpSlotConfig.blacklistComponentKeys) && this.enableOneWayLifecycle == fcpSlotConfig.enableOneWayLifecycle;
    }

    public int hashCode() {
        String str = this.slotId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.delayMS;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.timingKeys;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.whitelistComponentKeys;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.blacklistComponentKeys;
        return ((iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.enableOneWayLifecycle);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpSlotConfig(slotId=");
        sbLIZ.append(this.slotId);
        sbLIZ.append(", delayMS=");
        sbLIZ.append(this.delayMS);
        sbLIZ.append(", timingKeys=");
        sbLIZ.append(this.timingKeys);
        sbLIZ.append(", whitelistComponentKeys=");
        sbLIZ.append(this.whitelistComponentKeys);
        sbLIZ.append(", blacklistComponentKeys=");
        sbLIZ.append(this.blacklistComponentKeys);
        sbLIZ.append(", enableOneWayLifecycle=");
        sbLIZ.append(this.enableOneWayLifecycle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FcpSlotConfig(String str, Long l, List<String> list, List<String> list2, List<String> list3, boolean z) {
        this.slotId = str;
        this.delayMS = l;
        this.timingKeys = list;
        this.whitelistComponentKeys = list2;
        this.blacklistComponentKeys = list3;
        this.enableOneWayLifecycle = z;
    }
}
