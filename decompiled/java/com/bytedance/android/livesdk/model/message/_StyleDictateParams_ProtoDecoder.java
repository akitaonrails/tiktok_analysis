package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EntryData;
import webcast.data.TPText;
import webcast.data._EntryData_ProtoDecoder;
import webcast.data._TPText_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _StyleDictateParams_ProtoDecoder implements C0IMD<StyleDictateParams> {
    public static StyleDictateParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StyleDictateParams styleDictateParams = new StyleDictateParams();
        styleDictateParams.bubbleDecorationList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        styleDictateParams.bubbleDecorationList.add(_BubbleDecoration_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        styleDictateParams.animated = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        styleDictateParams.duration = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        styleDictateParams.onclickSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        styleDictateParams.preselectedGiftId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        styleDictateParams.preselectedMatchItemId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        styleDictateParams.tapDismissArea = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        styleDictateParams.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        styleDictateParams.maxLine = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        styleDictateParams.maxWidth = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        styleDictateParams.businessType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        styleDictateParams.bubbleContentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        styleDictateParams.pointingTargetType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        styleDictateParams.showTrailingArrow = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        styleDictateParams.entryData = _EntryData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return styleDictateParams;
            }
        }
    }

    public static void LJ(StyleDictateParams styleDictateParams) {
        List<BubbleDecoration> list = styleDictateParams.bubbleDecorationList;
        if (list == null) {
            styleDictateParams.bubbleDecorationList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (BubbleDecoration bubbleDecoration : styleDictateParams.bubbleDecorationList) {
                if (bubbleDecoration != null) {
                    ImageModel imageModel = bubbleDecoration.image;
                    if (imageModel != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel);
                    }
                    Text text = bubbleDecoration.text;
                    if (text != null) {
                        _Text_ProtoDecoder.LJ(text);
                    }
                    TPText tPText = bubbleDecoration.tpText;
                    if (tPText != null) {
                        _TPText_ProtoDecoder.LJ(tPText);
                    }
                }
            }
        }
        EntryData entryData = styleDictateParams.entryData;
        if (entryData != null) {
            _EntryData_ProtoDecoder.LJ(entryData);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StyleDictateParams styleDictateParams) {
        LJ(styleDictateParams);
    }

    @Override // X.C0IMD
    public final StyleDictateParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StyleDictateParams styleDictateParams, List list) {
    }
}
