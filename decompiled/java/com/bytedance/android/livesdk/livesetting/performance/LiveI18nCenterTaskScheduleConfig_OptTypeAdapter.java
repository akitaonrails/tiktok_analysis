package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveI18nCenterTaskScheduleConfig_OptTypeAdapter extends TypeAdapter<LiveI18nCenterTaskScheduleConfig> {
    public final Gson LIZ;

    public LiveI18nCenterTaskScheduleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveI18nCenterTaskScheduleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveI18nCenterTaskScheduleConfig liveI18nCenterTaskScheduleConfig = new LiveI18nCenterTaskScheduleConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "isEnable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveI18nCenterTaskScheduleConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "schedule_sources")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveI18nCenterTaskScheduleConfig.scheduleSources = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveI18nCenterTaskScheduleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveI18nCenterTaskScheduleConfig liveI18nCenterTaskScheduleConfig) throws IOException {
        LiveI18nCenterTaskScheduleConfig liveI18nCenterTaskScheduleConfig2 = liveI18nCenterTaskScheduleConfig;
        if (liveI18nCenterTaskScheduleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isEnable");
        c09dl.LJJJJJL(liveI18nCenterTaskScheduleConfig2.isEnable);
        c09dl.LJIILLIIL("schedule_sources");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveI18nCenterTaskScheduleConfig2.scheduleSources, Integer.TYPE);
        c09dl.LJII();
    }
}
