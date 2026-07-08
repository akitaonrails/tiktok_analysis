package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeImageKt {
    public static final boolean isSizeInfoValid(PhotoModeImage photoModeImage) {
        Float f;
        if (photoModeImage.width > 0 && photoModeImage.height > 0 && (f = photoModeImage.aspectRatio) != null && f.floatValue() > 0.0f) {
            return true;
        }
        return false;
    }
}
