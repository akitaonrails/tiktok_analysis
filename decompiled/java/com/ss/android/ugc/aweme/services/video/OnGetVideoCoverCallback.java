package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface OnGetVideoCoverCallback {
    void onGetVideoCoverFailed(int i);

    void onGetVideoCoverSuccess(Bitmap bitmap);
}
