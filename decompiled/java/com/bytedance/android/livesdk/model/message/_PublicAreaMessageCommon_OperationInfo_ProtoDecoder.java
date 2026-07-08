package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_OperationInfo_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.OperationInfo> {
    public static PublicAreaMessageCommon.OperationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.OperationInfo operationInfo = new PublicAreaMessageCommon.OperationInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            operationInfo.failureState = _PublicAreaMessageCommon_OperationState_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        operationInfo.successState = _PublicAreaMessageCommon_OperationState_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    operationInfo.initialState = _PublicAreaMessageCommon_OperationState_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return operationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.OperationInfo operationInfo) {
        PublicAreaMessageCommon.OperationInfo operationInfo2 = operationInfo;
        PublicAreaMessageCommon.OperationState operationState = operationInfo2.initialState;
        if (operationState != null) {
            _PublicAreaMessageCommon_OperationState_ProtoDecoder.LJ(operationState);
        }
        PublicAreaMessageCommon.OperationState operationState2 = operationInfo2.successState;
        if (operationState2 != null) {
            _PublicAreaMessageCommon_OperationState_ProtoDecoder.LJ(operationState2);
        }
        PublicAreaMessageCommon.OperationState operationState3 = operationInfo2.failureState;
        if (operationState3 != null) {
            _PublicAreaMessageCommon_OperationState_ProtoDecoder.LJ(operationState3);
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.OperationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.OperationInfo operationInfo, List list) {
    }
}
