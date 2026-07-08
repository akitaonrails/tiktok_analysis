package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.scene.Scene;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class AceBindPhoneScene_OptTypeAdapter extends TypeAdapter<AceBindPhoneScene> {
    public final Gson LIZ;

    public AceBindPhoneScene_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AceBindPhoneScene read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AceBindPhoneScene aceBindPhoneScene = new AceBindPhoneScene(null, false, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 109254796) {
                        if (iHashCode == 382350310 && strLJJJJ.equals("classification")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                aceBindPhoneScene.setClassification(C473040Igo.LIZ(this.LIZ, c09cu, Classification.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            aceBindPhoneScene.setScene(c09cu.LJJJZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        aceBindPhoneScene.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return aceBindPhoneScene;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AceBindPhoneScene aceBindPhoneScene) throws IOException {
        AceBindPhoneScene aceBindPhoneScene2 = aceBindPhoneScene;
        if (aceBindPhoneScene2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJJ(aceBindPhoneScene2.getScene());
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(aceBindPhoneScene2.getEnable());
        c09dl.LJIILLIIL("classification");
        C473040Igo.LIZLLL(this.LIZ, c09dl, aceBindPhoneScene2.getClassification(), Classification.class);
        c09dl.LJII();
    }
}
