package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class NotifyPublicCommonParams_OptTypeAdapter extends TypeAdapter<NotifyPublicCommonParams> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final NotifyPublicCommonParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        NotifyPublicCommonParams notifyPublicCommonParams = new NotifyPublicCommonParams();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1399907075:
                        if (strLJJJJ.equals("component")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyPublicCommonParams.component = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 97555:
                        if (strLJJJJ.equals("biz")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyPublicCommonParams.biz = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyPublicCommonParams.scene = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 339542830:
                        if (strLJJJJ.equals("user_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                notifyPublicCommonParams.userType = c09cu.LJJIZ();
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
        return notifyPublicCommonParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, NotifyPublicCommonParams notifyPublicCommonParams) {
        NotifyPublicCommonParams notifyPublicCommonParams2 = notifyPublicCommonParams;
        if (notifyPublicCommonParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("biz");
        c09dl.LJJJJ(Integer.valueOf(notifyPublicCommonParams2.biz));
        c09dl.LJIILLIIL("component");
        c09dl.LJJJJ(Integer.valueOf(notifyPublicCommonParams2.component));
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJ(Integer.valueOf(notifyPublicCommonParams2.scene));
        c09dl.LJIILLIIL("user_type");
        c09dl.LJJJJ(Integer.valueOf(notifyPublicCommonParams2.userType));
        c09dl.LJII();
    }
}
