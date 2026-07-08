package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeResourceChannelConfig_OptTypeAdapter extends TypeAdapter<FeResourceChannelConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FeResourceChannelConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FeResourceChannelConfig feResourceChannelConfig = new FeResourceChannelConfig(0, 0, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -241235735) {
                    if (iHashCode != -81305529) {
                        if (iHashCode == 531242839 && strLJJJJ.equals("min_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                feResourceChannelConfig.minLevel = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("channel_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            feResourceChannelConfig.feChannelName = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("max_level")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        feResourceChannelConfig.maxLevel = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return feResourceChannelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeResourceChannelConfig feResourceChannelConfig) {
        FeResourceChannelConfig feResourceChannelConfig2 = feResourceChannelConfig;
        if (feResourceChannelConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_level");
        c09dl.LJJJJ(Integer.valueOf(feResourceChannelConfig2.minLevel));
        c09dl.LJIILLIIL("max_level");
        c09dl.LJJJJ(Integer.valueOf(feResourceChannelConfig2.maxLevel));
        c09dl.LJIILLIIL("channel_name");
        c09dl.LJJJJJ(feResourceChannelConfig2.feChannelName);
        c09dl.LJII();
    }
}
