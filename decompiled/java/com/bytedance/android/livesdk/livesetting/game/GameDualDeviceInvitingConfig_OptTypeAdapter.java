package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GameDualDeviceInvitingConfig_OptTypeAdapter extends TypeAdapter<GameDualDeviceInvitingConfig> {
    @Override // com.google.gson.TypeAdapter
    public final GameDualDeviceInvitingConfig read(C09CU c09cu) {
        GameDualDeviceInvitingConfig gameDualDeviceInvitingConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gameDualDeviceInvitingConfig = new GameDualDeviceInvitingConfig(5, 30);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "game_dual_device_inviting_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameDualDeviceInvitingConfig.gameDualDeviceInvitingInterval = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "game_dual_device_inviting_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameDualDeviceInvitingConfig.gameDualDeviceInvitingTime = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gameDualDeviceInvitingConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameDualDeviceInvitingConfig gameDualDeviceInvitingConfig) {
        GameDualDeviceInvitingConfig gameDualDeviceInvitingConfig2 = gameDualDeviceInvitingConfig;
        if (gameDualDeviceInvitingConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("game_dual_device_inviting_interval");
        c09dl.LJJJJ(Integer.valueOf(gameDualDeviceInvitingConfig2.gameDualDeviceInvitingInterval));
        c09dl.LJIILLIIL("game_dual_device_inviting_time");
        c09dl.LJJJJ(Integer.valueOf(gameDualDeviceInvitingConfig2.gameDualDeviceInvitingTime));
        c09dl.LJII();
    }
}
