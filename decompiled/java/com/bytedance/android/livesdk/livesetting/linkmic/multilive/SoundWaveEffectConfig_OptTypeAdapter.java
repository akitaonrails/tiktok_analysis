package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class SoundWaveEffectConfig_OptTypeAdapter extends TypeAdapter<SoundWaveEffectConfig> {
    public final Gson LIZ;

    public SoundWaveEffectConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SoundWaveEffectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SoundWaveEffectConfig soundWaveEffectConfig = new SoundWaveEffectConfig(false, 30, 400L, 600L, 900L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                soundWaveEffectConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1046816879:
                        if (strLJJJJ.equals("high_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                soundWaveEffectConfig.highDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -353871329:
                        if (strLJJJJ.equals("low_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                soundWaveEffectConfig.lowDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 101609:
                        if (strLJJJJ.equals("fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                soundWaveEffectConfig.fps = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1405774251:
                        if (strLJJJJ.equals("mid_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                soundWaveEffectConfig.midDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return soundWaveEffectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SoundWaveEffectConfig soundWaveEffectConfig) throws IOException {
        SoundWaveEffectConfig soundWaveEffectConfig2 = soundWaveEffectConfig;
        if (soundWaveEffectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(soundWaveEffectConfig2.enable);
        c09dl.LJIILLIIL("fps");
        c09dl.LJJJJ(Integer.valueOf(soundWaveEffectConfig2.fps));
        c09dl.LJIILLIIL("low_duration");
        c09dl.LJJIZ(soundWaveEffectConfig2.lowDuration);
        c09dl.LJIILLIIL("mid_duration");
        c09dl.LJJIZ(soundWaveEffectConfig2.midDuration);
        c09dl.LJIILLIIL("high_duration");
        c09dl.LJJIZ(soundWaveEffectConfig2.highDuration);
        c09dl.LJII();
    }
}
