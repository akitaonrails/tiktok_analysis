package com.bytedance.android.livesdk.livesetting.gecko;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class URLConfig_OptTypeAdapter extends TypeAdapter<URLConfig> {
    public final Gson LIZ;

    public URLConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final URLConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        URLConfig uRLConfig = new URLConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2137328510:
                        if (strLJJJJ.equals("m_internal_test")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uRLConfig.internalTestM = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1610953115:
                        if (strLJJJJ.equals("m_online")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uRLConfig.onlineM = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -174400439:
                        if (strLJJJJ.equals("t_internal_test")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uRLConfig.internalTestT = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1998784638:
                        if (strLJJJJ.equals("t_online")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uRLConfig.onlineT = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
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
        return uRLConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, URLConfig uRLConfig) {
        URLConfig uRLConfig2 = uRLConfig;
        if (uRLConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("m_internal_test");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(String[].class);
        typeAdapterLJIIJ.write(c09dl, uRLConfig2.internalTestM);
        c09dl.LJIILLIIL("t_internal_test");
        typeAdapterLJIIJ.write(c09dl, uRLConfig2.internalTestT);
        c09dl.LJIILLIIL("m_online");
        typeAdapterLJIIJ.write(c09dl, uRLConfig2.onlineM);
        c09dl.LJIILLIIL("t_online");
        typeAdapterLJIIJ.write(c09dl, uRLConfig2.onlineT);
        c09dl.LJII();
    }
}
