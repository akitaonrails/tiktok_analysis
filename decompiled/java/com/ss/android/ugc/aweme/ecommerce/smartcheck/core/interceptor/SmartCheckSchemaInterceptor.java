package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.interceptor;

import X.AbstractC1547260qMm;
import X.C1976907ol;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.ISmartCheckIntegrate;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.integrate.SmartCheckIntegrateImpl;

/* JADX INFO: loaded from: classes31.dex */
public final class SmartCheckSchemaInterceptor extends AbstractC1547260qMm implements IInterceptor {
    public final String LL;

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public SmartCheckSchemaInterceptor(String str) {
        this.LL = str;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        ISmartCheckIntegrate iSmartCheckIntegrateLIZLLL = SmartCheckIntegrateImpl.LIZLLL();
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return iSmartCheckIntegrateLIZLLL.LIZ(url);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r20 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r7 = r20.LJJIJLIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if ((r7 instanceof com.bytedance.hybrid.spark.page.SparkActivity) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        r7 = (com.bytedance.hybrid.spark.page.SparkActivity) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r10 = X.C1507790pL7.LIZ;
        r3 = new java.util.LinkedHashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (X.C034S.LIZ() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        X.C1120604Zw.LIZ.LIZ();
        r12 = android.os.SystemClock.elapsedRealtime();
        r8 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class);
        r9 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r9 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        X.C1120604Zw.LIZ.LIZ();
        r8 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) X.C1120604Zw.LIZJ.LIZLLL(com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r15 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r9 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r16 = r9.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        X.C1AQS.LIZJ(r12, 1, r15, r16, r17);
        r8 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        r3.put("package_type", ((com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r8).getChannel());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        r1 = com.bytedance.hybrid.spark.page.SparkActivity.class.getCanonicalName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        r0 = (java.lang.String) r3.put("location", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        r3.put("business", "GECC");
        r3.put("in_schema", r21);
        r10.getClass();
        X.C1507790pL7.LIZJ("gecc_schema_report", r3);
        X.C189200o6.m2constructorimpl(kotlin.Unit.LIZ);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a A[Catch: all -> 0x014d, TryCatch #1 {all -> 0x014d, blocks: (B:47:0x00f3, B:49:0x00ff, B:51:0x0105, B:53:0x0111, B:63:0x0130, B:64:0x0134, B:66:0x013a, B:68:0x0146, B:56:0x0118, B:57:0x011c, B:59:0x0122), top: B:79:0x00f3 }] */
    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleSparkContext(com.bytedance.hybrid.spark.SparkContext r20, java.lang.String r21) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.interceptor.SmartCheckSchemaInterceptor.handleSparkContext(com.bytedance.hybrid.spark.SparkContext, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r23 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        r9 = X.C1388190mED.LIZ(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r8 = X.C1507790pL7.LIZ;
        r2 = new java.util.LinkedHashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (X.C034S.LIZ() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        X.C1120604Zw.LIZ.LIZ();
        r16 = android.os.SystemClock.elapsedRealtime();
        r6 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class);
        r7 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        r19 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r7 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        r20 = r7.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        X.C1AQS.LIZJ(r16, 1, r19, r20, r21);
        r6 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        X.C1120604Zw.LIZ.LIZ();
        r6 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) X.C1120604Zw.LIZJ.LIZLLL(com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r2.put("package_type", ((com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r6).getChannel());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        if (r9 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r1 = r9.getClass().getCanonicalName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        r0 = (java.lang.String) r2.put("location", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r2.put("business", "GECC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        r2.put("in_schema", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        r8.getClass();
        X.C1507790pL7.LIZJ("gecc_schema_report", r2);
        X.C189200o6.m2constructorimpl(kotlin.Unit.LIZ);
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013c A[Catch: all -> 0x0197, TryCatch #1 {all -> 0x0197, blocks: (B:50:0x00ed, B:52:0x00f9, B:54:0x00ff, B:56:0x010b, B:70:0x0132, B:71:0x0136, B:73:0x013c, B:75:0x0144, B:77:0x014a, B:79:0x0150, B:81:0x0156, B:83:0x015c, B:85:0x0162, B:86:0x0166, B:88:0x016c, B:89:0x0172, B:91:0x0178, B:93:0x0181, B:95:0x0186, B:99:0x0190, B:100:0x0192, B:97:0x018b, B:59:0x0112, B:60:0x0116, B:62:0x011c, B:64:0x0124, B:66:0x012a), top: B:115:0x00ed, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r23, com.bytedance.router.RouteIntent r24) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.interceptor.SmartCheckSchemaInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
