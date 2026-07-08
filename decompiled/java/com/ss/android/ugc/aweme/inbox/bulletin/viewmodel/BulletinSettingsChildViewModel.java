package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC316870CbV;
import X.C09R9;
import X.C0KBN;
import X.C0ONJ;
import X.C13BV;
import X.C13LE;
import X.C1888220zEi;
import X.C191880104w;
import X.C316640Cb8;
import X.C317290CcB;
import X.C325660Cpg;
import X.C617180OIq;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC617160OIo;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingsChildViewModel extends AssemListViewModel<C325660Cpg, InterfaceC1891350zJl, String> {
    public static final /* synthetic */ int LLJJI = 0;
    public final InterfaceC617160OIo LL;
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C0ONJ.class));
    public final C1888220zEi LLILLL;
    public C617180OIq LLILZ;
    public Boolean LLILZIL;
    public Boolean LLILZLL;
    public Boolean LLIZ;
    public Boolean LLIZLLLIL;
    public Boolean LLJ;
    public Boolean LLJI;
    public Boolean LLJIJIL;
    public boolean LLJILJIL;
    public final PrivacySettingsRestrictionItem LLJILJILJ;
    public int LLJILLL;
    public final boolean LLJJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325660Cpg(0);
    }

    public BulletinSettingsChildViewModel(BulletinProfileViewModel bulletinProfileViewModel) {
        this.LL = bulletinProfileViewModel;
        C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
        this.LLILLL = c1888220zEi;
        this.LLJILJIL = c1888220zEi.LJFF();
        C191880104w.LIZ.getClass();
        this.LLJILJILJ = C191880104w.LJIIJJI(0, "filter_spam");
        this.LLJILLL = c1888220zEi.LJI();
        this.LLJJ = c1888220zEi.LJIIL();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 74));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0307  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r39) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinSettingsChildViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(String str, InterfaceC1364105Vn<? super AbstractC316870CbV<String>> interfaceC1364105Vn) {
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        c317290CcB.getClass();
        return new C316640Cb8(c13bv);
    }
}
