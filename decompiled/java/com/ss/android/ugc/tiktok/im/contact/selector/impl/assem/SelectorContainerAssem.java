package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C08CX;
import X.C09R3;
import X.C0QSJ;
import X.C1223620hwm;
import X.C1223990hxN;
import X.C1224240hxm;
import X.C1224280hxq;
import X.C1224440hy6;
import X.C127G;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19MB;
import X.C2217381BqS;
import X.C452501pT;
import X.C5183020f;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1076400e7K;
import X.InterfaceC1146704e9;
import X.InterfaceC1223330hwJ;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224310hxt;
import X.InterfaceC1224320hxu;
import X.InterfaceC1224360hxy;
import X.InterfaceC1224370hxz;
import X.InterfaceC1224750hyb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS393S0100000_19;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorConfirmWidgetVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContentPageContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorLoadingVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorNavBarVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchBarVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSelectedListVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorStatusVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorContainerAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C01GW LLIZLLLIL = C1223620hwm.LIZLLL(this);
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C127G LLJJJ;

    public SelectorContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorStatusVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2592), AFwS257S0000000_19.get$arr$(509), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorSearchPageVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2593), AFwS257S0000000_19.get$arr$(510), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SelectorContainerVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ3, 2594), AFwS257S0000000_19.get$arr$(511), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(SelectorSearchBarVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ4, 2595), AFwS257S0000000_19.get$arr$(512), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(SelectorSelectedListVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ5, 2596), AFwS257S0000000_19.get$arr$(504), null, true);
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(SelectorConfirmWidgetVM.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ6, 2588), AFwS257S0000000_19.get$arr$(505), null, true);
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(SelectorContentPageContainerVM.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ7), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ7, 2589), AFwS257S0000000_19.get$arr$(506), null, true);
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(SelectorLoadingVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ8), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ8, 2590), AFwS257S0000000_19.get$arr$(507), null, true);
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(SelectorNavBarVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ9), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ9, 2591), AFwS257S0000000_19.get$arr$(508), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2587));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2586));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2585));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ContactSelectorFragmentScope.class});
        c0qsjLIZIZ.unbindAbility(Lo(), InterfaceC1224360hxy.class);
        c0qsjLIZIZ.unbindAbility(No(), InterfaceC1076400e7K.class);
        c0qsjLIZIZ.unbindAbility(No(), InterfaceC1224750hyb.class);
        c0qsjLIZIZ.unbindAbility(Ho(), InterfaceC1224160hxe.class);
        c0qsjLIZIZ.unbindAbility(Oo(), InterfaceC1224370hxz.class);
        c0qsjLIZIZ.unbindAbility(So(), InterfaceC1224310hxt.class);
        c0qsjLIZIZ.unbindAbility(Vo(), InterfaceC1224320hxu.class);
        c0qsjLIZIZ.unbindAbility(Zo(), InterfaceC1223330hwJ.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ContactSelectorFragmentScope.class});
        c0qsjLIZIZ.bindAbility(Lo(), InterfaceC1224360hxy.class);
        c0qsjLIZIZ.bindAbility(No(), InterfaceC1076400e7K.class);
        c0qsjLIZIZ.bindAbility(No(), InterfaceC1224750hyb.class);
        c0qsjLIZIZ.bindAbility(Ho(), InterfaceC1224160hxe.class);
        c0qsjLIZIZ.bindAbility(Oo(), InterfaceC1224370hxz.class);
        c0qsjLIZIZ.bindAbility(So(), InterfaceC1224310hxt.class);
        c0qsjLIZIZ.bindAbility(Vo(), InterfaceC1224320hxu.class);
        c0qsjLIZIZ.bindAbility(Zo(), InterfaceC1223330hwJ.class);
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorContainerAssem.class, "selectorStatusVM", "getSelectorStatusVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorStatusVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorContainerAssem.class, "selectorSearchPageVM", "getSelectorSearchPageVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSearchPageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SelectorContainerAssem.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SelectorContainerAssem.class, "selectorSearchBarVM", "getSelectorSearchBarVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSearchBarVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(SelectorContainerAssem.class, "selectorSelectedListVM", "getSelectorSelectedListVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSelectedListVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(SelectorContainerAssem.class, "selectorConfirmWidgetVM", "getSelectorConfirmWidgetVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorConfirmWidgetVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(SelectorContainerAssem.class, "contentPageContainerVM", "getContentPageContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContentPageContainerVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(SelectorContainerAssem.class, "selectorLoadingVM", "getSelectorLoadingVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorLoadingVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(SelectorContainerAssem.class, "selectorNavBarVM", "getSelectorNavBarVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorNavBarVM;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    public final SelectorContentPageContainerVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorContentPageContainerVM) assemVMLazy.getValue();
    }

    public final C1224280hxq Jo() {
        return (C1224280hxq) this.LLIZLLLIL.getValue();
    }

    public final SelectorConfirmWidgetVM Lo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorConfirmWidgetVM) assemVMLazy.getValue();
    }

    public final SelectorContainerVM No() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorContainerVM) assemVMLazy.getValue();
    }

    public final SelectorSearchBarVM Oo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorSearchBarVM) assemVMLazy.getValue();
    }

    public final SelectorSearchPageVM So() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorSearchPageVM) assemVMLazy.getValue();
    }

    public final SelectorSelectedListVM Vo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorSelectedListVM) assemVMLazy.getValue();
    }

    public final SelectorStatusVM Zo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SelectorStatusVM) assemVMLazy.getValue();
    }

    public final boolean ap() {
        return Jo().LJIIIZ().LIZ();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorSearchPageVM.class, new AObjectS393S0100000_19(this, 13), SelectorContainerVM.class, new AObjectS393S0100000_19(this, 11), SelectorContentPageContainerVM.class, new AObjectS393S0100000_19(this, 12)}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        SelectorContainerVM selectorContainerVMNo = No();
        selectorContainerVMNo.LLJ = false;
        selectorContainerVMNo.setState(new AwS598S0100000_19(selectorContainerVMNo, 647));
        Ho().vQ2();
        SelectorConfirmWidgetVM selectorConfirmWidgetVMLo = Lo();
        selectorConfirmWidgetVMLo.setState(new AwS598S0100000_19(selectorConfirmWidgetVMLo, 642));
        SelectorSearchPageVM selectorSearchPageVMSo = So();
        selectorSearchPageVMSo.setState(new AwS598S0100000_19(selectorSearchPageVMSo, 644));
        Ho().vQ2();
        SelectorSelectedListVM selectorSelectedListVMVo = Vo();
        selectorSelectedListVMVo.LLILLJJLI = C08CX.INSTANCE;
        selectorSelectedListVMVo.setState(new AwS597S0100000_18(selectorSelectedListVMVo, StrategyCenter.ENABLE_SMART_SERVICE));
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        SelectorNavBarVM selectorNavBarVM = (SelectorNavBarVM) assemVMLazy.getValue();
        selectorNavBarVM.setState(new AwS582S0100000_3(selectorNavBarVM, 113));
        SelectorSearchBarVM selectorSearchBarVMOo = Oo();
        selectorSearchBarVMOo.setState(new AwS598S0100000_19(selectorSearchBarVMOo, 649));
        SelectorLoadingVM selectorLoadingVM = (SelectorLoadingVM) this.LLJJI.getValue();
        selectorLoadingVM.setState(new C5183020f(selectorLoadingVM, 201));
    }

    public final void Go(boolean z) {
        ConstraintLayout constraintLayout;
        boolean z2;
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) viewLJJIJL) != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            if (z && !ap()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c19mb.LJIIIIZZ(R.id.un_, 4, R.id.un9, 3);
                c19mb.LJIIIIZZ(R.id.uno, 4, R.id.un9, 3);
            } else {
                c19mb.LJIIIIZZ(R.id.un_, 4, 0, 4);
                c19mb.LJIIIIZZ(R.id.uno, 4, 0, 4);
            }
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void bp(boolean z) {
        int i;
        ((RecyclerView) this.LLJJIJIL.getValue()).stopScroll();
        SelectorContainerVM selectorContainerVMNo = No();
        C1224240hxm c1224240hxm = selectorContainerVMNo.LLIZLLLIL;
        if (c1224240hxm != null) {
            c1224240hxm.LIZLLL(selectorContainerVMNo.getState().LLILLJJLI);
        }
        View view = (View) this.LLJJIJI.getValue();
        int i2 = 0;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = (View) this.LLJJIJIIJIL.getValue();
        if (view2 != null) {
            if (!(!z)) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Exception {
        super.onViewCreated(view);
        Zo();
        Oo();
        Vo();
        Lo();
        Ho();
        So();
        No();
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        assemVMLazy.getValue();
        this.LLJJIII.getValue();
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.06Id
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C234300vN) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 210), 4);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0hxO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1224060hxU) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 212), 4);
        C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0hxQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1224060hxU) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 214), 4);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hxL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223910hxF) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 216), 4);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.0hxJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223910hxF) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 202), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0hwf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223570hwh) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 204), 4);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0hoj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218620hoi) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 206), 4);
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0hwi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223570hwh) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 208), 4);
        C723850SaN.LIZLLL(this, new AwS385S0200000_19(this, Jo().getProtocol(), 80));
        C1223990hxN c1223990hxNLJFF = Jo().LJFF();
        C1224440hy6 c1224440hy6LJIILIIL = c1223990hxNLJFF.LIZ.LJIILIIL();
        Integer numLJIIIIZZ = c1224440hy6LJIILIIL.LJIIIIZZ();
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 0 && !c1224440hy6LJIILIIL.LJIIIZ() && (c1223990hxNLJFF.LIZ.LJJIJIL().LJIIZILJ().LIZ || c1223990hxNLJFF.LIZ.LJIILLIIL().LIZ().size() > 1)) {
            Exception exc = new Exception("you use autoSize variant, in this case, you can't not use search page and multi tab ability");
            if (C1223620hwm.LJFF()) {
                throw exc;
            }
        }
        Integer numLJIIIIZZ2 = Jo().LJIIIZ().LJIIIIZZ();
        if (numLJIIIIZZ2 != null && numLJIIIIZZ2.intValue() == 0) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL instanceof ConstraintLayout) {
                C19MB c19mb = new C19MB();
                ConstraintLayout constraintLayout = (ConstraintLayout) viewLJJIJL;
                c19mb.LJII(constraintLayout);
                c19mb.LJIJI(R.id.un_).LIZLLL.LJJJJJ = 1;
                c19mb.LIZIZ(constraintLayout);
            }
        }
        if (ap()) {
            Go(false);
        }
    }
}
