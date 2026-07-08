package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePlayerSessionIdConfigData_OptTypeAdapter extends TypeAdapter<LivePlayerSessionIdConfigData> {
    public final Gson LIZ;

    public LivePlayerSessionIdConfigData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePlayerSessionIdConfigData read(C09CU c09cu) {
        LivePlayerSessionIdConfigData livePlayerSessionIdConfigData = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePlayerSessionIdConfigData = new LivePlayerSessionIdConfigData(true, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_pass_session_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePlayerSessionIdConfigData.enablePassSessionId = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_compact_logic_of_session_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePlayerSessionIdConfigData.enableCompactLogicOfSessionId = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePlayerSessionIdConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePlayerSessionIdConfigData livePlayerSessionIdConfigData) throws IOException {
        LivePlayerSessionIdConfigData livePlayerSessionIdConfigData2 = livePlayerSessionIdConfigData;
        if (livePlayerSessionIdConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_pass_session_id");
        c09dl.LJJJJJL(livePlayerSessionIdConfigData2.enablePassSessionId);
        c09dl.LJIILLIIL("enable_compact_logic_of_session_id");
        c09dl.LJJJJJL(livePlayerSessionIdConfigData2.enableCompactLogicOfSessionId);
        c09dl.LJII();
    }
}
