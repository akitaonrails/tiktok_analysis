package com.ss.android.ugc.aweme.im.streak.api;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakShareInfo {

    @C09CT("content")
    public final String content;

    @C09CT("h5_url")
    public final String h5Url;

    /* JADX INFO: renamed from: pic, reason: collision with root package name */
    @C09CT("pic")
    public final String f384pic;

    @C09CT("share_url")
    public final String shareUrl;

    public StreakShareInfo() {
        this(null, null, null, null);
    }

    public StreakShareInfo(String str, String str2, String str3, String str4) {
        this.shareUrl = str;
        this.f384pic = str2;
        this.content = str3;
        this.h5Url = str4;
    }
}
