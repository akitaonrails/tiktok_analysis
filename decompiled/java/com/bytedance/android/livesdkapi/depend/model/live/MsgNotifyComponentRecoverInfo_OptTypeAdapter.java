package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgNotifyComponentRecoverInfo_OptTypeAdapter extends TypeAdapter<MsgNotifyComponentRecoverInfo> {
    public final Gson LIZ;

    public MsgNotifyComponentRecoverInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MsgNotifyComponentRecoverInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo = new MsgNotifyComponentRecoverInfo();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "delay_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgNotifyComponentRecoverInfo.delayMs = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "recover")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    msgNotifyComponentRecoverInfo.recover = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return msgNotifyComponentRecoverInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo) throws IOException {
        MsgNotifyComponentRecoverInfo msgNotifyComponentRecoverInfo2 = msgNotifyComponentRecoverInfo;
        if (msgNotifyComponentRecoverInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_ms");
        c09dl.LJJIZ(msgNotifyComponentRecoverInfo2.delayMs);
        c09dl.LJIILLIIL("recover");
        c09dl.LJJJJJL(msgNotifyComponentRecoverInfo2.recover);
        c09dl.LJII();
    }
}
