package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_ProtoDecoder implements C0IMD<PublicAreaMessageCommon> {
    public static PublicAreaMessageCommon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon publicAreaMessageCommon = new PublicAreaMessageCommon();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        publicAreaMessageCommon.scrollGapCount = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        publicAreaMessageCommon.anchorScrollGapCount = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        publicAreaMessageCommon.releaseToScrollArea = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        publicAreaMessageCommon.anchorReleaseToScrollArea = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        publicAreaMessageCommon.isAnchorMarked = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        publicAreaMessageCommon.creatorSuccessInfo = _PublicAreaMessageCommon_CreatorSuccessInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        publicAreaMessageCommon.portraitInfo = _PublicAreaMessageCommon_PortraitInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        publicAreaMessageCommon.userInteractionInfo = _PublicAreaMessageCommon_UserInteractionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        publicAreaMessageCommon.adminFoldType = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        publicAreaMessageCommon.displayInfo = _PublicAreaMessageCommon_MessageDisplayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        publicAreaMessageCommon.hideAboveScrollArea = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        publicAreaMessageCommon.operationInfo = _PublicAreaMessageCommon_OperationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        publicAreaMessageCommon.dynamicDisplayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return publicAreaMessageCommon;
            }
        }
    }

    public static void LJ(PublicAreaMessageCommon publicAreaMessageCommon) {
        PublicAreaMessageCommon.CreatorSuccessInfo creatorSuccessInfo = publicAreaMessageCommon.creatorSuccessInfo;
        if (creatorSuccessInfo != null) {
            _PublicAreaMessageCommon_CreatorSuccessInfo_ProtoDecoder.LJ(creatorSuccessInfo);
        }
        PublicAreaMessageCommon.PortraitInfo portraitInfo = publicAreaMessageCommon.portraitInfo;
        if (portraitInfo != null) {
            _PublicAreaMessageCommon_PortraitInfo_ProtoDecoder.LJ(portraitInfo);
        }
        PublicAreaMessageCommon.OperationInfo operationInfo = publicAreaMessageCommon.operationInfo;
        if (operationInfo != null) {
            PublicAreaMessageCommon.OperationState operationState = operationInfo.initialState;
            if (operationState != null) {
                _PublicAreaMessageCommon_OperationState_ProtoDecoder.LJ(operationState);
            }
            PublicAreaMessageCommon.OperationState operationState2 = operationInfo.successState;
            if (operationState2 != null) {
                _PublicAreaMessageCommon_OperationState_ProtoDecoder.LJ(operationState2);
            }
            PublicAreaMessageCommon.OperationState operationState3 = operationInfo.failureState;
            if (operationState3 != null) {
                _PublicAreaMessageCommon_OperationState_ProtoDecoder.LJ(operationState3);
            }
        }
        Text text = publicAreaMessageCommon.dynamicDisplayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon publicAreaMessageCommon) {
        LJ(publicAreaMessageCommon);
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon publicAreaMessageCommon, List list) {
    }
}
