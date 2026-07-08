package com.ss.android.ugc.aweme.localservice.service;

import X.C04TD;
import X.C21312618aq;
import X.C21312718ar;
import X.C21312918at;
import X.C286720BLq;
import X.EnumC1205980hUK;
import Y.ARunnableS30S1100000_26;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.consume.playnum.UserPlayData;
import com.ss.android.ugc.aweme.localservice.model.PoiFeedPlayNumModel;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class PoiFeedPlayNumServiceImpl implements IPoiFeedPlayNumService {
    public static IPoiFeedPlayNumService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IPoiFeedPlayNumService.class, false);
        if (objLIZ != null) {
            return (IPoiFeedPlayNumService) objLIZ;
        }
        if (C04TD.a2 == null) {
            synchronized (IPoiFeedPlayNumService.class) {
                if (C04TD.a2 == null) {
                    C04TD.a2 = new PoiFeedPlayNumServiceImpl();
                }
            }
        }
        return C04TD.a2;
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.IPoiFeedPlayNumService
    public final void LIZ() {
        if (C286720BLq.LIZ()) {
            C21312618aq c21312618aq = C21312718ar.LIZIZ;
            c21312618aq.LIZIZ(C21312718ar.LIZLLL);
            C21312718ar.LIZLLL = c21312618aq.LIZ(C21312718ar.LIZJ.LJIIJ().getCurUserId());
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.IPoiFeedPlayNumService
    public final void LIZIZ() {
        if (C286720BLq.LIZ()) {
            C21312618aq c21312618aq = C21312718ar.LIZIZ;
            c21312618aq.LIZIZ(C21312718ar.LIZLLL);
            C21312718ar.LIZLLL = c21312618aq.LIZ(C21312718ar.LIZJ.LJIIJ().getCurUserId());
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.IPoiFeedPlayNumService
    public final void LIZJ() {
        if (C286720BLq.LIZ()) {
            C21312618aq c21312618aq = C21312718ar.LIZIZ;
            String str = C21312718ar.LIZLLL.uid;
            c21312618aq.getClass();
            try {
                new ARunnableS30S1100000_26(c21312618aq, str, 2).run();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "remove_poi_play_num", new LinkedHashMap(), e);
            }
            UserPlayData userPlayDataLIZ = c21312618aq.LIZ(C21312718ar.LIZJ.LJIIJ().getCurUserId());
            C21312718ar.LIZLLL.setUid(userPlayDataLIZ.uid);
            PoiFeedPlayNumModel poiFeedPlayNumModel = C21312718ar.LIZLLL.model;
            poiFeedPlayNumModel.setBatchNum(poiFeedPlayNumModel.batchNum + userPlayDataLIZ.model.batchNum);
            PoiFeedPlayNumModel poiFeedPlayNumModel2 = C21312718ar.LIZLLL.model;
            poiFeedPlayNumModel2.setBatchNumAll(poiFeedPlayNumModel2.batchNumAll + userPlayDataLIZ.model.batchNumAll);
            PoiFeedPlayNumModel poiFeedPlayNumModel3 = C21312718ar.LIZLLL.model;
            poiFeedPlayNumModel3.setPlayNum(poiFeedPlayNumModel3.playNum + userPlayDataLIZ.model.playNum);
            PoiFeedPlayNumModel poiFeedPlayNumModel4 = C21312718ar.LIZLLL.model;
            poiFeedPlayNumModel4.setPlayNumAll(poiFeedPlayNumModel4.playNumAll + userPlayDataLIZ.model.playNumAll);
            c21312618aq.LIZIZ(C21312718ar.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.IPoiFeedPlayNumService
    public final void a4() {
        if (C286720BLq.LIZ()) {
            C21312718ar.LIZIZ.LIZIZ(C21312718ar.LIZLLL);
        }
    }
}
