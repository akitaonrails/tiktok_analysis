package com.bytedance.android.livesdk.livefinishcard;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageFullToHalfOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEndPageFullToHalfOptSetting_EndPageFullToHalfOptConfig_OptTypeAdapter extends TypeAdapter<LiveEndPageFullToHalfOptSetting.EndPageFullToHalfOptConfig> {
    public final Gson LIZ;

    public LiveEndPageFullToHalfOptSetting_EndPageFullToHalfOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveEndPageFullToHalfOptSetting.EndPageFullToHalfOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEndPageFullToHalfOptSetting.EndPageFullToHalfOptConfig endPageFullToHalfOptConfig = new LiveEndPageFullToHalfOptSetting.EndPageFullToHalfOptConfig(false, true, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1868938572) {
                    if (iHashCode != -1298848381) {
                        if (iHashCode == 1696494536 && strLJJJJ.equals("enable_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                endPageFullToHalfOptConfig.setEnableAnimation(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            endPageFullToHalfOptConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("swipe_opt_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        endPageFullToHalfOptConfig.setSwipeOptEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return endPageFullToHalfOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEndPageFullToHalfOptSetting.EndPageFullToHalfOptConfig endPageFullToHalfOptConfig) throws IOException {
        LiveEndPageFullToHalfOptSetting.EndPageFullToHalfOptConfig endPageFullToHalfOptConfig2 = endPageFullToHalfOptConfig;
        if (endPageFullToHalfOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(endPageFullToHalfOptConfig2.getEnable());
        c09dl.LJIILLIIL("enable_animation");
        c09dl.LJJJJJL(endPageFullToHalfOptConfig2.getEnableAnimation());
        c09dl.LJIILLIIL("swipe_opt_enable");
        c09dl.LJJJJJL(endPageFullToHalfOptConfig2.getSwipeOptEnable());
        c09dl.LJII();
    }
}
