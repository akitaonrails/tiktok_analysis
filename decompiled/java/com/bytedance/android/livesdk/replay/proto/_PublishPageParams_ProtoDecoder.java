package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublishPageParams_ProtoDecoder implements C0IMD<PublishPageParams> {
    public static PublishPageParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublishPageParams publishPageParams = new PublishPageParams();
        publishPageParams.challenges = new ArrayList();
        publishPageParams.hashtagStickerConfig = new ArrayList();
        publishPageParams.textStickerConfig = new ArrayList();
        publishPageParams.captions = new ArrayList();
        publishPageParams.infoStickerConfig = new ArrayList();
        publishPageParams.mentions = new ArrayList();
        publishPageParams.specialEffectConfig = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        publishPageParams.textStickerConfig.add(_TextStickerConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        publishPageParams.musicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        publishPageParams.specialEffectConfig.add(_SpecialEffectConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        publishPageParams.defaultText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        publishPageParams.challenges.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        publishPageParams.mentions.add(_Mention_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        publishPageParams.hashtagStickerConfig.add(_HashtagStickerConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        publishPageParams.isCaptionOn = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        publishPageParams.infoStickerConfig.add(_InfoStickerConfig_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        publishPageParams.captions.add(_Caption_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        publishPageParams.transitionEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        publishPageParams.isPreGenCaption = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        publishPageParams.captionStatus = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        publishPageParams.canAddSticker = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return publishPageParams;
            }
        }
    }

    public static void LJ(PublishPageParams publishPageParams) {
        List<TextStickerConfig> list = publishPageParams.textStickerConfig;
        if (list == null) {
            publishPageParams.textStickerConfig = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<TextStickerConfig> it2 = publishPageParams.textStickerConfig.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<SpecialEffectConfig> list2 = publishPageParams.specialEffectConfig;
        if (list2 == null) {
            publishPageParams.specialEffectConfig = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<SpecialEffectConfig> it3 = publishPageParams.specialEffectConfig.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        if (publishPageParams.challenges == null) {
            publishPageParams.challenges = new ArrayList();
        }
        List<Mention> list3 = publishPageParams.mentions;
        if (list3 == null) {
            publishPageParams.mentions = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<Mention> it4 = publishPageParams.mentions.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        List<HashtagStickerConfig> list4 = publishPageParams.hashtagStickerConfig;
        if (list4 == null) {
            publishPageParams.hashtagStickerConfig = new ArrayList();
        } else if (!list4.isEmpty()) {
            Iterator<HashtagStickerConfig> it5 = publishPageParams.hashtagStickerConfig.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
        List<InfoStickerConfig> list5 = publishPageParams.infoStickerConfig;
        if (list5 == null) {
            publishPageParams.infoStickerConfig = new ArrayList();
        } else if (!list5.isEmpty()) {
            Iterator<InfoStickerConfig> it6 = publishPageParams.infoStickerConfig.iterator();
            while (it6.hasNext()) {
                it6.next();
            }
        }
        List<Caption> list6 = publishPageParams.captions;
        if (list6 == null) {
            publishPageParams.captions = new ArrayList();
        } else {
            if (list6.isEmpty()) {
                return;
            }
            Iterator<Caption> it7 = publishPageParams.captions.iterator();
            while (it7.hasNext()) {
                it7.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PublishPageParams publishPageParams) {
        LJ(publishPageParams);
    }

    @Override // X.C0IMD
    public final PublishPageParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublishPageParams publishPageParams, List list) {
    }
}
