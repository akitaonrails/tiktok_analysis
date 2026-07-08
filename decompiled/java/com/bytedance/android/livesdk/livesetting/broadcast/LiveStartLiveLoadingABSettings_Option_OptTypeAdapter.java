package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStartLiveLoadingABSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveStartLiveLoadingABSettings_Option_OptTypeAdapter extends TypeAdapter<LiveStartLiveLoadingABSettings.Option> {
    @Override // com.google.gson.TypeAdapter
    public final LiveStartLiveLoadingABSettings.Option read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveStartLiveLoadingABSettings.Option option = new LiveStartLiveLoadingABSettings.Option(0, 300L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    option.enable = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "delay_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    option.delayTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return option;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveStartLiveLoadingABSettings.Option option) throws IOException {
        LiveStartLiveLoadingABSettings.Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJ(Integer.valueOf(option2.enable));
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJIZ(option2.delayTime);
        c09dl.LJII();
    }
}
