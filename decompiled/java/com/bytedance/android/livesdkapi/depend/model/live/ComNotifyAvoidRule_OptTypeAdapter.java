package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ComNotifyAvoidRule_OptTypeAdapter extends TypeAdapter<ComNotifyAvoidRule> {
    public final Gson LIZ;

    public ComNotifyAvoidRule_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ComNotifyAvoidRule read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ComNotifyAvoidRule comNotifyAvoidRule = new ComNotifyAvoidRule();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1561624960:
                        if (strLJJJJ.equals("avoid_scene_applied")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                comNotifyAvoidRule.avoidSceneApplied = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1399907075:
                        if (strLJJJJ.equals("component")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                comNotifyAvoidRule.component = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 252859229:
                        if (strLJJJJ.equals("range_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                comNotifyAvoidRule.rangeId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1008208194:
                        if (strLJJJJ.equals("avoid_scene")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                comNotifyAvoidRule.avoidScene = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1319028378:
                        if (strLJJJJ.equals("range_id_room_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                comNotifyAvoidRule.rangeIdRoomMap = C473040Igo.LIZJ(this.LIZ, c09cu, Integer.TYPE, String.class);
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
        return comNotifyAvoidRule;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ComNotifyAvoidRule comNotifyAvoidRule) {
        ComNotifyAvoidRule comNotifyAvoidRule2 = comNotifyAvoidRule;
        if (comNotifyAvoidRule2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("avoid_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, comNotifyAvoidRule2.avoidScene, String.class);
        c09dl.LJIILLIIL("avoid_scene_applied");
        C473040Igo.LIZLLL(this.LIZ, c09dl, comNotifyAvoidRule2.avoidSceneApplied, Integer.TYPE);
        c09dl.LJIILLIIL("component");
        c09dl.LJJJJ(Integer.valueOf(comNotifyAvoidRule2.component));
        c09dl.LJIILLIIL("range_id");
        c09dl.LJJJJJ(comNotifyAvoidRule2.rangeId);
        c09dl.LJIILLIIL("range_id_room_map");
        C473040Igo.LJ(this.LIZ, c09dl, comNotifyAvoidRule2.rangeIdRoomMap, String.class);
        c09dl.LJII();
    }
}
