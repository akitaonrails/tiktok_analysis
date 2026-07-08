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
import webcast.data.cohost_biz.BizMigrateGroupResponse;
import webcast.data.cohost_biz._BizMigrateGroupResponse_ProtoDecoder;
import webcast.data.cohost_biz._BizMigrateGroupResponse_ResponseData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MigrateGroupResp_ProtoDecoder implements C0IMD<MigrateGroupResp> {
    @Override // X.C0IMD
    public final void LIZ(MigrateGroupResp migrateGroupResp) {
        BizMigrateGroupResponse.ResponseData responseData;
        MigrateGroupResp migrateGroupResp2 = migrateGroupResp;
        LinkMicCommonResp linkMicCommonResp = migrateGroupResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        List<RTCExtraInfo> list = migrateGroupResp2.groupRtcInfo;
        if (list == null) {
            migrateGroupResp2.groupRtcInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo : migrateGroupResp2.groupRtcInfo) {
                if (rTCExtraInfo != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
                }
            }
        }
        GroupChannelAllUser groupChannelAllUser = migrateGroupResp2.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        LayoutData layoutData = migrateGroupResp2.crossRoomLayout;
        if (layoutData != null) {
            _LayoutData_ProtoDecoder.LJ(layoutData);
        }
        BizMigrateGroupResponse bizMigrateGroupResponse = migrateGroupResp2.cohostRespExtra;
        if (bizMigrateGroupResponse != null && (responseData = bizMigrateGroupResponse.data) != null) {
            _BizMigrateGroupResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final MigrateGroupResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MigrateGroupResp migrateGroupResp = new MigrateGroupResp();
        migrateGroupResp.groupRtcInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 101) {
                                if (iLJI != 9527) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    migrateGroupResp.cohostRespExtra = _BizMigrateGroupResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                migrateGroupResp.crossRoomLayout = _LayoutData_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            migrateGroupResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        migrateGroupResp.groupRtcInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    migrateGroupResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return migrateGroupResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MigrateGroupResp migrateGroupResp, List list) {
    }
}
