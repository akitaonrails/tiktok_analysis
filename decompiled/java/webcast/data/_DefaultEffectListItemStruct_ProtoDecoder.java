package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DefaultEffectListItemStruct_ProtoDecoder implements C0IMD<DefaultEffectListItemStruct> {
    public static DefaultEffectListItemStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DefaultEffectListItemStruct defaultEffectListItemStruct = new DefaultEffectListItemStruct();
        defaultEffectListItemStruct.effects = new ArrayList();
        defaultEffectListItemStruct.bindEffects = new ArrayList();
        defaultEffectListItemStruct.collection = new ArrayList();
        defaultEffectListItemStruct.urlPrefix = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    defaultEffectListItemStruct.bindEffects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                defaultEffectListItemStruct.urlPrefix.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            defaultEffectListItemStruct.collection.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        defaultEffectListItemStruct.effects.add(_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    defaultEffectListItemStruct.type = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return defaultEffectListItemStruct;
            }
        }
    }

    public static void LJ(DefaultEffectListItemStruct defaultEffectListItemStruct) {
        List<EffectStruct> list = defaultEffectListItemStruct.effects;
        if (list == null) {
            defaultEffectListItemStruct.effects = new ArrayList();
        } else if (!list.isEmpty()) {
            for (EffectStruct effectStruct : defaultEffectListItemStruct.effects) {
                if (effectStruct != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct);
                }
            }
        }
        List<EffectStruct> list2 = defaultEffectListItemStruct.collection;
        if (list2 == null) {
            defaultEffectListItemStruct.collection = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (EffectStruct effectStruct2 : defaultEffectListItemStruct.collection) {
                if (effectStruct2 != null) {
                    _EffectStruct_ProtoDecoder.LJ(effectStruct2);
                }
            }
        }
        if (defaultEffectListItemStruct.urlPrefix == null) {
            defaultEffectListItemStruct.urlPrefix = new ArrayList();
        }
        List<EffectStruct> list3 = defaultEffectListItemStruct.bindEffects;
        if (list3 == null) {
            defaultEffectListItemStruct.bindEffects = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (EffectStruct effectStruct3 : defaultEffectListItemStruct.bindEffects) {
            if (effectStruct3 != null) {
                _EffectStruct_ProtoDecoder.LJ(effectStruct3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DefaultEffectListItemStruct defaultEffectListItemStruct) {
        LJ(defaultEffectListItemStruct);
    }

    @Override // X.C0IMD
    public final DefaultEffectListItemStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DefaultEffectListItemStruct defaultEffectListItemStruct, List list) {
    }
}
