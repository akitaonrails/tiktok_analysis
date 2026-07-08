package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubPrivilegeConfigSetting_LiveFansPrivilegeConfig_OptTypeAdapter extends TypeAdapter<FansClubPrivilegeConfigSetting.LiveFansPrivilegeConfig> {
    public final Gson LIZ;

    public FansClubPrivilegeConfigSetting_LiveFansPrivilegeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubPrivilegeConfigSetting.LiveFansPrivilegeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeConfig liveFansPrivilegeConfig = new FansClubPrivilegeConfigSetting.LiveFansPrivilegeConfig(null, 0, 1, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1770545640:
                        if (strLJJJJ.equals("privilege_gift_elements")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.privilegeGiftElements = C473040Igo.LIZ(this.LIZ, c09cu, FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1422922041:
                        if (strLJJJJ.equals("show_fans_club_privilege_new_icon_pos")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.showNewIconPos = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1200324877:
                        if (strLJJJJ.equals("default_emote_ids")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.defaultStickerIds = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -955676990:
                        if (strLJJJJ.equals("show_fans_club_privilege_gift_new_icon_pos")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.showGiftNewIconPos = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -461670318:
                        if (strLJJJJ.equals("badge_icon_bg_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.badgeIconBgConfig = (FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig) this.LIZ.LJIIJ(FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -403868110:
                        if (strLJJJJ.equals("show_fans_club_privilege_new_icon")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.showNewIcon = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 254580524:
                        if (strLJJJJ.equals("badge_icon_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.badgeIconConfig = (FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig) this.LIZ.LJIIJ(FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1973875397:
                        if (strLJJJJ.equals("privilege_elements")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeConfig.privilegeElements = C473040Igo.LIZ(this.LIZ, c09cu, FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class);
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
        return liveFansPrivilegeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubPrivilegeConfigSetting.LiveFansPrivilegeConfig liveFansPrivilegeConfig) {
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeConfig liveFansPrivilegeConfig2 = liveFansPrivilegeConfig;
        if (liveFansPrivilegeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("show_fans_club_privilege_new_icon");
        c09dl.LJJJ(liveFansPrivilegeConfig2.showNewIcon);
        c09dl.LJIILLIIL("show_fans_club_privilege_new_icon_pos");
        c09dl.LJJJJ(Integer.valueOf(liveFansPrivilegeConfig2.showNewIconPos));
        c09dl.LJIILLIIL("show_fans_club_privilege_gift_new_icon_pos");
        c09dl.LJJJJ(Integer.valueOf(liveFansPrivilegeConfig2.showGiftNewIconPos));
        c09dl.LJIILLIIL("badge_icon_bg_config");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class);
        typeAdapterLJIIJ.write(c09dl, liveFansPrivilegeConfig2.badgeIconBgConfig);
        c09dl.LJIILLIIL("badge_icon_config");
        typeAdapterLJIIJ.write(c09dl, liveFansPrivilegeConfig2.badgeIconConfig);
        c09dl.LJIILLIIL("privilege_elements");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveFansPrivilegeConfig2.privilegeElements, FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class);
        c09dl.LJIILLIIL("privilege_gift_elements");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveFansPrivilegeConfig2.privilegeGiftElements, FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig.class);
        c09dl.LJIILLIIL("default_emote_ids");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveFansPrivilegeConfig2.defaultStickerIds, String.class);
        c09dl.LJII();
    }
}
