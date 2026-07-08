package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _TopFrameV2Summary_ProtoDecoder implements C0IMD<TopFrameV2Summary> {
    public static TopFrameV2Summary LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopFrameV2Summary topFrameV2Summary = new TopFrameV2Summary();
        topFrameV2Summary.resourceConfigs = new HashMap();
        topFrameV2Summary.showList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        topFrameV2Summary.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        topFrameV2Summary.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        topFrameV2Summary.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        topFrameV2Summary.showList.add(_ShowInfoV2_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        topFrameV2Summary.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        topFrameV2Summary.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        topFrameV2Summary.type = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        topFrameV2Summary.configVersion = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        topFrameV2Summary.operateVersion = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        topFrameV2Summary.timeTravelOffsetSec = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        ResourceConfig resourceConfigLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        resourceConfigLIZLLL = _ResourceConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (resourceConfigLIZLLL != null) {
                                        topFrameV2Summary.resourceConfigs.put(strLIZLLL, resourceConfigLIZLLL);
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
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topFrameV2Summary;
            }
        }
    }

    public static void LJ(TopFrameV2Summary topFrameV2Summary) {
        List<ShowInfoV2> list = topFrameV2Summary.showList;
        if (list == null) {
            topFrameV2Summary.showList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ShowInfoV2 showInfoV2 : topFrameV2Summary.showList) {
                if (showInfoV2 != null) {
                    _ShowInfoV2_ProtoDecoder.LJ(showInfoV2);
                }
            }
        }
        Map<String, ResourceConfig> map = topFrameV2Summary.resourceConfigs;
        if (map == null) {
            topFrameV2Summary.resourceConfigs = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, ResourceConfig>> it2 = topFrameV2Summary.resourceConfigs.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopFrameV2Summary topFrameV2Summary) {
        LJ(topFrameV2Summary);
    }

    @Override // X.C0IMD
    public final TopFrameV2Summary LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopFrameV2Summary topFrameV2Summary, List list) {
    }
}
