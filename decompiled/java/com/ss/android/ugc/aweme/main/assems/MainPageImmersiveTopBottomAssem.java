package com.ss.android.ugc.aweme.main.assems;

import X.AbstractC1608130rwx;
import X.C05C4;
import X.C1388190mED;
import X.C1558520qew;
import X.C1570830qyn;
import X.C1583650rJT;
import X.C19EG;
import X.C23250099c;
import X.C520680KbS;
import X.C622680Oba;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1211910hdt;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeImmersiveOwner;
import com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MainPageImmersiveTopBottomAssem extends BaseMainPageFragmentAssem implements PhotoClearModeOwnerAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public ViewGroup LLILLJJLI;
    public C1583650rJT LLILLL;
    public View LLILZ;
    public C19EG LLILZIL;
    public PhotoClearModeImmersiveOwner LLILZLL;
    public final MainPageImmersiveTopBottomAssem LLIZ = this;

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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1697712436) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1583650rJT c1583650rJT = this.LLILLL;
        if (c1583650rJT != null) {
            c1583650rJT.LJII();
        }
        this.LLILLL = null;
        this.LLILZ = null;
        PhotoClearModeImmersiveOwner photoClearModeImmersiveOwner = this.LLILZLL;
        if (photoClearModeImmersiveOwner != null && !photoClearModeImmersiveOwner.LLILZIL) {
            photoClearModeImmersiveOwner.LLILZIL = true;
            C622680Oba.LIZLLL(photoClearModeImmersiveOwner);
            ARunnableS119S0100000_19 aRunnableS119S0100000_19 = photoClearModeImmersiveOwner.LLILZ;
            if (aRunnableS119S0100000_19 != null) {
                HandlerHook.viewRemoveCallbacks(photoClearModeImmersiveOwner.LL, aRunnableS119S0100000_19);
            }
            photoClearModeImmersiveOwner.LLILZ = null;
            photoClearModeImmersiveOwner.LLILLL = null;
            photoClearModeImmersiveOwner.LLILLJJLI = null;
        }
        this.LLILZLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        FrameLayout frameLayout;
        super.onParentViewCreated();
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup == null || (frameLayout = (FrameLayout) C520680KbS.LIZ(R.id.khx, viewGroup)) == null) {
            return;
        }
        bo(frameLayout);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C05C4(this, frameLayout, null), 3);
        this.LLILZLL = new PhotoClearModeImmersiveOwner(frameLayout);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC1570850qyp
    public final void O9(ViewGroup viewGroup) {
        C19EG c19egLIZIZ;
        Context context;
        this.LLILLJJLI = viewGroup;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        this.LLILZIL = c19egLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility
    public final void TD0(InterfaceC1211910hdt interfaceC1211910hdt) {
        PhotoClearModeImmersiveOwner photoClearModeImmersiveOwner = this.LLILZLL;
        if (photoClearModeImmersiveOwner != null) {
            photoClearModeImmersiveOwner.TD0(interfaceC1211910hdt);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLIZ, PhotoClearModeOwnerAbility.class);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0rJT] */
    public final void bo(final FrameLayout frameLayout) {
        final View viewLIZ;
        final C19EG c19eg = this.LLILZIL;
        if (c19eg == null) {
            return;
        }
        ViewGroup viewGroup = this.LLILLJJLI;
        if (viewGroup != null) {
            viewLIZ = C520680KbS.LIZ(R.id.nwe, viewGroup);
        } else {
            viewLIZ = null;
        }
        View viewLIZ2 = C1570830qyn.LIZ(c19eg);
        if (viewLIZ2 == null) {
            if (viewLIZ == null) {
                return;
            }
        } else {
            viewLIZ = viewLIZ2;
        }
        if (this.LLILZ == viewLIZ) {
            return;
        }
        this.LLILZ = viewLIZ;
        C1583650rJT c1583650rJT = this.LLILLL;
        if (c1583650rJT != null) {
            c1583650rJT.LJII();
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        this.LLILLL = new AbstractC1608130rwx(c19eg, viewLIZ, frameLayout, interfaceC665370Q7zLJIIL) { // from class: X.0rJT
            public final C19EG LJIIIZ;
            public final View LJIIJ;
            public final ViewGroup LJIIJJI;
            public final InterfaceC665370Q7z LJIIL;
            public final C0S4J LJIILIIL;

            @Override // X.AbstractC1608130rwx
            public final String LIZLLL() {
                return "MainImmersiveTopBottomManager";
            }

            @Override // X.AbstractC1608130rwx
            public final int LIZ() {
                return this.LJIIJ.getHeight();
            }

            @Override // X.AbstractC1608130rwx
            public final Fragment LIZJ() {
                HomeTabAbility homeTabAbilityLIZIZ = C0DMM.LIZIZ(this.LJIIL);
                Fragment fragmentTy1 = homeTabAbilityLIZIZ != null ? homeTabAbilityLIZIZ.ty1(BaseFeedListFragment.class) : null;
                if (fragmentTy1 instanceof BaseFeedListFragment) {
                    return fragmentTy1;
                }
                return null;
            }

            @Override // X.AbstractC1608130rwx
            public final Aweme LIZIZ() {
                MainBusinessAbility mainBusinessAbilityLIZJ;
                if (C296200BjG.LIZ()) {
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(this.LJIIL, MainActivityScope.class);
                    Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MainBusinessAbility.class) : null;
                    if (!(ability instanceof MainBusinessAbility)) {
                        ability = null;
                    }
                    mainBusinessAbilityLIZJ = (MainBusinessAbility) ability;
                } else {
                    mainBusinessAbilityLIZJ = C1058560deY.LIZJ(this.LJIIL);
                }
                if (mainBusinessAbilityLIZJ != null) {
                    return mainBusinessAbilityLIZJ.LJIIIIZZ();
                }
                return null;
            }

            @Override // X.AbstractC1608130rwx
            public final void LJIIIIZZ(long j, String str, boolean z) {
                HomeTabAbility homeTabAbility;
                String strZj2;
                float f;
                IMFToolBarAbility iMFToolBarAbilityLIZ;
                Object ability;
                if (C296200BjG.LIZ()) {
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(this.LJIIL, MainActivityScope.class);
                    if (c0qsjLIZJ != null) {
                        ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
                    } else {
                        ability = null;
                    }
                    if (!(ability instanceof HomeTabAbility)) {
                        ability = null;
                    }
                    homeTabAbility = (HomeTabAbility) ability;
                } else {
                    homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(this.LJIIL, HomeTabAbility.class, null);
                }
                if (homeTabAbility != null) {
                    strZj2 = homeTabAbility.Zj2();
                } else {
                    strZj2 = null;
                }
                this.LJIILIIL.LJIIIZ("toggleTopVisibility show: " + z + ", eventType: " + str + " tabName: " + strZj2);
                if (Intrinsics.LJFF(strZj2, "HOME")) {
                    MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(this.LJIIIZ);
                    if (mainActivityScopeLIZJ != null && (iMFToolBarAbilityLIZ = C0CUL.LIZ(mainActivityScopeLIZJ)) != null) {
                        iMFToolBarAbilityLIZ.N11(j, z);
                    }
                    C01GW<C0RGG> c01gw = C0RGG.LJ;
                    if (C586380MzE.LIZ().LIZIZ(str) && z) {
                        this.LJIILIIL.LJIIIZ("reset friends tab TopBarVisibility");
                        IFriendsTabLayoutAbility iFriendsTabLayoutAbility = (IFriendsTabLayoutAbility) C1558520qew.LIZ(this.LJIIL, IFriendsTabLayoutAbility.class, null);
                        if (iFriendsTabLayoutAbility != null) {
                            iFriendsTabLayoutAbility.hh1(0L, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!Intrinsics.LJFF(strZj2, "FRIENDS_TAB")) {
                    return;
                }
                if (C0COM.LIZIZ()) {
                    IFriendsTabLayoutAbility iFriendsTabLayoutAbility2 = (IFriendsTabLayoutAbility) C1558520qew.LIZ(this.LJIIL, IFriendsTabLayoutAbility.class, null);
                    if (iFriendsTabLayoutAbility2 == null) {
                        return;
                    }
                    iFriendsTabLayoutAbility2.hh1(j, z);
                    return;
                }
                IFriendsTabLayoutAbility iFriendsTabLayoutAbility3 = (IFriendsTabLayoutAbility) C1558520qew.LIZ(this.LJIIL, IFriendsTabLayoutAbility.class, null);
                if (iFriendsTabLayoutAbility3 == null) {
                    return;
                }
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                iFriendsTabLayoutAbility3.Sl2(f);
            }

            {
                super(c19eg, viewLIZ, frameLayout);
                this.LJIIIZ = c19eg;
                this.LJIIJ = viewLIZ;
                this.LJIIJJI = frameLayout;
                this.LJIIL = interfaceC665370Q7zLJIIL;
                this.LJIILIIL = new C0S4J("MainImmersiveBarManager");
            }
        };
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLIZ, PhotoClearModeOwnerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.feed.photos.clearmode.PhotoClearModeOwnerAbility
    public final void s91(InterfaceC1211910hdt interfaceC1211910hdt) {
        PhotoClearModeImmersiveOwner photoClearModeImmersiveOwner = this.LLILZLL;
        if (photoClearModeImmersiveOwner != null) {
            photoClearModeImmersiveOwner.s91(interfaceC1211910hdt);
        }
    }
}
