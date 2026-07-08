package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentWithStickerPreloadConfig {
    public static final CommentStickerPreloadConfig LIZ = new CommentStickerPreloadConfig(1, 1000, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(46));

    public static final class CommentStickerPreloadConfig {

        @C09CT("preload_sticker_delay_time")
        public final long delayTime;

        @C09CT("enable_boot_preload_sticker")
        public final int enableBootPreloadSticker;

        @C09CT("enable_sticker_preload")
        public final int enableStickerPreload;

        public CommentStickerPreloadConfig() {
            this(1, 1000L, 1);
        }

        public CommentStickerPreloadConfig(int i, long j, int i2) {
            this.enableStickerPreload = i;
            this.delayTime = j;
            this.enableBootPreloadSticker = i2;
        }
    }
}
