package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class ShoppingLiveConfig {

    @C09CT("compatible_with_old_version")
    public Boolean compatibleWithOldVersion;

    public Boolean getCompatibleWithOldVersion() throws C316660CbA {
        Boolean bool = this.compatibleWithOldVersion;
        if (bool != null) {
            return bool;
        }
        throw new C316660CbA();
    }
}
