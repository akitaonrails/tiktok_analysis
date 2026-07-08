package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizReplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
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
public final class _ReplyResponse_ProtoDecoder implements C0IMD<ReplyResponse> {
    @Override // X.C0IMD
    public final void LIZ(ReplyResponse replyResponse) {
        BizReplyResponseData bizReplyResponseData;
        PerceptionMessage perceptionMessage;
        ReplyResponse replyResponse2 = replyResponse;
        LinkMicCommonResp linkMicCommonResp = replyResponse2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = replyResponse2.rtcInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        if (replyResponse2.linkedUserUiPositions == null) {
            replyResponse2.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = replyResponse2.uiPos;
        if (list == null) {
            replyResponse2.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = replyResponse2.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = replyResponse2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = replyResponse2.spotList;
        if (list2 == null) {
            replyResponse2.spotList = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (SpotInfo spotInfo : replyResponse2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        BizReplyResponse bizReplyResponse = replyResponse2.multiGuestRespExtra;
        if (bizReplyResponse != null && (bizReplyResponseData = bizReplyResponse.responseData) != null && (perceptionMessage = bizReplyResponseData.hostPerceptionInfo) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final ReplyResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ReplyResponse replyResponse = new ReplyResponse();
        replyResponse.linkedUserUiPositions = new ArrayList();
        replyResponse.uiPos = new ArrayList();
        replyResponse.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            replyResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            replyResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            replyResponse.inviteeLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            replyResponse.position = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            replyResponse.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                            break;
                        case 6:
                            replyResponse.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 7:
                            replyResponse.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            replyResponse.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    replyResponse.multiGuestRespExtra = _BizReplyResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return replyResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReplyResponse replyResponse, List list) {
    }
}
