package webcast.api.linkmic;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.linkmic.ApplyResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _ApplyResponse_ResponseData_ProtoDecoder implements C0IMD<ApplyResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(ApplyResponse.ResponseData responseData) {
        PerceptionMessage perceptionMessage = responseData.perceptionMessage;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final ApplyResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ApplyResponse.ResponseData responseData = new ApplyResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.actionId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        responseData.channelId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 3:
                        responseData.linkMicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        responseData.rivalsLinkMicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        responseData.perceptionStatus = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        responseData.perceptionMessage = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        responseData.extra = _ApplyResponse_ApplyExtra_ProtoDecoder.LIZLLL(c1516680pZS);
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
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyResponse.ResponseData responseData, List list) {
    }
}
