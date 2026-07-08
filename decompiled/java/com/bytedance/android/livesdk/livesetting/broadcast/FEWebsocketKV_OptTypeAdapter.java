package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FEWebsocketKV_OptTypeAdapter extends TypeAdapter<FEWebsocketKV> {
    @Override // com.google.gson.TypeAdapter
    public final FEWebsocketKV read(C09CU c09cu) {
        FEWebsocketKV fEWebsocketKV = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            fEWebsocketKV = new FEWebsocketKV(-1, -1);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "service_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fEWebsocketKV.serviceId = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "method_id")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fEWebsocketKV.methodId = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return fEWebsocketKV;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FEWebsocketKV fEWebsocketKV) {
        FEWebsocketKV fEWebsocketKV2 = fEWebsocketKV;
        if (fEWebsocketKV2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("service_id");
        c09dl.LJJJJ(Integer.valueOf(fEWebsocketKV2.serviceId));
        c09dl.LJIILLIIL("method_id");
        c09dl.LJJJJ(Integer.valueOf(fEWebsocketKV2.methodId));
        c09dl.LJII();
    }
}
