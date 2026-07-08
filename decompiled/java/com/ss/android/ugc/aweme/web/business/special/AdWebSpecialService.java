package com.ss.android.ugc.aweme.web.business.special;

import X.C04TD;
import X.C0CLW;
import X.C1035880d3y;
import X.C1035990d49;
import X.C1039700dA8;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.experiment.IABWebViewHeaderSpecificationExperiment;
import com.ss.android.ugc.aweme.web.service.IAdWebSpecialService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebSpecialService implements IAdWebSpecialService {
    public static IAdWebSpecialService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdWebSpecialService.class, false);
        if (objLIZ != null) {
            return (IAdWebSpecialService) objLIZ;
        }
        if (C04TD.e6 == null) {
            synchronized (IAdWebSpecialService.class) {
                if (C04TD.e6 == null) {
                    C04TD.e6 = new AdWebSpecialService();
                }
            }
        }
        return C04TD.e6;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebSpecialService
    public final Map<String, String> LIZ(String str, Map<String, String> map, C1035880d3y c1035880d3y) {
        boolean zBooleanValue;
        String packageName;
        C1039700dA8.LIZ.getClass();
        if (str != null && !C1035990d49.LJFF(str) && c1035880d3y != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1039700dA8.LIZ(str, linkedHashMap);
            try {
                zBooleanValue = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getEnableReferer().booleanValue();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zBooleanValue = true;
            }
            Context applicationContext = null;
            if (!zBooleanValue) {
                if (linkedHashMap.isEmpty()) {
                    return null;
                }
                if (map != null) {
                    linkedHashMap.putAll(map);
                    return linkedHashMap;
                }
            } else {
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                linkedHashMap.put("referer", "https://www.tiktok.com");
                linkedHashMap.put("x-has-set-referer", "1");
                IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
                if (iAppContextService != null) {
                    applicationContext = iAppContextService.getApplicationContext();
                }
                IABWebViewHeaderSpecificationExperiment.LIZ.getClass();
                if (((IABWebViewHeaderSpecificationExperiment.Config) IABWebViewHeaderSpecificationExperiment.LIZJ.getValue()).getWithXRequestedWith() && applicationContext != null && (packageName = applicationContext.getPackageName()) != null) {
                    linkedHashMap.put("x-requested-with", packageName);
                }
            }
            return linkedHashMap;
        }
        return map;
    }
}
