package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes22.dex */
public class ShareChannelSettings {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    public String getId() throws C316660CbA {
        String str = this.id;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public void setId(String str) {
        this.id = str;
    }
}
