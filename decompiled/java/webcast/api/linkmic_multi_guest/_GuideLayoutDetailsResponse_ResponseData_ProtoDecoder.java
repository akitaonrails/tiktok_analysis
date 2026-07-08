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
public final class _GuideLayoutDetailsResponse_ResponseData_ProtoDecoder implements C0IMD<GuideLayoutDetailsResponse.ResponseData> {
    public static GuideLayoutDetailsResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideLayoutDetailsResponse.ResponseData responseData = new GuideLayoutDetailsResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    responseData.anchorSetting = _GuideLayoutDetailsResponse_AnchorSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                responseData.isLastlyMg = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            responseData.anchorLayoutSetting = _GuideLayoutDetailsResponse_AnchorLayoutSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.showAvailableSpot = c1516680pZS.LJIIJ();
                    }
                } else {
                    responseData.roomLayoutData = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuideLayoutDetailsResponse.ResponseData responseData) {
        GuideLayoutDetailsResponse.ResponseData responseData2 = responseData;
        LayoutData layoutData = responseData2.roomLayoutData;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
        GuideLayoutDetailsResponse.AnchorLayoutSetting anchorLayoutSetting = responseData2.anchorLayoutSetting;
        if (anchorLayoutSetting != null) {
            _GuideLayoutDetailsResponse_AnchorLayoutSetting_ProtoDecoder.LJ(anchorLayoutSetting);
        }
        GuideLayoutDetailsResponse.AnchorSetting anchorSetting = responseData2.anchorSetting;
        if (anchorSetting != null) {
            _GuideLayoutDetailsResponse_AnchorSetting_ProtoDecoder.LJ(anchorSetting);
        }
    }

    @Override // X.C0IMD
    public final GuideLayoutDetailsResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideLayoutDetailsResponse.ResponseData responseData, List list) {
    }
}
