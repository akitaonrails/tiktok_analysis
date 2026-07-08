package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play._PlaybookGroup_ProtoDecoder;

/* JADX INFO: loaded from: classes32.dex */
public final class _PlaybookMessage_ProtoDecoder implements C0IMD<PlaybookMessage> {
    @Override // X.C0IMD
    public final void LIZ(PlaybookMessage playbookMessage) {
        PlaybookMessage playbookMessage2 = playbookMessage;
        CommonMessageData commonMessageData = playbookMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (playbookMessage2.firstLevelTagTypes == null) {
            playbookMessage2.firstLevelTagTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final PlaybookMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookMessage playbookMessage = new PlaybookMessage();
        playbookMessage.firstLevelTagTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        playbookMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        playbookMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        playbookMessage.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        playbookMessage.playStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        playbookMessage.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        playbookMessage.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        playbookMessage.playbookEndReason = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        playbookMessage.playbookStartReason = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        playbookMessage.playbookGroup = _PlaybookGroup_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        playbookMessage.needRecharge = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        playbookMessage.bizReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        playbookMessage.operatorId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        playbookMessage.version = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        playbookMessage.playbookId = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        playbookMessage.firstLevelTagTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case 16:
                        playbookMessage.currentStateId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookMessage playbookMessage, List list) {
    }
}
