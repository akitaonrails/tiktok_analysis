package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class InternalShareSortedListResponse extends BaseResponse {

    @C09CT("extra_info")
    public final Map<String, Object> extraInfo;

    @C09CT("item_list")
    public final List<SharePanelItemInfo> itemList;

    @C09CT("scene_item_list")
    public final List<SceneItemList> sceneListMap;

    @C09CT("stacked_item_list")
    public final List<SharePanelItemInfo> stackedItemList;

    public InternalShareSortedListResponse() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalShareSortedListResponse)) {
            return false;
        }
        InternalShareSortedListResponse internalShareSortedListResponse = (InternalShareSortedListResponse) obj;
        return Intrinsics.LJFF(this.itemList, internalShareSortedListResponse.itemList) && Intrinsics.LJFF(this.extraInfo, internalShareSortedListResponse.extraInfo) && Intrinsics.LJFF(this.stackedItemList, internalShareSortedListResponse.stackedItemList) && Intrinsics.LJFF(this.sceneListMap, internalShareSortedListResponse.sceneListMap);
    }

    public final int hashCode() {
        int iHashCode = this.itemList.hashCode() * 31;
        Map<String, Object> map = this.extraInfo;
        int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.stackedItemList.hashCode()) * 31;
        List<SceneItemList> list = this.sceneListMap;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalShareSortedListResponse(itemList=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(", stackedItemList=");
        sbLIZ.append(this.stackedItemList);
        sbLIZ.append(", sceneListMap=");
        sbLIZ.append(this.sceneListMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InternalShareSortedListResponse(List<SharePanelItemInfo> list, Map<String, ? extends Object> map, List<SharePanelItemInfo> list2, List<SceneItemList> list3) {
        this.itemList = list;
        this.extraInfo = map;
        this.stackedItemList = list2;
        this.sceneListMap = list3;
    }

    public InternalShareSortedListResponse(List list, Map map, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : map, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? null : list3);
    }
}
