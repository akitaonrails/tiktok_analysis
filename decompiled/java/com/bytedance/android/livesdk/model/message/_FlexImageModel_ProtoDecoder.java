package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlexImageModel_ProtoDecoder implements C0IMD<FlexImageModel> {
    public static FlexImageModel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlexImageModel flexImageModel = new FlexImageModel();
        flexImageModel.flexSetting = new ArrayList();
        flexImageModel.urlList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            flexImageModel.flexSetting.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        flexImageModel.uri = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    flexImageModel.urlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flexImageModel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FlexImageModel flexImageModel) {
        FlexImageModel flexImageModel2 = flexImageModel;
        if (flexImageModel2.urlList == null) {
            flexImageModel2.urlList = new ArrayList();
        }
        if (flexImageModel2.flexSetting == null) {
            flexImageModel2.flexSetting = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final FlexImageModel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlexImageModel flexImageModel, List list) {
    }
}
