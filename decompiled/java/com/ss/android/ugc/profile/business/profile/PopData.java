package com.ss.android.ugc.profile.business.profile;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PopData implements Serializable {
    public static final int $stable = 8;

    @C09CT("name")
    public String name;

    @C09CT("text")
    public String text;

    public final String getName() {
        return this.name;
    }

    public final String getText() {
        return this.text;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
