package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelSystemResourceConfig_OptTypeAdapter extends TypeAdapter<LevelSystemResourceConfig> {
    public final Gson LIZ;

    public LevelSystemResourceConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LevelSystemResourceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LevelSystemResourceConfig levelSystemResourceConfig = new LevelSystemResourceConfig(0, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1880544901:
                        if (strLJJJJ.equals("user_level_native_gecko_source_video_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelSystemResourceConfig.levelBarrageResConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageGradeResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1677757599:
                        if (strLJJJJ.equals("gecko_ondemand_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelSystemResourceConfig.geckoOnDemandConfig = (LevelSystemGeckoOnDemandConfig) this.LIZ.LJIIJ(LevelSystemGeckoOnDemandConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1039270423:
                        if (strLJJJJ.equals("fans_gecko_enter_room_res_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelSystemResourceConfig.fansBarrageEnterRoomConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageEnterRoomResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -524799059:
                        if (strLJJJJ.equals("level_gecko_enter_room_res_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelSystemResourceConfig.levelBarrageEnterRoomConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageEnterRoomResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -416978430:
                        if (strLJJJJ.equals("barrage_effect_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelSystemResourceConfig.effectStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -179487146:
                        if (strLJJJJ.equals("fans_club_native_gecko_source_video_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                levelSystemResourceConfig.fansBarrageResConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageGradeResConfig.class);
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
        return levelSystemResourceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LevelSystemResourceConfig levelSystemResourceConfig) {
        LevelSystemResourceConfig levelSystemResourceConfig2 = levelSystemResourceConfig;
        if (levelSystemResourceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("barrage_effect_strategy");
        c09dl.LJJJJ(Integer.valueOf(levelSystemResourceConfig2.effectStrategy));
        c09dl.LJIILLIIL("user_level_native_gecko_source_video_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, levelSystemResourceConfig2.levelBarrageResConfigList, BarrageGradeResConfig.class);
        c09dl.LJIILLIIL("fans_club_native_gecko_source_video_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, levelSystemResourceConfig2.fansBarrageResConfigList, BarrageGradeResConfig.class);
        c09dl.LJIILLIIL("level_gecko_enter_room_res_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, levelSystemResourceConfig2.levelBarrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        c09dl.LJIILLIIL("fans_gecko_enter_room_res_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, levelSystemResourceConfig2.fansBarrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        c09dl.LJIILLIIL("gecko_ondemand_config");
        this.LIZ.LJIIJ(LevelSystemGeckoOnDemandConfig.class).write(c09dl, levelSystemResourceConfig2.geckoOnDemandConfig);
        c09dl.LJII();
    }
}
