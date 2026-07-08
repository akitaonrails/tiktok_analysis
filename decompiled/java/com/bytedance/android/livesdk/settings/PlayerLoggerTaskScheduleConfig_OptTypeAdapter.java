package com.bytedance.android.livesdk.settings;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PlayerLoggerTaskScheduleConfig_OptTypeAdapter extends TypeAdapter<PlayerLoggerTaskScheduleConfig> {
    public final Gson LIZ;

    public PlayerLoggerTaskScheduleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PlayerLoggerTaskScheduleConfig read(C09CU c09cu) {
        PlayerLoggerTaskScheduleConfig playerLoggerTaskScheduleConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            playerLoggerTaskScheduleConfig = new PlayerLoggerTaskScheduleConfig(false, new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "schedule_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playerLoggerTaskScheduleConfig.scheduleEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "disableKeys")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        playerLoggerTaskScheduleConfig.disableKeys = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return playerLoggerTaskScheduleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PlayerLoggerTaskScheduleConfig playerLoggerTaskScheduleConfig) throws IOException {
        PlayerLoggerTaskScheduleConfig playerLoggerTaskScheduleConfig2 = playerLoggerTaskScheduleConfig;
        if (playerLoggerTaskScheduleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("schedule_enable");
        c09dl.LJJJJJL(playerLoggerTaskScheduleConfig2.scheduleEnable);
        c09dl.LJIILLIIL("disableKeys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, playerLoggerTaskScheduleConfig2.disableKeys, String.class);
        c09dl.LJII();
    }
}
