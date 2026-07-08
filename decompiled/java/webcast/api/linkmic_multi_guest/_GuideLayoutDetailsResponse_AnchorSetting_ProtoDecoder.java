package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideLayoutDetailsResponse_AnchorSetting_ProtoDecoder implements C0IMD<GuideLayoutDetailsResponse.AnchorSetting> {
    public static GuideLayoutDetailsResponse.AnchorSetting LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideLayoutDetailsResponse.AnchorSetting anchorSetting = new GuideLayoutDetailsResponse.AnchorSetting();
        anchorSetting.bubbles = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorSetting.multiGuestApplyAutoApprove = c1516680pZS.LJIIJ();
                    }
                } else {
                    anchorSetting.bubbles.add(_GuideLayoutDetailsResponse_Bubble_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorSetting;
            }
        }
    }

    public static void LJ(GuideLayoutDetailsResponse.AnchorSetting anchorSetting) {
        List<GuideLayoutDetailsResponse.Bubble> list = anchorSetting.bubbles;
        if (list == null) {
            anchorSetting.bubbles = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GuideLayoutDetailsResponse.Bubble> it2 = anchorSetting.bubbles.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideLayoutDetailsResponse.AnchorSetting anchorSetting) {
        LJ(anchorSetting);
    }

    @Override // X.C0IMD
    public final GuideLayoutDetailsResponse.AnchorSetting LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideLayoutDetailsResponse.AnchorSetting anchorSetting, List list) {
    }
}
