package com.ss.android.ugc.feed.platform.panel.clean;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0QSJ;
import X.C0S43;
import X.C13LE;
import X.C1558520qew;
import X.C1559320qgE;
import X.C1559330qgF;
import X.C1559560qgc;
import X.C1559780qgy;
import X.C1565860qqm;
import X.C1AV2;
import X.C1AV3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C265680Ab8;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.C991140bto;
import X.EnumC992060bvI;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ALAdapterS19S0100000_24;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedCleanComponent extends BasePanelUIComponent implements IFeedCleanAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public Animator LLJILJILJ;
    public boolean LLJILLL;
    public volatile MainPageBusinessAbility LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1565860qqm());
    public final CopyOnWriteArraySet<C991140bto> LLJILJIL = new CopyOnWriteArraySet<>();
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1559330qgF(this));
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1559320qgE(this));
    public final C630740Ooa LLJJIII = C628500Oky.LIZ(new C1559560qgc(this));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C1559780qgy());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedCleanComponent.class, "mainPageBusinessAbility", "getMainPageBusinessAbility()Lcom/ss/android/ugc/aweme/base/mainpagefragment/MainPageBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2129690801) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility
    public final boolean pM2() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility
    public final void Cp0(View view) {
        Go(view, EnumC992060bvI.UNSPECIFIED);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6) {
        /*
            r5 = this;
            super.onViewCreated(r6)
            android.view.ViewParent r1 = r6.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            r4 = 0
            if (r0 == 0) goto L34
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L34
            r0 = 2131370344(0x7f0a2168, float:1.8360692E38)
            android.view.View r0 = X.C520680KbS.LIZ(r0, r1)
            if (r0 == 0) goto L1c
            r5.Cp0(r0)
        L1c:
            r0 = 2131363897(0x7f0a0839, float:1.8347616E38)
            android.view.View r0 = X.C520680KbS.LIZ(r0, r1)
            if (r0 == 0) goto L28
            r5.Cp0(r0)
        L28:
            r0 = 2131363898(0x7f0a083a, float:1.8347618E38)
            android.view.View r0 = X.C520680KbS.LIZ(r0, r1)
            if (r0 == 0) goto L34
            r5.Cp0(r0)
        L34:
            X.0RJN r0 = r5.getPanelContext()
            X.19EG r1 = r0.LIZ()
            if (r1 == 0) goto L73
            r0 = 2131388947(0x7f0a6a13, float:1.8398423E38)
            android.view.View r3 = r1.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L74
            android.view.ViewParent r1 = r3.getParent()
        L4d:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L54
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L54:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.spi.HomePageCommonService> r0 = com.ss.android.ugc.aweme.spi.HomePageCommonService.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.spi.HomePageCommonService r2 = (com.ss.android.ugc.aweme.spi.HomePageCommonService) r2
            X.0Ooa r0 = r5.LLJJIII
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r1 = (com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility) r1
            if (r1 == 0) goto L72
            X.0dZ2 r0 = new X.0dZ2
            r0.<init>()
            r1.Bv0(r0)
        L72:
            return
        L73:
            r3 = r4
        L74:
            r1 = r4
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.clean.FeedCleanComponent.onViewCreated(android.view.View):void");
    }

    public final void Go(View view, EnumC992060bvI enumC992060bvI) {
        if (view != null) {
            this.LLJILJIL.add(new C991140bto(enumC992060bvI, new WeakReference(view)));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility
    public final void Xk(Animator animator, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        float f;
        float f2;
        long duration;
        TimeInterpolator linearInterpolator;
        long startDelay;
        C0S43 c0s43;
        if (((Number) C265680Ab8.LIZ.getValue()).intValue() == 1 && ComplianceServiceProvider.LJIL().LJJJJZI()) {
            z5 = true;
        } else {
            z5 = false;
        }
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJIJIL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleClean request: clean ");
        sbLIZ.append(z);
        sbLIZ.append(", hasCustomAnimation: ");
        if (animator != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        sbLIZ.append(z6);
        sbLIZ.append(" immediately: ");
        sbLIZ.append(z2);
        sbLIZ.append(" isStrictModeFix: ");
        sbLIZ.append(z5);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        Animator animator2 = this.LLJILJILJ;
        if (animator2 != null) {
            animator2.end();
        }
        this.LLJILJILJ = null;
        float f3 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z2) {
            Iterator<C991140bto> it2 = this.LLJILJIL.iterator();
            while (it2.hasNext()) {
                View view = it2.next().LIZIZ.get();
                if (view != null) {
                    C786410Ut5.T4(view, f);
                }
            }
            IFriendsTabLayoutAbility iFriendsTabLayoutAbility = (IFriendsTabLayoutAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFriendsTabLayoutAbility.class, null);
            if (iFriendsTabLayoutAbility != null) {
                iFriendsTabLayoutAbility.Sl2(f);
            }
            MainPageBusinessAbility mainPageBusinessAbility = (MainPageBusinessAbility) this.LLJJI.getValue();
            if (mainPageBusinessAbility != null) {
                C1AV2 c1av2LIZ = C1AV3.LIZ(1, "Feed", null, "feedcleancomponent");
                c1av2LIZ.LIZ(str);
                mainPageBusinessAbility.YA1(z, !z5, z3, true, animator, true, z4, c1av2LIZ);
            }
            IPausePanelAbility iPausePanelAbility = (IPausePanelAbility) this.LLJJ.getValue();
            if (iPausePanelAbility != null) {
                iPausePanelAbility.NC(z);
            }
        } else {
            float[] fArr = new float[2];
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[0] = f2;
            if (!z) {
                f3 = 1.0f;
            }
            fArr[1] = f3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (animator != null) {
                duration = animator.getDuration();
            } else {
                duration = 200;
            }
            valueAnimatorOfFloat.setDuration(duration);
            if (animator == null || (linearInterpolator = animator.getInterpolator()) == null) {
                linearInterpolator = new LinearInterpolator();
            }
            valueAnimatorOfFloat.setInterpolator(linearInterpolator);
            if (animator != null) {
                startDelay = animator.getStartDelay();
            } else {
                startDelay = 0;
            }
            valueAnimatorOfFloat.setStartDelay(startDelay);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(this, 26));
            valueAnimatorOfFloat.addListener(new ALAdapterS19S0100000_24(this, 3));
            valueAnimatorOfFloat.start();
            this.LLJILLL = true;
            MainPageBusinessAbility mainPageBusinessAbility2 = (MainPageBusinessAbility) this.LLJJI.getValue();
            if (mainPageBusinessAbility2 != null) {
                C1AV2 c1av2LIZ2 = C1AV3.LIZ(2, "Feed", null, "feedcleancomponent");
                c1av2LIZ2.LIZ(str);
                mainPageBusinessAbility2.YA1(z, true ^ z5, z3, true, animator, z2, false, c1av2LIZ2);
            }
            this.LLJILJILJ = valueAnimatorOfFloat;
        }
        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
        if (z) {
            c0s43 = C0S43.CLEAN_MODE_OPEN;
        } else {
            c0s43 = C0S43.CLEAN_MODE_CLOSE;
        }
        feedInfraTimingSensor.getClass();
        FeedInfraTimingSensor.LIZLLL(c0s43, str);
    }
}
