package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class TriggerConfiguration_OptTypeAdapter extends TypeAdapter<TriggerConfiguration> {
    @Override // com.google.gson.TypeAdapter
    public final TriggerConfiguration read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TriggerConfiguration triggerConfiguration = new TriggerConfiguration(0, 0.0d, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1526936474) {
                    if (iHashCode != 95467907) {
                        if (iHashCode == 375833953 && strLJJJJ.equals("trigger_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerConfiguration.triggerType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            triggerConfiguration.delay = c09cu.LJJIL();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("play_immediate")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        triggerConfiguration.playImmediate = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return triggerConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TriggerConfiguration triggerConfiguration) throws IOException {
        TriggerConfiguration triggerConfiguration2 = triggerConfiguration;
        if (triggerConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("trigger_type");
        c09dl.LJJJJ(Integer.valueOf(triggerConfiguration2.triggerType));
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIL(triggerConfiguration2.delay);
        c09dl.LJIILLIIL("play_immediate");
        c09dl.LJJJJ(Integer.valueOf(triggerConfiguration2.playImmediate));
        c09dl.LJII();
    }
}
