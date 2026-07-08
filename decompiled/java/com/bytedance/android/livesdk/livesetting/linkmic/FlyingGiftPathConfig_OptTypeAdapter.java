package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FlyingGiftPathConfig_OptTypeAdapter extends TypeAdapter<FlyingGiftPathConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FlyingGiftPathConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FlyingGiftPathConfig flyingGiftPathConfig = new FlyingGiftPathConfig(null, null, null, null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1897185317:
                        if (strLJJJJ.equals("start_x")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.startX = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1897185316:
                        if (strLJJJJ.equals("start_y")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.startY = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -804450504:
                        if (strLJJJJ.equals("config_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.configId = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96651796:
                        if (strLJJJJ.equals("end_x")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.endX = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96651797:
                        if (strLJJJJ.equals("end_y")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.endY = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 106854733:
                        if (strLJJJJ.equals("pos_x")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.posX = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 106854734:
                        if (strLJJJJ.equals("pos_y")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.posY = Float.valueOf((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 977988074:
                        if (strLJJJJ.equals("range_l")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.rangeL = Integer.valueOf(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 977988080:
                        if (strLJJJJ.equals("range_r")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                flyingGiftPathConfig.rangeR = Integer.valueOf(c09cu.LJJIZ());
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
        return flyingGiftPathConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FlyingGiftPathConfig flyingGiftPathConfig) {
        FlyingGiftPathConfig flyingGiftPathConfig2 = flyingGiftPathConfig;
        if (flyingGiftPathConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config_id");
        c09dl.LJJJJ(flyingGiftPathConfig2.configId);
        c09dl.LJIILLIIL("start_x");
        c09dl.LJJJJ(flyingGiftPathConfig2.startX);
        c09dl.LJIILLIIL("start_y");
        c09dl.LJJJJ(flyingGiftPathConfig2.startY);
        c09dl.LJIILLIIL("end_x");
        c09dl.LJJJJ(flyingGiftPathConfig2.endX);
        c09dl.LJIILLIIL("end_y");
        c09dl.LJJJJ(flyingGiftPathConfig2.endY);
        c09dl.LJIILLIIL("pos_x");
        c09dl.LJJJJ(flyingGiftPathConfig2.posX);
        c09dl.LJIILLIIL("pos_y");
        c09dl.LJJJJ(flyingGiftPathConfig2.posY);
        c09dl.LJIILLIIL("range_l");
        c09dl.LJJJJ(flyingGiftPathConfig2.rangeL);
        c09dl.LJIILLIIL("range_r");
        c09dl.LJJJJ(flyingGiftPathConfig2.rangeR);
        c09dl.LJII();
    }
}
