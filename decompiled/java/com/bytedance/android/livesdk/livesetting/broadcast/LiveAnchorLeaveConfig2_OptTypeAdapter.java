package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveAnchorLeaveConfig2_OptTypeAdapter extends TypeAdapter<LiveAnchorLeaveConfig2> {
    public final Gson LIZ;

    public LiveAnchorLeaveConfig2_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveAnchorLeaveConfig2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveAnchorLeaveConfig2 liveAnchorLeaveConfig2 = new LiveAnchorLeaveConfig2(false, 60000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_leave_opt")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveAnchorLeaveConfig2.setEnableLeaveOpt(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_anchor_leave_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveAnchorLeaveConfig2.setAnchorLeaveTime(c09cu.LJJJ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveAnchorLeaveConfig2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveAnchorLeaveConfig2 liveAnchorLeaveConfig2) throws IOException {
        LiveAnchorLeaveConfig2 liveAnchorLeaveConfig22 = liveAnchorLeaveConfig2;
        if (liveAnchorLeaveConfig22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_leave_opt");
        c09dl.LJJJJJL(liveAnchorLeaveConfig22.getEnableLeaveOpt());
        c09dl.LJIILLIIL("live_anchor_leave_time");
        c09dl.LJJIZ(liveAnchorLeaveConfig22.getAnchorLeaveTime());
        c09dl.LJII();
    }
}
