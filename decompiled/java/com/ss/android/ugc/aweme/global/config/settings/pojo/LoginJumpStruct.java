package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes17.dex */
public class LoginJumpStruct {

    @C09CT("jump_type")
    public Integer jumpType;

    @C09CT("jump_url")
    public String jumpUrl;

    @C09CT("login_platform")
    public Integer loginPlatform;

    public Integer getJumpType() throws C316660CbA {
        Integer num = this.jumpType;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getJumpUrl() throws C316660CbA {
        String str = this.jumpUrl;
        if (str != null) {
            return str;
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
}
