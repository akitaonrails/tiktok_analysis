package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FrequencyConfiguration_OptTypeAdapter extends TypeAdapter<FrequencyConfiguration> {
    @Override // com.google.gson.TypeAdapter
    public final FrequencyConfiguration read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FrequencyConfiguration frequencyConfiguration = new FrequencyConfiguration(0, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1622952740) {
                    if (iHashCode != 57703760) {
                        if (iHashCode == 1129182153 && strLJJJJ.equals("time_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                frequencyConfiguration.timeLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("duration_limit")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            frequencyConfiguration.durationLimit = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("control_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        frequencyConfiguration.controlType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return frequencyConfiguration;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FrequencyConfiguration frequencyConfiguration) {
        FrequencyConfiguration frequencyConfiguration2 = frequencyConfiguration;
        if (frequencyConfiguration2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("control_type");
        c09dl.LJJJJ(Integer.valueOf(frequencyConfiguration2.controlType));
        c09dl.LJIILLIIL("time_limit");
        c09dl.LJJJJ(Integer.valueOf(frequencyConfiguration2.timeLimit));
        c09dl.LJIILLIIL("duration_limit");
        c09dl.LJJJJ(Integer.valueOf(frequencyConfiguration2.durationLimit));
        c09dl.LJII();
    }
}
