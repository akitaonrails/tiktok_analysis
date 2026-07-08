package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.C03J8;
import X.C04CS;
import X.C09R3;
import X.C0NJ1;
import X.C0QSJ;
import X.C1388190mED;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C19EG;
import X.C1AF0;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724240Sb0;
import X.InterfaceC1053404Aa;
import X.InterfaceC1752680vi6;
import X.InterfaceC1755040vlu;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBridgeCellAssemListCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS313S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes27.dex */
public abstract class PdpBridgeCellAssemListCard<T extends PdpBridgeCellAssemListCard<T, ITEM>, ITEM extends InterfaceC1891350zJl> extends PdpBodyListCardReusedAssem<T, ITEM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public AbsFullSpanVH<ITEM> LLJLL;
    public volatile InterfaceC1053404Aa LLJLLIL;
    public volatile InterfaceC1755040vlu LLJLLL;
    public volatile InterfaceC1752680vi6 LLJZ;
    public volatile C0NJ1 LLJZIJLIL;
    public volatile C04CS LLL;
    public InterfaceC665370Q7z LLLF;
    public C0QSJ LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpBridgeCellAssemListCard.class, "btmManager", "getBtmManager()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/event/btm/IBtmManager;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpBridgeCellAssemListCard.class, "lazyLoadManager", "getLazyLoadManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/lazyload/ILazyLoadManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpBridgeCellAssemListCard.class, "tabBarAbility", "getTabBarAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/tabbar/IPdpTabBarAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpBridgeCellAssemListCard.class, "unifiedPDPStateAbility", "getUnifiedPDPStateAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/state/ability/IPDPUnifiedStateAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PdpBridgeCellAssemListCard.class, "eventTrackingAbility", "getEventTrackingAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/sdet/IPDPEventTrackingAbility;", 0);
        c09r3.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    public abstract AbsFullSpanVH<ITEM> zp(View view);

    public final InterfaceC1053404Aa Ap() {
        InterfaceC1053404Aa interfaceC1053404Aa;
        InterfaceC1053404Aa interfaceC1053404Aa2 = this.LLJLLIL;
        if (interfaceC1053404Aa2 == null) {
            synchronized (this) {
                interfaceC1053404Aa2 = this.LLJLLIL;
                if (interfaceC1053404Aa2 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        interfaceC1053404Aa = (InterfaceC1053404Aa) c0qsjYp.getAbility(InterfaceC1053404Aa.class);
                        C687700QyG.LJ(interfaceC1053404Aa, InterfaceC1053404Aa.class);
                    } else {
                        interfaceC1053404Aa = null;
                    }
                    this.LLJLLIL = interfaceC1053404Aa;
                    return interfaceC1053404Aa;
                }
            }
        }
        return interfaceC1053404Aa2;
    }

    public final C04CS Bp() {
        C04CS c04cs;
        C04CS c04cs2 = this.LLL;
        if (c04cs2 == null) {
            synchronized (this) {
                c04cs2 = this.LLL;
                if (c04cs2 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        c04cs = (C04CS) c0qsjYp.getAbility(C04CS.class);
                        C687700QyG.LJ(c04cs, C04CS.class);
                    } else {
                        c04cs = null;
                    }
                    this.LLL = c04cs;
                    return c04cs;
                }
            }
        }
        return c04cs2;
    }

    public final InterfaceC1755040vlu Ep() {
        InterfaceC1755040vlu interfaceC1755040vlu;
        InterfaceC1755040vlu interfaceC1755040vlu2 = this.LLJLLL;
        if (interfaceC1755040vlu2 == null) {
            synchronized (this) {
                interfaceC1755040vlu2 = this.LLJLLL;
                if (interfaceC1755040vlu2 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        interfaceC1755040vlu = (InterfaceC1755040vlu) c0qsjYp.getAbility(InterfaceC1755040vlu.class);
                        C687700QyG.LJ(interfaceC1755040vlu, InterfaceC1755040vlu.class);
                    } else {
                        interfaceC1755040vlu = null;
                    }
                    this.LLJLLL = interfaceC1755040vlu;
                    return interfaceC1755040vlu;
                }
            }
        }
        return interfaceC1755040vlu2;
    }

    public final C0NJ1 Fp() {
        C0NJ1 c0nj1;
        C0NJ1 c0nj12 = this.LLJZIJLIL;
        if (c0nj12 == null) {
            synchronized (this) {
                c0nj12 = this.LLJZIJLIL;
                if (c0nj12 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        c0nj1 = (C0NJ1) c0qsjYp.getAbility(C0NJ1.class);
                        C687700QyG.LJ(c0nj1, C0NJ1.class);
                    } else {
                        c0nj1 = null;
                    }
                    this.LLJZIJLIL = c0nj1;
                    return c0nj1;
                }
            }
        }
        return c0nj12;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AbsFullSpanVH<ITEM> absFullSpanVH = this.LLJLL;
        if (absFullSpanVH != null) {
            absFullSpanVH.onDestroy();
        }
    }

    public final C0QSJ yp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLFF;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLF;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLF = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLFF = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AbsFullSpanVH<ITEM> absFullSpanVHZp = zp(view);
        InterfaceC1752680vi6 interfaceC1752680vi6 = this.LLJZ;
        PdpViewModel pdpViewModel = null;
        if (interfaceC1752680vi6 == null) {
            synchronized (this) {
                interfaceC1752680vi6 = this.LLJZ;
                if (interfaceC1752680vi6 == null) {
                    C0QSJ c0qsjYp = yp();
                    if (c0qsjYp != null) {
                        interfaceC1752680vi6 = (InterfaceC1752680vi6) c0qsjYp.getAbility(InterfaceC1752680vi6.class);
                    } else {
                        interfaceC1752680vi6 = null;
                    }
                    this.LLJZ = interfaceC1752680vi6;
                }
            }
        }
        absFullSpanVHZp.LLJILLL = interfaceC1752680vi6;
        absFullSpanVHZp.LLJJIII = Ap();
        absFullSpanVHZp.LLJILJIL = Fp();
        absFullSpanVHZp.LLJILJILJ = Bp();
        absFullSpanVHZp.LLJJIJIIJIL = Ep();
        this.LLJLL = absFullSpanVHZp;
        try {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                if (fragmentLJI instanceof PdpFragment) {
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpViewModel.class);
                    AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 913);
                    pdpViewModel = (PdpViewModel) new lifecycleAwareLazy(fragmentLJI, awS560S0100000_16, new AwS154S0400000_26(fragmentLJI, awS560S0100000_16, c19719912DlLIZ, AFwS313S0000000_26.get$arr$(45), 29)).getValue();
                } else {
                    C1AF0.LIZJ("fragment should be PdpFragment, PdpBridgeCellAssemListCard Failed return provideJediViewModel()");
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "PdpBridgeCellAssemListCard Failed return provideJediViewModel()");
        }
        absFullSpanVHZp.LLJJIJI = pdpViewModel;
        AbsFullSpanVH<ITEM> absFullSpanVH = this.LLJLL;
        if (absFullSpanVH != null) {
            absFullSpanVH.onCreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void tp(Object obj) {
        Context context;
        C19EG c19egLIZIZ;
        C19EG c19egLIZIZ2;
        AbsFullSpanVH<ITEM> absFullSpanVH = this.LLJLL;
        if (absFullSpanVH != null) {
            Context context2 = absFullSpanVH.itemView.getContext();
            if ((context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null && c19egLIZIZ2.isFinishing()) || ((context = absFullSpanVH.itemView.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && c19egLIZIZ.isDestroyed())) {
                IllegalStateException illegalStateException = new IllegalStateException("activity is null");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(absFullSpanVH.getClass().getSimpleName());
                sbLIZ.append(" bindForPowerCell, activity is finishing or destroyed!");
                C1AF0.LJFF(illegalStateException, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            absFullSpanVH.LLJJI = obj;
            C03J8.LIZ(absFullSpanVH.itemView, absFullSpanVH.W5());
            absFullSpanVH.rr(obj);
        }
    }
}
