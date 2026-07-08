package com.ss.android.ugc.aweme.music.fanspotlight.profilemusictab.detail.vm;

import X.AbstractC316870CbV;
import X.C050S;
import X.C0KBN;
import X.C1272604yS;
import X.C13BV;
import X.C15438062q;
import X.C2189821An6;
import X.C316640Cb8;
import X.C317290CcB;
import X.C325690Cpj;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FanSpotlightProfileDetailShareVM extends BaseDetailShareVM<C325690Cpj, InterfaceC1891350zJl, Integer> {
    public static final /* synthetic */ int LLIZ = 0;
    public volatile List<? extends Aweme> LLILZIL = C13BV.INSTANCE;
    public boolean LLILZLL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return i;
    }

    public final List<InterfaceC1891350zJl> BQ2() {
        List<? extends Aweme> list = this.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C050S(it2.next(), this.LLILZLL));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (this.LLILZLL && this.LLILZIL.size() < 5) {
            arrayList2.add(new C1272604yS(this.LLILZLL));
        }
        return arrayList2;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325690Cpj(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 91));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<InterfaceC1891350zJl> listBQ2 = BQ2();
        c317290CcB.getClass();
        return new C316640Cb8(listBQ2);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if ((interfaceC1891350zJl instanceof C050S) && Intrinsics.LJFF(((C050S) interfaceC1891350zJl).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C050S) {
            return ((C050S) interfaceC1891350zJl).LL;
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).intValue();
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        List<InterfaceC1891350zJl> listBQ2 = BQ2();
        c317290CcB.getClass();
        return new C316640Cb8(listBQ2);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0;
    }
}
