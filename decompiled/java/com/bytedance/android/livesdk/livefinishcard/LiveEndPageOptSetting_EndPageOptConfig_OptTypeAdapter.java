package com.bytedance.android.livesdk.livefinishcard;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageOptSetting;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEndPageOptSetting_EndPageOptConfig_OptTypeAdapter extends TypeAdapter<LiveEndPageOptSetting.EndPageOptConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveEndPageOptSetting.EndPageOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEndPageOptSetting.EndPageOptConfig endPageOptConfig = new LiveEndPageOptSetting.EndPageOptConfig(0, 1000L, Mp4ScreenVideoLoadTimeout.CONTROL, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -461190688:
                        if (strLJJJJ.equals("screenShotType")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                endPageOptConfig.setScreenShotType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3575610:
                        if (strLJJJJ.equals("type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                endPageOptConfig.setOptType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 618689094:
                        if (strLJJJJ.equals("autoRemoveTimeMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                endPageOptConfig.setAutoRemoveTimeMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 988539902:
                        if (strLJJJJ.equals("autoSwipeTimeMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                endPageOptConfig.setAutoSwipeTimeMs(c09cu.LJJJ());
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
        return endPageOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEndPageOptSetting.EndPageOptConfig endPageOptConfig) throws IOException {
        LiveEndPageOptSetting.EndPageOptConfig endPageOptConfig2 = endPageOptConfig;
        if (endPageOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJ(Integer.valueOf(endPageOptConfig2.getOptType()));
        c09dl.LJIILLIIL("autoSwipeTimeMs");
        c09dl.LJJIZ(endPageOptConfig2.getAutoSwipeTimeMs());
        c09dl.LJIILLIIL("autoRemoveTimeMs");
        c09dl.LJJIZ(endPageOptConfig2.getAutoRemoveTimeMs());
        c09dl.LJIILLIIL("screenShotType");
        c09dl.LJJJJ(Integer.valueOf(endPageOptConfig2.getScreenShotType()));
        c09dl.LJII();
    }
}
