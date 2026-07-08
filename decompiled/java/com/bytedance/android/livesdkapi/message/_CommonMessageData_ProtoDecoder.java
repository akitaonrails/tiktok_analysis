package com.bytedance.android.livesdkapi.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _CommonMessageData_ProtoDecoder implements C0IMD<CommonMessageData> {
    public static CommonMessageData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.filterTags = new ArrayList();
        commonMessageData.toDids = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commonMessageData.method = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        commonMessageData.messageId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        commonMessageData.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        commonMessageData.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        commonMessageData.monitor = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        commonMessageData.showMsg = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        commonMessageData.describe = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        commonMessageData.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        commonMessageData.foldType = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        commonMessageData.anchorFoldType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        commonMessageData.priorityScore = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        commonMessageData.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        commonMessageData.msgProcessFilterK = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        commonMessageData.msgProcessFilterV = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        commonMessageData.fromIdc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        commonMessageData.toIdc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        commonMessageData.filterTags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        commonMessageData.messageSEI = _LiveMessageSEI_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        commonMessageData.dependRootID = _LiveMessageID_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        commonMessageData.dependID = _LiveMessageID_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        commonMessageData.anchorPriorityScore = c1516680pZS.LJIIJJI();
                        break;
                    case 22:
                        commonMessageData.roomMessageHeatLevel = c1516680pZS.LJIIJJI();
                        break;
                    case 23:
                        commonMessageData.foldTypeForWeb = c1516680pZS.LJIIJJI();
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        commonMessageData.anchorFoldTypeForWeb = c1516680pZS.LJIIJJI();
                        break;
                    case 25:
                        commonMessageData.clientSendTime = c1516680pZS.LJIIJJI();
                        break;
                    case 26:
                        commonMessageData.dispatchStrategy = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commonMessageData;
            }
        }
    }

    public static void LJ(CommonMessageData commonMessageData) {
        Text text = commonMessageData.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (commonMessageData.filterTags == null) {
            commonMessageData.filterTags = new ArrayList();
        }
        LiveMessageSEI liveMessageSEI = commonMessageData.messageSEI;
    }

    @Override // X.C0IMD
    public final void LIZ(CommonMessageData commonMessageData) {
        LJ(commonMessageData);
    }

    @Override // X.C0IMD
    public final CommonMessageData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommonMessageData commonMessageData, List list) {
    }
}
