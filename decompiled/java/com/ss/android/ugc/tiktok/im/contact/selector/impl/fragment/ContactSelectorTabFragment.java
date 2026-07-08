package com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment;

import X.AbstractC1223800hx4;
import X.AnonymousClass0951;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C09IC;
import X.C09R3;
import X.C0QSJ;
import X.C1153920g8M;
import X.C1218610hoh;
import X.C1224190hxh;
import X.C1224280hxq;
import X.C1224290hxr;
import X.C1224760hyc;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C1BNE;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C627660Ojc;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1206390hUz;
import X.InterfaceC1223330hwJ;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224750hyb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC737790Swr;
import Y.AObjectS393S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.SelectorContentPageContainerScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.event.ContactSelectorMetricHelper;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorStatusVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS6S0011000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ContactSelectorTabFragment extends BaseFragment implements InterfaceC1206390hUz, SelectorTabFragmentAbilityProtocol, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2slJGEwJys4KCwnZjYpJSowPCHELIOSo+ZyY+OCliLz0yLygpJzt9CyoiPS4wPBYpJSowPCo+HS4xDjctLiI2JjE=";
    public final C01GW LLIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS563S0100000_19(new C1559260qg8(new AwS127S1200000_11((Fragment) this, (Fragment) C1153920g8M.class, (Class<Object>) "protocol_uuid", (String) 14), true), (C1559260qg8<C1153920g8M>) 2946));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2664));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2673));
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final AnonymousClass0951 LLJILJILJ;
    public final C01GW LLJILLL;
    public volatile InterfaceC1224160hxe LLJJ;
    public volatile InterfaceC1224750hyb LLJJI;
    public C127G LLJJIII;
    public InterfaceC1223330hwJ LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ContactSelectorTabFragment.class, "contentPageContainerAbility", "getContentPageContainerAbility()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/ability/ISelectorContentPageAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ContactSelectorTabFragment.class, "selectorContainerAbility", "getSelectorContainerAbility()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/ability/ISelectorContainerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ContactSelectorTabFragment.class, "selectorStatusVM", "getSelectorStatusVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorStatusVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(ContactSelectorTabFragment.class, "tabContactListVM", "getTabContactListVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorTabContactListVM;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SelectorContentPageContainerScope.class}).unbindAbility(VR(), InterfaceC1223330hwJ.class);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1223330hwJ.class) {
            this.LLJJIJI = (InterfaceC1223330hwJ) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class, SelectorContentPageContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1223330hwJ.class) {
            return this.LLJJIJI;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        arrayList.add(SelectorContentPageContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectorContentPageContainerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SelectorContentPageContainerScope.class}).bindAbility(VR(), InterfaceC1223330hwJ.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1223330hwJ.class) {
            this.LLJJIJI = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public ContactSelectorTabFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorStatusVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2666);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(526);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2667), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 2668), aFwS257S0000000_19, null, null, null);
            z = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2669), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorTabContactListVM.class);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c19719912DlLIZ2, 2670);
        AFwS257S0000000_19 aFwS257S0000000_192 = AFwS257S0000000_19.get$arr$(527);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2671), aFwS257S0000000_192, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new AwS563S0100000_19((Fragment) this, 2672), aFwS257S0000000_192, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS563S0100000_192, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2665), aFwS257S0000000_192, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJIJIL = assemVMLazy2;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LLJILJIL = c2252321DDqLIZ;
        this.LLJILJILJ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2663));
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        Object value;
        C2252321DDq c2252321DDq = this.LLJILJIL;
        do {
            value = c2252321DDq.getValue();
            ((Boolean) value).booleanValue();
        } while (!c2252321DDq.compareAndSet(value, Boolean.FALSE));
        InterfaceC1224160hxe interfaceC1224160hxeUR = UR();
        if (interfaceC1224160hxeUR != null) {
            getTabKey();
            interfaceC1224160hxeUR.hg0();
        }
        ((C1224290hxr) this.LLJILLL.getValue()).LJIILL(getTabKey());
    }

    public final C0QSJ SR() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJIJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ContactSelectorFragmentScope.class});
        this.LLJJIJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1224160hxe UR() {
        InterfaceC1224160hxe interfaceC1224160hxe = this.LLJJ;
        if (interfaceC1224160hxe == null) {
            synchronized (this) {
                interfaceC1224160hxe = this.LLJJ;
                if (interfaceC1224160hxe == null) {
                    C0QSJ c0qsjSR = SR();
                    InterfaceC1224160hxe interfaceC1224160hxe2 = c0qsjSR != null ? (InterfaceC1224160hxe) c0qsjSR.getAbility(InterfaceC1224160hxe.class) : null;
                    this.LLJJ = interfaceC1224160hxe2;
                    return interfaceC1224160hxe2;
                }
            }
        }
        return interfaceC1224160hxe;
    }

    public final SelectorStatusVM VR() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SelectorStatusVM) assemVMLazy.getValue();
    }

    public final SelectorTabContactListVM WR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (SelectorTabContactListVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol
    public final String getTabKey() {
        return (String) this.LLJ.getValue();
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorTabContactListVM.class, new AObjectS393S0100000_19(this, 17)}, defaultViewModelProviderFactory);
                    this.LLJJIII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol
    public final void hZ0() {
        SelectorTabContactListVM selectorTabContactListVMWR = WR();
        selectorTabContactListVMWR.LLIZLLLIL = false;
        selectorTabContactListVMWR.manualListRefresh();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (getTabKey().length() > 0) {
            InterfaceC1224750hyb interfaceC1224750hyb = this.LLJJI;
            if (interfaceC1224750hyb == null) {
                synchronized (this) {
                    interfaceC1224750hyb = this.LLJJI;
                    if (interfaceC1224750hyb == null) {
                        C0QSJ c0qsjSR = SR();
                        interfaceC1224750hyb = c0qsjSR != null ? (InterfaceC1224750hyb) c0qsjSR.getAbility(InterfaceC1224750hyb.class) : null;
                        this.LLJJI = interfaceC1224750hyb;
                        if (interfaceC1224750hyb != null) {
                        }
                    }
                }
                interfaceC1224750hyb.lg2(getViewLifecycleOwner().getLifecycle(), getTabKey());
            } else {
                interfaceC1224750hyb.lg2(getViewLifecycleOwner().getLifecycle(), getTabKey());
            }
        }
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol
    public final List<C1224760hyc> qY() {
        return ((C1218610hoh) WR().getState()).LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol
    public final void Fn2(List<? extends AbstractC1223800hx4> list) {
        SelectorTabContactListVM selectorTabContactListVMWR = WR();
        selectorTabContactListVMWR.zQ2(C627660Ojc.LIZ(((C1218610hoh) selectorTabContactListVMWR.getState()).LL, null, null, null, list, 7), false);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C687700QyG.LJI(this);
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        Object value;
        C2252321DDq c2252321DDq = this.LLJILJIL;
        do {
            value = c2252321DDq.getValue();
            ((Boolean) value).booleanValue();
        } while (!c2252321DDq.compareAndSet(value, Boolean.TRUE));
        InterfaceC1224160hxe interfaceC1224160hxeUR = UR();
        if (interfaceC1224160hxeUR != null) {
            interfaceC1224160hxeUR.GI0(getTabKey());
        }
        ((C1224290hxr) this.LLJILLL.getValue()).LJIJI(getTabKey());
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol
    public final void MZ1(List<C1224190hxh> list, boolean z) {
        SelectorTabContactListVM selectorTabContactListVMWR = WR();
        if (z) {
            selectorTabContactListVMWR.setStateImmediate(new AwS385S0200000_19(selectorTabContactListVMWR, (SelectorTabContactListVM) list, (List<C1224190hxh>) 101));
        } else {
            selectorTabContactListVMWR.setState(new AwS385S0200000_19(selectorTabContactListVMWR, (SelectorTabContactListVM) list, (List<C1224190hxh>) 102));
        }
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.impl.protocol.SelectorTabFragmentAbilityProtocol
    public final void gt2(int i, boolean z) {
        WR().setState(new AwS6S0011000_19(i, z, 1));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View view2;
        ConstraintLayout constraintLayout;
        super.onViewCreated(view, bundle);
        if (getTabKey().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC1224750hyb interfaceC1224750hyb = this.LLJJI;
            if (interfaceC1224750hyb == null) {
                synchronized (this) {
                    interfaceC1224750hyb = this.LLJJI;
                    if (interfaceC1224750hyb == null) {
                        C0QSJ c0qsjSR = SR();
                        if (c0qsjSR != null) {
                            interfaceC1224750hyb = (InterfaceC1224750hyb) c0qsjSR.getAbility(InterfaceC1224750hyb.class);
                        } else {
                            interfaceC1224750hyb = null;
                        }
                        this.LLJJI = interfaceC1224750hyb;
                        if (interfaceC1224750hyb != null) {
                        }
                    }
                }
                interfaceC1224750hyb.uu1(getViewLifecycleOwner().getLifecycle(), getTabKey());
            } else {
                interfaceC1224750hyb.uu1(getViewLifecycleOwner().getLifecycle(), getTabKey());
            }
        }
        VR();
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 612), 3);
        ContactSelectorMetricHelper contactSelectorMetricHelper = new ContactSelectorMetricHelper();
        InterfaceC1224160hxe interfaceC1224160hxeUR = UR();
        C1224280hxq c1224280hxq = (C1224280hxq) this.LLIZ.getValue();
        if (interfaceC1224160hxeUR == null || Intrinsics.LJFF(c1224280hxq.getProtocol().getTag(), "TAG_EmptyContactSelectorProtocol")) {
            contactSelectorMetricHelper.LIZ.sendEvent("contact_selector_content_ability_empty_error", C2097608Jq.LJ());
        }
        InterfaceC1224160hxe interfaceC1224160hxeUR2 = UR();
        if (interfaceC1224160hxeUR2 != null) {
            interfaceC1224160hxeUR2.dV1(this, this);
        }
        Integer numLJIIIIZZ = ((C1224280hxq) this.LLIZ.getValue()).LJIIIZ().LJIIIIZZ();
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 0 && (view2 = getView()) != null && (constraintLayout = (ConstraintLayout) view2.findViewById(R.id.unu)) != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIJI(R.id.unt).LIZLLL.LJJJJJ = 1;
            c19mb.LIZIZ(constraintLayout);
        }
        if (((C1224280hxq) this.LLIZ.getValue()).LJIIIZ().LJIIIZ()) {
            NR(AFwS283S0000000_35.get$arr$(117));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cgb, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
