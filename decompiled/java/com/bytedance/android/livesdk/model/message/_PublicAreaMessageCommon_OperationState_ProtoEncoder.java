package com.bytedance.android.livesdk.model.message;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_OperationState_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.OperationState> {
    public static int LIZLLL(PublicAreaMessageCommon.OperationState operationState) {
        if (operationState == null) {
            return 0;
        }
        return C1142340fpg.LJIILL(1, operationState.scene) + _ImageModel_ProtoEncoder.LJ(2, operationState.icon) + _Text_ProtoEncoder.LJ(3, operationState.text) + C1142340fpg.LJIILL(4, operationState.schema) + C1142340fpg.LJIIL(5, operationState.animationStyle) + C1142340fpg.LJIIL(6, operationState.duration);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.OperationState operationState) {
        C1142340fpg.LJFF(c1142350fph, 1, operationState.scene);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, operationState.icon);
        _Text_ProtoEncoder.LIZJ(c1142350fph, 3, operationState.text);
        C1142340fpg.LJFF(c1142350fph, 4, operationState.schema);
        long j = operationState.animationStyle;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j);
        long j2 = operationState.duration;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j2);
    }

    public static int LJ(int i, PublicAreaMessageCommon.OperationState operationState) {
        if (operationState == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(operationState);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.OperationState operationState) {
        LIZIZ(c1142350fph, operationState);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, PublicAreaMessageCommon.OperationState operationState) {
        if (operationState == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(operationState));
        LIZIZ(c1142350fph, operationState);
    }
}
