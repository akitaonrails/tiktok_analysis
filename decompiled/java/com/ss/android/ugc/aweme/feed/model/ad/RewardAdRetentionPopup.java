package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdRetentionPopup implements Serializable {

    @C09CT("back_button_text")
    public String backButtonText;

    @C09CT("confirm_button_text")
    public String confirmButtonText;

    @C09CT("plural_desc")
    public String pluralDesc;

    @C09CT("singular_desc")
    public String singularDesc;

    @C09CT("title")
    public String title;

    public final String getBackButtonText() {
        return this.backButtonText;
    }

    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    public final String getPluralDesc() {
        return this.pluralDesc;
    }

    public final String getSingularDesc() {
        return this.singularDesc;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackButtonText(String str) {
        this.backButtonText = str;
    }

    public final void setConfirmButtonText(String str) {
        this.confirmButtonText = str;
    }

    public final void setPluralDesc(String str) {
        this.pluralDesc = str;
    }

    public final void setSingularDesc(String str) {
        this.singularDesc = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
