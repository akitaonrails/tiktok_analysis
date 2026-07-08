package com.ss.android.ugc.aweme.search.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class VisualSearchVideoPlayModel implements Serializable {
    public final Boolean isPhotoText;
    public final Long itemPlayTime;
    public final Long photoIndex;

    public VisualSearchVideoPlayModel() {
        this(Boolean.FALSE, null, null);
    }

    public final Boolean isPhotoText() {
        return this.isPhotoText;
    }

    public VisualSearchVideoPlayModel(Boolean bool, Long l, Long l2) {
        this.isPhotoText = bool;
        this.itemPlayTime = l;
        this.photoIndex = l2;
    }
}
