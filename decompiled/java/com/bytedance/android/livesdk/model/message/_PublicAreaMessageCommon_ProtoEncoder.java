package com.bytedance.android.livesdk.model.message;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_ProtoEncoder implements InterfaceC1132110fZB<PublicAreaMessageCommon> {
    public static void LIZIZ(C1142350fph c1142350fph, PublicAreaMessageCommon publicAreaMessageCommon) {
        long j = publicAreaMessageCommon.scrollGapCount;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        long j2 = publicAreaMessageCommon.anchorScrollGapCount;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJFF(j2);
        boolean z = publicAreaMessageCommon.releaseToScrollArea;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = publicAreaMessageCommon.anchorReleaseToScrollArea;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = publicAreaMessageCommon.isAnchorMarked;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo = publicAreaMessageCommon.creatorSuccessInfo;
        if (creatorSuccessInfo != null) {
            c1142350fph.LIZLLL(6, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_CreatorSuccessInfo_ProtoEncoder.LIZJ(creatorSuccessInfo));
            _PublicAreaMessageCommon_CreatorSuccessInfo_ProtoEncoder.LIZIZ(c1142350fph, creatorSuccessInfo);
        }
        PublicAreaMessageCommon.PortraitInfo portraitInfo = publicAreaMessageCommon.portraitInfo;
        if (portraitInfo != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_PortraitInfo_ProtoEncoder.LIZJ(portraitInfo));
            _PublicAreaMessageCommon_PortraitInfo_ProtoEncoder.LIZIZ(c1142350fph, portraitInfo);
        }
        PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo = publicAreaMessageCommon.userInteractionInfo;
        if (userInteractionInfo != null) {
            c1142350fph.LIZLLL(8, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_UserInteractionInfo_ProtoEncoder.LIZJ(userInteractionInfo));
            _PublicAreaMessageCommon_UserInteractionInfo_ProtoEncoder.LIZIZ(c1142350fph, userInteractionInfo);
        }
        long j3 = publicAreaMessageCommon.adminFoldType;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j3);
        PublicAreaMessageCommon.MessageDisplayInfo messageDisplayInfo = publicAreaMessageCommon.displayInfo;
        if (messageDisplayInfo != null) {
            c1142350fph.LIZLLL(10, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_MessageDisplayInfo_ProtoEncoder.LIZJ(messageDisplayInfo));
            _PublicAreaMessageCommon_MessageDisplayInfo_ProtoEncoder.LIZIZ(c1142350fph, messageDisplayInfo);
        }
        boolean z4 = publicAreaMessageCommon.hideAboveScrollArea;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        PublicAreaMessageCommon.OperationInfo operationInfo = publicAreaMessageCommon.operationInfo;
        if (operationInfo != null) {
            c1142350fph.LIZLLL(12, 2);
            c1142350fph.LJ(_PublicAreaMessageCommon_OperationInfo_ProtoEncoder.LIZIZ(operationInfo));
            _PublicAreaMessageCommon_OperationState_ProtoEncoder.LIZJ(c1142350fph, 1, operationInfo.initialState);
            _PublicAreaMessageCommon_OperationState_ProtoEncoder.LIZJ(c1142350fph, 2, operationInfo.successState);
            _PublicAreaMessageCommon_OperationState_ProtoEncoder.LIZJ(c1142350fph, 3, operationInfo.failureState);
        }
        _Text_ProtoEncoder.LIZJ(c1142350fph, 13, publicAreaMessageCommon.dynamicDisplayText);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublicAreaMessageCommon publicAreaMessageCommon) {
        LIZIZ(c1142350fph, publicAreaMessageCommon);
    }
}
