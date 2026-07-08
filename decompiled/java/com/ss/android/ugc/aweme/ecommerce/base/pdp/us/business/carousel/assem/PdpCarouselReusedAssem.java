package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0QSJ;
import X.C127G;
import X.C13LE;
import X.C1488690oqJ;
import X.C1508390pM5;
import X.C1637806bA;
import X.C1762010vx9;
import X.C1762200vxS;
import X.C1762220vxU;
import X.C1762250vxX;
import X.C1770850wBP;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC1755020vls;
import X.InterfaceC1755770vn5;
import X.InterfaceC1761990vx7;
import X.InterfaceC1762000vx8;
import X.InterfaceC1762510vxx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import Y.AObjectS400S0100000_26;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselReusedAssem extends PdpBodyListCardReusedAssem<PdpCarouselReusedAssem, C1762010vx9> implements LifecycleEventObserver, InterfaceC737790Swr, C0QSJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final InterfaceC1731706qJ LLJLL;
    public final C01GW LLJLLIL;
    public volatile InterfaceC1755770vn5 LLJLLL;
    public volatile InterfaceC1755020vls LLJZ;
    public C127G LLJZIJLIL;
    public C1762200vxS LLL;
    public InterfaceC1762000vx8 LLLF;
    public InterfaceC1761990vx7 LLLFF;
    public InterfaceC1762510vxx LLLFFI;
    public C1762250vxX LLLFZ;
    public InterfaceC665370Q7z LLLI;
    public C0QSJ LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpCarouselReusedAssem.class, "pdpBodyAbility", "getPdpBodyAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/body/IPdpBodyAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpCarouselReusedAssem.class, "configurationAbility", "getConfigurationAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpConfigurationAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpCarouselReusedAssem.class, "viewHolderVM", "getViewHolderVM()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/PdpCarouselViewModel;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public PdpCarouselReusedAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpCarouselViewModel.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 294), null, AFwS268S0000000_26.get$arr$(228));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 450));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.at6;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class}).unbindAbility(Ap(), C1762250vxX.class);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == C1762200vxS.class) {
            this.LLL = (C1762200vxS) obj;
        } else if (cls == InterfaceC1762000vx8.class) {
            this.LLLF = (InterfaceC1762000vx8) obj;
        } else if (cls == InterfaceC1761990vx7.class) {
            this.LLLFF = (InterfaceC1761990vx7) obj;
        } else if (cls == InterfaceC1762510vxx.class) {
            this.LLLFFI = (InterfaceC1762510vxx) obj;
        } else if (cls == C1762250vxX.class) {
            this.LLLFZ = (C1762250vxX) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class, PdpCarouselScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == C1762200vxS.class) {
            return this.LLL;
        }
        if (cls == InterfaceC1762000vx8.class) {
            return this.LLLF;
        }
        if (cls == InterfaceC1761990vx7.class) {
            return this.LLLFF;
        }
        if (cls == InterfaceC1762510vxx.class) {
            return this.LLLFFI;
        }
        if (cls == C1762250vxX.class) {
            return this.LLLFZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        arrayList.add(PdpCarouselScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpCarouselScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpCarouselScope.class}).bindAbility(Ap(), C1762250vxX.class);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == C1762200vxS.class) {
            this.LLL = null;
        } else if (cls == InterfaceC1762000vx8.class) {
            this.LLLF = null;
        } else if (cls == InterfaceC1761990vx7.class) {
            this.LLLFF = null;
        } else if (cls == InterfaceC1762510vxx.class) {
            this.LLLFFI = null;
        } else if (cls == C1762250vxX.class) {
            this.LLLFZ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final C1762250vxX Ap() {
        return (C1762250vxX) this.LLJLLIL.getValue();
    }

    public final C0QSJ yp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLII;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLI;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLI = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLII = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1755020vls zp() {
        InterfaceC1755020vls interfaceC1755020vls;
        InterfaceC1755020vls interfaceC1755020vls2 = this.LLJZ;
        if (interfaceC1755020vls2 == null) {
            synchronized (this) {
                interfaceC1755020vls2 = this.LLJZ;
                if (interfaceC1755020vls2 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        interfaceC1755020vls = (InterfaceC1755020vls) c0qsjYp.getAbility(InterfaceC1755020vls.class);
                        C687700QyG.LJ(interfaceC1755020vls, InterfaceC1755020vls.class);
                    } else {
                        interfaceC1755020vls = null;
                    }
                    this.LLJZ = interfaceC1755020vls;
                    return interfaceC1755020vls;
                }
            }
        }
        return interfaceC1755020vls2;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1762250vxX c1762250vxXAp = Ap();
        for (Map.Entry entry : ((LinkedHashMap) c1762250vxXAp.LIZLLL).entrySet()) {
            entry.getKey();
            C1508390pM5 c1508390pM5 = (C1508390pM5) entry.getValue();
            c1508390pM5.pause();
            c1508390pM5.stop();
            c1508390pM5.release();
        }
        ((LinkedHashMap) c1762250vxXAp.LIZLLL).clear();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJZIJLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJZIJLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpCarouselViewModel.class, new AObjectS400S0100000_26(this, 14)}, defaultViewModelProviderFactory);
                    this.LLJZIJLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner viewLifecycleOwner;
        Lifecycle lifecycle;
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJLL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLIIII;
        interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[2]);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJLL.getValue(this, interfaceC2217461BqaArr[2]);
        C1762220vxU c1762220vxU = new C2217381BqS() { // from class: X.0vxU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1761940vx2) obj).LLILZ);
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ = true;
        c1770850wBP.LIZ(true);
        C736680Sv4.LJIIIIZZ(this, assemViewModel, c1762220vxU, c1770850wBP, AFwS313S0000000_26.get$arr$(47), 4);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner()) != null && (lifecycle = viewLifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        C723830SaL.LIZ(this, null, new AwS605S0100000_26(this, 229));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void tp(C1762010vx9 c1762010vx9) {
        if (!c1762010vx9.LLJILJILJ) {
            C723830SaL.LJ(this, C13LE.LIZ(PdpCarouselBaseStaticWidgetAssem.class), true, null);
            C723830SaL.LJ(this, C13LE.LIZ(PdpCarouselInnerIndicatorAssem.class), true, null);
            C723830SaL.LJ(this, C13LE.LIZ(PdpCarouselPromotionBannerAssem.class), true, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C1488690oqJ.LIZ[event.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                lifecycleOwner.getLifecycle().removeObserver(this);
                return;
            }
            return;
        }
        Ap().LIZ();
    }
}
