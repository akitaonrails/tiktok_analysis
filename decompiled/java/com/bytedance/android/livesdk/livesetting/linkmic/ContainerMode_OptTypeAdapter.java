package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class ContainerMode_OptTypeAdapter extends TypeAdapter<ContainerMode> {
    public final Gson LIZ;

    public ContainerMode_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ContainerMode read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ContainerMode containerMode = new ContainerMode(new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null), new ContainerModeScene("fullscreen", "fit", "center", "center", "center", "center", null));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1367706280:
                        if (strLJJJJ.equals("canvas")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerMode.viewForCanvas = (ContainerModeScene) this.LIZ.LJIIJ(ContainerModeScene.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -906336856:
                        if (strLJJJJ.equals("search")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerMode.viewForSearch = (ContainerModeScene) this.LIZ.LJIIJ(ContainerModeScene.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3321850:
                        if (strLJJJJ.equals("link")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerMode.viewForLink = (ContainerModeScene) this.LIZ.LJIIJ(ContainerModeScene.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1710043591:
                        if (strLJJJJ.equals("pad_portrait")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerMode.padPortrait = (ContainerModeScene) this.LIZ.LJIIJ(ContainerModeScene.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1769947663:
                        if (strLJJJJ.equals("pad_landscape")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                containerMode.padLandscape = (ContainerModeScene) this.LIZ.LJIIJ(ContainerModeScene.class).read(c09cu);
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
        return containerMode;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ContainerMode containerMode) {
        ContainerMode containerMode2 = containerMode;
        if (containerMode2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("canvas");
        TypeAdapter typeAdapterLJIIJ = this.LIZ.LJIIJ(ContainerModeScene.class);
        typeAdapterLJIIJ.write(c09dl, containerMode2.viewForCanvas);
        c09dl.LJIILLIIL("link");
        typeAdapterLJIIJ.write(c09dl, containerMode2.viewForLink);
        c09dl.LJIILLIIL("search");
        typeAdapterLJIIJ.write(c09dl, containerMode2.viewForSearch);
        c09dl.LJIILLIIL("pad_portrait");
        typeAdapterLJIIJ.write(c09dl, containerMode2.padPortrait);
        c09dl.LJIILLIIL("pad_landscape");
        typeAdapterLJIIJ.write(c09dl, containerMode2.padLandscape);
        c09dl.LJII();
    }
}
