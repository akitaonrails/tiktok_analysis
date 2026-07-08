package com.bytedance.android.livesdk.model.message;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_OperationInfo_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon.OperationInfo> {
    public static int LIZIZ(PublicAreaMessageCommon.OperationInfo operationInfo) {
        return _PublicAreaMessageCommon_OperationState_ProtoEncoder.LJ(1, operationInfo.initialState) + _PublicAreaMessageCommon_OperationState_ProtoEncoder.LJ(2, operationInfo.successState) + _PublicAreaMessageCommon_OperationState_ProtoEncoder.LJ(3, operationInfo.failureState);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon.OperationInfo operationInfo) {
        PublicAreaMessageCommon.OperationInfo operationInfo2 = operationInfo;
        _PublicAreaMessageCommon_OperationState_ProtoEncoder.LIZJ(c1142350fph, 1, operationInfo2.initialState);
        _PublicAreaMessageCommon_OperationState_ProtoEncoder.LIZJ(c1142350fph, 2, operationInfo2.successState);
        _PublicAreaMessageCommon_OperationState_ProtoEncoder.LIZJ(c1142350fph, 3, operationInfo2.failureState);
    }
}
