package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.feed.model.IFcpNodeData;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ComponentContainerData implements Serializable, IFcpNodeData {

    @C09CT("child_components")
    public Map<String, List<String>> childComponentMap;

    @C09CT("container_key")
    public String containerKey;

    @C09CT("standardized_node")
    public boolean isStandardizedNode;

    @C09CT("keep_last_competition_res")
    public Boolean keepLastCompetitionRes;

    @C09CT("parent_key")
    public String matchedContainerKey;

    @C09CT("show_limit")
    public int showLimit;

    @C09CT("show_limit_strategy")
    public int showLimitStrategy;

    @C09CT("type")
    public String type;

    public ComponentContainerData() {
        this(null, 3, 0, null, "", "", false, Boolean.TRUE);
    }

    public final ComponentContainerData copy(String str, int i, int i2, Map<String, List<String>> map, String str2, String str3, boolean z, Boolean bool) {
        return new ComponentContainerData(str, i, i2, map, str2, str3, z, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentContainerData)) {
            return false;
        }
        ComponentContainerData componentContainerData = (ComponentContainerData) obj;
        return Intrinsics.LJFF(this.containerKey, componentContainerData.containerKey) && this.showLimit == componentContainerData.showLimit && this.showLimitStrategy == componentContainerData.showLimitStrategy && Intrinsics.LJFF(this.childComponentMap, componentContainerData.childComponentMap) && Intrinsics.LJFF(this.matchedContainerKey, componentContainerData.matchedContainerKey) && Intrinsics.LJFF(this.type, componentContainerData.type) && this.isStandardizedNode == componentContainerData.isStandardizedNode && Intrinsics.LJFF(this.keepLastCompetitionRes, componentContainerData.keepLastCompetitionRes);
    }

    public int hashCode() {
        String str = this.containerKey;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.showLimit) * 31) + this.showLimitStrategy) * 31;
        Map<String, List<String>> map = this.childComponentMap;
        int iHashCode2 = (((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.matchedContainerKey.hashCode()) * 31) + this.type.hashCode()) * 31) + C786410Ut5.Z2(this.isStandardizedNode)) * 31;
        Boolean bool = this.keepLastCompetitionRes;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentContainerData(containerKey=");
        sbLIZ.append(this.containerKey);
        sbLIZ.append(", showLimit=");
        sbLIZ.append(this.showLimit);
        sbLIZ.append(", showLimitStrategy=");
        sbLIZ.append(this.showLimitStrategy);
        sbLIZ.append(", childComponentMap=");
        sbLIZ.append(this.childComponentMap);
        sbLIZ.append(", matchedContainerKey=");
        sbLIZ.append(this.matchedContainerKey);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", isStandardizedNode=");
        sbLIZ.append(this.isStandardizedNode);
        sbLIZ.append(", keepLastCompetitionRes=");
        sbLIZ.append(this.keepLastCompetitionRes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, List<String>> getChildComponentMap() {
        return this.childComponentMap;
    }

    public final String getContainerKey() {
        return this.containerKey;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public String getCurrentKey() {
        return this.containerKey;
    }

    public final Boolean getKeepLastCompetitionRes() {
        return this.keepLastCompetitionRes;
    }

    public final String getMatchedContainerKey() {
        return this.matchedContainerKey;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public String getParentKey() {
        return this.matchedContainerKey;
    }

    public final int getShowLimit() {
        return this.showLimit;
    }

    public final int getShowLimitStrategy() {
        return this.showLimitStrategy;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isStandardizedNode() {
        return this.isStandardizedNode;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public List<String> getChildrenKey(String str) {
        if (str == null) {
            str = "total";
        }
        Map<String, List<String>> map = this.childComponentMap;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final void setChildComponentMap(Map<String, List<String>> map) {
        this.childComponentMap = map;
    }

    public final void setContainerKey(String str) {
        this.containerKey = str;
    }

    public final void setKeepLastCompetitionRes(Boolean bool) {
        this.keepLastCompetitionRes = bool;
    }

    public final void setMatchedContainerKey(String str) {
        this.matchedContainerKey = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public void setParentKey(String str) {
        if (str == null) {
            str = "";
        }
        this.matchedContainerKey = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public void setPolicyShowLimit(int i) {
        IFcpNodeData.DefaultImpls.setPolicyShowLimit(this, i);
    }

    public final void setShowLimit(int i) {
        this.showLimit = i;
    }

    public final void setShowLimitStrategy(int i) {
        this.showLimitStrategy = i;
    }

    public final void setStandardizedNode(boolean z) {
        this.isStandardizedNode = z;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void adoptChild(IFcpNodeData iFcpNodeData, String str) {
        iFcpNodeData.setParentKey(this.containerKey);
        if (str == null) {
            str = "total";
        }
        if (this.childComponentMap == null) {
            this.childComponentMap = new ConcurrentHashMap();
        }
        Map<String, List<String>> map = this.childComponentMap;
        if (map != null) {
            List<String> copyOnWriteArrayList = map.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                map.put(str, copyOnWriteArrayList);
            }
            List<String> list = copyOnWriteArrayList;
            if (list.contains(iFcpNodeData.getCurrentKey())) {
                return;
            }
            list.add(iFcpNodeData.getCurrentKey());
        }
    }

    public final void dropChild(IFcpNodeData iFcpNodeData, String str) {
        List<String> list;
        String currentKey = iFcpNodeData.getCurrentKey();
        if (currentKey == null) {
            return;
        }
        if (str == null) {
            str = "total";
        }
        Map<String, List<String>> map = this.childComponentMap;
        if (map != null && (list = map.get(str)) != null) {
            list.remove(currentKey);
        }
    }

    public ComponentContainerData(String str, int i, int i2, Map<String, List<String>> map, String str2, String str3, boolean z, Boolean bool) {
        this.containerKey = str;
        this.showLimit = i;
        this.showLimitStrategy = i2;
        this.childComponentMap = map;
        this.matchedContainerKey = str2;
        this.type = str3;
        this.isStandardizedNode = z;
        this.keepLastCompetitionRes = bool;
    }
}
