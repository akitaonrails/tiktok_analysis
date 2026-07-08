package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubConfig_OptTypeAdapter extends TypeAdapter<FansClubConfig> {
    public final Gson LIZ;

    public FansClubConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubConfig fansClubConfig = new FansClubConfig(null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1808926756:
                        if (strLJJJJ.equals("live_native_entrance_gecko_source_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubConfig.fansEntranceGeckoConfigList = C473040Igo.LIZ(this.LIZ, c09cu, FansEntranceResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -370116418:
                        if (strLJJJJ.equals("gecko_resource_download_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubConfig.geckoResourceDownloadConfig = (GeckoResourceDownloadConfig) this.LIZ.LJIIJ(GeckoResourceDownloadConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -157141268:
                        if (strLJJJJ.equals("fans_club_dynamic_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubConfig.fansClubDynamicConfig = (FansClubDynamicConfig) this.LIZ.LJIIJ(FansClubDynamicConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 411901234:
                        if (strLJJJJ.equals("fans_club_entrance_lottie_resource_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubConfig.fansClubLottieConfig = (FansClubLottieConfig) this.LIZ.LJIIJ(FansClubLottieConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1600753139:
                        if (strLJJJJ.equals("live_native_gecko_enter_room_res_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubConfig.barrageEnterRoomConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageEnterRoomResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1767129276:
                        if (strLJJJJ.equals("live_native_barrage_gecko_source_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubConfig.barrageResConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageGradeResConfig.class);
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
        return fansClubConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubConfig fansClubConfig) {
        FansClubConfig fansClubConfig2 = fansClubConfig;
        if (fansClubConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_native_barrage_gecko_source_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, fansClubConfig2.barrageResConfigList, BarrageGradeResConfig.class);
        c09dl.LJIILLIIL("fans_club_dynamic_config");
        this.LIZ.LJIIJ(FansClubDynamicConfig.class).write(c09dl, fansClubConfig2.fansClubDynamicConfig);
        c09dl.LJIILLIIL("live_native_entrance_gecko_source_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, fansClubConfig2.fansEntranceGeckoConfigList, FansEntranceResConfig.class);
        c09dl.LJIILLIIL("live_native_gecko_enter_room_res_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, fansClubConfig2.barrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        c09dl.LJIILLIIL("gecko_resource_download_config");
        this.LIZ.LJIIJ(GeckoResourceDownloadConfig.class).write(c09dl, fansClubConfig2.geckoResourceDownloadConfig);
        c09dl.LJIILLIIL("fans_club_entrance_lottie_resource_config");
        this.LIZ.LJIIJ(FansClubLottieConfig.class).write(c09dl, fansClubConfig2.fansClubLottieConfig);
        c09dl.LJII();
    }
}
