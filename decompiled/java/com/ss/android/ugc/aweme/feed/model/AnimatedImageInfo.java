package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimatedImageInfo implements Serializable {

    @C09CT("effect")
    public Integer effect;

    @C09CT("type")
    public Integer type;

    public AnimatedImageInfo() {
    }

    public final boolean isLivePhoto() {
        Integer num = this.type;
        return num != null && num.intValue() == 1;
    }

    public AnimatedImageInfo(Integer num, Integer num2) {
        this.type = num;
        this.effect = num2;
    }
}
