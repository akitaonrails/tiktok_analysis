package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveCapsuleStyleConfig_OptTypeAdapter extends TypeAdapter<LiveCapsuleStyleConfig> {
    public final Gson LIZ;

    public LiveCapsuleStyleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCapsuleStyleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCapsuleStyleConfig liveCapsuleStyleConfig = new LiveCapsuleStyleConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "capsule_style_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveCapsuleStyleConfig.capsuleStyleItemConfig = (LiveCapsuleStyleItemConfig) this.LIZ.LJIIJ(LiveCapsuleStyleItemConfig.class).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "multi_strategy_capsule_style_config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveCapsuleStyleConfig.multiStrategyCapsuleStyleConfig = (LiveCapsuleStyleItemConfig) this.LIZ.LJIIJ(LiveCapsuleStyleItemConfig.class).read(c09cu);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveCapsuleStyleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCapsuleStyleConfig liveCapsuleStyleConfig) {
        LiveCapsuleStyleConfig liveCapsuleStyleConfig2 = liveCapsuleStyleConfig;
        if (liveCapsuleStyleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("capsule_style_config");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(LiveCapsuleStyleItemConfig.class);
        typeAdapterLJIIJ.write(c09dl, liveCapsuleStyleConfig2.capsuleStyleItemConfig);
        c09dl.LJIILLIIL("multi_strategy_capsule_style_config");
        typeAdapterLJIIJ.write(c09dl, liveCapsuleStyleConfig2.multiStrategyCapsuleStyleConfig);
        c09dl.LJII();
    }
}
