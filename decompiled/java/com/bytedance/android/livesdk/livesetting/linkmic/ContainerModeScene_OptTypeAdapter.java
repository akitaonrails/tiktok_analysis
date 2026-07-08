package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class ContainerModeScene_OptTypeAdapter extends TypeAdapter<ContainerModeScene> {
    public final Gson LIZ;

    public ContainerModeScene_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ContainerModeScene read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ContainerModeScene containerModeScene = new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1766518340:
                        if (strLJJJJ.equals("align_less_h")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.alignLessHorizontal = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1766518326:
                        if (strLJJJJ.equals("align_less_v")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.alignLessVertical = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1183792394:
                        if (strLJJJJ.equals("insets")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.insets = (Insets) this.LIZ.LJIIJ(Insets.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 855680056:
                        if (strLJJJJ.equals("container_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.containerType = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1479389353:
                        if (strLJJJJ.equals("align_greater_h")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.alignGreaterHorizontal = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1479389367:
                        if (strLJJJJ.equals("align_greater_v")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.alignGreaterVertical = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1924300047:
                        if (strLJJJJ.equals("scale_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerModeScene.scaleType = c09cu.LJJJZ();
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
        return containerModeScene;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ContainerModeScene containerModeScene) {
        ContainerModeScene containerModeScene2 = containerModeScene;
        if (containerModeScene2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("container_type");
        c09dl.LJJJJJ(containerModeScene2.containerType);
        c09dl.LJIILLIIL("scale_type");
        c09dl.LJJJJJ(containerModeScene2.scaleType);
        c09dl.LJIILLIIL("align_greater_h");
        c09dl.LJJJJJ(containerModeScene2.alignGreaterHorizontal);
        c09dl.LJIILLIIL("align_greater_v");
        c09dl.LJJJJJ(containerModeScene2.alignGreaterVertical);
        c09dl.LJIILLIIL("align_less_h");
        c09dl.LJJJJJ(containerModeScene2.alignLessHorizontal);
        c09dl.LJIILLIIL("align_less_v");
        c09dl.LJJJJJ(containerModeScene2.alignLessVertical);
        c09dl.LJIILLIIL("insets");
        this.LIZ.LJIIJ(Insets.class).write(c09dl, containerModeScene2.insets);
        c09dl.LJII();
    }
}
