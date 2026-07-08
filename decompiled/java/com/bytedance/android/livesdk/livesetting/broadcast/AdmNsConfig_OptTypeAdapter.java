package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class AdmNsConfig_OptTypeAdapter extends TypeAdapter<AdmNsConfig> {
    public final Gson LIZ;

    public AdmNsConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final AdmNsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AdmNsConfig admNsConfig = new AdmNsConfig(0, false, "", false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1165276806:
                        if (strLJJJJ.equals("enable_sami_enginecommon_debug")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                admNsConfig.enableDebug = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -537394595:
                        if (strLJJJJ.equals("live_adm_ns_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                admNsConfig.nsUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 469043488:
                        if (strLJJJJ.equals("enable_ns_on_headset")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                admNsConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 520613900:
                        if (strLJJJJ.equals("live_adm_ns_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                admNsConfig.nsType = c09cu.LJJIZ();
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
        return admNsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AdmNsConfig admNsConfig) throws IOException {
        AdmNsConfig admNsConfig2 = admNsConfig;
        if (admNsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_adm_ns_type");
        c09dl.LJJJJ(Integer.valueOf(admNsConfig2.nsType));
        c09dl.LJIILLIIL("enable_ns_on_headset");
        c09dl.LJJJJJL(admNsConfig2.enable);
        c09dl.LJIILLIIL("live_adm_ns_url");
        c09dl.LJJJJJ(admNsConfig2.nsUrl);
        c09dl.LJIILLIIL("enable_sami_enginecommon_debug");
        c09dl.LJJJJJL(admNsConfig2.enableDebug);
        c09dl.LJII();
    }
}
