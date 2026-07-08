package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInnerPrePullStreamConfigData_OptTypeAdapter extends TypeAdapter<LiveInnerPrePullStreamConfigData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveInnerPrePullStreamConfigData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInnerPrePullStreamConfigData liveInnerPrePullStreamConfigData = new LiveInnerPrePullStreamConfigData(-1, -1, -1, -1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1601660571:
                        if (strLJJJJ.equals("delay_time_for_pre_pull_stream_of_first_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerPrePullStreamConfigData.delayTimeForPrePullStreamOfFirstRoom = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1185522072:
                        if (strLJJJJ.equals("alive_time_for_pre_pull_stream")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerPrePullStreamConfigData.aliveTimeForPrePullStream = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -571189646:
                        if (strLJJJJ.equals("delay_time_for_pre_pull_stream")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerPrePullStreamConfigData.delayTimeForPrePullStream = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1093303003:
                        if (strLJJJJ.equals("alive_time_for_pre_pull_stream_of_first_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveInnerPrePullStreamConfigData.aliveTimeForPrePullStreamOfFirstRoom = c09cu.LJJIZ();
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
        return liveInnerPrePullStreamConfigData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveInnerPrePullStreamConfigData liveInnerPrePullStreamConfigData) {
        LiveInnerPrePullStreamConfigData liveInnerPrePullStreamConfigData2 = liveInnerPrePullStreamConfigData;
        if (liveInnerPrePullStreamConfigData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_time_for_pre_pull_stream");
        c09dl.LJJJJ(Integer.valueOf(liveInnerPrePullStreamConfigData2.delayTimeForPrePullStream));
        c09dl.LJIILLIIL("delay_time_for_pre_pull_stream_of_first_room");
        c09dl.LJJJJ(Integer.valueOf(liveInnerPrePullStreamConfigData2.delayTimeForPrePullStreamOfFirstRoom));
        c09dl.LJIILLIIL("alive_time_for_pre_pull_stream");
        c09dl.LJJJJ(Integer.valueOf(liveInnerPrePullStreamConfigData2.aliveTimeForPrePullStream));
        c09dl.LJIILLIIL("alive_time_for_pre_pull_stream_of_first_room");
        c09dl.LJJJJ(Integer.valueOf(liveInnerPrePullStreamConfigData2.aliveTimeForPrePullStreamOfFirstRoom));
        c09dl.LJII();
    }
}
