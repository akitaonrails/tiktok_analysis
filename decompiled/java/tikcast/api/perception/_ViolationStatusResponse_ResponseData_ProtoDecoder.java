package tikcast.api.perception;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _ViolationStatusResponse_ResponseData_ProtoDecoder implements C0IMD<ViolationStatusResponse.ResponseData> {
    public static ViolationStatusResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ViolationStatusResponse.ResponseData responseData = new ViolationStatusResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                responseData.perceptionToast = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            responseData.punishEvent = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.perceptionDialog = _PerceptionDialogInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ViolationStatusResponse.ResponseData responseData) {
        ViolationStatusResponse.ResponseData responseData2 = responseData;
        PerceptionDialogInfo perceptionDialogInfo = responseData2.perceptionDialog;
        if (perceptionDialogInfo != null) {
            _PerceptionDialogInfo_ProtoDecoder.LJ(perceptionDialogInfo);
        }
        Text text = responseData2.perceptionToast;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final ViolationStatusResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViolationStatusResponse.ResponseData responseData, List list) {
    }
}
