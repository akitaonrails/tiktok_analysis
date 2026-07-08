package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightRequestOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInfeedSkylightRequestOptSetting_SkylightRequestStrategy_OptTypeAdapter extends TypeAdapter<LiveInfeedSkylightRequestOptSetting.SkylightRequestStrategy> {
    public final Gson LIZ;

    public LiveInfeedSkylightRequestOptSetting_SkylightRequestStrategy_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveInfeedSkylightRequestOptSetting.SkylightRequestStrategy read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInfeedSkylightRequestOptSetting.SkylightRequestStrategy skylightRequestStrategy = new LiveInfeedSkylightRequestOptSetting.SkylightRequestStrategy(false, false, 2000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1646867447) {
                    if (iHashCode != -1358769209) {
                        if (iHashCode == 1921119102 && strLJJJJ.equals("enable_after_widget_load_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                skylightRequestStrategy.enableAfterWidgetLoadEnd = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_delay")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            skylightRequestStrategy.enableDelay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("delay_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        skylightRequestStrategy.delayTime = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return skylightRequestStrategy;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveInfeedSkylightRequestOptSetting.SkylightRequestStrategy skylightRequestStrategy) throws IOException {
        LiveInfeedSkylightRequestOptSetting.SkylightRequestStrategy skylightRequestStrategy2 = skylightRequestStrategy;
        if (skylightRequestStrategy2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_after_widget_load_end");
        c09dl.LJJJJJL(skylightRequestStrategy2.enableAfterWidgetLoadEnd);
        c09dl.LJIILLIIL("enable_delay");
        c09dl.LJJJJJL(skylightRequestStrategy2.enableDelay);
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(skylightRequestStrategy2.delayTime);
        c09dl.LJII();
    }
}
