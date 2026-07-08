package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes17.dex */
public class BindWindowsStruct {

    @C09CT("bind_desc")
    public String bindDesc;

    @C09CT("bind_title")
    public String bindTitle;

    @C09CT("interval")
    public Integer interval;

    @C09CT("login_platform")
    public Integer loginPlatform;

    @C09CT("open_window")
    public Boolean openWindow;

    @C09CT("total_times")
    public Integer totalTimes;

    public String getBindDesc() throws C316660CbA {
        String str = this.bindDesc;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getBindTitle() throws C316660CbA {
        String str = this.bindTitle;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public Integer getInterval() throws C316660CbA {
        Integer num = this.interval;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Integer getLoginPlatform() throws C316660CbA {
        Integer num = this.loginPlatform;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public Boolean getOpenWindow() throws C316660CbA {
        Boolean bool = this.openWindow;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }

    public Integer getTotalTimes() throws C316660CbA {
        Integer num = this.totalTimes;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }
}
