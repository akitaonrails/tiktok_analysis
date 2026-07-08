package com.ss.android.ugc.aweme.music.model;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes29.dex */
public final class DspImageUrlModel implements Serializable {
    public static final Companion Companion = new Companion();
    public final String uri;
    public final ArrayList<String> urls;

    public final ImageUrlModel getImageUrl() {
        return new ImageUrlModel(this.uri, this.urls);
    }

    public final String getUri() {
        return this.uri;
    }

    public final ArrayList<String> getUrls() {
        return this.urls;
    }

    public static final class Companion {
        public final DspImageUrlModel toDspImageUrlMode(ImageUrlModel imageUrlModel) {
            return new DspImageUrlModel(imageUrlModel, imageUrlModel.getUri(), new ArrayList(imageUrlModel.getUrls()));
        }
    }

    public DspImageUrlModel(ImageUrlModel imageUrlModel, String str, ArrayList<String> arrayList) {
        this.uri = str;
        this.urls = arrayList;
    }
}
