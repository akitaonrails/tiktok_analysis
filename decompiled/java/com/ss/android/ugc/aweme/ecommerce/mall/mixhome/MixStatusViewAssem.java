package com.ss.android.ugc.aweme.ecommerce.mall.mixhome;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1571460qzo;
import X.C1571550qzx;
import X.C1608210rx5;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1767790w6T;
import X.C1767950w6j;
import X.C1767980w6m;
import X.C1772240wDe;
import X.C19719912Dl;
import X.C19EG;
import X.C1BWL;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C2487409ou;
import X.C297720Bli;
import X.C419910GdJ;
import X.C452501pT;
import X.C491001vg;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C804420Vh2;
import X.EnumC041000Cq;
import X.EnumC1599680rjK;
import X.EnumC1771280wC6;
import X.EnumC221100tF;
import X.InterfaceC1146704e9;
import X.InterfaceC1772480wE2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.AObjectS398S0100000_24;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallStatusViewAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallTabRefreshAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.ShopMainMixFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class MixStatusViewAssem extends UIContentAssem implements MallStatusViewAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public C1749280vcc LLIZLLLIL;
    public final C1608210rx5 LLJ = new C1608210rx5(this, C13LE.LJII(ShopMallMixFragment.class));
    public final MixStatusViewAssem LLJI = this;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 342));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 343));
    public final AssemVMLazy LLJILJILJ;
    public volatile MallTabRefreshAbility LLJILLL;
    public C127G LLJJ;
    public InterfaceC665370Q7z LLJJI;
    public C0QSJ LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStatusViewAssem.class, "legacyMallTabRefreshAbilityDi", "getLegacyMallTabRefreshAbilityDi()Lcom/ss/android/ugc/aweme/ecommerce/mall/service/ability/MallTabRefreshAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MixStatusViewAssem.class, "shopMixVM", "getShopMixVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/mixhome/ShopMallMixViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MixStatusViewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShopMallMixViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 344), AFwS264S0000000_24.get$arr$(92), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ShopMainMixFragmentScope.class});
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

    public final void Go() {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("mixhome ShopTabV3 ErrorView errorViewGone");
        if (Jo().getState().LL instanceof C1623606Xi) {
            C2341109Fh.LIZ("mixhome ShopTabV3 ErrorView errorViewGone realGone");
            C786410Ut5.LLLZLZ(Lo(), 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ShopMallMixFragment Ho() {
        return (ShopMallMixFragment) this.LLJ.getValue();
    }

    public final ShopMallMixViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (ShopMallMixViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc Lo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w0t) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void No() {
        Resources resources;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZJ("mixhome ErrorViewDisplay");
        C1749280vcc c1749280vccLo = Lo();
        if (c1749280vccLo != null) {
            C786410Ut5.LLLZLZ(c1749280vccLo, 0);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            Context context = c1749280vccLo.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                c1722300uv6.LJI = resources.getString(2131832569);
                c1722300uv6.LJIIIIZZ = resources.getString(2131832568);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_refresh;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c1722300uv6.LIZ(c419910GdJ);
                c1722300uv6.LJIIIZ = new AwS390S0200000_24(this, resources, 5);
            }
            c1749280vccLo.setStatus(c1722300uv6);
            Jo().LLILLL.LJLJLLL = System.currentTimeMillis();
        }
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        int status = EnumC041000Cq.SHOW.getStatus();
        String errMsg = EnumC1771280wC6.NO_DATA.getErrMsg();
        Ho().LLJJJ.getClass();
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        String str = c1767790w6T != null ? c1767790w6T.LJIIIZ : null;
        c1767950w6j.getClass();
        C1767950w6j.LJIILJJIL(status, errMsg, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.ability.MallStatusViewAbility
    public final void VE0() {
        GetMixControllerAbility getMixControllerAbility;
        C1772240wDe c1772240wDeMg1;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZJ("mixhome ShopTabV3 ErrorView errorViewRetry");
        if (!C804420Vh2.LJFF(C1BWL.LIZ())) {
            MallTabRefreshAbility mallTabRefreshAbility = (MallTabRefreshAbility) this.LLJILJIL.getValue();
            if (mallTabRefreshAbility != null) {
                mallTabRefreshAbility.mQ1(EnumC1599680rjK.NATIVE);
                return;
            }
            return;
        }
        Lo().LJ();
        C1571460qzo state = Jo().getState();
        if (state.LL.LIZ() != EnumC221100tF.ONLINE) {
            C2341109Fh.LIZ("ShopTabV3 ErrorView errorViewRetry loadData");
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null && (getMixControllerAbility = (GetMixControllerAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZ, null), GetMixControllerAbility.class, null)) != null && (c1772240wDeMg1 = getMixControllerAbility.Mg1()) != null) {
                c1772240wDeMg1.LJ(1, "error_retry", "fail_retry", null, null, false, new InterfaceC1772480wE2() { // from class: X.0qzw
                    @Override // X.InterfaceC1772480wE2
                    public final void LIZ(boolean z) {
                    }
                });
            }
        }
        if (state.LLILLJJLI instanceof C491001vg) {
            C2341109Fh.LIZ("ShopTabV3 ErrorView errorViewRetry loadLynx");
            ShopMallMixViewModel shopMallMixViewModelJo = Jo();
            shopMallMixViewModelJo.setState(AFwS264S0000000_24.get$arr$(567));
            C1571550qzx c1571550qzx = shopMallMixViewModelJo.LL;
            if (c1571550qzx != null) {
                c1571550qzx.LIZ.Lo().LLILLJJLI.LIZJ = false;
                C2487409ou.LIZJ(new ARunnableS109S0100000_9(c1571550qzx.LIZ, 138));
            }
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ShopMallMixViewModel.class, new AObjectS398S0100000_24(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        if (C297720Bli.LIZ()) {
            return;
        }
        Ho().LLJIJIL = this;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ShopMainMixFragmentScope.class}).unbindAbility(this.LLJI, MallStatusViewAbility.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0qzu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LL;
            }
        }, null, new AwS603S0100000_24(this, 54), null, new AwS603S0100000_24(this, 55), 10, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0qzt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LLILLJJLI;
            }
        }, null, new AwS603S0100000_24(this, 56), null, new AwS603S0100000_24(this, 57), 10, null);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ShopMainMixFragmentScope.class}).bindAbility(this.LLJI, MallStatusViewAbility.class);
    }
}
