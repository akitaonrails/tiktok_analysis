package tikcast.api.perception;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message._PerceptionDialogInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _ViolationStatusResponse_ProtoDecoder implements C0IMD<ViolationStatusResponse> {
    @Override // X.C0IMD
    public final void LIZ(ViolationStatusResponse violationStatusResponse) {
        ViolationStatusResponse.ResponseData responseData = violationStatusResponse.data;
        if (responseData != null) {
            PerceptionDialogInfo perceptionDialogInfo = responseData.perceptionDialog;
            if (perceptionDialogInfo != null) {
                _PerceptionDialogInfo_ProtoDecoder.LJ(perceptionDialogInfo);
            }
            Text text = responseData.perceptionToast;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
    }

    @Override // X.C0IMD
    public final ViolationStatusResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ViolationStatusResponse violationStatusResponse = new ViolationStatusResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        violationStatusResponse.extra = _ViolationStatusResponse_ResponseExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    violationStatusResponse.data = _ViolationStatusResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return violationStatusResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViolationStatusResponse violationStatusResponse, List list) {
    }
}
