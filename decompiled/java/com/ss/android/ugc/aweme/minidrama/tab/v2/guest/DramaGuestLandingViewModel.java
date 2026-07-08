package com.ss.android.ugc.aweme.minidrama.tab.v2.guest;

import X.AbstractC316870CbV;
import X.C1165730gRP;
import X.C1165740gRQ;
import X.C13BV;
import X.C1578660rBQ;
import X.C316640Cb8;
import X.C317290CcB;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import android.content.Context;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class DramaGuestLandingViewModel extends AssemListViewModel<C1165740gRQ, C1165730gRP, String> {
    public Function0<Unit> LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165740gRQ(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1165730gRP> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 116));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1165680gRK
            if (r0 == 0) goto L20
            r4 = r7
            X.0gRK r4 = (X.C1165680gRK) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L48
        L20:
            X.0gRK r4 = new X.0gRK
            r4.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.series.feed.api.SeriesListApi$GetSeriesCenterListApi r0 = X.C1576960r8g.LIZIZ()     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L3d
            X.11NZ r0 = r0.getGuestLanding()     // Catch: java.lang.Exception -> L8d
            if (r0 != 0) goto L3f
        L3d:
            X.11IR r0 = X.C11IR.LL     // Catch: java.lang.Exception -> L8d
        L3f:
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L8d
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)     // Catch: java.lang.Exception -> L8d
            if (r3 != r2) goto L4b
            return r2
        L48:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L8d
        L4b:
            com.ss.android.ugc.aweme.series.feed.api.MiniDramaGuestLandingResponse r3 = (com.ss.android.ugc.aweme.series.feed.api.MiniDramaGuestLandingResponse) r3     // Catch: java.lang.Exception -> L8d
            java.util.List<com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview> r1 = r3.collections     // Catch: java.lang.Exception -> L8d
            if (r1 != 0) goto L53
            X.13BV r1 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L8d
        L53:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8d
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> L8d
            r5.<init>(r0)     // Catch: java.lang.Exception -> L8d
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Exception -> L8d
            r3 = 0
        L63:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto L82
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L8d
            int r1 = r3 + 1
            if (r3 < 0) goto L7d
            com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview r2 = (com.ss.android.ugc.aweme.minidrama.common.component.model.ShortDramaOverview) r2     // Catch: java.lang.Exception -> L8d
            X.0gRP r0 = new X.0gRP     // Catch: java.lang.Exception -> L8d
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L8d
            r5.add(r0)     // Catch: java.lang.Exception -> L8d
            r3 = r1
            goto L63
        L7d:
            X.C1697810uHb.LJIJI()     // Catch: java.lang.Exception -> L8d
            r0 = 0
            throw r0     // Catch: java.lang.Exception -> L8d
        L82:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L8d
            r0.getClass()     // Catch: java.lang.Exception -> L8d
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L8d
            r0.<init>(r5)     // Catch: java.lang.Exception -> L8d
            return r0
        L8d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minidrama.tab.v2.guest.DramaGuestLandingViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }

    public final void vQ2(Context context, String str) {
        String str2;
        MiniDramaAccountService.LIZ.getClass();
        MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
        if (miniDramaAccountServiceLIZ != null && miniDramaAccountServiceLIZ.LIZJ()) {
            Function0<Unit> function0 = this.LL;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        MiniDramaAccountService miniDramaAccountServiceLIZ2 = C1578660rBQ.LIZ();
        if (miniDramaAccountServiceLIZ2 != null) {
            if (str != null && str.length() != 0) {
                str2 = "drama_cover";
            } else {
                str2 = "drama_login_button";
            }
            miniDramaAccountServiceLIZ2.LIZLLL(context, str2, str, new AwS562S0100000_18(this, 376), null, null);
        }
    }
}
