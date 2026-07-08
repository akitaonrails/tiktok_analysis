package com.bytedance.android.livesdk.livesetting.creatorteam;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.creatorteam.LiveCreatorTeamTeamChallengeConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCreatorTeamTeamChallengeConfigSetting_LiveChallengeConfig_OptTypeAdapter extends TypeAdapter<LiveCreatorTeamTeamChallengeConfigSetting.LiveChallengeConfig> {
    public final Gson LIZ;

    public LiveCreatorTeamTeamChallengeConfigSetting_LiveChallengeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorTeamTeamChallengeConfigSetting.LiveChallengeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCreatorTeamTeamChallengeConfigSetting.LiveChallengeConfig liveChallengeConfig = new LiveCreatorTeamTeamChallengeConfigSetting.LiveChallengeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "live_team_challenge_room_cache_size")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveChallengeConfig.teamChallengeRoomSize = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_team_challenge_gift_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveChallengeConfig.teamGiftList = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveChallengeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCreatorTeamTeamChallengeConfigSetting.LiveChallengeConfig liveChallengeConfig) {
        LiveCreatorTeamTeamChallengeConfigSetting.LiveChallengeConfig liveChallengeConfig2 = liveChallengeConfig;
        if (liveChallengeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_team_challenge_room_cache_size");
        c09dl.LJJJJ(Integer.valueOf(liveChallengeConfig2.teamChallengeRoomSize));
        c09dl.LJIILLIIL("live_team_challenge_gift_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveChallengeConfig2.teamGiftList, Long.TYPE);
        c09dl.LJII();
    }
}
