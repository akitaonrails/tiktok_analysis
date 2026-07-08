package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;
import webcast.api.linkmic_multi_guest.SwitchSpotResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _SwitchSpotResponse_ResponseData_ProtoDecoder implements C0IMD<SwitchSpotResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(SwitchSpotResponse.ResponseData responseData) {
        SwitchSpotResponse.ResponseData responseData2 = responseData;
        List<PosIdentity> list = responseData2.uiPos;
        if (list == null) {
            responseData2.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = responseData2.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = responseData2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = responseData2.spotList;
        if (list2 == null) {
            responseData2.spotList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : responseData2.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final SwitchSpotResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SwitchSpotResponse.ResponseData responseData = new SwitchSpotResponse.ResponseData();
        responseData.uiPos = new ArrayList();
        responseData.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        responseData.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SwitchSpotResponse.ResponseData responseData, List list) {
    }
}
