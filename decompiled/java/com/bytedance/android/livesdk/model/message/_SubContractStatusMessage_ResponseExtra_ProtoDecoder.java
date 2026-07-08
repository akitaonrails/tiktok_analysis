package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.SubContractStatusMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubContractStatusMessage_ResponseExtra_ProtoDecoder implements C0IMD<SubContractStatusMessage.ResponseExtra> {
    public static SubContractStatusMessage.ResponseExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubContractStatusMessage.ResponseExtra responseExtra = new SubContractStatusMessage.ResponseExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseExtra.now = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final SubContractStatusMessage.ResponseExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SubContractStatusMessage.ResponseExtra responseExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubContractStatusMessage.ResponseExtra responseExtra, List list) {
    }
}
