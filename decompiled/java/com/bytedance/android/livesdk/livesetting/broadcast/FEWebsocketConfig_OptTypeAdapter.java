package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FEWebsocketConfig_OptTypeAdapter extends TypeAdapter<FEWebsocketConfig> {
    public final Gson LIZ;

    public FEWebsocketConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FEWebsocketConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FEWebsocketConfig fEWebsocketConfig = new FEWebsocketConfig(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "kv_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    fEWebsocketConfig.kvList = C473040Igo.LIZ(this.LIZ, c09cu, FEWebsocketKV.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return fEWebsocketConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FEWebsocketConfig fEWebsocketConfig) {
        FEWebsocketConfig fEWebsocketConfig2 = fEWebsocketConfig;
        if (fEWebsocketConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("kv_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, fEWebsocketConfig2.kvList, FEWebsocketKV.class);
        c09dl.LJII();
    }
}
