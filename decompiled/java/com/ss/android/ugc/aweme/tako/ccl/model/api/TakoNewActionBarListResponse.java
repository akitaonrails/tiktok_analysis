package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNewActionBarListResponse extends TakoBaseResponse {

    @C09CT("action_bar_list")
    public final List<NewActionBarItem> actionBarList;

    @C09CT("aigc_style_config")
    public final AIGCStyleConfig aigcStyleConfig;

    @C09CT("convert_style")
    public final ConvertStyle convertStyle;

    @C09CT("creative_template")
    public final List<CreativeTemplate> creativeTemplates;

    @C09CT("image_actions")
    public final List<ActionBarImageItem> imageActions;

    @C09CT("image_actions_v2")
    public final List<ActionBarImageItem> imageActionsV2;

    @C09CT("thirdparty_action_bar_list")
    public final Map<String, ActionBarItemList> thirdPartyActionBarList;

    public TakoNewActionBarListResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoNewActionBarListResponse)) {
            return false;
        }
        TakoNewActionBarListResponse takoNewActionBarListResponse = (TakoNewActionBarListResponse) obj;
        return Intrinsics.LJFF(this.actionBarList, takoNewActionBarListResponse.actionBarList) && Intrinsics.LJFF(this.imageActions, takoNewActionBarListResponse.imageActions) && Intrinsics.LJFF(this.imageActionsV2, takoNewActionBarListResponse.imageActionsV2) && Intrinsics.LJFF(this.creativeTemplates, takoNewActionBarListResponse.creativeTemplates) && Intrinsics.LJFF(this.convertStyle, takoNewActionBarListResponse.convertStyle) && Intrinsics.LJFF(this.thirdPartyActionBarList, takoNewActionBarListResponse.thirdPartyActionBarList) && Intrinsics.LJFF(this.aigcStyleConfig, takoNewActionBarListResponse.aigcStyleConfig);
    }

    public final int hashCode() {
        List<NewActionBarItem> list = this.actionBarList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ActionBarImageItem> list2 = this.imageActions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ActionBarImageItem> list3 = this.imageActionsV2;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CreativeTemplate> list4 = this.creativeTemplates;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ConvertStyle convertStyle = this.convertStyle;
        int iHashCode5 = (iHashCode4 + (convertStyle == null ? 0 : convertStyle.hashCode())) * 31;
        Map<String, ActionBarItemList> map = this.thirdPartyActionBarList;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        AIGCStyleConfig aIGCStyleConfig = this.aigcStyleConfig;
        return iHashCode6 + (aIGCStyleConfig != null ? aIGCStyleConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoNewActionBarListResponse(actionBarList=");
        sbLIZ.append(this.actionBarList);
        sbLIZ.append(", imageActions=");
        sbLIZ.append(this.imageActions);
        sbLIZ.append(", imageActionsV2=");
        sbLIZ.append(this.imageActionsV2);
        sbLIZ.append(", creativeTemplates=");
        sbLIZ.append(this.creativeTemplates);
        sbLIZ.append(", convertStyle=");
        sbLIZ.append(this.convertStyle);
        sbLIZ.append(", thirdPartyActionBarList=");
        sbLIZ.append(this.thirdPartyActionBarList);
        sbLIZ.append(", aigcStyleConfig=");
        sbLIZ.append(this.aigcStyleConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoNewActionBarListResponse(List<NewActionBarItem> list, List<ActionBarImageItem> list2, List<ActionBarImageItem> list3, List<CreativeTemplate> list4, ConvertStyle convertStyle, Map<String, ActionBarItemList> map, AIGCStyleConfig aIGCStyleConfig) {
        super(null, 0, "");
        this.actionBarList = list;
        this.imageActions = list2;
        this.imageActionsV2 = list3;
        this.creativeTemplates = list4;
        this.convertStyle = convertStyle;
        this.thirdPartyActionBarList = map;
        this.aigcStyleConfig = aIGCStyleConfig;
    }

    public TakoNewActionBarListResponse(List list, List list2, List list3, List list4, ConvertStyle convertStyle, Map map, AIGCStyleConfig aIGCStyleConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? null : convertStyle, (i & 32) != 0 ? C2097608Jq.LJ() : map, (i & 64) == 0 ? aIGCStyleConfig : null);
    }
}
