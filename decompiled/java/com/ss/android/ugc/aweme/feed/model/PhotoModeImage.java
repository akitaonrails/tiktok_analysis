package com.ss.android.ugc.aweme.feed.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeImage {
    public final Float aspectRatio;
    public final int height;
    public final int pos;
    public final UrlModel translatedUrlModel;
    public final UrlModel urlModel;
    public final int width;

    public PhotoModeImage(UrlModel urlModel, int i, int i2, Float f, UrlModel urlModel2, int i3) {
        this.urlModel = urlModel;
        this.width = i;
        this.height = i2;
        this.aspectRatio = f;
        this.translatedUrlModel = urlModel2;
        this.pos = i3;
    }
}
