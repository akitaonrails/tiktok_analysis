package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveDirectMatchData_OptTypeAdapter extends TypeAdapter<LiveDirectMatchData> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveDirectMatchData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveDirectMatchData liveDirectMatchData = new LiveDirectMatchData(0, 20, 15, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1609594047:
                        if (strLJJJJ.equals("enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDirectMatchData.enabled = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -191454808:
                        if (strLJJJJ.equals("inviter_timeout_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDirectMatchData.inviterTimeout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -114416107:
                        if (strLJJJJ.equals("invitee_timeout_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDirectMatchData.inviteeTimeout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2107482195:
                        if (strLJJJJ.equals("enable_quick_match_from_profile_card")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveDirectMatchData.enableQuickMatchFromProfileCard = c09cu.LJJIZ();
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
        return liveDirectMatchData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveDirectMatchData liveDirectMatchData) {
        LiveDirectMatchData liveDirectMatchData2 = liveDirectMatchData;
        if (liveDirectMatchData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJ(Integer.valueOf(liveDirectMatchData2.enabled));
        c09dl.LJIILLIIL("inviter_timeout_duration");
        c09dl.LJJJJ(Integer.valueOf(liveDirectMatchData2.inviterTimeout));
        c09dl.LJIILLIIL("invitee_timeout_duration");
        c09dl.LJJJJ(Integer.valueOf(liveDirectMatchData2.inviteeTimeout));
        c09dl.LJIILLIIL("enable_quick_match_from_profile_card");
        c09dl.LJJJJ(Integer.valueOf(liveDirectMatchData2.enableQuickMatchFromProfileCard));
        c09dl.LJII();
    }
}
