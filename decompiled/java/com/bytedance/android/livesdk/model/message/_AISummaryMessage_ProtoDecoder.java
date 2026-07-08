package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AISummaryMessage_ProtoDecoder implements C0IMD<AISummaryMessage> {
    @Override // X.C0IMD
    public final void LIZ(AISummaryMessage aISummaryMessage) {
        AISummaryMessage aISummaryMessage2 = aISummaryMessage;
        CommonMessageData commonMessageData = aISummaryMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = aISummaryMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = aISummaryMessage2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        List<MultiLangContent> list = aISummaryMessage2.multiLangSummaryList;
        if (list == null) {
            aISummaryMessage2.multiLangSummaryList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<MultiLangContent> it2 = aISummaryMessage2.multiLangSummaryList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PublicAreaMessageCommon publicAreaMessageCommon = aISummaryMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final AISummaryMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AISummaryMessage aISummaryMessage = new AISummaryMessage();
        aISummaryMessage.multiLangSummaryList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        aISummaryMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        aISummaryMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        aISummaryMessage.showAtFirst = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        aISummaryMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        aISummaryMessage.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        aISummaryMessage.multiLangSummaryList.add(_MultiLangContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        aISummaryMessage.clickTitleSchemeLink = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        aISummaryMessage.clickContentSchemeLink = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        aISummaryMessage.longPressAreaSchemeLink = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        aISummaryMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        aISummaryMessage.requireStay = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        aISummaryMessage.stayDurationMs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aISummaryMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AISummaryMessage aISummaryMessage, List list) {
    }
}
