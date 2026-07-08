package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentTimeSortFeatExp {
    public static final Config LIZ = new Config(false, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(242));

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.comment.model.CommentCommonModel r9) {
        /*
            X.01GW r1 = com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZIZ
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp$Config r0 = (com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.Config) r0
            boolean r0 = r0.enable
            r8 = 0
            if (r0 == 0) goto L54
            java.lang.Object r0 = r1.getValue()
            com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp$Config r0 = (com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.Config) r0
            int r1 = r0.style
            r0 = 2
            if (r1 != r0) goto L54
            if (r9 == 0) goto L57
            boolean r7 = r9.isLandscapeMode()
            boolean r6 = r9.isFriendsSimpleDetail()
            boolean r5 = r9.blockSortFeatInFriendsV3
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.aweme
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            if (r0 == 0) goto L55
            long r3 = r0.getCommentCount()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L55
            X.0l0z r0 = X.C1341550l0z.LIZ
            r0.getClass()
            X.01GW r0 = X.C1341550l0z.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L55
            r0 = 1
        L4c:
            if (r7 != 0) goto L54
            if (r6 != 0) goto L54
            if (r5 != 0) goto L54
            if (r0 == 0) goto L57
        L54:
            return r8
        L55:
            r0 = 0
            goto L4c
        L57:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.CommentTimeSortFeatExp.LIZ(com.ss.android.ugc.aweme.comment.model.CommentCommonModel):boolean");
    }

    public static final class Config {

        @C09CT("feature_enable")
        public final boolean enable;

        @C09CT("entrance_style")
        public final int style;

        public Config() {
            this(false, 1);
        }

        public Config(boolean z, int i) {
            this.enable = z;
            this.style = i;
        }
    }
}
