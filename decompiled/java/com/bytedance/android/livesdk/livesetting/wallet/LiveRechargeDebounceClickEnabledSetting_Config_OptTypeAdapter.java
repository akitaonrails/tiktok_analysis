package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeDebounceClickEnabledSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveRechargeDebounceClickEnabledSetting_Config_OptTypeAdapter extends TypeAdapter<LiveRechargeDebounceClickEnabledSetting.Config> {
    public final Gson LIZ;

    public LiveRechargeDebounceClickEnabledSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRechargeDebounceClickEnabledSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRechargeDebounceClickEnabledSetting.Config config = new LiveRechargeDebounceClickEnabledSetting.Config();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "debounce_time_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.debounceTimeMs = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRechargeDebounceClickEnabledSetting.Config config) throws IOException {
        LiveRechargeDebounceClickEnabledSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("debounce_time_ms");
        c09dl.LJJJJ(Integer.valueOf(config2.debounceTimeMs));
        c09dl.LJII();
    }
}
