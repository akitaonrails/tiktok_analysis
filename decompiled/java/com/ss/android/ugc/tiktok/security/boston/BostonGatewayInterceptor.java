package com.ss.android.ugc.tiktok.security.boston;

import X.AbstractC21508319Fh;
import X.C1697810uHb;
import X.C1976907ol;
import X.C21508419Fi;
import X.C21508619Fk;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.tiktok.security.settings.BostonRouterGatewayModel;
import com.ss.android.ugc.tiktok.security.settings.BostonVirtualRouterModel;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BostonGatewayInterceptor implements IInterceptor {
    public static AbstractC21508319Fh LLILLJJLI;
    public static BostonRouterGatewayModel LL = C21508619Fk.LIZ();
    public static final List<? extends AbstractC21508319Fh> LLILLL = C1697810uHb.LJIIJJI(new AbstractC21508319Fh() { // from class: X.19Fl
        @Override // X.InterfaceC21508919Fn
        public final EnumC2007807tk LIZ() {
            return EnumC2007807tk.DEAD_ZONE;
        }

        @Override // X.InterfaceC21508919Fn
        public final boolean LIZIZ(RouteIntent routeIntent, BostonRouterGatewayModel bostonRouterGatewayModel) {
            return LJFF(routeIntent, bostonRouterGatewayModel, bostonRouterGatewayModel.deadZone);
        }

        @Override // X.InterfaceC21508919Fn
        public final C21508819Fm LIZJ(RouteIntent routeIntent, BostonRouterGatewayModel bostonRouterGatewayModel) {
            String str;
            boolean z;
            EnumC21268018Kw enumC21268018Kw;
            String url = routeIntent.getUrl();
            String caller = routeIntent.getCaller();
            BostonVirtualRouterModel bostonVirtualRouterModel = this.LIZ;
            if (bostonVirtualRouterModel != null) {
                str = bostonVirtualRouterModel.routerName;
            } else {
                str = null;
            }
            int i = bostonRouterGatewayModel.deadZoneAction;
            if (i == 1) {
                z = true;
            } else {
                z = false;
                if (i != 1) {
                    enumC21268018Kw = EnumC21268018Kw.ALLOW;
                }
                return new C21508819Fm(z, url, enumC21268018Kw.getCode(), str, caller);
            }
            enumC21268018Kw = EnumC21268018Kw.DEAD_ZONE_BLOCK;
            return new C21508819Fm(z, url, enumC21268018Kw.getCode(), str, caller);
        }
    }, new C21508419Fi(), new C21508419Fi() { // from class: X.19Fj
        @Override // X.C21508419Fi, X.InterfaceC21508919Fn
        public final EnumC2007807tk LIZ() {
            return EnumC2007807tk.UNSAFE_TEST_ZONE;
        }

        @Override // X.C21508419Fi, X.InterfaceC21508919Fn
        public final boolean LIZIZ(RouteIntent routeIntent, BostonRouterGatewayModel bostonRouterGatewayModel) {
            List<String> list = bostonRouterGatewayModel.unsafeTestZone;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            return LJFF(routeIntent, bostonRouterGatewayModel, list);
        }

        @Override // X.C21508419Fi, X.InterfaceC21508919Fn
        public final C21508819Fm LIZJ(RouteIntent routeIntent, BostonRouterGatewayModel bostonRouterGatewayModel) {
            String str;
            String caller = routeIntent.getCaller();
            String url = routeIntent.getUrl();
            BostonVirtualRouterModel bostonVirtualRouterModel = this.LIZ;
            if (bostonVirtualRouterModel != null) {
                str = bostonVirtualRouterModel.routerName;
            } else {
                str = null;
            }
            return new C21508819Fm(false, url, EnumC21268018Kw.ALLOW.getCode(), str, caller);
        }
    });

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        LLILLJJLI = null;
        BostonRouterGatewayModel bostonRouterGatewayModelLIZ = C21508619Fk.LIZ();
        LL = bostonRouterGatewayModelLIZ;
        if (bostonRouterGatewayModelLIZ.enable && routeIntent != null) {
            for (AbstractC21508319Fh abstractC21508319Fh : LLILLL) {
                if (abstractC21508319Fh.LIZIZ(routeIntent, LL)) {
                    LLILLJJLI = abstractC21508319Fh;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r9, com.bytedance.router.RouteIntent r10) throws org.json.JSONException {
        /*
            r8 = this;
            r3 = 0
            if (r10 != 0) goto L4
            return r3
        L4:
            X.19Fh r1 = com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor.LLILLJJLI
            if (r1 != 0) goto L9
            return r3
        L9:
            com.ss.android.ugc.tiktok.security.settings.BostonRouterGatewayModel r0 = com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor.LL
            X.19Fm r2 = r1.LIZJ(r10, r0)
            if (r2 != 0) goto L12
            return r3
        L12:
            boolean r0 = r2.LIZ
            r6 = 0
            if (r0 != 0) goto L23
            X.19Fh r0 = com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor.LLILLJJLI
            if (r0 == 0) goto La4
            X.07tk r1 = r0.LIZ()
        L1f:
            X.07tk r0 = X.EnumC2007807tk.UNSAFE_TEST_ZONE
            if (r1 != r0) goto La1
        L23:
            X.19Fh r7 = com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor.LLILLJJLI
            if (r7 == 0) goto La1
            com.ss.android.ugc.tiktok.security.settings.BostonRouterGatewayModel r5 = com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor.LL
            boolean r0 = r5.reportEnable
            if (r0 == 0) goto L67
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            X.07tk r0 = r7.LIZ()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "zone"
            r4.put(r0, r1)
            java.lang.String r1 = r2.LIZIZ
            java.lang.String r0 = "schema"
            r4.put(r0, r1)
            java.lang.String r1 = "action"
            boolean r0 = r2.LIZ
            r4.put(r1, r0)
            java.lang.String r1 = "code"
            int r0 = r2.LIZJ
            r4.put(r1, r0)
            java.lang.String r1 = "routerName"
            java.lang.String r0 = r2.LIZLLL
            r4.put(r1, r0)
            java.lang.String r1 = "callerId"
            java.lang.String r0 = r2.LJ
            r4.put(r1, r0)
            java.lang.String r0 = "boston_router_sec_block"
            X.C793770VBv.LJII(r0, r4, r6, r6)
        L67:
            boolean r0 = r5.hintEnable
            if (r0 == 0) goto La1
            X.07tk r1 = r7.LIZ()
            X.07tk r0 = X.EnumC2007807tk.UNSAFE_TEST_ZONE
            if (r1 == r0) goto La1
            if (r9 != 0) goto L7e
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r9 = X.C844470XAv.LIZ()
        L7e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "blocked(huangzhongwei.coolman):"
            r1.append(r0)
            int r0 = r2.LIZJ
            r1.append(r0)
            java.lang.String r0 = " / "
            r1.append(r0)
            java.lang.String r0 = r2.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r3)
            X.C786410Ut5.re(r0)
        La1:
            boolean r0 = r2.LIZ
            return r0
        La4:
            r1 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
