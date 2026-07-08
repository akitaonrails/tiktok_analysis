package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class CtlConfig_OptTypeAdapter extends TypeAdapter<CtlConfig> {
    public final Gson LIZ;

    public CtlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CtlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CtlConfig ctlConfig = new CtlConfig(false, 1, 30000L, 0, false, true, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1403589924:
                        if (strLJJJJ.equals("nonTabSwitch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.enableInflowStrategy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -678858998:
                        if (strLJJJJ.equals("perfOpt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.doPerfOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 288459765:
                        if (strLJJJJ.equals("distance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.distance = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 570418373:
                        if (strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 640880894:
                        if (strLJJJJ.equals("ignorePlayerState")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.ignorePlayerState = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1787798387:
                        if (strLJJJJ.equals("strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                ctlConfig.strategyOption = c09cu.LJJIZ();
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
        return ctlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CtlConfig ctlConfig) throws IOException {
        CtlConfig ctlConfig2 = ctlConfig;
        if (ctlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(ctlConfig2.enable);
        c09dl.LJIILLIIL("distance");
        c09dl.LJJJJ(Integer.valueOf(ctlConfig2.distance));
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(ctlConfig2.interval);
        c09dl.LJIILLIIL("strategy");
        c09dl.LJJJJ(Integer.valueOf(ctlConfig2.strategyOption));
        c09dl.LJIILLIIL("nonTabSwitch");
        c09dl.LJJJJJL(ctlConfig2.enableInflowStrategy);
        c09dl.LJIILLIIL("perfOpt");
        c09dl.LJJJJJL(ctlConfig2.doPerfOpt);
        c09dl.LJIILLIIL("ignorePlayerState");
        c09dl.LJJJJJL(ctlConfig2.ignorePlayerState);
        c09dl.LJII();
    }
}
