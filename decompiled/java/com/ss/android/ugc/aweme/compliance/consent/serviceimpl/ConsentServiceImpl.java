package com.ss.android.ugc.aweme.compliance.consent.serviceimpl;

import X.AbstractC1549150qPp;
import X.C052B;
import X.C0CCZ;
import X.C1150504el;
import X.C13IQ;
import X.C13LE;
import X.C1873930yrf;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C793770VBv;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService;
import com.ss.android.ugc.aweme.compliance.consent.deviceconsent.DeviceConsentStatusTrackingTask;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsentServiceImpl implements IConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final C13IQ<? extends UISlotAssem> LIZIZ() {
        return C13LE.LIZ(TermsConditionsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final C0CCZ LIZ() {
        return new DeviceConsentStatusTrackingTask();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        return Collections.singletonList(C1873930yrf.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final void LIZJ(String str) {
        C052B.LIZ.getClass();
        if (!((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackDeviceConsentEscape, scenario = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("scenario", str));
            Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("use_duration", String.valueOf(System.currentTimeMillis() - C1150504el.LIZ().LJJII)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mapLIZJ);
            linkedHashMap.putAll(mapLIZJ2);
            C20684815ws.LJIILLIIL("pns_device_consent_escape", linkedHashMap);
            C793770VBv.LJII("pns_device_consent_escape", new JSONObject(mapLIZJ), new JSONObject(mapLIZJ2), null);
        }
    }
}
