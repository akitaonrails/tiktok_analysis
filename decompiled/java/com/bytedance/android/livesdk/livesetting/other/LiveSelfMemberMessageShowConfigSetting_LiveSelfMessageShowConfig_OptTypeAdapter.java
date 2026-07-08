package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfMemberMessageShowConfigSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveSelfMemberMessageShowConfigSetting_LiveSelfMessageShowConfig_OptTypeAdapter extends TypeAdapter<LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig read(C09CU c09cu) {
        LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig liveSelfMessageShowConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            liveSelfMessageShowConfig = new LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig(0L);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "delay")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveSelfMessageShowConfig.delay = c09cu.LJJJ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return liveSelfMessageShowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig liveSelfMessageShowConfig) throws IOException {
        LiveSelfMemberMessageShowConfigSetting.LiveSelfMessageShowConfig liveSelfMessageShowConfig2 = liveSelfMessageShowConfig;
        if (liveSelfMessageShowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay");
        c09dl.LJJIZ(liveSelfMessageShowConfig2.delay);
        c09dl.LJII();
    }
}
