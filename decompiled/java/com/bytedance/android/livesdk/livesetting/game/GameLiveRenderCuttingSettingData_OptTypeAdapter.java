package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class GameLiveRenderCuttingSettingData_OptTypeAdapter extends TypeAdapter<GameLiveRenderCuttingSettingData> {
    public final Gson LIZ;

    public GameLiveRenderCuttingSettingData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameLiveRenderCuttingSettingData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLiveRenderCuttingSettingData gameLiveRenderCuttingSettingData = new GameLiveRenderCuttingSettingData();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -821414156:
                        if (strLJJJJ.equals("live_room_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.liveRoomMode = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -260671222:
                        if (strLJJJJ.equals("source_ratio_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.sourceRatioStart = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -199363619:
                        if (strLJJJJ.equals("target_ratio")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.targetRatio = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 100263512:
                        if (strLJJJJ.equals("source_min_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.sourceMinHeight = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 790775683:
                        if (strLJJJJ.equals("source_ratio_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.sourceRatioEnd = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1295084759:
                        if (strLJJJJ.equals("allow_game_tag_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.allowGameTagId = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1892931081:
                        if (strLJJJJ.equals("disallow_game_tag_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveRenderCuttingSettingData.disallowGameTagId = C473040Igo.LIZ(this.LIZ, c09cu, Long.TYPE);
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
        return gameLiveRenderCuttingSettingData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLiveRenderCuttingSettingData gameLiveRenderCuttingSettingData) {
        GameLiveRenderCuttingSettingData gameLiveRenderCuttingSettingData2 = gameLiveRenderCuttingSettingData;
        if (gameLiveRenderCuttingSettingData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_room_mode");
        C473040Igo.LIZLLL(this.LIZ, c09dl, gameLiveRenderCuttingSettingData2.liveRoomMode, Integer.TYPE);
        c09dl.LJIILLIIL("allow_game_tag_id");
        Gson gson = this.LIZ;
        List<Long> list = gameLiveRenderCuttingSettingData2.allowGameTagId;
        Class cls = Long.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("disallow_game_tag_id");
        C473040Igo.LIZLLL(this.LIZ, c09dl, gameLiveRenderCuttingSettingData2.disallowGameTagId, cls);
        c09dl.LJIILLIIL("source_min_height");
        c09dl.LJJJJ(gameLiveRenderCuttingSettingData2.sourceMinHeight);
        c09dl.LJIILLIIL("source_ratio_start");
        c09dl.LJJJJ(gameLiveRenderCuttingSettingData2.sourceRatioStart);
        c09dl.LJIILLIIL("source_ratio_end");
        c09dl.LJJJJ(gameLiveRenderCuttingSettingData2.sourceRatioEnd);
        c09dl.LJIILLIIL("target_ratio");
        c09dl.LJJJJ(gameLiveRenderCuttingSettingData2.targetRatio);
        c09dl.LJII();
    }
}
