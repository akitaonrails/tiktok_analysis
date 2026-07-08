package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkmicSequentialEventReportConf_OptTypeAdapter extends TypeAdapter<LinkmicSequentialEventReportConf> {
    public final Gson LIZ;

    public LinkmicSequentialEventReportConf_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkmicSequentialEventReportConf read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkmicSequentialEventReportConf linkmicSequentialEventReportConf = new LinkmicSequentialEventReportConf(false, 300000L, 2048L, 300000L, Long.MAX_VALUE, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicSequentialEventReportConf.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -213782321:
                        if (strLJJJJ.equals("loop_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicSequentialEventReportConf.loopDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -96179731:
                        if (strLJJJJ.equals("expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicSequentialEventReportConf.expireTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 218779355:
                        if (strLJJJJ.equals("mem_caches")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicSequentialEventReportConf.memCaches = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 828858882:
                        if (strLJJJJ.equals("start_up_trigger_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicSequentialEventReportConf.startUpTriggerDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1135732128:
                        if (strLJJJJ.equals("time_slice")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicSequentialEventReportConf.timeSlice = c09cu.LJJJ();
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
        return linkmicSequentialEventReportConf;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkmicSequentialEventReportConf linkmicSequentialEventReportConf) throws IOException {
        LinkmicSequentialEventReportConf linkmicSequentialEventReportConf2 = linkmicSequentialEventReportConf;
        if (linkmicSequentialEventReportConf2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(linkmicSequentialEventReportConf2.enable);
        c09dl.LJIILLIIL("loop_duration");
        c09dl.LJJIZ(linkmicSequentialEventReportConf2.loopDuration);
        c09dl.LJIILLIIL("mem_caches");
        c09dl.LJJIZ(linkmicSequentialEventReportConf2.memCaches);
        c09dl.LJIILLIIL("expire_time");
        c09dl.LJJIZ(linkmicSequentialEventReportConf2.expireTime);
        c09dl.LJIILLIIL("time_slice");
        c09dl.LJJIZ(linkmicSequentialEventReportConf2.timeSlice);
        c09dl.LJIILLIIL("start_up_trigger_duration");
        c09dl.LJJIZ(linkmicSequentialEventReportConf2.startUpTriggerDuration);
        c09dl.LJII();
    }
}
