package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class SlardarTagData_OptTypeAdapter extends TypeAdapter<SlardarTagData> {
    public final Gson LIZ;

    public SlardarTagData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SlardarTagData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SlardarTagData slardarTagData = new SlardarTagData(true, 5, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -1229303081) {
                        if (iHashCode == 278123446 && strLJJJJ.equals("app_log_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                slardarTagData.logCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("message_count")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            slardarTagData.messageCount = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        slardarTagData.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return slardarTagData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SlardarTagData slardarTagData) throws IOException {
        SlardarTagData slardarTagData2 = slardarTagData;
        if (slardarTagData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(slardarTagData2.enable);
        c09dl.LJIILLIIL("message_count");
        c09dl.LJJJJ(Integer.valueOf(slardarTagData2.messageCount));
        c09dl.LJIILLIIL("app_log_count");
        c09dl.LJJJJ(Integer.valueOf(slardarTagData2.logCount));
        c09dl.LJII();
    }
}
