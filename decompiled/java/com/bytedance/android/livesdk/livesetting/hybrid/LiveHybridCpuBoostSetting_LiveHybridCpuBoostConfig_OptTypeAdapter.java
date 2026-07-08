package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridCpuBoostSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHybridCpuBoostSetting_LiveHybridCpuBoostConfig_OptTypeAdapter extends TypeAdapter<LiveHybridCpuBoostSetting.LiveHybridCpuBoostConfig> {
    public final Gson LIZ;

    public LiveHybridCpuBoostSetting_LiveHybridCpuBoostConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHybridCpuBoostSetting.LiveHybridCpuBoostConfig read(C09CU c09cu) {
        LiveHybridCpuBoostSetting.LiveHybridCpuBoostConfig liveHybridCpuBoostConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveHybridCpuBoostConfig = new LiveHybridCpuBoostSetting.LiveHybridCpuBoostConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "webview_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveHybridCpuBoostConfig.webviewEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "lynx_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveHybridCpuBoostConfig.lynxEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveHybridCpuBoostConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHybridCpuBoostSetting.LiveHybridCpuBoostConfig liveHybridCpuBoostConfig) throws IOException {
        LiveHybridCpuBoostSetting.LiveHybridCpuBoostConfig liveHybridCpuBoostConfig2 = liveHybridCpuBoostConfig;
        if (liveHybridCpuBoostConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("webview_enable");
        c09dl.LJJJJJL(liveHybridCpuBoostConfig2.webviewEnable);
        c09dl.LJIILLIIL("lynx_enable");
        c09dl.LJJJJJL(liveHybridCpuBoostConfig2.lynxEnable);
        c09dl.LJII();
    }
}
