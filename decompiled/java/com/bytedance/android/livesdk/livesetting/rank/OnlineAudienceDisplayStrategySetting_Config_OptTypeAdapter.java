package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter extends TypeAdapter<OnlineAudienceDisplayStrategySetting.Config> {
    public final Gson LIZ;

    public OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OnlineAudienceDisplayStrategySetting.Config read(C09CU c09cu) {
        OnlineAudienceDisplayStrategySetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new OnlineAudienceDisplayStrategySetting.Config(true, 4);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "online_audience_display_strategy_on")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.useOnlineDisplayStrategy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "online_audience_display_number")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.displayNumberN = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, OnlineAudienceDisplayStrategySetting.Config config) throws IOException {
        OnlineAudienceDisplayStrategySetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("online_audience_display_strategy_on");
        c09dl.LJJJJJL(config2.useOnlineDisplayStrategy);
        c09dl.LJIILLIIL("online_audience_display_number");
        c09dl.LJJJJ(Integer.valueOf(config2.displayNumberN));
        c09dl.LJII();
    }
}
