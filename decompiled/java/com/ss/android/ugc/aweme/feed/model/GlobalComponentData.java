package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.IFcpNodeData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class GlobalComponentData implements Serializable, IFcpNodeData {

    @C09CT("component_key")
    public String componentKey;
    public int customShowLimit;

    @C09CT("parent_key")
    public String matchedContainerKey;
    public String parentContainerKey;

    @C09CT("priority_index")
    public Integer priorityIndex;

    @C09CT("show_strategy")
    public int showStrategy;

    public GlobalComponentData() {
        this(null, 1, "", "", 0, null);
    }

    public final GlobalComponentData copy(String str, int i, String str2, String str3, int i2, Integer num) {
        return new GlobalComponentData(str, i, str2, str3, i2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalComponentData)) {
            return false;
        }
        GlobalComponentData globalComponentData = (GlobalComponentData) obj;
        return Intrinsics.LJFF(this.componentKey, globalComponentData.componentKey) && this.showStrategy == globalComponentData.showStrategy && Intrinsics.LJFF(this.matchedContainerKey, globalComponentData.matchedContainerKey) && Intrinsics.LJFF(this.parentContainerKey, globalComponentData.parentContainerKey) && this.customShowLimit == globalComponentData.customShowLimit && Intrinsics.LJFF(this.priorityIndex, globalComponentData.priorityIndex);
    }

    public int hashCode() {
        String str = this.componentKey;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + this.showStrategy) * 31) + this.matchedContainerKey.hashCode()) * 31) + this.parentContainerKey.hashCode()) * 31) + this.customShowLimit) * 31;
        Integer num = this.priorityIndex;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GlobalComponentData(componentKey=");
        sbLIZ.append(this.componentKey);
        sbLIZ.append(", showStrategy=");
        sbLIZ.append(this.showStrategy);
        sbLIZ.append(", matchedContainerKey=");
        sbLIZ.append(this.matchedContainerKey);
        sbLIZ.append(", parentContainerKey=");
        sbLIZ.append(this.parentContainerKey);
        sbLIZ.append(", customShowLimit=");
        sbLIZ.append(this.customShowLimit);
        sbLIZ.append(", priorityIndex=");
        sbLIZ.append(this.priorityIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getComponentKey() {
        return this.componentKey;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public String getCurrentKey() {
        return this.componentKey;
    }

    public final int getCustomShowLimit() {
        return this.customShowLimit;
    }

    public final String getMatchedContainerKey() {
        return this.matchedContainerKey;
    }

    public final String getParentContainerKey() {
        return this.parentContainerKey;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public String getParentKey() {
        return this.matchedContainerKey;
    }

    public final Integer getPriorityIndex() {
        return this.priorityIndex;
    }

    public final int getShowStrategy() {
        return this.showStrategy;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFcpNodeData
    public List<String> getChildrenKey(String str) {
        return IFcpNodeData.DefaultImpls.getChildrenKey(this, str);
    }

    public final void setComponentKey(String str) {
        this.componentKey = str;
    }

    public final void setCustomShowLimit(int i) {
        this.customShowLimit = i;
    }

    public final void setMatchedContainerKey(String str) {
        this.matchedContainerKey = str;
    }

    public final void setParentContainerKey(String str) {
        this.parentContainerKey = str;
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
        this.customShowLimit = i;
    }

    public final void setPriorityIndex(Integer num) {
        this.priorityIndex = num;
    }

    public final void setShowStrategy(int i) {
        this.showStrategy = i;
    }

    public GlobalComponentData(String str, int i, String str2, String str3, int i2, Integer num) {
        this.componentKey = str;
        this.showStrategy = i;
        this.matchedContainerKey = str2;
        this.parentContainerKey = str3;
        this.customShowLimit = i2;
        this.priorityIndex = num;
    }
}
