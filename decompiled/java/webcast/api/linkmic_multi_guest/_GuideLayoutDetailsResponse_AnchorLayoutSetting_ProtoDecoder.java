package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;
import tikcast.linkmic.common._AnchorPanelLayoutTypeSetting_ProtoDecoder;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideLayoutDetailsResponse_AnchorLayoutSetting_ProtoDecoder implements C0IMD<GuideLayoutDetailsResponse.AnchorLayoutSetting> {
    public static GuideLayoutDetailsResponse.AnchorLayoutSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting = new GuideLayoutDetailsResponse.AnchorLayoutSetting();
        anchorLayoutSetting.panelLayoutTypeSetting = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorLayoutSetting.panelLayoutTypeSetting.add(_AnchorPanelLayoutTypeSetting_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorLayoutSetting;
            }
        }
    }

    public static void LJ(GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting) {
        List<AnchorPanelLayoutTypeSetting> list = anchorLayoutSetting.panelLayoutTypeSetting;
        if (list == null) {
            anchorLayoutSetting.panelLayoutTypeSetting = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<AnchorPanelLayoutTypeSetting> it2 = anchorLayoutSetting.panelLayoutTypeSetting.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting) {
        LJ(anchorLayoutSetting);
    }

    @Override // X.C0IMD
    public final GuideLayoutDetailsResponse.AnchorLayoutSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting, List list) {
    }
}
