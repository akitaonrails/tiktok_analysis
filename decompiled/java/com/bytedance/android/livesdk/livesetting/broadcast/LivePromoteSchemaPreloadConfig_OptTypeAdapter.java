package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteSchemaPreloadConfig_OptTypeAdapter extends TypeAdapter<LivePromoteSchemaPreloadConfig> {
    public final Gson LIZ;

    public LivePromoteSchemaPreloadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePromoteSchemaPreloadConfig read(C09CU c09cu) {
        LivePromoteSchemaPreloadConfig livePromoteSchemaPreloadConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePromoteSchemaPreloadConfig = new LivePromoteSchemaPreloadConfig(false, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePromoteSchemaPreloadConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "release_duration")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePromoteSchemaPreloadConfig.releaseDuration = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePromoteSchemaPreloadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePromoteSchemaPreloadConfig livePromoteSchemaPreloadConfig) throws IOException {
        LivePromoteSchemaPreloadConfig livePromoteSchemaPreloadConfig2 = livePromoteSchemaPreloadConfig;
        if (livePromoteSchemaPreloadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(livePromoteSchemaPreloadConfig2.enable);
        c09dl.LJIILLIIL("release_duration");
        c09dl.LJJJJ(Integer.valueOf(livePromoteSchemaPreloadConfig2.releaseDuration));
        c09dl.LJII();
    }
}
