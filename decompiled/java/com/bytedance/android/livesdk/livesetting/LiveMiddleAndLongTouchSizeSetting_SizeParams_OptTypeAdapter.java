package com.bytedance.android.livesdk.livesetting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.LiveMiddleAndLongTouchSizeSetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMiddleAndLongTouchSizeSetting_SizeParams_OptTypeAdapter extends TypeAdapter<LiveMiddleAndLongTouchSizeSetting.SizeParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveMiddleAndLongTouchSizeSetting.SizeParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMiddleAndLongTouchSizeSetting.SizeParams sizeParams = new LiveMiddleAndLongTouchSizeSetting.SizeParams(24, 96, 24, 106);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1778596790:
                        if (strLJJJJ.equals("long_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sizeParams.longHeight = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -320501181:
                        if (strLJJJJ.equals("long_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sizeParams.longWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 176891548:
                        if (strLJJJJ.equals("middle_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sizeParams.middleWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 755675921:
                        if (strLJJJJ.equals("middle_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sizeParams.middleHeight = c09cu.LJJIZ();
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
        return sizeParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMiddleAndLongTouchSizeSetting.SizeParams sizeParams) {
        LiveMiddleAndLongTouchSizeSetting.SizeParams sizeParams2 = sizeParams;
        if (sizeParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("middle_height");
        c09dl.LJJJJ(Integer.valueOf(sizeParams2.middleHeight));
        c09dl.LJIILLIIL("middle_width");
        c09dl.LJJJJ(Integer.valueOf(sizeParams2.middleWidth));
        c09dl.LJIILLIIL("long_height");
        c09dl.LJJJJ(Integer.valueOf(sizeParams2.longHeight));
        c09dl.LJIILLIIL("long_width");
        c09dl.LJJJJ(Integer.valueOf(sizeParams2.longWidth));
        c09dl.LJII();
    }
}
