package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ComboBar_ProtoDecoder implements C0IMD<ComboBar> {
    public static ComboBar LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ComboBar comboBar = new ComboBar();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        comboBar.showComboBar = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        comboBar.comboStyle = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        comboBar.targetComboNum = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        comboBar.targetReachTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        comboBar.displayTextBeforeReach = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        comboBar.displayTextAfterReach = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        comboBar.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return comboBar;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ComboBar comboBar) {
        ImageModel imageModel = comboBar.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ComboBar LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ComboBar comboBar, List list) {
    }
}
