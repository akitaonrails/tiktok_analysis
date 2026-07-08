package com.bytedance.android.livesdk.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.setting.LiveInteractViewGoneSettingV2;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveInteractViewGoneSettingV2_Config_OptTypeAdapter extends TypeAdapter<LiveInteractViewGoneSettingV2.Config> {
    public final Gson LIZ;

    public LiveInteractViewGoneSettingV2_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveInteractViewGoneSettingV2.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInteractViewGoneSettingV2.Config config = new LiveInteractViewGoneSettingV2.Config(false, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "gone_view_mask")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.goneViewMask = Integer.valueOf(c09cu.LJJIZ());
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
    public final void write(C09DL c09dl, LiveInteractViewGoneSettingV2.Config config) throws IOException {
        LiveInteractViewGoneSettingV2.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("gone_view_mask");
        c09dl.LJJJJ(config2.goneViewMask);
        c09dl.LJII();
    }
}
