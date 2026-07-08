package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1196320hEk;
import X.C1223500hwa;
import X.C1223620hwm;
import X.C127G;
import X.C13LE;
import X.C1509305vX;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC1223520hwc;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS393S0100000_19;
import Y.AsS46S0100000_19;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListContactCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListEmptySearchResCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorListIndexCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.cell.SelectorLoadingCell;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContentPageContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorSearchPageVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorSearchPageAssem extends UIListContentAssem<SelectorSearchPageVM> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLIZLLLIL = C1223620hwm.LIZLLL(this);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2618));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2622));
    public final C01GW LLJIJIL = C1509305vX.LIZ(new AwS563S0100000_19(this, 2617));
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public C127G LLJJI;
    public InterfaceC665370Q7z LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorSearchPageAssem.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorSearchPageAssem.class, "contentPageContainerVM", "getContentPageContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContentPageContainerVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SelectorSearchPageAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorSearchPageVM;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public SelectorSearchPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorContainerVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2619), AFwS257S0000000_19.get$arr$(518), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorContentPageContainerVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2620), AFwS257S0000000_19.get$arr$(519), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SelectorSearchPageVM.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ3, 2621), AFwS257S0000000_19.get$arr$(520), null, true);
        this.LLJJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 2616));
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

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        C20603715jn c20603715jnLIZIZ = ((InterfaceC1223520hwc) this.LLJ.getValue()).LIZ().LIZJ().LIZIZ();
        c20603715jn.LIZ = c20603715jnLIZIZ.LIZ;
        c20603715jn.LJ = c20603715jnLIZIZ.LJ;
        c20603715jn.LJI = c20603715jnLIZIZ.LJI;
        c20603715jn.LJIIL = c20603715jnLIZIZ.LJIIL;
        Class<? extends PowerLoadingCell> cls = c20603715jnLIZIZ.LIZLLL;
        if (cls != null) {
            c20603715jn.LIZLLL = cls;
        }
        boolean zLIZ = ((InterfaceC1223520hwc) this.LLJ.getValue()).LIZ().LIZJ().LIZ();
        c20603715jn.LIZJ = false;
        c20603715jn.LJIIJJI = zLIZ;
        return c20603715jn;
    }

    public final C0QSJ Lo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJIJI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIII;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIII = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ContactSelectorFragmentScope.class});
        this.LLJJIJI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final SelectorSearchPageVM ip() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (SelectorSearchPageVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorContainerVM.class, new AObjectS393S0100000_19(this, 7), SelectorContentPageContainerVM.class, new AObjectS393S0100000_19(this, 4), SelectorSearchPageVM.class, new AObjectS393S0100000_19(this, 6)}, defaultViewModelProviderFactory);
                    this.LLJJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(SelectorListContactCell.class);
        Go().LJIILJJIL(SelectorListIndexCell.class);
        Go().LJIILJJIL(SelectorLoadingCell.class);
        Go().LJIILJJIL(SelectorListEmptySearchResCell.class);
        C1196320hEk.LIZIZ(Go(), C1558520qew.LJIIL(this));
        Go().setItemAnimator(null);
        Go().addOnScrollListener(new AsS46S0100000_19(this, 13));
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hv2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218620hoi) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 190), 4);
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hwe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223570hwh) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 191), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0hv1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218620hoi) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 192), 4);
        Jo().LLIZLLLIL = ((SelectorContainerVM) this.LLJILJIL.getValue()).LLJI;
        Jo();
        new C1223500hwa(this);
    }
}
