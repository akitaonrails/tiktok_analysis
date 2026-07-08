package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public final class UnRegisteredUser {

    @C09CT("invite_status")
    public int inviteStatus;

    @C09CT("mobile_id")
    public String mobileId;

    @C09CT("remark_name")
    public String remarkName;

    public int hashCode() {
        return super.hashCode();
    }

    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    public final String getMobileId() {
        return this.mobileId;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnRegisteredUser) || !TextUtils.equals(this.mobileId, ((UnRegisteredUser) obj).mobileId)) {
            return false;
        }
        return super.equals(obj);
    }

    public final void setInviteStatus(int i) {
        this.inviteStatus = i;
    }

    public final void setMobileId(String str) {
        this.mobileId = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }
}
