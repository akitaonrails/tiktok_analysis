package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateUserConfig {

    @C09CT("wx_toast_content")
    public String wxToastContent;

    @C09CT("wx_toast_enable")
    public Boolean wxToastEnable;

    @C09CT("wx_toast_frequence")
    public Integer wxToastFrequence;

    @C09CT("wx_toast_position")
    public Integer wxToastPosition;

    public String getWxToastContent() throws C316660CbA {
        String str = this.wxToastContent;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Boolean getWxToastEnable() throws C316660CbA {
        Boolean bool = this.wxToastEnable;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getWxToastFrequence() throws C316660CbA {
        Integer num = this.wxToastFrequence;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getWxToastPosition() throws C316660CbA {
        Integer num = this.wxToastPosition;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
