package com.ss.android.ugc.aweme.services.external.ui;

import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoMedia implements MediaInfo {
    public Bundle extraBundle;
    public final String filePath;

    public final Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public VideoMedia(String str) {
        this.filePath = str;
    }

    public final void setExtraBundle(Bundle bundle) {
        this.extraBundle = bundle;
    }
}
