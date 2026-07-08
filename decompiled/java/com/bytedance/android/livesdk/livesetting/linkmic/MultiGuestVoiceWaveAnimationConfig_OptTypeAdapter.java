package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestVoiceWaveAnimationConfig_OptTypeAdapter extends TypeAdapter<MultiGuestVoiceWaveAnimationConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MultiGuestVoiceWaveAnimationConfig read(C09CU c09cu) {
        MultiGuestVoiceWaveAnimationConfig multiGuestVoiceWaveAnimationConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiGuestVoiceWaveAnimationConfig = new MultiGuestVoiceWaveAnimationConfig(2, 10);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "loop_count")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestVoiceWaveAnimationConfig.loopCount = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "frame_duration_ms")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestVoiceWaveAnimationConfig.frameDurationMs = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiGuestVoiceWaveAnimationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestVoiceWaveAnimationConfig multiGuestVoiceWaveAnimationConfig) {
        MultiGuestVoiceWaveAnimationConfig multiGuestVoiceWaveAnimationConfig2 = multiGuestVoiceWaveAnimationConfig;
        if (multiGuestVoiceWaveAnimationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("loop_count");
        c09dl.LJJJJ(Integer.valueOf(multiGuestVoiceWaveAnimationConfig2.loopCount));
        c09dl.LJIILLIIL("frame_duration_ms");
        c09dl.LJJJJ(Integer.valueOf(multiGuestVoiceWaveAnimationConfig2.frameDurationMs));
        c09dl.LJII();
    }
}
