package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class HostBackToInnerConfig_OptTypeAdapter extends TypeAdapter<HostBackToInnerConfig> {
    public final Gson LIZ;

    public HostBackToInnerConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final HostBackToInnerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        HostBackToInnerConfig hostBackToInnerConfig = new HostBackToInnerConfig(false, false, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2056153576) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == -15553704 && strLJJJJ.equals("auto_draw_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                hostBackToInnerConfig.setAutoDrawDelay(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            hostBackToInnerConfig.setEnableOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_auto_draw")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        hostBackToInnerConfig.setEnableAutoDraw(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return hostBackToInnerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, HostBackToInnerConfig hostBackToInnerConfig) throws IOException {
        HostBackToInnerConfig hostBackToInnerConfig2 = hostBackToInnerConfig;
        if (hostBackToInnerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(hostBackToInnerConfig2.getEnableOpt());
        c09dl.LJIILLIIL("enable_auto_draw");
        c09dl.LJJJJJL(hostBackToInnerConfig2.getEnableAutoDraw());
        c09dl.LJIILLIIL("auto_draw_delay");
        c09dl.LJJIZ(hostBackToInnerConfig2.getAutoDrawDelay());
        c09dl.LJII();
    }
}
