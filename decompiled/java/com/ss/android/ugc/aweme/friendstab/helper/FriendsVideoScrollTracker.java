package com.ss.android.ugc.aweme.friendstab.helper;

import X.C098200Yq;
import X.C0H2S;
import X.C0RGU;
import X.C0SZ8;
import X.C0T1R;
import X.C189200o6;
import X.C786250Usp;
import X.C786270Usr;
import X.InterfaceC1587430rPZ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: loaded from: classes13.dex */
public final class FriendsVideoScrollTracker implements InterfaceC1587430rPZ {
    public HomeTabAbility LIZ;
    public C786250Usp LIZIZ;
    public C786250Usp LIZJ;
    public FriendsFeedFragmentPanel LJ;
    public int LJFF;
    public String LIZLLL = "";
    public final LifecycleEventObserver LJI = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.friendstab.helper.FriendsVideoScrollTracker$lifeObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (C0H2S.LIZ[event.ordinal()] == 1) {
                this.LL.LIZLLL = "";
            }
        }
    };
    public final C786270Usr LJII = new C786270Usr(this, 0);

    @Override // X.InterfaceC1587430rPZ
    public final void LJFF() {
        Object c098200Yq;
        Fragment fragment;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        try {
            FriendsFeedFragmentPanel friendsFeedFragmentPanel = this.LJ;
            if (friendsFeedFragmentPanel == null || (fragment = friendsFeedFragmentPanel.getFragment()) == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityLIZJ.Mb()) == null || (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) == null || (c098200Yq = LIZ(c0sz8LJLIL)) == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LIZLLL = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq);
        this.LJFF = 0;
    }

    @Override // X.InterfaceC1587430rPZ
    public final void onDestroy() {
        HomeTabAbility homeTabAbility;
        HomeTabAbility homeTabAbility2;
        C786250Usp c786250Usp = this.LIZIZ;
        if (c786250Usp != null && (homeTabAbility2 = this.LIZ) != null) {
            homeTabAbility2.tx0(c786250Usp);
        }
        C786250Usp c786250Usp2 = this.LIZJ;
        if (c786250Usp2 != null && (homeTabAbility = this.LIZ) != null) {
            homeTabAbility.Ik0(c786250Usp2);
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZ = null;
        this.LIZLLL = "";
        this.LJ = null;
        this.LJFF = 0;
    }

    @Override // X.InterfaceC1587430rPZ
    public final String Y() {
        return this.LIZLLL;
    }

    public static String LIZ(C0SZ8 c0sz8) {
        if (c0sz8 instanceof C0RGU) {
            return ((C0RGU) c0sz8).LJLILLLLZI();
        }
        Aweme awemeLJIIIIZZ = c0sz8.LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            return awemeLJIIIIZZ.getAid();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0004  */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Usp] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Usp, X.0rLx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
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
    @Override // X.InterfaceC1587430rPZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(X.C19EG r5, com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L4
            goto L6
        L4:
            r0 = r3
            goto L10
        L6:
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r5)     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = X.C0DMM.LIZ(r0)     // Catch: java.lang.Throwable -> L72
        L10:
            r4.LIZ = r0     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L3f
            X.0Hfk r0 = com.bytedance.hox.Hox.LLJILJIL     // Catch: java.lang.Throwable -> L72
            r0.LIZ(r5)     // Catch: java.lang.Throwable -> L72
            boolean r0 = r5 instanceof X.C199Y     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L6e
            boolean r0 = r5 instanceof X.InterfaceC1711206n0     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L6e
            boolean r0 = r5 instanceof X.C199Y     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L36
            r0 = r5
            X.15ms r0 = (X.InterfaceC20622815ms) r0     // Catch: java.lang.Throwable -> L72
            X.198i r1 = X.C20629915o1.LIZ(r0)     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L36
            boolean r0 = r1 instanceof X.C0J5E     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L36
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L6f
        L36:
            androidx.lifecycle.Lifecycle r1 = r5.getLifecycle()     // Catch: java.lang.Throwable -> L72
            androidx.lifecycle.LifecycleEventObserver r0 = r4.LJI     // Catch: java.lang.Throwable -> L72
            r1.addObserver(r0)     // Catch: java.lang.Throwable -> L72
        L3f:
            r4.LJ = r6     // Catch: java.lang.Throwable -> L72
            X.0Usr r0 = r4.LJII     // Catch: java.lang.Throwable -> L72
            r6.LLJJI(r0)     // Catch: java.lang.Throwable -> L72
            X.0Usp r2 = new X.0Usp     // Catch: java.lang.Throwable -> L72
            r0 = 0
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L72
            r4.LIZIZ = r2     // Catch: java.lang.Throwable -> L72
            X.0Usp r1 = new X.0Usp     // Catch: java.lang.Throwable -> L72
            r0 = 1
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L72
            r4.LIZJ = r1     // Catch: java.lang.Throwable -> L72
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LIZ     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L5d
            r0.ao(r2)     // Catch: java.lang.Throwable -> L72
        L5d:
            X.0Usp r1 = r4.LIZJ     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L6a
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LIZ     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L6a
            r0.UC1(r1)     // Catch: java.lang.Throwable -> L72
            kotlin.Unit r3 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L72
        L6a:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L72
            goto L71
        L6e:
            r1 = r5
        L6f:
            r5 = r1
            goto L36
        L71:
            return
        L72:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.helper.FriendsVideoScrollTracker.Z(X.19EG, com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedFragmentPanel):void");
    }
}
