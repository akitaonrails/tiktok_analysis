package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCoHostFollowPromptSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostFollowPromptSetting_Configs_OptTypeAdapter extends TypeAdapter<MultiCoHostFollowPromptSetting.Configs> {
    @Override // com.google.gson.TypeAdapter
    public final MultiCoHostFollowPromptSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiCoHostFollowPromptSetting.Configs configs = new MultiCoHostFollowPromptSetting.Configs(10000L, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "auto_dismiss_time_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.autoDismissTimeMs = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_show_time_per_room")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.maxShowTimePerRoom = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiCoHostFollowPromptSetting.Configs configs) throws IOException {
        MultiCoHostFollowPromptSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("auto_dismiss_time_ms");
        c09dl.LJJIZ(configs2.autoDismissTimeMs);
        c09dl.LJIILLIIL("max_show_time_per_room");
        c09dl.LJJJJ(Integer.valueOf(configs2.maxShowTimePerRoom));
        c09dl.LJII();
    }
}
