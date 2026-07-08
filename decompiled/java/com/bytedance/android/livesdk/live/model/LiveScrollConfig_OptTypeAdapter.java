package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveScrollConfig_OptTypeAdapter extends TypeAdapter<LiveScrollConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveScrollConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveScrollConfig liveScrollConfig = new LiveScrollConfig(25.0f, 400, 0.4f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1697529363) {
                    if (iHashCode != -85269079) {
                        if (iHashCode == 412910787 && strLJJJJ.equals("turn_page_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveScrollConfig.setTurnPageValue((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("min_distance_for_fling")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveScrollConfig.setMinDistanceForFling((float) c09cu.LJJIL());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("min_fling_velocity")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveScrollConfig.setMinFlingVelocity(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveScrollConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveScrollConfig liveScrollConfig) {
        LiveScrollConfig liveScrollConfig2 = liveScrollConfig;
        if (liveScrollConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_distance_for_fling");
        c09dl.LJJJJ(Float.valueOf(liveScrollConfig2.getMinDistanceForFling()));
        c09dl.LJIILLIIL("min_fling_velocity");
        c09dl.LJJJJ(Integer.valueOf(liveScrollConfig2.getMinFlingVelocity()));
        c09dl.LJIILLIIL("turn_page_value");
        c09dl.LJJJJ(Float.valueOf(liveScrollConfig2.getTurnPageValue()));
        c09dl.LJII();
    }
}
