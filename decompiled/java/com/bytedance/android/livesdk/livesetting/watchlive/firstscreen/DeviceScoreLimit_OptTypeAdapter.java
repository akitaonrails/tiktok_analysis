package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceScoreLimit_OptTypeAdapter extends TypeAdapter<DeviceScoreLimit> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final DeviceScoreLimit read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        DeviceScoreLimit deviceScoreLimit = new DeviceScoreLimit(-1.0f, -1.0f, 0, 200);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2140683804:
                        if (strLJJJJ.equals("draw_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                deviceScoreLimit.drawDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 445781792:
                        if (strLJJJJ.equals("click_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                deviceScoreLimit.clickDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1583522607:
                        if (strLJJJJ.equals("score_high")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                deviceScoreLimit.scoreHigh = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2129295399:
                        if (strLJJJJ.equals("score_low")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                deviceScoreLimit.scoreLow = (float) c09cu.LJJIL();
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
        return deviceScoreLimit;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, DeviceScoreLimit deviceScoreLimit) {
        DeviceScoreLimit deviceScoreLimit2 = deviceScoreLimit;
        if (deviceScoreLimit2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("score_high");
        c09dl.LJJJJ(Float.valueOf(deviceScoreLimit2.scoreHigh));
        c09dl.LJIILLIIL("score_low");
        c09dl.LJJJJ(Float.valueOf(deviceScoreLimit2.scoreLow));
        c09dl.LJIILLIIL("click_delay_time");
        c09dl.LJJJJ(Integer.valueOf(deviceScoreLimit2.clickDelayTime));
        c09dl.LJIILLIIL("draw_delay_time");
        c09dl.LJJJJ(Integer.valueOf(deviceScoreLimit2.drawDelayTime));
        c09dl.LJII();
    }
}
