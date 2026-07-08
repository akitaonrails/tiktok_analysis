package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ReceiveMsgConfig_OptTypeAdapter extends TypeAdapter<ReceiveMsgConfig> {
    @Override // com.google.gson.TypeAdapter
    public final ReceiveMsgConfig read(C09CU c09cu) {
        ReceiveMsgConfig receiveMsgConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            receiveMsgConfig = new ReceiveMsgConfig(0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "delay_enqueue_milliseconds")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        receiveMsgConfig.delayEnqueueSec = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return receiveMsgConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ReceiveMsgConfig receiveMsgConfig) {
        ReceiveMsgConfig receiveMsgConfig2 = receiveMsgConfig;
        if (receiveMsgConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_enqueue_milliseconds");
        c09dl.LJJJJ(Integer.valueOf(receiveMsgConfig2.delayEnqueueSec));
        c09dl.LJII();
    }
}
