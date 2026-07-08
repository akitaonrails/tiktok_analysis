package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestLiveShowOptimizeSetting_OptTypeAdapter extends TypeAdapter<MultiGuestLiveShowOptimizeSetting> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestLiveShowOptimizeSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestLiveShowOptimizeSetting multiGuestLiveShowOptimizeSetting = new MultiGuestLiveShowOptimizeSetting(1, 1, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 244661852) {
                    if (iHashCode != 1042507399) {
                        if (iHashCode == 1854313357 && strLJJJJ.equals("guest_show_preview")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestLiveShowOptimizeSetting.guestShowPreview = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("anchor_enable_transition")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiGuestLiveShowOptimizeSetting.anchorEnableTransition = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("countdown_label_animated")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestLiveShowOptimizeSetting.countdownLabelAnimated = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiGuestLiveShowOptimizeSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestLiveShowOptimizeSetting multiGuestLiveShowOptimizeSetting) {
        MultiGuestLiveShowOptimizeSetting multiGuestLiveShowOptimizeSetting2 = multiGuestLiveShowOptimizeSetting;
        if (multiGuestLiveShowOptimizeSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anchor_enable_transition");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowOptimizeSetting2.anchorEnableTransition));
        c09dl.LJIILLIIL("guest_show_preview");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowOptimizeSetting2.guestShowPreview));
        c09dl.LJIILLIIL("countdown_label_animated");
        c09dl.LJJJJ(Integer.valueOf(multiGuestLiveShowOptimizeSetting2.countdownLabelAnimated));
        c09dl.LJII();
    }
}
