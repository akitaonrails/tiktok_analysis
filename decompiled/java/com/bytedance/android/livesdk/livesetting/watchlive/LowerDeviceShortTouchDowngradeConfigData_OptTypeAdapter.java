package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LowerDeviceShortTouchDowngradeConfigData_OptTypeAdapter extends TypeAdapter<LowerDeviceShortTouchDowngradeConfigData> {
    public final Gson LIZ;

    public LowerDeviceShortTouchDowngradeConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LowerDeviceShortTouchDowngradeConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LowerDeviceShortTouchDowngradeConfigData lowerDeviceShortTouchDowngradeConfigData = new LowerDeviceShortTouchDowngradeConfigData(false, true, 0L, false, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 251202666:
                        if (strLJJJJ.equals("start_delay_when_interaction_ready")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceShortTouchDowngradeConfigData.startDelayWhenInteractionReady = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 783006160:
                        if (strLJJJJ.equals("global_switch_for_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceShortTouchDowngradeConfigData.globalSwitchForDowngrade = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 893349648:
                        if (strLJJJJ.equals("delay_time_for_short_touch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceShortTouchDowngradeConfigData.delayTimeForShortTouch = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1051202036:
                        if (strLJJJJ.equals("disable_animation_for_short_touch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceShortTouchDowngradeConfigData.disableAnimationForShortTouch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1433058586:
                        if (strLJJJJ.equals("sub_switch_for_short_touch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                lowerDeviceShortTouchDowngradeConfigData.subSwitchForShortTouch = c09cu.LJJIZ();
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
        return lowerDeviceShortTouchDowngradeConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LowerDeviceShortTouchDowngradeConfigData lowerDeviceShortTouchDowngradeConfigData) throws IOException {
        LowerDeviceShortTouchDowngradeConfigData lowerDeviceShortTouchDowngradeConfigData2 = lowerDeviceShortTouchDowngradeConfigData;
        if (lowerDeviceShortTouchDowngradeConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("global_switch_for_downgrade");
        c09dl.LJJJJJL(lowerDeviceShortTouchDowngradeConfigData2.globalSwitchForDowngrade);
        c09dl.LJIILLIIL("start_delay_when_interaction_ready");
        c09dl.LJJJJJL(lowerDeviceShortTouchDowngradeConfigData2.startDelayWhenInteractionReady);
        c09dl.LJIILLIIL("delay_time_for_short_touch");
        c09dl.LJJIZ(lowerDeviceShortTouchDowngradeConfigData2.delayTimeForShortTouch);
        c09dl.LJIILLIIL("disable_animation_for_short_touch");
        c09dl.LJJJJJL(lowerDeviceShortTouchDowngradeConfigData2.disableAnimationForShortTouch);
        c09dl.LJIILLIIL("sub_switch_for_short_touch");
        c09dl.LJJJJ(Integer.valueOf(lowerDeviceShortTouchDowngradeConfigData2.subSwitchForShortTouch));
        c09dl.LJII();
    }
}
