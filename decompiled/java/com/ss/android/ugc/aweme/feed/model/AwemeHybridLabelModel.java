package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeHybridLabelModel implements Serializable {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("image")
    public UrlModel imageUrl;

    @C09CT("label_type")
    public int labelType;

    @C09CT("ref_url")
    public String refUrl;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public String textColor;

    public AwemeHybridLabelModel() {
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public final void setRefUrl(String str) {
        this.refUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public AwemeHybridLabelModel(String str, String str2, String str3, UrlModel urlModel, String str4, int i) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.imageUrl = urlModel;
        this.refUrl = str4;
        this.labelType = i;
    }
}
