package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class PartnershipAnchorFrequencyControlConfig_OptTypeAdapter extends TypeAdapter<PartnershipAnchorFrequencyControlConfig> {
    public final Gson LIZ;

    public PartnershipAnchorFrequencyControlConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PartnershipAnchorFrequencyControlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PartnershipAnchorFrequencyControlConfig partnershipAnchorFrequencyControlConfig = new PartnershipAnchorFrequencyControlConfig(false, 10, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != -342112305) {
                        if (iHashCode == 1852357572 && strLJJJJ.equals("max_impression")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                partnershipAnchorFrequencyControlConfig.maxCountLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("psp_enabled")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            partnershipAnchorFrequencyControlConfig.pspEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        partnershipAnchorFrequencyControlConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return partnershipAnchorFrequencyControlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PartnershipAnchorFrequencyControlConfig partnershipAnchorFrequencyControlConfig) throws IOException {
        PartnershipAnchorFrequencyControlConfig partnershipAnchorFrequencyControlConfig2 = partnershipAnchorFrequencyControlConfig;
        if (partnershipAnchorFrequencyControlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(partnershipAnchorFrequencyControlConfig2.enable);
        c09dl.LJIILLIIL("max_impression");
        c09dl.LJJJJ(Integer.valueOf(partnershipAnchorFrequencyControlConfig2.maxCountLimit));
        c09dl.LJIILLIIL("psp_enabled");
        c09dl.LJJJJJL(partnershipAnchorFrequencyControlConfig2.pspEnable);
        c09dl.LJII();
    }
}
