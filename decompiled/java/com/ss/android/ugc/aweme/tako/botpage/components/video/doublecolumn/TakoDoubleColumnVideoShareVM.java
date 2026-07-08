package com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn;

import X.AbstractC316870CbV;
import X.C09YA;
import X.C0KBN;
import X.C1559260qg8;
import X.C2189821An6;
import X.C329460Cvo;
import X.C329470Cvp;
import X.C329510Cvt;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoDoubleColumnVideoShareVM extends BaseDetailShareVM<C329460Cvo, C329510Cvt, Integer> {
    public int LLILZIL;
    public final C1559260qg8 LLILZLL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C329470Cvp.class, (Class<Object>) null, (String) 13), true);
    public final C09YA LLIZ = new C09YA(this, AFwS190S0000000_4.get$arr$(2042));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 38;
    }

    public final C329470Cvp DQ2() {
        return (C329470Cvp) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C329460Cvo(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C329510Cvt> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 138));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return CQ2(0, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        String str2;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TakoVideoItem takoVideoItem = ((C329510Cvt) it2.next()).LLILLJJLI;
                if (takoVideoItem != null) {
                    str2 = takoVideoItem.awemeId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
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
        TakoVideoItem takoVideoItem = ((C329510Cvt) interfaceC1891350zJl).LLILLJJLI;
        if (takoVideoItem != null) {
            return takoVideoItem.LIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(java.util.List<com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem> r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM.BQ2(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127 A[Catch: Exception -> 0x0144, TryCatch #0 {Exception -> 0x0144, blocks: (B:58:0x011c, B:59:0x011f, B:61:0x0127, B:63:0x0132, B:32:0x00a2, B:33:0x00a5, B:34:0x00b3, B:36:0x00b9, B:38:0x00c1, B:40:0x00c5, B:46:0x00d3, B:48:0x00e6, B:49:0x00ea, B:52:0x0105, B:53:0x0108, B:54:0x0109, B:17:0x004d, B:19:0x006f, B:26:0x007d, B:29:0x0093, B:65:0x013d), top: B:70:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132 A[Catch: Exception -> 0x0144, TryCatch #0 {Exception -> 0x0144, blocks: (B:58:0x011c, B:59:0x011f, B:61:0x0127, B:63:0x0132, B:32:0x00a2, B:33:0x00a5, B:34:0x00b3, B:36:0x00b9, B:38:0x00c1, B:40:0x00c5, B:46:0x00d3, B:48:0x00e6, B:49:0x00ea, B:52:0x0105, B:53:0x0108, B:54:0x0109, B:17:0x004d, B:19:0x006f, B:26:0x007d, B:29:0x0093, B:65:0x013d), top: B:70:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(int r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r20) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM.CQ2(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return CQ2(((Number) obj).intValue(), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        int i3;
        if (i != 1 && i == 4) {
            i3 = this.LLILZIL;
        } else {
            i3 = 0;
        }
        return Integer.valueOf(i3);
    }
}
