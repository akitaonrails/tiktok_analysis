package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _StreamUrlExtra_ProtoDecoder implements C0IMD<StreamUrlExtra> {
    public static StreamUrlExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StreamUrlExtra streamUrlExtra = new StreamUrlExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        streamUrlExtra.height = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        streamUrlExtra.width = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        streamUrlExtra.fps = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        streamUrlExtra.maxBitrate = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        streamUrlExtra.minBitrate = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        streamUrlExtra.defaultBitrate = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        streamUrlExtra.bitrateAdaptStrategy = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        streamUrlExtra.anchorInteractProfile = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        streamUrlExtra.audienceInteractProfile = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        streamUrlExtra.hardwareEncode = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 15:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        streamUrlExtra.profile = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        streamUrlExtra.srConfig = _StreamUrlExtra_SrConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        streamUrlExtra.gopSec = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        streamUrlExtra.enableBFrame = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        streamUrlExtra.isRoi = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        streamUrlExtra.isSwRoi = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        streamUrlExtra.enableByteVC1 = C1516700pZU.LIZ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamUrlExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StreamUrlExtra streamUrlExtra) {
    }

    @Override // X.C0IMD
    public final StreamUrlExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamUrlExtra streamUrlExtra, List list) {
    }
}
