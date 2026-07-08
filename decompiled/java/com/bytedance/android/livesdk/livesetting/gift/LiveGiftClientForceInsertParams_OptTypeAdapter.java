package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftClientForceInsertParams_OptTypeAdapter extends TypeAdapter<LiveGiftClientForceInsertParams> {
    public final Gson LIZ;

    public LiveGiftClientForceInsertParams_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGiftClientForceInsertParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGiftClientForceInsertParams liveGiftClientForceInsertParams = new LiveGiftClientForceInsertParams(false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1866322224:
                        if (strLJJJJ.equals("enable_client_pre_request_by_match_specific")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftClientForceInsertParams.enablePreRequestFromMatchGiftOnly = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -798726428:
                        if (strLJJJJ.equals("enable_strategy_force_insert_live_goal")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftClientForceInsertParams.enableStrategyForceInsertLiveGoal = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 678374073:
                        if (strLJJJJ.equals("enable_strategy_force_insert_level_up_game")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftClientForceInsertParams.enableStrategyForceInsertLevelUpGame = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1027296462:
                        if (strLJJJJ.equals("enable_strategy_force_insert_match_specific")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftClientForceInsertParams.enableStrategyForceInsertMatchGiftOnly = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2008337314:
                        if (strLJJJJ.equals("enable_client_pre_request_by_live_goal")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGiftClientForceInsertParams.enablePreRequestFromLiveGoal = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveGiftClientForceInsertParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGiftClientForceInsertParams liveGiftClientForceInsertParams) throws IOException {
        LiveGiftClientForceInsertParams liveGiftClientForceInsertParams2 = liveGiftClientForceInsertParams;
        if (liveGiftClientForceInsertParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_client_pre_request_by_live_goal");
        c09dl.LJJJJJL(liveGiftClientForceInsertParams2.enablePreRequestFromLiveGoal);
        c09dl.LJIILLIIL("enable_client_pre_request_by_match_specific");
        c09dl.LJJJJJL(liveGiftClientForceInsertParams2.enablePreRequestFromMatchGiftOnly);
        c09dl.LJIILLIIL("enable_strategy_force_insert_live_goal");
        c09dl.LJJJJJL(liveGiftClientForceInsertParams2.enableStrategyForceInsertLiveGoal);
        c09dl.LJIILLIIL("enable_strategy_force_insert_level_up_game");
        c09dl.LJJJJJL(liveGiftClientForceInsertParams2.enableStrategyForceInsertLevelUpGame);
        c09dl.LJIILLIIL("enable_strategy_force_insert_match_specific");
        c09dl.LJJJJJL(liveGiftClientForceInsertParams2.enableStrategyForceInsertMatchGiftOnly);
        c09dl.LJII();
    }
}
