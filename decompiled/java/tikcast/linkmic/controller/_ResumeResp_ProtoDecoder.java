package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._ContentPosition_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;
import webcast.data.multilive_biz.BizResumeResponse;
import webcast.data.multilive_biz._BizResumeResponse_ProtoDecoder;
import webcast.data.multilive_biz._BizResumeResponse_ResponseData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ResumeResp_ProtoDecoder implements C0IMD<ResumeResp> {
    @Override // X.C0IMD
    public final void LIZ(ResumeResp resumeResp) {
        BizResumeResponse.ResponseData responseData;
        ResumeResp resumeResp2 = resumeResp;
        LinkMicCommonResp linkMicCommonResp = resumeResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        List<LinkedUserInfo> list = resumeResp2.linkedUserInfo;
        if (list == null) {
            resumeResp2.linkedUserInfo = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LinkedUserInfo> it2 = resumeResp2.linkedUserInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        AllListUser allListUser = resumeResp2.list;
        if (allListUser != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
        if (resumeResp2.rejectEnlargeLinkmicIdList == null) {
            resumeResp2.rejectEnlargeLinkmicIdList = new ArrayList();
        }
        if (resumeResp2.linkedUserUiPositions == null) {
            resumeResp2.linkedUserUiPositions = new ArrayList();
        }
        List<ContentPosition> list2 = resumeResp2.contentPos;
        if (list2 == null) {
            resumeResp2.contentPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<ContentPosition> it3 = resumeResp2.contentPos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<PosIdentity> list3 = resumeResp2.uiPos;
        if (list3 == null) {
            resumeResp2.uiPos = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<PosIdentity> it4 = resumeResp2.uiPos.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        LayoutState layoutState = resumeResp2.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list4 = resumeResp2.spotList;
        if (list4 == null) {
            resumeResp2.spotList = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (SpotInfo spotInfo : resumeResp2.spotList) {
                if (spotInfo != null) {
                    _SpotInfo_ProtoDecoder.LJ(spotInfo);
                }
            }
        }
        BizResumeResponse bizResumeResponse = resumeResp2.multiGuestRespExtra;
        if (bizResumeResponse != null && (responseData = bizResumeResponse.data) != null) {
            _BizResumeResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final ResumeResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ResumeResp resumeResp = new ResumeResp();
        resumeResp.linkedUserInfo = new ArrayList();
        resumeResp.linkedUserUiPositions = new ArrayList();
        resumeResp.uiPos = new ArrayList();
        resumeResp.rejectEnlargeLinkmicIdList = new ArrayList();
        resumeResp.contentPos = new ArrayList();
        resumeResp.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            resumeResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            resumeResp.linkedUserInfo.add(_LinkedUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 3:
                            resumeResp.channelId = c1516680pZS.LJIIJJI();
                            break;
                        case 4:
                            resumeResp.selfLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            resumeResp.list = _AllListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            resumeResp.rejectEnlargeLinkmicIdList.add(C1516700pZU.LIZLLL(c1516680pZS));
                            break;
                        case 7:
                            resumeResp.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                            break;
                        case 8:
                            resumeResp.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            resumeResp.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            resumeResp.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            resumeResp.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    resumeResp.multiGuestRespExtra = _BizResumeResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return resumeResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ResumeResp resumeResp, List list) {
    }
}
