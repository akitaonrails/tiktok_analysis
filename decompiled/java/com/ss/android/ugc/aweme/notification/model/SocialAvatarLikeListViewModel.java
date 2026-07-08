package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC23140094w;
import X.AbstractC316870CbV;
import X.C00GV;
import X.C09DV;
import X.C1C7U;
import X.C627660Ojc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AwS38S0000100_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialAvatarLikeListViewModel extends AssemListViewModel<SocialAvatarLikeListState, C00GV, Long> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel$onLoadMore$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel", f = "SocialAvatarLikeListViewModel.kt", l = {42}, m = "onLoadMore")
    public final class AnonymousClass1 extends AbstractC23140094w {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("SocialAvatarLikeListViewModel@fffd.onLoadMore$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnLoadMore = SocialAvatarLikeListViewModel.this.onLoadMore(0L, this);
            C1C7U.LIZIZ("SocialAvatarLikeListViewModel@fffd.onLoadMore$1");
            return objOnLoadMore;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public SocialAvatarLikeListState defaultState() {
        return new SocialAvatarLikeListState(0L, "", new C627660Ojc(null, null, null, null, 15));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void newState(C627660Ojc<C00GV> c627660Ojc) {
        setState(new AwS603S0100000_24(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 161));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    public final void setAvatarId(long j) {
        setState(new AwS38S0000100_24(j, 0));
    }

    public final void setChecksum(String str) {
        setState(new AwS74S1000000_24(str, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onLoadMore(long r8, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel.AnonymousClass1
            if (r0 == 0) goto L22
            r6 = r10
            com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel$onLoadMore$1 r6 = (com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            long r8 = r6.J$0
            goto L52
        L22:
            com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel$onLoadMore$1 r6 = new com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel$onLoadMore$1
            r6.<init>(r10)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r5)
            X.002o r0 = r7.getState()     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState r0 = (com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState) r0     // Catch: java.lang.Exception -> La1
            long r1 = r0.avatarId     // Catch: java.lang.Exception -> La1
            X.002o r0 = r7.getState()     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState r0 = (com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListState) r0     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = r0.checksum     // Catch: java.lang.Exception -> La1
            X.11NZ r0 = X.C1909140zmS.LJ(r1, r8, r0)     // Catch: java.lang.Exception -> La1
            r6.J$0 = r8     // Catch: java.lang.Exception -> La1
            r6.label = r4     // Catch: java.lang.Exception -> La1
            java.lang.Object r5 = X.C11UD.LIZJ(r0, r6)     // Catch: java.lang.Exception -> La1
            if (r5 != r3) goto L55
            return r3
        L52:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> La1
        L55:
            com.ss.android.ugc.aweme.notification.bean.SocialAvatarLikeListResponse r5 = (com.ss.android.ugc.aweme.notification.bean.SocialAvatarLikeListResponse) r5     // Catch: java.lang.Exception -> La1
            r5.checkValid()     // Catch: java.lang.Exception -> La1
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r5.users     // Catch: java.lang.Exception -> La1
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> La1
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> La1
            r3.<init>(r0)     // Catch: java.lang.Exception -> La1
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> La1
        L6b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L80
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La1
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1     // Catch: java.lang.Exception -> La1
            X.00GV r0 = new X.00GV     // Catch: java.lang.Exception -> La1
            r0.<init>(r1)     // Catch: java.lang.Exception -> La1
            r3.add(r0)     // Catch: java.lang.Exception -> La1
            goto L6b
        L80:
            boolean r0 = r5.hasMore     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto L96
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> La1
            int r0 = r3.size()     // Catch: java.lang.Exception -> La1
            long r0 = (long) r0     // Catch: java.lang.Exception -> La1
            long r8 = r8 + r0
            java.lang.Long r1 = X.C2286608xc.LJFF(r8)     // Catch: java.lang.Exception -> La1
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r3, r4)     // Catch: java.lang.Exception -> La1
            return r0
        L96:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> La1
            r0.getClass()     // Catch: java.lang.Exception -> La1
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> La1
            r0.<init>(r3)     // Catch: java.lang.Exception -> La1
            return r0
        La1:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.SocialAvatarLikeListViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
