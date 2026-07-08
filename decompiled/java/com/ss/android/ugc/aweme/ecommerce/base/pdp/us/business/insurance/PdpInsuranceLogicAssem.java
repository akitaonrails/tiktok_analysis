package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance;

import X.C0QSJ;
import X.C13LE;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC1405950mgr;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpInsuranceLogicAssem extends TransformDataProviderLogicAssem<InterfaceC1405950mgr> implements InterfaceC1405950mgr, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final PdpInsuranceLogicAssem LLILZLL;
    public volatile InterfaceC1761670vwb LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpInsuranceLogicAssem.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    public PdpInsuranceLogicAssem() {
        super(InterfaceC1405950mgr.class);
        this.LLILZLL = this;
    }

    public final InterfaceC1761670vwb fo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZLLLIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLIZLLLIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
            this.LLJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC1761670vwb interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjLIZLLL.getAbility(InterfaceC1761670vwb.class);
        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
        return interfaceC1761670vwb;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.transform.TransformDataProviderLogicAssem
    /* JADX INFO: renamed from: do */
    public final /* bridge */ /* synthetic */ InterfaceC1405950mgr mo179do() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(this.LLILZLL, InterfaceC1405950mgr.class);
    }

    @Override // X.InterfaceC1405950mgr
    public final InsuranceInfo n4(String str) {
        InterfaceC1761670vwb interfaceC1761670vwbFo = this.LLIZ;
        if (interfaceC1761670vwbFo == null) {
            synchronized (this) {
                interfaceC1761670vwbFo = this.LLIZ;
                if (interfaceC1761670vwbFo == null) {
                    interfaceC1761670vwbFo = fo();
                    this.LLIZ = interfaceC1761670vwbFo;
                }
            }
        }
        return interfaceC1761670vwbFo.lX().LLLLZ.LIZ(str);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(this.LLILZLL, InterfaceC1405950mgr.class);
    }
}
