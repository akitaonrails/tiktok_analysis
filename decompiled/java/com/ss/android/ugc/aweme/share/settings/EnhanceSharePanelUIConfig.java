package com.ss.android.ugc.aweme.share.settings;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class EnhanceSharePanelUIConfig {

    @C09CT("adjust_action_channel")
    public final Boolean adjustActionChannel;

    @C09CT("im_section_config")
    public final ImSectionConfig imSectionConfig;

    @C09CT("move_tip_config")
    public final MoveTipConfig moveTipConfig;

    @C09CT("prepose_create_group")
    public final Boolean preposeCreateGroup;

    @C09CT("prohibit_handle_device_score")
    public final Float prohibitHandleDeviceScore;

    @C09CT("share_actions")
    public final List<ShareItemOrderBean> shareActions;

    @C09CT("use_quare_icon")
    public final Boolean useSquareIcon;

    public EnhanceSharePanelUIConfig() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnhanceSharePanelUIConfig)) {
            return false;
        }
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfig = (EnhanceSharePanelUIConfig) obj;
        return Intrinsics.LJFF(this.shareActions, enhanceSharePanelUIConfig.shareActions) && Intrinsics.LJFF(this.moveTipConfig, enhanceSharePanelUIConfig.moveTipConfig) && Intrinsics.LJFF(this.adjustActionChannel, enhanceSharePanelUIConfig.adjustActionChannel) && Intrinsics.LJFF(this.useSquareIcon, enhanceSharePanelUIConfig.useSquareIcon) && Intrinsics.LJFF(this.preposeCreateGroup, enhanceSharePanelUIConfig.preposeCreateGroup) && Intrinsics.LJFF(this.imSectionConfig, enhanceSharePanelUIConfig.imSectionConfig) && Intrinsics.LJFF(this.prohibitHandleDeviceScore, enhanceSharePanelUIConfig.prohibitHandleDeviceScore);
    }

    public final int hashCode() {
        List<ShareItemOrderBean> list = this.shareActions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        MoveTipConfig moveTipConfig = this.moveTipConfig;
        int iHashCode2 = (iHashCode + (moveTipConfig == null ? 0 : moveTipConfig.hashCode())) * 31;
        Boolean bool = this.adjustActionChannel;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useSquareIcon;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.preposeCreateGroup;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ImSectionConfig imSectionConfig = this.imSectionConfig;
        int iHashCode6 = (iHashCode5 + (imSectionConfig == null ? 0 : imSectionConfig.hashCode())) * 31;
        Float f = this.prohibitHandleDeviceScore;
        return iHashCode6 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnhanceSharePanelUIConfig(shareActions=");
        sbLIZ.append(this.shareActions);
        sbLIZ.append(", moveTipConfig=");
        sbLIZ.append(this.moveTipConfig);
        sbLIZ.append(", adjustActionChannel=");
        sbLIZ.append(this.adjustActionChannel);
        sbLIZ.append(", useSquareIcon=");
        sbLIZ.append(this.useSquareIcon);
        sbLIZ.append(", preposeCreateGroup=");
        sbLIZ.append(this.preposeCreateGroup);
        sbLIZ.append(", imSectionConfig=");
        sbLIZ.append(this.imSectionConfig);
        sbLIZ.append(", prohibitHandleDeviceScore=");
        sbLIZ.append(this.prohibitHandleDeviceScore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnhanceSharePanelUIConfig(List<? extends ShareItemOrderBean> list, MoveTipConfig moveTipConfig, Boolean bool, Boolean bool2, Boolean bool3, ImSectionConfig imSectionConfig, Float f) {
        this.shareActions = list;
        this.moveTipConfig = moveTipConfig;
        this.adjustActionChannel = bool;
        this.useSquareIcon = bool2;
        this.preposeCreateGroup = bool3;
        this.imSectionConfig = imSectionConfig;
        this.prohibitHandleDeviceScore = f;
    }
}
