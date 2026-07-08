package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import webcast.data.cohost_biz.BizJoinGroupResponse;
import webcast.data.cohost_biz._BizJoinGroupResponse_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupResp_ProtoDecoder implements C0IMD<JoinGroupResp> {
    @Override // X.C0IMD
    public final void LIZ(JoinGroupResp joinGroupResp) {
        BizJoinGroupResponse.ResponseData responseData;
        PerceptionMessage perceptionMessage;
        JoinGroupResp joinGroupResp2 = joinGroupResp;
        LinkMicCommonResp linkMicCommonResp = joinGroupResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        GroupChannelAllUser groupChannelAllUser = joinGroupResp2.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        if (joinGroupResp2.linkedUserUiPositions == null) {
            joinGroupResp2.linkedUserUiPositions = new ArrayList();
        }
        List<RTCExtraInfo> list = joinGroupResp2.groupRtcInfo;
        if (list == null) {
            joinGroupResp2.groupRtcInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo : joinGroupResp2.groupRtcInfo) {
                if (rTCExtraInfo != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
                }
            }
        }
        BizJoinGroupResponse bizJoinGroupResponse = joinGroupResp2.cohostRespExtra;
        if (bizJoinGroupResponse != null && (responseData = bizJoinGroupResponse.data) != null && (perceptionMessage = responseData.perceptionMessage) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final JoinGroupResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupResp joinGroupResp = new JoinGroupResp();
        joinGroupResp.groupRtcInfo = new ArrayList();
        joinGroupResp.linkedUserUiPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 9527) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    joinGroupResp.cohostRespExtra = _BizJoinGroupResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                joinGroupResp.groupRtcInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            joinGroupResp.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        joinGroupResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupResp joinGroupResp, List list) {
    }
}
