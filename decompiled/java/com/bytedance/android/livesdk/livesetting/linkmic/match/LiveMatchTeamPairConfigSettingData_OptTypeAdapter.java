package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveMatchTeamPairConfigSettingData_OptTypeAdapter extends TypeAdapter<LiveMatchTeamPairConfigSettingData> {
    public final Gson LIZ;

    public LiveMatchTeamPairConfigSettingData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchTeamPairConfigSettingData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchTeamPairConfigSettingData liveMatchTeamPairConfigSettingData = new LiveMatchTeamPairConfigSettingData(300L, 60L, 30L, C1697810uHb.LJIIJJI(0, 2, 3, 4));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 121570657:
                        if (strLJJJJ.equals("team_pair_invitee_side_waiting_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchTeamPairConfigSettingData.inviteeWaitingTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 139035878:
                        if (strLJJJJ.equals("team_pair_invite_type_allow_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchTeamPairConfigSettingData.inviteTypeWhiteList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1881071231:
                        if (strLJJJJ.equals("team_pair_match_fallback_waiting_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchTeamPairConfigSettingData.inviteeFallbackTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2028338222:
                        if (strLJJJJ.equals("team_pair_inviter_side_waiting_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchTeamPairConfigSettingData.inviterWaitingTime = c09cu.LJJJ();
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
        return liveMatchTeamPairConfigSettingData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchTeamPairConfigSettingData liveMatchTeamPairConfigSettingData) throws IOException {
        LiveMatchTeamPairConfigSettingData liveMatchTeamPairConfigSettingData2 = liveMatchTeamPairConfigSettingData;
        if (liveMatchTeamPairConfigSettingData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("team_pair_inviter_side_waiting_time");
        c09dl.LJJIZ(liveMatchTeamPairConfigSettingData2.inviterWaitingTime);
        c09dl.LJIILLIIL("team_pair_invitee_side_waiting_time");
        c09dl.LJJIZ(liveMatchTeamPairConfigSettingData2.inviteeWaitingTime);
        c09dl.LJIILLIIL("team_pair_match_fallback_waiting_time");
        c09dl.LJJIZ(liveMatchTeamPairConfigSettingData2.inviteeFallbackTime);
        c09dl.LJIILLIIL("team_pair_invite_type_allow_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveMatchTeamPairConfigSettingData2.inviteTypeWhiteList, Integer.TYPE);
        c09dl.LJII();
    }
}
