package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentPersonalizedEmoji implements Serializable {

    @C09CT("emoji")
    public String emoji;

    @C09CT("score")
    public Integer score;
    public String source;
    public String strategy;

    public CommentPersonalizedEmoji() {
    }

    public final CommentPersonalizedEmoji copy(String str, Integer num, String str2, String str3) {
        return new CommentPersonalizedEmoji(str, num, str2, str3);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPersonalizedEmoji {emoji: ");
        sbLIZ.append(this.emoji);
        sbLIZ.append(", score: ");
        sbLIZ.append(this.score);
        sbLIZ.append(", strategy: ");
        sbLIZ.append(this.strategy);
        sbLIZ.append(", source: ");
        sbLIZ.append(this.source);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentPersonalizedEmoji(String str, Integer num, String str2, String str3) {
        this.emoji = str;
        this.score = num;
        this.strategy = str2;
        this.source = str3;
    }
}
