package com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm;

import X.AbstractC316870CbV;
import X.AnonymousClass0957;
import X.C01GW;
import X.C099G;
import X.C0QA6;
import X.C0QA9;
import X.C0QAD;
import X.C0QAF;
import X.C0QAG;
import X.C0QAI;
import X.C15438062q;
import X.C1829507En;
import X.C208100r9;
import X.C2097808Js;
import X.C2189821An6;
import X.C23250099c;
import X.C317290CcB;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import X.InterfaceC643670PMn;
import X.InterfaceC660330PvD;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVisualInspirationSharedVM extends BaseDetailShareVM<C0QA9, C208100r9, Integer> implements InterfaceC643670PMn {
    public static final C01GW<IAwemeService> LLIZLLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(340));
    public final List<C0QAF> LLILZIL = new ArrayList();
    public C099G LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        return 0;
    }

    public final AnonymousClass0957<C0QA6> EQ2() {
        C099G c099g = this.LLILZLL;
        if ((c099g != null && c099g.isActive()) || this.LLIZ) {
            return this.LLILZLL;
        }
        if (!LJIIJJI()) {
            return null;
        }
        this.LLIZ = true;
        C099G c099gLIZIZ = C23250099c.LIZIZ(getAssemVMScope(), null, null, new C0QAD(this, null), 3);
        this.LLILZLL = c099gLIZIZ;
        return c099gLIZIZ;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0QA9(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void BQ2() {
        Map<String, String> map = ((C0QA9) getState()).LLJ;
        List<Pair> listLJIL = C2097808Js.LJIL(((C0QA9) getState()).LLILZIL);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIL, 10));
        for (Pair pair : listLJIL) {
            Aweme aweme = (Aweme) pair.getSecond();
            String str = map.get("token_type");
            if (str != null) {
                AwemeExtKt.appendExtraParamUseInSearch(aweme, "token_type", str);
            }
            String str2 = map.get("inside_page_name");
            if (str2 != null) {
                AwemeExtKt.appendExtraParamUseInSearch(aweme, "inside_page_name", str2);
            }
            arrayList.add(new C208100r9((Aweme) pair.getSecond()));
        }
        this.vmDispatcher.getState();
        setStateImmediate(new AwS376S0200000_10(this, (SearchVisualInspirationSharedVM) arrayList, (List<C208100r9>) 133));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<ImageData> CQ2() {
        return ((C0QA9) getState()).LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void DQ2() {
        GQ2(C0QAG.LIZ(((C0QA9) getState()).LLIZLLLIL, 0, C1829507En.LIZ(), 7));
        EQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final boolean LJIIJJI() {
        return ((C0QA9) getState()).LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.C0PDP
    public final List<Aweme> getAwemeList() {
        return super.getAwemeList();
    }

    public final void FQ2(C0QAI c0qai) {
        ((ArrayList) this.LLILZIL).remove(c0qai);
    }

    public final void GQ2(C0QAG c0qag) {
        this.vmDispatcher.getState();
        setStateImmediate(new AwS589S0100000_10(c0qag, 331));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C208100r9> c627660Ojc) {
        setState(new AwS589S0100000_10(c627660Ojc, (C627660Ojc<InterfaceC660330PvD>) 329));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, null, null, 7);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C208100r9) interfaceC1891350zJl).LL;
    }

    @Override // X.InterfaceC643670PMn
    public final boolean j9(int i, Aweme aweme) {
        String aid;
        Iterator it2 = ((ArrayList) super.getAwemeList()).iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                String aid2 = ((Aweme) it2.next()).getAid();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid2, aid)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < i - 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r10) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).intValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>) interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Integer.valueOf(zQ2((InterfaceC636340Oxc) getState()).size());
    }
}
