package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShaderViewAnimation implements Serializable {

    @C09CT("time_offset")
    public String String;

    @C09CT("speed")
    public String speed;

    public ShaderViewAnimation() {
        this("", "");
    }

    public final String getSpeed() {
        return this.speed;
    }

    public final String getString() {
        return this.String;
    }

    public final void setSpeed(String str) {
        this.speed = str;
    }

    public final void setString(String str) {
        this.String = str;
    }

    public ShaderViewAnimation(String str, String str2) {
        this.speed = str;
        this.String = str2;
    }
}
