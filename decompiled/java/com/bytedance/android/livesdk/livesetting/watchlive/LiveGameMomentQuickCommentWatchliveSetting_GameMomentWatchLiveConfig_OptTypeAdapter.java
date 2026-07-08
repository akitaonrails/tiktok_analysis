package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMomentQuickCommentWatchliveSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGameMomentQuickCommentWatchliveSetting_GameMomentWatchLiveConfig_OptTypeAdapter extends TypeAdapter<LiveGameMomentQuickCommentWatchliveSetting.GameMomentWatchLiveConfig> {
    public final Gson LIZ;

    public LiveGameMomentQuickCommentWatchliveSetting_GameMomentWatchLiveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGameMomentQuickCommentWatchliveSetting.GameMomentWatchLiveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameMomentQuickCommentWatchliveSetting.GameMomentWatchLiveConfig gameMomentWatchLiveConfig = new LiveGameMomentQuickCommentWatchliveSetting.GameMomentWatchLiveConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1894289167:
                        if (strLJJJJ.equals("ttlive_game_quick_commnet_landscape_adapter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMomentWatchLiveConfig.gameQuickCommentLandscapeAdapter = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1597826046:
                        if (strLJJJJ.equals("live_game_quick_comment_tray_duration_setting")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMomentWatchLiveConfig.gameQuickCommentTrayDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -534883968:
                        if (strLJJJJ.equals("live_game_comment_quick_comment_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMomentWatchLiveConfig.gameMomentQuickCommentDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1617929282:
                        if (strLJJJJ.equals("ttlive_landscape_access_layer_change")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMomentWatchLiveConfig.landscapeAccessLayerChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return gameMomentWatchLiveConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameMomentQuickCommentWatchliveSetting.GameMomentWatchLiveConfig gameMomentWatchLiveConfig) throws IOException {
        LiveGameMomentQuickCommentWatchliveSetting.GameMomentWatchLiveConfig gameMomentWatchLiveConfig2 = gameMomentWatchLiveConfig;
        if (gameMomentWatchLiveConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ttlive_game_quick_commnet_landscape_adapter");
        c09dl.LJJJJ(Integer.valueOf(gameMomentWatchLiveConfig2.gameQuickCommentLandscapeAdapter));
        c09dl.LJIILLIIL("live_game_quick_comment_tray_duration_setting");
        c09dl.LJJIZ(gameMomentWatchLiveConfig2.gameQuickCommentTrayDuration);
        c09dl.LJIILLIIL("live_game_comment_quick_comment_duration");
        c09dl.LJJIZ(gameMomentWatchLiveConfig2.gameMomentQuickCommentDuration);
        c09dl.LJIILLIIL("ttlive_landscape_access_layer_change");
        c09dl.LJJJJJL(gameMomentWatchLiveConfig2.landscapeAccessLayerChange);
        c09dl.LJII();
    }
}
