package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubPrivilegeConfigSetting_LiveFansPrivilegeElementConfig_OptTypeAdapter extends TypeAdapter<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> {
    public final Gson LIZ;

    public FansClubPrivilegeConfigSetting_LiveFansPrivilegeElementConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig = new FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig("", "", "", null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1984430296:
                        if (strLJJJJ.equals("icon_file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeElementConfig.iconFileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 738950403:
                        if (strLJJJJ.equals("channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeElementConfig.channel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 951530617:
                        if (strLJJJJ.equals("content")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeElementConfig.content = (FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey) this.LIZ.LJIIJ(FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1066003425:
                        if (strLJJJJ.equals("position_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansPrivilegeElementConfig.positionName = c09cu.LJJJZ();
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
        return liveFansPrivilegeElementConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig) {
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig2 = liveFansPrivilegeElementConfig;
        if (liveFansPrivilegeElementConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("channel");
        c09dl.LJJJJJ(liveFansPrivilegeElementConfig2.channel);
        c09dl.LJIILLIIL("icon_file_name");
        c09dl.LJJJJJ(liveFansPrivilegeElementConfig2.iconFileName);
        c09dl.LJIILLIIL("position_name");
        c09dl.LJJJJJ(liveFansPrivilegeElementConfig2.positionName);
        c09dl.LJIILLIIL("content");
        this.LIZ.LJIIJ(FansClubPrivilegeConfigSetting.LiveFansPrivilegeKey.class).write(c09dl, liveFansPrivilegeElementConfig2.content);
        c09dl.LJII();
    }
}
