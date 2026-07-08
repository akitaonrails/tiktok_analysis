package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.tabbar;

import X.C019F;
import X.C0H9H;
import X.C0QSJ;
import X.C10515049h;
import X.C10516049i;
import X.C1203130hPj;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1561200qjG;
import X.C1637806bA;
import X.C1744700vVE;
import X.C1748720vbi;
import X.C1752280vhS;
import X.C1753080vik;
import X.C1755690vmx;
import X.C1755760vn4;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817803Hk;
import X.C958103op;
import X.InterfaceC1053404Aa;
import X.InterfaceC1146704e9;
import X.InterfaceC1752680vi6;
import X.InterfaceC1755770vn5;
import X.InterfaceC1761670vwb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS400S0100000_26;
import Y.ARunnableS13S0201000_6;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarTab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpTabBarAssem extends UISlotAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final C1561200qjG LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final AssemVMLazy LLJJI;
    public C1203130hPj LLJJIII;
    public Integer LLJJIJI;
    public volatile InterfaceC1053404Aa LLJJIJIIJIL;
    public volatile InterfaceC1761670vwb LLJJIJIL;
    public C127G LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpTabBarAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/tabbar/PdpTabBarVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(PdpTabBarAssem.class, "pdpBtmManager", "getPdpBtmManager()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/event/btm/IBtmManager;", 0), new C2217381BqS(PdpTabBarAssem.class, "pdpViewModelAbility", "getPdpViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0)};
        LLJJJJJIL = new C1561200qjG();
        LLJJL = C958103op.LIZJ();
    }

    public PdpTabBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpTabBarVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 297), AFwS268S0000000_26.get$arr$(243), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b33;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).unbindAbility(kp(), InterfaceC1752680vi6.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class}).bindAbility(kp(), InterfaceC1752680vi6.class);
    }

    public final C0QSJ hp() {
        C0QSJ c0qsj = this.LLJJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLJJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final InterfaceC1053404Aa ip() {
        InterfaceC1053404Aa interfaceC1053404Aa = this.LLJJIJIIJIL;
        if (interfaceC1053404Aa == null) {
            synchronized (this) {
                interfaceC1053404Aa = this.LLJJIJIIJIL;
                if (interfaceC1053404Aa == null) {
                    C0QSJ c0qsjHp = hp();
                    InterfaceC1053404Aa interfaceC1053404Aa2 = c0qsjHp != null ? (InterfaceC1053404Aa) c0qsjHp.getAbility(InterfaceC1053404Aa.class) : null;
                    this.LLJJIJIIJIL = interfaceC1053404Aa2;
                    return interfaceC1053404Aa2;
                }
            }
        }
        return interfaceC1053404Aa;
    }

    public final PdpTabBarVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (PdpTabBarVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpTabBarVM.class, new AObjectS400S0100000_26(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        super.onViewCreated(view);
        C1203130hPj c1203130hPj = (C1203130hPj) getContentView().findViewById(R.id.q7v);
        this.LLJJIII = c1203130hPj;
        if (c1203130hPj != null) {
            C1744700vVE.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), c1203130hPj);
        }
        C1203130hPj c1203130hPj2 = this.LLJJIII;
        if (c1203130hPj2 != null) {
            c1203130hPj2.setHorizontalMargin(16);
        }
        C1203130hPj c1203130hPj3 = this.LLJJIII;
        if (c1203130hPj3 != null) {
            C0H9H.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), c1203130hPj3);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, LJJIJL().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        HandlerHook.viewPost(LJJIJL(), new ARunnableS13S0201000_6(this, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), new LayerDrawable(new GradientDrawable[]{new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{iIntValue, 0}), new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{iIntValue, 0})}), 6));
        InterfaceC1761670vwb interfaceC1761670vwb = this.LLJJIJIL;
        if (interfaceC1761670vwb == null) {
            synchronized (this) {
                interfaceC1761670vwb = this.LLJJIJIL;
                if (interfaceC1761670vwb == null) {
                    C0QSJ c0qsjHp = hp();
                    if (c0qsjHp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjHp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLJJIJIL = interfaceC1761670vwb;
                }
            }
        }
        PdpViewModel pdpViewModelLX = interfaceC1761670vwb.lX();
        C1755760vn4 c1755760vn4 = new C2217381BqS() { // from class: X.0vn4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCurrentFocusModule();
            }
        };
        C1753080vik c1753080vik = new C2217381BqS() { // from class: X.0vik
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getBodyContent());
            }
        };
        C1752280vhS c1752280vhS = new C2217381BqS() { // from class: X.0vhS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        };
        AwS675S0100000_26 awS675S0100000_26 = new AwS675S0100000_26(this, 18);
        pdpViewModelLX.getClass();
        JediViewModel.ZQ2(pdpViewModelLX, c1755760vn4, c1753080vik, c1752280vhS, null, awS675S0100000_26, 8, null);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0vn2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1755690vmx) obj).LLILLJJLI;
            }
        }, null, new AwS640S0100000_26(this, 73), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0vn3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1755690vmx) obj).LL;
            }
        }, null, new AwS640S0100000_26(this, 74), 6);
        C736680Sv4.LJIIIZ(this, kp(), new C2217381BqS() { // from class: X.0vmy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1755690vmx) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.0vj2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1755690vmx) obj).LLILLL);
            }
        }, null, new AwS675S0100000_26(this, 17), 12);
    }

    public final void lp(TabBarItemVO tabBarItemVO, int i) {
        TabBarTab tabBarTab;
        List<String> list;
        String str;
        Map<String, Object> mapLIZJ;
        InterfaceC1053404Aa interfaceC1053404AaIp;
        List<TabBarTab> list2 = tabBarItemVO.tabBarTabList;
        if (list2 != null && (tabBarTab = (TabBarTab) C13LP.LJJJLZIJ(i, list2)) != null && (list = tabBarTab.facadeIdList) != null && (str = (String) C13LP.LJJJLL(list)) != null) {
            this.LLJJIJI = Integer.valueOf(i);
            String str2 = tabBarItemVO.btmCode;
            if (str2 != null && (interfaceC1053404AaIp = ip()) != null) {
                mapLIZJ = interfaceC1053404AaIp.LIZJ(new C817803Hk(str2, Integer.valueOf(i)));
            } else {
                mapLIZJ = null;
            }
            PdpTabBarVM pdpTabBarVMKp = kp();
            C1748720vbi.LIZLLL(LJJIJL(), new C10516049i(), new AwS45S2100000_26(tabBarItemVO.daInfo, tabBarTab.daInfo, (String) mapLIZJ, (Map<String, ? extends Object>) 11));
            pdpTabBarVMKp.sm1(true);
            InterfaceC1755770vn5 interfaceC1755770vn5 = pdpTabBarVMKp.LL;
            if (interfaceC1755770vn5 != null) {
                interfaceC1755770vn5.On2(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void mp(int i, int i2) {
        List<TabBarTab> list;
        Map<String, Object> mapLJ;
        String str;
        InterfaceC1053404Aa interfaceC1053404AaIp;
        TabBarItemVO tabBarItemVO = ((C1755690vmx) kp().getState()).LLILLJJLI;
        String str2 = null;
        if (tabBarItemVO != null) {
            list = tabBarItemVO.tabBarTabList;
        } else {
            list = null;
        }
        boolean z = true;
        if (list != null && !list.isEmpty() && i != 1 && i != 2 && i2 >= LLJJL) {
            if (tabBarItemVO != null && (str = tabBarItemVO.btmCode) != null && (interfaceC1053404AaIp = ip()) != null) {
                mapLJ = interfaceC1053404AaIp.LJ(str);
            } else {
                mapLJ = null;
            }
            PdpTabBarVM pdpTabBarVMKp = kp();
            View viewLJJIJL = LJJIJL();
            if (tabBarItemVO != null) {
                str2 = tabBarItemVO.daInfo;
            }
            if (!pdpTabBarVMKp.LLILLJJLI) {
                pdpTabBarVMKp.LLILLJJLI = true;
                C1748720vbi.LIZLLL(viewLJJIJL, new C10515049h(), new AwS140S1100000_26(str2, (String) mapLJ, (Map<String, ? extends Object>) 27));
            }
            int i3 = i2 - LLJJL;
            if (i3 < 0) {
                i3 = 0;
            }
            LLJJJJJIL.getClass();
            float fLIZLLL = C13LZ.LIZLLL(i3 / C1561200qjG.LIZ(), 0.0f, 1.0f);
            if (fLIZLLL <= 0.0f) {
                z = false;
            }
            C1203130hPj c1203130hPj = this.LLJJIII;
            if (c1203130hPj != null) {
                C786410Ut5.LLLLLLL(c1203130hPj, 0);
            }
            C1203130hPj c1203130hPj2 = this.LLJJIII;
            if (c1203130hPj2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1203130hPj2);
                c1203130hPj2.setAlpha(fLIZLLL);
            }
            C1203130hPj c1203130hPj3 = this.LLJJIII;
            if (c1203130hPj3 != null) {
                c1203130hPj3.setClickable(z);
            }
            C1203130hPj c1203130hPj4 = this.LLJJIII;
            if (c1203130hPj4 != null) {
                c1203130hPj4.setEnabled(z);
            }
            kp().setState(new AwS38S0001000_26(C1561200qjG.LIZ(), 4));
            return;
        }
        C1203130hPj c1203130hPj5 = this.LLJJIII;
        if (c1203130hPj5 != null) {
            C786410Ut5.LLLLLLL(c1203130hPj5, 8);
        }
        kp().setState(new AwS38S0001000_26(0, 4));
    }
}
