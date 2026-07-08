package com.ss.android.ugc.aweme.ml.feature.pspfeature;

import X.C1090270eTh;
import X.C1510050pOl;
import X.InterfaceC805220ViK;
import X.InterfaceC830890Wid;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.tiktok.strategycenterengineimpl.action.IPSPFeatureAction;

/* JADX INFO: loaded from: classes18.dex */
public final class PSPFeatureAction implements IPSPFeatureAction {
    @Override // com.tiktok.strategycenterengineimpl.action.IPSPActionCallBack
    public final void execute(InterfaceC830890Wid interfaceC830890Wid, InterfaceC805220ViK interfaceC805220ViK, Object obj) {
        C1090270eTh c1090270eTh;
        String str;
        String str2;
        if (!(obj instanceof C1090270eTh) || (c1090270eTh = (C1090270eTh) obj) == null || (str = c1090270eTh.LIZ) == null || (str2 = c1090270eTh.LIZJ) == null) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer = C1510050pOl.LIZ().getProducer(str2, c1090270eTh.LIZIZ);
        if (producer != null) {
            producer.saveValueToProducer(str, interfaceC805220ViK);
        }
    }
}
