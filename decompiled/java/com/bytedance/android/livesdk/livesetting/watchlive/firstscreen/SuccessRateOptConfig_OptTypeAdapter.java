package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class SuccessRateOptConfig_OptTypeAdapter extends TypeAdapter<SuccessRateOptConfig> {
    public final Gson LIZ;

    public SuccessRateOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SuccessRateOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SuccessRateOptConfig successRateOptConfig = new SuccessRateOptConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1488617921) {
                    if (iHashCode != -1052311464) {
                        if (iHashCode == 2105594551 && strLJJJJ.equals("isEnabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                successRateOptConfig.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("isAllPreConn")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            successRateOptConfig.isAllPreConn = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enableByPredict")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        successRateOptConfig.predictionEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return successRateOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SuccessRateOptConfig successRateOptConfig) throws IOException {
        SuccessRateOptConfig successRateOptConfig2 = successRateOptConfig;
        if (successRateOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isEnabled");
        c09dl.LJJJJJL(successRateOptConfig2.isEnabled);
        c09dl.LJIILLIIL("isAllPreConn");
        c09dl.LJJJJJL(successRateOptConfig2.isAllPreConn);
        c09dl.LJIILLIIL("enableByPredict");
        c09dl.LJJJJJL(successRateOptConfig2.predictionEnabled);
        c09dl.LJII();
    }
}
