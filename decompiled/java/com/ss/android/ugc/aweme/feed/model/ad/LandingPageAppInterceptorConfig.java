package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LandingPageAppInterceptorConfig implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("style_type")
    public final Integer styleType;

    @C09CT("trigger_type")
    public final Integer triggerType;

    public static final class Companion {
    }

    public LandingPageAppInterceptorConfig() {
        this(null, null);
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final Integer getTriggerType() {
        return this.triggerType;
    }

    public final boolean shouldShowGooglePlayMiniCard(boolean z) {
        Integer num = this.styleType;
        if (num == null || num.intValue() != 100) {
            return false;
        }
        Integer num2 = this.triggerType;
        if (num2 != null && num2.intValue() == 3) {
            return true;
        }
        if (z) {
            Integer num3 = this.triggerType;
            if (num3 == null || num3.intValue() != 1) {
                return false;
            }
            return true;
        }
        Integer num4 = this.triggerType;
        if (num4 == null || num4.intValue() != 2) {
            return false;
        }
        return true;
    }

    public LandingPageAppInterceptorConfig(Integer num, Integer num2) {
        this.styleType = num;
        this.triggerType = num2;
    }
}
