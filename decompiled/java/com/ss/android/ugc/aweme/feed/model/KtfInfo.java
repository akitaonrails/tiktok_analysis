package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class KtfInfo implements Serializable {

    @C09CT("caution_label")
    public final String cautionLabel;
    public boolean hasShowOnce;

    @C09CT("label_category")
    public final Integer labelCategory;

    @C09CT("label_desc")
    public final String labelDesc;

    @C09CT("label_title")
    public final String labelTitle;

    @C09CT("link_on_share")
    public final KtfLinkOnShare linkOnShare;

    @C09CT("message_text_on_share")
    public final String messageTextOnShare;

    @C09CT("show_message_on_share")
    public final boolean showMessageOnShare;

    @C09CT("show_warning")
    public final boolean showWarning;

    @C09CT("title_text_on_share")
    public final String titleTextOnShare;

    @C09CT("warning_text")
    public final String warningText;

    public final void resetState() {
        this.hasShowOnce = false;
    }

    public final void setHasShowOnce(boolean z) {
        this.hasShowOnce = z;
    }

    public KtfInfo(boolean z, String str, String str2, boolean z2, String str3, String str4, KtfLinkOnShare ktfLinkOnShare, Integer num, String str5, String str6, boolean z3) {
        this.showWarning = z;
        this.cautionLabel = str;
        this.warningText = str2;
        this.showMessageOnShare = z2;
        this.messageTextOnShare = str3;
        this.titleTextOnShare = str4;
        this.linkOnShare = ktfLinkOnShare;
        this.labelCategory = num;
        this.labelTitle = str5;
        this.labelDesc = str6;
        this.hasShowOnce = z3;
    }
}
