package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1483410ohn;
import X.C1976907ol;
import X.C2279011EIh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class DetailActivityInterceptorTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DetailActivityInterceptorTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class DetailPageRouterInterceptor implements IInterceptor {
        @Override // com.bytedance.router.interceptor.IInterceptor
        public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
            return C1976907ol.LIZ(this, routeIntent);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x000d A[PHI: r1
          0x000d: PHI (r1v4 java.lang.String) = (r1v0 java.lang.String), (r1v5 java.lang.String) binds: [B:7:0x000b, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.bytedance.router.interceptor.IInterceptor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
            /*
                r3 = this;
                java.lang.String r2 = ""
                if (r4 == 0) goto La
                java.lang.String r1 = r4.getHost()
                if (r1 != 0) goto Ld
            La:
                r1 = r2
                if (r4 == 0) goto L14
            Ld:
                java.lang.String r0 = r4.getPath()
                if (r0 == 0) goto L14
                r2 = r0
            L14:
                java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)
                r1 = 0
                java.lang.String r0 = "aweme/detail"
                boolean r1 = kotlin.text.u.LJJIIJZLJL(r2, r0, r1)
                if (r1 == 0) goto L30
                java.lang.String r0 = "detail_page_loading"
                X.C818480W8w.LIZ(r0)
            L30:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.DetailActivityInterceptorTask.DetailPageRouterInterceptor.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            Intent extra;
            String stringExtra = null;
            if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                try {
                    stringExtra = extra.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(stringExtra);
            if (awemeLLILZ != null) {
                C1483410ohn.LJLJJI().LJJLJ(awemeLLILZ);
                return false;
            }
            return false;
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context != null && ((Boolean) C2279011EIh.LIZIZ.getValue()).booleanValue()) {
            SmartRouter.addInterceptor(new DetailPageRouterInterceptor());
        }
    }
}
