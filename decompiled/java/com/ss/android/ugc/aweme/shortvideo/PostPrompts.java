package com.ss.android.ugc.aweme.shortvideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class PostPrompts implements Serializable {

    @C09CT("title")
    public String dialogTitle;

    @C09CT("go_back")
    public String goBack;

    @C09CT("post_anyway")
    public String postAnyway;

    @C09CT("post_on_trailing")
    public Boolean postOnTrailing;

    @C09CT("text")
    public String text;

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getGoBack() {
        return this.goBack;
    }

    public final String getPostAnyway() {
        return this.postAnyway;
    }

    public final Boolean getPostOnTrailing() {
        return this.postOnTrailing;
    }

    public final String getText() {
        return this.text;
    }

    public final void setDialogTitle(String str) {
        this.dialogTitle = str;
    }

    public final void setGoBack(String str) {
        this.goBack = str;
    }

    public final void setPostAnyway(String str) {
        this.postAnyway = str;
    }

    public final void setPostOnTrailing(Boolean bool) {
        this.postOnTrailing = bool;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
