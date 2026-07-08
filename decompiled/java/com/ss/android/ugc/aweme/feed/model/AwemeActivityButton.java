package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeActivityButton implements Serializable {

    @C09CT("color")
    public String color;

    @C09CT("label")
    public String label;

    public AwemeActivityButton() {
        this(null, null);
    }

    public AwemeActivityButton(String str, String str2) {
        this.label = str;
        this.color = str2;
    }
}
