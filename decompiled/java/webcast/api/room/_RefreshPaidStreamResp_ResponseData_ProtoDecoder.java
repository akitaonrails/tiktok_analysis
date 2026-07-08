package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrl_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.room.RefreshPaidStreamResp;

/* JADX INFO: loaded from: classes.dex */
public final class _RefreshPaidStreamResp_ResponseData_ProtoDecoder implements C0IMD<RefreshPaidStreamResp.ResponseData> {
    public static RefreshPaidStreamResp.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RefreshPaidStreamResp.ResponseData responseData = new RefreshPaidStreamResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.multiStreamUrl = _StreamUrl_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.streamUrl = _StreamUrl_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RefreshPaidStreamResp.ResponseData responseData) {
        RefreshPaidStreamResp.ResponseData responseData2 = responseData;
        StreamUrl streamUrl = responseData2.streamUrl;
        if (streamUrl != null) {
            _StreamUrl_ProtoDecoder.LJ(streamUrl);
        }
        StreamUrl streamUrl2 = responseData2.multiStreamUrl;
        if (streamUrl2 != null) {
            _StreamUrl_ProtoDecoder.LJ(streamUrl2);
        }
    }

    @Override // X.C0IMD
    public final RefreshPaidStreamResp.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RefreshPaidStreamResp.ResponseData responseData, List list) {
    }
}
