package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioChatWatermarkResolution_OptTypeAdapter extends TypeAdapter<AudioChatWatermarkResolution> {
    @Override // com.google.gson.TypeAdapter
    public final AudioChatWatermarkResolution read(C09CU c09cu) {
        AudioChatWatermarkResolution audioChatWatermarkResolution = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            audioChatWatermarkResolution = new AudioChatWatermarkResolution(240, 240);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "w")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        audioChatWatermarkResolution.w = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "h")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        audioChatWatermarkResolution.h = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return audioChatWatermarkResolution;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AudioChatWatermarkResolution audioChatWatermarkResolution) {
        AudioChatWatermarkResolution audioChatWatermarkResolution2 = audioChatWatermarkResolution;
        if (audioChatWatermarkResolution2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("w");
        c09dl.LJJJJ(Integer.valueOf(audioChatWatermarkResolution2.w));
        c09dl.LJIILLIIL("h");
        c09dl.LJJJJ(Integer.valueOf(audioChatWatermarkResolution2.h));
        c09dl.LJII();
    }
}
