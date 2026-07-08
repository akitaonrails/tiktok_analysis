package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class InviteError implements Serializable {

    @C09CT("error_code")
    public Integer errorCode;

    @C09CT("error_message")
    public String errorMessage;

    @C09CT("error_title")
    public String errorTitle;

    public InviteError() {
        this(null, null, null);
    }

    public final boolean isExpired() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 7812;
    }

    public final boolean isGroupHighRisk() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 7825;
    }

    public final boolean isGroupSuspendedPermanently() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 7824;
    }

    public final boolean isGroupSuspendedTemporarily() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 7823;
    }

    public final boolean isNoPermission() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 7817;
    }

    public final boolean isU18Block() {
        Integer num = this.errorCode;
        return num != null && num.intValue() == 7901;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setErrorTitle(String str) {
        this.errorTitle = str;
    }

    public InviteError(Integer num, String str, String str2) {
        this.errorCode = num;
        this.errorTitle = str;
        this.errorMessage = str2;
    }
}
