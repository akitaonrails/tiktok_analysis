package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyAvoidRule_OptTypeAdapter extends TypeAdapter<NotifyAvoidRule> {
    public final Gson LIZ;

    public NotifyAvoidRule_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NotifyAvoidRule read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NotifyAvoidRule notifyAvoidRule = new NotifyAvoidRule();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1165461084:
                        if (strLJJJJ.equals("priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.priority = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -979207434:
                        if (strLJJJJ.equals("feature")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.feature = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -873668326:
                        if (strLJJJJ.equals("timely")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.timely = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 17463044:
                        if (strLJJJJ.equals("public_common_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.publicCommonParams = (NotifyPublicCommonParams) this.LIZ.LJIIJ(NotifyPublicCommonParams.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 252859229:
                        if (strLJJJJ.equals("range_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.rangeId = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1008208194:
                        if (strLJJJJ.equals("avoid_scene")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.avoidScene = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1116678312:
                        if (strLJJJJ.equals("anim_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.animType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1319028378:
                        if (strLJJJJ.equals("range_id_room_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyAvoidRule.rangeIdRoomMap = C473040Igo.LIZJ(this.LIZ, c09cu, Integer.TYPE, String.class);
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
        return notifyAvoidRule;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotifyAvoidRule notifyAvoidRule) throws IOException {
        NotifyAvoidRule notifyAvoidRule2 = notifyAvoidRule;
        if (notifyAvoidRule2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("anim_type");
        c09dl.LJJJJ(Integer.valueOf(notifyAvoidRule2.animType));
        c09dl.LJIILLIIL("avoid_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, notifyAvoidRule2.avoidScene, String.class);
        c09dl.LJIILLIIL("feature");
        c09dl.LJJJJ(Integer.valueOf(notifyAvoidRule2.feature));
        c09dl.LJIILLIIL("priority");
        c09dl.LJJIZ(notifyAvoidRule2.priority);
        c09dl.LJIILLIIL("public_common_params");
        this.LIZ.LJIIJ(NotifyPublicCommonParams.class).write(c09dl, notifyAvoidRule2.publicCommonParams);
        c09dl.LJIILLIIL("range_id");
        c09dl.LJJJJJ(notifyAvoidRule2.rangeId);
        c09dl.LJIILLIIL("range_id_room_map");
        C473040Igo.LJ(this.LIZ, c09dl, notifyAvoidRule2.rangeIdRoomMap, String.class);
        c09dl.LJIILLIIL("timely");
        c09dl.LJJJJJL(notifyAvoidRule2.timely);
        c09dl.LJII();
    }
}
