package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.scene.Scene;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class GameMLBBHeroRecog_OptTypeAdapter extends TypeAdapter<GameMLBBHeroRecog> {
    public final Gson LIZ;

    public GameMLBBHeroRecog_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GameMLBBHeroRecog read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameMLBBHeroRecog gameMLBBHeroRecog = new GameMLBBHeroRecog();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1545477013:
                        if (strLJJJJ.equals("threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.threshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1273525432:
                        if (strLJJJJ.equals("output_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.outputNum = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1216396332:
                        if (strLJJJJ.equals("index_to_name_str")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.indexToNameStr = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1050356101:
                        if (strLJJJJ.equals("resize_width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.resizeWidth = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.scene = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 570418373:
                        if (strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.interval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 657460336:
                        if (strLJJJJ.equals("instant_infer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.instantInfer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1293412572:
                        if (strLJJJJ.equals("crop_area")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.cropArea = (Float[]) this.LIZ.LJIIJ(Float[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1365704466:
                        if (strLJJJJ.equals("resize_height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                gameMLBBHeroRecog.resizeHeight = c09cu.LJJIZ();
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
        return gameMLBBHeroRecog;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameMLBBHeroRecog gameMLBBHeroRecog) throws IOException {
        GameMLBBHeroRecog gameMLBBHeroRecog2 = gameMLBBHeroRecog;
        if (gameMLBBHeroRecog2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(gameMLBBHeroRecog2.enable);
        c09dl.LJIILLIIL("instant_infer");
        c09dl.LJJJJJL(gameMLBBHeroRecog2.instantInfer);
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJJ(gameMLBBHeroRecog2.scene);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(gameMLBBHeroRecog2.interval);
        c09dl.LJIILLIIL("crop_area");
        this.LIZ.LJIIJ(Float[].class).write(c09dl, gameMLBBHeroRecog2.cropArea);
        c09dl.LJIILLIIL("resize_width");
        c09dl.LJJJJ(Integer.valueOf(gameMLBBHeroRecog2.resizeWidth));
        c09dl.LJIILLIIL("resize_height");
        c09dl.LJJJJ(Integer.valueOf(gameMLBBHeroRecog2.resizeHeight));
        c09dl.LJIILLIIL("output_num");
        c09dl.LJJJJ(Integer.valueOf(gameMLBBHeroRecog2.outputNum));
        c09dl.LJIILLIIL("threshold");
        c09dl.LJJJJ(Float.valueOf(gameMLBBHeroRecog2.threshold));
        c09dl.LJIILLIIL("index_to_name_str");
        c09dl.LJJJJJ(gameMLBBHeroRecog2.indexToNameStr);
        c09dl.LJII();
    }
}
