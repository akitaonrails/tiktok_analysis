package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _GradeIcon_ProtoDecoder implements C0IMD<GradeIcon> {
    public static GradeIcon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GradeIcon gradeIcon = new GradeIcon();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                gradeIcon.levelStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gradeIcon.level = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        gradeIcon.iconDiamond = (int) c1516680pZS.LJIIJJI();
                    }
                } else {
                    gradeIcon.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gradeIcon;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GradeIcon gradeIcon) {
        ImageModel imageModel = gradeIcon.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GradeIcon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GradeIcon gradeIcon, List list) {
    }
}
