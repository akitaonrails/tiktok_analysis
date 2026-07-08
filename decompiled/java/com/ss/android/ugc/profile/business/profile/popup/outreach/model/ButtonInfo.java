package com.ss.android.ugc.profile.business.profile.popup.outreach.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class ButtonInfo {

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("title")
    public final String title;

    public ButtonInfo() {
        this(null, null);
    }

    public ButtonInfo(String str, String str2) {
        this.title = str;
        this.schemaUrl = str2;
    }
}
