package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class CentralInsetsBottomConfig_OptTypeAdapter extends TypeAdapter<CentralInsetsBottomConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CentralInsetsBottomConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CentralInsetsBottomConfig centralInsetsBottomConfig = new CentralInsetsBottomConfig(56, 156, 56, 56, 56);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -976011571:
                        if (strLJJJJ.equals("feed_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                centralInsetsBottomConfig.feedDp = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -967426730:
                        if (strLJJJJ.equals("in_room_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                centralInsetsBottomConfig.inRoomDp = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -802570052:
                        if (strLJJJJ.equals("pad_landscape_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                centralInsetsBottomConfig.padLandscapeDp = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1301616132:
                        if (strLJJJJ.equals("pad_portrait_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                centralInsetsBottomConfig.padPortraitDp = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1778207363:
                        if (strLJJJJ.equals("search_dp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                centralInsetsBottomConfig.searchDp = c09cu.LJJIZ();
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
        return centralInsetsBottomConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CentralInsetsBottomConfig centralInsetsBottomConfig) {
        CentralInsetsBottomConfig centralInsetsBottomConfig2 = centralInsetsBottomConfig;
        if (centralInsetsBottomConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pad_landscape_dp");
        c09dl.LJJJJ(Integer.valueOf(centralInsetsBottomConfig2.padLandscapeDp));
        c09dl.LJIILLIIL("pad_portrait_dp");
        c09dl.LJJJJ(Integer.valueOf(centralInsetsBottomConfig2.padPortraitDp));
        c09dl.LJIILLIIL("in_room_dp");
        c09dl.LJJJJ(Integer.valueOf(centralInsetsBottomConfig2.inRoomDp));
        c09dl.LJIILLIIL("feed_dp");
        c09dl.LJJJJ(Integer.valueOf(centralInsetsBottomConfig2.feedDp));
        c09dl.LJIILLIIL("search_dp");
        c09dl.LJJJJ(Integer.valueOf(centralInsetsBottomConfig2.searchDp));
        c09dl.LJII();
    }
}
