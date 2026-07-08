package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMessageWsUplinkClientConfig_OptTypeAdapter extends TypeAdapter<LiveMessageWsUplinkClientConfig> {
    public final Gson LIZ;

    public LiveMessageWsUplinkClientConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMessageWsUplinkClientConfig read(C09CU c09cu) {
        LiveMessageWsUplinkClientConfig liveMessageWsUplinkClientConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveMessageWsUplinkClientConfig = new LiveMessageWsUplinkClientConfig(false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "enable_ws_uplink")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMessageWsUplinkClientConfig.setEnableWsUplink(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveMessageWsUplinkClientConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageWsUplinkClientConfig liveMessageWsUplinkClientConfig) throws IOException {
        LiveMessageWsUplinkClientConfig liveMessageWsUplinkClientConfig2 = liveMessageWsUplinkClientConfig;
        if (liveMessageWsUplinkClientConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_ws_uplink");
        c09dl.LJJJJJL(liveMessageWsUplinkClientConfig2.getEnableWsUplink());
        c09dl.LJII();
    }
}
