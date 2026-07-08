package com.ss.android.ugc.aweme.comment.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoControlExp {
    public static final PhotoControlConfig LIZ = new PhotoControlConfig(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(104));

    public static final class PhotoControlConfig {

        @C09CT("same_photo_count")
        public final int samePhotoCount;

        @C09CT("time_circle")
        public final int timeCircle;

        public PhotoControlConfig() {
            this(0, 0);
        }

        public PhotoControlConfig(int i, int i2) {
            this.timeCircle = i;
            this.samePhotoCount = i2;
        }
    }
}
