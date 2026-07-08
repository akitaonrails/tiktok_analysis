package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import X.C457760HxG;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentWithStickerExp {
    public static final CommentStickerConfig LIZ = new CommentStickerConfig(0, 0, 0, 120, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(245));

    public static final boolean LIZ() {
        CommentStickerConfig commentStickerConfig = (CommentStickerConfig) LIZIZ.getValue();
        if (commentStickerConfig == null || commentStickerConfig.stickerClickEnable != 1) {
            return false;
        }
        IMStickerApi.LIZ.getClass();
        return C457760HxG.LIZIZ(true);
    }

    public static final boolean LIZIZ() {
        CommentStickerConfig commentStickerConfig = (CommentStickerConfig) LIZIZ.getValue();
        return commentStickerConfig != null && commentStickerConfig.stickerSendEnable == 1;
    }

    public static final int LIZJ() {
        CommentStickerConfig commentStickerConfig = (CommentStickerConfig) LIZIZ.getValue();
        if (commentStickerConfig != null) {
            return commentStickerConfig.stickerTabPosition;
        }
        return 0;
    }

    public static final class CommentStickerConfig {

        @C09CT("sticker_adapt_max_size")
        public final int stickerAdapterMaxSize;

        @C09CT("sticker_click_enable")
        public final int stickerClickEnable;

        @C09CT("sticker_height")
        public final int stickerHeight;

        @C09CT("sticker_hot_enable")
        public final int stickerHotEnable;

        @C09CT("sticker_send_enable")
        public final int stickerSendEnable;

        @C09CT("sticker_tab_position")
        public final int stickerTabPosition;

        public CommentStickerConfig() {
            this(0, 0, 0, 120, 0, 0);
        }

        public CommentStickerConfig(int i, int i2, int i3, int i4, int i5, int i6) {
            this.stickerSendEnable = i;
            this.stickerTabPosition = i2;
            this.stickerHeight = i3;
            this.stickerAdapterMaxSize = i4;
            this.stickerClickEnable = i5;
            this.stickerHotEnable = i6;
        }
    }
}
