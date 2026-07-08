package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class TherePartyDataControlModel implements Serializable {

    @C09CT("is_eu_user")
    public boolean isEuUser;

    @C09CT("is_submitted")
    public Boolean isSubmitted;

    @C09CT("last_submitted_time")
    public Integer lastSubmittedTime;

    @C09CT("is_show_3p_data_control")
    public Boolean shouldShow3PDataControl;

    @C09CT("is_show_disconnect_adv")
    public boolean shouldShowInteractedAdvertisersEntrance;

    public TherePartyDataControlModel() {
        this(Boolean.FALSE, Boolean.FALSE, null, false, false);
    }

    public final Integer getLastSubmittedTime() {
        return this.lastSubmittedTime;
    }

    public final Boolean getShouldShow3PDataControl() {
        return this.shouldShow3PDataControl;
    }

    public final boolean getShouldShowInteractedAdvertisersEntrance() {
        return this.shouldShowInteractedAdvertisersEntrance;
    }

    public final boolean isEuUser() {
        return this.isEuUser;
    }

    public final Boolean isSubmitted() {
        return this.isSubmitted;
    }

    public final void setEuUser(boolean z) {
        this.isEuUser = z;
    }

    public final void setLastSubmittedTime(Integer num) {
        this.lastSubmittedTime = num;
    }

    public final void setShouldShow3PDataControl(Boolean bool) {
        this.shouldShow3PDataControl = bool;
    }

    public final void setShouldShowInteractedAdvertisersEntrance(boolean z) {
        this.shouldShowInteractedAdvertisersEntrance = z;
    }

    public final void setSubmitted(Boolean bool) {
        this.isSubmitted = bool;
    }

    public TherePartyDataControlModel(Boolean bool, Boolean bool2, Integer num, boolean z, boolean z2) {
        this.shouldShow3PDataControl = bool;
        this.isSubmitted = bool2;
        this.lastSubmittedTime = num;
        this.isEuUser = z;
        this.shouldShowInteractedAdvertisersEntrance = z2;
    }
}
