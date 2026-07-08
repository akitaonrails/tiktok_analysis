package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class EdibilityStatusDisplay implements Serializable {
    public static final int $stable = 0;

    @C09CT("age_select_display")
    public final int ageSelectDisplay;

    @C09CT("button_display")
    public final int buttonType;

    @C09CT("content")
    public final String content;

    @C09CT("status_type")
    public final int statusType;

    public EdibilityStatusDisplay() {
        this(0, 0, "", 0);
    }

    public EdibilityStatusDisplay(int i, int i2, String str, int i3) {
        this.ageSelectDisplay = i;
        this.buttonType = i2;
        this.content = str;
        this.statusType = i3;
    }
}
