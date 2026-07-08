package com.ss.ttm.player;

import android.media.audiofx.AudioEffect;

/* JADX INFO: loaded from: classes24.dex */
public class AudioFormats {
    public static final int[] LIZ = {4000, 8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static boolean isLicencedDolbyDevice() {
        if (LIZIZ) {
            return LIZJ;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        int length = descriptorArrQueryEffects.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (descriptorArrQueryEffects[i].implementor.contains("Dolby Laboratories")) {
                LIZJ = true;
                break;
            }
            i++;
        }
        LIZIZ = true;
        return LIZJ;
    }
}
