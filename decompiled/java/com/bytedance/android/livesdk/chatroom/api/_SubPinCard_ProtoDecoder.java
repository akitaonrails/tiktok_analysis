package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubPinCard_ProtoDecoder implements C0IMD<SubPinCard> {
    public static SubPinCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubPinCard subPinCard = new SubPinCard();
        subPinCard.icons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subPinCard.timeToLive = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        subPinCard.title = _SubPinCard_Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        subPinCard.desc = _SubPinCard_Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        subPinCard.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        subPinCard.type = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        subPinCard.id = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        subPinCard.templateId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        subPinCard.goalPinCard = _SubGoalPinCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        subPinCard.actionSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        subPinCard.lastPinTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        subPinCard.extraInfo = _SubPinCard_SubPinCardExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        subPinCard.highlightTextNum = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        subPinCard.icons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        subPinCard.pinSource = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subPinCard;
            }
        }
    }

    public static void LJ(SubPinCard subPinCard) {
        SOVPinCardInfo sOVPinCardInfo;
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;
        ImageModel imageModel = subPinCard.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        SubPinCard.SubPinCardExtra subPinCardExtra = subPinCard.extraInfo;
        if (subPinCardExtra != null && (sOVPinCardInfo = subPinCardExtra.sovInfo) != null && (subOnlyVideosBriefInfo = sOVPinCardInfo.sovInfo) != null) {
            _SubOnlyVideosBriefInfo_ProtoDecoder.LJ(subOnlyVideosBriefInfo);
        }
        List<ImageModel> list = subPinCard.icons;
        if (list == null) {
            subPinCard.icons = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel2 : subPinCard.icons) {
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubPinCard subPinCard) {
        LJ(subPinCard);
    }

    @Override // X.C0IMD
    public final SubPinCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubPinCard subPinCard, List list) {
    }
}
