package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestBorderViewInitOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestBorderViewInitOpt_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestBorderViewInitOpt.Configs> {
    public final Gson LIZ;

    public CohostWithGuestBorderViewInitOpt_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestBorderViewInitOpt.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestBorderViewInitOpt.Configs configs = new CohostWithGuestBorderViewInitOpt.Configs(1, 2000L, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1341699472) {
                    if (iHashCode != -698494126) {
                        if (iHashCode == 1202862688 && strLJJJJ.equals("clear_all_on_linker_mode_changed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.clearAllOnLinkerModeChanged = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("create_border_delay_ms")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            configs.createBorderDelayMs = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("allow_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.allowType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestBorderViewInitOpt.Configs configs) throws IOException {
        CohostWithGuestBorderViewInitOpt.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("allow_type");
        c09dl.LJJJJ(Integer.valueOf(configs2.allowType));
        c09dl.LJIILLIIL("create_border_delay_ms");
        c09dl.LJJIZ(configs2.createBorderDelayMs);
        c09dl.LJIILLIIL("clear_all_on_linker_mode_changed");
        c09dl.LJJJJJL(configs2.clearAllOnLinkerModeChanged);
        c09dl.LJII();
    }
}
