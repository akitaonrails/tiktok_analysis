package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserAccountInfo implements Serializable {

    @C09CT("account_type")
    public Integer accountType;

    @C09CT("audience_control_viewer_mode")
    public Integer audienceControlViewerMode;

    @C09CT("ban_status")
    public Integer banStatus;

    @C09CT("is_blocked")
    public boolean isBlocked;

    @C09CT("is_private_account")
    public Boolean isSecret;

    @C09CT("user_canceled")
    public boolean isUserCancel;

    @C09CT("has_cert")
    public Boolean isVerified;

    public final Integer getAccountType() {
        return this.accountType;
    }

    public final Integer getAudienceControlViewerMode() {
        return this.audienceControlViewerMode;
    }

    public final Integer getBanStatus() {
        return this.banStatus;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final Boolean isSecret() {
        return this.isSecret;
    }

    public final boolean isUserCancel() {
        return this.isUserCancel;
    }

    public final Boolean isVerified() {
        return this.isVerified;
    }

    public final void setAccountType(Integer num) {
        this.accountType = num;
    }

    public final void setAudienceControlViewerMode(Integer num) {
        this.audienceControlViewerMode = num;
    }

    public final void setBanStatus(Integer num) {
        this.banStatus = num;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setSecret(Boolean bool) {
        this.isSecret = bool;
    }

    public final void setUserCancel(boolean z) {
        this.isUserCancel = z;
    }

    public final void setVerified(Boolean bool) {
        this.isVerified = bool;
    }
}
