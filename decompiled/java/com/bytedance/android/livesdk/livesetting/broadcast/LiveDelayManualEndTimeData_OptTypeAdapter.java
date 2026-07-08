package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveDelayManualEndTimeData_OptTypeAdapter extends TypeAdapter<LiveDelayManualEndTimeData> {
    public final Gson LIZ;

    public LiveDelayManualEndTimeData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveDelayManualEndTimeData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveDelayManualEndTimeData liveDelayManualEndTimeData = new LiveDelayManualEndTimeData(false, 3000L, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1646867447) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 1286543167 && strLJJJJ.equals("block_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDelayManualEndTimeData.blockTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveDelayManualEndTimeData.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("delay_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveDelayManualEndTimeData.delayTime = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveDelayManualEndTimeData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDelayManualEndTimeData liveDelayManualEndTimeData) throws IOException {
        LiveDelayManualEndTimeData liveDelayManualEndTimeData2 = liveDelayManualEndTimeData;
        if (liveDelayManualEndTimeData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveDelayManualEndTimeData2.enable);
        c09dl.LJIILLIIL("block_time");
        c09dl.LJJIZ(liveDelayManualEndTimeData2.blockTime);
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(liveDelayManualEndTimeData2.delayTime);
        c09dl.LJII();
    }
}
