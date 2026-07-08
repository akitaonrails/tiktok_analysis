package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
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
import webcast.data.multilive_biz.BizPermitResponse;
import webcast.data.multilive_biz._BizPermitResponse_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitResponse_ProtoDecoder implements C0IMD<PermitResponse> {
    @Override // X.C0IMD
    public final void LIZ(PermitResponse permitResponse) {
        BizPermitResponse.ResponseData responseData;
        PerceptionMessage perceptionMessage;
        PermitResponse permitResponse2 = permitResponse;
        LinkMicCommonResp linkMicCommonResp = permitResponse2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = permitResponse2.rtcInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        if (permitResponse2.linkedUserUiPositions == null) {
            permitResponse2.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = permitResponse2.uiPos;
        if (list == null) {
            permitResponse2.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = permitResponse2.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = permitResponse2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = permitResponse2.spotList;
        if (list2 == null) {
            permitResponse2.spotList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (SpotInfo spotInfo : permitResponse2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        BizPermitResponse bizPermitResponse = permitResponse2.multiGuestRespExtra;
        if (bizPermitResponse != null && (responseData = bizPermitResponse.data) != null && (perceptionMessage = responseData.hostPerceptionInfo) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final PermitResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PermitResponse permitResponse = new PermitResponse();
        permitResponse.linkedUserUiPositions = new ArrayList();
        permitResponse.uiPos = new ArrayList();
        permitResponse.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            permitResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            permitResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            permitResponse.linkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            permitResponse.position = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            permitResponse.applier = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            permitResponse.applierLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            permitResponse.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                            break;
                        case 8:
                            permitResponse.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            permitResponse.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            permitResponse.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    permitResponse.multiGuestRespExtra = _BizPermitResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitResponse permitResponse, List list) {
    }
}
