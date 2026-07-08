package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.performance.BarrageLayoutRenderingOptimizationOptSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class BarrageLayoutRenderingOptimizationOptSetting_Config_OptTypeAdapter extends TypeAdapter<BarrageLayoutRenderingOptimizationOptSetting.Config> {
    public final Gson LIZ;

    public BarrageLayoutRenderingOptimizationOptSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BarrageLayoutRenderingOptimizationOptSetting.Config read(C09CU c09cu) {
        BarrageLayoutRenderingOptimizationOptSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new BarrageLayoutRenderingOptimizationOptSetting.Config(new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "barrage_message_type_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.barrageMessageTypeList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BarrageLayoutRenderingOptimizationOptSetting.Config config) {
        BarrageLayoutRenderingOptimizationOptSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("barrage_message_type_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.barrageMessageTypeList, Integer.TYPE);
        c09dl.LJII();
    }
}
