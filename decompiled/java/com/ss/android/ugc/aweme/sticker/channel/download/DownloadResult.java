package com.ss.android.ugc.aweme.sticker.channel.download;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class DownloadResult {

    @C09CT("path")
    public String path;

    @C09CT("success")
    public int success;

    public DownloadResult(String str, int i) {
        this.path = str;
        this.success = i;
    }
}
