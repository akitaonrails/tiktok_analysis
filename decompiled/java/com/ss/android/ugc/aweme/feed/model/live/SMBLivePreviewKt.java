package com.ss.android.ugc.aweme.feed.model.live;

/* JADX INFO: loaded from: classes34.dex */
public final class SMBLivePreviewKt {
    public static final int convertPreviewType2SmbMsgType(int i) {
        if (i > 1) {
            return 1;
        }
        return i;
    }

    public static final boolean isServiceSkuType(int i) {
        return i > 0;
    }
}
