package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PdpTriggerModel {

    @C09CT("action_name")
    public final String actionName;

    @C09CT("action_params")
    public final Map<String, Object> actionParams;

    @C09CT("bind_data")
    public final Integer bindData;

    @C09CT("distance_item_cnt")
    public final Integer distanceItemCount;

    @C09CT("once_key")
    public final String onceKey;

    public PdpTriggerModel() {
        this(null, 1, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpTriggerModel)) {
            return false;
        }
        PdpTriggerModel pdpTriggerModel = (PdpTriggerModel) obj;
        return Intrinsics.LJFF(this.onceKey, pdpTriggerModel.onceKey) && Intrinsics.LJFF(this.bindData, pdpTriggerModel.bindData) && Intrinsics.LJFF(this.distanceItemCount, pdpTriggerModel.distanceItemCount) && Intrinsics.LJFF(this.actionName, pdpTriggerModel.actionName) && Intrinsics.LJFF(this.actionParams, pdpTriggerModel.actionParams);
    }

    public final int hashCode() {
        String str = this.onceKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bindData;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.distanceItemCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.actionName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.actionParams;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpTriggerModel(onceKey=");
        sbLIZ.append(this.onceKey);
        sbLIZ.append(", bindData=");
        sbLIZ.append(this.bindData);
        sbLIZ.append(", distanceItemCount=");
        sbLIZ.append(this.distanceItemCount);
        sbLIZ.append(", actionName=");
        sbLIZ.append(this.actionName);
        sbLIZ.append(", actionParams=");
        sbLIZ.append(this.actionParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PdpTriggerModel(String str, Integer num, Integer num2, String str2, Map<String, ? extends Object> map) {
        this.onceKey = str;
        this.bindData = num;
        this.distanceItemCount = num2;
        this.actionName = str2;
        this.actionParams = map;
    }
}
