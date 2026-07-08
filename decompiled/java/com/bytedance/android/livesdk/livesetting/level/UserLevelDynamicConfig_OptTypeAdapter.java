package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelDynamicConfig_OptTypeAdapter extends TypeAdapter<UserLevelDynamicConfig> {
    public final Gson LIZ;

    public UserLevelDynamicConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final UserLevelDynamicConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UserLevelDynamicConfig userLevelDynamicConfig = new UserLevelDynamicConfig(10, false, 7, 9, 4);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1321257702:
                        if (strLJJJJ.equals("fetch_fe_gecko_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelDynamicConfig.fetchFeGeckoDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1054839491:
                        if (strLJJJJ.equals("preload_badge_icon_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelDynamicConfig.preloadBadgeIconDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109988834:
                        if (strLJJJJ.equals("enable_grade_barrage_ninepatch_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelDynamicConfig.enableGradeNinePatchScale = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 437961099:
                        if (strLJJJJ.equals("min_barrage_grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelDynamicConfig.minBarrageGrade = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 861262350:
                        if (strLJJJJ.equals("fetch_client_gecko_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userLevelDynamicConfig.fetchNativeGeckoDelayTime = c09cu.LJJIZ();
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
        return userLevelDynamicConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UserLevelDynamicConfig userLevelDynamicConfig) throws IOException {
        UserLevelDynamicConfig userLevelDynamicConfig2 = userLevelDynamicConfig;
        if (userLevelDynamicConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_barrage_grade");
        c09dl.LJJJJ(Integer.valueOf(userLevelDynamicConfig2.minBarrageGrade));
        c09dl.LJIILLIIL("enable_grade_barrage_ninepatch_scale");
        c09dl.LJJJJJL(userLevelDynamicConfig2.enableGradeNinePatchScale);
        c09dl.LJIILLIIL("fetch_fe_gecko_delay_time");
        c09dl.LJJJJ(Integer.valueOf(userLevelDynamicConfig2.fetchFeGeckoDelayTime));
        c09dl.LJIILLIIL("preload_badge_icon_delay_time");
        c09dl.LJJJJ(Integer.valueOf(userLevelDynamicConfig2.preloadBadgeIconDelayTime));
        c09dl.LJIILLIIL("fetch_client_gecko_delay_time");
        c09dl.LJJJJ(Integer.valueOf(userLevelDynamicConfig2.fetchNativeGeckoDelayTime));
        c09dl.LJII();
    }
}
