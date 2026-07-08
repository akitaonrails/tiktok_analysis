package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMainFrameworkUpdateTopOneLineSizeConfigSetting_TopOneLineSizeConfig_OptTypeAdapter extends TypeAdapter<LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.TopOneLineSizeConfig> {
    public final Gson LIZ;

    public LiveMainFrameworkUpdateTopOneLineSizeConfigSetting_TopOneLineSizeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.TopOneLineSizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.TopOneLineSizeConfig topOneLineSizeConfig = new LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.TopOneLineSizeConfig(false, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    topOneLineSizeConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    topOneLineSizeConfig.config = C473040Igo.LIZ(this.LIZ, c09cu, LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return topOneLineSizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.TopOneLineSizeConfig topOneLineSizeConfig) throws IOException {
        LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.TopOneLineSizeConfig topOneLineSizeConfig2 = topOneLineSizeConfig;
        if (topOneLineSizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(topOneLineSizeConfig2.enable);
        c09dl.LJIILLIIL("config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, topOneLineSizeConfig2.config, LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config.class);
        c09dl.LJII();
    }
}
