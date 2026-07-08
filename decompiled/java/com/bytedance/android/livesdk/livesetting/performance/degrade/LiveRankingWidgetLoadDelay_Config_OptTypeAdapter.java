package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingWidgetLoadDelay;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingWidgetLoadDelay_Config_OptTypeAdapter extends TypeAdapter<LiveRankingWidgetLoadDelay.Config> {
    public final Gson LIZ;

    public LiveRankingWidgetLoadDelay_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingWidgetLoadDelay.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankingWidgetLoadDelay.Config config = new LiveRankingWidgetLoadDelay.Config(false, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "widget_loading_delay_switch")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.widgetLoadingDelaySwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "loading_delay_time_for_creator_ranking_widget")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.loadingDelayTimeForCreatorRankingWidget = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingWidgetLoadDelay.Config config) throws IOException {
        LiveRankingWidgetLoadDelay.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("widget_loading_delay_switch");
        c09dl.LJJJJJL(config2.widgetLoadingDelaySwitch);
        c09dl.LJIILLIIL("loading_delay_time_for_creator_ranking_widget");
        c09dl.LJJIZ(config2.loadingDelayTimeForCreatorRankingWidget);
        c09dl.LJII();
    }
}
