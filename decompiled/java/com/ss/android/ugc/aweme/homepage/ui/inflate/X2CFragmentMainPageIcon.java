package com.ss.android.ugc.aweme.homepage.ui.inflate;

import X.AbstractC1592930rYR;
import X.AnonymousClass0716;
import X.C0CN5;
import X.C1388190mED;
import X.C1582020rGq;
import X.C1591220rVg;
import X.C1591440rW2;
import X.C1592100rX6;
import X.C1592200rXG;
import X.C1592210rXH;
import X.C1592450rXf;
import X.C1592940rYS;
import X.C1592950rYT;
import X.C1592980rYW;
import X.C1592990rYX;
import X.C1593700rZg;
import X.C1593730rZj;
import X.C1619460sFE;
import X.C19EG;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C285090BFj;
import X.C786410Ut5;
import X.C799710VYr;
import X.C799900VZk;
import X.EnumC799980VZs;
import X.InterfaceC1583870rJp;
import X.InterfaceC1584260rKS;
import Y.ARunnableS124S0100000_24;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class X2CFragmentMainPageIcon implements IFragmentMainPageIcon {
    public final Map<String, C1592950rYT> LL = new ConcurrentHashMap();
    public C1593700rZg LLILLJJLI;
    public C1592450rXf LLILLL;
    public Integer LLILZ;

    @Override // X.InterfaceC799850VZf
    public final int LIZJ() {
        return R.style.xm;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "X2CFragmentMainPageIcon";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C799710VYr.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon
    public final boolean LJIIJJI() {
        return ((Boolean) C285090BFj.LIZIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC799850VZf
    public final Class<? extends Activity> LIZIZ() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getHomePageInflateActivityClass();
    }

    @Override // X.InterfaceC800080Va2
    public final EnumC799980VZs triggerType() {
        return EnumC799980VZs.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon
    public final C1592950rYT LIZLLL(String str) {
        Map<String, C1592950rYT> map = this.LL;
        if (map != null) {
            C1592950rYT c1592950rYT = (C1592950rYT) ((ConcurrentHashMap) map).remove(str);
            if (c1592950rYT != null && c1592950rYT.getParent() != null) {
                C786410Ut5.LJJJLZIJ(c1592950rYT, (ViewGroup) c1592950rYT.getParent());
            }
            return c1592950rYT;
        }
        return null;
    }

    @Override // X.InterfaceC799850VZf
    public final void LJII(Activity activity, Context context) {
        if (context == null && activity == null) {
            return;
        }
        C1592950rYT c1592950rYT = null;
        if (activity == null) {
            if (context != null) {
                activity = C1388190mED.LIZ(context);
            } else {
                activity = null;
            }
        }
        try {
            C1582020rGq.LIZJ("scene_top_tab_inflate_preload");
            if (C285090BFj.LJIIIZ() && (activity instanceof C19EG)) {
                C1592450rXf c1592450rXf = new C1592450rXf(activity);
                this.LLILLL = c1592450rXf;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
                HomeTabViewModel homeTabViewModelLIZ = HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ);
                List<InterfaceC1583870rJp> listLZ1 = homeTabViewModelLIZ.lZ1(false);
                MainTabStrip.LLJLLIL.getClass();
                Integer numValueOf = Integer.valueOf(C1591440rW2.LIZIZ((C19EG) activity));
                this.LLILZ = numValueOf;
                if (numValueOf != null) {
                    c1592450rXf.setTextSize(numValueOf.intValue());
                }
                for (InterfaceC1583870rJp interfaceC1583870rJp : listLZ1) {
                    MainTabStrip.LLJLLIL.getClass();
                    C1591440rW2.LIZ(c1592450rXf, interfaceC1583870rJp, homeTabViewModelLIZ);
                }
                MainTabStrip.LLJLLIL.getClass();
                C1591440rW2.LIZJ(c19egLIZIZ);
            }
            C1582020rGq.LIZ("scene_top_tab_inflate_preload");
            C1582020rGq.LIZJ("scene_bottom_tab_inflate_preload");
            List<InterfaceC1583870rJp> listVy = HomeTabViewModel.LLILZIL.LIZ((C19EG) activity).vy();
            if (((Boolean) C285090BFj.LIZIZ.getValue()).booleanValue()) {
                C799900VZk c799900VZk = C799900VZk.LIZ;
                PreDrawableInflate preDrawableInflate = new PreDrawableInflate();
                c799900VZk.getClass();
                C799900VZk.LIZLLL.LIZ("PreDrawableInflate", preDrawableInflate);
                boolean zLJIIIIZZ = C285090BFj.LJIIIIZZ();
                int size = listVy.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1583870rJp interfaceC1583870rJp2 = listVy.get(i);
                    if (interfaceC1583870rJp2 instanceof InterfaceC1584260rKS) {
                        C1592950rYT c1592950rYT2 = new C1592950rYT(((InterfaceC1584260rKS) interfaceC1583870rJp2).LJIILL());
                        String strTag = interfaceC1583870rJp2.tag();
                        Map<String, C1592950rYT> map = this.LL;
                        if (map != null) {
                            ((ConcurrentHashMap) map).put(strTag, c1592950rYT2);
                        }
                        if (zLJIIIIZZ) {
                            if (TextUtils.equals("PUBLISH", strTag)) {
                                if (((Boolean) C285090BFj.LJLLI.getValue()).booleanValue()) {
                                    C0CN5.LIZJ(Long.valueOf(((Number) C285090BFj.LJLL.getValue()).longValue()), new ARunnableS124S0100000_24(c1592950rYT2, 170), false);
                                } else {
                                    C1592100rX6.LIZ.getClass();
                                    c1592950rYT2.setIconTabLogic(C1592100rX6.LIZ(c1592950rYT2));
                                }
                            } else if (TextUtils.equals("INCENTIVE_COIN", strTag)) {
                                c1592950rYT2.setIconTabLogic(new C1619460sFE(c1592950rYT2));
                            } else if (TextUtils.equals("Nearby", strTag)) {
                                c1592950rYT2.setIconTabLogic(new C1592990rYX(c1592950rYT2));
                            } else if (TextUtils.equals("NOTIFICATION", strTag)) {
                                c1592950rYT2.setIconTabLogic(new C1592210rXH(c1592950rYT2));
                            } else if (TextUtils.equals("SHOP_MALL", strTag)) {
                                c1592950rYT2.setIconTabLogic(new C1592980rYW(c1592950rYT2));
                            } else if (TextUtils.equals("FRIENDS_TAB", strTag) && C1591220rVg.LIZ()) {
                                c1592950rYT2.setIconTabLogic(new C1592200rXG(c1592950rYT2));
                            } else {
                                C1593730rZj c1593730rZj = C1593730rZj.LIZIZ;
                                if (c1593730rZj.LIZIZ(c1592950rYT2, strTag) instanceof AbstractC1592930rYR) {
                                    c1592950rYT2.setIconTabLogic((AbstractC1592930rYR) c1593730rZj.LIZIZ(c1592950rYT2, strTag));
                                } else if (!interfaceC1583870rJp2.LJIIIZ()) {
                                    c1592950rYT2.setIconTabLogic(new C1592940rYS(c1592950rYT2));
                                }
                            }
                        }
                        C2271391DvN.LIZ(c1592950rYT2, (C1A5L) C2271381DvM.LJJJ.getValue());
                    }
                }
            }
            Map<String, C1592950rYT> map2 = this.LL;
            if (map2 != null) {
                c1592950rYT = (C1592950rYT) ((ConcurrentHashMap) map2).get("PUBLISH");
            }
            if (((Boolean) C285090BFj.LIZLLL.getValue()).booleanValue() && c1592950rYT != null) {
                this.LLILLJJLI = new C1593700rZg(activity, c1592950rYT);
            }
            if (((Boolean) AnonymousClass0716.LJJIFFI.getValue()).booleanValue()) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).specialPlusService().isNeedShowSpecialPlusDirect();
            }
            C1582020rGq.LIZ("scene_bottom_tab_inflate_preload");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
