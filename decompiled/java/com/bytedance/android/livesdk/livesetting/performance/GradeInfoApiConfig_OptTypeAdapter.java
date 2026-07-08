package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class GradeInfoApiConfig_OptTypeAdapter extends TypeAdapter<GradeInfoApiConfig> {
    public final Gson LIZ;

    public GradeInfoApiConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GradeInfoApiConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GradeInfoApiConfig gradeInfoApiConfig = new GradeInfoApiConfig(86400L, 86400L, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1474957592:
                        if (strLJJJJ.equals("enable_fans_club_api_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gradeInfoApiConfig.enableFansClubApiOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 174016372:
                        if (strLJJJJ.equals("fans_club_api_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gradeInfoApiConfig.fansClubApiInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 543145069:
                        if (strLJJJJ.equals("enable_gift_panel_user_level_api_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gradeInfoApiConfig.enableGiftPanelUserLevelApiOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 684881689:
                        if (strLJJJJ.equals("user_level_api_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gradeInfoApiConfig.userLevelApiInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1970254752:
                        if (strLJJJJ.equals("enable_enter_room_user_level_api_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gradeInfoApiConfig.enableEnterRoomUserLevelApiOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return gradeInfoApiConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GradeInfoApiConfig gradeInfoApiConfig) throws IOException {
        GradeInfoApiConfig gradeInfoApiConfig2 = gradeInfoApiConfig;
        if (gradeInfoApiConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("user_level_api_interval");
        c09dl.LJJIZ(gradeInfoApiConfig2.userLevelApiInterval);
        c09dl.LJIILLIIL("fans_club_api_interval");
        c09dl.LJJIZ(gradeInfoApiConfig2.fansClubApiInterval);
        c09dl.LJIILLIIL("enable_enter_room_user_level_api_opt");
        c09dl.LJJJJJL(gradeInfoApiConfig2.enableEnterRoomUserLevelApiOpt);
        c09dl.LJIILLIIL("enable_fans_club_api_opt");
        c09dl.LJJJJJL(gradeInfoApiConfig2.enableFansClubApiOpt);
        c09dl.LJIILLIIL("enable_gift_panel_user_level_api_opt");
        c09dl.LJJJJJL(gradeInfoApiConfig2.enableGiftPanelUserLevelApiOpt);
        c09dl.LJII();
    }
}
