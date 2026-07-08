package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class InflateConfig_OptTypeAdapter extends TypeAdapter<InflateConfig> {
    public final Gson LIZ;

    public InflateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final InflateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        InflateConfig inflateConfig = new InflateConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 547837708) {
                        if (iHashCode == 2084626402 && strLJJJJ.equals("gcBlockOpt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                inflateConfig.enableGcBlockOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enlargeCapacity")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            inflateConfig.enlargeCapacity = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        inflateConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return inflateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, InflateConfig inflateConfig) throws IOException {
        InflateConfig inflateConfig2 = inflateConfig;
        if (inflateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(inflateConfig2.enable);
        c09dl.LJIILLIIL("gcBlockOpt");
        c09dl.LJJJJJL(inflateConfig2.enableGcBlockOpt);
        c09dl.LJIILLIIL("enlargeCapacity");
        c09dl.LJJJJJL(inflateConfig2.enlargeCapacity);
        c09dl.LJII();
    }
}
