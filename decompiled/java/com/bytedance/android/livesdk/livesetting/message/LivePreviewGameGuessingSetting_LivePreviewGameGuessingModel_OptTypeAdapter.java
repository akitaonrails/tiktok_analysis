package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.message.LivePreviewGameGuessingSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LivePreviewGameGuessingSetting_LivePreviewGameGuessingModel_OptTypeAdapter extends TypeAdapter<LivePreviewGameGuessingSetting.LivePreviewGameGuessingModel> {
    public final Gson LIZ;

    public LivePreviewGameGuessingSetting_LivePreviewGameGuessingModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePreviewGameGuessingSetting.LivePreviewGameGuessingModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePreviewGameGuessingSetting.LivePreviewGameGuessingModel livePreviewGameGuessingModel = new LivePreviewGameGuessingSetting.LivePreviewGameGuessingModel(false, false, false, false, 20L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1236652949:
                        if (strLJJJJ.equals("isShowWidget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreviewGameGuessingModel.setShowWidget(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 12094614:
                        if (strLJJJJ.equals("timeEarly")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreviewGameGuessingModel.setTimeEarly(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 309694633:
                        if (strLJJJJ.equals("gameQuestionDesc")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreviewGameGuessingModel.setGameQuestionDesc(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 397852494:
                        if (strLJJJJ.equals("freeCoinDesc")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreviewGameGuessingModel.setFreeCoinDesc(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1740552891:
                        if (strLJJJJ.equals("gameNameTitle")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreviewGameGuessingModel.setGameNameTitle(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return livePreviewGameGuessingModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreviewGameGuessingSetting.LivePreviewGameGuessingModel livePreviewGameGuessingModel) throws IOException {
        LivePreviewGameGuessingSetting.LivePreviewGameGuessingModel livePreviewGameGuessingModel2 = livePreviewGameGuessingModel;
        if (livePreviewGameGuessingModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("isShowWidget");
        c09dl.LJJJJJL(livePreviewGameGuessingModel2.isShowWidget());
        c09dl.LJIILLIIL("gameNameTitle");
        c09dl.LJJJJJL(livePreviewGameGuessingModel2.getGameNameTitle());
        c09dl.LJIILLIIL("gameQuestionDesc");
        c09dl.LJJJJJL(livePreviewGameGuessingModel2.getGameQuestionDesc());
        c09dl.LJIILLIIL("freeCoinDesc");
        c09dl.LJJJJJL(livePreviewGameGuessingModel2.getFreeCoinDesc());
        c09dl.LJIILLIIL("timeEarly");
        c09dl.LJJIZ(livePreviewGameGuessingModel2.getTimeEarly());
        c09dl.LJII();
    }
}
