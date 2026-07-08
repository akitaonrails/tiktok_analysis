package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCommonFallbackSetting {
    public static final FallbackConfig LIZ = new FallbackConfig(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(240));

    public static final class FallbackConfig {

        @C09CT("comment_duration_fallback")
        public final boolean commentDurationFallback;

        public FallbackConfig() {
            this(false);
        }

        public FallbackConfig(boolean z) {
            this.commentDurationFallback = z;
        }
    }
}
