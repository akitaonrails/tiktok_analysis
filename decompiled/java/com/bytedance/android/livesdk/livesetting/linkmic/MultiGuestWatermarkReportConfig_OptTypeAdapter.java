package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiGuestWatermarkReportConfig_OptTypeAdapter extends TypeAdapter<MultiGuestWatermarkReportConfig> {
    public final Gson LIZ;

    public MultiGuestWatermarkReportConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestWatermarkReportConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MultiGuestWatermarkReportConfig multiGuestWatermarkReportConfig = new MultiGuestWatermarkReportConfig(20L, 1000L, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1609594047) {
                    if (iHashCode != -1450649382) {
                        if (iHashCode == 2032439346 && strLJJJJ.equals("threshold_of_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                multiGuestWatermarkReportConfig.thresholdOfTimes = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("threshold_of_diff_in_ms")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            multiGuestWatermarkReportConfig.thresholdOfDiffInMS = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestWatermarkReportConfig.enabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return multiGuestWatermarkReportConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestWatermarkReportConfig multiGuestWatermarkReportConfig) throws IOException {
        MultiGuestWatermarkReportConfig multiGuestWatermarkReportConfig2 = multiGuestWatermarkReportConfig;
        if (multiGuestWatermarkReportConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("threshold_of_times");
        c09dl.LJJIZ(multiGuestWatermarkReportConfig2.thresholdOfTimes);
        c09dl.LJIILLIIL("threshold_of_diff_in_ms");
        c09dl.LJJIZ(multiGuestWatermarkReportConfig2.thresholdOfDiffInMS);
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(multiGuestWatermarkReportConfig2.enabled);
        c09dl.LJII();
    }
}
