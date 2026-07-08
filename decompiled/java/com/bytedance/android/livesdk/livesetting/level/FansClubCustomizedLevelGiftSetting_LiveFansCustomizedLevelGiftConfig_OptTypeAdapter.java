package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizedLevelGiftSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCustomizedLevelGiftSetting_LiveFansCustomizedLevelGiftConfig_OptTypeAdapter extends TypeAdapter<FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig> {
    public final Gson LIZ;

    public FansClubCustomizedLevelGiftSetting_LiveFansCustomizedLevelGiftConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig liveFansCustomizedLevelGiftConfig = new FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig(false, 0, 40, 0, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2100556729:
                        if (strLJJJJ.equals("detection_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizedLevelGiftConfig.detectionTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizedLevelGiftConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1114029114:
                        if (strLJJJJ.equals("bubble_content")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizedLevelGiftConfig.bubbleContent = (FansClubCustomizedLevelGiftSetting.LiveFansBubbleStarlingKey) this.LIZ.LJIIJ(FansClubCustomizedLevelGiftSetting.LiveFansBubbleStarlingKey.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -51335777:
                        if (strLJJJJ.equals("member_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizedLevelGiftConfig.memberLevel = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 29051550:
                        if (strLJJJJ.equals("cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizedLevelGiftConfig.cacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1099567505:
                        if (strLJJJJ.equals("customized_level_gift_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizedLevelGiftConfig.giftId = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveFansCustomizedLevelGiftConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig liveFansCustomizedLevelGiftConfig) throws IOException {
        FansClubCustomizedLevelGiftSetting.LiveFansCustomizedLevelGiftConfig liveFansCustomizedLevelGiftConfig2 = liveFansCustomizedLevelGiftConfig;
        if (liveFansCustomizedLevelGiftConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveFansCustomizedLevelGiftConfig2.enable);
        c09dl.LJIILLIIL("detection_time");
        c09dl.LJJJJ(Integer.valueOf(liveFansCustomizedLevelGiftConfig2.detectionTime));
        c09dl.LJIILLIIL("cache_size");
        c09dl.LJJJJ(Integer.valueOf(liveFansCustomizedLevelGiftConfig2.cacheSize));
        c09dl.LJIILLIIL("customized_level_gift_id");
        c09dl.LJJJJ(Integer.valueOf(liveFansCustomizedLevelGiftConfig2.giftId));
        c09dl.LJIILLIIL("member_level");
        c09dl.LJJJJ(Integer.valueOf(liveFansCustomizedLevelGiftConfig2.memberLevel));
        c09dl.LJIILLIIL("bubble_content");
        this.LIZ.LJIIJ(FansClubCustomizedLevelGiftSetting.LiveFansBubbleStarlingKey.class).write(c09dl, liveFansCustomizedLevelGiftConfig2.bubbleContent);
        c09dl.LJII();
    }
}
