package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.clientai.CohostFriendReminderSettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class CohostFriendReminderSettings_CohostFriendReminderParams_OptTypeAdapter extends TypeAdapter<CohostFriendReminderSettings.CohostFriendReminderParams> {
    @Override // com.google.gson.TypeAdapter
    public final CohostFriendReminderSettings.CohostFriendReminderParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostFriendReminderSettings.CohostFriendReminderParams cohostFriendReminderParams = new CohostFriendReminderSettings.CohostFriendReminderParams(0, "live_interact_cohost_friend_notice_trigger_v3", "live_cohost_friend_notice_optimize_strategy");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -485160624) {
                        if (iHashCode == 2104871393 && strLJJJJ.equals("model_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                cohostFriendReminderParams.modelName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("algo_package_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            cohostFriendReminderParams.algoPkgName = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        cohostFriendReminderParams.enable = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return cohostFriendReminderParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostFriendReminderSettings.CohostFriendReminderParams cohostFriendReminderParams) {
        CohostFriendReminderSettings.CohostFriendReminderParams cohostFriendReminderParams2 = cohostFriendReminderParams;
        if (cohostFriendReminderParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(cohostFriendReminderParams2.enable));
        c09dl.LJIILLIIL("model_name");
        c09dl.LJJJJJ(cohostFriendReminderParams2.modelName);
        c09dl.LJIILLIIL("algo_package_name");
        c09dl.LJJJJJ(cohostFriendReminderParams2.algoPkgName);
        c09dl.LJII();
    }
}
