package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class LiveFEConfigs {

    @C09CT("honor_level")
    public HonorLevel honorLevel;

    public HonorLevel getHonorLevel() throws C316660CbA {
        HonorLevel honorLevel = this.honorLevel;
        if (honorLevel != null) {
            return honorLevel;
        }
        throw new C316660CbA();
    }
}
