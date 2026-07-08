package com.ss.android.ugc.aweme.topic.book.favorite.viewmodel;

import X.AbstractC316870CbV;
import X.C09YA;
import X.C0KBN;
import X.C0OAT;
import X.C325670Cph;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class BookCollectionListViewModel extends AssemListViewModel<C325670Cph, C0OAT, Long> {
    public final C09YA LL = new C09YA(this, AFwS190S0000000_4.get$arr$(2120));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325670Cph(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C0OAT> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 148));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r14, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r16) {
        /*
            r13 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C326030CqH
            if (r0 == 0) goto L22
            r3 = r4
            X.0CqH r3 = (X.C326030CqH) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r5 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            goto L4a
        L22:
            X.0CqH r3 = new X.0CqH
            r3.<init>(r13, r4)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r5)
            X.09YA r0 = r13.LL     // Catch: java.lang.Exception -> La6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La6
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Exception -> La6
            X.00hg r0 = r0.getOperator()     // Catch: java.lang.Exception -> La6
            X.0CqI r0 = (X.InterfaceC326040CqI) r0     // Catch: java.lang.Exception -> La6
            r3.LLILLL = r4     // Catch: java.lang.Exception -> La6
            java.lang.Object r5 = r0.LLFII(r14, r3)     // Catch: java.lang.Exception -> La6
            if (r5 != r1) goto L4d
            return r1
        L4a:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> La6
        L4d:
            com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListResponse r5 = (com.ss.android.ugc.aweme.topic.book.favorite.api.BookCollectionListResponse) r5     // Catch: java.lang.Exception -> La6
            java.util.List<com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo> r1 = r5.bookList     // Catch: java.lang.Exception -> La6
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> La6
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> La6
            r3.<init>(r0)     // Catch: java.lang.Exception -> La6
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> La6
        L60:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La6
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r1 = (com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo) r1     // Catch: java.lang.Exception -> La6
            X.0OAT r6 = new X.0OAT     // Catch: java.lang.Exception -> La6
            X.0O4X r0 = X.C0O4X.BOOK     // Catch: java.lang.Exception -> La6
            int r0 = r0.getType()     // Catch: java.lang.Exception -> La6
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> La6
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r7 = com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo.LIZ(r1, r0)     // Catch: java.lang.Exception -> La6
            r8 = 0
            r12 = 30
            r9 = r8
            r10 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> La6
            r3.add(r6)     // Catch: java.lang.Exception -> La6
            goto L60
        L89:
            boolean r0 = r5.hasMore     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L9b
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> La6
            long r0 = r5.cursor     // Catch: java.lang.Exception -> La6
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> La6
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r3, r4)     // Catch: java.lang.Exception -> La6
            return r0
        L9b:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> La6
            r0.getClass()     // Catch: java.lang.Exception -> La6
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> La6
            r0.<init>(r3)     // Catch: java.lang.Exception -> La6
            return r0
        La6:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
