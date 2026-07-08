package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveGameSafetyReporterSetting_GameLiveSafetyReporterConfig_OptTypeAdapter extends TypeAdapter<LiveGameSafetyReporterSetting.GameLiveSafetyReporterConfig> {
    public final Gson LIZ;

    public LiveGameSafetyReporterSetting_GameLiveSafetyReporterConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveGameSafetyReporterSetting.GameLiveSafetyReporterConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameSafetyReporterSetting.GameLiveSafetyReporterConfig gameLiveSafetyReporterConfig = new LiveGameSafetyReporterSetting.GameLiveSafetyReporterConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1545477013) {
                    if (iHashCode != -889473228) {
                        if (iHashCode == -166503568 && strLJJJJ.equals("report_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveSafetyReporterConfig.reportInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("switch")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gameLiveSafetyReporterConfig.f29switch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("threshold")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameLiveSafetyReporterConfig.threshold = c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameLiveSafetyReporterConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameSafetyReporterSetting.GameLiveSafetyReporterConfig gameLiveSafetyReporterConfig) throws IOException {
        LiveGameSafetyReporterSetting.GameLiveSafetyReporterConfig gameLiveSafetyReporterConfig2 = gameLiveSafetyReporterConfig;
        if (gameLiveSafetyReporterConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("switch");
        c09dl.LJJJJJL(gameLiveSafetyReporterConfig2.f29switch);
        c09dl.LJIILLIIL("report_interval");
        c09dl.LJJIZ(gameLiveSafetyReporterConfig2.reportInterval);
        c09dl.LJIILLIIL("threshold");
        c09dl.LJJIL(gameLiveSafetyReporterConfig2.threshold);
        c09dl.LJII();
    }
}
