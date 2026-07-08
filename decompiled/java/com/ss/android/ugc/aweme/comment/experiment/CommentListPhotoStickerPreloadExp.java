package com.ss.android.ugc.aweme.comment.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentListPhotoStickerPreloadExp {
    public static final CommentPreloadConfig LIZ = new CommentPreloadConfig(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(103));

    public static final class CommentPreloadConfig {

        @C09CT("avatar_preload_count")
        public final int avatarPreloadCount;

        @C09CT("photo_preload_count")
        public final int photoPreloadCount;

        public CommentPreloadConfig() {
            this(0, 0);
        }

        public CommentPreloadConfig(int i, int i2) {
            this.photoPreloadCount = i;
            this.avatarPreloadCount = i2;
        }
    }
}
