package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class GameDualDeviceRtcParams_OptTypeAdapter extends TypeAdapter<GameDualDeviceRtcParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameDualDeviceRtcParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameDualDeviceRtcParams gameDualDeviceRtcParams = new GameDualDeviceRtcParams(15L, 3L, 6L, 5L, 3L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -640246638:
                        if (strLJJJJ.equals("msg_strategy_resend_time_out")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameDualDeviceRtcParams.msgStrategyResendTimeOut = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -239908515:
                        if (strLJJJJ.equals("sei_timer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameDualDeviceRtcParams.seiTimer = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 149836931:
                        if (strLJJJJ.equals("msg_strategy_delay_release_timer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameDualDeviceRtcParams.msgStrategyDelayReleaseTimer = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 771274302:
                        if (strLJJJJ.equals("msg_strategy_heart_beat_time_out")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameDualDeviceRtcParams.msgStrategyHeartBeatTimeOut = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1762647843:
                        if (strLJJJJ.equals("msg_strategy_heart_beat_timer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameDualDeviceRtcParams.msgStrategyHeartBeatTimer = c09cu.LJJJ();
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
        return gameDualDeviceRtcParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameDualDeviceRtcParams gameDualDeviceRtcParams) throws IOException {
        GameDualDeviceRtcParams gameDualDeviceRtcParams2 = gameDualDeviceRtcParams;
        if (gameDualDeviceRtcParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("msg_strategy_heart_beat_time_out");
        c09dl.LJJIZ(gameDualDeviceRtcParams2.msgStrategyHeartBeatTimeOut);
        c09dl.LJIILLIIL("msg_strategy_resend_time_out");
        c09dl.LJJIZ(gameDualDeviceRtcParams2.msgStrategyResendTimeOut);
        c09dl.LJIILLIIL("msg_strategy_delay_release_timer");
        c09dl.LJJIZ(gameDualDeviceRtcParams2.msgStrategyDelayReleaseTimer);
        c09dl.LJIILLIIL("msg_strategy_heart_beat_timer");
        c09dl.LJJIZ(gameDualDeviceRtcParams2.msgStrategyHeartBeatTimer);
        c09dl.LJIILLIIL("sei_timer");
        c09dl.LJJIZ(gameDualDeviceRtcParams2.seiTimer);
        c09dl.LJII();
    }
}
