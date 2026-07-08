package com.ss.android.ugc.aweme.story.service;

import X.C01GW;
import X.C098200Yq;
import X.C0SZ8;
import X.C0T1R;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C2246091Cvf;
import X.C2246101Cvg;
import X.C2246111Cvh;
import X.C2246121Cvi;
import X.C452501pT;
import X.InterfaceC1585190rLx;
import X.InterfaceC1616070s9l;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.story.service.StoryMainTrackServiceImpl;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class StoryMainTrackServiceImpl implements StoryMainTrackService {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public WeakReference<C19EG> LIZ;
    public HomeTabAbility LIZIZ;
    public Hox LIZJ;
    public boolean LJFF;
    public int LJI;
    public C2246101Cvg LJII;
    public C2246091Cvf LJIIIIZZ;
    public C2246121Cvi LJIIIZ;
    public IViewPagerComponentAbility LJIIJ;
    public String LIZLLL = "";
    public String LJ = "";
    public String LJIIJJI = "";
    public final C01GW LJIIL = C452501pT.LIZIZ(new C2246111Cvh());
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(131));

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        HomeTabAbility homeTabAbility;
        HomeTabAbility homeTabAbility2;
        C2246101Cvg c2246101Cvg = this.LJII;
        if (c2246101Cvg != null && (homeTabAbility2 = this.LIZIZ) != null) {
            homeTabAbility2.tx0(c2246101Cvg);
        }
        C2246091Cvf c2246091Cvf = this.LJIIIIZZ;
        if (c2246091Cvf != null && (homeTabAbility = this.LIZIZ) != null) {
            homeTabAbility.Ik0(c2246091Cvf);
        }
        C2246121Cvi c2246121Cvi = this.LJIIIZ;
        if (c2246121Cvi != null && (iViewPagerComponentAbility = this.LJIIJ) != null) {
            iViewPagerComponentAbility.Xl0(c2246121Cvi);
        }
        this.LIZJ = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LIZIZ = null;
        this.LIZLLL = "";
        this.LJ = "";
        this.LJFF = false;
        this.LJI = 0;
        this.LJIIJJI = "";
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService
    public final String LJ() {
        return this.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService
    public final void LIZJ(String str) {
        if (Intrinsics.LJFF(str, "notification_page")) {
            return;
        }
        if (Intrinsics.LJFF(this.LJ, "FRIENDS_TAB")) {
            if (this.LJFF) {
                this.LJIIJJI = LJFF(this.LJ, this.LJIIJJI);
            }
        } else if (Intrinsics.LJFF(this.LJ, "HOME") && this.LJFF) {
            this.LJIIJJI = LJFF(this.LIZLLL, this.LJIIJJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService
    public final void LIZLLL(boolean z) {
        IViewPagerComponentAbility iViewPagerComponentAbilityLJI;
        if (z && Intrinsics.LJFF("FRIENDS_TAB", this.LJ) && (iViewPagerComponentAbilityLJI = LJI("FRIENDS_TAB")) != null) {
            this.LJFF = false;
            IViewPagerComponentAbility iViewPagerComponentAbility = this.LJIIJ;
            if (iViewPagerComponentAbility != null) {
                iViewPagerComponentAbility.Xl0(this.LJIIIZ);
            }
            this.LJIIJ = iViewPagerComponentAbilityLJI;
            this.LJI = iViewPagerComponentAbilityLJI.LJIL();
            iViewPagerComponentAbilityLJI.Xl0(this.LJIIIZ);
            iViewPagerComponentAbilityLJI.Bv0(this.LJIIIZ);
        }
    }

    public final IViewPagerComponentAbility LJI(String str) {
        Object c098200Yq;
        Fragment fragmentKi;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        WeakReference<C19EG> weakReference;
        C19EG c19eg;
        if (Intrinsics.LJFF("FRIENDS_TAB", str)) {
            str = "FRIENDS_FEED";
        }
        Object obj = null;
        try {
            if (this.LIZJ == null && (weakReference = this.LIZ) != null && (c19eg = weakReference.get()) != null) {
                this.LIZJ = Hox.LLJILJIL.LIZ(c19eg);
            }
            Hox hox = this.LIZJ;
            if (hox != null && (fragmentKi = hox.Ki(str)) != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragmentKi)) != null) {
                c098200Yq = iFeedPanelPlatformAbilityLIZJ.Mb();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (IViewPagerComponentAbility) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Cvi] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Cvf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0rLx, X.1Cvg] */
    @Override // com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService
    public final void LIZ(C19EG c19eg, HomeTabAbility homeTabAbility) {
        try {
            this.LIZIZ = homeTabAbility;
            this.LIZ = new WeakReference<>(c19eg);
            this.LJIIIZ = new InterfaceC1616070s9l() { // from class: X.1Cvi
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageSelected(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    StoryMainTrackServiceImpl storyMainTrackServiceImpl = this.LL;
                    if (storyMainTrackServiceImpl.LJI == i) {
                        return;
                    }
                    storyMainTrackServiceImpl.LJFF = true;
                    storyMainTrackServiceImpl.LJI = i;
                }
            };
            ?? r1 = new InterfaceC1585190rLx() { // from class: X.1Cvg
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    if (!((List) this.LL.LJIIL.getValue()).contains(str2)) {
                        StoryMainTrackServiceImpl storyMainTrackServiceImpl = this.LL;
                        storyMainTrackServiceImpl.LJIIJJI = "";
                        storyMainTrackServiceImpl.LIZLLL = "";
                        storyMainTrackServiceImpl.LJFF = false;
                        storyMainTrackServiceImpl.LJI = 0;
                        IViewPagerComponentAbility iViewPagerComponentAbility = storyMainTrackServiceImpl.LJIIJ;
                        if (iViewPagerComponentAbility != null) {
                            iViewPagerComponentAbility.Xl0(storyMainTrackServiceImpl.LJIIIZ);
                        }
                        this.LL.LJIIJ = null;
                        return;
                    }
                    StoryMainTrackServiceImpl storyMainTrackServiceImpl2 = this.LL;
                    storyMainTrackServiceImpl2.LIZLLL = str2;
                    if (str != null && ((List) storyMainTrackServiceImpl2.LJIIL.getValue()).contains(str)) {
                        StoryMainTrackServiceImpl storyMainTrackServiceImpl3 = this.LL;
                        storyMainTrackServiceImpl3.LJIIJJI = storyMainTrackServiceImpl3.LJFF(str, storyMainTrackServiceImpl3.LJIIJJI);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityLJI = this.LL.LJI(str2);
                    if (iViewPagerComponentAbilityLJI != null) {
                        StoryMainTrackServiceImpl storyMainTrackServiceImpl4 = this.LL;
                        storyMainTrackServiceImpl4.LJFF = false;
                        IViewPagerComponentAbility iViewPagerComponentAbility2 = storyMainTrackServiceImpl4.LJIIJ;
                        if (iViewPagerComponentAbility2 != null) {
                            iViewPagerComponentAbility2.Xl0(storyMainTrackServiceImpl4.LJIIIZ);
                        }
                        storyMainTrackServiceImpl4.LJIIJ = iViewPagerComponentAbilityLJI;
                        storyMainTrackServiceImpl4.LJI = iViewPagerComponentAbilityLJI.LJIL();
                        iViewPagerComponentAbilityLJI.Xl0(storyMainTrackServiceImpl4.LJIIIZ);
                        iViewPagerComponentAbilityLJI.Bv0(storyMainTrackServiceImpl4.LJIIIZ);
                    }
                }
            };
            this.LJII = r1;
            this.LJIIIIZZ = new InterfaceC1585190rLx() { // from class: X.1Cvf
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    IViewPagerComponentAbility iViewPagerComponentAbilityLJI;
                    if (!((List) this.LL.LJIILIIL.getValue()).contains(str2) || (C319860CgK.LIZ() && Intrinsics.LJFF(str2, "FRIENDS_TAB"))) {
                        StoryMainTrackServiceImpl storyMainTrackServiceImpl = this.LL;
                        storyMainTrackServiceImpl.LJIIJJI = "";
                        storyMainTrackServiceImpl.LJ = "";
                        storyMainTrackServiceImpl.LJFF = false;
                        storyMainTrackServiceImpl.LJI = 0;
                        IViewPagerComponentAbility iViewPagerComponentAbility = storyMainTrackServiceImpl.LJIIJ;
                        if (iViewPagerComponentAbility != null) {
                            iViewPagerComponentAbility.Xl0(storyMainTrackServiceImpl.LJIIIZ);
                        }
                        this.LL.LJIIJ = null;
                        return;
                    }
                    this.LL.LJ = str2;
                    if (str != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -1382453013) {
                            if (iHashCode != -734952021) {
                                if (iHashCode == 2223327 && str.equals("HOME")) {
                                    StoryMainTrackServiceImpl storyMainTrackServiceImpl2 = this.LL;
                                    storyMainTrackServiceImpl2.LJIIJJI = storyMainTrackServiceImpl2.LJFF(storyMainTrackServiceImpl2.LIZLLL, storyMainTrackServiceImpl2.LJIIJJI);
                                }
                            } else if (str.equals("FRIENDS_TAB") && !C319860CgK.LIZ()) {
                                StoryMainTrackServiceImpl storyMainTrackServiceImpl3 = this.LL;
                                storyMainTrackServiceImpl3.LJIIJJI = storyMainTrackServiceImpl3.LJFF(str, storyMainTrackServiceImpl3.LJIIJJI);
                            }
                        } else if (str.equals("NOTIFICATION")) {
                            this.LL.LJIIJJI = "";
                        }
                    }
                    int iHashCode2 = str2.hashCode();
                    if (iHashCode2 != -1382453013) {
                        if (iHashCode2 != -734952021) {
                            if (iHashCode2 == 2223327 && str2.equals("HOME")) {
                                StoryMainTrackServiceImpl storyMainTrackServiceImpl4 = this.LL;
                                IViewPagerComponentAbility iViewPagerComponentAbilityLJI2 = storyMainTrackServiceImpl4.LJI(storyMainTrackServiceImpl4.LIZLLL);
                                if (iViewPagerComponentAbilityLJI2 != null) {
                                    StoryMainTrackServiceImpl storyMainTrackServiceImpl5 = this.LL;
                                    storyMainTrackServiceImpl5.LJFF = false;
                                    IViewPagerComponentAbility iViewPagerComponentAbility2 = storyMainTrackServiceImpl5.LJIIJ;
                                    if (iViewPagerComponentAbility2 != null) {
                                        iViewPagerComponentAbility2.Xl0(storyMainTrackServiceImpl5.LJIIIZ);
                                    }
                                    storyMainTrackServiceImpl5.LJIIJ = iViewPagerComponentAbilityLJI2;
                                    storyMainTrackServiceImpl5.LJI = iViewPagerComponentAbilityLJI2.LJIL();
                                    iViewPagerComponentAbilityLJI2.Xl0(storyMainTrackServiceImpl5.LJIIIZ);
                                    iViewPagerComponentAbilityLJI2.Bv0(storyMainTrackServiceImpl5.LJIIIZ);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if (!str2.equals("FRIENDS_TAB") || (iViewPagerComponentAbilityLJI = this.LL.LJI(str2)) == null) {
                            return;
                        }
                        StoryMainTrackServiceImpl storyMainTrackServiceImpl6 = this.LL;
                        storyMainTrackServiceImpl6.LJFF = false;
                        IViewPagerComponentAbility iViewPagerComponentAbility3 = storyMainTrackServiceImpl6.LJIIJ;
                        if (iViewPagerComponentAbility3 != null) {
                            iViewPagerComponentAbility3.Xl0(storyMainTrackServiceImpl6.LJIIIZ);
                        }
                        storyMainTrackServiceImpl6.LJIIJ = iViewPagerComponentAbilityLJI;
                        storyMainTrackServiceImpl6.LJI = iViewPagerComponentAbilityLJI.LJIL();
                        iViewPagerComponentAbilityLJI.Xl0(storyMainTrackServiceImpl6.LJIIIZ);
                        iViewPagerComponentAbilityLJI.Bv0(storyMainTrackServiceImpl6.LJIIIZ);
                        return;
                    }
                    if (!str2.equals("NOTIFICATION")) {
                        return;
                    }
                    StoryMainTrackServiceImpl storyMainTrackServiceImpl7 = this.LL;
                    storyMainTrackServiceImpl7.LJFF = false;
                    IViewPagerComponentAbility iViewPagerComponentAbility4 = storyMainTrackServiceImpl7.LJIIJ;
                    if (iViewPagerComponentAbility4 != null) {
                        iViewPagerComponentAbility4.Xl0(storyMainTrackServiceImpl7.LJIIIZ);
                    }
                    StoryMainTrackServiceImpl storyMainTrackServiceImpl8 = this.LL;
                    storyMainTrackServiceImpl8.LJIIJ = null;
                    storyMainTrackServiceImpl8.LJI = 0;
                }
            };
            if (homeTabAbility != 0) {
                homeTabAbility.ao(r1);
            }
            C2246091Cvf c2246091Cvf = this.LJIIIIZZ;
            if (c2246091Cvf != null && homeTabAbility != 0) {
                homeTabAbility.UC1(c2246091Cvf);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCreate, initTopTabName = ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append("， initBottomTabName = ");
            sbLIZ.append(this.LJ);
            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("StoryMainTrackService", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final String LJFF(String str, String str2) {
        Object c098200Yq;
        C0SZ8 c0sz8LJLIL;
        Aweme awemeLJIIIIZZ;
        try {
            IViewPagerComponentAbility iViewPagerComponentAbilityLJI = LJI(str);
            if (iViewPagerComponentAbilityLJI != null && (c0sz8LJLIL = iViewPagerComponentAbilityLJI.LJLIL()) != null && (awemeLJIIIIZZ = c0sz8LJLIL.LJIIIIZZ()) != null) {
                c098200Yq = awemeLJIIIIZZ.getAid();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = str2;
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str3 = (String) obj;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService
    public final void LIZIZ(String str, String str2, boolean z) {
        if (!Intrinsics.LJFF(str2, this.LJ)) {
            return;
        }
        if ((Intrinsics.LJFF(str2, "HOME") && !Intrinsics.LJFF(str, this.LIZLLL)) || !z) {
            return;
        }
        this.LJFF = true;
    }
}
