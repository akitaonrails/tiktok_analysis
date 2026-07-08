package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SceneItemList {

    @C09CT("item_list")
    public final List<SharePanelItemInfo> itemList;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("stacked_item_list")
    public final List<SharePanelItemInfo> stackedItemList;

    public SceneItemList() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneItemList)) {
            return false;
        }
        SceneItemList sceneItemList = (SceneItemList) obj;
        return Intrinsics.LJFF(this.scene, sceneItemList.scene) && Intrinsics.LJFF(this.itemList, sceneItemList.itemList) && Intrinsics.LJFF(this.stackedItemList, sceneItemList.stackedItemList);
    }

    public final int hashCode() {
        String str = this.scene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SharePanelItemInfo> list = this.itemList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SharePanelItemInfo> list2 = this.stackedItemList;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneItemList(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", itemList=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(", stackedItemList=");
        sbLIZ.append(this.stackedItemList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SceneItemList(String str, List<SharePanelItemInfo> list, List<SharePanelItemInfo> list2) {
        this.scene = str;
        this.itemList = list;
        this.stackedItemList = list2;
    }

    public SceneItemList(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
