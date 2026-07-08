package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchTimeOutData_OptTypeAdapter extends TypeAdapter<LiveMatchTimeOutData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchTimeOutData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchTimeOutData liveMatchTimeOutData = new LiveMatchTimeOutData(40, 50, 60, 70, 10);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1670075102) {
                    switch (iHashCode) {
                        case 274232874:
                            if (strLJJJJ.equals("live_interact_match_timeout_v2")) {
                                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                    liveMatchTimeOutData.timeout_v2 = c09cu.LJJIZ();
                                } else {
                                    c09cu.LJJJJJL();
                                }
                            }
                            break;
                        case 274232875:
                            if (strLJJJJ.equals("live_interact_match_timeout_v3")) {
                                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                    liveMatchTimeOutData.timeout_v3 = c09cu.LJJIZ();
                                } else {
                                    c09cu.LJJJJJL();
                                }
                            }
                            break;
                        case 274232876:
                            if (strLJJJJ.equals("live_interact_match_timeout_v4")) {
                                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                    liveMatchTimeOutData.timeout_v4 = c09cu.LJJIZ();
                                } else {
                                    c09cu.LJJJJJL();
                                }
                            }
                            break;
                        case 274232877:
                            if (strLJJJJ.equals("live_interact_match_timeout_v5")) {
                                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                    liveMatchTimeOutData.timeout_v5 = c09cu.LJJIZ();
                                } else {
                                    c09cu.LJJJJJL();
                                }
                            }
                            break;
                    }
                } else if (strLJJJJ.equals("live_interact_match_inviter_extra_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchTimeOutData.extra_time = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMatchTimeOutData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchTimeOutData liveMatchTimeOutData) {
        LiveMatchTimeOutData liveMatchTimeOutData2 = liveMatchTimeOutData;
        if (liveMatchTimeOutData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_interact_match_timeout_v2");
        c09dl.LJJJJ(Integer.valueOf(liveMatchTimeOutData2.timeout_v2));
        c09dl.LJIILLIIL("live_interact_match_timeout_v3");
        c09dl.LJJJJ(Integer.valueOf(liveMatchTimeOutData2.timeout_v3));
        c09dl.LJIILLIIL("live_interact_match_timeout_v4");
        c09dl.LJJJJ(Integer.valueOf(liveMatchTimeOutData2.timeout_v4));
        c09dl.LJIILLIIL("live_interact_match_timeout_v5");
        c09dl.LJJJJ(Integer.valueOf(liveMatchTimeOutData2.timeout_v5));
        c09dl.LJIILLIIL("live_interact_match_inviter_extra_time");
        c09dl.LJJJJ(Integer.valueOf(liveMatchTimeOutData2.extra_time));
        c09dl.LJII();
    }
}
