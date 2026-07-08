package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHEnableFixedSizeOptSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class TTLHEnableFixedSizeOptSettings_TTLHSetFixedSizeOptConfig_OptTypeAdapter extends TypeAdapter<TTLHEnableFixedSizeOptSettings.TTLHSetFixedSizeOptConfig> {
    @Override // com.google.gson.TypeAdapter
    public final TTLHEnableFixedSizeOptSettings.TTLHSetFixedSizeOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHEnableFixedSizeOptSettings.TTLHSetFixedSizeOptConfig tTLHSetFixedSizeOptConfig = new TTLHEnableFixedSizeOptSettings.TTLHSetFixedSizeOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1869211751) {
                    if (iHashCode != -198563267) {
                        if (iHashCode == -60792115 && strLJJJJ.equals("ignore_similar_wh_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHSetFixedSizeOptConfig.setIgnoreSimilarWHRate(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("rectify_draw_delay_time")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            tTLHSetFixedSizeOptConfig.setDelayTime(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_set_fixed_size_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tTLHSetFixedSizeOptConfig.setEnable(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return tTLHSetFixedSizeOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHEnableFixedSizeOptSettings.TTLHSetFixedSizeOptConfig tTLHSetFixedSizeOptConfig) throws IOException {
        TTLHEnableFixedSizeOptSettings.TTLHSetFixedSizeOptConfig tTLHSetFixedSizeOptConfig2 = tTLHSetFixedSizeOptConfig;
        if (tTLHSetFixedSizeOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_set_fixed_size_opt");
        c09dl.LJJJJ(Integer.valueOf(tTLHSetFixedSizeOptConfig2.getEnable()));
        c09dl.LJIILLIIL("rectify_draw_delay_time");
        c09dl.LJJIZ(tTLHSetFixedSizeOptConfig2.getDelayTime());
        c09dl.LJIILLIIL("ignore_similar_wh_rate");
        c09dl.LJJJJ(Integer.valueOf(tTLHSetFixedSizeOptConfig2.getIgnoreSimilarWHRate()));
        c09dl.LJII();
    }
}
