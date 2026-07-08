package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public final class BubbleSettingData_OptTypeAdapter extends TypeAdapter<BubbleSettingData> {
    @Override // com.google.gson.TypeAdapter
    public final BubbleSettingData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BubbleSettingData bubbleSettingData = new BubbleSettingData(0L, 0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1984346169) {
                    if (iHashCode != -1440865301) {
                        if (iHashCode == -1218135838 && strLJJJJ.equals("cache_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                bubbleSettingData.setCacheInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("stay_interval")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            bubbleSettingData.setStayInterval(c09cu.LJJJ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("show_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        bubbleSettingData.setShowInterval(c09cu.LJJJ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return bubbleSettingData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BubbleSettingData bubbleSettingData) throws IOException {
        BubbleSettingData bubbleSettingData2 = bubbleSettingData;
        if (bubbleSettingData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("show_interval");
        c09dl.LJJIZ(bubbleSettingData2.getShowInterval());
        c09dl.LJIILLIIL("stay_interval");
        c09dl.LJJIZ(bubbleSettingData2.getStayInterval());
        c09dl.LJIILLIIL("cache_interval");
        c09dl.LJJIZ(bubbleSettingData2.getCacheInterval());
        c09dl.LJII();
    }
}
