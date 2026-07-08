package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerAnimArrowWidthSettings;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankStickerAnimArrowWidthSettings_RankStickerExtraWidthConfig_OptTypeAdapter extends TypeAdapter<LiveRankStickerAnimArrowWidthSettings.RankStickerExtraWidthConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveRankStickerAnimArrowWidthSettings.RankStickerExtraWidthConfig read(C09CU c09cu) {
        LiveRankStickerAnimArrowWidthSettings.RankStickerExtraWidthConfig rankStickerExtraWidthConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rankStickerExtraWidthConfig = new LiveRankStickerAnimArrowWidthSettings.RankStickerExtraWidthConfig(0, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "daily_width")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankStickerExtraWidthConfig.dailyWidth = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "hourly_width")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankStickerExtraWidthConfig.hourlyWidth = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rankStickerExtraWidthConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankStickerAnimArrowWidthSettings.RankStickerExtraWidthConfig rankStickerExtraWidthConfig) {
        LiveRankStickerAnimArrowWidthSettings.RankStickerExtraWidthConfig rankStickerExtraWidthConfig2 = rankStickerExtraWidthConfig;
        if (rankStickerExtraWidthConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("daily_width");
        c09dl.LJJJJ(Integer.valueOf(rankStickerExtraWidthConfig2.dailyWidth));
        c09dl.LJIILLIIL("hourly_width");
        c09dl.LJJJJ(Integer.valueOf(rankStickerExtraWidthConfig2.hourlyWidth));
        c09dl.LJII();
    }
}
