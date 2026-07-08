package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class FestRoundConfig_OptTypeAdapter extends TypeAdapter<FestRoundConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FestRoundConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FestRoundConfig festRoundConfig = new FestRoundConfig("", 0L, 0L, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -4716498:
                        if (strLJJJJ.equals("round_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                festRoundConfig.key = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 439152335:
                        if (strLJJJJ.equals("event_end_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                festRoundConfig.endTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1234537196:
                        if (strLJJJJ.equals("resource_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                festRoundConfig.resourceID = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1239066774:
                        if (strLJJJJ.equals("event_start_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                festRoundConfig.startTime = c09cu.LJJJ();
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
        return festRoundConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FestRoundConfig festRoundConfig) throws IOException {
        FestRoundConfig festRoundConfig2 = festRoundConfig;
        if (festRoundConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("round_key");
        c09dl.LJJJJJ(festRoundConfig2.key);
        c09dl.LJIILLIIL("event_start_time_ms");
        c09dl.LJJIZ(festRoundConfig2.startTime);
        c09dl.LJIILLIIL("event_end_time_ms");
        c09dl.LJJIZ(festRoundConfig2.endTime);
        c09dl.LJIILLIIL("resource_id");
        c09dl.LJJJJJ(festRoundConfig2.resourceID);
        c09dl.LJII();
    }
}
