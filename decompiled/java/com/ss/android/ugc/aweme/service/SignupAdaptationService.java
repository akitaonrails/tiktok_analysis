package com.ss.android.ugc.aweme.service;

import X.C04TD;
import X.C0TA0;
import X.C10GQ;
import X.C2188811AlT;
import X.EnumC19241510Pl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SignupAdaptationService implements ISignupAdaptationService {
    public static ISignupAdaptationService LIZIZ() {
        Object objLIZ = C04TD.LIZ(ISignupAdaptationService.class, false);
        if (objLIZ != null) {
            return (ISignupAdaptationService) objLIZ;
        }
        if (C04TD.k4 == null) {
            synchronized (ISignupAdaptationService.class) {
                if (C04TD.k4 == null) {
                    C04TD.k4 = new SignupAdaptationService();
                }
            }
        }
        return C04TD.k4;
    }

    @Override // com.ss.android.ugc.aweme.service.ISignupAdaptationService
    public final boolean LIZ() {
        C0TA0 next;
        IPluginService.SimplePluginData simplePluginData;
        List<IPluginService.SpKvItem> list;
        C10GQ.LIZ.getClass();
        if (!C10GQ.LIZIZ) {
            Iterator<C0TA0> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.getType() == EnumC19241510Pl.SIGNUP_SCENARIO_ADAPTATION_SHOOT) {
                    break;
                }
            }
            C0TA0 c0ta0 = next;
            if (c0ta0 != null) {
                IPluginService.PluginDataWrapper value = c0ta0.getValue();
                if (value == null || (simplePluginData = value.simplePluginData) == null || (list = simplePluginData.kvList) == null || list.isEmpty()) {
                    C10GQ.LIZIZ = true;
                } else {
                    Iterator<IPluginService.SpKvItem> it3 = list.iterator();
                    while (it3.hasNext()) {
                        IPluginService.SpKvItem next2 = it3.next();
                        if (Intrinsics.LJFF(next2 != null ? next2.key : null, "should_use_adaptation")) {
                            C10GQ.LIZJ = Boolean.parseBoolean(next2.boolValue);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Signup Adaptation: unknown parameter ");
                            sbLIZ.append(next2 != null ? next2.key : null);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    C10GQ.LIZIZ = true;
                }
            }
        }
        return C10GQ.LIZJ;
    }
}
