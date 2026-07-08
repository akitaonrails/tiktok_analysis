package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._LayoutData_ProtoDecoder;
import webcast.data.cohost_biz._BizPermitJoinGroupResponse_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitJoinGroupResp_ProtoDecoder implements C0IMD<PermitJoinGroupResp> {
    @Override // X.C0IMD
    public final void LIZ(PermitJoinGroupResp permitJoinGroupResp) {
        PermitJoinGroupResp permitJoinGroupResp2 = permitJoinGroupResp;
        LinkMicCommonResp linkMicCommonResp = permitJoinGroupResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        List<RTCExtraInfo> list = permitJoinGroupResp2.groupRtcInfo;
        if (list == null) {
            permitJoinGroupResp2.groupRtcInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo : permitJoinGroupResp2.groupRtcInfo) {
                if (rTCExtraInfo != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
                }
            }
        }
        GroupChannelAllUser groupChannelAllUser = permitJoinGroupResp2.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        if (permitJoinGroupResp2.linkedUserUiPositions == null) {
            permitJoinGroupResp2.linkedUserUiPositions = new ArrayList();
        }
        LayoutData layoutData = permitJoinGroupResp2.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
    }

    @Override // X.C0IMD
    public final PermitJoinGroupResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PermitJoinGroupResp permitJoinGroupResp = new PermitJoinGroupResp();
        permitJoinGroupResp.groupRtcInfo = new ArrayList();
        permitJoinGroupResp.linkedUserUiPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 101) {
                                    if (iLJI != 9527) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        permitJoinGroupResp.cohostRespExtra = _BizPermitJoinGroupResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    permitJoinGroupResp.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                permitJoinGroupResp.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            permitJoinGroupResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        permitJoinGroupResp.groupRtcInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    permitJoinGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitJoinGroupResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitJoinGroupResp permitJoinGroupResp, List list) {
    }
}
