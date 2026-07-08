package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponseData;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelResponseData_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizCreateChannelResponse_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateChannelResponse_ProtoDecoder implements C0IMD<CreateChannelResponse> {
    @Override // X.C0IMD
    public final void LIZ(CreateChannelResponse createChannelResponse) {
        BizCreateChannelResponseData bizCreateChannelResponseData;
        CreateChannelResponse createChannelResponse2 = createChannelResponse;
        LinkMicCommonResp linkMicCommonResp = createChannelResponse2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = createChannelResponse2.rtcInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        LayoutState layoutState = createChannelResponse2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list = createChannelResponse2.spotList;
        if (list == null) {
            createChannelResponse2.spotList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SpotInfo spotInfo : createChannelResponse2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        BizCreateChannelResponse bizCreateChannelResponse = createChannelResponse2.multiGuestRespExtra;
        if (bizCreateChannelResponse != null && (bizCreateChannelResponseData = bizCreateChannelResponse.responseData) != null) {
            _BizCreateChannelResponseData_ProtoDecoder.LJ(bizCreateChannelResponseData);
        }
    }

    @Override // X.C0IMD
    public final CreateChannelResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CreateChannelResponse createChannelResponse = new CreateChannelResponse();
        createChannelResponse.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            createChannelResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            createChannelResponse.channelId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            createChannelResponse.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            createChannelResponse.selfLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            createChannelResponse.isResume = Integer.valueOf(c1516680pZS.LJIIJ());
                            break;
                        case 6:
                            createChannelResponse.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            createChannelResponse.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    createChannelResponse.multiGuestRespExtra = _BizCreateChannelResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return createChannelResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateChannelResponse createChannelResponse, List list) {
    }
}
