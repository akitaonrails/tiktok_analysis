package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PopupActionsConfig implements Serializable {

    @C09CT("close_others")
    public boolean closeOthers;

    @C09CT("edm_consent")
    public boolean edmConsent;

    @C09CT("edm_subscribe")
    public boolean edmSubscribe;

    @C09CT("jump_2_system_settings")
    public boolean jump2SystemSettings;

    @C09CT("need_set_sub_switches")
    public boolean needSetSubSwitches;

    @C09CT("sms_consent")
    public boolean smsConsent;
    public String subSwitchesNewKeyValues;

    public PopupActionsConfig() {
        this(true, false, null, false, false, false, false);
    }

    public int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.jump2SystemSettings) * 31) + C786410Ut5.Z2(this.needSetSubSwitches)) * 31;
        String str = this.subSwitchesNewKeyValues;
        return ((((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.closeOthers)) * 31) + C786410Ut5.Z2(this.edmSubscribe)) * 31) + C786410Ut5.Z2(this.edmConsent)) * 31) + C786410Ut5.Z2(this.smsConsent);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupActionsConfig(jump2SystemSettings=");
        sbLIZ.append(this.jump2SystemSettings);
        sbLIZ.append(", needSetSubSwitches=");
        sbLIZ.append(this.needSetSubSwitches);
        sbLIZ.append(", subSwitchesNewKeyValues=");
        sbLIZ.append(this.subSwitchesNewKeyValues);
        sbLIZ.append(", closeOthers=");
        sbLIZ.append(this.closeOthers);
        sbLIZ.append(", edmSubscribe=");
        sbLIZ.append(this.edmSubscribe);
        sbLIZ.append(", edmConsent=");
        sbLIZ.append(this.edmConsent);
        sbLIZ.append(", smsConsent=");
        sbLIZ.append(this.smsConsent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCloseOthers(boolean z) {
        this.closeOthers = z;
    }

    public final void setEdmConsent(boolean z) {
        this.edmConsent = z;
    }

    public final void setEdmSubscribe(boolean z) {
        this.edmSubscribe = z;
    }

    public final void setJump2SystemSettings(boolean z) {
        this.jump2SystemSettings = z;
    }

    public final void setNeedSetSubSwitches(boolean z) {
        this.needSetSubSwitches = z;
    }

    public final void setSmsConsent(boolean z) {
        this.smsConsent = z;
    }

    public final void setSubSwitchesNewKeyValues(String str) {
        this.subSwitchesNewKeyValues = str;
    }

    public PopupActionsConfig(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.jump2SystemSettings = z;
        this.needSetSubSwitches = z2;
        this.subSwitchesNewKeyValues = str;
        this.closeOthers = z3;
        this.edmSubscribe = z4;
        this.edmConsent = z5;
        this.smsConsent = z6;
    }
}
