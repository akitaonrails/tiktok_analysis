package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SpecMentionData {

    @C09CT("mapping_by_cameo_id_data")
    public final Map<String, NetworkMentionDataItem> mappingByCameoId;

    @C09CT("mapping_by_uid_data")
    public final Map<String, NetworkMentionDataItem> mappingByUidData;

    @C09CT("my_cameo_mention_info")
    public final NetworkMentionDataItem myCameoMentionInfo;

    public SpecMentionData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecMentionData)) {
            return false;
        }
        SpecMentionData specMentionData = (SpecMentionData) obj;
        return Intrinsics.LJFF(this.mappingByCameoId, specMentionData.mappingByCameoId) && Intrinsics.LJFF(this.mappingByUidData, specMentionData.mappingByUidData) && Intrinsics.LJFF(this.myCameoMentionInfo, specMentionData.myCameoMentionInfo);
    }

    public final int hashCode() {
        Map<String, NetworkMentionDataItem> map = this.mappingByCameoId;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, NetworkMentionDataItem> map2 = this.mappingByUidData;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        NetworkMentionDataItem networkMentionDataItem = this.myCameoMentionInfo;
        return iHashCode2 + (networkMentionDataItem != null ? networkMentionDataItem.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpecMentionData(mappingByCameoId=");
        sbLIZ.append(this.mappingByCameoId);
        sbLIZ.append(", mappingByUidData=");
        sbLIZ.append(this.mappingByUidData);
        sbLIZ.append(", myCameoMentionInfo=");
        sbLIZ.append(this.myCameoMentionInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpecMentionData(Map<String, NetworkMentionDataItem> map, Map<String, NetworkMentionDataItem> map2, NetworkMentionDataItem networkMentionDataItem) {
        this.mappingByCameoId = map;
        this.mappingByUidData = map2;
        this.myCameoMentionInfo = networkMentionDataItem;
    }
}
