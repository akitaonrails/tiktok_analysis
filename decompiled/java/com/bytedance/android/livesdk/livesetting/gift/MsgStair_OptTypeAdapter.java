package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgStair_OptTypeAdapter extends TypeAdapter<MsgStair> {
    @Override // com.google.gson.TypeAdapter
    public final MsgStair read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MsgStair msgStair = new MsgStair();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "min_msg_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgStair._minMsgCount = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_msg_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgStair._maxMsgCount = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return msgStair;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgStair msgStair) {
        MsgStair msgStair2 = msgStair;
        if (msgStair2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_msg_count");
        c09dl.LJJJJ(Integer.valueOf(msgStair2._minMsgCount));
        c09dl.LJIILLIIL("max_msg_count");
        c09dl.LJJJJ(Integer.valueOf(msgStair2._maxMsgCount));
        c09dl.LJII();
    }
}
