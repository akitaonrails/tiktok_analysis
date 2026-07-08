package com.ss.android.ugc.aweme.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBanner implements Serializable {

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("is_clickable")
    public Boolean isClickable;

    @C09CT("text")
    public String text;

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final Boolean isClickable() {
        return this.isClickable;
    }

    public final void setClickable(Boolean bool) {
        this.isClickable = bool;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
