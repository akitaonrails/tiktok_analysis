package com.ss.android.ugc.aweme.services;

import X.AbstractC2238408pq;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0CX1;
import X.C0PEM;
import X.C0XQ7;
import X.C1165270gQf;
import X.C1166090gRz;
import X.C1388190mED;
import X.C155000ia;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C259070ADh;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes5.dex */
public final class ArticleModeRssService implements IArticleModeRssService {
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public boolean getHasRssEntrypointClicked() {
        C0CX1.LIZ.getClass();
        String curUserId = C0XQ7.LJFF().getCurUserId();
        Keva keva = C0CX1.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("article_mode_rss_entrypoint_clicked|");
        sbLIZ.append(curUserId);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public boolean isArticleRssCreationEnabled() {
        return ((Boolean) C259070ADh.LIZ.getValue()).booleanValue() && C0XQ7.LJFF().getCurUser().getAccountType() == 3;
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void markRssEntrypointClicked() {
        C0CX1.LIZ.getClass();
        String curUserId = C0XQ7.LJFF().getCurUserId();
        Keva keva = C0CX1.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("article_mode_rss_entrypoint_clicked|");
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.ArticleModeRssService$fetchRssUser$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.ArticleModeRssService$fetchRssUser$1", f = "ArticleModeRssService.kt", l = {57, 59}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Function1<C1166090gRz, Unit> $onSuccess;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super C1166090gRz, Unit> function1, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$onSuccess = function1;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSuccess, interfaceC1364105Vn);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object c098200Yq;
            C1C7U.LIZ("ArticleModeRssService@eaab.fetchRssUser$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c098200Yq = this.L$0;
                        C155000ia.LIZIZ(obj);
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ArticleModeRssService@eaab.fetchRssUser$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1165270gQf c1165270gQf = C1165270gQf.LIZIZ;
                this.label = 1;
                obj = c1165270gQf.LIZ.LIZJ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ArticleModeRssService@eaab.fetchRssUser$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1166090gRz) obj;
            C189200o6.m2constructorimpl(c098200Yq);
            Function1<C1166090gRz, Unit> function1 = this.$onSuccess;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                ArticleModeRssService$fetchRssUser$1$2$1 articleModeRssService$fetchRssUser$1$2$1 = new ArticleModeRssService$fetchRssUser$1$2$1(function1, (C1166090gRz) c098200Yq, null);
                this.L$0 = c098200Yq;
                this.label = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, articleModeRssService$fetchRssUser$1$2$1) == objLJFF) {
                    C1C7U.LIZIZ("ArticleModeRssService@eaab.fetchRssUser$1");
                    return objLJFF;
                }
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ArticleModeRssService@eaab.fetchRssUser$1");
            return unit2;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void fetchRssUser(Context context, Function1<? super C1166090gRz, Unit> function1) {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new AnonymousClass1(function1, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void openRssFeed(Context context, String str, String str2) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://rss/feed");
        smartRouteBuildRoute.withParam("rss_url", str);
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeRssService
    public void openRssLinkFlow(Context context, String str, String str2, OnActivityResultCallback onActivityResultCallback) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://rss/link");
        smartRouteBuildRoute.withParam("rss_url", str);
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.open(10001, onActivityResultCallback);
    }
}
