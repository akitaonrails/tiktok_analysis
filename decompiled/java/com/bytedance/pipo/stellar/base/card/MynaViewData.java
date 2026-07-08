package com.bytedance.pipo.stellar.base.card;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MynaViewData extends BaseWidgetDO {

    @C09CT("bind_action_map")
    public final Map<String, StellarActionDO> actionMap;

    @C09CT("data_source")
    public final String data;

    @C09CT("schema")
    public final String schema;

    @C09CT("skeleton_height_mode")
    public final Integer skeletonHeightMode;

    @C09CT("template_string")
    public final String templateString;

    @C09CT("template_url")
    public final String templateUrl;

    public final MynaViewData copy(String str, String str2, String str3, String str4, Integer num, Map<String, StellarActionDO> map) {
        return new MynaViewData(str, str2, str3, str4, num, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MynaViewData)) {
            return false;
        }
        MynaViewData mynaViewData = (MynaViewData) obj;
        return Intrinsics.LJFF(this.schema, mynaViewData.schema) && Intrinsics.LJFF(this.templateUrl, mynaViewData.templateUrl) && Intrinsics.LJFF(this.templateString, mynaViewData.templateString) && Intrinsics.LJFF(this.data, mynaViewData.data) && Intrinsics.LJFF(this.skeletonHeightMode, mynaViewData.skeletonHeightMode) && Intrinsics.LJFF(this.actionMap, mynaViewData.actionMap);
    }

    public int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateString;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.data;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.skeletonHeightMode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, StellarActionDO> map = this.actionMap;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MynaViewData(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", templateUrl=");
        sbLIZ.append(this.templateUrl);
        sbLIZ.append(", templateString=");
        sbLIZ.append(this.templateString);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", skeletonHeightMode=");
        sbLIZ.append(this.skeletonHeightMode);
        sbLIZ.append(", actionMap=");
        sbLIZ.append(this.actionMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, StellarActionDO> getActionMap() {
        return this.actionMap;
    }

    public final String getData() {
        return this.data;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getSkeletonHeightMode() {
        return this.skeletonHeightMode;
    }

    public final String getTemplateString() {
        return this.templateString;
    }

    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    public MynaViewData(String str, String str2, String str3, String str4, Integer num, Map<String, StellarActionDO> map) {
        super(null, null, 1, null, null);
        this.schema = str;
        this.templateUrl = str2;
        this.templateString = str3;
        this.data = str4;
        this.skeletonHeightMode = num;
        this.actionMap = map;
    }
}
