package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LowerDeviceMidTouchDowngradeConfigData_OptTypeAdapter extends TypeAdapter<LowerDeviceMidTouchDowngradeConfigData> {
    public final Gson LIZ;

    public LowerDeviceMidTouchDowngradeConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LowerDeviceMidTouchDowngradeConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LowerDeviceMidTouchDowngradeConfigData lowerDeviceMidTouchDowngradeConfigData = new LowerDeviceMidTouchDowngradeConfigData(false, true, 0L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -514532369:
                        if (strLJJJJ.equals("disable_animation_for_preview_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceMidTouchDowngradeConfigData.disableAnimationForPreviewCard = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -461681444:
                        if (strLJJJJ.equals("delay_time_for_mid_touch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceMidTouchDowngradeConfigData.delayTimeForMidTouch = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 251202666:
                        if (strLJJJJ.equals("start_delay_when_interaction_ready")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceMidTouchDowngradeConfigData.startDelayWhenInteractionReady = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 783006160:
                        if (strLJJJJ.equals("global_switch_for_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceMidTouchDowngradeConfigData.globalSwitchForDowngrade = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return lowerDeviceMidTouchDowngradeConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LowerDeviceMidTouchDowngradeConfigData lowerDeviceMidTouchDowngradeConfigData) throws IOException {
        LowerDeviceMidTouchDowngradeConfigData lowerDeviceMidTouchDowngradeConfigData2 = lowerDeviceMidTouchDowngradeConfigData;
        if (lowerDeviceMidTouchDowngradeConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("global_switch_for_downgrade");
        c09dl.LJJJJJL(lowerDeviceMidTouchDowngradeConfigData2.globalSwitchForDowngrade);
        c09dl.LJIILLIIL("start_delay_when_interaction_ready");
        c09dl.LJJJJJL(lowerDeviceMidTouchDowngradeConfigData2.startDelayWhenInteractionReady);
        c09dl.LJIILLIIL("delay_time_for_mid_touch");
        c09dl.LJJIZ(lowerDeviceMidTouchDowngradeConfigData2.delayTimeForMidTouch);
        c09dl.LJIILLIIL("disable_animation_for_preview_card");
        c09dl.LJJJJJL(lowerDeviceMidTouchDowngradeConfigData2.disableAnimationForPreviewCard);
        c09dl.LJII();
    }
}
