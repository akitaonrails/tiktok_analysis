package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TextFormat_OptTypeAdapter extends TypeAdapter<TextFormat> {
    @Override // com.google.gson.TypeAdapter
    public final TextFormat read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TextFormat textFormat = new TextFormat("", 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1539906063) {
                    if (iHashCode != -791592328) {
                        if (iHashCode == 94842723 && strLJJJJ.equals("color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                textFormat.color = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("weight")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            textFormat.weight = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("font_size")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        textFormat.fontSize = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return textFormat;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TextFormat textFormat) {
        TextFormat textFormat2 = textFormat;
        if (textFormat2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("color");
        c09dl.LJJJJJ(textFormat2.color);
        c09dl.LJIILLIIL("weight");
        c09dl.LJJJJ(Integer.valueOf(textFormat2.weight));
        c09dl.LJIILLIIL("font_size");
        c09dl.LJJJJ(Integer.valueOf(textFormat2.fontSize));
        c09dl.LJII();
    }
}
