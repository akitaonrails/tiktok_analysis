package com.ss.android.ugc.aweme.compliance.common.foundation.impl.userbehavior;

import X.C01GW;
import X.C452501pT;
import X.C821850WLv;
import X.C828420Wee;
import X.InterfaceC1519070pdJ;
import X.InterfaceC1519080pdK;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class PNSUITransitionWebHookManager implements SparkSecurityWebNavigationService, SparkSecurityLynxService {
    public static final PNSUITransitionWebHookManager LIZ = new PNSUITransitionWebHookManager();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(62));

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService
    public C821850WLv handleLynxTemplateVerify(C828420Wee c828420Wee) {
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return false;
    }

    public final void registerWebHook() {
        SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
        sparkSecurityServiceCenter.registerService(SparkSecurityWebNavigationService.class, this);
        sparkSecurityServiceCenter.registerService(SparkSecurityLynxService.class, this);
    }

    public final void unregisterWebHook() {
        SparkSecurityServiceCenter sparkSecurityServiceCenter = SparkSecurityServiceCenter.INSTANCE;
        sparkSecurityServiceCenter.unregisterService(SparkSecurityWebNavigationService.class, this);
        sparkSecurityServiceCenter.unregisterService(SparkSecurityLynxService.class, this);
    }

    public static void LIZ(C828420Wee c828420Wee) {
        CopyOnWriteArrayList<InterfaceC1519080pdK> copyOnWriteArrayListLIZJ;
        String strValueOf = String.valueOf(c828420Wee.LJFF.get("URL"));
        InterfaceC1519070pdJ interfaceC1519070pdJ = (InterfaceC1519070pdJ) LIZIZ.getValue();
        if (interfaceC1519070pdJ != null && (copyOnWriteArrayListLIZJ = interfaceC1519070pdJ.LIZJ()) != null) {
            Iterator<InterfaceC1519080pdK> it2 = copyOnWriteArrayListLIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(null, strValueOf);
            }
        }
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService
    public C821850WLv handleWebViewWillStartNavigation(C828420Wee c828420Wee) {
        LIZ(c828420Wee);
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService
    public C821850WLv handleWillLoadLynxTemplateWithEvent(C828420Wee c828420Wee) {
        LIZ(c828420Wee);
        return null;
    }
}
