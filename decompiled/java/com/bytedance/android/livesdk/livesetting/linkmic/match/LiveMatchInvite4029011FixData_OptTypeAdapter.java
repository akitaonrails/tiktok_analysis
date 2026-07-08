package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveMatchInvite4029011FixData_OptTypeAdapter extends TypeAdapter<LiveMatchInvite4029011FixData> {
    public final Gson LIZ;

    public LiveMatchInvite4029011FixData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchInvite4029011FixData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchInvite4029011FixData liveMatchInvite4029011FixData = new LiveMatchInvite4029011FixData(false, 1500L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchInvite4029011FixData.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "delay")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMatchInvite4029011FixData.delay = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveMatchInvite4029011FixData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchInvite4029011FixData liveMatchInvite4029011FixData) throws IOException {
        LiveMatchInvite4029011FixData liveMatchInvite4029011FixData2 = liveMatchInvite4029011FixData;
        if (liveMatchInvite4029011FixData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(liveMatchInvite4029011FixData2.enabled);
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIZ(liveMatchInvite4029011FixData2.delay);
        c09dl.LJII();
    }
}
