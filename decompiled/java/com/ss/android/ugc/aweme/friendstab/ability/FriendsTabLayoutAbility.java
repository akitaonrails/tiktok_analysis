package com.ss.android.ugc.aweme.friendstab.ability;

import X.AbstractC1387200mCc;
import X.AbstractC1583720rJa;
import X.C128Y;
import X.C1388190mED;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1583510rJF;
import X.C1584720rLC;
import X.C1585010rLf;
import X.C1586750rOT;
import X.C1587170rP9;
import X.C1587220rPE;
import X.C1587270rPJ;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C1906580ziK;
import X.C19EG;
import X.C19MB;
import X.C19U0;
import X.C19U1;
import X.C21546519Tz;
import X.C21594419fC;
import X.C2188811AlT;
import X.C259800zU;
import X.C296600Bju;
import X.C418440Gaw;
import X.C446900Hfk;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1583290rIt;
import X.InterfaceC1055110dYz;
import X.InterfaceC1571760r0I;
import X.InterfaceC1571780r0K;
import X.InterfaceC1584710rLB;
import X.InterfaceC1584770rLH;
import X.InterfaceC1584780rLI;
import X.InterfaceC1586460rO0;
import X.InterfaceC1603190roz;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import Y.ARunnableS35S0101000_24;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.repostfeed.interfaces.IRepostFeedAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabLayoutAbility implements IFriendsTabLayoutAbility, InterfaceC1586460rO0<C19U0> {
    public static final /* synthetic */ int LLJILLL = 0;
    public final List<InterfaceC1571760r0I> LL;
    public final List<InterfaceC1571760r0I> LLILLJJLI;
    public final C19U1 LLILLL;
    public final ViewPager LLILZ;
    public final ViewGroup LLILZIL;
    public final Context LLILZLL;
    public boolean LLJI;
    public final CopyOnWriteArraySet<InterfaceC1584770rLH> LLIZ = new CopyOnWriteArraySet<>();
    public final Set<InterfaceC1584780rLI> LLIZLLLIL = new LinkedHashSet();
    public String LLJ = "";
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public final C1584720rLC LLJILJILJ = new InterfaceC469360Ias() { // from class: X.0rLC
        public int LL;
        public int LLILLJJLI;

        @Override // X.InterfaceC469360Ias
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            this.LL = this.LLILLJJLI;
            this.LLILLJJLI = i;
        }

        @Override // X.InterfaceC469360Ias
        public final void onPageSelected(int i) {
            String str;
            String tag;
            ISocialTabProtocol iSocialTabProtocol;
            if (this.LL == 1) {
                str = "slide";
            } else {
                str = "click";
            }
            List<ISocialTabProtocol> listLIZIZ = this.LLILLL.LIZIZ();
            if (listLIZIZ != null && (iSocialTabProtocol = (ISocialTabProtocol) C13LP.LJJJLZIJ(i, listLIZIZ)) != null) {
                tag = iSocialTabProtocol.getTag();
            } else {
                tag = null;
            }
            C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
            String str2 = this.LLILLL.LLJILJIL;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (Intrinsics.LJFF(str2, "FRIENDS_FEED")) {
                str3 = "homepage_friends";
            } else if (Intrinsics.LJFF(str2, "REPOST_FEED")) {
                str3 = "repost_feed";
            }
            c1587170rP9.getClass();
            C1587170rP9.LJFF(tag, str, str3);
            this.LLILLL.getClass();
            try {
                if (Intrinsics.LJFF(tag, "FRIENDS_FEED")) {
                    if (Intrinsics.LJFF(str, "click")) {
                        C0O0R.LIZ.getClass();
                        C0O0R.LJFF = "click_top_icon";
                    } else if (Intrinsics.LJFF(str, "slide")) {
                        C0O0R.LIZ.getClass();
                        C0O0R.LJFF = "slide";
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    };

    public final List<ISocialTabProtocol> LIZIZ() {
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(this.LLILZLL);
        if (iSocial2TabProtocolAbilityLJ != null) {
            return iSocial2TabProtocolAbilityLJ.b9();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final Rect ji2() {
        Rect rect = new Rect();
        this.LLILLL.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final String nk0() {
        List<SocialTopTabNode> listOK1;
        AbstractC1583720rJa abstractC1583720rJa;
        int tabCount = this.LLILLL.getTabCount();
        int i = -1;
        if (tabCount >= 0) {
            int i2 = 0;
            while (true) {
                C19U0 tabAt = this.LLILLL.getTabAt(i2);
                if (tabAt != null && tabAt.LIZ()) {
                    i = i2;
                }
                if (i2 == tabCount) {
                    break;
                }
                i2++;
            }
        }
        ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJ = C1583510rJF.LJ(this.LLILZLL);
        if (iSocial2TabProtocolAbilityLJ == null || (listOK1 = iSocial2TabProtocolAbilityLJ.oK1()) == null || (abstractC1583720rJa = (AbstractC1583720rJa) C13LP.LJJJLZIJ(i, listOK1)) == null) {
            return null;
        }
        return abstractC1583720rJa.tag();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final boolean Gw0() {
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        boolean z = (abstractC1387200mCcLJ != null ? abstractC1387200mCcLJ.LIZ : null) instanceof InterfaceC1603190roz;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJII = C1583510rJF.LJII(this.LLILZLL);
        return uw("FRIENDS_FEED") && (iBottomTabLayoutAbilityLJII != null ? iBottomTabLayoutAbilityLJII.hv0() : false) && z;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final String LJJLIIIJJI() {
        return Intrinsics.LJFF(nk0(), "FRIENDS_FEED") ? "homepage_friends" : "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final InterfaceC1055110dYz h71() {
        String strNk0 = nk0();
        if (strNk0 == null) {
            return null;
        }
        C128Y c128yFg1 = fg1(strNk0);
        if (c128yFg1 instanceof InterfaceC1055110dYz) {
            return (InterfaceC1055110dYz) c128yFg1;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void kK2() {
        List<ISocialTabProtocol> listLIZIZ = LIZIZ();
        if (listLIZIZ != null) {
            Iterator<ISocialTabProtocol> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                InterfaceC1571780r0K interfaceC1571780r0KFK = it2.next().fK();
                if (interfaceC1571780r0KFK != null) {
                    interfaceC1571780r0KFK.LIZIZ(this.LL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final View wU() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final InterfaceC1584710rLB Kx(String str) {
        Object obj;
        KeyEvent.Callback callback;
        int tabCount = this.LLILLL.getTabCount();
        if (tabCount < 0) {
            return null;
        }
        int i = 0;
        InterfaceC1584710rLB interfaceC1584710rLB = null;
        while (true) {
            C19U0 tabAt = this.LLILLL.getTabAt(i);
            if (tabAt != null) {
                obj = tabAt.LIZ;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(obj, str)) {
                C19U0 tabAt2 = this.LLILLL.getTabAt(i);
                if (tabAt2 != null) {
                    callback = tabAt2.LJFF;
                } else {
                    callback = null;
                }
                if (callback instanceof InterfaceC1584710rLB) {
                    interfaceC1584710rLB = (InterfaceC1584710rLB) callback;
                } else {
                    interfaceC1584710rLB = null;
                }
            }
            if (i != tabCount) {
                i++;
            } else {
                return interfaceC1584710rLB;
            }
        }
    }

    public final InterfaceC1584710rLB LIZ(String str) {
        Object obj;
        View view;
        int tabCount = this.LLILLL.getTabCount();
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C19U0 tabAt = this.LLILLL.getTabAt(i);
                if (tabAt != null) {
                    obj = tabAt.LIZ;
                } else {
                    obj = null;
                }
                if (Intrinsics.LJFF(obj, str)) {
                    C19U0 tabAt2 = this.LLILLL.getTabAt(i);
                    if (tabAt2 != null) {
                        view = tabAt2.LJFF;
                    } else {
                        view = null;
                    }
                    if (!(view instanceof InterfaceC1584710rLB)) {
                        return null;
                    }
                    return (InterfaceC1584710rLB) view;
                }
                if (i == tabCount) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void Nx0(String str) {
        int i;
        View view;
        View view2;
        List<ISocialTabProtocol> listLIZIZ = LIZIZ();
        if (listLIZIZ != null) {
            Iterator<ISocialTabProtocol> it2 = listLIZIZ.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getTag(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LLILLL.getParent();
        List<InterfaceC1571760r0I> list = this.LL;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1571760r0I interfaceC1571760r0I : list) {
            InterfaceC1571760r0I interfaceC1571760r0I2 = interfaceC1571760r0I;
            if ((interfaceC1571760r0I2 instanceof C1585010rLf) && (view2 = (View) interfaceC1571760r0I2) != null && view2.getVisibility() == 0) {
                arrayList.add(interfaceC1571760r0I);
            }
        }
        int size = arrayList.size();
        List<InterfaceC1571760r0I> list2 = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1571760r0I interfaceC1571760r0I3 : list2) {
            InterfaceC1571760r0I interfaceC1571760r0I4 = interfaceC1571760r0I3;
            if ((interfaceC1571760r0I4 instanceof C1585010rLf) && (view = (View) interfaceC1571760r0I4) != null && view.getVisibility() == 0) {
                arrayList2.add(interfaceC1571760r0I3);
            }
        }
        int iMax = Math.max(size, arrayList2.size()) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIZ(this.LLILLL.getId(), 6, constraintLayout.getId(), 6, iMax);
        c19mb.LJIIIZ(this.LLILLL.getId(), 7, constraintLayout.getId(), 7, iMax);
        c19mb.LIZIZ(constraintLayout);
        HandlerHook.viewPost(this.LLILLL, new ARunnableS35S0101000_24(this, i, 4));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void On0(String str) {
        int i;
        List<ISocialTabProtocol> listLIZIZ = LIZIZ();
        if (listLIZIZ != null) {
            Iterator<ISocialTabProtocol> it2 = listLIZIZ.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getTag(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        C19U0 tabAt = this.LLILLL.getTabAt(i);
        if (tabAt != null) {
            tabAt.LIZIZ();
        }
    }

    @Override // X.InterfaceC1586460rO0
    public final void Oq(C19U0 c19u0) {
        String str;
        boolean z;
        List<ISocialTabProtocol> listLIZIZ;
        ISocialTabProtocol next;
        IRepostFeedAbility iRepostFeedAbility;
        C19EG c19egLIZIZ;
        ISocialTabProtocol next2;
        InterfaceC1584710rLB interfaceC1584710rLB;
        ISocialTabProtocol next3;
        Object obj = c19u0.LIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        if ((obj instanceof String) && (str = (String) obj) != null) {
            InterfaceC1584710rLB interfaceC1584710rLBLIZ = LIZ(str);
            int dotCount = 0;
            if (interfaceC1584710rLBLIZ != null && interfaceC1584710rLBLIZ.Xd()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
                int iLJIJI = C1586750rOT.LIZ().LJIJI(str);
                c1587170rP9.getClass();
                C1587170rP9.LJIILJJIL(iLJIJI, str, "click", "red_dot");
            } else if (interfaceC1584710rLBLIZ != null && interfaceC1584710rLBLIZ.LJJ()) {
                C1587170rP9 c1587170rP92 = C1587170rP9.LIZ;
                int dotCount2 = interfaceC1584710rLBLIZ.getDotCount();
                c1587170rP92.getClass();
                C1587170rP9.LJIILJJIL(dotCount2, str, "click", "number_dot");
            }
            InterfaceC1584710rLB interfaceC1584710rLBKx = Kx(str);
            if (interfaceC1584710rLBKx != null && interfaceC1584710rLBKx.getDotCount() > 0) {
                List<ISocialTabProtocol> listLIZIZ2 = LIZIZ();
                if (listLIZIZ2 != null) {
                    Iterator<ISocialTabProtocol> it2 = listLIZIZ2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                            if (Intrinsics.LJFF(next3.getTag(), str)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    ISocialTabProtocol iSocialTabProtocol = next3;
                    if (iSocialTabProtocol != null) {
                        iSocialTabProtocol.EP2(EnumC1583290rIt.NUMBER_DOT);
                    }
                }
            } else if (interfaceC1584710rLBLIZ != null && interfaceC1584710rLBLIZ.Xd() && (listLIZIZ = LIZIZ()) != null) {
                Iterator<ISocialTabProtocol> it3 = listLIZIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.getTag(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ISocialTabProtocol iSocialTabProtocol2 = next;
                if (iSocialTabProtocol2 != null) {
                    iSocialTabProtocol2.EP2(EnumC1583290rIt.RED_DOT);
                }
            }
            KeyEvent.Callback callback = c19u0.LJFF;
            if ((callback instanceof InterfaceC1584710rLB) && (interfaceC1584710rLB = (InterfaceC1584710rLB) callback) != null) {
                interfaceC1584710rLB.LJIJI();
            }
            if (Intrinsics.LJFF(str, this.LLJIJIL)) {
                this.LLJIJIL = "";
            }
            if (!Intrinsics.LJFF(str, "FRIENDS_FEED")) {
                InterfaceC1584710rLB interfaceC1584710rLBKx2 = Kx("FRIENDS_FEED");
                if (interfaceC1584710rLBKx2 != null) {
                    dotCount = interfaceC1584710rLBKx2.getDotCount();
                }
                C1589640rT8.LIZIZ.g3(dotCount);
            }
            List<ISocialTabProtocol> listLIZIZ3 = LIZIZ();
            if (listLIZIZ3 != null) {
                Iterator<ISocialTabProtocol> it4 = listLIZIZ3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (Intrinsics.LJFF(next2.getTag(), str)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                ISocialTabProtocol iSocialTabProtocol3 = next2;
                if (iSocialTabProtocol3 != null) {
                    iSocialTabProtocol3.OM1(this.LLJ);
                    InterfaceC1571780r0K interfaceC1571780r0KFK = iSocialTabProtocol3.fK();
                    if (interfaceC1571780r0KFK != null) {
                        interfaceC1571780r0KFK.LIZIZ(this.LL);
                    }
                    InterfaceC1571780r0K interfaceC1571780r0KFK2 = iSocialTabProtocol3.fK();
                    if (interfaceC1571780r0KFK2 != null) {
                        interfaceC1571780r0KFK2.LIZ(this.LLILLJJLI);
                    }
                }
            }
            if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
                C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
                if (c1589640rT8.LIZ() && (c19egLIZIZ = StateOwner.LL.LIZIZ()) != null) {
                    ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJ(c19egLIZIZ);
                }
                if (StateOwner.LL.LIZIZ() != null) {
                    C1587220rPE.LIZ.getClass();
                    if (C1587220rPE.LIZLLL()) {
                        if (AddOptionForGuidanceExp.LIZJ > 0 && c1589640rT8.O2()) {
                            return;
                        }
                        C1587270rPJ c1587270rPJ = C1587270rPJ.LL;
                        C1587270rPJ.LJII();
                    }
                }
                C1595430rcT.LIZIZ.LIZJ().tryToShowForcePermissionDialog();
            } else {
                C19EG c19egLIZIZ2 = StateOwner.LL.LIZIZ();
                if (c19egLIZIZ2 != null) {
                    ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZLLL(c19egLIZIZ2);
                }
            }
            Iterator<InterfaceC1584770rLH> it5 = this.LLIZ.iterator();
            while (it5.hasNext()) {
                it5.next().LIZIZ(this.LLJ, str);
            }
            this.LLJ = str;
            if (C296600Bju.LIZ()) {
                if (Intrinsics.LJFF(str, "FRIENDS_FEED")) {
                    C446900Hfk c446900Hfk = Hox.LLJILJIL;
                    C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(this.LLILZLL);
                    if (c19egLIZIZ3 != null) {
                        Fragment fragmentKi = c446900Hfk.LIZ(c19egLIZIZ3).Ki("FRIENDS_FEED");
                        if ((fragmentKi instanceof FeedFragment) && fragmentKi != null) {
                            InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentKi, null), IFeedFragmentAbility.class, null);
                            if (interfaceC494301wDLIZ instanceof IFriendsFeedFragmentAbility) {
                                interfaceC494301wD = interfaceC494301wDLIZ;
                            }
                            IFriendsFeedFragmentAbility iFriendsFeedFragmentAbility = (IFriendsFeedFragmentAbility) interfaceC494301wD;
                            if (iFriendsFeedFragmentAbility != null) {
                                iFriendsFeedFragmentAbility.Kb();
                            }
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (Intrinsics.LJFF(str, "REPOST_FEED")) {
                    C446900Hfk c446900Hfk2 = Hox.LLJILJIL;
                    C19EG c19egLIZIZ4 = C1388190mED.LIZIZ(this.LLILZLL);
                    if (c19egLIZIZ4 != null) {
                        Fragment fragmentKi2 = c446900Hfk2.LIZ(c19egLIZIZ4).Ki("REPOST_FEED");
                        if ((fragmentKi2 instanceof FeedFragment) && fragmentKi2 != null && (iRepostFeedAbility = (IRepostFeedAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentKi2, null), IRepostFeedAbility.class, null)) != null) {
                            iRepostFeedAbility.Kb();
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            Nx0(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void Sl2(float f) {
        C786410Ut5.R4(f, this.LLILZIL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void YI2(String str) {
        InterfaceC1584710rLB interfaceC1584710rLBLIZ = LIZ(str);
        if (interfaceC1584710rLBLIZ != null) {
            interfaceC1584710rLBLIZ.LJIL();
        }
    }

    @Override // X.InterfaceC1586460rO0
    public final void Yn(C19U0 c19u0) {
        Object obj;
        KeyEvent.Callback callback;
        KeyEvent.Callback callback2;
        InterfaceC1584710rLB interfaceC1584710rLB;
        InterfaceC1584710rLB interfaceC1584710rLB2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabUnselected ");
        String strTag = null;
        if (c19u0 != null) {
            obj = c19u0.LIZ;
        } else {
            obj = null;
        }
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c19u0 != null) {
            callback = c19u0.LJFF;
        } else {
            callback = null;
        }
        if ((callback instanceof InterfaceC1584710rLB) && (interfaceC1584710rLB2 = (InterfaceC1584710rLB) callback) != null) {
            interfaceC1584710rLB2.LJIIL();
        }
        if (c19u0 != null) {
            callback2 = c19u0.LJFF;
        } else {
            callback2 = null;
        }
        if ((callback2 instanceof InterfaceC1584710rLB) && (interfaceC1584710rLB = (InterfaceC1584710rLB) callback2) != null) {
            strTag = interfaceC1584710rLB.tag();
        }
        this.LLJILJIL = strTag;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void dT0(InterfaceC1584770rLH interfaceC1584770rLH) {
        if (!this.LLIZ.contains(interfaceC1584770rLH)) {
            this.LLIZ.add(interfaceC1584770rLH);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final Fragment fg1(String str) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZLL);
        if (c19egLIZIZ != null) {
            return Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki(str);
        }
        return null;
    }

    @Override // X.InterfaceC1586460rO0
    public final void ih(C19U0 c19u0) {
        Object obj;
        List<ISocialTabProtocol> listLIZIZ;
        ISocialTabProtocol iSocialTabProtocol = null;
        if (c19u0 != null) {
            obj = c19u0.LIZ;
        } else {
            obj = null;
        }
        if ((obj instanceof String) && obj != null && (listLIZIZ = LIZIZ()) != null) {
            Iterator<ISocialTabProtocol> it2 = listLIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ISocialTabProtocol next = it2.next();
                if (Intrinsics.LJFF(next.getTag(), obj)) {
                    iSocialTabProtocol = next;
                    break;
                }
            }
            ISocialTabProtocol iSocialTabProtocol2 = iSocialTabProtocol;
            if (iSocialTabProtocol2 != null) {
                if (this.LLJI) {
                    this.LLJI = false;
                    iSocialTabProtocol2.B3();
                } else {
                    iSocialTabProtocol2.EP2(EnumC1583290rIt.CLICK_TOP);
                    Iterator<InterfaceC1584780rLI> it3 = this.LLIZLLLIL.iterator();
                    while (it3.hasNext()) {
                        it3.next().LJFF();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final boolean uw(String str) {
        return Intrinsics.LJFF(nk0(), str);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void vB(String str) {
        InterfaceC1584710rLB interfaceC1584710rLBLIZ;
        if (!Intrinsics.LJFF(nk0(), str) && (interfaceC1584710rLBLIZ = LIZ(str)) != null) {
            interfaceC1584710rLBLIZ.LJIJJLI();
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void Ky0(int i, boolean z) {
        this.LLILZ.setCurrentItem(i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void VZ0(long j, String str) {
        Object obj;
        T t;
        C21546519Tz c21546519Tz;
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        int tabCount = this.LLILLL.getTabCount();
        if (tabCount >= 0) {
            int i = 0;
            while (true) {
                C19U0 tabAt = this.LLILLL.getTabAt(i);
                T t2 = 0;
                t2 = 0;
                if (tabAt != null) {
                    obj = tabAt.LIZ;
                } else {
                    obj = null;
                }
                if (Intrinsics.LJFF(obj, str)) {
                    C19U0 tabAt2 = this.LLILLL.getTabAt(i);
                    if (tabAt2 != null) {
                        t = tabAt2.LJFF;
                    } else {
                        t = 0;
                    }
                    if ((t instanceof View) && t != 0) {
                        c259800zU.element = t;
                        C19U0 tabAt3 = this.LLILLL.getTabAt(i);
                        if (tabAt3 != null && (c21546519Tz = tabAt3.LJIIIIZZ) != null) {
                            C786410Ut5.LJLLLLLL(0, c21546519Tz);
                            t2 = c21546519Tz;
                        }
                        c259800zU2.element = t2;
                    } else {
                        return;
                    }
                }
                if (i == tabCount) {
                    break;
                } else {
                    i++;
                }
            }
        }
        View view = (View) c259800zU.element;
        if (view == null) {
            return;
        }
        view.animate().alpha(1.0f).setStartDelay(j).setListener(new Animator.AnimatorListener() { // from class: X.06Rz
            public final /* synthetic */ boolean LLILLJJLI = true;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i2;
                View view2 = c259800zU.element;
                if (this.LLILLJJLI) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view2);
                C786410Ut5.T4(c259800zU.element, 1.0f);
                View view3 = c259800zU2.element;
                if (view3 != null) {
                    view3.setClickable(this.LLILLJJLI);
                }
            }
        }).setDuration(100L).start();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void do0(int i, String str) {
        InterfaceC1584710rLB interfaceC1584710rLBLIZ;
        if (!Intrinsics.LJFF(nk0(), str) && (interfaceC1584710rLBLIZ = LIZ(str)) != null) {
            interfaceC1584710rLBLIZ.LJIJJ(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility
    public final void hh1(long j, final boolean z) {
        float f;
        int i = 0;
        float f2 = 0.0f;
        if (j <= 0) {
            ViewGroup viewGroup = this.LLILZIL;
            if (z) {
                f2 = 1.0f;
            }
            C786410Ut5.R4(f2, viewGroup);
            ViewGroup viewGroup2 = this.LLILZIL;
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLZ(i, viewGroup2);
            return;
        }
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZIL, "alpha", f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0rLD
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i2;
                ViewGroup viewGroup3 = this.LLILZIL;
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLZ(i2, viewGroup3);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    C786410Ut5.LJLZ(0, this.LLILZIL);
                }
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0rLC] */
    public FriendsTabLayoutAbility(List list, List list2, C19U1 c19u1, C21594419fC c21594419fC, ConstraintLayout constraintLayout) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = c19u1;
        this.LLILZ = c21594419fC;
        this.LLILZIL = constraintLayout;
        this.LLILZLL = c19u1.getContext();
    }
}
