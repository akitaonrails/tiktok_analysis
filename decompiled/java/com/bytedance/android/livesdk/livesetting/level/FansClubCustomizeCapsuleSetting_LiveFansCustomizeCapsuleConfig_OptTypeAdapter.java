package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C538540LAe;
import com.bytedance.android.livesdk.livesetting.level.FansClubCustomizeCapsuleSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCustomizeCapsuleSetting_LiveFansCustomizeCapsuleConfig_OptTypeAdapter extends TypeAdapter<FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig> {
    public final Gson LIZ;

    public FansClubCustomizeCapsuleSetting_LiveFansCustomizeCapsuleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig liveFansCustomizeCapsuleConfig = new FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig(C538540LAe.LLJJJIL, 3, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2122026519:
                        if (strLJJJJ.equals("show_max_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizeCapsuleConfig.showMaxTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2100580249:
                        if (strLJJJJ.equals("capsule_content")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizeCapsuleConfig.content = (FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey) this.LIZ.LJIIJ(FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2100556729:
                        if (strLJJJJ.equals("detection_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizeCapsuleConfig.detectionTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1986372856:
                        if (strLJJJJ.equals("capsule_button_text")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFansCustomizeCapsuleConfig.buttonText = (FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey) this.LIZ.LJIIJ(FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey.class).read(c09cu);
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
        return liveFansCustomizeCapsuleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig liveFansCustomizeCapsuleConfig) {
        FansClubCustomizeCapsuleSetting.LiveFansCustomizeCapsuleConfig liveFansCustomizeCapsuleConfig2 = liveFansCustomizeCapsuleConfig;
        if (liveFansCustomizeCapsuleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("detection_time");
        c09dl.LJJJJ(Integer.valueOf(liveFansCustomizeCapsuleConfig2.detectionTime));
        c09dl.LJIILLIIL("show_max_times");
        c09dl.LJJJJ(Integer.valueOf(liveFansCustomizeCapsuleConfig2.showMaxTimes));
        c09dl.LJIILLIIL("capsule_content");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(FansClubCustomizeCapsuleSetting.LiveFansCapsuleStarlingKey.class);
        typeAdapterLJIIJ.write(c09dl, liveFansCustomizeCapsuleConfig2.content);
        c09dl.LJIILLIIL("capsule_button_text");
        typeAdapterLJIIJ.write(c09dl, liveFansCustomizeCapsuleConfig2.buttonText);
        c09dl.LJII();
    }
}
