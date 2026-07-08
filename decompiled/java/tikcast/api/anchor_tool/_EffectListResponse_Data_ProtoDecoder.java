package tikcast.api.anchor_tool;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tikcast.api.anchor_tool.EffectListResponse;
import webcast.data.EffectCategory;
import webcast.data.EffectStruct;
import webcast.data.Panel;
import webcast.data._EffectCategory_ProtoDecoder;
import webcast.data._EffectStruct_ProtoDecoder;
import webcast.data._Panel_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectListResponse_Data_ProtoDecoder implements C0IMD<EffectListResponse.Data> {
    public static EffectListResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectListResponse.Data data = new EffectListResponse.Data();
        data.effects = new ArrayList();
        data.extra = new HashMap();
        data.collection = new ArrayList();
        data.category = new ArrayList();
        data.urlPrefix = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        data.version = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        data.panel = _Panel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        data.effects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        data.collection.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        data.category.add(_EffectCategory_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        data.frontEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        data.rearEffectId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        data.urlPrefix.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
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
                                        data.extra.put(strLIZLLL, strLIZLLL2);
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
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        data.upgrade = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(EffectListResponse.Data data) {
        Panel panel = data.panel;
        if (panel != null) {
            _Panel_ProtoDecoder.LJ(panel);
        }
        List<EffectStruct> list = data.effects;
        if (list == null) {
            data.effects = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EffectStruct effectStruct : data.effects) {
                if (effectStruct != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct);
                }
            }
        }
        List<EffectStruct> list2 = data.collection;
        if (list2 == null) {
            data.collection = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (EffectStruct effectStruct2 : data.collection) {
                if (effectStruct2 != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct2);
                }
            }
        }
        List<EffectCategory> list3 = data.category;
        if (list3 == null) {
            data.category = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (EffectCategory effectCategory : data.category) {
                if (effectCategory != null) {
                    _EffectCategory_ProtoDecoder.LJ(effectCategory);
                }
            }
        }
        if (data.urlPrefix == null) {
            data.urlPrefix = new ArrayList();
        }
        if (data.extra == null) {
            data.extra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EffectListResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final EffectListResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectListResponse.Data data, List list) {
    }
}
