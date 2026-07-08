package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class DATA_OptTypeAdapter extends TypeAdapter<DATA> {
    public final Gson LIZ;

    public DATA_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final DATA read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DATA data = new DATA(false, new ArrayList(), 200);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1647105574) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == -1122334521 && strLJJJJ.equals("default_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                data.defaultDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            data.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("delay_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        data.delayList = C473040Igo.LIZ(this.LIZ, c09cu, DeviceScoreLimit.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return data;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DATA data) throws IOException {
        DATA data2 = data;
        if (data2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(data2.enable);
        c09dl.LJIILLIIL("delay_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, data2.delayList, DeviceScoreLimit.class);
        c09dl.LJIILLIIL("default_delay_time");
        c09dl.LJJJJ(Integer.valueOf(data2.defaultDelayTime));
        c09dl.LJII();
    }
}
