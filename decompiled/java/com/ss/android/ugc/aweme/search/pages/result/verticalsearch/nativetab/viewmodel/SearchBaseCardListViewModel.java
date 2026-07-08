package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0PCY;
import X.C0PRC;
import X.C0PZD;
import X.C0Q3E;
import X.C0Q9W;
import X.C0Q9X;
import X.C0XF1;
import X.C13BV;
import X.C1559260qg8;
import X.C1AF0;
import X.C2286608xc;
import X.C316640Cb8;
import X.C317290CcB;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC660330PvD;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.fragment.SearchTabFragment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchBaseCardListViewModel extends AssemListViewModel<C0Q9X, InterfaceC1891350zJl, Long> {
    public C0PZD LL;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLILLJJLI = "";
    public C13BV LLILZIL = C13BV.INSTANCE;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(341));

    public abstract C0Q9W vQ2();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0Q9X(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL = false;
        this.LLILZIL = C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS589S0100000_10(c627660Ojc, (C627660Ojc<InterfaceC660330PvD>) 348));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        Integer numLJ;
        SearchTabFragment searchTabFragment;
        SearchResultParam searchResultParam;
        SearchTabFragment searchTabFragment2;
        ISearchContextAbility iSearchContextAbilityLIZIZ;
        C0PCY<C0PRC> c0pcyPh1;
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            setState(AFwS241S0000000_10.get$arr$(464));
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            c317290CcB.getClass();
            return new C316640Cb8(c13bv);
        }
        this.LL = (C0PZD) new C1559260qg8(new C723600SZy(this, C0PZD.class, "search_fragment_data_key"), true).getValue();
        vQ2();
        C0PZD c0pzd = this.LL;
        if (c0pzd != null && (searchTabFragment2 = c0pzd.LLILLL) != null && (iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(searchTabFragment2)) != null && (c0pcyPh1 = iSearchContextAbilityLIZIZ.Ph1()) != null) {
            c0pcyPh1.LIZJ();
        }
        setState(AFwS241S0000000_10.get$arr$(465));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("state", "requestParam is null");
        linkedHashMap.put("isInitDataRequestParamKeyword", "null");
        linkedHashMap.put("isInitDataStatus", "null");
        C0PZD c0pzd2 = this.LL;
        String keyword = null;
        if (c0pzd2 != null) {
            numLJ = C2286608xc.LJ(c0pzd2.hashCode());
        } else {
            numLJ = null;
        }
        linkedHashMap.put("tabFragmentDataStatus", String.valueOf(numLJ));
        C0PZD c0pzd3 = this.LL;
        if (c0pzd3 != null && (searchTabFragment = c0pzd3.LLILLL) != null && (searchResultParam = searchTabFragment.LLJIJIL) != null) {
            keyword = searchResultParam.getKeyword();
        }
        linkedHashMap.put("fragmentKeyword", String.valueOf(keyword));
        C1AF0.LIZLLL("Search list request param null", linkedHashMap);
        C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
        C13BV c13bv2 = C13BV.INSTANCE;
        c317290CcB2.getClass();
        return new C316640Cb8(c13bv2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object wQ2(com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel.SearchBaseCardListViewModel r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0Q9V
            if (r0 == 0) goto L26
            r5 = r7
            X.0Q9V r5 = (X.C0Q9V) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILLL
            r1 = 1
            if (r2 == 0) goto L34
            if (r2 == r1) goto L5a
            r0 = 2
            if (r2 != r0) goto L2c
            X.C155000ia.LIZIZ(r4)
            return r4
        L26:
            X.0Q9V r5 = new X.0Q9V
            r5.<init>(r6, r7)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r4)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r0 = X.C0XF1.LIZLLL(r0)
            if (r0 != 0) goto L6d
            r0 = 463(0x1cf, float:6.49E-43)
            kotlin.jvm.internal.AFwS241S0000000_10 r0 = kotlin.jvm.internal.AFwS241S0000000_10.get$arr$(r0)
            r6.setState(r0)
            r5.LLILLL = r1
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r3) goto L5d
            return r3
        L5a:
            X.C155000ia.LIZIZ(r4)
        L5d:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        L6d:
            X.0PZD r0 = r6.LL
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.fragment.SearchTabFragment r0 = r0.LLILLL
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = X.C0Q3E.LIZIZ(r0)
            if (r0 == 0) goto L84
            X.0PCY r0 = r0.Ph1()
            if (r0 == 0) goto L84
            r0.LIZJ()
        L84:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.13BV r1 = X.C13BV.INSTANCE
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel.SearchBaseCardListViewModel.wQ2(com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.viewmodel.SearchBaseCardListViewModel, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        l.longValue();
        return wQ2(this, interfaceC1364105Vn);
    }
}
