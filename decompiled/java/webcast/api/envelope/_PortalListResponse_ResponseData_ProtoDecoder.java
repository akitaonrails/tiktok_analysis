package webcast.api.envelope;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.envelope.PortalListResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _PortalListResponse_ResponseData_ProtoDecoder implements C0IMD<PortalListResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PortalListResponse.ResponseData responseData) {
        ImageModel imageModel;
        PortalListResponse.ResponseData responseData2 = responseData;
        List<PortalListResponse.PortalInfo> list = responseData2.portal;
        if (list == null) {
            responseData2.portal = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (PortalListResponse.PortalInfo portalInfo : responseData2.portal) {
            if (portalInfo != null && (imageModel = portalInfo.senderAvatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final PortalListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PortalListResponse.ResponseData responseData = new PortalListResponse.ResponseData();
        responseData.portal = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.portal.add(_PortalListResponse_PortalInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PortalListResponse.ResponseData responseData, List list) {
    }
}
