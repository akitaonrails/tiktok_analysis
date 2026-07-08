package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ClickJumpModule implements Serializable {

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("text")
    public final String text;

    @C09CT("web_url")
    public final String webUrl;

    public ClickJumpModule() {
        this(null, null, null);
    }

    public ClickJumpModule(String str, String str2, String str3) {
        this.text = str;
        this.openUrl = str2;
        this.webUrl = str3;
    }
}
