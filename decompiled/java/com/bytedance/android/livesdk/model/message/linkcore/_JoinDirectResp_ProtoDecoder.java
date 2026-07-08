package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3._BizJoinDirectResponse_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinDirectResp_ProtoDecoder implements C0IMD<JoinDirectResp> {
    @Override // X.C0IMD
    public final void LIZ(JoinDirectResp joinDirectResp) {
        JoinDirectResp joinDirectResp2 = joinDirectResp;
        LinkMicCommonResp linkMicCommonResp = joinDirectResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        RTCExtraInfo rTCExtraInfo = joinDirectResp2.rtcInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        AllListUser allListUser = joinDirectResp2.allUsers;
        if (allListUser != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
        LayoutState layoutState = joinDirectResp2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list = joinDirectResp2.spotList;
        if (list == null) {
            joinDirectResp2.spotList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : joinDirectResp2.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final JoinDirectResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        JoinDirectResp joinDirectResp = new JoinDirectResp();
        joinDirectResp.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            joinDirectResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            joinDirectResp.rtcInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            joinDirectResp.selfLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            joinDirectResp.position = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            joinDirectResp.allUsers = _AllListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            joinDirectResp.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            joinDirectResp.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    joinDirectResp.multiGuestRespExtra = _BizJoinDirectResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinDirectResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinDirectResp joinDirectResp, List list) {
    }
}
