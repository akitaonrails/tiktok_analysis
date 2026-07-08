package com.ss.android.ugc.aweme.comment.quickcomment;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class QuickEmojiExtension {

    @C09CT("android_version")
    public final int androidVersion;

    @C09CT("emoji")
    public final String emoji;

    public QuickEmojiExtension() {
        this(null, Integer.MAX_VALUE);
    }

    public QuickEmojiExtension(String str, int i) {
        this.emoji = str;
        this.androidVersion = i;
    }
}
