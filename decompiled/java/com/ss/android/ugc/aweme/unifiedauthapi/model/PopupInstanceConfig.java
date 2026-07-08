package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupInstanceConfig implements Serializable {

    @C09CT("one_click_sys_popup")
    public OneClickSysPopupConfig oneClickSysPopup;

    @C09CT("overwrite_type")
    public int overwriteType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String panelId;

    @C09CT("template_id")
    public String panelType;

    @C09CT("platform")
    public List<String> platform;

    @C09CT("action")
    public PopupActionsConfig popupActionsConfig;

    @C09CT("popup_combination_status")
    public int popupCombinationType;

    @C09CT("popup")
    public PopupElementsConfig popupElementsConfig;

    @C09CT("filter")
    public PopupFiltersConfig popupFiltersConfig;

    public PopupInstanceConfig() {
        this(null, 0, null, 0, null, null, null, null, null, 511, null);
    }

    public final PopupInstanceConfig copy(String str, int i, List<String> list, int i2, OneClickSysPopupConfig oneClickSysPopupConfig, String str2, PopupElementsConfig popupElementsConfig, PopupFiltersConfig popupFiltersConfig, PopupActionsConfig popupActionsConfig) {
        return new PopupInstanceConfig(str, i, list, i2, oneClickSysPopupConfig, str2, popupElementsConfig, popupFiltersConfig, popupActionsConfig);
    }

    public int hashCode() {
        int iHashCode = ((((((this.panelId.hashCode() * 31) + this.overwriteType) * 31) + this.platform.hashCode()) * 31) + this.popupCombinationType) * 31;
        OneClickSysPopupConfig oneClickSysPopupConfig = this.oneClickSysPopup;
        return ((((((((iHashCode + (oneClickSysPopupConfig == null ? 0 : oneClickSysPopupConfig.hashCode())) * 31) + this.panelType.hashCode()) * 31) + this.popupElementsConfig.hashCode()) * 31) + this.popupFiltersConfig.hashCode()) * 31) + this.popupActionsConfig.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupInstanceConfig(panelId=");
        sbLIZ.append(this.panelId);
        sbLIZ.append(", overwriteType=");
        sbLIZ.append(this.overwriteType);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.platform);
        sbLIZ.append(", popupCombinationType=");
        sbLIZ.append(this.popupCombinationType);
        sbLIZ.append(", oneClickSysPopup=");
        sbLIZ.append(this.oneClickSysPopup);
        sbLIZ.append(", panelType=");
        sbLIZ.append(this.panelType);
        sbLIZ.append(", popupElementsConfig=");
        sbLIZ.append(this.popupElementsConfig);
        sbLIZ.append(", popupFiltersConfig=");
        sbLIZ.append(this.popupFiltersConfig);
        sbLIZ.append(", popupActionsConfig=");
        sbLIZ.append(this.popupActionsConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setOneClickSysPopup(OneClickSysPopupConfig oneClickSysPopupConfig) {
        this.oneClickSysPopup = oneClickSysPopupConfig;
    }

    public final void setOverwriteType(int i) {
        this.overwriteType = i;
    }

    public final void setPanelId(String str) {
        this.panelId = str;
    }

    public final void setPanelType(String str) {
        this.panelType = str;
    }

    public final void setPlatform(List<String> list) {
        this.platform = list;
    }

    public final void setPopupActionsConfig(PopupActionsConfig popupActionsConfig) {
        this.popupActionsConfig = popupActionsConfig;
    }

    public final void setPopupCombinationType(int i) {
        this.popupCombinationType = i;
    }

    public final void setPopupElementsConfig(PopupElementsConfig popupElementsConfig) {
        this.popupElementsConfig = popupElementsConfig;
    }

    public final void setPopupFiltersConfig(PopupFiltersConfig popupFiltersConfig) {
        this.popupFiltersConfig = popupFiltersConfig;
    }

    public PopupInstanceConfig(String str, int i, List<String> list, int i2, OneClickSysPopupConfig oneClickSysPopupConfig, String str2, PopupElementsConfig popupElementsConfig, PopupFiltersConfig popupFiltersConfig, PopupActionsConfig popupActionsConfig) {
        this.panelId = str;
        this.overwriteType = i;
        this.platform = list;
        this.popupCombinationType = i2;
        this.oneClickSysPopup = oneClickSysPopupConfig;
        this.panelType = str2;
        this.popupElementsConfig = popupElementsConfig;
        this.popupFiltersConfig = popupFiltersConfig;
        this.popupActionsConfig = popupActionsConfig;
    }

    public PopupInstanceConfig(String str, int i, List list, int i2, OneClickSysPopupConfig oneClickSysPopupConfig, String str2, PopupElementsConfig popupElementsConfig, PopupFiltersConfig popupFiltersConfig, PopupActionsConfig popupActionsConfig, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? Collections.singletonList("android") : list, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : oneClickSysPopupConfig, (i3 & 32) != 0 ? "normal" : str2, (i3 & 64) != 0 ? new PopupElementsConfig(null, null, null, false, null, null, null, null, true, null, false, false, null, null, null, -1, null, null) : popupElementsConfig, (i3 & 128) != 0 ? new PopupFiltersConfig(0, null, true, null, -1, null, -1, false, false, false, null) : popupFiltersConfig, (i3 & 256) != 0 ? new PopupActionsConfig(true, false, null, false, false, false, false) : popupActionsConfig);
    }
}
