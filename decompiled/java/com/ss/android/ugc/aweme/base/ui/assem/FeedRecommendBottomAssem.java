package com.ss.android.ugc.aweme.base.ui.assem;

import X.C0QSJ;
import X.C1030680cva;
import X.C13LE;
import X.C14EU;
import X.C2217381BqS;
import X.C628500Oky;
import X.C630740Ooa;
import X.C740360T2k;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedRecommendBottomAssem extends FeedSkylightBottomAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 58));
    public volatile MainBusinessAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedRecommendBottomAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBottomAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBottomAssem
    public final void Go(int i) {
        Aweme awemeLJIIIIZZ;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        if (C1030680cva.LJIILIIL(awemeLJIIIIZZ)) {
            super.Go(0);
        } else {
            super.Go(i);
        }
    }

    @C14EU
    public final void onAwesomeSplashEvent(C740360T2k c740360T2k) {
        int i = c740360T2k.LIZ;
        if (i != 2 && i != 3) {
            if (i == 4) {
                super.Go(this.LLIZLLLIL);
            }
        } else {
            if (C1030680cva.LJIJ(c740360T2k.LIZIZ)) {
                return;
            }
            super.Go(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[Catch: all -> 0x0045, PHI: r1
      0x0038: PHI (r1v2 X.0QSJ) = (r1v1 X.0QSJ), (r1v4 X.0QSJ) binds: [B:10:0x001e, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x0018, B:9:0x001c, B:11:0x0020, B:13:0x0024, B:14:0x002a, B:17:0x0040, B:18:0x0042, B:16:0x0038), top: B:31:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBottomAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7) {
        /*
            r6 = this;
            super.onViewCreated(r7)
            org.greenrobot.eventbus.EventBus r0 = org.greenrobot.eventbus.EventBus.LIZLLL()
            r0.LJIJJ(r6)
            boolean r0 = X.C296200BjG.LIZ()
            r2 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.LLJI
            if (r0 != 0) goto L58
            monitor-enter(r6)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = r6.LLJI     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L57
            X.0QSJ r1 = r6.LLJILJIL     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L38
            X.0Q7z r3 = r6.LLJIJIL     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L2a
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L45
            r6.LLJIJIL = r3     // Catch: java.lang.Throwable -> L45
        L2a:
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L45
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r0 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r1[r4] = r0     // Catch: java.lang.Throwable -> L45
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r1)     // Catch: java.lang.Throwable -> L45
            r6.LLJILJIL = r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L40
        L38:
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            java.lang.Object r2 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L45
            com.ss.android.ugc.aweme.base.MainBusinessAbility r2 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r2     // Catch: java.lang.Throwable -> L45
        L40:
            r6.LLJI = r2     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            r0 = r2
            goto L54
        L45:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L48:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.base.MainBusinessAbility> r0 = com.ss.android.ugc.aweme.base.MainBusinessAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = (com.ss.android.ugc.aweme.base.MainBusinessAbility) r0
        L54:
            if (r0 == 0) goto L61
            goto L58
        L57:
            monitor-exit(r6)
        L58:
            boolean r0 = r0.oi2()
            if (r0 != r5) goto L61
            super.Go(r4)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.ui.assem.FeedRecommendBottomAssem.onViewCreated(android.view.View):void");
    }
}
