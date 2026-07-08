package com.ss.android.ugc.aweme.comment.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PersonalizedEmojiExperiment {
    public static final CommentEmojiData LIZ = new CommentEmojiData(3, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(31));

    public static boolean LIZ() {
        return ((CommentEmojiData) LIZIZ.getValue()).hideExposeEmoji == 1;
    }

    public static boolean LIZIZ() {
        return ((CommentEmojiData) LIZIZ.getValue()).strategy == 4;
    }

    public static final class CommentEmojiData {

        @C09CT("emoji_leakage_close")
        public final int hideExposeEmoji;

        @C09CT("emoji_leakage_strategy")
        public final int strategy;

        public CommentEmojiData() {
            this(3, 0);
        }

        public CommentEmojiData(int i, int i2) {
            this.strategy = i;
            this.hideExposeEmoji = i2;
        }
    }
}
