package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AutofillWindowModel implements Serializable {

    @C09CT("title")
    public final String title = "";

    @C09CT("header")
    public final String header = "";

    @C09CT("confirm")
    public final String confirm = "";

    @C09CT("deny")
    public final String deny = "";

    @C09CT("edit")
    public final String edit = "";

    public final String getConfirm() {
        return this.confirm;
    }

    public final String getDeny() {
        return this.deny;
    }

    public final String getEdit() {
        return this.edit;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getTitle() {
        return this.title;
    }
}
