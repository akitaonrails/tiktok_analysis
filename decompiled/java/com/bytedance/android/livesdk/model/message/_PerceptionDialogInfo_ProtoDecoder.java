package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.PerceptionFeedbackOption;
import com.bytedance.android.livesdk.message.proto._PerceptionFeedbackOption_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _PerceptionDialogInfo_ProtoDecoder implements C0IMD<PerceptionDialogInfo> {
    public static PerceptionDialogInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PerceptionDialogInfo perceptionDialogInfo = new PerceptionDialogInfo();
        perceptionDialogInfo.feedbackOptions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        perceptionDialogInfo.iconType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        perceptionDialogInfo.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        perceptionDialogInfo.subTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        perceptionDialogInfo.adviceActionText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        perceptionDialogInfo.defaultActionText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        perceptionDialogInfo.violationDetailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        perceptionDialogInfo.scene = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        perceptionDialogInfo.targetUserId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        perceptionDialogInfo.targetRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        perceptionDialogInfo.countDownTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        perceptionDialogInfo.showFeedback = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        perceptionDialogInfo.feedbackOptions.add(_PerceptionFeedbackOption_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        perceptionDialogInfo.policyTip = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        perceptionDialogInfo.appealPopup = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        perceptionDialogInfo.closeActionText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return perceptionDialogInfo;
            }
        }
    }

    public static void LJ(PerceptionDialogInfo perceptionDialogInfo) {
        Text text = perceptionDialogInfo.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = perceptionDialogInfo.subTitle;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = perceptionDialogInfo.adviceActionText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        Text text4 = perceptionDialogInfo.defaultActionText;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
        List<PerceptionFeedbackOption> list = perceptionDialogInfo.feedbackOptions;
        if (list == null) {
            perceptionDialogInfo.feedbackOptions = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PerceptionFeedbackOption> it2 = perceptionDialogInfo.feedbackOptions.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Text text5 = perceptionDialogInfo.closeActionText;
        if (text5 != null) {
            _Text_ProtoDecoder.LJ(text5);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PerceptionDialogInfo perceptionDialogInfo) {
        LJ(perceptionDialogInfo);
    }

    @Override // X.C0IMD
    public final PerceptionDialogInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PerceptionDialogInfo perceptionDialogInfo, List list) {
    }
}
