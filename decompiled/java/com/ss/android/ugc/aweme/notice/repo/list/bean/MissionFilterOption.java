package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C623830OdR;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionFilterOption {
    public static final C623830OdR Companion = new Object() { // from class: X.0OdR
    };
    public final boolean isChecked;

    @C09CT("label")
    public final String label;

    @C09CT("text")
    public final String text;

    @C09CT("value")
    public final int value;

    public MissionFilterOption() {
        this("", 0, "", false);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public MissionFilterOption(String str, int i, String str2, boolean z) {
        this.text = str;
        this.value = i;
        this.label = str2;
        this.isChecked = z;
    }
}
