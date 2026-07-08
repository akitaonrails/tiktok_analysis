package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePanelCostTimeModel_OptTypeAdapter extends TypeAdapter<LivePanelCostTimeModel> {
    public final Gson LIZ;

    public LivePanelCostTimeModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePanelCostTimeModel read(C09CU c09cu) {
        LivePanelCostTimeModel livePanelCostTimeModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePanelCostTimeModel = new LivePanelCostTimeModel(true, 3);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "live_sdk_panel_open_cost_times_switch")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePanelCostTimeModel.mSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "live_sdk_panel_open_cost_times_limit_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePanelCostTimeModel.mLimitDuration = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePanelCostTimeModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePanelCostTimeModel livePanelCostTimeModel) throws IOException {
        LivePanelCostTimeModel livePanelCostTimeModel2 = livePanelCostTimeModel;
        if (livePanelCostTimeModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_sdk_panel_open_cost_times_switch");
        c09dl.LJJJJJL(livePanelCostTimeModel2.mSwitch);
        c09dl.LJIILLIIL("live_sdk_panel_open_cost_times_limit_duration");
        c09dl.LJJJJ(Integer.valueOf(livePanelCostTimeModel2.mLimitDuration));
        c09dl.LJII();
    }
}
