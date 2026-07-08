package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class DelayWidgetLoadConfig_OptTypeAdapter extends TypeAdapter<DelayWidgetLoadConfig> {
    public final Gson LIZ;

    public DelayWidgetLoadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DelayWidgetLoadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DelayWidgetLoadConfig delayWidgetLoadConfig = new DelayWidgetLoadConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2136561803:
                        if (strLJJJJ.equals("delay_time_gift_in_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                delayWidgetLoadConfig.delayTimeGiftInSecond = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1358769209:
                        if (strLJJJJ.equals("enable_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                delayWidgetLoadConfig.enableDelay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -900653032:
                        if (strLJJJJ.equals("delay_time_in_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                delayWidgetLoadConfig.delayTimeInSecond = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1460492572:
                        if (strLJJJJ.equals("delay_time_like_in_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                delayWidgetLoadConfig.delayTimeLikeInSecond = c09cu.LJJIZ();
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
        return delayWidgetLoadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DelayWidgetLoadConfig delayWidgetLoadConfig) throws IOException {
        DelayWidgetLoadConfig delayWidgetLoadConfig2 = delayWidgetLoadConfig;
        if (delayWidgetLoadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_delay");
        c09dl.LJJJJJL(delayWidgetLoadConfig2.enableDelay);
        c09dl.LJIILLIIL("delay_time_in_second");
        c09dl.LJJJJ(Integer.valueOf(delayWidgetLoadConfig2.delayTimeInSecond));
        c09dl.LJIILLIIL("delay_time_gift_in_second");
        c09dl.LJJJJ(Integer.valueOf(delayWidgetLoadConfig2.delayTimeGiftInSecond));
        c09dl.LJIILLIIL("delay_time_like_in_second");
        c09dl.LJJJJ(Integer.valueOf(delayWidgetLoadConfig2.delayTimeLikeInSecond));
        c09dl.LJII();
    }
}
