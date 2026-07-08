package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestFollowPanelConf_OptTypeAdapter extends TypeAdapter<MultiGuestFollowPanelConf> {
    public final Gson LIZ;

    public MultiGuestFollowPanelConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestFollowPanelConf read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestFollowPanelConf multiGuestFollowPanelConf = new MultiGuestFollowPanelConf(5L, 1L, 5L, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -643517995:
                        if (strLJJJJ.equals("frequency_quota")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFollowPanelConf.frequencyQuota = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -424306841:
                        if (strLJJJJ.equals("enabled_frequency_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFollowPanelConf.enabledFrequencyCheck = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 718702943:
                        if (strLJJJJ.equals("timeout_in_seconds_when_interact")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFollowPanelConf.timeoutInSecondsWhenInteract = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1142894186:
                        if (strLJJJJ.equals("timeout_in_seconds_when_no_touch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestFollowPanelConf.timeoutInSecondsWhenNoTouch = c09cu.LJJJ();
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
        return multiGuestFollowPanelConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestFollowPanelConf multiGuestFollowPanelConf) throws IOException {
        MultiGuestFollowPanelConf multiGuestFollowPanelConf2 = multiGuestFollowPanelConf;
        if (multiGuestFollowPanelConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("timeout_in_seconds_when_interact");
        c09dl.LJJIZ(multiGuestFollowPanelConf2.timeoutInSecondsWhenInteract);
        c09dl.LJIILLIIL("frequency_quota");
        c09dl.LJJIZ(multiGuestFollowPanelConf2.frequencyQuota);
        c09dl.LJIILLIIL("timeout_in_seconds_when_no_touch");
        c09dl.LJJIZ(multiGuestFollowPanelConf2.timeoutInSecondsWhenNoTouch);
        c09dl.LJIILLIIL("enabled_frequency_check");
        c09dl.LJJJJJL(multiGuestFollowPanelConf2.enabledFrequencyCheck);
        c09dl.LJII();
    }
}
