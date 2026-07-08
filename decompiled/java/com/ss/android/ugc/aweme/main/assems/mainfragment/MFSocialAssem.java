package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C01GW;
import X.C0CM3;
import X.C0CME;
import X.C0CMJ;
import X.C0QSJ;
import X.C13BV;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1557810qdn;
import X.C1558150qeL;
import X.C1558520qew;
import X.C1558700qfE;
import X.C1564180qo4;
import X.C1564190qo5;
import X.C1564220qo8;
import X.C1570320qxy;
import X.C1570330qxz;
import X.C1580330rE7;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C285090BFj;
import X.C312240CLu;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1564200qo6;
import X.InterfaceC1570980qz2;
import X.InterfaceC1581600rGA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol;
import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class MFSocialAssem extends UIContentAssem implements IMFSocialAbility, IMFIconsProtocol, InterfaceC1581600rGA, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public String LLIZLLLIL;
    public C1570330qxz LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public SlideGuideController LLJJ;
    public View LLJJI;
    public volatile HomeViewPagerAbility LLJJIJI;
    public InterfaceC665370Q7z LLJJIJIIJIL;
    public C0QSJ LLJJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1558700qfE(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1564180qo4(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C1557810qdn(this));
    public final AwS568S0100000_24 LLJJIII = new AwS568S0100000_24(this, 722);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFSocialAssem.class, "knitHomeViewPageAbility", "getKnitHomeViewPageAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1581600rGA
    public final void LLZLLLL(View view, Bundle bundle) {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final void Pm1() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final void me0() {
        this.LLJI = false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1534603512) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1581600rGA
    public final void xh(Fragment fragment, Bundle bundle) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility Go() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = r4.LLJJIJI
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = r4.LLJJIJI     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJIJIIJIL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIIJIL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIJIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility r0 = (com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJIJI = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem.Go():com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final String dI0() {
        String str = this.LLIZLLLIL;
        this.LLIZLLLIL = "";
        return str;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final List<InterfaceC1570980qz2> gD2() {
        return Collections.singletonList(new InterfaceC1570980qz2() { // from class: X.0qo9
            @Override // X.InterfaceC1570980qz2
            public final void LIZ() {
            }

            @Override // X.InterfaceC1570980qz2
            public final void T1() {
            }

            @Override // X.InterfaceC1570980qz2
            public final void j6() {
            }

            @Override // X.InterfaceC1570980qz2
            public final InterfaceC1570900qyu LIZJ() {
                return (InterfaceC1570900qyu) this.LL.LLJILJILJ.getValue();
            }

            @Override // X.InterfaceC1570980qz2
            public final String LIZLLL() {
                return EnumC1584350rKb.DM_NOTICE.getTag();
            }

            @Override // X.InterfaceC1570980qz2
            public final MFLeftIconPriority LJ() {
                return MFLeftIconPriority.DEFAULT;
            }
        });
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMFIconsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1580330rE7.LJ.remove(this.LLJJIII);
        this.LLJJI = null;
        InterfaceC1564200qo6 interfaceC1564200qo6 = (InterfaceC1564200qo6) this.LLJILJILJ.getValue();
        if (interfaceC1564200qo6 != null) {
            interfaceC1564200qo6.onDestroyView();
        }
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        InterfaceC1564200qo6 interfaceC1564200qo6 = (InterfaceC1564200qo6) this.LLJILJILJ.getValue();
        if (interfaceC1564200qo6 != null) {
            interfaceC1564200qo6.onResume();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final List<InterfaceC1570980qz2> Ji0() {
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final C1570330qxz fa1() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility
    public final boolean gD1() {
        return this.LLJI;
    }

    @C14EU
    public final void onFollowBubbleShowEvent(C1564190qo5 c1564190qo5) {
        this.LLIZLLLIL = c1564190qo5.LIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = view;
        C1580330rE7.LJ.add(this.LLJJIII);
        HomeViewPagerAbility homeViewPagerAbilityGo = Go();
        if (homeViewPagerAbilityGo != null) {
            homeViewPagerAbilityGo.LLJJI(new C1564220qo8() { // from class: X.0qo7
                @Override // X.C1564220qo8, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    HomeViewPagerAbility homeViewPagerAbilityGo2;
                    MFSocialAssem mFSocialAssem = this.LL;
                    mFSocialAssem.getClass();
                    if (C0S4G.LIZ() && !mFSocialAssem.LLJIJIL) {
                        mFSocialAssem.LLJIJIL = true;
                        Context context = mFSocialAssem.getContext();
                        if (context != null) {
                            if (C297720Bli.LIZ()) {
                                homeViewPagerAbilityGo2 = mFSocialAssem.Go();
                            } else {
                                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(mFSocialAssem);
                                if (interfaceC665370Q7zLJIIL != null) {
                                    homeViewPagerAbilityGo2 = (HomeViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, HomeViewPagerAbility.class, null);
                                }
                            }
                            if (homeViewPagerAbilityGo2 != null) {
                                homeViewPagerAbilityGo2.setBackgroundColor(C446980Hfs.LIZ(context, R.color.fw));
                            }
                        }
                    }
                    SlideGuideController slideGuideController = this.LL.LLJJ;
                    if (slideGuideController != null) {
                        slideGuideController.onPageScrollStateChanged(i);
                    }
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    SlideGuideController slideGuideController = this.LL.LLJJ;
                    if (slideGuideController != null) {
                        slideGuideController.onPageSelected(i);
                    }
                }
            });
        }
        C312240CLu.LIZ(new C0CM3(C0CMJ.NORMAL_PRIORITY.getType(), C0CME.FIRST_VIDEO_SHOW, "MFSocialAssem-view", new AwS425S0200000_24(this, view, 26), true));
        if (!C285090BFj.LIZJ()) {
            C1558150qeL.LIZIZ(this, new C1570320qxy(this, null));
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS124S0100000_24(this, 45));
        }
    }
}
