package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.CreatorSuccessInfo.Topic> {
    public static PublicAreaMessageCommon.CreatorSuccessInfo.Topic LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic = new PublicAreaMessageCommon.CreatorSuccessInfo.Topic();
        topic.eventTrackingFields = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        topic.topicActionType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        topic.topicText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        topic.topicTips = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        topic.hasButton = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        topic.actionButton = _PublicAreaMessageCommon_CreatorSuccessInfo_Topic_ActionButton_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        topic.tagType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        topic.displayLocation = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        topic.eventTrackingFields.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        topic.bizName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        topic.disableCountFrequencyControl = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topic;
            }
        }
    }

    public static void LJ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        Text text = topic.topicText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = topic.topicTips;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton = topic.actionButton;
        if (actionButton != null) {
            Text text3 = actionButton.buttonActiveText;
            if (text3 != null) {
                _Text_ProtoDecoder.LJ(text3);
            }
            Text text4 = actionButton.buttonInactiveText;
            if (text4 != null) {
                _Text_ProtoDecoder.LJ(text4);
            }
        }
        if (topic.eventTrackingFields == null) {
            topic.eventTrackingFields = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic) {
        LJ(topic);
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.CreatorSuccessInfo.Topic LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, List list) {
    }
}
