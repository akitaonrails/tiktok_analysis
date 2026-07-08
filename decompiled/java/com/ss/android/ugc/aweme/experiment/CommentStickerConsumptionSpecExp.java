package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentStickerConsumptionSpecExp {
    public static final CommentStickerConsumptionConfig LIZ = new CommentStickerConsumptionConfig(0, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(241));

    public static final boolean LIZ() {
        CommentStickerConsumptionConfig commentStickerConsumptionConfig = (CommentStickerConsumptionConfig) LIZIZ.getValue();
        return commentStickerConsumptionConfig != null && commentStickerConsumptionConfig.stickerPanelOpt > 0;
    }

    public static final boolean LIZIZ() {
        CommentStickerConsumptionConfig commentStickerConsumptionConfig = (CommentStickerConsumptionConfig) LIZIZ.getValue();
        return commentStickerConsumptionConfig != null && commentStickerConsumptionConfig.stickerQuickSave > 0;
    }

    public static final boolean LIZJ() {
        CommentStickerConsumptionConfig commentStickerConsumptionConfig = (CommentStickerConsumptionConfig) LIZIZ.getValue();
        return commentStickerConsumptionConfig != null && commentStickerConsumptionConfig.stickerStyleDiff > 0;
    }

    public static final int LIZLLL() {
        CommentStickerConsumptionConfig commentStickerConsumptionConfig = (CommentStickerConsumptionConfig) LIZIZ.getValue();
        if (commentStickerConsumptionConfig != null) {
            return commentStickerConsumptionConfig.stickerSizeOpt;
        }
        return 0;
    }

    public static final class CommentStickerConsumptionConfig {

        @C09CT("sticker_panel_opt")
        public final int stickerPanelOpt;

        @C09CT("sticker_quick_save")
        public final int stickerQuickSave;

        @C09CT("sticker_size_opt")
        public final int stickerSizeOpt;

        @C09CT("sticker_style_diff")
        public final int stickerStyleDiff;

        public CommentStickerConsumptionConfig() {
            this(0, 0, 0, 0);
        }

        public CommentStickerConsumptionConfig(int i, int i2, int i3, int i4) {
            this.stickerPanelOpt = i;
            this.stickerQuickSave = i2;
            this.stickerStyleDiff = i3;
            this.stickerSizeOpt = i4;
        }
    }
}
