package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.vm;

import X.AbstractC316870CbV;
import X.C2189821An6;
import X.C627660Ojc;
import X.C660320PvC;
import X.C674800QdS;
import X.C675050Qdr;
import X.C675340QeK;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC660330PvD;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoVerticalViewModel extends BaseDetailShareVM<C675340QeK, InterfaceC660330PvD, C675050Qdr> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public C675050Qdr LLILZIL;
    public C674800QdS LLILZLL;
    public SearchResultParam LLIZ;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 122;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C675340QeK(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC660330PvD> c627660Ojc) {
        setState(new AwS589S0100000_10(c627660Ojc, (C627660Ojc<InterfaceC660330PvD>) 71));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C675050Qdr>> interfaceC1364105Vn) {
        return BQ2(new C675050Qdr(0), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        C660320PvC c660320PvC;
        Aweme aweme;
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC660330PvD interfaceC660330PvD = (InterfaceC660330PvD) it2.next();
                String aid = null;
                if ((interfaceC660330PvD instanceof C660320PvC) && (c660320PvC = (C660320PvC) interfaceC660330PvD) != null && (aweme = c660320PvC.LLILLJJLI) != null) {
                    aid = aweme.getAid();
                }
                if (Intrinsics.LJFF(aid, str)) {
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
        C660320PvC c660320PvC;
        InterfaceC660330PvD interfaceC660330PvD = (InterfaceC660330PvD) interfaceC1891350zJl;
        if (!(interfaceC660330PvD instanceof C660320PvC) || (c660320PvC = (C660320PvC) interfaceC660330PvD) == null) {
            return null;
        }
        return c660320PvC.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020c A[Catch: Exception -> 0x0232, TryCatch #1 {Exception -> 0x0232, blocks: (B:39:0x00b3, B:41:0x00b9, B:60:0x00e2, B:61:0x00e7, B:64:0x00f6, B:66:0x0104, B:68:0x010a, B:70:0x0112, B:78:0x0125, B:80:0x012b, B:81:0x012e, B:84:0x0135, B:86:0x0144, B:88:0x0148, B:89:0x0158, B:91:0x015e, B:93:0x0166, B:97:0x0171, B:101:0x017a, B:103:0x0186, B:104:0x018a, B:106:0x0190, B:107:0x0194, B:111:0x01a9, B:112:0x01ac, B:114:0x01af, B:116:0x01b5, B:118:0x01de, B:120:0x01f1, B:122:0x0201, B:113:0x01ad, B:124:0x020c, B:58:0x00d7, B:16:0x0042, B:18:0x0046, B:20:0x0058, B:25:0x0068, B:27:0x0088, B:33:0x0092, B:35:0x0096, B:36:0x009f, B:23:0x0062, B:21:0x005a), top: B:133:0x0042, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6 A[Catch: Exception -> 0x0232, TRY_ENTER, TryCatch #1 {Exception -> 0x0232, blocks: (B:39:0x00b3, B:41:0x00b9, B:60:0x00e2, B:61:0x00e7, B:64:0x00f6, B:66:0x0104, B:68:0x010a, B:70:0x0112, B:78:0x0125, B:80:0x012b, B:81:0x012e, B:84:0x0135, B:86:0x0144, B:88:0x0148, B:89:0x0158, B:91:0x015e, B:93:0x0166, B:97:0x0171, B:101:0x017a, B:103:0x0186, B:104:0x018a, B:106:0x0190, B:107:0x0194, B:111:0x01a9, B:112:0x01ac, B:114:0x01af, B:116:0x01b5, B:118:0x01de, B:120:0x01f1, B:122:0x0201, B:113:0x01ad, B:124:0x020c, B:58:0x00d7, B:16:0x0042, B:18:0x0046, B:20:0x0058, B:25:0x0068, B:27:0x0088, B:33:0x0092, B:35:0x0096, B:36:0x009f, B:23:0x0062, B:21:0x005a), top: B:133:0x0042, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C675050Qdr r22, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C675050Qdr>> r23) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.vm.VideoVerticalViewModel.BQ2(X.0Qdr, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2((C675050Qdr) obj, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C675050Qdr yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C675050Qdr c675050Qdr = this.LLILZIL;
        if (c675050Qdr == null) {
            return new C675050Qdr(0);
        }
        return c675050Qdr;
    }
}
