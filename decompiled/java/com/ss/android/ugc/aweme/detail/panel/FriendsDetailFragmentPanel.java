package com.ss.android.ugc.aweme.detail.panel;

import X.C01GW;
import X.C07N3;
import X.C08CX;
import X.C098200Yq;
import X.C0AI7;
import X.C0HTT;
import X.C0R52;
import X.C0R9L;
import X.C0SR4;
import X.C0SZ8;
import X.C0T54;
import X.C1206770hVb;
import X.C1246870iYH;
import X.C1246880iYI;
import X.C1246900iYK;
import X.C1246920iYM;
import X.C1360340lVI;
import X.C1365840leA;
import X.C1365870leD;
import X.C1389890mGx;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1558520qew;
import X.C1588330rR1;
import X.C1589640rT8;
import X.C189200o6;
import X.C19719612Di;
import X.C19EG;
import X.C2189821An6;
import X.C296380BjY;
import X.C486860J7k;
import X.C486890J7n;
import X.C697110RWb;
import X.C714460S0u;
import X.C729510SjV;
import X.C737030Svd;
import X.C888460YtI;
import X.EnumC1392960mLu;
import X.InterfaceC1219090hpT;
import X.InterfaceC1392880mLm;
import X.InterfaceC1603360rpG;
import X.InterfaceC583650Mup;
import X.InterfaceC665370Q7z;
import X.ViewTreeObserverOnWindowFocusChangeListenerC1246890iYJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendsDetailFragmentPanel extends DetailFragmentPanel {
    public final Set<C1246870iYH> A0;
    public final ViewTreeObserverOnWindowFocusChangeListenerC1246890iYJ B0;
    public boolean C0;
    public C1246880iYI z0;

    public final void I0() {
        if (this.A0.isEmpty()) {
            return;
        }
        List<C1246870iYH> listLLIIII = C13LP.LLIIII(this.A0);
        this.A0.clear();
        for (C1246870iYH c1246870iYH : listLLIIII) {
            L0(c1246870iYH.LIZ, c1246870iYH.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean v() {
        InterfaceC1603360rpG interfaceC1603360rpG = this.n;
        return interfaceC1603360rpG instanceof InterfaceC1219090hpT ? ((InterfaceC1219090hpT) interfaceC1603360rpG).LJIIJJI() : this.o;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        if (C296380BjY.LIZ()) {
            try {
                EventBus.LIZLLL().LJJI(this);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1246880iYI c1246880iYI = this.z0;
            if (c1246880iYI != null) {
                C1589640rT8.LIZIZ.H2(c1246880iYI);
            }
            this.z0 = null;
            this.A0.clear();
            View view = this.E;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(this.B0);
            }
            C1246920iYM.LIZ = null;
            C1246920iYM.LIZIZ = null;
            C07N3.LIZ = C13BV.INSTANCE;
            C07N3.LIZIZ = C08CX.INSTANCE;
            Set<String> set = C0T54.LIZ;
            synchronized (set) {
                try {
                    set.clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onResume() throws Throwable {
        super.onResume();
        if (C296380BjY.LIZ()) {
            I0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0iYJ] */
    public FriendsDetailFragmentPanel(C2189821An6 c2189821An6) {
        super(c2189821An6);
        this.A0 = new LinkedHashSet();
        this.B0 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0iYJ
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                if (C296380BjY.LIZ() && z) {
                    this.LL.I0();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJLL(C0SZ8 c0sz8) {
        int currentItem;
        String aid;
        C0SZ8 c0sz8LJLIL;
        InterfaceC583650Mup interfaceC583650MupX3;
        IFriendsDetailPageAbility iFriendsDetailPageAbility;
        String str;
        String aid2;
        C0SR4 c0sr4;
        List<Aweme> listFg;
        String aid3;
        super.LLJLL(c0sz8);
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            currentItem = verticalViewPager.getCurrentItem();
        } else {
            currentItem = -1;
        }
        if (currentItem < 0) {
            Aweme aweme = c0sz8.getAweme();
            if (aweme != null && (aid2 = aweme.getAid()) != null && aid2.length() != 0 && (c0sr4 = this.LLJL) != null && (listFg = c0sr4.Fg()) != null) {
                Iterator<Aweme> it2 = listFg.iterator();
                currentItem = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Aweme next = it2.next();
                    if (next != null) {
                        aid3 = next.getAid();
                    } else {
                        aid3 = null;
                    }
                    if (Intrinsics.LJFF(aid3, aid2)) {
                        if (currentItem < 0) {
                            break;
                        }
                    } else {
                        currentItem++;
                    }
                }
            } else {
                currentItem = this.LLJLILLLLZIIL;
            }
        }
        Aweme aweme2 = c0sz8.getAweme();
        if (aweme2 != null && (aid = aweme2.getAid()) != null && aid.length() > 0) {
            if (C729510SjV.LJJIJIL(aweme2)) {
                aid = C1588330rR1.LIZ(aid);
            } else {
                String str2 = (String) C13LP.LJJJLZIJ(currentItem, C07N3.LIZ);
                if (str2 != null && str2.length() > 0) {
                    aid = str2;
                }
            }
        } else {
            aid = null;
        }
        if (C296380BjY.LIZ() && aid != null && aid.length() > 0) {
            if (aid.length() > 0) {
                str = aid;
            } else {
                str = null;
            }
            C1246920iYM.LIZIZ = str;
            String aid4 = C1246920iYM.LIZ;
            if ((aid4 == null && ((aid4 = this.LLLLIIIILLL.getAid()) == null || aid4.length() <= 0)) || !Intrinsics.LJFF(aid, aid4)) {
                this.C0 = true;
            }
            if (this.C0) {
                C1440005kM.LIZ(new C1246900iYK(aid));
            }
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LLJJIJIIJIL;
        if (iViewPagerComponentAbility != null && (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) != null && (interfaceC583650MupX3 = c0sz8LJLIL.x3()) != null && interfaceC583650MupX3.Mg()) {
            C01GW c01gw = C0AI7.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                IFriendsDetailPageAbility iFriendsDetailPageAbility2 = (IFriendsDetailPageAbility) C1558520qew.LIZ(this.LL, IFriendsDetailPageAbility.class, null);
                if (iFriendsDetailPageAbility2 != null) {
                    iFriendsDetailPageAbility2.rN();
                    return;
                }
                return;
            }
            if (((Number) c01gw.getValue()).intValue() == 2) {
                IFriendsDetailPageAbility iFriendsDetailPageAbility3 = (IFriendsDetailPageAbility) C1558520qew.LIZ(this.LL, IFriendsDetailPageAbility.class, null);
                if (iFriendsDetailPageAbility3 != null) {
                    iFriendsDetailPageAbility3.XK1();
                }
                IFriendsDetailPageAbility iFriendsDetailPageAbility4 = (IFriendsDetailPageAbility) C1558520qew.LIZ(this.LL, IFriendsDetailPageAbility.class, null);
                if (iFriendsDetailPageAbility4 != null) {
                    iFriendsDetailPageAbility4.kr2();
                }
                ILoadMoreAbility iLoadMoreAbility = this.LLILZLL;
                if (iLoadMoreAbility == null) {
                    return;
                }
                iLoadMoreAbility.hJ2(this.LLLLIIIILLL.getEventType());
                return;
            }
            if (((Number) c01gw.getValue()).intValue() != 3 || (iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(this.LL, IFriendsDetailPageAbility.class, null)) == null) {
                return;
            }
            iFriendsDetailPageAbility.XK1();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1259130is3
    public final void RO2(String str) {
        if (!isViewValid() || str == null) {
            return;
        }
        if (C296380BjY.LIZ()) {
            super.RO2(str);
        } else {
            IFriendsDetailPageAbility iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(this.LL, IFriendsDetailPageAbility.class, null);
            if (iFriendsDetailPageAbility != null) {
                iFriendsDetailPageAbility.S();
            }
        }
        C737030Svd c737030Svd = new C737030Svd(2, str);
        c737030Svd.LIZLLL = "from_friends_v3_detail";
        C1440005kM.LIZ(c737030Svd);
        if (Pe()) {
            LLIL(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final void h0(boolean z) {
        if (!z) {
            C2189821An6 c2189821An6 = this.LLLLIIIILLL;
            if (C1360340lVI.LIZIZ(c2189821An6) || C1360340lVI.LIZLLL(c2189821An6)) {
                return;
            }
        }
        super.h0(z);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    public final boolean n0(Aweme aweme) {
        if (C1360340lVI.LIZJ(this.LLLLIIIILLL)) {
            return true;
        }
        return super.n0(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public void onEvent(C1365870leD c1365870leD) {
        String aid;
        if (c1365870leD == null || !Intrinsics.LJFF(c1365870leD.LJ, "homepage_friends")) {
            return;
        }
        String str = c1365870leD.LJI;
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        C1365840leA.LJ(c1365870leD, new C0R52((BottomToastVM) ViewModelProviders.of(getFragment()).get(C13LE.LIZ(BottomToastVM.class))), LJIIIIZZ(), 0L);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFriendsV3BlockUserEvent(C888460YtI c888460YtI) {
        User user;
        String uid;
        if (!C296380BjY.LIZ() || (user = c888460YtI.LIZ) == null || (uid = user.getUid()) == null || uid.length() == 0) {
            return;
        }
        F0(uid, EnumC1392960mLu.ALL);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFriendsV3UnBlockUserEvent(C486890J7n c486890J7n) {
        User user;
        String uid;
        if (!C296380BjY.LIZ() || (user = c486890J7n.LIZ) == null || (uid = user.getUid()) == null || uid.length() == 0) {
            return;
        }
        C19719612Di.LJJIII(this.A0, new AwS70S1000000_19(uid, 3), true);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPrivateModelEvent(C697110RWb c697110RWb) {
        super.onPrivateModelEvent(c697110RWb);
        if (c697110RWb != null && c697110RWb.LIZJ == 1) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.activity);
            c1389890mGx.LJIIIZ(2131838834);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Object obj;
        String aid;
        super.onVideoEvent(c737030Svd);
        if (c737030Svd != null && c737030Svd.LIZ == 2) {
            if (c737030Svd != null) {
                obj = c737030Svd.LIZIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof String) && obj != null) {
                Aweme awemeO = o();
                if (awemeO != null) {
                    aid = awemeO.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(obj, aid) && !Intrinsics.LJFF(c737030Svd.LIZLLL, "from_friends_v3_detail")) {
                    l(null);
                }
            }
        }
    }

    public final void F0(String str, EnumC1392960mLu enumC1392960mLu) {
        View view = this.E;
        if (view != null && view.hasWindowFocus()) {
            L0(str, enumC1392960mLu);
        } else {
            this.A0.add(new C1246870iYH(str, enumC1392960mLu));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(java.lang.String r8, X.EnumC1392960mLu r9) {
        /*
            r7 = this;
            boolean r0 = r7.isViewValid()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r8.length()
            r3 = 1
            if (r0 != 0) goto Lf
            return
        Lf:
            X.0SR4 r0 = r7.LLJL
            if (r0 == 0) goto Lb7
            java.util.List r1 = r0.Fg()
            if (r1 == 0) goto Lb7
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L20
            return
        L20:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r1.iterator()
        L29:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            com.ss.android.ugc.aweme.profile.model.User r1 = r5.getAuthor()
            r0 = 0
            if (r1 == 0) goto L40
            java.lang.String r0 = r1.getUid()
        L40:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 != 0) goto L50
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r5)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 == 0) goto L29
        L50:
            boolean r2 = X.C729510SjV.LJJIJIL(r5)
            int[] r1 = X.C1392970mLv.LIZ
            int r0 = r9.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L6d
            r0 = 2
            if (r1 == r0) goto L70
            r0 = 3
            if (r1 == r0) goto L70
            r0 = 4
            if (r1 == r0) goto L72
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L6d:
            if (r2 == 0) goto L29
            goto L72
        L70:
            if (r2 != 0) goto L29
        L72:
            java.lang.String r0 = r5.getAid()
            if (r0 == 0) goto L29
            r4.add(r0)
            goto L29
        L7c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r4.iterator()
        L85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L85
            r3.add(r1)
            goto L85
        L9c:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto La3
            return
        La3:
            java.util.Iterator r1 = r3.iterator()
        La7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            r7.En(r0)
            goto La7
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.panel.FriendsDetailFragmentPanel.L0(java.lang.String, X.0mLu):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0iYI, X.0mLm] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        IFriendsDetailPageAbility iFriendsDetailPageAbility;
        C19EG activity;
        super.onViewCreated(view, bundle);
        Fragment fragment = getFragment();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            C486860J7k.LIZIZ(activity).LLILZLL.setValue(Boolean.FALSE);
        }
        View view2 = this.F;
        if (view2 != null) {
            if (C1360340lVI.LIZJ(this.LLLLIIIILLL)) {
                C1206770hVb.LIZ(view2);
            } else {
                InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
                if (interfaceC665370Q7z != null && (iFriendsDetailPageAbility = (IFriendsDetailPageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFriendsDetailPageAbility.class, null)) != null) {
                    iFriendsDetailPageAbility.Fy1(view2, AFwS229S0000000_2.get$arr$(674));
                }
            }
        }
        if (C296380BjY.LIZ()) {
            if (!EventBus.LIZLLL().LJIIJ(this)) {
                try {
                    EventBus.LIZLLL().LJIJJ(this);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            ?? r1 = new InterfaceC1392880mLm() { // from class: X.0iYI
                @Override // X.InterfaceC1392880mLm
                public final void LIZ(String str, EnumC1392960mLu enumC1392960mLu) {
                    if (!C296380BjY.LIZ() || str.length() == 0) {
                        return;
                    }
                    this.LIZ.F0(str, enumC1392960mLu);
                }

                @Override // X.InterfaceC1392880mLm
                public final void LIZIZ(String str, EnumC1392960mLu enumC1392960mLu) {
                    if (!C296380BjY.LIZ() || str.length() == 0) {
                        return;
                    }
                    C19719612Di.LJJIII(this.LIZ.A0, new AwS133S1100000_19(str, enumC1392960mLu, 5), true);
                }
            };
            this.z0 = r1;
            C1589640rT8.LIZIZ.D2(r1);
            View view3 = this.E;
            if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnWindowFocusChangeListener(this.B0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C0SR4(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0RvN
            @Override // X.C0SR4
            public final List<C711420RvQ> LJJJJIZL() {
                C711420RvQ[] c711420RvQArr = new C711420RvQ[3];
                c711420RvQArr[0] = C1389300mG0.LJIILJJIL(this.LLIZLLLIL) ? new C711420RvQ() { // from class: X.0Rvi
                    {
                        AFwS243S0000000_11.get$arr$(646);
                        AFwS243S0000000_11.get$arr$(647);
                        AFwS243S0000000_11.get$arr$(648);
                    }
                } : new C711420RvQ() { // from class: X.0RzX
                    {
                        AFwS243S0000000_11.get$arr$(644);
                        C714300S0e c714300S0e = C711750Rvx.LIZ;
                        AFwS243S0000000_11.get$arr$(645);
                    }
                };
                c711420RvQArr[1] = C711200Rv4.LJ;
                c711420RvQArr[2] = C711230Rv7.LJ;
                return C1697810uHb.LJIILJJIL(c711420RvQArr);
            }

            @Override // X.C0SR4
            public final String LJJJLIIL() {
                return "friends_detail_feed";
            }

            @Override // X.C0SR4
            public final C711420RvQ LJJLI() {
                return C1389300mG0.LJIILJJIL(this.LLIZLLLIL) ? new C711420RvQ() { // from class: X.0RvM
                    {
                        C711410RvP c711410RvP = C711750Rvx.LIZIZ;
                        AFwS243S0000000_11.get$arr$(649);
                        AFwS243S0000000_11.get$arr$(650);
                    }
                } : new C711420RvQ(C711610Rvj.LL) { // from class: X.0RvL
                    {
                        super(0, C711750Rvx.LIZIZ, C711750Rvx.LIZ, new AwS590S0100000_11(c711610Rvj, 428));
                    }
                };
            }
        };
    }
}
