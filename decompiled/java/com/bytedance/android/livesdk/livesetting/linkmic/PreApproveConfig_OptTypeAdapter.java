package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class PreApproveConfig_OptTypeAdapter extends TypeAdapter<PreApproveConfig> {
    public final Gson LIZ;

    public PreApproveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreApproveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreApproveConfig preApproveConfig = new PreApproveConfig(true, 5, 5, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1797313280:
                        if (strLJJJJ.equals("max_pre_approve_cnt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preApproveConfig.maxPreApproveCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preApproveConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 192929708:
                        if (strLJJJJ.equals("audience_bubble_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preApproveConfig.audienceBubbleDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1190866806:
                        if (strLJJJJ.equals("anchor_toast_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preApproveConfig.anchorToastDuration = c09cu.LJJIZ();
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
        return preApproveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreApproveConfig preApproveConfig) throws IOException {
        PreApproveConfig preApproveConfig2 = preApproveConfig;
        if (preApproveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(preApproveConfig2.enable);
        c09dl.LJIILLIIL("anchor_toast_duration");
        c09dl.LJJJJ(Integer.valueOf(preApproveConfig2.anchorToastDuration));
        c09dl.LJIILLIIL("audience_bubble_duration");
        c09dl.LJJJJ(Integer.valueOf(preApproveConfig2.audienceBubbleDuration));
        c09dl.LJIILLIIL("max_pre_approve_cnt");
        c09dl.LJJJJ(Integer.valueOf(preApproveConfig2.maxPreApproveCount));
        c09dl.LJII();
    }
}
