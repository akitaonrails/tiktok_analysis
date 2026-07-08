package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoFrameElapseOptSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class TTLHVideoFrameElapseOptSettings_TTLHVideoQualitySettings_OptTypeAdapter extends TypeAdapter<TTLHVideoFrameElapseOptSettings.TTLHVideoQualitySettings> {
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoFrameElapseOptSettings.TTLHVideoQualitySettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoFrameElapseOptSettings.TTLHVideoQualitySettings tTLHVideoQualitySettings = new TTLHVideoFrameElapseOptSettings.TTLHVideoQualitySettings();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1354792126) {
                    if (iHashCode != 3575610) {
                        if (iHashCode == 1276152569 && strLJJJJ.equals("offset_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tTLHVideoQualitySettings.setOffsetTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("type")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            tTLHVideoQualitySettings.setType(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        tTLHVideoQualitySettings.setConfig(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return tTLHVideoQualitySettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoFrameElapseOptSettings.TTLHVideoQualitySettings tTLHVideoQualitySettings) throws IOException {
        TTLHVideoFrameElapseOptSettings.TTLHVideoQualitySettings tTLHVideoQualitySettings2 = tTLHVideoQualitySettings;
        if (tTLHVideoQualitySettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getType()));
        c09dl.LJIILLIIL("config");
        c09dl.LJJJJ(Integer.valueOf(tTLHVideoQualitySettings2.getConfig()));
        c09dl.LJIILLIIL("offset_time");
        c09dl.LJJIZ(tTLHVideoQualitySettings2.getOffsetTime());
        c09dl.LJII();
    }
}
