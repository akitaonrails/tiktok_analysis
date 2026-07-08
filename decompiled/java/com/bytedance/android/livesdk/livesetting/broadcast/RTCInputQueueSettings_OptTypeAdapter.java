package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RTCInputQueueSettings_OptTypeAdapter extends TypeAdapter<RTCInputQueueSettings> {
    public final Gson LIZ;

    public RTCInputQueueSettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RTCInputQueueSettings read(C09CU c09cu) {
        RTCInputQueueSettings rTCInputQueueSettings = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rTCInputQueueSettings = new RTCInputQueueSettings(false, TTLSRTCInputQueueSettings.INSTANCE.getDEFAULT_QUEUE_SIZE());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rTCInputQueueSettings.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "queue_size")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rTCInputQueueSettings.queueSize = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rTCInputQueueSettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RTCInputQueueSettings rTCInputQueueSettings) throws IOException {
        RTCInputQueueSettings rTCInputQueueSettings2 = rTCInputQueueSettings;
        if (rTCInputQueueSettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(rTCInputQueueSettings2.enable);
        c09dl.LJIILLIIL("queue_size");
        c09dl.LJJJJ(Integer.valueOf(rTCInputQueueSettings2.queueSize));
        c09dl.LJII();
    }
}
