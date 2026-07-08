package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsListsData_BannerText_ProtoDecoder implements C0IMD<RivalsListsData.BannerText> {
    public static RivalsListsData.BannerText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsListsData.BannerText bannerText = new RivalsListsData.BannerText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bannerText.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bannerText.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        bannerText.buttonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        bannerText.isMatchValid = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        bannerText.isInUiExp = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        bannerText.bannerStyle = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        bannerText.quickCohostContentInfo = _QuickCohostContentInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerText;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RivalsListsData.BannerText bannerText) {
        QuickCohostContentInfo quickCohostContentInfo = bannerText.quickCohostContentInfo;
        if (quickCohostContentInfo != null) {
            _QuickCohostContentInfo_ProtoDecoder.LJ(quickCohostContentInfo);
        }
    }

    @Override // X.C0IMD
    public final RivalsListsData.BannerText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsListsData.BannerText bannerText, List list) {
    }
}
