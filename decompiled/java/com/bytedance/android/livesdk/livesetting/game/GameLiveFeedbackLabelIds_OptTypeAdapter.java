package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes15.dex */
public final class GameLiveFeedbackLabelIds_OptTypeAdapter extends TypeAdapter<GameLiveFeedbackLabelIds> {
    @Override // com.google.gson.TypeAdapter
    public final GameLiveFeedbackLabelIds read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds = new GameLiveFeedbackLabelIds("7196884519075446785", "71968845215375196181", "71968845215375196183");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1467162645) {
                    if (iHashCode != 1176441553) {
                        if (iHashCode == 1227992719 && strLJJJJ.equals("video_buffering_or_freezing")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameLiveFeedbackLabelIds.setVideo_buffering_or_freezing(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("game_freezing_or_high_ping")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            gameLiveFeedbackLabelIds.setGame_freezing_or_high_ping(c09cu.LJJJZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("low_audio_quality")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameLiveFeedbackLabelIds.setLow_audio_quality(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return gameLiveFeedbackLabelIds;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds) {
        GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds2 = gameLiveFeedbackLabelIds;
        if (gameLiveFeedbackLabelIds2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("game_freezing_or_high_ping");
        c09dl.LJJJJJ(gameLiveFeedbackLabelIds2.getGame_freezing_or_high_ping());
        c09dl.LJIILLIIL("video_buffering_or_freezing");
        c09dl.LJJJJJ(gameLiveFeedbackLabelIds2.getVideo_buffering_or_freezing());
        c09dl.LJIILLIIL("low_audio_quality");
        c09dl.LJJJJJ(gameLiveFeedbackLabelIds2.getLow_audio_quality());
        c09dl.LJII();
    }
}
