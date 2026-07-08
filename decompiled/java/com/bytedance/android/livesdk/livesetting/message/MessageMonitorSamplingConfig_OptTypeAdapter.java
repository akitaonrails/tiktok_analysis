package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MessageMonitorSamplingConfig_OptTypeAdapter extends TypeAdapter<MessageMonitorSamplingConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MessageMonitorSamplingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MessageMonitorSamplingConfig messageMonitorSamplingConfig = new MessageMonitorSamplingConfig(0.001d, 1.0d);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "zstd_compress_samping")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    messageMonitorSamplingConfig.setZstdSamplingRate(c09cu.LJJIL());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "log_sampling")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    messageMonitorSamplingConfig.setLogSamplingRate(c09cu.LJJIL());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return messageMonitorSamplingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MessageMonitorSamplingConfig messageMonitorSamplingConfig) throws IOException {
        MessageMonitorSamplingConfig messageMonitorSamplingConfig2 = messageMonitorSamplingConfig;
        if (messageMonitorSamplingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("zstd_compress_samping");
        c09dl.LJJIL(messageMonitorSamplingConfig2.getZstdSamplingRate());
        c09dl.LJIILLIIL("log_sampling");
        c09dl.LJJIL(messageMonitorSamplingConfig2.getLogSamplingRate());
        c09dl.LJII();
    }
}
