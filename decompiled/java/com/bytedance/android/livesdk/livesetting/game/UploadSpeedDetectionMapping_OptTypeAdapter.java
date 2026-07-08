package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class UploadSpeedDetectionMapping_OptTypeAdapter extends TypeAdapter<UploadSpeedDetectionMapping> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final UploadSpeedDetectionMapping read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UploadSpeedDetectionMapping uploadSpeedDetectionMapping = new UploadSpeedDetectionMapping(0.5f, 1.5f, 2.5f, 4.0f, 6.0f, 6.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1222245233:
                        if (strLJJJJ.equals("hd_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uploadSpeedDetectionMapping.setHd_min((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1107728629:
                        if (strLJJJJ.equals("ld_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uploadSpeedDetectionMapping.setLd_min((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -907324572:
                        if (strLJJJJ.equals("sd_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uploadSpeedDetectionMapping.setSd_min((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -802583568:
                        if (strLJJJJ.equals("hd_60_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uploadSpeedDetectionMapping.setHd_60_min((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -463529660:
                        if (strLJJJJ.equals("uhd_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uploadSpeedDetectionMapping.setUhd_min((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1975140123:
                        if (strLJJJJ.equals("uhd_60_min")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                uploadSpeedDetectionMapping.setUhd_60_min((float) c09cu.LJJIL());
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
        return uploadSpeedDetectionMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UploadSpeedDetectionMapping uploadSpeedDetectionMapping) {
        UploadSpeedDetectionMapping uploadSpeedDetectionMapping2 = uploadSpeedDetectionMapping;
        if (uploadSpeedDetectionMapping2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ld_min");
        c09dl.LJJJJ(Float.valueOf(uploadSpeedDetectionMapping2.getLd_min()));
        c09dl.LJIILLIIL("sd_min");
        c09dl.LJJJJ(Float.valueOf(uploadSpeedDetectionMapping2.getSd_min()));
        c09dl.LJIILLIIL("hd_min");
        c09dl.LJJJJ(Float.valueOf(uploadSpeedDetectionMapping2.getHd_min()));
        c09dl.LJIILLIIL("hd_60_min");
        c09dl.LJJJJ(Float.valueOf(uploadSpeedDetectionMapping2.getHd_60_min()));
        c09dl.LJIILLIIL("uhd_min");
        c09dl.LJJJJ(Float.valueOf(uploadSpeedDetectionMapping2.getUhd_min()));
        c09dl.LJIILLIIL("uhd_60_min");
        c09dl.LJJJJ(Float.valueOf(uploadSpeedDetectionMapping2.getUhd_60_min()));
        c09dl.LJII();
    }
}
