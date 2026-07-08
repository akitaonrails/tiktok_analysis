package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgEnqueueConfig_OptTypeAdapter extends TypeAdapter<MsgEnqueueConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MsgEnqueueConfig read(C09CU c09cu) {
        MsgEnqueueConfig msgEnqueueConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            msgEnqueueConfig = new MsgEnqueueConfig("");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "sort_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        msgEnqueueConfig.sortType = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return msgEnqueueConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgEnqueueConfig msgEnqueueConfig) {
        MsgEnqueueConfig msgEnqueueConfig2 = msgEnqueueConfig;
        if (msgEnqueueConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sort_type");
        c09dl.LJJJJJ(msgEnqueueConfig2.sortType);
        c09dl.LJII();
    }
}
