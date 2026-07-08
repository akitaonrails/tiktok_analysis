package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.level.FansClubUpgradeMemberLevelSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubUpgradeMemberLevelSetting_LiveFansUpgradeMemberLevelGiftsConfig_OptTypeAdapter extends TypeAdapter<FansClubUpgradeMemberLevelSetting.LiveFansUpgradeMemberLevelGiftsConfig> {
    public final Gson LIZ;

    public FansClubUpgradeMemberLevelSetting_LiveFansUpgradeMemberLevelGiftsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubUpgradeMemberLevelSetting.LiveFansUpgradeMemberLevelGiftsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubUpgradeMemberLevelSetting.LiveFansUpgradeMemberLevelGiftsConfig liveFansUpgradeMemberLevelGiftsConfig = new FansClubUpgradeMemberLevelSetting.LiveFansUpgradeMemberLevelGiftsConfig(false, null, 40, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2100556729:
                        if (strLJJJJ.equals("detection_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansUpgradeMemberLevelGiftsConfig.detectionTime = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansUpgradeMemberLevelGiftsConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1114029114:
                        if (strLJJJJ.equals("bubble_content")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansUpgradeMemberLevelGiftsConfig.bubbleContent = (FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey) this.LIZ.LJIIJ(FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 29051550:
                        if (strLJJJJ.equals("cache_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansUpgradeMemberLevelGiftsConfig.cacheSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 649057159:
                        if (strLJJJJ.equals("level_id_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansUpgradeMemberLevelGiftsConfig.giftIdList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
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
        return liveFansUpgradeMemberLevelGiftsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubUpgradeMemberLevelSetting.LiveFansUpgradeMemberLevelGiftsConfig liveFansUpgradeMemberLevelGiftsConfig) throws IOException {
        FansClubUpgradeMemberLevelSetting.LiveFansUpgradeMemberLevelGiftsConfig liveFansUpgradeMemberLevelGiftsConfig2 = liveFansUpgradeMemberLevelGiftsConfig;
        if (liveFansUpgradeMemberLevelGiftsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveFansUpgradeMemberLevelGiftsConfig2.enable);
        c09dl.LJIILLIIL("detection_time");
        c09dl.LJJJJ(liveFansUpgradeMemberLevelGiftsConfig2.detectionTime);
        c09dl.LJIILLIIL("cache_size");
        c09dl.LJJJJ(Integer.valueOf(liveFansUpgradeMemberLevelGiftsConfig2.cacheSize));
        c09dl.LJIILLIIL("level_id_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveFansUpgradeMemberLevelGiftsConfig2.giftIdList, Integer.TYPE);
        c09dl.LJIILLIIL("bubble_content");
        this.LIZ.LJIIJ(FansClubUpgradeMemberLevelSetting.LiveFansBubbleStarlingKey.class).write(c09dl, liveFansUpgradeMemberLevelGiftsConfig2.bubbleContent);
        c09dl.LJII();
    }
}
