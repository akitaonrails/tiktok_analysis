package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestPhase2EventTrackingOpt_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestPhase2EventTrackingOpt.Configs> {
    public final Gson LIZ;

    public CohostWithGuestPhase2EventTrackingOpt_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestPhase2EventTrackingOpt.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestPhase2EventTrackingOpt.Configs configs = new CohostWithGuestPhase2EventTrackingOpt.Configs(true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2843892:
                        if (strLJJJJ.equals("list_show_opt_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.listShowOptEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 383930359:
                        if (strLJJJJ.equals("list_show_connection_success_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.listShowConnectionSuccessOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1203268876:
                        if (strLJJJJ.equals("opt_data_connection_over")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.optDataConnectionOver = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestPhase2EventTrackingOpt.Configs configs) throws IOException {
        CohostWithGuestPhase2EventTrackingOpt.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("list_show_opt_enabled");
        c09dl.LJJJJJL(configs2.listShowOptEnabled);
        c09dl.LJIILLIIL("list_show_connection_success_opt");
        c09dl.LJJJJJL(configs2.listShowConnectionSuccessOpt);
        c09dl.LJIILLIIL("opt_data_connection_over");
        c09dl.LJJJJJL(configs2.optDataConnectionOver);
        c09dl.LJII();
    }
}
