package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel;

import X.AbstractC316870CbV;
import X.C597640NcI;
import X.C608170NtH;
import X.C612590O0z;
import X.C623470Ocr;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCellItem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightsListViewModel extends AssemListViewModel<C612590O0z, InterfaceC1891350zJl, Integer> {
    public boolean LLILZIL;
    public Integer LLILZLL;
    public boolean LLJ;
    public HighlightCellItem LLJI;
    public long LLJIJIL;
    public boolean LLJILJILJ;
    public ECGuidanceCard LLJILLL;
    public final C597640NcI LL = new C597640NcI();
    public String LLILLJJLI = CardStruct.IStatusCode.DEFAULT;
    public String LLILLL = "";
    public String LLILZ = "";
    public final HashSet<String> LLIZ = new HashSet<>();
    public final HashSet<String> LLIZLLLIL = new HashSet<>();
    public final HashSet<Integer> LLJILJIL = new HashSet<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612590O0z(0);
    }

    public static boolean wQ2(List list) {
        boolean z;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (it2.next() instanceof HighlightCard) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return !z;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 243));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C608120NtC
            if (r0 == 0) goto L86
            r5 = r8
            X.0NtC r5 = (X.C608120NtC) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r3 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L6e
            if (r0 != r2) goto L8c
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            java.lang.String r6 = r7.LLILLJJLI
            java.lang.String r5 = r7.LLILLL
            boolean r4 = wQ2(r3)
            boolean r2 = r7.LLILZIL
            boolean r1 = r7.LLJILJILJ
            java.lang.String r0 = r7.LLILZ
            java.util.Map r2 = X.C608170NtH.LIZIZ(r6, r5, r0, r4, r2)
            if (r1 == 0) goto L6b
            java.lang.String r1 = "1"
        L3a:
            java.lang.String r0 = "is_auto_post"
            r2.put(r0, r1)
            java.lang.String r0 = "livesdk_tiktokec_enter_page"
            X.C1421105hJ.LIZJ(r0, r2)
            kotlin.jvm.internal.AwS375S0200000_9 r1 = new kotlin.jvm.internal.AwS375S0200000_9
            r0 = 60
            r1.<init>(r7, r3, r0)
            r7.setState(r1)
            boolean r0 = wQ2(r3)
            if (r0 == 0) goto L5c
            X.0NtF r0 = new X.0NtF
            r0.<init>()
            r3.add(r0)
        L5c:
            X.0Cm0 r2 = new X.0Cm0
            int r0 = r3.size()
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            r0 = 0
            r2.<init>(r0, r1, r3)
            return r2
        L6b:
            java.lang.String r1 = "0"
            goto L3a
        L6e:
            X.C155000ia.LIZIZ(r3)
            r0 = 402(0x192, float:5.63E-43)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r7.setState(r0)
            java.lang.String r1 = r7.LLILLL
            r5.LLILLL = r2
            r0 = 0
            java.lang.Object r3 = r7.vQ2(r0, r1, r5)
            if (r3 != r4) goto L22
            return r4
        L86:
            X.0NtC r5 = new X.0NtC
            r5.<init>(r7, r8)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r10, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(int r17, java.lang.String r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel.vQ2(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void xQ2(String str, String str2, boolean z) {
        if (z) {
            if (str != null && !this.LLIZLLLIL.contains(str)) {
                C608170NtH.LJ(this.LLILLJJLI, this.LLILLL, str2, true);
                return;
            }
            return;
        }
        if (str == null || this.LLIZ.contains(str)) {
            return;
        }
        C608170NtH.LJ(this.LLILLJJLI, this.LLILLL, str2, false);
    }

    public static void yQ2(HighlightsListViewModel highlightsListViewModel, String str, Long l, String str2, int i) {
        String str3 = str2;
        Long l2 = l;
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        highlightsListViewModel.getClass();
        C608170NtH.LJI(str, highlightsListViewModel.LLILLJJLI, highlightsListViewModel.LLILLL, l2, null, str3, 8);
    }
}
