package com.ss.android.ugc.profile.business.ad.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioContactData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("biz_phone")
    public String bizPhone;

    @C09CT("biz_phone_enable_call")
    public Boolean bizPhoneEnableCall;

    @C09CT("biz_phone_enable_text")
    public Boolean bizPhoneEnableText;

    @C09CT("biz_phone_show_pattern")
    public String type;

    public final String getBizPhone() {
        return this.bizPhone;
    }

    public final Boolean getBizPhoneEnableCall() {
        return this.bizPhoneEnableCall;
    }

    public final Boolean getBizPhoneEnableText() {
        return this.bizPhoneEnableText;
    }

    public final String getType() {
        return this.type;
    }

    public final void setBizPhone(String str) {
        this.bizPhone = str;
    }

    public final void setBizPhoneEnableCall(Boolean bool) {
        this.bizPhoneEnableCall = bool;
    }

    public final void setBizPhoneEnableText(Boolean bool) {
        this.bizPhoneEnableText = bool;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
