package com.ss.android.ugc.aweme.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BizContactInfo implements Serializable {

    @C09CT("biz_address")
    public BizAddress bizAddress;

    @C09CT("biz_phone")
    public String bizPhone;

    @C09CT("biz_phone_enable_call")
    public Boolean call;

    @C09CT("biz_phone_enable_text")
    public Boolean text;

    @C09CT("biz_phone_show_pattern")
    public String type;

    public final BizAddress getBizAddress() {
        return this.bizAddress;
    }

    public final String getBizPhone() {
        return this.bizPhone;
    }

    public final Boolean getCall() {
        return this.call;
    }

    public final Boolean getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final void setBizAddress(BizAddress bizAddress) {
        this.bizAddress = bizAddress;
    }

    public final void setBizPhone(String str) {
        this.bizPhone = str;
    }

    public final void setCall(Boolean bool) {
        this.call = bool;
    }

    public final void setText(Boolean bool) {
        this.text = bool;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
