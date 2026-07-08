package webcast.api.room;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _LiveScenario_ProtoDecoder implements C0IMD<LiveScenario> {
    public static LiveScenario LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveScenario liveScenario = new LiveScenario();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveScenario.enableLiveVideo = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        liveScenario.enableLiveThirdParty = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        liveScenario.enableLiveScreenshot = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        liveScenario.enableSocialLive = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        liveScenario.enableLiveStudio = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        liveScenario.enablePicoShow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        liveScenario.enablePicoGame = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        liveScenario.enablePicoVirtual = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveScenario.enableLiveVoice = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveScenario.enableStreamelements = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveScenario.enableRestream = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        liveScenario.enableLiveConsole = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveScenario;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveScenario LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveScenario liveScenario) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveScenario liveScenario, List list) {
    }
}
