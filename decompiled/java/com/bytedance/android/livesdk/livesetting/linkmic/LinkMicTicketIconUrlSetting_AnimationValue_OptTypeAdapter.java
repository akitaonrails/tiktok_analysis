package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LinkMicTicketIconUrlSetting_AnimationValue_OptTypeAdapter extends TypeAdapter<LinkMicTicketIconUrlSetting.AnimationValue> {
    public final Gson LIZ;

    public LinkMicTicketIconUrlSetting_AnimationValue_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicTicketIconUrlSetting.AnimationValue read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicTicketIconUrlSetting.AnimationValue animationValue = new LinkMicTicketIconUrlSetting.AnimationValue(null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != 3575610) {
                    if (iHashCode != 496117785) {
                        if (iHashCode == 1181280471 && strLJJJJ.equals("path_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                animationValue.pathValue = (PathAnimationValue) this.LIZ.LJIIJ(PathAnimationValue.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("normal_value")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            animationValue.normalValue = (NormalAnimationValue) this.LIZ.LJIIJ(NormalAnimationValue.class).read(c09cu);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        animationValue.type = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return animationValue;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicTicketIconUrlSetting.AnimationValue animationValue) {
        LinkMicTicketIconUrlSetting.AnimationValue animationValue2 = animationValue;
        if (animationValue2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("type");
        c09dl.LJJJJJ(animationValue2.type);
        c09dl.LJIILLIIL("path_value");
        this.LIZ.LJIIJ(PathAnimationValue.class).write(c09dl, animationValue2.pathValue);
        c09dl.LJIILLIIL("normal_value");
        this.LIZ.LJIIJ(NormalAnimationValue.class).write(c09dl, animationValue2.normalValue);
        c09dl.LJII();
    }
}
