package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner;

import X.AbstractC316870CbV;
import X.C09R9;
import X.C0KBN;
import X.C1198470hID;
import X.C1198480hIE;
import X.C13LE;
import X.C207900r7;
import X.C2189821An6;
import X.C325990CqD;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCampaignSharedViewModel extends BaseDetailShareVM<C325990CqD, C207900r7, C1198480hIE> {
    public volatile String LLILZLL;
    public String LLILZIL = "";
    public final C09R9 LLIZ = new C09R9(this, C13LE.LIZ(C1198470hID.class));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 198;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325990CqD(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner.PoiCampaignSharedViewModel.BQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207900r7> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 99));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1198480hIE>> interfaceC1364105Vn) {
        this.LLILZLL = null;
        return BQ2(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        Iterator it2 = ((ArrayList) getAwemeList()).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), str)) {
                if (i >= 0) {
                    listRemoveItemAt(i);
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C207900r7) interfaceC1891350zJl).LL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return BQ2(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1198480hIE yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return new C1198480hIE();
    }
}
