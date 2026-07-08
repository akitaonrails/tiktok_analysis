package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastMemoryCleanConfig_OptTypeAdapter extends TypeAdapter<BroadcastMemoryCleanConfig> {
    public final Gson LIZ;

    public BroadcastMemoryCleanConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final BroadcastMemoryCleanConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BroadcastMemoryCleanConfig broadcastMemoryCleanConfig = new BroadcastMemoryCleanConfig(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "critical_destroy_page_whitelist")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    broadcastMemoryCleanConfig.setCriticalDestroyPageWhitelist(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return broadcastMemoryCleanConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BroadcastMemoryCleanConfig broadcastMemoryCleanConfig) {
        BroadcastMemoryCleanConfig broadcastMemoryCleanConfig2 = broadcastMemoryCleanConfig;
        if (broadcastMemoryCleanConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("critical_destroy_page_whitelist");
        C473040Igo.LIZLLL(this.LIZ, c09dl, broadcastMemoryCleanConfig2.getCriticalDestroyPageWhitelist(), String.class);
        c09dl.LJII();
    }
}
