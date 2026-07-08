package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class CheckAliveConfig_OptTypeAdapter extends TypeAdapter<CheckAliveConfig> {
    public final Gson LIZ;

    public CheckAliveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CheckAliveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CheckAliveConfig checkAliveConfig = new CheckAliveConfig(false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1618901381:
                        if (strLJJJJ.equals("disable_nr")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkAliveConfig.disableNr = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -501817889:
                        if (strLJJJJ.equals("disable_pause")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkAliveConfig.disablePause = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 414060327:
                        if (strLJJJJ.equals("disable_no_stream")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkAliveConfig.disableNoStream = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1268835967:
                        if (strLJJJJ.equals("disable_live_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkAliveConfig.disableLiveEnd = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return checkAliveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CheckAliveConfig checkAliveConfig) throws IOException {
        CheckAliveConfig checkAliveConfig2 = checkAliveConfig;
        if (checkAliveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("disable_live_end");
        c09dl.LJJJJJL(checkAliveConfig2.disableLiveEnd);
        c09dl.LJIILLIIL("disable_nr");
        c09dl.LJJJJJL(checkAliveConfig2.disableNr);
        c09dl.LJIILLIIL("disable_pause");
        c09dl.LJJJJJL(checkAliveConfig2.disablePause);
        c09dl.LJIILLIIL("disable_no_stream");
        c09dl.LJJJJJL(checkAliveConfig2.disableNoStream);
        c09dl.LJII();
    }
}
