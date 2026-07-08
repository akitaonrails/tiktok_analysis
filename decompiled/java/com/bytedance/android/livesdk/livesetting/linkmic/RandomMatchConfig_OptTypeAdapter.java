package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class RandomMatchConfig_OptTypeAdapter extends TypeAdapter<RandomMatchConfig> {
    public final Gson LIZ;

    public RandomMatchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RandomMatchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RandomMatchConfig randomMatchConfig = new RandomMatchConfig(0, 0.0d, false, 0.0d, false, 0.0d);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1893212917:
                        if (strLJJJJ.equals("enable_deduplication_optimize")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomMatchConfig.enableDeduplicationOptimize = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -948440624:
                        if (strLJJJJ.equals("room_match_timeout_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomMatchConfig.roomMatchTimeoutDuration = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -236248657:
                        if (strLJJJJ.equals("top_module_room_match_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomMatchConfig.topModuleRoomMatchType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -38629987:
                        if (strLJJJJ.equals("enable_enter_room_after_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomMatchConfig.enableEnterRoomAfterTimeout = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 135917111:
                        if (strLJJJJ.equals("match_success_expire_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomMatchConfig.matchSuccessExpireTime = c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1024916906:
                        if (strLJJJJ.equals("fetch_match_room_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomMatchConfig.fetchMatchRoomInterval = c09cu.LJJIL();
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
        return randomMatchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RandomMatchConfig randomMatchConfig) throws IOException {
        RandomMatchConfig randomMatchConfig2 = randomMatchConfig;
        if (randomMatchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("top_module_room_match_type");
        c09dl.LJJJJ(Integer.valueOf(randomMatchConfig2.topModuleRoomMatchType));
        c09dl.LJIILLIIL("room_match_timeout_duration");
        c09dl.LJJIL(randomMatchConfig2.roomMatchTimeoutDuration);
        c09dl.LJIILLIIL("enable_enter_room_after_timeout");
        c09dl.LJJJJJL(randomMatchConfig2.enableEnterRoomAfterTimeout);
        c09dl.LJIILLIIL("fetch_match_room_interval");
        c09dl.LJJIL(randomMatchConfig2.fetchMatchRoomInterval);
        c09dl.LJIILLIIL("enable_deduplication_optimize");
        c09dl.LJJJJJL(randomMatchConfig2.enableDeduplicationOptimize);
        c09dl.LJIILLIIL("match_success_expire_time");
        c09dl.LJJIL(randomMatchConfig2.matchSuccessExpireTime);
        c09dl.LJII();
    }
}
