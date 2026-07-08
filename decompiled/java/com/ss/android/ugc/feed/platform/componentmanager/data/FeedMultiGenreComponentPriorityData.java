package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.AbstractC700660Re4;
import X.C09CT;
import X.C2188811AlT;
import X.C700080Rd8;
import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedMultiGenreComponentPriorityData extends AbstractC700660Re4 {
    public Map<String, GlobalComponentData> componentMap;
    public Map<String, ComponentContainerData> containerMap;

    @C09CT("component_list")
    public List<String> globalComponentList;

    @C09CT("scene_show_limit")
    public int globalShowLimit;

    @C09CT("tree_structure")
    public FcpTreeData treeStructure;

    @C09CT("component_update")
    public Map<String, GlobalComponentData> updateComponentMap;

    @C09CT("container_update")
    public Map<String, ComponentContainerData> updateContainerMap;

    public FeedMultiGenreComponentPriorityData() {
        this(null, null, 0, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedMultiGenreComponentPriorityData)) {
            return false;
        }
        FeedMultiGenreComponentPriorityData feedMultiGenreComponentPriorityData = (FeedMultiGenreComponentPriorityData) obj;
        return Intrinsics.LJFF(this.treeStructure, feedMultiGenreComponentPriorityData.treeStructure) && Intrinsics.LJFF(this.globalComponentList, feedMultiGenreComponentPriorityData.globalComponentList) && this.globalShowLimit == feedMultiGenreComponentPriorityData.globalShowLimit && Intrinsics.LJFF(this.updateComponentMap, feedMultiGenreComponentPriorityData.updateComponentMap) && Intrinsics.LJFF(this.updateContainerMap, feedMultiGenreComponentPriorityData.updateContainerMap) && Intrinsics.LJFF(this.containerMap, feedMultiGenreComponentPriorityData.containerMap) && Intrinsics.LJFF(this.componentMap, feedMultiGenreComponentPriorityData.componentMap);
    }

    public final int hashCode() {
        FcpTreeData fcpTreeData = this.treeStructure;
        int iHashCode = (fcpTreeData == null ? 0 : fcpTreeData.hashCode()) * 31;
        List<String> list = this.globalComponentList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.globalShowLimit) * 31;
        Map<String, GlobalComponentData> map = this.updateComponentMap;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, ComponentContainerData> map2 = this.updateContainerMap;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, ComponentContainerData> map3 = this.containerMap;
        int iHashCode5 = (iHashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, GlobalComponentData> map4 = this.componentMap;
        return iHashCode5 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedMultiGenreComponentPriorityData(treeStructure=");
        sbLIZ.append(this.treeStructure);
        sbLIZ.append(", globalComponentList=");
        sbLIZ.append(this.globalComponentList);
        sbLIZ.append(", globalShowLimit=");
        sbLIZ.append(this.globalShowLimit);
        sbLIZ.append(", updateComponentMap=");
        sbLIZ.append(this.updateComponentMap);
        sbLIZ.append(", updateContainerMap=");
        sbLIZ.append(this.updateContainerMap);
        sbLIZ.append(", containerMap=");
        sbLIZ.append(this.containerMap);
        sbLIZ.append(", componentMap=");
        sbLIZ.append(this.componentMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC700660Re4
    public final Map<String, GlobalComponentData> LIZ() {
        return this.componentMap;
    }

    @Override // X.AbstractC700660Re4
    public final Map<String, ComponentContainerData> LIZIZ() {
        return this.containerMap;
    }

    @Override // X.AbstractC700660Re4
    public final List<String> LIZJ() {
        return this.globalComponentList;
    }

    @Override // X.AbstractC700660Re4
    public final int LIZLLL() {
        return this.globalShowLimit;
    }

    @Override // X.AbstractC700660Re4
    public final FcpTreeData LJ() {
        return this.treeStructure;
    }

    @Override // X.AbstractC700660Re4
    public final Map<String, GlobalComponentData> LJFF() {
        return this.updateComponentMap;
    }

    @Override // X.AbstractC700660Re4
    public final Map<String, ComponentContainerData> LJI() {
        return this.updateContainerMap;
    }

    public FeedMultiGenreComponentPriorityData(FcpTreeData fcpTreeData, List<String> list, int i, Map<String, GlobalComponentData> map, Map<String, ComponentContainerData> map2, Map<String, ComponentContainerData> map3, Map<String, GlobalComponentData> map4) {
        this.treeStructure = fcpTreeData;
        this.globalComponentList = list;
        this.globalShowLimit = i;
        this.updateComponentMap = map;
        this.updateContainerMap = map2;
        this.containerMap = map3;
        this.componentMap = map4;
    }

    public FeedMultiGenreComponentPriorityData(FcpTreeData fcpTreeData, List list, int i, Map map, Map map2, Map map3, Map map4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C700080Rd8.LJIIIIZZ : fcpTreeData, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? null : map2, (i2 & 32) != 0 ? null : map3, (i2 & 64) == 0 ? map4 : null);
    }
}
