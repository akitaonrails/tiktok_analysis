package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveTakeTheStageColor_OptTypeAdapter extends TypeAdapter<LiveTakeTheStageColor> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTakeTheStageColor read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTakeTheStageColor liveTakeTheStageColor = new LiveTakeTheStageColor("", "", "", "", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1081464084:
                        if (strLJJJJ.equals("empty_item_bg_border_end_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.emptyItemBackgroundBorderEndColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -891330495:
                        if (strLJJJJ.equals("empty_item_bg_border_from_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.emptyItemBackgroundBorderFromColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -876997995:
                        if (strLJJJJ.equals("item_bg_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.itemBgColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -144851771:
                        if (strLJJJJ.equals("bg_color_hex")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.bgColorHex = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 816413453:
                        if (strLJJJJ.equals("hex_str")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.hexStr = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 943010435:
                        if (strLJJJJ.equals("empty_item_gradient_from_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.emptyItemGradientFromColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1055918186:
                        if (strLJJJJ.equals("empty_item_gradient_end_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.emptyItemGradientEndColor = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1289497063:
                        if (strLJJJJ.equals("color_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTakeTheStageColor.colorName = c09cu.LJJJZ();
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
        return liveTakeTheStageColor;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTakeTheStageColor liveTakeTheStageColor) {
        LiveTakeTheStageColor liveTakeTheStageColor2 = liveTakeTheStageColor;
        if (liveTakeTheStageColor2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("color_name");
        c09dl.LJJJJJ(liveTakeTheStageColor2.colorName);
        c09dl.LJIILLIIL("hex_str");
        c09dl.LJJJJJ(liveTakeTheStageColor2.hexStr);
        c09dl.LJIILLIIL("bg_color_hex");
        c09dl.LJJJJJ(liveTakeTheStageColor2.bgColorHex);
        c09dl.LJIILLIIL("empty_item_gradient_from_color");
        c09dl.LJJJJJ(liveTakeTheStageColor2.emptyItemGradientFromColor);
        c09dl.LJIILLIIL("empty_item_gradient_end_color");
        c09dl.LJJJJJ(liveTakeTheStageColor2.emptyItemGradientEndColor);
        c09dl.LJIILLIIL("empty_item_bg_border_from_color");
        c09dl.LJJJJJ(liveTakeTheStageColor2.emptyItemBackgroundBorderFromColor);
        c09dl.LJIILLIIL("empty_item_bg_border_end_color");
        c09dl.LJJJJJ(liveTakeTheStageColor2.emptyItemBackgroundBorderEndColor);
        c09dl.LJIILLIIL("item_bg_color");
        c09dl.LJJJJJ(liveTakeTheStageColor2.itemBgColor);
        c09dl.LJII();
    }
}
