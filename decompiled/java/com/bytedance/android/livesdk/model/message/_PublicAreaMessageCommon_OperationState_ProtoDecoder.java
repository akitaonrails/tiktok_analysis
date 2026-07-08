package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_OperationState_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.OperationState> {
    public static PublicAreaMessageCommon.OperationState LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.OperationState operationState = new PublicAreaMessageCommon.OperationState();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        operationState.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        operationState.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        operationState.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        operationState.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        operationState.animationStyle = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        operationState.duration = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return operationState;
            }
        }
    }

    public static void LJ(PublicAreaMessageCommon.OperationState operationState) {
        ImageModel imageModel = operationState.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = operationState.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.OperationState operationState) {
        LJ(operationState);
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.OperationState LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.OperationState operationState, List list) {
    }
}
