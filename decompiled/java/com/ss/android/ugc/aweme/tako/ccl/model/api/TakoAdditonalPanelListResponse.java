package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAdditonalPanelListResponse extends TakoBaseResponse {

    @C09CT("plus_panel_list")
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

    public TakoAdditonalPanelListResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoAdditonalPanelListResponse)) {
            return false;
        }
        TakoAdditonalPanelListResponse takoAdditonalPanelListResponse = (TakoAdditonalPanelListResponse) obj;
        return Intrinsics.LJFF(this.actionBarList, takoAdditonalPanelListResponse.actionBarList) && Intrinsics.LJFF(this.imageActions, takoAdditonalPanelListResponse.imageActions) && Intrinsics.LJFF(this.imageActionsV2, takoAdditonalPanelListResponse.imageActionsV2) && Intrinsics.LJFF(this.creativeTemplates, takoAdditonalPanelListResponse.creativeTemplates) && Intrinsics.LJFF(this.convertStyle, takoAdditonalPanelListResponse.convertStyle) && Intrinsics.LJFF(this.aigcStyleConfig, takoAdditonalPanelListResponse.aigcStyleConfig);
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
        AIGCStyleConfig aIGCStyleConfig = this.aigcStyleConfig;
        return iHashCode5 + (aIGCStyleConfig != null ? aIGCStyleConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAdditonalPanelListResponse(actionBarList=");
        sbLIZ.append(this.actionBarList);
        sbLIZ.append(", imageActions=");
        sbLIZ.append(this.imageActions);
        sbLIZ.append(", imageActionsV2=");
        sbLIZ.append(this.imageActionsV2);
        sbLIZ.append(", creativeTemplates=");
        sbLIZ.append(this.creativeTemplates);
        sbLIZ.append(", convertStyle=");
        sbLIZ.append(this.convertStyle);
        sbLIZ.append(", aigcStyleConfig=");
        sbLIZ.append(this.aigcStyleConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAdditonalPanelListResponse(List<NewActionBarItem> list, List<ActionBarImageItem> list2, List<ActionBarImageItem> list3, List<CreativeTemplate> list4, ConvertStyle convertStyle, AIGCStyleConfig aIGCStyleConfig) {
        super(null, 0, "");
        this.actionBarList = list;
        this.imageActions = list2;
        this.imageActionsV2 = list3;
        this.creativeTemplates = list4;
        this.convertStyle = convertStyle;
        this.aigcStyleConfig = aIGCStyleConfig;
    }

    public TakoAdditonalPanelListResponse(List list, List list2, List list3, List list4, ConvertStyle convertStyle, AIGCStyleConfig aIGCStyleConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? null : convertStyle, (i & 32) == 0 ? aIGCStyleConfig : null);
    }
}
