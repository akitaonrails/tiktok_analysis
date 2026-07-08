package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastMemoryCleanConfigLocalTest_OptTypeAdapter extends TypeAdapter<BroadcastMemoryCleanConfigLocalTest> {
    public final Gson LIZ;

    public BroadcastMemoryCleanConfigLocalTest_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BroadcastMemoryCleanConfigLocalTest read(C09CU c09cu) {
        BroadcastMemoryCleanConfigLocalTest broadcastMemoryCleanConfigLocalTest = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            broadcastMemoryCleanConfigLocalTest = new BroadcastMemoryCleanConfigLocalTest(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable_low")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        broadcastMemoryCleanConfigLocalTest.setEnableLow(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_critical")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        broadcastMemoryCleanConfigLocalTest.setEnableCritical(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return broadcastMemoryCleanConfigLocalTest;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BroadcastMemoryCleanConfigLocalTest broadcastMemoryCleanConfigLocalTest) throws IOException {
        BroadcastMemoryCleanConfigLocalTest broadcastMemoryCleanConfigLocalTest2 = broadcastMemoryCleanConfigLocalTest;
        if (broadcastMemoryCleanConfigLocalTest2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_low");
        c09dl.LJJJJJL(broadcastMemoryCleanConfigLocalTest2.getEnableLow());
        c09dl.LJIILLIIL("enable_critical");
        c09dl.LJJJJJL(broadcastMemoryCleanConfigLocalTest2.getEnableCritical());
        c09dl.LJII();
    }
}
