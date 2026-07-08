package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelConfig_OptTypeAdapter extends TypeAdapter<UserLevelConfig> {
    public final Gson LIZ;

    public UserLevelConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final UserLevelConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UserLevelConfig userLevelConfig = new UserLevelConfig(null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 512469234:
                        if (strLJJJJ.equals("fe_gecko_upgrade_animation_source_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelConfig.feGeckoAnimationSourceConfigList = C473040Igo.LIZ(this.LIZ, c09cu, FeResourceChannelConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 863087628:
                        if (strLJJJJ.equals("lynx_urls")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelConfig.revenueUserLevelLynxUrls = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1158156625:
                        if (strLJJJJ.equals("user_level_dynamic_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelConfig.userLevelDynamicConfig = (UserLevelDynamicConfig) this.LIZ.LJIIJ(UserLevelDynamicConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1551702171:
                        if (strLJJJJ.equals("live_native_gecko_source_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelConfig.barrageResConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageGradeResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1600753139:
                        if (strLJJJJ.equals("live_native_gecko_enter_room_res_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelConfig.barrageEnterRoomConfigList = C473040Igo.LIZ(this.LIZ, c09cu, BarrageEnterRoomResConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1679178197:
                        if (strLJJJJ.equals("live_native_avatar_source_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelConfig.giftPanelAnimatorConfig = C473040Igo.LIZ(this.LIZ, c09cu, GiftPanelAnimatorConfig.class);
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
        return userLevelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UserLevelConfig userLevelConfig) {
        UserLevelConfig userLevelConfig2 = userLevelConfig;
        if (userLevelConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_native_gecko_source_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, userLevelConfig2.barrageResConfigList, BarrageGradeResConfig.class);
        c09dl.LJIILLIIL("live_native_gecko_enter_room_res_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, userLevelConfig2.barrageEnterRoomConfigList, BarrageEnterRoomResConfig.class);
        c09dl.LJIILLIIL("user_level_dynamic_config");
        this.LIZ.LJIIJ(UserLevelDynamicConfig.class).write(c09dl, userLevelConfig2.userLevelDynamicConfig);
        c09dl.LJIILLIIL("live_native_avatar_source_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, userLevelConfig2.giftPanelAnimatorConfig, GiftPanelAnimatorConfig.class);
        c09dl.LJIILLIIL("fe_gecko_upgrade_animation_source_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, userLevelConfig2.feGeckoAnimationSourceConfigList, FeResourceChannelConfig.class);
        c09dl.LJIILLIIL("lynx_urls");
        C473040Igo.LJ(this.LIZ, c09dl, userLevelConfig2.revenueUserLevelLynxUrls, String.class);
        c09dl.LJII();
    }
}
