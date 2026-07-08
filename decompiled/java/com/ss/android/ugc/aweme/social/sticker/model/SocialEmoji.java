package com.ss.android.ugc.aweme.social.sticker.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SocialEmoji {
    public static final int $stable = 0;
    public final String and;
    public final String emoji;
    public final String ios;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialEmoji)) {
            return false;
        }
        SocialEmoji socialEmoji = (SocialEmoji) obj;
        return Intrinsics.LJFF(this.and, socialEmoji.and) && Intrinsics.LJFF(this.ios, socialEmoji.ios) && Intrinsics.LJFF(this.emoji, socialEmoji.emoji);
    }

    public SocialEmoji(String str, String str2, String str3) {
        this.and = str;
        this.ios = str2;
        this.emoji = str3;
    }
}
