package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageFirstScreenAnimation;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMessageFirstScreenAnimation_LiveMessageFirstScreenAnimationConfig_OptTypeAdapter extends TypeAdapter<LiveMessageFirstScreenAnimation.LiveMessageFirstScreenAnimationConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveMessageFirstScreenAnimation.LiveMessageFirstScreenAnimationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMessageFirstScreenAnimation.LiveMessageFirstScreenAnimationConfig liveMessageFirstScreenAnimationConfig = new LiveMessageFirstScreenAnimation.LiveMessageFirstScreenAnimationConfig(0, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "animate_type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMessageFirstScreenAnimationConfig.type = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "animate_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveMessageFirstScreenAnimationConfig.duration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveMessageFirstScreenAnimationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMessageFirstScreenAnimation.LiveMessageFirstScreenAnimationConfig liveMessageFirstScreenAnimationConfig) throws IOException {
        LiveMessageFirstScreenAnimation.LiveMessageFirstScreenAnimationConfig liveMessageFirstScreenAnimationConfig2 = liveMessageFirstScreenAnimationConfig;
        if (liveMessageFirstScreenAnimationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("animate_type");
        c09dl.LJJJJ(Integer.valueOf(liveMessageFirstScreenAnimationConfig2.type));
        c09dl.LJIILLIIL("animate_duration");
        c09dl.LJJIZ(liveMessageFirstScreenAnimationConfig2.duration);
        c09dl.LJII();
    }
}
