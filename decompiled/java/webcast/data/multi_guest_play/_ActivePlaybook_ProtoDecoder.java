package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivePlaybook_ProtoDecoder implements C0IMD<ActivePlaybook> {
    public static ActivePlaybook LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActivePlaybook activePlaybook = new ActivePlaybook();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        activePlaybook.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        activePlaybook.playId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        activePlaybook.playStatus = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        activePlaybook.playbook = _Playbook_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        activePlaybook.existsCustomContent = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        activePlaybook.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        activePlaybook.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        activePlaybook.playbookGroup = _PlaybookGroup_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        activePlaybook.operatorId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        activePlaybook.version = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        activePlaybook.currentStateId = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activePlaybook;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActivePlaybook activePlaybook) {
        Playbook playbook = activePlaybook.playbook;
        if (playbook != null) {
            _Playbook_ProtoDecoder.LJ(playbook);
        }
    }

    @Override // X.C0IMD
    public final ActivePlaybook LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivePlaybook activePlaybook, List list) {
    }
}
