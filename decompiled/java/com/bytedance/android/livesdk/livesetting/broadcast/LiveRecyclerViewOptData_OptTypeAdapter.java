package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecyclerViewOptData_OptTypeAdapter extends TypeAdapter<LiveRecyclerViewOptData> {
    public final Gson LIZ;

    public LiveRecyclerViewOptData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRecyclerViewOptData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRecyclerViewOptData liveRecyclerViewOptData = new LiveRecyclerViewOptData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveRecyclerViewOptData.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "panel_dy_map")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveRecyclerViewOptData.dyMap = C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveRecyclerViewOptData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRecyclerViewOptData liveRecyclerViewOptData) throws IOException {
        LiveRecyclerViewOptData liveRecyclerViewOptData2 = liveRecyclerViewOptData;
        if (liveRecyclerViewOptData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(liveRecyclerViewOptData2.enabled);
        c09dl.LJIILLIIL("panel_dy_map");
        C473040Igo.LJ(this.LIZ, c09dl, liveRecyclerViewOptData2.dyMap, Integer.TYPE);
        c09dl.LJII();
    }
}
