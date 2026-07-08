package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _PerceptionSheetInfo_ProtoDecoder implements C0IMD<PerceptionSheetInfo> {
    public static PerceptionSheetInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PerceptionSheetInfo perceptionSheetInfo = new PerceptionSheetInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        perceptionSheetInfo.iconType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        perceptionSheetInfo.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        perceptionSheetInfo.subTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        perceptionSheetInfo.reasonTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        perceptionSheetInfo.reasonInfo = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        perceptionSheetInfo.notAllowedTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        perceptionSheetInfo.notAllowedText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        perceptionSheetInfo.defaultActionText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        perceptionSheetInfo.scene = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        perceptionSheetInfo.targetUserId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        perceptionSheetInfo.targetRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        perceptionSheetInfo.countDownTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return perceptionSheetInfo;
            }
        }
    }

    public static void LJ(PerceptionSheetInfo perceptionSheetInfo) {
        Text text = perceptionSheetInfo.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = perceptionSheetInfo.subTitle;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = perceptionSheetInfo.reasonTitle;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        Text text4 = perceptionSheetInfo.reasonInfo;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
        Text text5 = perceptionSheetInfo.notAllowedTitle;
        if (text5 != null) {
            _Text_ProtoDecoder.LJ(text5);
        }
        Text text6 = perceptionSheetInfo.notAllowedText;
        if (text6 != null) {
            _Text_ProtoDecoder.LJ(text6);
        }
        Text text7 = perceptionSheetInfo.defaultActionText;
        if (text7 != null) {
            _Text_ProtoDecoder.LJ(text7);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PerceptionSheetInfo perceptionSheetInfo) {
        LJ(perceptionSheetInfo);
    }

    @Override // X.C0IMD
    public final PerceptionSheetInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PerceptionSheetInfo perceptionSheetInfo, List list) {
    }
}
