package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class SurfaceViewScene_OptTypeAdapter extends TypeAdapter<SurfaceViewScene> {
    public final Gson LIZ;

    public SurfaceViewScene_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SurfaceViewScene read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SurfaceViewScene surfaceViewScene = new SurfaceViewScene(false, false, false, false, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1336041635:
                        if (strLJJJJ.equals("outside_with_feed")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                surfaceViewScene.outside_with_feed = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 380150922:
                        if (strLJJJJ.equals("outside_normal_click")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                surfaceViewScene.outside_normal_click = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 823139725:
                        if (strLJJJJ.equals("inner_draw")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                surfaceViewScene.inner_draw = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 823321719:
                        if (strLJJJJ.equals("inner_jump")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                surfaceViewScene.inner_jump = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 866027580:
                        if (strLJJJJ.equals("forbidden_entrance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                surfaceViewScene.forbidden_entrance = c09cu.LJJJZ();
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
        return surfaceViewScene;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SurfaceViewScene surfaceViewScene) throws IOException {
        SurfaceViewScene surfaceViewScene2 = surfaceViewScene;
        if (surfaceViewScene2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("outside_with_feed");
        c09dl.LJJJJJL(surfaceViewScene2.outside_with_feed);
        c09dl.LJIILLIIL("outside_normal_click");
        c09dl.LJJJJJL(surfaceViewScene2.outside_normal_click);
        c09dl.LJIILLIIL("inner_draw");
        c09dl.LJJJJJL(surfaceViewScene2.inner_draw);
        c09dl.LJIILLIIL("inner_jump");
        c09dl.LJJJJJL(surfaceViewScene2.inner_jump);
        c09dl.LJIILLIIL("forbidden_entrance");
        c09dl.LJJJJJ(surfaceViewScene2.forbidden_entrance);
        c09dl.LJII();
    }
}
