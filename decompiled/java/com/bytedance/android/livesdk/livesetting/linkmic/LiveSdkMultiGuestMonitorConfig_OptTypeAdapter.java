package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSdkMultiGuestMonitorConfig_OptTypeAdapter extends TypeAdapter<LiveSdkMultiGuestMonitorConfig> {
    public final Gson LIZ;

    public LiveSdkMultiGuestMonitorConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSdkMultiGuestMonitorConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig = new LiveSdkMultiGuestMonitorConfig(true, 60L, 2650, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2077031716:
                        if (strLJJJJ.equals("time_out")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSdkMultiGuestMonitorConfig.timeOUt = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 803187620:
                        if (strLJJJJ.equals("exception_room_msg_gap")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSdkMultiGuestMonitorConfig.exceptionRoomMsgGap = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1484622445:
                        if (strLJJJJ.equals("compatible_version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSdkMultiGuestMonitorConfig.compatibleVersion = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1776078771:
                        if (strLJJJJ.equals("enable_android")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSdkMultiGuestMonitorConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveSdkMultiGuestMonitorConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig) throws IOException {
        LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig2 = liveSdkMultiGuestMonitorConfig;
        if (liveSdkMultiGuestMonitorConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_android");
        c09dl.LJJJJJL(liveSdkMultiGuestMonitorConfig2.enable);
        c09dl.LJIILLIIL("time_out");
        c09dl.LJJIZ(liveSdkMultiGuestMonitorConfig2.timeOUt);
        c09dl.LJIILLIIL("compatible_version");
        c09dl.LJJJJ(Integer.valueOf(liveSdkMultiGuestMonitorConfig2.compatibleVersion));
        c09dl.LJIILLIIL("exception_room_msg_gap");
        c09dl.LJJJJ(Integer.valueOf(liveSdkMultiGuestMonitorConfig2.exceptionRoomMsgGap));
        c09dl.LJII();
    }
}
