package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class PreForwardStreamConfig_OptTypeAdapter extends TypeAdapter<PreForwardStreamConfig> {
    public final Gson LIZ;

    public PreForwardStreamConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PreForwardStreamConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreForwardStreamConfig preForwardStreamConfig = new PreForwardStreamConfig(true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1400866795) {
                    if (iHashCode != -1028890671) {
                        if (iHashCode == 586412141 && strLJJJJ.equals("enable_pre_forward")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preForwardStreamConfig.enablePreForward = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_opt_subscrip")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            preForwardStreamConfig.enableOptSubscrip = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_forward_refact")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        preForwardStreamConfig.enableForwardRefact = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return preForwardStreamConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreForwardStreamConfig preForwardStreamConfig) throws IOException {
        PreForwardStreamConfig preForwardStreamConfig2 = preForwardStreamConfig;
        if (preForwardStreamConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_pre_forward");
        c09dl.LJJJJJL(preForwardStreamConfig2.enablePreForward);
        c09dl.LJIILLIIL("enable_forward_refact");
        c09dl.LJJJJJL(preForwardStreamConfig2.enableForwardRefact);
        c09dl.LJIILLIIL("enable_opt_subscrip");
        c09dl.LJJJJJL(preForwardStreamConfig2.enableOptSubscrip);
        c09dl.LJII();
    }
}
