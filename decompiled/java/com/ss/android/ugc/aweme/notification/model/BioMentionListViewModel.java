package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC23140094w;
import X.AbstractC316870CbV;
import X.C09DV;
import X.C1582320rHK;
import X.C1C7U;
import X.C316640Cb8;
import X.C317290CcB;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BioMentionListViewModel extends AssemListViewModel<BioMentionListState, C1582320rHK, Integer> {
    public static final int $stable = 8;
    public final List<C1582320rHK> bioMentionInfoList = new ArrayList();

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$fetchBioMentionInfoList$1, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel", f = "BioMentionListViewModel.kt", l = {57}, m = "fetchBioMentionInfoList")
    public final class AnonymousClass1 extends AbstractC23140094w {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("BioMentionListViewModel@4fbc.fetchBioMentionInfoList$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objFetchBioMentionInfoList = BioMentionListViewModel.this.fetchBioMentionInfoList(this);
            C1C7U.LIZIZ("BioMentionListViewModel@4fbc.fetchBioMentionInfoList$1");
            return objFetchBioMentionInfoList;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$onRefresh$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel", f = "BioMentionListViewModel.kt", l = {43}, m = "onRefresh")
    public final class C2325641 extends AbstractC23140094w {
        public int label;
        public /* synthetic */ Object result;

        public C2325641(InterfaceC1364105Vn<? super C2325641> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("BioMentionListViewModel@4fbc.onRefresh$1");
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnRefresh = BioMentionListViewModel.this.onRefresh(this);
            C1C7U.LIZIZ("BioMentionListViewModel@4fbc.onRefresh$1");
            return objOnRefresh;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public BioMentionListState defaultState() {
        return new BioMentionListState(new C627660Ojc(null, null, null, null, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchBioMentionInfoList(X.InterfaceC1364105Vn<? super java.util.List<X.C1582320rHK>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel.AnonymousClass1
            if (r0 == 0) goto L20
            r4 = r6
            com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$fetchBioMentionInfoList$1 r4 = (com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$fetchBioMentionInfoList$1 r4 = new com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$fetchBioMentionInfoList$1
            r4.<init>(r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.11NZ r0 = X.C1909140zmS.LIZIZ()     // Catch: java.lang.Exception -> L79
            r4.label = r1     // Catch: java.lang.Exception -> L79
            java.lang.Object r3 = X.C11UD.LIZJ(r0, r4)     // Catch: java.lang.Exception -> L79
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L79
        L41:
            com.ss.android.ugc.aweme.notification.bean.BioMentionListResponse r3 = (com.ss.android.ugc.aweme.notification.bean.BioMentionListResponse) r3     // Catch: java.lang.Exception -> L79
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r3.users     // Catch: java.lang.Exception -> L79
            r0 = 571(0x23b, float:8.0E-43)
            kotlin.jvm.internal.AFwS240S0000000_9 r4 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)     // Catch: java.lang.Exception -> L79
            java.util.List<X.0rHK> r0 = r5.bioMentionInfoList     // Catch: java.lang.Exception -> L79
            r0.clear()     // Catch: java.lang.Exception -> L79
            java.util.List<X.0rHK> r3 = r5.bioMentionInfoList     // Catch: java.lang.Exception -> L79
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L79
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> L79
            r2.<init>(r0)     // Catch: java.lang.Exception -> L79
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L79
        L61:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L73
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r4.invoke(r0)     // Catch: java.lang.Exception -> L79
            r2.add(r0)     // Catch: java.lang.Exception -> L79
            goto L61
        L73:
            r3.addAll(r2)     // Catch: java.lang.Exception -> L79
            java.util.List<X.0rHK> r0 = r5.bioMentionInfoList     // Catch: java.lang.Exception -> L79
            return r0
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel.fetchBioMentionInfoList(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void newState(C627660Ojc<C1582320rHK> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 354));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel.C2325641
            if (r0 == 0) goto L42
            r4 = r6
            com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$onRefresh$1 r4 = (com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel.C2325641) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L53
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L48
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0ozb r1 = new X.0ozb
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L36:
            X.C155000ia.LIZIZ(r3)
            r4.label = r0
            java.lang.Object r3 = r5.fetchBioMentionInfoList(r4)
            if (r3 != r2) goto L22
            return r2
        L42:
            com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$onRefresh$1 r4 = new com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel$onRefresh$1
            r4.<init>(r6)
            goto L12
        L48:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r3)
            return r0
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.BioMentionListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<C1582320rHK> list = this.bioMentionInfoList;
        c317290CcB.getClass();
        return new C316640Cb8(list);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }
}
