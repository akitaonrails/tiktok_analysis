package com.bytedance.android.livesdk.livesetting.grouplive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TimedCompetitionConfigModel_OptTypeAdapter extends TypeAdapter<TimedCompetitionConfigModel> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TimedCompetitionConfigModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TimedCompetitionConfigModel timedCompetitionConfigModel = new TimedCompetitionConfigModel(10, 2, 5, 2);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -930653110:
                        if (strLJJJJ.equals("check_result_delay_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                timedCompetitionConfigModel.checkResultDisplaySec = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1525311719:
                        if (strLJJJJ.equals("check_result_retry_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                timedCompetitionConfigModel.checkResultRetryInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1608103474:
                        if (strLJJJJ.equals("result_display_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                timedCompetitionConfigModel.resultDisplaySec = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1876824109:
                        if (strLJJJJ.equals("check_result_retry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                timedCompetitionConfigModel.checkResultRetryCount = c09cu.LJJIZ();
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
        return timedCompetitionConfigModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TimedCompetitionConfigModel timedCompetitionConfigModel) {
        TimedCompetitionConfigModel timedCompetitionConfigModel2 = timedCompetitionConfigModel;
        if (timedCompetitionConfigModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("result_display_sec");
        c09dl.LJJJJ(Integer.valueOf(timedCompetitionConfigModel2.resultDisplaySec));
        c09dl.LJIILLIIL("check_result_delay_sec");
        c09dl.LJJJJ(Integer.valueOf(timedCompetitionConfigModel2.checkResultDisplaySec));
        c09dl.LJIILLIIL("check_result_retry_count");
        c09dl.LJJJJ(Integer.valueOf(timedCompetitionConfigModel2.checkResultRetryCount));
        c09dl.LJIILLIIL("check_result_retry_interval");
        c09dl.LJJJJ(Integer.valueOf(timedCompetitionConfigModel2.checkResultRetryInterval));
        c09dl.LJII();
    }
}
