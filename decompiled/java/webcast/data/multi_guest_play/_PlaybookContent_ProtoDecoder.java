package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookContent_ProtoDecoder implements C0IMD<PlaybookContent> {
    public static PlaybookContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PlaybookContent playbookContent = new PlaybookContent();
        playbookContent.tagAggregations = new ArrayList();
        playbookContent.tagTypes = new ArrayList();
        playbookContent.functionExtraMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 101) {
                    switch (iLJI) {
                        case 1:
                            playbookContent.playbookContentId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            playbookContent.originalPlaybookContentId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            playbookContent.textType = c1516680pZS.LJIIJ();
                            break;
                        case 4:
                            playbookContent.title = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            playbookContent.coverUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            playbookContent.description = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            playbookContent.contentStatus = c1516680pZS.LJIIJ();
                            break;
                        case 8:
                            playbookContent.minSymphonyEngineAppVersion = c1516680pZS.LJIIJJI();
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            playbookContent.editorInfo = _PlaybookEditorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            playbookContent.flowStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            playbookContent.coverUri = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            playbookContent.tagTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            playbookContent.tagAggregations.add(_PlaybookTagAggregation_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case 14:
                            playbookContent.needAsyncUpdate = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 15:
                            playbookContent.contentSource = c1516680pZS.LJIIJ();
                            break;
                        case 16:
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Long lValueOf = null;
                            PlaybookFlowExtra playbookFlowExtraLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 != -1) {
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            playbookFlowExtraLIZLLL = _PlaybookFlowExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (lValueOf != null) {
                                        if (playbookFlowExtraLIZLLL != null) {
                                            playbookContent.functionExtraMap.put(lValueOf, playbookFlowExtraLIZLLL);
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
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            playbookContent.supportAutomation = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    playbookContent.contentExtra = _PlaybookContentExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookContent;
            }
        }
    }

    public static void LJ(PlaybookContent playbookContent) {
        LiveStudioContentExtra liveStudioContentExtra;
        if (playbookContent.tagTypes == null) {
            playbookContent.tagTypes = new ArrayList();
        }
        List<PlaybookTagAggregation> list = playbookContent.tagAggregations;
        if (list == null) {
            playbookContent.tagAggregations = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PlaybookTagAggregation playbookTagAggregation : playbookContent.tagAggregations) {
                if (playbookTagAggregation != null) {
                    _PlaybookTagAggregation_ProtoDecoder.LJ(playbookTagAggregation);
                }
            }
        }
        Map<Long, PlaybookFlowExtra> map = playbookContent.functionExtraMap;
        if (map == null) {
            playbookContent.functionExtraMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, PlaybookFlowExtra>> it2 = playbookContent.functionExtraMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        PlaybookContentExtra playbookContentExtra = playbookContent.contentExtra;
        if (playbookContentExtra != null && (liveStudioContentExtra = playbookContentExtra.liveStudioContentExtra) != null && liveStudioContentExtra.coreFuncList == null) {
            liveStudioContentExtra.coreFuncList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PlaybookContent playbookContent) {
        LJ(playbookContent);
    }

    @Override // X.C0IMD
    public final PlaybookContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookContent playbookContent, List list) {
    }
}
