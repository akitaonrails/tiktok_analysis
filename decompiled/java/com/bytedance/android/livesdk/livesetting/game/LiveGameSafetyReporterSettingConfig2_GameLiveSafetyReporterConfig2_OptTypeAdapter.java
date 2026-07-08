package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSettingConfig2;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveGameSafetyReporterSettingConfig2_GameLiveSafetyReporterConfig2_OptTypeAdapter extends TypeAdapter<LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 gameLiveSafetyReporterConfig2 = new LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1972524373:
                        if (strLJJJJ.equals("voice_db")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveSafetyReporterConfig2.voiceDB = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3540684:
                        if (strLJJJJ.equals("step")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveSafetyReporterConfig2.step = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 94851343:
                        if (strLJJJJ.equals("count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveSafetyReporterConfig2.count = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 351608024:
                        if (strLJJJJ.equals("version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveSafetyReporterConfig2.version = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 603868546:
                        if (strLJJJJ.equals("init_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveSafetyReporterConfig2.initValue = c09cu.LJJIZ();
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
        return gameLiveSafetyReporterConfig2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 gameLiveSafetyReporterConfig2) {
        LiveGameSafetyReporterSettingConfig2.GameLiveSafetyReporterConfig2 gameLiveSafetyReporterConfig22 = gameLiveSafetyReporterConfig2;
        if (gameLiveSafetyReporterConfig22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("init_value");
        c09dl.LJJJJ(Integer.valueOf(gameLiveSafetyReporterConfig22.initValue));
        c09dl.LJIILLIIL("step");
        c09dl.LJJJJ(Integer.valueOf(gameLiveSafetyReporterConfig22.step));
        c09dl.LJIILLIIL("count");
        c09dl.LJJJJ(Integer.valueOf(gameLiveSafetyReporterConfig22.count));
        c09dl.LJIILLIIL("voice_db");
        c09dl.LJJJJ(Integer.valueOf(gameLiveSafetyReporterConfig22.voiceDB));
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJ(Integer.valueOf(gameLiveSafetyReporterConfig22.version));
        c09dl.LJII();
    }
}
