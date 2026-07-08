package com.ss.android.ugc.aweme.ecommerce.schema;

import X.AbstractC1547260qMm;
import X.C13LP;
import X.C1976907ol;
import X.C20024613Wq;
import X.C20024713Wr;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class EcSchemaVerifyInterceptor extends AbstractC1547260qMm implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel;
        boolean z;
        boolean z2;
        C20024613Wq.LIZ.getClass();
        if (str != null && !a0.LJJJIL(str)) {
            try {
                try {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    ecSchemaVerifyRulesModel = C20024713Wr.LIZ;
                    EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel2 = (EcSchemaVerifyRulesModel) settingsManagerLIZLLL.LJIIIIZZ("ec_schema_verify_rules", EcSchemaVerifyRulesModel.class, ecSchemaVerifyRulesModel);
                    if (ecSchemaVerifyRulesModel2 != null) {
                        ecSchemaVerifyRulesModel = ecSchemaVerifyRulesModel2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ecSchemaVerifyRulesModel = C20024713Wr.LIZ;
                }
                if (ecSchemaVerifyRulesModel.enableVerify) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"?"}, 2, 2);
                    String str2 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!a0.LJJJIL(str2)) {
                        EcSchemaVerifyRulesModel.BlockRules blockRules = ecSchemaVerifyRulesModel.blockRules;
                        for (String str4 : blockRules.ignorePage) {
                            if ((!a0.LJJJIL(str4)) && a0.LJJIIZI(str2, str4, false)) {
                                return false;
                            }
                        }
                        for (String str5 : blockRules.blockNativePage) {
                            if ((!a0.LJJJIL(str5)) && a0.LJJIIZI(str2, str5, false)) {
                                return true;
                            }
                        }
                        String str6 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                        if (str6 != null) {
                            str3 = str6;
                        }
                        if (!a0.LJJJIL(str3)) {
                            Iterator<String> it2 = blockRules.blockCrossPage.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String next = it2.next();
                                    if ((!a0.LJJJIL(next)) && a0.LJJIIZI(str2, next, false)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            Iterator<String> it3 = blockRules.blockCrossUrl.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    String next2 = it3.next();
                                    if ((!a0.LJJJIL(next2)) && a0.LJJIIZI(str3, next2, false)) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z && z2) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return matchInterceptRules(url);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String str) {
        super.handleSparkContext(sparkContext, str);
        if (a0.LJJIIZI(str, "ECSparkPreload", false)) {
            return;
        }
        C20024613Wq.LIZ.getClass();
        C20024613Wq.LJFF(str, false);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String url;
        C20024613Wq c20024613Wq = C20024613Wq.LIZ;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        c20024613Wq.getClass();
        C20024613Wq.LJFF(url, true);
        return false;
    }
}
