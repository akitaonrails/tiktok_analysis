package webcast.api.linkmic_multi_guest;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.UserPosition;
import com.bytedance.android.livesdk.model.message.linkcore._UserPosition_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._ContentPosition_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;
import webcast.api.linkmic_multi_guest.LayoutUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _LayoutUpdateResponse_ResponseData_ProtoDecoder implements C0IMD<LayoutUpdateResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(LayoutUpdateResponse.ResponseData responseData) {
        LayoutUpdateResponse.ResponseData responseData2 = responseData;
        List<UserPosition> list = responseData2.userPos;
        if (list == null) {
            responseData2.userPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<UserPosition> it2 = responseData2.userPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (responseData2.linkedUserUiPositions == null) {
            responseData2.linkedUserUiPositions = new ArrayList();
        }
        List<ContentPosition> list2 = responseData2.contentPos;
        if (list2 == null) {
            responseData2.contentPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<ContentPosition> it3 = responseData2.contentPos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<PosIdentity> list3 = responseData2.uiPos;
        if (list3 == null) {
            responseData2.uiPos = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<PosIdentity> it4 = responseData2.uiPos.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        LayoutState layoutState = responseData2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list4 = responseData2.spotList;
        if (list4 == null) {
            responseData2.spotList = new ArrayList();
            return;
        }
        if (list4.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : responseData2.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final LayoutUpdateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LayoutUpdateResponse.ResponseData responseData = new LayoutUpdateResponse.ResponseData();
        responseData.linkedUserUiPositions = new ArrayList();
        responseData.userPos = new ArrayList();
        responseData.uiPos = new ArrayList();
        responseData.contentPos = new ArrayList();
        responseData.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.userPos.add(_UserPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        responseData.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        responseData.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        responseData.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        responseData.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        responseData.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LayoutUpdateResponse.ResponseData responseData, List list) {
    }
}
