package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class PerfOptData_OptTypeAdapter extends TypeAdapter<PerfOptData> {
    public final Gson LIZ;

    public PerfOptData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PerfOptData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PerfOptData perfOptData = new PerfOptData(0.1d, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1273943326) {
                    if (iHashCode != 143085994) {
                        if (iHashCode == 893255505 && strLJJJJ.equals("fixClearAudioFocusListenerLeak")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                perfOptData.enableFixClearAudioFocusListenerLeak = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("sampleRate")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            perfOptData.sampleRate = c09cu.LJJIL();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enableLowMemStringGCOpt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        perfOptData.enableLowMemStringGCOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return perfOptData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerfOptData perfOptData) throws IOException {
        PerfOptData perfOptData2 = perfOptData;
        if (perfOptData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sampleRate");
        c09dl.LJJIL(perfOptData2.sampleRate);
        c09dl.LJIILLIIL("enableLowMemStringGCOpt");
        c09dl.LJJJJJL(perfOptData2.enableLowMemStringGCOpt);
        c09dl.LJIILLIIL("fixClearAudioFocusListenerLeak");
        c09dl.LJJJJJL(perfOptData2.enableFixClearAudioFocusListenerLeak);
        c09dl.LJII();
    }
}
