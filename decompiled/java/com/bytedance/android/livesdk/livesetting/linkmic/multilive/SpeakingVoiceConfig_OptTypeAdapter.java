package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class SpeakingVoiceConfig_OptTypeAdapter extends TypeAdapter<SpeakingVoiceConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SpeakingVoiceConfig read(C09CU c09cu) {
        SpeakingVoiceConfig speakingVoiceConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            speakingVoiceConfig = new SpeakingVoiceConfig(120, 180);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "voice_low_value")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        speakingVoiceConfig.setLow(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "voice_high_value")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        speakingVoiceConfig.setHigh(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return speakingVoiceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SpeakingVoiceConfig speakingVoiceConfig) {
        SpeakingVoiceConfig speakingVoiceConfig2 = speakingVoiceConfig;
        if (speakingVoiceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("voice_low_value");
        c09dl.LJJJJ(Integer.valueOf(speakingVoiceConfig2.getLow()));
        c09dl.LJIILLIIL("voice_high_value");
        c09dl.LJJJJ(Integer.valueOf(speakingVoiceConfig2.getHigh()));
        c09dl.LJII();
    }
}
