package com.ss.android.ugc.aweme.im.actionbar.viewmodel;

import X.AbstractC898100ZLc;
import X.AnonymousClass0951;
import X.C08CX;
import X.C09IC;
import X.C09IR;
import X.C0I0B;
import X.C0PEM;
import X.C0ZLW;
import X.C0ZLX;
import X.C1559260qg8;
import X.C1730606q8;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2296808zG;
import X.C23250099c;
import X.C296660Bk0;
import X.C723600SZy;
import X.C892330YzX;
import X.C892340YzY;
import X.C892350YzZ;
import X.C898090ZLb;
import X.C914160Zte;
import X.InterfaceC0148002o;
import X.InterfaceC901690ZYx;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarViewModelImpl extends ActionBarViewModel {
    public final Map<String, Boolean> LL = new LinkedHashMap();
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C892350YzZ.class, null), true);
    public final C08CX LLILLL = C08CX.INSTANCE;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C2252331DDr LLJ;
    public final C2252321DDq LLJI;
    public final AnonymousClass0951 LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(3);
    }

    public ActionBarViewModelImpl() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new AbstractC898100ZLc() { // from class: X.0ZLa
        });
        this.LLILZ = c2252321DDqLIZ;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C0ZLW(0));
        this.LLILZLL = c2252321DDqLIZ2;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = c2252331DDrLIZIZ;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(new C0ZLX(null));
        this.LLJI = c2252321DDqLIZ3;
        this.LLJIJIL = C09IC.LIZIZ(c2252321DDqLIZ3);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final void zQ2() {
        if (C296660Bk0.LIZ()) {
            IMUserPortraitApi.LIZ.getClass();
            C1730606q8.LIZ().LJ().LJIIL(((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final AnonymousClass0951 vQ2() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final AnonymousClass0951 wQ2() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final AnonymousClass0951 xQ2() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final C2252331DDr yQ2() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final void CQ2(boolean z) {
        this.LLJI.setValue(new C0ZLX(Boolean.valueOf(z)));
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final void LLJ(int i) {
        this.LLIZLLLIL.LIZJ(0);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final void setItems(List<? extends InterfaceC901690ZYx> list) {
        this.LLILZ.setValue(new C898090ZLb(list));
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final void AQ2(InterfaceC901690ZYx interfaceC901690ZYx, int i) {
        C892350YzZ c892350YzZ = (C892350YzZ) this.LLILLJJLI.getValue();
        if (c892350YzZ == null) {
            return;
        }
        String strLLILLIZIL = interfaceC901690ZYx.LLILLIZIL();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C892330YzX(interfaceC901690ZYx.LLIILII(), c892350YzZ, strLLILLIZIL, i, C0I0B.LJFF.LIZIZ(), null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel
    public final void BQ2(InterfaceC901690ZYx interfaceC901690ZYx, int i) {
        C892350YzZ c892350YzZ;
        if (this.LLILLL.contains(interfaceC901690ZYx) || (c892350YzZ = (C892350YzZ) this.LLILLJJLI.getValue()) == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C892340YzY(interfaceC901690ZYx.LLIILII(), c892350YzZ, interfaceC901690ZYx.LLILLIZIL(), i, C0I0B.LJFF.LIZIZ(), null), 3);
        this.LLILLL.contains(interfaceC901690ZYx);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    @Override // X.InterfaceC456500HvE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void MA1(X.C908520ZkY r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl.MA1(X.0ZkY, boolean):void");
    }
}
