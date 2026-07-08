package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridBlockGcSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHybridBlockGcSetting_LiveHybridBlockGCConfig_OptTypeAdapter extends TypeAdapter<LiveHybridBlockGcSetting.LiveHybridBlockGCConfig> {
    public final Gson LIZ;

    public LiveHybridBlockGcSetting_LiveHybridBlockGCConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveHybridBlockGcSetting.LiveHybridBlockGCConfig read(C09CU c09cu) {
        LiveHybridBlockGcSetting.LiveHybridBlockGCConfig liveHybridBlockGCConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveHybridBlockGCConfig = new LiveHybridBlockGcSetting.LiveHybridBlockGCConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "webview_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveHybridBlockGCConfig.webviewEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "lynx_enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveHybridBlockGCConfig.lynxEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveHybridBlockGCConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHybridBlockGcSetting.LiveHybridBlockGCConfig liveHybridBlockGCConfig) throws IOException {
        LiveHybridBlockGcSetting.LiveHybridBlockGCConfig liveHybridBlockGCConfig2 = liveHybridBlockGCConfig;
        if (liveHybridBlockGCConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("webview_enable");
        c09dl.LJJJJJL(liveHybridBlockGCConfig2.webviewEnable);
        c09dl.LJIILLIIL("lynx_enable");
        c09dl.LJJJJJL(liveHybridBlockGCConfig2.lynxEnable);
        c09dl.LJII();
    }
}
