package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadSceneConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadSceneMapConfig_OptTypeAdapter extends TypeAdapter<PreloadSceneMapConfig> {
    public final Gson LIZ;

    public PreloadSceneMapConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PreloadSceneMapConfig read(C09CU c09cu) {
        PreloadSceneMapConfig preloadSceneMapConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            preloadSceneMapConfig = new PreloadSceneMapConfig(C2097608Jq.LJ());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "scene_map")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        preloadSceneMapConfig.sceneMap = C473040Igo.LIZIZ(this.LIZ, c09cu, PreloadSceneConfig.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return preloadSceneMapConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreloadSceneMapConfig preloadSceneMapConfig) {
        PreloadSceneMapConfig preloadSceneMapConfig2 = preloadSceneMapConfig;
        if (preloadSceneMapConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("scene_map");
        C473040Igo.LJ(this.LIZ, c09dl, preloadSceneMapConfig2.sceneMap, PreloadSceneConfig.class);
        c09dl.LJII();
    }
}
