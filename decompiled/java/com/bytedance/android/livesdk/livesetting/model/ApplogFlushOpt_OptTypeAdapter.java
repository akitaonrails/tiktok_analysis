package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class ApplogFlushOpt_OptTypeAdapter extends TypeAdapter<ApplogFlushOpt> {
    public final Gson LIZ;

    public ApplogFlushOpt_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ApplogFlushOpt read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ApplogFlushOpt applogFlushOpt = new ApplogFlushOpt();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1446942451:
                        if (strLJJJJ.equals("ttlive_applog_flush_gap_duration_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.flushGapDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -921235412:
                        if (strLJJJJ.equals("ttlive_applog_flush_watch_room_delay_duration_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.flushWatchRoomDelayDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -913147430:
                        if (strLJJJJ.equals("ttlive_report_log_in_handle_thread")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.isReportOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -724711518:
                        if (strLJJJJ.equals("ttlive_applog_flush_is_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.isOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -669166572:
                        if (strLJJJJ.equals("ttlive_applog_flush_leave_room_delay_duration_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.flushLeaveRoomDelayDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 102079378:
                        if (strLJJJJ.equals("ttlive_applog_flush_leave_room_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.flushLeaveRoomType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 994333610:
                        if (strLJJJJ.equals("ttlive_applog_flush_watch_room_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.flushWatchRoomType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1038414503:
                        if (strLJJJJ.equals("ttlive_applog_flush_background_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                applogFlushOpt.flushBackgroundType = c09cu.LJJIZ();
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
        return applogFlushOpt;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ApplogFlushOpt applogFlushOpt) throws IOException {
        ApplogFlushOpt applogFlushOpt2 = applogFlushOpt;
        if (applogFlushOpt2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlive_applog_flush_is_opt");
        c09dl.LJJJJJL(applogFlushOpt2.isOpt);
        c09dl.LJIILLIIL("ttlive_applog_flush_background_type");
        c09dl.LJJJJ(Integer.valueOf(applogFlushOpt2.flushBackgroundType));
        c09dl.LJIILLIIL("ttlive_applog_flush_leave_room_type");
        c09dl.LJJJJ(Integer.valueOf(applogFlushOpt2.flushLeaveRoomType));
        c09dl.LJIILLIIL("ttlive_applog_flush_leave_room_delay_duration_threshold");
        c09dl.LJJIZ(applogFlushOpt2.flushLeaveRoomDelayDuration);
        c09dl.LJIILLIIL("ttlive_applog_flush_watch_room_type");
        c09dl.LJJJJ(Integer.valueOf(applogFlushOpt2.flushWatchRoomType));
        c09dl.LJIILLIIL("ttlive_applog_flush_watch_room_delay_duration_threshold");
        c09dl.LJJIZ(applogFlushOpt2.flushWatchRoomDelayDuration);
        c09dl.LJIILLIIL("ttlive_applog_flush_gap_duration_threshold");
        c09dl.LJJIZ(applogFlushOpt2.flushGapDuration);
        c09dl.LJIILLIIL("ttlive_report_log_in_handle_thread");
        c09dl.LJJJJJL(applogFlushOpt2.isReportOpt);
        c09dl.LJII();
    }
}
