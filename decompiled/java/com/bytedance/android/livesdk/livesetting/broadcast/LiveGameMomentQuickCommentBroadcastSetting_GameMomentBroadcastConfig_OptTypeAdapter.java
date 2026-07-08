package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameMomentQuickCommentBroadcastSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveGameMomentQuickCommentBroadcastSetting_GameMomentBroadcastConfig_OptTypeAdapter extends TypeAdapter<LiveGameMomentQuickCommentBroadcastSetting.GameMomentBroadcastConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGameMomentQuickCommentBroadcastSetting.GameMomentBroadcastConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameMomentQuickCommentBroadcastSetting.GameMomentBroadcastConfig gameMomentBroadcastConfig = new LiveGameMomentQuickCommentBroadcastSetting.GameMomentBroadcastConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "ttlive_game_moment_anchor_toast")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameMomentBroadcastConfig.gameMomentAnchorToast = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "ttlive_game_moment_anchor_toast_icon")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    gameMomentBroadcastConfig.gameMomentAnchorToastIcon = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return gameMomentBroadcastConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameMomentQuickCommentBroadcastSetting.GameMomentBroadcastConfig gameMomentBroadcastConfig) {
        LiveGameMomentQuickCommentBroadcastSetting.GameMomentBroadcastConfig gameMomentBroadcastConfig2 = gameMomentBroadcastConfig;
        if (gameMomentBroadcastConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlive_game_moment_anchor_toast");
        c09dl.LJJJJ(Integer.valueOf(gameMomentBroadcastConfig2.gameMomentAnchorToast));
        c09dl.LJIILLIIL("ttlive_game_moment_anchor_toast_icon");
        c09dl.LJJJJ(Integer.valueOf(gameMomentBroadcastConfig2.gameMomentAnchorToastIcon));
        c09dl.LJII();
    }
}
