package tikcast.api.anchor;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _HighValueLiveFragment_ProtoDecoder implements C0IMD<HighValueLiveFragment> {
    public static HighValueLiveFragment LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighValueLiveFragment highValueLiveFragment = new HighValueLiveFragment();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        highValueLiveFragment.fragmentIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        highValueLiveFragment.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        highValueLiveFragment.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        highValueLiveFragment.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        highValueLiveFragment.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        highValueLiveFragment.ownerUserIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        highValueLiveFragment.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        highValueLiveFragment.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        highValueLiveFragment.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        highValueLiveFragment.extendUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        highValueLiveFragment.downloadUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        highValueLiveFragment.isPosted = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        highValueLiveFragment.fragmentTypeNew = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        highValueLiveFragment.subType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        highValueLiveFragment.roomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        highValueLiveFragment.gifCoverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        highValueLiveFragment.isGifCover = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        highValueLiveFragment.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highValueLiveFragment;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighValueLiveFragment highValueLiveFragment) {
    }

    @Override // X.C0IMD
    public final HighValueLiveFragment LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighValueLiveFragment highValueLiveFragment, List list) {
    }
}
