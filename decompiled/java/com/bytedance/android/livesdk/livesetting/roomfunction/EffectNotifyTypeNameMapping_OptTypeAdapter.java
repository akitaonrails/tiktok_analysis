package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.scene.Scene;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class EffectNotifyTypeNameMapping_OptTypeAdapter extends TypeAdapter<EffectNotifyTypeNameMapping> {
    public final Gson LIZ;

    public EffectNotifyTypeNameMapping_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final EffectNotifyTypeNameMapping read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EffectNotifyTypeNameMapping effectNotifyTypeNameMapping = new EffectNotifyTypeNameMapping();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1399907075:
                        if (strLJJJJ.equals("component")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyTypeNameMapping.component = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -979207434:
                        if (strLJJJJ.equals("feature")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyTypeNameMapping.feature = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 97555:
                        if (strLJJJJ.equals("biz")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyTypeNameMapping.biz = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2998801:
                        if (strLJJJJ.equals("anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyTypeNameMapping.anim = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyTypeNameMapping.scene = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 409378436:
                        if (strLJJJJ.equals("consume_method")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectNotifyTypeNameMapping.consumeMethod = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
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
        return effectNotifyTypeNameMapping;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EffectNotifyTypeNameMapping effectNotifyTypeNameMapping) {
        EffectNotifyTypeNameMapping effectNotifyTypeNameMapping2 = effectNotifyTypeNameMapping;
        if (effectNotifyTypeNameMapping2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("component");
        C473040Igo.LJ(this.LIZ, c09dl, effectNotifyTypeNameMapping2.component, String.class);
        c09dl.LJIILLIIL("biz");
        C473040Igo.LJ(this.LIZ, c09dl, effectNotifyTypeNameMapping2.biz, String.class);
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        C473040Igo.LJ(this.LIZ, c09dl, effectNotifyTypeNameMapping2.scene, String.class);
        c09dl.LJIILLIIL("consume_method");
        C473040Igo.LJ(this.LIZ, c09dl, effectNotifyTypeNameMapping2.consumeMethod, String.class);
        c09dl.LJIILLIIL("anim");
        C473040Igo.LJ(this.LIZ, c09dl, effectNotifyTypeNameMapping2.anim, String.class);
        c09dl.LJIILLIIL("feature");
        C473040Igo.LJ(this.LIZ, c09dl, effectNotifyTypeNameMapping2.feature, String.class);
        c09dl.LJII();
    }
}
