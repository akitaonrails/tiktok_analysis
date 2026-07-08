package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class UserNameData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("custom_verify")
    public String customVerify;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @C09CT("nickname_update_reminder")
    public Boolean nickNameUpdateReminder;

    @C09CT("real_user_name")
    public String realUserName;

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final Boolean getNickNameUpdateReminder() {
        return this.nickNameUpdateReminder;
    }

    public final String getRealUserName() {
        return this.realUserName;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setNickNameUpdateReminder(Boolean bool) {
        this.nickNameUpdateReminder = bool;
    }

    public final void setRealUserName(String str) {
        this.realUserName = str;
    }
}
