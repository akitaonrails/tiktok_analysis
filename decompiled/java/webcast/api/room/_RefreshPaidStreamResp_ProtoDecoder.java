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
public final class _RefreshPaidStreamResp_ProtoDecoder implements C0IMD<RefreshPaidStreamResp> {
    @Override // X.C0IMD
    public final void LIZ(RefreshPaidStreamResp refreshPaidStreamResp) {
        RefreshPaidStreamResp.ResponseData responseData = refreshPaidStreamResp.data;
        if (responseData != null) {
            StreamUrl streamUrl = responseData.streamUrl;
            if (streamUrl != null) {
                _StreamUrl_ProtoDecoder.LJ(streamUrl);
            }
            StreamUrl streamUrl2 = responseData.multiStreamUrl;
            if (streamUrl2 != null) {
                _StreamUrl_ProtoDecoder.LJ(streamUrl2);
            }
        }
    }

    @Override // X.C0IMD
    public final RefreshPaidStreamResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RefreshPaidStreamResp refreshPaidStreamResp = new RefreshPaidStreamResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    refreshPaidStreamResp.data = _RefreshPaidStreamResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return refreshPaidStreamResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RefreshPaidStreamResp refreshPaidStreamResp, List list) {
    }
}
