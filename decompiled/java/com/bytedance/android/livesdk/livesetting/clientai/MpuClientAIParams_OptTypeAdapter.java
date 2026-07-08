package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class MpuClientAIParams_OptTypeAdapter extends TypeAdapter<MpuClientAIParams> {
    public final Gson LIZ;

    public MpuClientAIParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MpuClientAIParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MpuClientAIParams mpuClientAIParams = new MpuClientAIParams(null, 0L, 0L, 0L, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -773885218:
                        if (strLJJJJ.equals("match_score_report_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mpuClientAIParams.scoreReportStart = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -513747898:
                        if (strLJJJJ.equals("match_time_left_special_moment")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mpuClientAIParams.matchTimeLiftSpecialMoment = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1119019378:
                        if (strLJJJJ.equals("match_score_change_frequency_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mpuClientAIParams.scoreChangeFrequencyControl = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1281861207:
                        if (strLJJJJ.equals("match_score_report_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mpuClientAIParams.scoreReportEnd = c09cu.LJJJ();
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
        return mpuClientAIParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MpuClientAIParams mpuClientAIParams) throws IOException {
        MpuClientAIParams mpuClientAIParams2 = mpuClientAIParams;
        if (mpuClientAIParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("match_time_left_special_moment");
        C473040Igo.LIZLLL(this.LIZ, c09dl, mpuClientAIParams2.matchTimeLiftSpecialMoment, Long.TYPE);
        c09dl.LJIILLIIL("match_score_change_frequency_control");
        c09dl.LJJIZ(mpuClientAIParams2.scoreChangeFrequencyControl);
        c09dl.LJIILLIIL("match_score_report_start");
        c09dl.LJJIZ(mpuClientAIParams2.scoreReportStart);
        c09dl.LJIILLIIL("match_score_report_end");
        c09dl.LJJIZ(mpuClientAIParams2.scoreReportEnd);
        c09dl.LJII();
    }
}
