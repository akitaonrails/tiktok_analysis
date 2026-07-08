package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class ImConfig_OptTypeAdapter extends TypeAdapter<ImConfig> {
    public final Gson LIZ;

    public ImConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ImConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ImConfig imConfig = new ImConfig(false, 0, null, false, null, 31, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1429062182:
                        if (strLJJJJ.equals("enable_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                imConfig.enableList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                imConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -70023844:
                        if (strLJJJJ.equals("frequency")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                imConfig.frequency = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 344223864:
                        if (strLJJJJ.equals("im_no_freq_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                imConfig.imNoFreqAllowList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1614338637:
                        if (strLJJJJ.equals("anchor_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                imConfig.anchorSideEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return imConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ImConfig imConfig) throws IOException {
        ImConfig imConfig2 = imConfig;
        if (imConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(imConfig2.enable);
        c09dl.LJIILLIIL("frequency");
        c09dl.LJJJJ(Integer.valueOf(imConfig2.frequency));
        c09dl.LJIILLIIL("enable_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, imConfig2.enableList, String.class);
        c09dl.LJIILLIIL("anchor_enable");
        c09dl.LJJJJJL(imConfig2.anchorSideEnable);
        c09dl.LJIILLIIL("im_no_freq_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, imConfig2.imNoFreqAllowList, String.class);
        c09dl.LJII();
    }
}
