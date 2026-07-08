package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore.RTCExtraInfo;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._DSLConfig_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._MicPositionData_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._RTCExtraInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._ContentPosition_ProtoDecoder;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;
import webcast.data.cohost_biz.BizRechargeResponse;
import webcast.data.cohost_biz._BizRechargeResponse_ProtoDecoder;
import webcast.data.cohost_biz._BizRechargeResponse_ResponseData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _RechargeResp_ProtoDecoder implements C0IMD<RechargeResp> {
    @Override // X.C0IMD
    public final void LIZ(RechargeResp rechargeResp) {
        BizRechargeResponse.ResponseData responseData;
        RechargeResp rechargeResp2 = rechargeResp;
        RTCExtraInfo rTCExtraInfo = rechargeResp2.myInfo;
        if (rTCExtraInfo != null) {
            _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo);
        }
        List<RTCExtraInfo> list = rechargeResp2.groupExtInfo;
        if (list == null) {
            rechargeResp2.groupExtInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RTCExtraInfo rTCExtraInfo2 : rechargeResp2.groupExtInfo) {
                if (rTCExtraInfo2 != null) {
                    _RTCExtraInfo_ProtoDecoder.LJ(rTCExtraInfo2);
                }
            }
        }
        GroupChannelAllUser groupChannelAllUser = rechargeResp2.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        LinkMicCommonResp linkMicCommonResp = rechargeResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        List<ContentPosition> list2 = rechargeResp2.contentPos;
        if (list2 == null) {
            rechargeResp2.contentPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<ContentPosition> it2 = rechargeResp2.contentPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<PosIdentity> list3 = rechargeResp2.uiPos;
        if (list3 == null) {
            rechargeResp2.uiPos = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<PosIdentity> it3 = rechargeResp2.uiPos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        LayoutState layoutState = rechargeResp2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list4 = rechargeResp2.spotList;
        if (list4 == null) {
            rechargeResp2.spotList = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (SpotInfo spotInfo : rechargeResp2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        AllListUser allListUser = rechargeResp2.list;
        if (allListUser != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
        BizRechargeResponse bizRechargeResponse = rechargeResp2.cohostRespExtra;
        if (bizRechargeResponse != null && (responseData = bizRechargeResponse.data) != null) {
            _BizRechargeResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final RechargeResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RechargeResp rechargeResp = new RechargeResp();
        rechargeResp.groupExtInfo = new ArrayList();
        rechargeResp.spotList = new ArrayList();
        rechargeResp.uiPos = new ArrayList();
        rechargeResp.contentPos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            rechargeResp.myInfo = _RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            rechargeResp.myLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            rechargeResp.targetLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            rechargeResp.targetPos = _MicPositionData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            rechargeResp.groupExtInfo.add(_RTCExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 6:
                            rechargeResp.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            rechargeResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            rechargeResp.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            rechargeResp.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            rechargeResp.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            rechargeResp.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            rechargeResp.dsl = _DSLConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            rechargeResp.list = _AllListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    rechargeResp.cohostRespExtra = _BizRechargeResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rechargeResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RechargeResp rechargeResp, List list) {
    }
}
