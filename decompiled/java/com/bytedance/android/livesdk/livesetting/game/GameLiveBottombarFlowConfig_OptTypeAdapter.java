package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class GameLiveBottombarFlowConfig_OptTypeAdapter extends TypeAdapter<GameLiveBottombarFlowConfig> {
    public final Gson LIZ;

    public GameLiveBottombarFlowConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameLiveBottombarFlowConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLiveBottombarFlowConfig gameLiveBottombarFlowConfig = new GameLiveBottombarFlowConfig(false, false, false, 180, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1560144056:
                        if (strLJJJJ.equals("fragment_check_interval_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveBottombarFlowConfig.fragmentCheckIntervalSecond = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1463992097:
                        if (strLJJJJ.equals("enable_gamelive_auto_play")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveBottombarFlowConfig.enableGameLiveAutoPlay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -826594516:
                        if (strLJJJJ.equals("enable_gamelive_hero_live")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveBottombarFlowConfig.enableHeroLive = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -330281957:
                        if (strLJJJJ.equals("enable_gamelive_flow_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveBottombarFlowConfig.enableFlowPage = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 474470242:
                        if (strLJJJJ.equals("enable_gamelive_flow_page_hero_choice")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveBottombarFlowConfig.enableFlowPageChoice = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return gameLiveBottombarFlowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLiveBottombarFlowConfig gameLiveBottombarFlowConfig) throws IOException {
        GameLiveBottombarFlowConfig gameLiveBottombarFlowConfig2 = gameLiveBottombarFlowConfig;
        if (gameLiveBottombarFlowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_gamelive_hero_live");
        c09dl.LJJJJJL(gameLiveBottombarFlowConfig2.enableHeroLive);
        c09dl.LJIILLIIL("enable_gamelive_flow_page");
        c09dl.LJJJJJL(gameLiveBottombarFlowConfig2.enableFlowPage);
        c09dl.LJIILLIIL("enable_gamelive_flow_page_hero_choice");
        c09dl.LJJJJJL(gameLiveBottombarFlowConfig2.enableFlowPageChoice);
        c09dl.LJIILLIIL("fragment_check_interval_second");
        c09dl.LJJJJ(Integer.valueOf(gameLiveBottombarFlowConfig2.fragmentCheckIntervalSecond));
        c09dl.LJIILLIIL("enable_gamelive_auto_play");
        c09dl.LJJJJJL(gameLiveBottombarFlowConfig2.enableGameLiveAutoPlay);
        c09dl.LJII();
    }
}
