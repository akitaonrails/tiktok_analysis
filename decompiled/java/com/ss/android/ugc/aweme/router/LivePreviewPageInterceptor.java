package com.ss.android.ugc.aweme.router;

import X.AbstractC1387200mCc;
import X.C07NZ;
import X.C1388190mED;
import X.C13LP;
import X.C1906580ziK;
import X.C1976907ol;
import X.InterfaceC1012330cRz;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LiveGogoPreviewConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class LivePreviewPageInterceptor implements IInterceptor {
    public final String LL = "openShoot";
    public final String LLILLJJLI = "openRecord";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r9) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r0 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r0 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r0
            r8 = 0
            if (r0 == 0) goto L19
            boolean r0 = r0.LJIIIZ()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L19:
            boolean r0 = X.C1575980r76.LIZLLL(r5)
            r2 = 1
            if (r0 == 0) goto L3d
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r3 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r4 = 0
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            if (r1 == 0) goto L5b
            if (r9 == 0) goto L35
            android.app.Activity r8 = X.C1388190mED.LIZ(r9)
        L35:
            java.lang.String r0 = "anchor_schema"
            boolean r0 = r1.LIZJ(r8, r0, r2)
            if (r0 != r2) goto L5b
        L3d:
            r1 = 0
        L3e:
            X.01GW r0 = X.C274970Aq7.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L59
            boolean r0 = X.C04QR.LIZ(r9, r2)
            if (r0 != 0) goto L59
            r0 = 1
        L53:
            if (r1 != 0) goto L58
            if (r0 != 0) goto L58
            r2 = 0
        L58:
            return r2
        L59:
            r0 = 0
            goto L53
        L5b:
            r1 = 1
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.LivePreviewPageInterceptor.LIZ(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1.LJI(X.C844470XAv.LIZ()) == true) goto L18;
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r12) {
        /*
            r11 = this;
            r10 = 0
            if (r12 == 0) goto L68
            android.net.Uri r0 = r12.getUri()
            if (r0 == 0) goto L68
            java.lang.String r3 = r0.getHost()
        Ld:
            java.lang.String r4 = "live_multi_tab"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L4e
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r5 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r0 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r0
            if (r0 == 0) goto L66
            boolean r0 = r0.LJIIIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2d:
            boolean r0 = X.C1575980r76.LIZLLL(r0)
            if (r0 == 0) goto L4e
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r5 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            if (r1 == 0) goto L96
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r0 = r1.LJI(r0)
            if (r0 != r2) goto L96
        L4e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 == 0) goto L6a
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r5 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L65
            r0.Y4()
        L65:
            return r6
        L66:
            r0 = r10
            goto L2d
        L68:
            r3 = r10
            goto Ld
        L6a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            if (r12 == 0) goto L7d
            android.net.Uri r0 = r12.getUri()
            if (r0 == 0) goto L7d
            java.lang.String r10 = r0.getPath()
        L7d:
            r1.append(r10)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = r11.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L95
            java.lang.String r0 = r11.LLILLJJLI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L95
            r2 = 0
        L95:
            return r2
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.router.LivePreviewPageInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZIZ(Context context, Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//live_multi_tab");
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_params")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        smartRouteBuildRoute.withParam("sourceParams", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        smartRouteBuildRoute.withParam("from_intercept_schema", true);
        smartRouteBuildRoute.withParam("from_independent_live_page", "true");
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        ILiveOuterService iLiveOuterService;
        Activity activityLIZ;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        Activity activityLIZ2;
        Context context2 = context;
        Uri uri = routeIntent.getUri();
        String strOptString = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        boolean zLJFF = Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "live");
        if (a0.LJJIIZI(String.valueOf(uri), "//live_multi_tab", false) && LIZ(context2)) {
            return true;
        }
        if (!zLJFF) {
            return false;
        }
        if (LIZ(context2)) {
            return true;
        }
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService2 != null) {
            iLiveOuterService2.Y4();
        }
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if ((iLiveOuterService3 != null && iLiveOuterService3.d4()) || ((iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null && interfaceC1012330cRzF4.LJFF(uri))) {
            if (context2 != null && (activityLIZ2 = C1388190mED.LIZ(context2)) != null) {
                context2 = activityLIZ2;
            }
            LIZIZ(context2, uri);
            return true;
        }
        if (((LiveGogoPreviewConfig) C07NZ.LIZIZ.getValue()).enable) {
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "source_params")) != null) {
                try {
                    strOptString = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2).optString("request_from");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strOptString == null) {
                    strOptString = "";
                }
            }
            if (C13LP.LJJJJ(strOptString, C13LP.LLIIJI(((LiveGogoPreviewConfig) C07NZ.LIZIZ.getValue()).schemaBlackList))) {
                return false;
            }
            boolean z = false;
            for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService != null && iCreativeSAAService.isCreativePage(abstractC1387200mCc)) {
                    z = true;
                }
            }
            if (!z) {
                if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                    context2 = activityLIZ;
                }
                LIZIZ(context2, uri);
                return true;
            }
        }
        return false;
    }
}
