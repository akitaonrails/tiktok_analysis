package com.ss.android.ugc.aweme.main;

import X.AbstractC738140SxQ;
import X.AbstractC813200VvC;
import X.C083S;
import X.C08TN;
import X.C098200Yq;
import X.C0CN5;
import X.C0DMT;
import X.C0QSJ;
import X.C0X35;
import X.C10S5;
import X.C14EU;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1563090qmJ;
import X.C1570120qxe;
import X.C1570300qxw;
import X.C1581630rGD;
import X.C1581650rGF;
import X.C1581670rGH;
import X.C1581690rGJ;
import X.C1582020rGq;
import X.C1584420rKi;
import X.C1591530rWB;
import X.C1591880rWk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C285090BFj;
import X.C308240C6k;
import X.C673150Qan;
import X.C679360Qko;
import X.C687700QyG;
import X.C688120Qyw;
import X.C723850SaN;
import X.C724240Sb0;
import X.C740740T3w;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1581590rG9;
import X.InterfaceC1581600rGA;
import X.InterfaceC1581610rGB;
import X.InterfaceC1581620rGC;
import X.InterfaceC1581730rGN;
import X.InterfaceC1587410rPX;
import X.InterfaceC1589720rTG;
import X.InterfaceC1589760rTK;
import X.InterfaceC1593630rZZ;
import X.InterfaceC1617760sCU;
import X.InterfaceC20660615sy;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC752360TfG;
import Y.AObjectS383S0100000_8;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS29S1100000_24;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class MainFragment extends AmeBaseFragment implements InterfaceC1055110dYz, InterfaceC1593630rZZ, InterfaceC1617760sCU, InterfaceC1589760rTK, C10S5, InterfaceC20660615sy, IMFAbility, InterfaceC1581730rGN, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7HELIOSLCI2ZigtICF9BSQlJwkhKSIhLCEn";
    public ViewGroup LL;
    public FrameLayout LLILLJJLI;
    public InterfaceC1589720rTG LLILLL;
    public ITabStrip LLILZ;
    public View LLILZIL;
    public FrameLayout LLILZLL;
    public final C1591880rWk LLIZ;
    public C1581690rGJ LLIZLLLIL;
    public final InterfaceC1581590rG9 LLJ;
    public ArrayList<View> LLJI;
    public InterfaceC1581620rGC LLJIJIL;
    public InterfaceC665370Q7z LLJILJIL;
    public BPEAHandler LLJILJILJ;
    public ARunnableS124S0100000_24 LLJILLL;
    public boolean LLJJ;
    public MainFragmentBusinessAbility LLJJI;
    public IMFFeedAbility LLJJIII;

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final MainFragment Uo1() {
        return this;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == MainFragmentBusinessAbility.class) {
            this.LLJJI = (MainFragmentBusinessAbility) obj;
        } else if (cls == IMFFeedAbility.class) {
            this.LLJJIII = (IMFFeedAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == MainFragmentBusinessAbility.class) {
            return this.LLJJI;
        }
        if (cls == IMFFeedAbility.class) {
            return this.LLJJIII;
        }
        return null;
    }

    @Override // X.C10S5, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b2001";
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "HOME";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "home";
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.C10S5
    public final String pO() {
        return "MainTabPage";
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 548277498) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == MainFragmentBusinessAbility.class) {
            this.LLJJI = null;
        } else if (cls == IMFFeedAbility.class) {
            this.LLJJIII = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final int ED0() {
        C1581690rGJ c1581690rGJ = this.LLIZLLLIL;
        if (c1581690rGJ == null || this.LLILLL == null) {
            return -1;
        }
        return c1581690rGJ.Im(1, false);
    }

    @Override // X.InterfaceC1593630rZZ
    /* JADX INFO: renamed from: MR, reason: merged with bridge method [inline-methods] */
    public final FeedFragment ux() {
        C1581690rGJ c1581690rGJ = this.LLIZLLLIL;
        if (c1581690rGJ == null) {
            return null;
        }
        return (FeedFragment) c1581690rGJ.getCurrentFragment();
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final C1570300qxw Q61() {
        return new C1570300qxw(this.LLIZLLLIL, this.LLILZ);
    }

    @Override // X.InterfaceC1593630rZZ, X.InterfaceC1617760sCU
    public final String f3() {
        InterfaceC1589720rTG interfaceC1589720rTG;
        int iVd;
        C1581690rGJ c1581690rGJ = this.LLIZLLLIL;
        return (c1581690rGJ == null || (interfaceC1589720rTG = this.LLILLL) == null || (iVd = c1581690rGJ.Vd(interfaceC1589720rTG.getCurrentItemCompat(), false)) == 0) ? "homepage_hot" : iVd == 1 ? "homepage_follow" : iVd == 33 ? "homepage_popular" : iVd == 31 ? "homepage_friends" : iVd == 7 ? "homepage_nearby" : iVd == 35 ? "homepage_explore" : C1591530rWB.LIZIZ.H7(iVd) ? Hox.AQ2(requireActivity()).BQ2() : iVd == 36 ? "homepage_topic_stem" : iVd == 45 ? "homepage_series" : iVd == 37 ? "homepage_live" : iVd == 39 ? "homepage_playmode_new" : iVd == 197 ? "homepage_playmode_top" : iVd == 41 ? "homepage_playmode_moodboost" : iVd == 43 ? this.LLIZLLLIL.LIZJ(this.LLILLL.getCurrentItemCompat()) : "homepage_hot";
    }

    @Override // X.InterfaceC1617760sCU, com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final Fragment getCurrentFragment() {
        return this.LLIZLLLIL.getCurrentFragment();
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final int getCurrentItemCompat() {
        InterfaceC1589720rTG interfaceC1589720rTG;
        C1581690rGJ c1581690rGJ = this.LLIZLLLIL;
        if (c1581690rGJ == null || (interfaceC1589720rTG = this.LLILLL) == null) {
            return -1;
        }
        return c1581690rGJ.Vd(interfaceC1589720rTG.getCurrentItemCompat(), false);
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final InterfaceC752360TfG mb() {
        return this.LLJ.mb();
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final boolean o21() {
        return (this.LLILLL == null || this.LLIZLLLIL == null) ? false : true;
    }

    @Override // X.InterfaceC1581730rGN
    public final View yC() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            return viewGroup.findViewById(R.id.m5d);
        }
        return null;
    }

    public MainFragment() {
        C1591880rWk c1591880rWk = C1591880rWk.LIZIZ;
        this.LLIZ = c1591880rWk;
        this.LLJ = c1591880rWk.LJII();
        this.LLJJ = false;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean AN() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 36) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean Fp() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 45) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean Ik() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 0) ? false : true;
    }

    public final Aweme LJIIIIZZ() {
        if (getActivity() == null) {
            return null;
        }
        return C740740T3w.LJFF(getActivity());
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean MO() {
        FeedFragment feedFragmentUx = ux();
        if (feedFragmentUx == null) {
            return false;
        }
        return feedFragmentUx instanceof FeedFollowFragment;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean Qc() {
        FeedFragment feedFragmentUx = ux();
        if (feedFragmentUx == null) {
            return false;
        }
        return feedFragmentUx instanceof InterfaceC1587410rPX;
    }

    @Override // X.InterfaceC1593630rZZ
    public final String T() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        FollowTabAbility followTabAbility;
        return (getActivity() == null || (interfaceC665370Q7z = this.LLJILJIL) == null || (followTabAbility = (FollowTabAbility) C1558520qew.LIZ(interfaceC665370Q7z, FollowTabAbility.class, null)) == null) ? "" : followTabAbility.Q21();
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean UH() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 7) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean VJ() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 41) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean Vp() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 1) ? false : true;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && Hox.AQ2(getActivity()).LQ2("HOME");
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(getContext(), IMainSAFLifecycleKt.requireMainSAFLifecycle(getActivity()), null);
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean i6() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 39) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean iH() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 197) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean lm() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 35) ? false : true;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean o9() {
        FeedFragment feedFragmentUx = ux();
        if (feedFragmentUx == null) {
            return false;
        }
        return feedFragmentUx instanceof FeedRecommendFragment;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        InterfaceC1581620rGC interfaceC1581620rGC = this.LLJIJIL;
        if (interfaceC1581620rGC != null) {
            interfaceC1581620rGC.onDestroy();
        }
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LIZ();
        C1558520qew.LJIIJJI(this.LLJILJIL, IMFAbility.class, null);
        if (C285090BFj.LIZJ()) {
            this.LLJILJILJ.removeCallbacks(this.LLJILLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
        C1570120qxe.LIZ(requireActivity()).getClass();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainFragment.onResume():void");
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean q8() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        if (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null) {
            return false;
        }
        return homeViewPagerAbilityLIZIZ.ZF2() ? homeViewPagerAbilityLIZIZ.gk1() == 31 : homeViewPagerAbilityLIZIZ.lV1() == 31;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean tQ() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        return (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null || homeViewPagerAbilityLIZIZ.gk1() != 33) ? false : true;
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC1593630rZZ
    public final int yv() {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        if (this.LLIZLLLIL == null || this.LLILLL == null || homeViewPagerAbilityLIZIZ == null) {
            return -1;
        }
        return homeViewPagerAbilityLIZIZ.gk1();
    }

    @Override // X.InterfaceC1589760rTK
    public final InterfaceC665370Q7z at() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final C1581690rGJ en1() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility
    public final ITabStrip t60() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1593630rZZ
    public final boolean CI(int i) {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        if (this.LLIZLLLIL != null && this.LLILLL != null && homeViewPagerAbilityLIZIZ != null && homeViewPagerAbilityLIZIZ.gk1() == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1589760rTK
    public final void Ti(int i) {
        HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
        if (homeViewPagerAbilityLIZIZ != null) {
            homeViewPagerAbilityLIZIZ.Ti(1);
        }
    }

    @Override // X.InterfaceC1593630rZZ
    public final void bP(int i) {
        int i2;
        if (this.LLILLL != null && this.LLIZLLLIL != null) {
            if (ComplianceServiceProvider.LJIL().LJJJJZI() && i == 0 && Ik()) {
                i = this.LLILLL.getCurrentItemCompat();
            }
            if (i == 0) {
                i2 = 1;
            } else if (i == 1) {
                i2 = 0;
            } else if (i == EnumC1570580qyO.DRAMA_TAB.getValue()) {
                i2 = 45;
            } else {
                i2 = -1;
            }
            HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
            if (homeViewPagerAbilityLIZIZ != null) {
                homeViewPagerAbilityLIZIZ.sZ(i2, true);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C1558360qeg.LIZIZ(this, null);
        IToolsBusinessService iToolsBusinessService = (IToolsBusinessService) PluggableExtentionKt.pluggableSpi(IToolsBusinessService.class);
        if (iToolsBusinessService != null) {
            this.LLJIJIL = iToolsBusinessService.getAvApiFragmentObserver(this);
        }
        this.LLJIJIL.onAttach();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IDowngradeApi iDowngradeApi;
        super.onCreate(bundle);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        this.LLJILJIL = interfaceC665370Q7zLJFF;
        C1558520qew.LJII(interfaceC665370Q7zLJFF, this, IMFAbility.class, null, null);
        EventBus.LIZLLL().LJIJJ(this);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C19EG c19egRequireActivity = requireActivity();
        if (c19egRequireActivity != null && childFragmentManager != null) {
            childFragmentManager.LJZL(new C1581670rGH(c19egRequireActivity), false);
        }
        this.LLJIJIL.onCreate();
        List<C0DMT> list = C1582020rGq.LIZ;
        getChildFragmentManager().LJZL(new AbstractC813200VvC(this) { // from class: X.0rUJ
            public final HomeTabAbility LL;

            {
                HomeTabAbility homeTabAbilityLIZ;
                MainActivityScope mainActivityScopeLIZIZ = C0S4U.LIZIZ(this);
                if (mainActivityScopeLIZIZ != null) {
                    homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZIZ);
                } else {
                    homeTabAbilityLIZ = null;
                }
                this.LL = homeTabAbilityLIZ;
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                String strPz;
                super.onFragmentResumed(fragmentManager, fragment);
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    HomeTabAbility homeTabAbility = this.LL;
                    if (homeTabAbility != null) {
                        strPz = homeTabAbility.pz(fragment);
                    } else {
                        strPz = null;
                    }
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_RESUME);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                String strPz;
                super.onFragmentAttached(fragmentManager, fragment, context);
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    HomeTabAbility homeTabAbility = this.LL;
                    if (homeTabAbility != null) {
                        strPz = homeTabAbility.pz(fragment);
                    } else {
                        strPz = null;
                    }
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_ATTACH);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle2) {
                String strPz;
                HomeTabAbility homeTabAbility = this.LL;
                String strPz2 = null;
                if (homeTabAbility != null) {
                    strPz = homeTabAbility.pz(fragment);
                } else {
                    strPz = null;
                }
                if (Intrinsics.LJFF(strPz, "For You")) {
                    C1582020rGq.LIZIZ("stage_fyp_fragment_on_create");
                }
                C1582020rGq.LIZLLL("scene_tab_fragment_on_create");
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    HomeTabAbility homeTabAbility2 = this.LL;
                    if (homeTabAbility2 != null) {
                        strPz2 = homeTabAbility2.pz(fragment);
                    }
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz2, EnumC1593230rYv.ON_CREATE);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle2) {
                String strPz;
                HomeTabAbility homeTabAbility = this.LL;
                if (homeTabAbility != null) {
                    strPz = homeTabAbility.pz(fragment);
                } else {
                    strPz = null;
                }
                if (Intrinsics.LJFF(strPz, "For You")) {
                    C1582020rGq.LIZIZ("stage_fyp_fragment_on_view_created");
                }
                C1582020rGq.LIZLLL("scene_tab_fragment_on_view_created");
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_VIEW_CREATED);
                }
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS29S1100000_24(view, strPz, 7));
            }
        }, false);
        int iHashCode = hashCode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("main fragment onAttach: ");
        sbLIZ.append(iHashCode);
        C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1581650rGF.LIZJ++;
        C19EG activity = getActivity();
        if (activity != null && (iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi(IDowngradeApi.class)) != null) {
            iDowngradeApi.LJI(new AObjectS383S0100000_8(activity, 0));
        }
    }

    @C14EU
    public void onLiveCleanEvent(C083S c083s) {
        float f;
        if (!isViewValid()) {
            return;
        }
        if (this.LLJI == null) {
            this.LLJI = new ArrayList<>(Arrays.asList(this.LLILZIL, this.LLILLJJLI, this.LLILZLL, null, null));
        }
        if (!c083s.LIZ) {
            f = 0.0f;
            for (View view : this.LLJI) {
                if (view != null) {
                    try {
                        C679360Qko.LIZIZ(view, view.getAlpha(), 0.0f, 300L);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2344809Gs.LIZ(e);
                    }
                }
            }
        } else {
            f = 1.0f;
            if (c083s.LIZIZ > 0) {
                for (View view2 : this.LLJI) {
                    if (view2 != null) {
                        try {
                            C679360Qko.LIZIZ(view2, view2.getAlpha(), 1.0f, c083s.LIZIZ);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C2344809Gs.LIZ(e2);
                        }
                    }
                }
            } else {
                for (View view3 : this.LLJI) {
                    if (view3 != null) {
                        try {
                            C786410Ut5.T4(view3, 1.0f);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            C2344809Gs.LIZ(e3);
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveCleanEvent, toAlpha: ");
        sbLIZ.append(f);
        C308240C6k.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ), c083s.LIZ);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1581610rGB) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1581610rGB) it2.next()).onNodeHide(bundle);
            }
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1581610rGB) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1581610rGB) it2.next()).onNodeShow(bundle);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onPlayerControllerRenderFirstFrameEvent(C1584420rKi c1584420rKi) {
        if (C285090BFj.LIZJ() && !this.LLJJ) {
            this.LLJJ = true;
            this.LLJILJILJ.removeCallbacks(this.LLJILLL);
            C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 133), 3);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        super.onViewStateRestored(bundle);
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1581600rGA) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1581600rGA) it2.next()).xh(this, bundle);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        C0X35.LIZ("cold_boot_main_fragment_view_created", true);
        this.LL = (ViewGroup) view.findViewById(R.id.i9v);
        this.LLILLJJLI = (FrameLayout) view.findViewById(R.id.rnx);
        this.LLILLL = (InterfaceC1589720rTG) view.findViewById(R.id.viewpager);
        this.LLILZIL = view.findViewById(R.id.w0u);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.tpm);
        this.LLILZLL = frameLayout;
        this.LLILZ = this.LLIZ.LJIJJLI(frameLayout);
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = new C1581690rGJ(this, new C1581630rGD(this));
        C08TN.LIZ().LJ("main_fragment_apply_assem", false);
        C723850SaN.LIZ(this, false, null, new C1563090qmJ(this, bundle), 3);
        if (C285090BFj.LIZJ()) {
            if (C0CN5.LJII()) {
                C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 133), 3);
            } else {
                if (this.LLJILJILJ == null) {
                    this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
                }
                if (this.LLJILLL == null) {
                    this.LLJILLL = new ARunnableS124S0100000_24(this, 39);
                }
                this.LLJJ = false;
                C786410Ut5.LJLIIL(2500L, this.LLJILJILJ, this.LLJILLL);
            }
        }
        C08TN.LIZ().LJI("main_fragment_apply_assem");
        AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(this);
        if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1581600rGA) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1581600rGA) it2.next()).LLZLLLL(view, bundle);
            }
        }
        C0X35.LJIIJJI("cold_boot_main_fragment_view_created", true);
        List<Fragment> listLJJLIIIJL = getChildFragmentManager().LJJLIIIJL();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJL, 10));
        Iterator<Fragment> it3 = listLJJLIIIJL.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getClass().getSimpleName());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("main fragment onViewCreated: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ");
        sbLIZ.append(arrayList2);
        C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1581650rGF.LIZLLL++;
        C1581650rGF.LIZIZ = arrayList2;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0X35.LIZ("cold_boot_main_fragment_create_view", true);
        C0X35.LIZJ("cold_boot_main_resume_to_focus", "main_resume_main_fragment");
        View viewLIZ = this.LLJ.LIZ(this, layoutInflater);
        C0X35.LJIIJJI("cold_boot_main_fragment_create_view", true);
        C19GS c19gs = null;
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
