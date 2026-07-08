package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMatchEnigmaData_OptTypeAdapter extends TypeAdapter<LiveMatchEnigmaData> {
    public final Gson LIZ;

    public LiveMatchEnigmaData_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMatchEnigmaData read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchEnigmaData liveMatchEnigmaData = new LiveMatchEnigmaData(false, false, 0, 0, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2104353094:
                        if (strLJJJJ.equals("is_user_enigma")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaData.isUserEnigma = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -330111997:
                        if (strLJJJJ.equals("is_allow_personal_score_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaData.isAllowPersonalScoreAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -308562864:
                        if (strLJJJJ.equals("opponent_enigma_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaData.opponentEnigmaScore = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1143199775:
                        if (strLJJJJ.equals("enabled_enigma_match")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaData.isEnigmaMatchEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1881744065:
                        if (strLJJJJ.equals("self_enigma_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchEnigmaData.selfEnigmaScore = c09cu.LJJIZ();
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
        return liveMatchEnigmaData;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchEnigmaData liveMatchEnigmaData) throws IOException {
        LiveMatchEnigmaData liveMatchEnigmaData2 = liveMatchEnigmaData;
        if (liveMatchEnigmaData2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled_enigma_match");
        c09dl.LJJJJJL(liveMatchEnigmaData2.isEnigmaMatchEnabled);
        c09dl.LJIILLIIL("is_user_enigma");
        c09dl.LJJJJJL(liveMatchEnigmaData2.isUserEnigma);
        c09dl.LJIILLIIL("opponent_enigma_score");
        c09dl.LJJJJ(Integer.valueOf(liveMatchEnigmaData2.opponentEnigmaScore));
        c09dl.LJIILLIIL("self_enigma_score");
        c09dl.LJJJJ(Integer.valueOf(liveMatchEnigmaData2.selfEnigmaScore));
        c09dl.LJIILLIIL("is_allow_personal_score_animation");
        c09dl.LJJJJJL(liveMatchEnigmaData2.isAllowPersonalScoreAnimation);
        c09dl.LJII();
    }
}
