package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedPublicScreenMaxMessageConfig;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveExtendedPublicScreenMaxMessageConfig_BufferConfig_OptTypeAdapter extends TypeAdapter<LiveExtendedPublicScreenMaxMessageConfig.BufferConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveExtendedPublicScreenMaxMessageConfig.BufferConfig read(C09CU c09cu) throws IOException {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveExtendedPublicScreenMaxMessageConfig.BufferConfig bufferConfig = new LiveExtendedPublicScreenMaxMessageConfig.BufferConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "max_message_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    int iLJJIZ = c09cu.LJJIZ();
                    if (iLJJIZ <= 0) {
                        iLJJIZ = 200;
                    }
                    bufferConfig.maxMessageCount = iLJJIZ;
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return bufferConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveExtendedPublicScreenMaxMessageConfig.BufferConfig bufferConfig) {
        LiveExtendedPublicScreenMaxMessageConfig.BufferConfig bufferConfig2 = bufferConfig;
        if (bufferConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_message_count");
        c09dl.LJJJJ(Integer.valueOf(bufferConfig2.maxMessageCount));
        c09dl.LJII();
    }
}
