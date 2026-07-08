package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletPreloadWebviewConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveWalletPreloadWebviewConfigSetting_WalletPreloadWebviewConfig_OptTypeAdapter extends TypeAdapter<LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig> {
    public final Gson LIZ;

    public LiveWalletPreloadWebviewConfigSetting_WalletPreloadWebviewConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig walletPreloadWebviewConfig = new LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_precreate")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    walletPreloadWebviewConfig.enablePrecreate = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "ttl_seconds")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    walletPreloadWebviewConfig.ttlSeconds = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return walletPreloadWebviewConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig walletPreloadWebviewConfig) throws IOException {
        LiveWalletPreloadWebviewConfigSetting.WalletPreloadWebviewConfig walletPreloadWebviewConfig2 = walletPreloadWebviewConfig;
        if (walletPreloadWebviewConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_precreate");
        c09dl.LJJJJJL(walletPreloadWebviewConfig2.enablePrecreate);
        c09dl.LJIILLIIL("ttl_seconds");
        c09dl.LJJJJ(Integer.valueOf(walletPreloadWebviewConfig2.ttlSeconds));
        c09dl.LJII();
    }
}
