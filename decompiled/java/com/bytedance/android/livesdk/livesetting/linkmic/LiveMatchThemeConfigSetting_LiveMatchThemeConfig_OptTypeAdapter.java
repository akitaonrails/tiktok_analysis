package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchThemeConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchThemeConfigSetting_LiveMatchThemeConfig_OptTypeAdapter extends TypeAdapter<LiveMatchThemeConfigSetting.LiveMatchThemeConfig> {
    public final Gson LIZ;

    public LiveMatchThemeConfigSetting_LiveMatchThemeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchThemeConfigSetting.LiveMatchThemeConfig read(C09CU c09cu) {
        LiveMatchThemeConfigSetting.LiveMatchThemeConfig liveMatchThemeConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveMatchThemeConfig = new LiveMatchThemeConfigSetting.LiveMatchThemeConfig(LiveMatchThemeConfigSetting.DEFAULT_MATCH_THEME_CONFIG);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "match_theme_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchThemeConfig.setMatchThemeConfig(C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE));
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveMatchThemeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchThemeConfigSetting.LiveMatchThemeConfig liveMatchThemeConfig) {
        LiveMatchThemeConfigSetting.LiveMatchThemeConfig liveMatchThemeConfig2 = liveMatchThemeConfig;
        if (liveMatchThemeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("match_theme_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveMatchThemeConfig2.getMatchThemeConfig(), Integer.TYPE);
        c09dl.LJII();
    }
}
