package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class BgGovernorConfig_OptTypeAdapter extends TypeAdapter<BgGovernorConfig> {
    public final Gson LIZ;

    public BgGovernorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BgGovernorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BgGovernorConfig bgGovernorConfig = new BgGovernorConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != -892494539) {
                        if (iHashCode == 589526331 && strLJJJJ.equals("media_session")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bgGovernorConfig.setEnableMediaSession(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("stages")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            bgGovernorConfig.setStages((BgGovernorStagesConfig) this.LIZ.LJIIJ(BgGovernorStagesConfig.class).read(c09cu));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        bgGovernorConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return bgGovernorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BgGovernorConfig bgGovernorConfig) throws IOException {
        BgGovernorConfig bgGovernorConfig2 = bgGovernorConfig;
        if (bgGovernorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(bgGovernorConfig2.getEnabled());
        c09dl.LJIILLIIL("stages");
        this.LIZ.LJIIJ(BgGovernorStagesConfig.class).write(c09dl, bgGovernorConfig2.getStages());
        c09dl.LJIILLIIL("media_session");
        c09dl.LJJJJJL(bgGovernorConfig2.getEnableMediaSession());
        c09dl.LJII();
    }
}
