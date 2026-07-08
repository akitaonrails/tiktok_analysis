package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class Insets_OptTypeAdapter extends TypeAdapter<Insets> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Insets read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Insets insets = new Insets(0, 0, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1383228885:
                        if (strLJJJJ.equals("bottom")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                insets.bottom = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 115029:
                        if (strLJJJJ.equals("top")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                insets.top = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3317767:
                        if (strLJJJJ.equals("left")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                insets.left = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 108511772:
                        if (strLJJJJ.equals("right")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                insets.right = c09cu.LJJIZ();
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
        return insets;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Insets insets) {
        Insets insets2 = insets;
        if (insets2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("left");
        c09dl.LJJJJ(Integer.valueOf(insets2.left));
        c09dl.LJIILLIIL("top");
        c09dl.LJJJJ(Integer.valueOf(insets2.top));
        c09dl.LJIILLIIL("right");
        c09dl.LJJJJ(Integer.valueOf(insets2.right));
        c09dl.LJIILLIIL("bottom");
        c09dl.LJJJJ(Integer.valueOf(insets2.bottom));
        c09dl.LJII();
    }
}
