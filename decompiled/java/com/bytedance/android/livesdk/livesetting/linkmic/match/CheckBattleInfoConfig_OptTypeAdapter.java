package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class CheckBattleInfoConfig_OptTypeAdapter extends TypeAdapter<CheckBattleInfoConfig> {
    public final Gson LIZ;

    public CheckBattleInfoConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CheckBattleInfoConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CheckBattleInfoConfig checkBattleInfoConfig = new CheckBattleInfoConfig(false, 1.5f, 1, 2, 2, 2);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1838563601:
                        if (strLJJJJ.equals("avg_settling_message_cost")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkBattleInfoConfig.avg_settling_message_cost = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -929001209:
                        if (strLJJJJ.equals("retry_duration_when_enter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkBattleInfoConfig.retry_duration_when_enter = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 289356666:
                        if (strLJJJJ.equals("retry_count_when_enter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkBattleInfoConfig.retry_count_when_enter = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 403958833:
                        if (strLJJJJ.equals("retry_count_when_finish")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkBattleInfoConfig.retry_count_when_finish = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1289570372:
                        if (strLJJJJ.equals("retry_duration_when_finish")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkBattleInfoConfig.retry_duration_when_finish = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1901962167:
                        if (strLJJJJ.equals("avg_settling_cost")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                checkBattleInfoConfig.avg_settling_cost = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return checkBattleInfoConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CheckBattleInfoConfig checkBattleInfoConfig) throws IOException {
        CheckBattleInfoConfig checkBattleInfoConfig2 = checkBattleInfoConfig;
        if (checkBattleInfoConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("avg_settling_cost");
        c09dl.LJJJJJL(checkBattleInfoConfig2.avg_settling_cost);
        c09dl.LJIILLIIL("avg_settling_message_cost");
        c09dl.LJJJJ(Float.valueOf(checkBattleInfoConfig2.avg_settling_message_cost));
        c09dl.LJIILLIIL("retry_count_when_enter");
        c09dl.LJJJJ(Integer.valueOf(checkBattleInfoConfig2.retry_count_when_enter));
        c09dl.LJIILLIIL("retry_count_when_finish");
        c09dl.LJJJJ(Integer.valueOf(checkBattleInfoConfig2.retry_count_when_finish));
        c09dl.LJIILLIIL("retry_duration_when_enter");
        c09dl.LJJJJ(Integer.valueOf(checkBattleInfoConfig2.retry_duration_when_enter));
        c09dl.LJIILLIIL("retry_duration_when_finish");
        c09dl.LJJJJ(Integer.valueOf(checkBattleInfoConfig2.retry_duration_when_finish));
        c09dl.LJII();
    }
}
