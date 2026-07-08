package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchLynxConfig_OptTypeAdapter extends TypeAdapter<LiveMatchLynxConfig> {
    public final Gson LIZ;

    public LiveMatchLynxConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchLynxConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchLynxConfig liveMatchLynxConfig = new LiveMatchLynxConfig("", 1, true, 0L, 15000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1719109413:
                        if (strLJJJJ.equals("start_animation_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchLynxConfig.startAnimationEnable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1153540600:
                        if (strLJJJJ.equals("create_defer_enter_room_window_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchLynxConfig.createDeferEnterRoomWindowMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -994924644:
                        if (strLJJJJ.equals("container_schema_v2")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchLynxConfig.schemaV2 = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -352821624:
                        if (strLJJJJ.equals("use_spark_lite")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchLynxConfig.useSparkLite = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1732547013:
                        if (strLJJJJ.equals("create_delay_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchLynxConfig.createDelayMs = c09cu.LJJJ();
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
        return liveMatchLynxConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchLynxConfig liveMatchLynxConfig) throws IOException {
        LiveMatchLynxConfig liveMatchLynxConfig2 = liveMatchLynxConfig;
        if (liveMatchLynxConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("container_schema_v2");
        c09dl.LJJJJJ(liveMatchLynxConfig2.schemaV2);
        c09dl.LJIILLIIL("start_animation_enable");
        c09dl.LJJJJ(Integer.valueOf(liveMatchLynxConfig2.startAnimationEnable));
        c09dl.LJIILLIIL("use_spark_lite");
        c09dl.LJJJJJL(liveMatchLynxConfig2.useSparkLite);
        c09dl.LJIILLIIL("create_delay_ms");
        c09dl.LJJIZ(liveMatchLynxConfig2.createDelayMs);
        c09dl.LJIILLIIL("create_defer_enter_room_window_ms");
        c09dl.LJJIZ(liveMatchLynxConfig2.createDeferEnterRoomWindowMs);
        c09dl.LJII();
    }
}
