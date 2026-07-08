package com.ss.android.ugc.aweme.component.nativeendlayercomponent.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CountdownButton implements Serializable {
    public static final int $stable = 8;

    @C09CT("second")
    public Integer second;

    @C09CT("text")
    public String text;

    public final void setSecond(Integer num) {
        this.second = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public CountdownButton(String str, Integer num) {
        this.text = str;
        this.second = num;
    }
}
