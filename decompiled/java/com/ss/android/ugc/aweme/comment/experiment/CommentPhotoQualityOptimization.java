package com.ss.android.ugc.aweme.comment.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPhotoQualityOptimization {
    public static final CommentPhotoQualityOptConfig LIZ = new CommentPhotoQualityOptConfig(null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(105));

    public static final class CommentPhotoQualityOptConfig {

        @C09CT("enable_detail_argb8888")
        public final Integer enableDetailArgb8888;

        @C09CT("enable_detail_downsample")
        public final Integer enableDetailDownsample;

        @C09CT("enable_thumbnail_argb8888")
        public final Integer enableThumbnailArgb8888;

        @C09CT("enable_thumbnail_downsample")
        public final Integer enableThumbnailDownsample;

        public CommentPhotoQualityOptConfig() {
            this(null, null, null, null);
        }

        public CommentPhotoQualityOptConfig(Integer num, Integer num2, Integer num3, Integer num4) {
            this.enableThumbnailArgb8888 = num;
            this.enableDetailArgb8888 = num2;
            this.enableThumbnailDownsample = num3;
            this.enableDetailDownsample = num4;
        }
    }
}
