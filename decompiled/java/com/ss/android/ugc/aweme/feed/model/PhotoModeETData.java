package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeETData {
    public final int currentPhotoIndex;

    public PhotoModeETData() {
        this(-1);
    }

    public final PhotoModeETData copy(int i) {
        return new PhotoModeETData(i);
    }

    public PhotoModeETData(int i) {
        this.currentPhotoIndex = i;
    }
}
