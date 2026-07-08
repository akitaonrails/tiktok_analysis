package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkmicCountdownTimerPlayModeData_OptTypeAdapter extends TypeAdapter<LinkmicCountdownTimerPlayModeData> {
    public final Gson LIZ;

    public LinkmicCountdownTimerPlayModeData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkmicCountdownTimerPlayModeData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkmicCountdownTimerPlayModeData linkmicCountdownTimerPlayModeData = new LinkmicCountdownTimerPlayModeData(true, 3L, 3L, 60L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1750224328:
                        if (strLJJJJ.equals("enlarge_im_backup_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountdownTimerPlayModeData.enlargeImBackupDelayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 121395022:
                        if (strLJJJJ.equals("max_custom_count_down_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountdownTimerPlayModeData.maxCustomCountDownDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 773239066:
                        if (strLJJJJ.equals("end_countdown_down_req_backup_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountdownTimerPlayModeData.endCountdownReqBackupDelayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1969294724:
                        if (strLJJJJ.equals("enable_count_down_service")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountdownTimerPlayModeData.enableCountdownService = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return linkmicCountdownTimerPlayModeData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkmicCountdownTimerPlayModeData linkmicCountdownTimerPlayModeData) throws IOException {
        LinkmicCountdownTimerPlayModeData linkmicCountdownTimerPlayModeData2 = linkmicCountdownTimerPlayModeData;
        if (linkmicCountdownTimerPlayModeData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_count_down_service");
        c09dl.LJJJJJL(linkmicCountdownTimerPlayModeData2.enableCountdownService);
        c09dl.LJIILLIIL("enlarge_im_backup_delay_time");
        c09dl.LJJIZ(linkmicCountdownTimerPlayModeData2.enlargeImBackupDelayTime);
        c09dl.LJIILLIIL("end_countdown_down_req_backup_delay_time");
        c09dl.LJJIZ(linkmicCountdownTimerPlayModeData2.endCountdownReqBackupDelayTime);
        c09dl.LJIILLIIL("max_custom_count_down_duration");
        c09dl.LJJIZ(linkmicCountdownTimerPlayModeData2.maxCustomCountDownDuration);
        c09dl.LJII();
    }
}
