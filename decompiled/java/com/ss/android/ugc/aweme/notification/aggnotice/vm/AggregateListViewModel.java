package com.ss.android.ugc.aweme.notification.aggnotice.vm;

import X.AbstractC1623806Xk;
import X.AbstractC316870CbV;
import X.C09R9;
import X.C0KBN;
import X.C1272504yR;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1623606Xi;
import X.C1844840y6k;
import X.C1900970zZH;
import X.C1902710zc5;
import X.C1910790zp7;
import X.C2097608Jq;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C323380Cm0;
import X.C325900Cq4;
import X.C491001vg;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AggTopInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AggTopItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxAggregateListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class AggregateListViewModel extends AssemListViewModel<C325900Cq4, InterfaceC1891350zJl, String> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1910790zp7.class));
    public Long LLILLJJLI;
    public Long LLILLL;
    public String LLILZ;
    public Integer LLILZIL;
    public Integer LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325900Cq4(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 94));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1910760zp4
            if (r0 == 0) goto L49
            r6 = r8
            X.0zp4 r6 = (X.C1910760zp4) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L4f
            X.C155000ia.LIZIZ(r1)
        L22:
            X.06Xk r1 = (X.AbstractC1623806Xk) r1
            r0 = 0
            X.0CbV r0 = r7.wQ2(r1, r0)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.09R9 r0 = r7.LL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r3 = r0.getOperator()
            X.0OcH r3 = (X.InterfaceC623110OcH) r3
            java.lang.Long r2 = r7.LLILLJJLI
            java.lang.Long r1 = r7.LLILLL
            r6.LLILLL = r4
            r0 = 0
            java.lang.Object r1 = r3.LLJILJIL(r2, r1, r0, r6)
            if (r1 != r5) goto L22
            return r5
        L49:
            X.0zp4 r6 = new X.0zp4
            r6.<init>(r7, r8)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final List<InterfaceC1891350zJl> vQ2(InboxAggregateListResponse inboxAggregateListResponse, boolean z) {
        ?? arrayList;
        String string;
        String string2;
        AggTopInfo aggTopInfo;
        Integer num;
        AggTopInfo aggTopInfo2;
        List<AggTopItem> list;
        AggTopItem aggTopItem;
        String string3;
        String string4;
        ArrayList arrayList2 = new ArrayList();
        int i = 3;
        if (!z && (aggTopInfo = inboxAggregateListResponse.getAggTopInfo()) != null && (num = aggTopInfo.topShowType) != null && num.intValue() == 2 && (aggTopInfo2 = inboxAggregateListResponse.getAggTopInfo()) != null && (list = aggTopInfo2.aggTopItem) != null && (aggTopItem = (AggTopItem) C13LP.LJJJLL(list)) != null) {
            AggTopItem aggTopItemCopy = aggTopItem.copy(aggTopItem.imageUrl, aggTopItem.topSchemaUrl, aggTopItem.topText);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("account_type", this.LLILZ);
            Integer num2 = this.LLILZIL;
            if (num2 != null) {
                string3 = num2.toString();
            } else {
                string3 = null;
            }
            pairArr[1] = new Pair("inner_item_num", string3);
            Integer num3 = this.LLILZLL;
            if (num3 != null) {
                string4 = num3.toString();
            } else {
                string4 = null;
            }
            pairArr[2] = new Pair("from_inner_user_num", string4);
            arrayList2.add(new C1844840y6k(aggTopItemCopy, C2097608Jq.LJI(pairArr)));
        }
        List<MusNotice> items = inboxAggregateListResponse.getItems();
        if (items != null) {
            arrayList = new ArrayList();
            for (MusNotice musNotice : items) {
                if (musNotice != null) {
                    String strLIZIZ = C1902710zc5.LIZIZ(musNotice.timeLineType);
                    C13BV c13bv = C13BV.INSTANCE;
                    AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(160);
                    AFwS271S0000000_28 aFwS271S0000000_282 = AFwS271S0000000_28.get$arr$(161);
                    Pair[] pairArr2 = new Pair[i];
                    pairArr2[0] = new Pair("account_type", this.LLILZ);
                    Integer num4 = this.LLILZIL;
                    if (num4 != null) {
                        string = num4.toString();
                    } else {
                        string = null;
                    }
                    pairArr2[1] = new Pair("inner_item_num", string);
                    Integer num5 = this.LLILZLL;
                    if (num5 != null) {
                        string2 = num5.toString();
                    } else {
                        string2 = null;
                    }
                    pairArr2[2] = new Pair("from_inner_user_num", string2);
                    arrayList.add(new C1900970zZH(musNotice, strLIZIZ, null, true, c13bv, false, null, aFwS271S0000000_28, aFwS271S0000000_282, null, C2097608Jq.LJIIIIZZ(pairArr2), 10176));
                }
                i = 3;
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        arrayList2.addAll(arrayList);
        String endListDescription = inboxAggregateListResponse.getEndListDescription();
        if (endListDescription != null) {
            arrayList2.add(new C1272504yR(endListDescription));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC316870CbV<String> wQ2(AbstractC1623806Xk<InboxAggregateListResponse> abstractC1623806Xk, boolean z) {
        Exception exc;
        if (abstractC1623806Xk instanceof C1623606Xi) {
            InboxAggregateListResponse inboxAggregateListResponse = (InboxAggregateListResponse) ((C1623606Xi) abstractC1623806Xk).LIZ;
            if (Intrinsics.LJFF(inboxAggregateListResponse.getHasMore(), Boolean.TRUE)) {
                return new C323380Cm0(null, inboxAggregateListResponse.getCursor(), vQ2(inboxAggregateListResponse, z));
            }
            return new C316640Cb8(vQ2(inboxAggregateListResponse, z));
        }
        if (abstractC1623806Xk instanceof C491001vg) {
            Throwable th = ((C491001vg) abstractC1623806Xk).LIZ;
            if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
                exc = new Exception() { // from class: X.0zpA
                    public static final int $stable = 8;
                };
            }
            return new C316650Cb9(exc);
        }
        return new C316650Cb9(new Exception() { // from class: X.0zpA
            public static final int $stable = 8;
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: xQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r7, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1910770zp5
            if (r0 == 0) goto L47
            r5 = r8
            X.0zp5 r5 = (X.C1910770zp5) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L4d
            X.C155000ia.LIZIZ(r1)
        L22:
            X.06Xk r1 = (X.AbstractC1623806Xk) r1
            X.0CbV r0 = r6.wQ2(r1, r3)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            X.09R9 r0 = r6.LL
            java.lang.Object r0 = r0.getValue()
            X.0SvR r0 = (X.InterfaceC736910SvR) r0
            X.00hg r2 = r0.getOperator()
            X.0OcH r2 = (X.InterfaceC623110OcH) r2
            java.lang.Long r1 = r6.LLILLJJLI
            java.lang.Long r0 = r6.LLILLL
            r5.LLILLL = r3
            java.lang.Object r1 = r2.LLJILJIL(r1, r0, r7, r5)
            if (r1 != r4) goto L22
            return r4
        L47:
            X.0zp5 r5 = new X.0zp5
            r5.<init>(r6, r8)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
    }
}
