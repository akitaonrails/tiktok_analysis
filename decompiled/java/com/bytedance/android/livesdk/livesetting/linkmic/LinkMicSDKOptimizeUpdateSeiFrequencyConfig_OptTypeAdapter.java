package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkMicSDKOptimizeUpdateSeiFrequencyConfig_OptTypeAdapter extends TypeAdapter<LinkMicSDKOptimizeUpdateSeiFrequencyConfig> {
    public final Gson LIZ;

    public LinkMicSDKOptimizeUpdateSeiFrequencyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicSDKOptimizeUpdateSeiFrequencyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicSDKOptimizeUpdateSeiFrequencyConfig linkMicSDKOptimizeUpdateSeiFrequencyConfig = new LinkMicSDKOptimizeUpdateSeiFrequencyConfig(true, 0.15f, 2);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 3575610) {
                        if (iHashCode == 570418373 && strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkMicSDKOptimizeUpdateSeiFrequencyConfig.interval = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("type")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            linkMicSDKOptimizeUpdateSeiFrequencyConfig.type = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        linkMicSDKOptimizeUpdateSeiFrequencyConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return linkMicSDKOptimizeUpdateSeiFrequencyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicSDKOptimizeUpdateSeiFrequencyConfig linkMicSDKOptimizeUpdateSeiFrequencyConfig) throws IOException {
        LinkMicSDKOptimizeUpdateSeiFrequencyConfig linkMicSDKOptimizeUpdateSeiFrequencyConfig2 = linkMicSDKOptimizeUpdateSeiFrequencyConfig;
        if (linkMicSDKOptimizeUpdateSeiFrequencyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(linkMicSDKOptimizeUpdateSeiFrequencyConfig2.enable);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJJJ(Float.valueOf(linkMicSDKOptimizeUpdateSeiFrequencyConfig2.interval));
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJ(Integer.valueOf(linkMicSDKOptimizeUpdateSeiFrequencyConfig2.type));
        c09dl.LJII();
    }
}
