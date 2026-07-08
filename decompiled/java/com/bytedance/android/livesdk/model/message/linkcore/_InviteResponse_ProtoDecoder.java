package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.controller.InviteResultInfo;
import tikcast.linkmic.controller._InviteResultInfo_ProtoDecoder;
import webcast.data.multilive_biz.BizInviteResponse;
import webcast.data.multilive_biz._BizInviteResponse_ProtoDecoder;
import webcast.data.multilive_biz._BizInviteResponse_ResponseData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _InviteResponse_ProtoDecoder implements C0IMD<InviteResponse> {
    @Override // X.C0IMD
    public final void LIZ(InviteResponse inviteResponse) {
        BizInviteResponse.ResponseData responseData;
        InviteResponse inviteResponse2 = inviteResponse;
        LinkMicCommonResp linkMicCommonResp = inviteResponse2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = inviteResponse2.rtcInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        List<InviteResultInfo> list = inviteResponse2.inviteResultList;
        if (list == null) {
            inviteResponse2.inviteResultList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<InviteResultInfo> it2 = inviteResponse2.inviteResultList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        BizInviteResponse bizInviteResponse = inviteResponse2.multiGuestRespExtra;
        if (bizInviteResponse != null && (responseData = bizInviteResponse.data) != null) {
            _BizInviteResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final InviteResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        InviteResponse inviteResponse = new InviteResponse();
        inviteResponse.inviteResultList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            inviteResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            inviteResponse.channelId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            inviteResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            inviteResponse.inviterLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            inviteResponse.inviteeLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            inviteResponse.inviteSeqId = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            inviteResponse.inviteResultList.add(_InviteResultInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    inviteResponse.multiGuestRespExtra = _BizInviteResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return inviteResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InviteResponse inviteResponse, List list) {
    }
}
