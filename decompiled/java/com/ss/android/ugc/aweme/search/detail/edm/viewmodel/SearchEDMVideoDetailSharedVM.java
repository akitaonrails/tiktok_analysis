package com.ss.android.ugc.aweme.search.detail.edm.viewmodel;

import X.AbstractC329610Cw3;
import X.C0KBN;
import X.C209500rN;
import X.C2189821An6;
import X.C2217401BqU;
import X.C325940Cq8;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchEDMVideoDetailSharedVM extends BaseDetailShareVM<C325940Cq8, C209500rN, Long> {
    public long LLILZIL;
    public boolean LLILZLL = true;
    public String LLIZ = "";
    public Long LLIZLLLIL;
    public int LLJ;
    public C2189821An6 LLJI;

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean cannotLoadLatest() {
        return true;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325940Cq8(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null) {
            super.init(fragment);
            return true;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) new C2217401BqU(this) { // from class: X.0Cqo
            @Override // X.C2217401BqU, X.AbstractC2217341BqO, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AssemListViewModel) this.receiver).getConfig();
            }
        }.get());
        super.init(fragment);
        return true;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C209500rN> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 113));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM.onRefresh(X.05Vn):java.lang.Object");
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
                if (Intrinsics.LJFF(((C209500rN) it2.next()).LL.getAid(), str)) {
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
        return ((C209500rN) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(long r54, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r56) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM.BQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2(((Number) obj).longValue(), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        this.LLJI = c2189821An6;
        long jLongValue = Long.valueOf(this.LLILZIL).longValue();
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    manualListLoadMore(Long.valueOf(jLongValue));
                    return;
                }
                return;
            }
            manualListLoadLatest(Long.valueOf(jLongValue));
            return;
        }
        manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return Long.valueOf(this.LLILZIL);
    }
}
