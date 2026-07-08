package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AGSWarningPopupButton implements Serializable {

    @C09CT("btn_content")
    public final String content;

    @C09CT("btn_url")
    public final String url;

    public AGSWarningPopupButton() {
        this("", "");
    }

    public AGSWarningPopupButton(String str, String str2) {
        this.content = str;
        this.url = str2;
    }
}
