package com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0T2Y;
import X.C128Y;
import X.C14EU;
import X.C1567240qt0;
import X.C1868040yiA;
import X.C19EG;
import X.C1BNE;
import X.C1D0H;
import X.C1D0I;
import X.C2252321DDq;
import X.C343710Ddh;
import X.C739870T0n;
import X.C740740T3w;
import X.InterfaceC1593630rZZ;
import Y.AObserverS236S0100000_34;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes35.dex */
public final class TabletBottomControlBarViewModel extends ViewModel {
    public static final /* synthetic */ int LLJI = 0;
    public final IFeedBottomBarFacade LL;
    public final C1D0H LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public WeakReference<C19EG> LLILZLL;
    public final C1D0I LLIZ;
    public final AObserverS236S0100000_34 LLIZLLLIL;
    public boolean LLJ;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILLJJLI.LIZJ();
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        WeakReference<C19EG> weakReference = this.LLILZLL;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public final void wQ2() {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LLILZLL;
        if (weakReference == null || (c19eg = weakReference.get()) == null) {
            return;
        }
        String strXQ2 = xQ2(c19eg);
        Aweme awemeLJFF = C740740T3w.LJFF(c19eg);
        C1868040yiA c1868040yiA = (C1868040yiA) this.LLILLL.getValue();
        if (!Intrinsics.LJFF(c1868040yiA.LIZ, strXQ2) || c1868040yiA.LIZIZ != awemeLJFF) {
            this.LLILLL.setValue(C1868040yiA.LIZ(c1868040yiA, strXQ2, awemeLJFF, false, 4));
        }
        yQ2();
    }

    public final void yQ2() {
        if (this.LLJ) {
            this.LLILZ.setValue(vQ2((C1868040yiA) this.LLILLL.getValue()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1D0I] */
    public TabletBottomControlBarViewModel(IFeedBottomBarFacade iFeedBottomBarFacade) {
        this.LL = iFeedBottomBarFacade;
        this.LLILLJJLI = new C1D0H(iFeedBottomBarFacade);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1868040yiA(0));
        this.LLILLL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(vQ2((C1868040yiA) c2252321DDqLIZ.getValue()));
        this.LLILZ = c2252321DDqLIZ2;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLIZ = new C0T2Y() { // from class: X.1D0I
            /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
            @Override // X.C0T2Y
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Y3(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
                /*
                    r5 = this;
                    com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel r0 = r5.LL
                    java.lang.ref.WeakReference<X.19EG> r0 = r0.LLILZLL
                    if (r0 == 0) goto L44
                    java.lang.Object r1 = r0.get()
                    X.19EG r1 = (X.C19EG) r1
                Lc:
                    com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel r0 = r5.LL
                    X.1DDq r0 = r0.LLILLL
                    java.lang.Object r4 = r0.getValue()
                    X.0yiA r4 = (X.C1868040yiA) r4
                    if (r1 == 0) goto L23
                    com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel r0 = r5.LL
                    r0.getClass()
                    java.lang.String r3 = com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel.xQ2(r1)
                    if (r3 != 0) goto L25
                L23:
                    java.lang.String r3 = r4.LIZ
                L25:
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
                    if (r0 != r6) goto L31
                    java.lang.String r0 = r4.LIZ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
                    if (r0 != 0) goto L43
                L31:
                    com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel r0 = r5.LL
                    X.1DDq r2 = r0.LLILLL
                    r1 = 0
                    r0 = 4
                    X.0yiA r0 = X.C1868040yiA.LIZ(r4, r3, r6, r1, r0)
                    r2.setValue(r0)
                    com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel r0 = r5.LL
                    r0.yQ2()
                L43:
                    return
                L44:
                    r1 = 0
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1D0I.Y3(com.ss.android.ugc.aweme.feed.model.Aweme):void");
            }
        };
        this.LLIZLLLIL = new AObserverS236S0100000_34(this, 21);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String xQ2(C19EG c19eg) {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        String strF3;
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19eg);
        C128Y c128yBQ2 = tabChangeManagerLIZ.BQ2();
        if (!(c128yBQ2 instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yBQ2) == null || (strF3 = interfaceC1593630rZZ.f3()) == null) {
            String strCQ2 = tabChangeManagerLIZ.CQ2();
            if (strCQ2 != null) {
                switch (strCQ2.hashCode()) {
                    case -1965615457:
                        if (strCQ2.equals("Nearby")) {
                            return "homepage_nearby";
                        }
                        break;
                    case -1525083535:
                        if (strCQ2.equals("Following")) {
                            return "homepage_follow";
                        }
                        break;
                    case -1471928054:
                        if (strCQ2.equals("REPOST_FEED")) {
                            return "repost_feed";
                        }
                        break;
                    case -1309089240:
                        if (!strCQ2.equals("FRIENDS_FEED")) {
                            return null;
                        }
                        return "homepage_friends";
                    case -734952021:
                        if (!strCQ2.equals("FRIENDS_TAB")) {
                            return null;
                        }
                        return "homepage_friends";
                    case 2223327:
                        if (!strCQ2.equals("HOME")) {
                            return null;
                        }
                        return "homepage_hot";
                    case 2368780:
                        if (strCQ2.equals("Live")) {
                            return "homepage_live";
                        }
                        break;
                    case 2587369:
                        if (strCQ2.equals("Stem")) {
                            return "homepage_topic_stem";
                        }
                        break;
                    case 66292295:
                        if (strCQ2.equals("Drama")) {
                            return "homepage_series";
                        }
                        break;
                    case 984907784:
                        if (!strCQ2.equals("For You")) {
                            return null;
                        }
                        return "homepage_hot";
                }
            }
            return null;
        }
        return strF3;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentListDialogEvent(C739870T0n c739870T0n) {
        C19EG c19eg;
        WeakReference<C19EG> weakReference = this.LLILZLL;
        if (weakReference == null || (c19eg = weakReference.get()) == null || c739870T0n.LIZIZ != c19eg.hashCode()) {
            return;
        }
        yQ2();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onMobEnterFromEvent(C1567240qt0 c1567240qt0) {
        C1868040yiA c1868040yiA = (C1868040yiA) this.LLILLL.getValue();
        if (!Intrinsics.LJFF(c1868040yiA.LIZ, c1567240qt0.LIZ)) {
            this.LLILLL.setValue(C1868040yiA.LIZ(c1868040yiA, c1567240qt0.LIZ, null, false, 6));
            yQ2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C050V vQ2(X.C1868040yiA r26) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar.TabletBottomControlBarViewModel.vQ2(X.0yiA):X.050V");
    }
}
