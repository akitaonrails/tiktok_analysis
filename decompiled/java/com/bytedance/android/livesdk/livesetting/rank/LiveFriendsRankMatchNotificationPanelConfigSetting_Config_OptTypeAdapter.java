package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendsRankMatchNotificationPanelConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFriendsRankMatchNotificationPanelConfigSetting_Config_OptTypeAdapter extends TypeAdapter<LiveFriendsRankMatchNotificationPanelConfigSetting.Config> {
    public final Gson LIZ;

    public LiveFriendsRankMatchNotificationPanelConfigSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFriendsRankMatchNotificationPanelConfigSetting.Config read(C09CU c09cu) {
        LiveFriendsRankMatchNotificationPanelConfigSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveFriendsRankMatchNotificationPanelConfigSetting.Config(false, "");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "settings_link")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.settingsLink = c09cu.LJJJZ();
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
    public final void write(C09DL c09dl, LiveFriendsRankMatchNotificationPanelConfigSetting.Config config) throws IOException {
        LiveFriendsRankMatchNotificationPanelConfigSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("settings_link");
        c09dl.LJJJJJ(config2.settingsLink);
        c09dl.LJII();
    }
}
