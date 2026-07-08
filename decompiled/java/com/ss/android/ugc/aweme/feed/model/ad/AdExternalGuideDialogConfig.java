package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExternalGuideDialogConfig implements Serializable {

    @C09CT("cancel_text")
    public final String cancelText;

    @C09CT("confirm_text")
    public final String confirmText;

    @C09CT("description")
    public final String description;

    @C09CT("title")
    public final String title;

    public AdExternalGuideDialogConfig() {
        this(null, null, null, null);
    }

    public final String getCancelText() {
        return this.cancelText;
    }

    public final String getConfirmText() {
        return this.confirmText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public AdExternalGuideDialogConfig(String str, String str2, String str3, String str4) {
        this.title = str;
        this.description = str2;
        this.confirmText = str3;
        this.cancelText = str4;
    }
}
