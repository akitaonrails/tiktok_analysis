package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveConsumingFunOptConfig_OptTypeAdapter extends TypeAdapter<LiveConsumingFunOptConfig> {
    public final Gson LIZ;

    public LiveConsumingFunOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveConsumingFunOptConfig read(C09CU c09cu) {
        LiveConsumingFunOptConfig liveConsumingFunOptConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveConsumingFunOptConfig = new LiveConsumingFunOptConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "setting_raw_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveConsumingFunOptConfig.setSettingRawOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "inbox_cache_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveConsumingFunOptConfig.setInboxCacheOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveConsumingFunOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveConsumingFunOptConfig liveConsumingFunOptConfig) throws IOException {
        LiveConsumingFunOptConfig liveConsumingFunOptConfig2 = liveConsumingFunOptConfig;
        if (liveConsumingFunOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("setting_raw_opt");
        c09dl.LJJJJJL(liveConsumingFunOptConfig2.getSettingRawOpt());
        c09dl.LJIILLIIL("inbox_cache_opt");
        c09dl.LJJJJJL(liveConsumingFunOptConfig2.getInboxCacheOpt());
        c09dl.LJII();
    }
}
