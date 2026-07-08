package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class TriggerScaleProduceParams_OptTypeAdapter extends TypeAdapter<TriggerScaleProduceParams> {
    @Override // com.google.gson.TypeAdapter
    public final TriggerScaleProduceParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TriggerScaleProduceParams triggerScaleProduceParams = new TriggerScaleProduceParams(0, 30, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -974982509) {
                        if (iHashCode == -485160624 && strLJJJJ.equals("algo_package_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerScaleProduceParams.algoPackageName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("delay_execute_time")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            triggerScaleProduceParams.delayExecuteTime = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        triggerScaleProduceParams.enable = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return triggerScaleProduceParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TriggerScaleProduceParams triggerScaleProduceParams) {
        TriggerScaleProduceParams triggerScaleProduceParams2 = triggerScaleProduceParams;
        if (triggerScaleProduceParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(triggerScaleProduceParams2.enable));
        c09dl.LJIILLIIL("delay_execute_time");
        c09dl.LJJJJ(Integer.valueOf(triggerScaleProduceParams2.delayExecuteTime));
        c09dl.LJIILLIIL("algo_package_name");
        c09dl.LJJJJJ(triggerScaleProduceParams2.algoPackageName);
        c09dl.LJII();
    }
}
