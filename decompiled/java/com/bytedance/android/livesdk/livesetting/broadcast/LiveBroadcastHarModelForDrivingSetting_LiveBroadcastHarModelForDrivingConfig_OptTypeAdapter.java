package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastHarModelForDrivingSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveBroadcastHarModelForDrivingSetting_LiveBroadcastHarModelForDrivingConfig_OptTypeAdapter extends TypeAdapter<LiveBroadcastHarModelForDrivingSetting.LiveBroadcastHarModelForDrivingConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveBroadcastHarModelForDrivingSetting.LiveBroadcastHarModelForDrivingConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBroadcastHarModelForDrivingSetting.LiveBroadcastHarModelForDrivingConfig liveBroadcastHarModelForDrivingConfig = new LiveBroadcastHarModelForDrivingSetting.LiveBroadcastHarModelForDrivingConfig(10000L, 30000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "delay_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveBroadcastHarModelForDrivingConfig.delayTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "period_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveBroadcastHarModelForDrivingConfig.periodTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveBroadcastHarModelForDrivingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBroadcastHarModelForDrivingSetting.LiveBroadcastHarModelForDrivingConfig liveBroadcastHarModelForDrivingConfig) throws IOException {
        LiveBroadcastHarModelForDrivingSetting.LiveBroadcastHarModelForDrivingConfig liveBroadcastHarModelForDrivingConfig2 = liveBroadcastHarModelForDrivingConfig;
        if (liveBroadcastHarModelForDrivingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(liveBroadcastHarModelForDrivingConfig2.delayTime);
        c09dl.LJIILLIIL("period_time");
        c09dl.LJJIZ(liveBroadcastHarModelForDrivingConfig2.periodTime);
        c09dl.LJII();
    }
}
