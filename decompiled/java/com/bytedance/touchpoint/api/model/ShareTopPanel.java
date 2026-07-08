package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ShareTopPanel {

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("text_button")
    public Button textButton;

    @C09CT("title")
    public Title title;

    public ShareTopPanel() {
        this(null, null, null);
    }

    public ShareTopPanel(String str, Title title, Button button) {
        this.iconUrl = str;
        this.title = title;
        this.textButton = button;
    }
}
