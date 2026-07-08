package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePlayerLogIdConfigData_OptTypeAdapter extends TypeAdapter<LivePlayerLogIdConfigData> {
    public final Gson LIZ;

    public LivePlayerLogIdConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePlayerLogIdConfigData read(C09CU c09cu) {
        LivePlayerLogIdConfigData livePlayerLogIdConfigData = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePlayerLogIdConfigData = new LivePlayerLogIdConfigData(true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "enable_pass_log_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePlayerLogIdConfigData.enablePassLogId = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePlayerLogIdConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePlayerLogIdConfigData livePlayerLogIdConfigData) throws IOException {
        LivePlayerLogIdConfigData livePlayerLogIdConfigData2 = livePlayerLogIdConfigData;
        if (livePlayerLogIdConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_pass_log_id");
        c09dl.LJJJJJL(livePlayerLogIdConfigData2.enablePassLogId);
        c09dl.LJII();
    }
}
