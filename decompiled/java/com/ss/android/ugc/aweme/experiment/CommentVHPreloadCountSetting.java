package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentVHPreloadCountSetting {
    public static final PreloadConfig LIZ = new PreloadConfig(5, 1, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(244));

    public static final class PreloadConfig {

        @C09CT("first_level_comment_preload_count")
        public final int firstLevelCommentPreloadCount;

        @C09CT("reply_button_preload_count")
        public final int replyButtonPreloadCount;

        @C09CT("second_level_comment_preload_count")
        public final int secondLevelCommentPreloadCount;

        public PreloadConfig() {
            this(5, 1, 1);
        }

        public PreloadConfig(int i, int i2, int i3) {
            this.firstLevelCommentPreloadCount = i;
            this.secondLevelCommentPreloadCount = i2;
            this.replyButtonPreloadCount = i3;
        }
    }
}
