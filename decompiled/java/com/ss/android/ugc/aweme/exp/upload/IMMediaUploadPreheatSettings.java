package com.ss.android.ugc.aweme.exp.upload;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class IMMediaUploadPreheatSettings {
    public static final MediaUploadPreheatConfig LIZ = new MediaUploadPreheatConfig(2, 5);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(391));

    public static final class MediaUploadPreheatConfig {
        public static final int $stable = 0;

        @C09CT("preheat_file_num")
        public final int fileNum;

        @C09CT("preheat_threshold")
        public final int threshold;

        public MediaUploadPreheatConfig() {
            this(2, 5);
        }

        public MediaUploadPreheatConfig(int i, int i2) {
            this.threshold = i;
            this.fileNum = i2;
        }
    }
}
