package com.ss.android.ugc.aweme.topic.review.vm;

import X.AbstractC316870CbV;
import X.C0PEM;
import X.C20600815jK;
import X.C23250099c;
import X.C326290Cqh;
import X.C623470Ocr;
import X.C626700Oi4;
import X.C626750Oi9;
import X.C626770OiB;
import X.C626790OiD;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicReviewListVM extends AssemListViewModel<C326290Cqh, C626770OiB, Long> {
    public String LL = "";
    public int LLILLJJLI = 1;
    public final Map<String, String> LLILLL = new LinkedHashMap();
    public final C626790OiD LLILZ = new C626790OiD();
    public final C626700Oi4 LLILZIL = new C626700Oi4();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326290Cqh(new C627660Ojc(null, null, null, null, 15));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C626770OiB> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 408));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    public final void vQ2(C626770OiB c626770OiB) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(c626770OiB));
            int i = -1;
            if (numValueOf.intValue() != -1 && 1 != 0) {
                int iIntValue = numValueOf.intValue();
                TopicReview topicReview = c626770OiB.LL;
                int i2 = topicReview.diggCount;
                boolean z = topicReview.userDigged;
                if (!z) {
                    i = 1;
                }
                listSetItemAt(iIntValue, new C626770OiB(topicReview.copy(topicReview.topicId, topicReview.topicType, topicReview.reviewId, topicReview.topicRating, topicReview.text, i2 + i, !z, topicReview.updateTime, topicReview.user, topicReview.isMocked), c626770OiB.LLILLJJLI));
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C626750Oi9(c626770OiB, this, iIntValue, null), 2);
            }
        }
    }

    public final void wQ2(C626770OiB c626770OiB) {
        C20600815jK<ITEM> c20600815jK = this.state;
        if (c20600815jK != 0) {
            Integer numValueOf = Integer.valueOf(c20600815jK.LJIIIZ(c626770OiB));
            if (numValueOf.intValue() != -1) {
                listSetItemAt(numValueOf.intValue(), new C626770OiB(c626770OiB.LL, !c626770OiB.LLILLJJLI));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C626760OiA
            if (r0 == 0) goto L20
            r10 = r14
            X.0OiA r10 = (X.C626760OiA) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r6 = r10.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L45
        L20:
            X.0OiA r10 = new X.0OiA
            r10.<init>(r11, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r6)
            X.0Oi4 r0 = r11.LLILZIL     // Catch: java.lang.Exception -> L8e
            X.0Oi6 r4 = r0.LLILLJJLI     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = r11.LL     // Catch: java.lang.Exception -> L8e
            int r6 = r11.LLILLJJLI     // Catch: java.lang.Exception -> L8e
            r10.LLILLL = r3     // Catch: java.lang.Exception -> L8e
            r9 = 10
            r7 = r12
            java.lang.Object r6 = r4.LJLZ(r5, r6, r7, r9, r10)     // Catch: java.lang.Exception -> L8e
            if (r6 != r1) goto L48
            return r1
        L45:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L8e
        L48:
            com.ss.android.ugc.aweme.topic.review.model.TopicReviewListResp r6 = (com.ss.android.ugc.aweme.topic.review.model.TopicReviewListResp) r6     // Catch: java.lang.Exception -> L8e
            java.util.List<com.ss.android.ugc.aweme.topic.review.model.TopicReview> r1 = r6.reviewList     // Catch: java.lang.Exception -> L8e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8e
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)     // Catch: java.lang.Exception -> L8e
            r5.<init>(r0)     // Catch: java.lang.Exception -> L8e
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Exception -> L8e
        L5b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L71
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L8e
            com.ss.android.ugc.aweme.topic.review.model.TopicReview r2 = (com.ss.android.ugc.aweme.topic.review.model.TopicReview) r2     // Catch: java.lang.Exception -> L8e
            X.0OiB r1 = new X.0OiB     // Catch: java.lang.Exception -> L8e
            r0 = 0
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L8e
            r5.add(r1)     // Catch: java.lang.Exception -> L8e
            goto L5b
        L71:
            boolean r0 = r6.hasMore     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L83
            X.0CcB r2 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L8e
            long r0 = r6.cursor     // Catch: java.lang.Exception -> L8e
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L8e
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r2, r0, r1, r5, r3)     // Catch: java.lang.Exception -> L8e
            return r0
        L83:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L8e
            r0.getClass()     // Catch: java.lang.Exception -> L8e
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L8e
            r0.<init>(r5)     // Catch: java.lang.Exception -> L8e
            return r0
        L8e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
