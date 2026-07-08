package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiInfo {

    @C09CT("count")
    public final long count;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("is_reaction")
    public final boolean isReaction;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiInfo(emoji=");
        sbLIZ.append(this.emoji);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", isReaction=");
        sbLIZ.append(this.isReaction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinEmojiInfo() {
        this("", 0L, false);
    }

    public final boolean isReaction() {
        return this.isReaction;
    }

    public BulletinEmojiInfo(String str, long j, boolean z) {
        this.emoji = str;
        this.count = j;
        this.isReaction = z;
    }
}
