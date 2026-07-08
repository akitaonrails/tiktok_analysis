package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class SettingsParams_OptTypeAdapter extends TypeAdapter<SettingsParams> {
    @Override // com.google.gson.TypeAdapter
    public final SettingsParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SettingsParams settingsParams = new SettingsParams(0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1763267380) {
                    if (iHashCode != -1341386445) {
                        if (iHashCode == -892481550 && strLJJJJ.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsParams.status = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("duration_opt_business_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            settingsParams.durationOptBusinessName = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("feature_collect_business_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        settingsParams.featureCollectBusinessName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return settingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SettingsParams settingsParams) {
        SettingsParams settingsParams2 = settingsParams;
        if (settingsParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c09dl.LJJJJ(Integer.valueOf(settingsParams2.status));
        c09dl.LJIILLIIL("feature_collect_business_name");
        c09dl.LJJJJJ(settingsParams2.featureCollectBusinessName);
        c09dl.LJIILLIIL("duration_opt_business_name");
        c09dl.LJJJJJ(settingsParams2.durationOptBusinessName);
        c09dl.LJII();
    }
}
