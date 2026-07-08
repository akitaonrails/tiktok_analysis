package webcast.data.multilive_biz;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play._ActivePlaybook_ProtoDecoder;
import webcast.data.multi_guest_play._CountdownContent_ProtoDecoder;
import webcast.data.multi_guest_play._CountdownForAllContent_ProtoDecoder;
import webcast.data.multi_guest_play._GuestShowdownContent_ProtoDecoder;
import webcast.data.multi_guest_play._NoticeboardContent_ProtoDecoder;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;
import webcast.data.multi_guest_play._TextHeaderPlayContent_ProtoDecoder;
import webcast.data.multi_guest_play._TopGuestMetaContent_ProtoDecoder;
import webcast.data.multilive_biz.BizResumeResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _BizResumeResponse_ResponseData_ProtoDecoder implements C0IMD<BizResumeResponse.ResponseData> {
    public static BizResumeResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizResumeResponse.ResponseData responseData = new BizResumeResponse.ResponseData();
        responseData.countdownContents = new ArrayList();
        responseData.noticeboardContents = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        responseData.isShowing = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        responseData.showContent = _ShowContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        responseData.countdownContents.add(_CountdownContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        responseData.countdownForAllContent = _CountdownForAllContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        responseData.noticeboardContents.add(_NoticeboardContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        responseData.activePlaybook = _ActivePlaybook_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        responseData.guestShowdownContent = _GuestShowdownContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        responseData.quickCallAutoApprove = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        responseData.quickCallAutoApproveStartMs = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        responseData.topGuestMeta = _TopGuestMetaContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        responseData.textHeaderContent = _TextHeaderPlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(BizResumeResponse.ResponseData responseData) {
        Playbook playbook;
        ShowContent showContent = responseData.showContent;
        if (showContent != null) {
            _ShowContent_ProtoDecoder.LJ(showContent);
        }
        List<CountdownContent> list = responseData.countdownContents;
        if (list == null) {
            responseData.countdownContents = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<CountdownContent> it2 = responseData.countdownContents.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        CountdownForAllContent countdownForAllContent = responseData.countdownForAllContent;
        if (countdownForAllContent != null) {
            _CountdownForAllContent_ProtoDecoder.LJ(countdownForAllContent);
        }
        List<NoticeboardContent> list2 = responseData.noticeboardContents;
        if (list2 == null) {
            responseData.noticeboardContents = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<NoticeboardContent> it3 = responseData.noticeboardContents.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        ActivePlaybook activePlaybook = responseData.activePlaybook;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null) {
            _Playbook_ProtoDecoder.LJ(playbook);
        }
        GuestShowdownContent guestShowdownContent = responseData.guestShowdownContent;
        if (guestShowdownContent != null) {
            _GuestShowdownContent_ProtoDecoder.LJ(guestShowdownContent);
        }
        TextHeaderPlayContent textHeaderPlayContent = responseData.textHeaderContent;
        if (textHeaderPlayContent != null) {
            _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizResumeResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final BizResumeResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizResumeResponse.ResponseData responseData, List list) {
    }
}
