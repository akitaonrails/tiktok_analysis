package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.AbstractC1591090rVT;
import X.AbstractC1623806Xk;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0PEM;
import X.C0QSJ;
import X.C127G;
import X.C1303750k21;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1570510qyH;
import X.C1571460qzo;
import X.C1591880rWk;
import X.C1608210rx5;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1767800w6U;
import X.C1767950w6j;
import X.C1772240wDe;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252611DEt;
import X.C2341109Fh;
import X.C297720Bli;
import X.C324990Cob;
import X.C446900Hfk;
import X.C452501pT;
import X.C491001vg;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C7879035x;
import X.C948503nH;
import X.EnumC1599680rjK;
import X.EnumC221100tF;
import X.EnumC892060Yz6;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1772480wE2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS398S0100000_24;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallStatusViewAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallTabRefreshAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.ShopMainMixFragmentScope;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MixMallTabRefreshAssem extends AbstractC738140SxQ implements MallTabRefreshAbility, InterfaceC1055110dYz, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1608210rx5 LL = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));
    public final MixMallTabRefreshAssem LLILLJJLI = this;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 338));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 339));
    public final AssemVMLazy LLILZIL;
    public final long LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public C2252611DEt LLJ;
    public boolean LLJI;
    public volatile MallStatusViewAbility LLJIJIL;
    public C127G LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixMallTabRefreshAssem.class, "mallStatusViewAbilityDI", "getMallStatusViewAbilityDI()Lcom/ss/android/ugc/aweme/ecommerce/mall/service/ability/MallStatusViewAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MixMallTabRefreshAssem.class, "shopMixVM", "getShopMixVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MixMallTabRefreshAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 340), AFwS264S0000000_24.get$arr$(90), null, true);
        this.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LLIZLLLIL = -1L;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ShopMainMixFragmentScope.class});
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ShopMainMixFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ShopMallMixViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (ShopMallMixViewModel) assemVMLazy.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m184do() {
        AbstractC1591090rVT abstractC1591090rVTY01;
        AbstractC1591090rVT abstractC1591090rVTY012;
        if (C1767800w6U.LJ()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null || (abstractC1591090rVTY012 = C1591880rWk.LIZIZ.LJIILL(c19egLIZ).y01()) == null) {
                return false;
            }
            return abstractC1591090rVTY012.LJJII("HOME");
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 == null || (abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19egLIZ2).y01()) == null) {
            return false;
        }
        return abstractC1591090rVTY01.LJJII("SHOP_MALL");
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJILJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJILJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ShopMallMixViewModel.class, new AObjectS398S0100000_24(this, 5)}, defaultViewModelProviderFactory);
                    this.LLJILJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EG activity;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (activity = fragmentLJI.getActivity()) == null) {
            return;
        }
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strPz = c446900Hfk.LIZ(activity).pz(fragmentLJI);
        if (strPz != null) {
            c446900Hfk.LIZ(activity).PQ2(strPz, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        if (C297720Bli.LIZ()) {
            return;
        }
        ((ShopMallMixFragment) this.LL.getValue()).LLJI = this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C19EG activity;
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            String strPz = c446900Hfk.LIZ(activity).pz(fragmentLJI);
            if (strPz != null) {
                c446900Hfk.LIZ(activity).wQ2(strPz, this);
            }
        }
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0qzr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LL;
            }
        }, null, new AwS603S0100000_24(this, 431), null, new AwS603S0100000_24(this, 432), 10, null);
        AssemViewModel.asyncSubscribe$default(bo(), new C2217381BqS() { // from class: X.0qzs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LLILLJJLI;
            }
        }, null, new AwS603S0100000_24(this, 433), null, new AwS603S0100000_24(this, 434), 10, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallTabRefreshAbility
    public final boolean Oi(boolean z) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixhome ShopTab TabRefresh tryRefresh isTriggeredByNav: ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        EnumC892060Yz6 enumC892060Yz6 = EnumC892060Yz6.TRY_REFRESH;
        c1767950w6j.getClass();
        AnonymousClass0956 anonymousClass0956LJ = null;
        C1767950w6j.LJJIIJZLJL(enumC892060Yz6, null, null, null);
        if (C1767800w6U.LJ()) {
            C2341109Fh.LIZ("mixhome ShopTab TabRefresh tryRefresh top shoptab");
            if (m184do() && this.LLIZ) {
                C2341109Fh.LIZ("mixhome ShopTab TabRefresh ignore tab refreshing");
                EnumC1599680rjK enumC1599680rjK = EnumC1599680rjK.IGNORE;
                EnumC892060Yz6 enumC892060Yz62 = EnumC892060Yz6.REFRESH_END;
                c1767950w6j.getClass();
                C1767950w6j.LJJIIJZLJL(enumC892060Yz62, enumC1599680rjK, null, null);
                return false;
            }
            if (m184do()) {
                this.LLIZ = true;
                C1DFH c1dfh = C0PEM.LIZ;
                C948503nH.LJ(this, C2107308Nj.LIZ.LLIILII(), new C1303750k21(this, null));
            }
            return fo("click_top_tab");
        }
        C2341109Fh.LIZ("mixhome ShopTab TabRefresh tryRefresh bottom shoptab");
        if (m184do()) {
            C2341109Fh.LIZ("mixhome ShopTab TabRefresh ignore tab refreshing");
            EnumC1599680rjK enumC1599680rjK2 = EnumC1599680rjK.IGNORE;
            EnumC892060Yz6 enumC892060Yz63 = EnumC892060Yz6.REFRESH_END;
            c1767950w6j.getClass();
            C1767950w6j.LJJIIJZLJL(enumC892060Yz63, enumC1599680rjK2, null, null);
            return false;
        }
        if (C7879035x.LIZLLL()) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C1DFH c1dfh2 = C0PEM.LIZ;
                anonymousClass0956LJ = C948503nH.LJ(this, C2107308Nj.LIZ.LLIILII(), new C1570510qyH(c19egLIZ, this, null));
            }
            C189200o6.m2constructorimpl(anonymousClass0956LJ);
        } else {
            try {
                C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
                if (c19egLIZ2 != null) {
                    C1DFH c1dfh3 = C0PEM.LIZ;
                    anonymousClass0956LJ = C948503nH.LJ(this, C2107308Nj.LIZ.LLIILII(), new C1570510qyH(c19egLIZ2, this, null));
                }
                C189200o6.m2constructorimpl(anonymousClass0956LJ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return fo("click_bottom_tab");
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ShopMainMixFragmentScope.class}).unbindAbility(this.LLILLJJLI, MallTabRefreshAbility.class);
    }

    public final boolean fo(String str) {
        C19EG c19egLIZ;
        GetMixControllerAbility getMixControllerAbility;
        C1772240wDe c1772240wDeMg1;
        C1571460qzo state = bo().getState();
        AbstractC1623806Xk<EnumC221100tF> abstractC1623806Xk = state.LL;
        if ((abstractC1623806Xk instanceof C1623606Xi) && (state.LLILLJJLI instanceof C1623606Xi)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("mixhome ShopTab TabRefresh sendEcMallRefreshEvent");
            this.LLIZLLLIL = System.currentTimeMillis();
            this.LLJI = true;
            if (C724240Sb0.LIZ(this) != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (getMixControllerAbility = (GetMixControllerAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), GetMixControllerAbility.class, null)) != null && (c1772240wDeMg1 = getMixControllerAbility.Mg1()) != null) {
                c1772240wDeMg1.LJ(1, "fetch", str, null, null, false, new InterfaceC1772480wE2() { // from class: X.0qzq
                    @Override // X.InterfaceC1772480wE2
                    public final void LIZ(boolean z) {
                        this.LIZ.mQ1(EnumC1599680rjK.NATIVE);
                    }
                });
            }
            EnumC1599680rjK enumC1599680rjK = EnumC1599680rjK.LYNX;
            C1767950w6j c1767950w6j = C1767950w6j.LIZ;
            EnumC892060Yz6 enumC892060Yz6 = EnumC892060Yz6.REFRESH_START;
            c1767950w6j.getClass();
            C1767950w6j.LJJIIJZLJL(enumC892060Yz6, enumC1599680rjK, null, null);
            return true;
        }
        if (!(abstractC1623806Xk instanceof C491001vg) && !(state.LLILLJJLI instanceof C491001vg)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("mixhome ShopTab TabRefresh ignore");
            EnumC1599680rjK enumC1599680rjK2 = EnumC1599680rjK.IGNORE;
            C1767950w6j c1767950w6j2 = C1767950w6j.LIZ;
            EnumC892060Yz6 enumC892060Yz62 = EnumC892060Yz6.REFRESH_END;
            c1767950w6j2.getClass();
            C1767950w6j.LJJIIJZLJL(enumC892060Yz62, enumC1599680rjK2, null, null);
            return false;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTab TabRefresh errorViewRetry");
        this.LLIZLLLIL = System.currentTimeMillis();
        MallStatusViewAbility mallStatusViewAbility = (MallStatusViewAbility) this.LLILZ.getValue();
        if (mallStatusViewAbility != null) {
            mallStatusViewAbility.VE0();
        }
        EnumC1599680rjK enumC1599680rjK3 = EnumC1599680rjK.NATIVE;
        C1767950w6j c1767950w6j3 = C1767950w6j.LIZ;
        EnumC892060Yz6 enumC892060Yz63 = EnumC892060Yz6.REFRESH_START;
        c1767950w6j3.getClass();
        C1767950w6j.LJJIIJZLJL(enumC892060Yz63, enumC1599680rjK3, null, null);
        return true;
    }

    public final void ho(boolean z) {
        if (this.LLJI) {
            return;
        }
        if (z) {
            C1571460qzo state = bo().getState();
            if ((state.LL instanceof C1623606Xi) && (state.LLILLJJLI instanceof C1623606Xi)) {
                mQ1(EnumC1599680rjK.NATIVE);
                return;
            }
            return;
        }
        mQ1(EnumC1599680rjK.NATIVE);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallTabRefreshAbility
    public final void mQ1(EnumC1599680rjK enumC1599680rjK) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mixhome ShopTab TabRefresh tryRefreshFinish refreshType: ");
        sbLIZ.append(enumC1599680rjK);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        C324990Cob.LIZ(enumC1599680rjK, this.LLJ);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTab TabRefresh MallTabRefreshAssem onNodeHide");
        mQ1(EnumC1599680rjK.NATIVE);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTab TabRefresh MallTabRefreshAssem onNodeShow");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ShopMainMixFragmentScope.class}).bindAbility(this.LLILLJJLI, MallTabRefreshAbility.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ko(X.EnumC1303770k23 r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem.ko(X.0k23, X.05Vn):java.lang.Object");
    }
}
