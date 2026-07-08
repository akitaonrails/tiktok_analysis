package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizApplyResponse_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;
import tikcast.linkmic.common._UserLinkState_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ApplyRequestResponse_ProtoDecoder implements C0IMD<ApplyRequestResponse> {
    @Override // X.C0IMD
    public final void LIZ(ApplyRequestResponse applyRequestResponse) {
        BizApplyResponseData bizApplyResponseData;
        ApplyRequestResponse applyRequestResponse2 = applyRequestResponse;
        LinkMicCommonResp linkMicCommonResp = applyRequestResponse2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = applyRequestResponse2.rtcInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        LayoutState layoutState = applyRequestResponse2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list = applyRequestResponse2.spotList;
        if (list == null) {
            applyRequestResponse2.spotList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SpotInfo spotInfo : applyRequestResponse2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        BizApplyResponse bizApplyResponse = applyRequestResponse2.multiGuestRespExtra;
        if (bizApplyResponse != null && (bizApplyResponseData = bizApplyResponse.responseData) != null) {
            PerceptionMessage perceptionMessage = bizApplyResponseData.perceptionInfo;
            if (perceptionMessage != null) {
                _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
            }
            PerceptionMessage perceptionMessage2 = bizApplyResponseData.hostPerceptionInfo;
            if (perceptionMessage2 != null) {
                _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage2);
            }
        }
    }

    @Override // X.C0IMD
    public final ApplyRequestResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ApplyRequestResponse applyRequestResponse = new ApplyRequestResponse();
        applyRequestResponse.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            applyRequestResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            applyRequestResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            applyRequestResponse.applicantLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            applyRequestResponse.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            applyRequestResponse.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 6:
                            applyRequestResponse.preLinkState = _UserLinkState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            applyRequestResponse.postLinkState = _UserLinkState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            applyRequestResponse.ownerLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    applyRequestResponse.multiGuestRespExtra = _BizApplyResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return applyRequestResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyRequestResponse applyRequestResponse, List list) {
    }
}
