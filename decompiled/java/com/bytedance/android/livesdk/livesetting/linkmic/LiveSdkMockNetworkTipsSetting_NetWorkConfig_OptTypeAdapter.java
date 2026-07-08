package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMockNetworkTipsSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSdkMockNetworkTipsSetting_NetWorkConfig_OptTypeAdapter extends TypeAdapter<LiveSdkMockNetworkTipsSetting.NetWorkConfig> {
    public final Gson LIZ;

    public LiveSdkMockNetworkTipsSetting_NetWorkConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveSdkMockNetworkTipsSetting.NetWorkConfig read(C09CU c09cu) {
        LiveSdkMockNetworkTipsSetting.NetWorkConfig netWorkConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            netWorkConfig = new LiveSdkMockNetworkTipsSetting.NetWorkConfig(false, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "isEnable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        netWorkConfig.isEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "networkState")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        netWorkConfig.networkState = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return netWorkConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSdkMockNetworkTipsSetting.NetWorkConfig netWorkConfig) throws IOException {
        LiveSdkMockNetworkTipsSetting.NetWorkConfig netWorkConfig2 = netWorkConfig;
        if (netWorkConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isEnable");
        c09dl.LJJJJJL(netWorkConfig2.isEnable);
        c09dl.LJIILLIIL("networkState");
        c09dl.LJJJJ(Integer.valueOf(netWorkConfig2.networkState));
        c09dl.LJII();
    }
}
