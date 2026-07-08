package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _EffectStruct_ProtoDecoder implements C0IMD<EffectStruct> {
    public static EffectStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectStruct effectStruct = new EffectStruct();
        effectStruct.typesSec = new ArrayList();
        effectStruct.music = new ArrayList();
        effectStruct.children = new ArrayList();
        effectStruct.tags = new ArrayList();
        effectStruct.bindIds = new ArrayList();
        effectStruct.systemList = new ArrayList();
        effectStruct.types = new ArrayList();
        effectStruct.requirements = new ArrayList();
        effectStruct.requirementsSec = new ArrayList();
        effectStruct.challenge = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        effectStruct.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        effectStruct.hint = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        effectStruct.hintIcon = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        effectStruct.sdkVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        effectStruct.appVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        effectStruct.fileUrl = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        effectStruct.iconUrl = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        effectStruct.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        effectStruct.effectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        effectStruct.devicePlatform = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        effectStruct.types.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        effectStruct.tags.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        effectStruct.tagsUpdatedAt = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        effectStruct.parent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        effectStruct.children.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 16:
                        effectStruct.effectType = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        effectStruct.music.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        effectStruct.source = c1516680pZS.LJIIJ();
                        break;
                    case 19:
                        effectStruct.designerId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        effectStruct.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 21:
                        effectStruct.requirements.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 22:
                        effectStruct.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 23:
                        effectStruct.isBusi = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    case 25:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 26:
                        effectStruct.designerEncryptedId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 27:
                        effectStruct.sdkExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        effectStruct.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        effectStruct.adRawData = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 30:
                        effectStruct.bindIds.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 31:
                        effectStruct.ptime = c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        effectStruct.gradeKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        effectStruct.composerParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        effectStruct.hintFile = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 35:
                        effectStruct.useNumber = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        effectStruct.typesSec.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 37:
                        effectStruct.requirementsSec.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 38:
                        effectStruct.panel = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 39:
                        effectStruct.modelNames = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 40:
                        effectStruct.modelNamesSec = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 41:
                        effectStruct.hintFileFormat = c1516680pZS.LJIIJ();
                        break;
                    case 42:
                        effectStruct.poiId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 43:
                        effectStruct.isPoi = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 44:
                        effectStruct.challenge.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 45:
                        effectStruct.systemList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 46:
                        effectStruct.originalEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 47:
                        effectStruct.transFileUrl = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 48:
                        effectStruct.templateEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 49:
                        effectStruct.recTag = c1516680pZS.LJIIJJI();
                        break;
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        effectStruct.templateEffectExtra = _TemplateEffectExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 51:
                        effectStruct.fileDiff = _DiffInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 52:
                        effectStruct.provider = c1516680pZS.LJIIJ();
                        break;
                    case 53:
                        effectStruct.packageSize = c1516680pZS.LJIIJJI();
                        break;
                    case 54:
                        effectStruct.fromAppId = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectStruct;
            }
        }
    }

    public static void LJ(EffectStruct effectStruct) {
        UrlDataStruct urlDataStruct = effectStruct.hintIcon;
        if (urlDataStruct != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct);
        }
        UrlDataStruct urlDataStruct2 = effectStruct.fileUrl;
        if (urlDataStruct2 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct2);
        }
        UrlDataStruct urlDataStruct3 = effectStruct.iconUrl;
        if (urlDataStruct3 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct3);
        }
        if (effectStruct.types == null) {
            effectStruct.types = new ArrayList();
        }
        if (effectStruct.tags == null) {
            effectStruct.tags = new ArrayList();
        }
        if (effectStruct.children == null) {
            effectStruct.children = new ArrayList();
        }
        if (effectStruct.music == null) {
            effectStruct.music = new ArrayList();
        }
        if (effectStruct.requirements == null) {
            effectStruct.requirements = new ArrayList();
        }
        if (effectStruct.bindIds == null) {
            effectStruct.bindIds = new ArrayList();
        }
        UrlDataStruct urlDataStruct4 = effectStruct.hintFile;
        if (urlDataStruct4 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct4);
        }
        if (effectStruct.typesSec == null) {
            effectStruct.typesSec = new ArrayList();
        }
        if (effectStruct.requirementsSec == null) {
            effectStruct.requirementsSec = new ArrayList();
        }
        if (effectStruct.challenge == null) {
            effectStruct.challenge = new ArrayList();
        }
        if (effectStruct.systemList == null) {
            effectStruct.systemList = new ArrayList();
        }
        UrlDataStruct urlDataStruct5 = effectStruct.transFileUrl;
        if (urlDataStruct5 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct5);
        }
        DiffInfo diffInfo = effectStruct.fileDiff;
        if (diffInfo != null) {
            UrlDataStruct urlDataStruct6 = diffInfo.diffUrl;
            if (urlDataStruct6 != null) {
                _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct6);
            }
            UrlDataStruct urlDataStruct7 = diffInfo.baseUrl;
            if (urlDataStruct7 != null) {
                _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct7);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EffectStruct effectStruct) {
        LJ(effectStruct);
    }

    @Override // X.C0IMD
    public final EffectStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectStruct effectStruct, List list) {
    }
}
