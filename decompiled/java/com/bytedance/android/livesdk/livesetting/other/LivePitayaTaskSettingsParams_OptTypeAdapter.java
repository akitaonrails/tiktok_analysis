package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePitayaTaskSettingsParams_OptTypeAdapter extends TypeAdapter<LivePitayaTaskSettingsParams> {
    @Override // com.google.gson.TypeAdapter
    public final LivePitayaTaskSettingsParams read(C09CU c09cu) {
        LivePitayaTaskSettingsParams livePitayaTaskSettingsParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            livePitayaTaskSettingsParams = new LivePitayaTaskSettingsParams(500L);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "task_execution_period")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePitayaTaskSettingsParams.period = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return livePitayaTaskSettingsParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePitayaTaskSettingsParams livePitayaTaskSettingsParams) throws IOException {
        LivePitayaTaskSettingsParams livePitayaTaskSettingsParams2 = livePitayaTaskSettingsParams;
        if (livePitayaTaskSettingsParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("task_execution_period");
        c09dl.LJJIZ(livePitayaTaskSettingsParams2.period);
        c09dl.LJII();
    }
}
