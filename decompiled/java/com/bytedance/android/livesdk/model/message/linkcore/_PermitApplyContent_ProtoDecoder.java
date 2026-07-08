package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitApplyContent_ProtoDecoder implements C0IMD<PermitApplyContent> {
    public static PermitApplyContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PermitApplyContent permitApplyContent = new PermitApplyContent();
        permitApplyContent.linkedUserUiPositions = new ArrayList();
        permitApplyContent.spotList = new ArrayList();
        permitApplyContent.uiPos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        permitApplyContent.approver = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        permitApplyContent.approverLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        permitApplyContent.positionData = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        permitApplyContent.replyStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        permitApplyContent.dsl = _DSLConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        permitApplyContent.applier = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        permitApplyContent.operator = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        permitApplyContent.applierLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        permitApplyContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        permitApplyContent.applierRtcToken = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        permitApplyContent.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        permitApplyContent.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        permitApplyContent.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        permitApplyContent.applierLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitApplyContent;
            }
        }
    }

    public static void LJ(PermitApplyContent permitApplyContent) {
        MicPositionData micPositionData = permitApplyContent.positionData;
        if (permitApplyContent.linkedUserUiPositions == null) {
            permitApplyContent.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = permitApplyContent.uiPos;
        if (list == null) {
            permitApplyContent.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = permitApplyContent.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = permitApplyContent.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = permitApplyContent.spotList;
        if (list2 == null) {
            permitApplyContent.spotList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : permitApplyContent.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PermitApplyContent permitApplyContent) {
        LJ(permitApplyContent);
    }

    @Override // X.C0IMD
    public final PermitApplyContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitApplyContent permitApplyContent, List list) {
    }
}
