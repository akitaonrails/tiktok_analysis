package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;
import webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideLayoutDetailsResponse_ProtoDecoder implements C0IMD<GuideLayoutDetailsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GuideLayoutDetailsResponse guideLayoutDetailsResponse) {
        GuideLayoutDetailsResponse.ResponseData responseData = guideLayoutDetailsResponse.data;
        if (responseData != null) {
            LayoutData layoutData = responseData.roomLayoutData;
            if (layoutData != null) {
                _LayoutData_ProtoDecoder.LJ(layoutData);
            }
            GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting = responseData.anchorLayoutSetting;
            if (anchorLayoutSetting != null) {
                _GuideLayoutDetailsResponse_AnchorLayoutSetting_ProtoDecoder.LJ(anchorLayoutSetting);
            }
            GuideLayoutDetailsResponse.AnchorSetting anchorSetting = responseData.anchorSetting;
            if (anchorSetting != null) {
                _GuideLayoutDetailsResponse_AnchorSetting_ProtoDecoder.LJ(anchorSetting);
            }
        }
    }

    @Override // X.C0IMD
    public final GuideLayoutDetailsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuideLayoutDetailsResponse guideLayoutDetailsResponse = new GuideLayoutDetailsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        guideLayoutDetailsResponse.extra = _GuideLayoutDetailsResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    guideLayoutDetailsResponse.data = _GuideLayoutDetailsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guideLayoutDetailsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideLayoutDetailsResponse guideLayoutDetailsResponse, List list) {
    }
}
