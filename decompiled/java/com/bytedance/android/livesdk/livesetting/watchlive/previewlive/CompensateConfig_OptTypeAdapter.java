package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class CompensateConfig_OptTypeAdapter extends TypeAdapter<CompensateConfig> {
    public final Gson LIZ;

    public CompensateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CompensateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CompensateConfig compensateConfig = new CompensateConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1159940126) {
                    if (iHashCode != 805577223) {
                        if (iHashCode == 1257463167 && strLJJJJ.equals("enable_server")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                compensateConfig.enableServer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_client")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            compensateConfig.enableClient = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("feed_request_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        compensateConfig.feedRequestOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return compensateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CompensateConfig compensateConfig) throws IOException {
        CompensateConfig compensateConfig2 = compensateConfig;
        if (compensateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_client");
        c09dl.LJJJJJL(compensateConfig2.enableClient);
        c09dl.LJIILLIIL("enable_server");
        c09dl.LJJJJJL(compensateConfig2.enableServer);
        c09dl.LJIILLIIL("feed_request_opt");
        c09dl.LJJJJJL(compensateConfig2.feedRequestOpt);
        c09dl.LJII();
    }
}
