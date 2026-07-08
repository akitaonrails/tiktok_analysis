package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC1547260qMm;
import X.C1124704ab;
import X.C13BV;
import X.C1549860qQy;
import X.C1697810uHb;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.compliance.EcComplianceConfigModel;
import com.ss.android.ugc.aweme.ecommerce.compliance.ScenesConfig;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessEComSparkRouterInterceptorsProvider implements IEComHybridSparkInterceptorService {
    public final List<ISparkRouterInterceptor> LIZ;

    public BusinessEComSparkRouterInterceptorsProvider() {
        List<ISparkRouterInterceptor> listLIZ;
        List<ISparkRouterInterceptor> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1549860qQy(), EcomGeckoUpdateInterceptor.LL);
        if (C1124704ab.LIZ()) {
            listLJIILJJIL.add(new AbstractC1547260qMm() { // from class: X.0vFl
                public final Map<String, String> LL = new LinkedHashMap();

                public static final String LIZ(String str) {
                    Uri uriLJ = C1946007jm.LJ(str);
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "channel");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url")) == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "surl")) == null) {
                        return str;
                    }
                    return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }

                @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
                public final boolean matchInterceptRules(String str) {
                    List<ScenesConfig> list;
                    if (str == null) {
                        return false;
                    }
                    String strLIZ = LIZ(str);
                    if (this.LL.containsKey(strLIZ)) {
                        return true;
                    }
                    EcComplianceConfigModel ecComplianceConfigModelLIZ = C1735130vFn.LIZ();
                    if (ecComplianceConfigModelLIZ != null && (list = ecComplianceConfigModelLIZ.scenes) != null) {
                        Iterator<ScenesConfig> it2 = list.iterator();
                        while (it2.hasNext()) {
                            List<String> list2 = it2.next().feChannels;
                            if (list2 != null) {
                                for (String str2 : list2) {
                                    if (a0.LJJIIZI(strLIZ, str2, false)) {
                                        this.LL.put(strLIZ, str2);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }

                @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
                public final void handleSparkContext(SparkContext sparkContext, String str) {
                    String str2;
                    List<ScenesConfig> list;
                    super.handleSparkContext(sparkContext, str);
                    try {
                        String strLIZ = LIZ(str);
                        EcComplianceConfigModel ecComplianceConfigModelLIZ = C1735130vFn.LIZ();
                        if (ecComplianceConfigModelLIZ != null && (list = ecComplianceConfigModelLIZ.scenes) != null) {
                            loop0: for (ScenesConfig scenesConfig : list) {
                                List<String> list2 = scenesConfig.feChannels;
                                if (list2 != null) {
                                    for (String str3 : list2) {
                                        if (strLIZ != null && a0.LJJIIZI(strLIZ, str3, false)) {
                                            str2 = scenesConfig.sceneName;
                                            break loop0;
                                        }
                                    }
                                }
                            }
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        C1735100vFk.LIZ.getClass();
                        C1735100vFk.LIZIZ(str2, str, null, null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
        }
        IEcSchemaService iEcSchemaService = (IEcSchemaService) ServiceManager.get().getService(IEcSchemaService.class);
        if (iEcSchemaService != null && (listLIZ = iEcSchemaService.LIZ()) != null) {
            Iterator<ISparkRouterInterceptor> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                listLJIILJJIL.add(it2.next());
            }
        }
        this.LIZ = listLJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List LIZIZ() {
        return C13BV.INSTANCE;
    }
}
