package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown;

import X.C03DW;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1405960mgs;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1420660n4a;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import Y.AObjectS400S0100000_26;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.shared.SkuPropTitleActionScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class SkuPropDropdownReusedAssem extends PdpBodyListCardReusedAssem<SkuPropDropdownReusedAssem, C1405960mgs> implements InterfaceC737790Swr, C0QSJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final InterfaceC1731706qJ LLJLL;
    public C127G LLJLLIL;
    public C03DW LLJLLL;
    public InterfaceC1420660n4a LLJZ;
    public InterfaceC665370Q7z LLJZIJLIL;
    public C0QSJ LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SkuPropDropdownReusedAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/sku/assem/dropdown/PdpSkuPropDropdownViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SkuPropDropdownReusedAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpSkuPropDropdownViewModel.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1385), null, AFwS268S0000000_26.get$arr$(241));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.az8;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C03DW.class) {
            this.LLJLLL = (C03DW) obj;
        } else if (cls == InterfaceC1420660n4a.class) {
            this.LLJZ = (InterfaceC1420660n4a) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class, SkuPropDropdownActionScope.class, SkuPropTitleActionScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C03DW.class) {
            return this.LLJLLL;
        }
        if (cls == InterfaceC1420660n4a.class) {
            return this.LLJZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        arrayList.add(SkuPropDropdownActionScope.class);
        arrayList.add(SkuPropTitleActionScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SkuPropDropdownActionScope.class);
        arrayList.add(SkuPropTitleActionScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C03DW.class) {
            this.LLJLLL = null;
        } else if (cls == InterfaceC1420660n4a.class) {
            this.LLJZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C0QSJ yp() {
        C0QSJ c0qsj = this.LLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJZIJLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJZIJLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final PdpSkuPropDropdownViewModel zp() {
        return (PdpSkuPropDropdownViewModel) this.LLJLL.getValue(this, LLLF[0]);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpSkuPropDropdownViewModel.class, new AObjectS400S0100000_26(this, 23)}, defaultViewModelProviderFactory);
                    this.LLJLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropTitleActionScope.class}).unbindAbility(zp(), C03DW.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropDropdownActionScope.class}).unbindAbility(zp(), InterfaceC1420660n4a.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C723830SaL.LIZ(this, null, new AwS605S0100000_26(this, 238));
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropTitleActionScope.class}).bindAbility(zp(), C03DW.class);
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SkuPropDropdownActionScope.class}).bindAbility(zp(), InterfaceC1420660n4a.class);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final /* bridge */ /* synthetic */ void tp(C1405960mgs c1405960mgs) {
    }
}
