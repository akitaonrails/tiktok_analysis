package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRoomCheckAliveConfig_OptTypeAdapter extends TypeAdapter<LiveRoomCheckAliveConfig> {
    public final Gson LIZ;

    public LiveRoomCheckAliveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRoomCheckAliveConfig read(C09CU c09cu) {
        LiveRoomCheckAliveConfig liveRoomCheckAliveConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveRoomCheckAliveConfig = new LiveRoomCheckAliveConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "check_nr")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveRoomCheckAliveConfig.checkNR = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "check_pausing")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveRoomCheckAliveConfig.checkPausing = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveRoomCheckAliveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRoomCheckAliveConfig liveRoomCheckAliveConfig) throws IOException {
        LiveRoomCheckAliveConfig liveRoomCheckAliveConfig2 = liveRoomCheckAliveConfig;
        if (liveRoomCheckAliveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("check_nr");
        c09dl.LJJJJJL(liveRoomCheckAliveConfig2.checkNR);
        c09dl.LJIILLIIL("check_pausing");
        c09dl.LJJJJJL(liveRoomCheckAliveConfig2.checkPausing);
        c09dl.LJII();
    }
}
