package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveFollowFeedDrawLoop_OptTypeAdapter extends TypeAdapter<LiveFollowFeedDrawLoop> {
    public final Gson LIZ;

    public LiveFollowFeedDrawLoop_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveFollowFeedDrawLoop read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop = new LiveFollowFeedDrawLoop();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "loop_enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFollowFeedDrawLoop.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "threshold")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFollowFeedDrawLoop.threshold = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveFollowFeedDrawLoop;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFollowFeedDrawLoop liveFollowFeedDrawLoop) throws IOException {
        LiveFollowFeedDrawLoop liveFollowFeedDrawLoop2 = liveFollowFeedDrawLoop;
        if (liveFollowFeedDrawLoop2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("loop_enable");
        c09dl.LJJJJJL(liveFollowFeedDrawLoop2.enable);
        c09dl.LJIILLIIL("threshold");
        c09dl.LJJJJ(Integer.valueOf(liveFollowFeedDrawLoop2.threshold));
        c09dl.LJII();
    }
}
