package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ScoreWeights_OptTypeAdapter extends TypeAdapter<ScoreWeights> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ScoreWeights read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ScoreWeights scoreWeights = new ScoreWeights();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -561855165:
                        if (strLJJJJ.equals("temp_weight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scoreWeights.temperatureWeight = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -86508710:
                        if (strLJJJJ.equals("net_weight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scoreWeights.networkWeight = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 795234338:
                        if (strLJJJJ.equals("mem_weight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scoreWeights.memoryWeight = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1115820271:
                        if (strLJJJJ.equals("cpu_weight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scoreWeights.cpuWeight = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1335626382:
                        if (strLJJJJ.equals("fps_weight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scoreWeights.fpsWeight = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1608425486:
                        if (strLJJJJ.equals("device_score_weight")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scoreWeights.deviceScoreWeight = (float) c09cu.LJJIL();
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
        return scoreWeights;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ScoreWeights scoreWeights) {
        ScoreWeights scoreWeights2 = scoreWeights;
        if (scoreWeights2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fps_weight");
        c09dl.LJJJJ(Float.valueOf(scoreWeights2.fpsWeight));
        c09dl.LJIILLIIL("temp_weight");
        c09dl.LJJJJ(Float.valueOf(scoreWeights2.temperatureWeight));
        c09dl.LJIILLIIL("mem_weight");
        c09dl.LJJJJ(Float.valueOf(scoreWeights2.memoryWeight));
        c09dl.LJIILLIIL("cpu_weight");
        c09dl.LJJJJ(Float.valueOf(scoreWeights2.cpuWeight));
        c09dl.LJIILLIIL("net_weight");
        c09dl.LJJJJ(Float.valueOf(scoreWeights2.networkWeight));
        c09dl.LJIILLIIL("device_score_weight");
        c09dl.LJJJJ(Float.valueOf(scoreWeights2.deviceScoreWeight));
        c09dl.LJII();
    }
}
