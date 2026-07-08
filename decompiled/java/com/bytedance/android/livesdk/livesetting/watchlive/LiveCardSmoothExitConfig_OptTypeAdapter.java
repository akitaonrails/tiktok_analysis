package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCardSmoothExitConfig_OptTypeAdapter extends TypeAdapter<LiveCardSmoothExitConfig> {
    public final Gson LIZ;

    public LiveCardSmoothExitConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCardSmoothExitConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCardSmoothExitConfig liveCardSmoothExitConfig = new LiveCardSmoothExitConfig(false, 300L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2094731860) {
                    if (iHashCode != -1384659848) {
                        if (iHashCode == -1298848381 && strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveCardSmoothExitConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("room_duration")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveCardSmoothExitConfig.roomExitDuration = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("preview_card_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveCardSmoothExitConfig.previewCardDuration = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveCardSmoothExitConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCardSmoothExitConfig liveCardSmoothExitConfig) throws IOException {
        LiveCardSmoothExitConfig liveCardSmoothExitConfig2 = liveCardSmoothExitConfig;
        if (liveCardSmoothExitConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveCardSmoothExitConfig2.enable);
        c09dl.LJIILLIIL("room_duration");
        c09dl.LJJIZ(liveCardSmoothExitConfig2.roomExitDuration);
        c09dl.LJIILLIIL("preview_card_duration");
        c09dl.LJJIZ(liveCardSmoothExitConfig2.previewCardDuration);
        c09dl.LJII();
    }
}
