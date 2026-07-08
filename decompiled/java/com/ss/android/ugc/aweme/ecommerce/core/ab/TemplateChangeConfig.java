package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TemplateChangeConfig {

    @C09CT("biz")
    public final String biz;

    @C09CT("once_key")
    public final String onceKey;

    @C09CT("real_template")
    public final Integer realTemplate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateChangeConfig)) {
            return false;
        }
        TemplateChangeConfig templateChangeConfig = (TemplateChangeConfig) obj;
        return Intrinsics.LJFF(this.onceKey, templateChangeConfig.onceKey) && Intrinsics.LJFF(this.realTemplate, templateChangeConfig.realTemplate) && Intrinsics.LJFF(this.biz, templateChangeConfig.biz);
    }

    public TemplateChangeConfig(String str, Integer num, String str2) {
        this.onceKey = str;
        this.realTemplate = num;
        this.biz = str2;
    }
}
