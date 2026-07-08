package com.ss.android.ugc.feed.platform.panel.playbutton;

import X.C01GW;
import X.C098200Yq;
import X.C0SZ8;
import X.C0T2J;
import X.C0T2K;
import X.C0T2L;
import X.C1566140qrE;
import X.C1616650sAh;
import X.C189200o6;
import X.C19252910Tv;
import X.C20096413kA;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC494301wD;
import X.InterfaceC740240T1y;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PlayButtonComponent extends BasePanelComponent implements InterfaceC743730TFj, IPlayButtonAbility, InterfaceC1554640qYg {
    public ImageView LL;
    public boolean LLILLJJLI;
    public final C20096413kA LLILLL = new C20096413kA();
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final List<InterfaceC740240T1y> LLIZ;

    @Override // X.InterfaceC743730TFj
    public final void Bg(Activity activity, Fragment fragment) {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
    }

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
        this.LLILLJJLI = false;
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2021424687) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final float Fb0() {
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLIFFJFJJ()) {
            return 0.3f;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityBo = bo();
        return C1616650sAh.LJI(iViewPagerComponentAbilityBo != null ? iViewPagerComponentAbilityBo.LJIIIIZZ() : null) ? 0.5f : 0.3f;
    }

    public final IViewPagerComponentAbility bo() {
        return (IViewPagerComponentAbility) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final View sR0() {
        C0SZ8 c0sz8LJLIL;
        if (this.LLILLJJLI) {
            IViewPagerComponentAbility iViewPagerComponentAbilityBo = bo();
            this.LL = (iViewPagerComponentAbilityBo == null || (c0sz8LJLIL = iViewPagerComponentAbilityBo.LJLIL()) == null) ? null : c0sz8LJLIL.F2();
        }
        return this.LL;
    }

    public PlayButtonComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 653), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C0T2J(false, this));
        }
        this.LLILZ = c01gwLIZIZ;
        this.LLILZIL = C452501pT.LIZIZ(new C0T2L(this));
        this.LLILZLL = C452501pT.LIZIZ(new C0T2K(this));
        this.LLIZ = new ArrayList();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void G31() {
        C0SZ8 c0sz8D;
        ImageView imageViewF2;
        IViewPagerComponentAbility iViewPagerComponentAbilityBo = bo();
        if (iViewPagerComponentAbilityBo == null || (c0sz8D = iViewPagerComponentAbilityBo.D()) == null || (imageViewF2 = c0sz8D.F2()) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageViewF2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final boolean Ol0() {
        View viewSR0 = sR0();
        return viewSR0 != null && viewSR0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:20:0x00e0, B:21:0x00ec, B:23:0x00f2, B:25:0x00fa, B:27:0x00fe, B:28:0x0102, B:30:0x010c, B:33:0x0114, B:35:0x011a, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x014c, B:51:0x0151, B:52:0x0166, B:54:0x0170, B:56:0x0176), top: B:70:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:20:0x00e0, B:21:0x00ec, B:23:0x00f2, B:25:0x00fa, B:27:0x00fe, B:28:0x0102, B:30:0x010c, B:33:0x0114, B:35:0x011a, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x014c, B:51:0x0151, B:52:0x0166, B:54:0x0170, B:56:0x0176), top: B:70:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:20:0x00e0, B:21:0x00ec, B:23:0x00f2, B:25:0x00fa, B:27:0x00fe, B:28:0x0102, B:30:0x010c, B:33:0x0114, B:35:0x011a, B:36:0x011e, B:38:0x0124, B:40:0x012a, B:42:0x0130, B:44:0x0136, B:46:0x013c, B:48:0x0142, B:50:0x014c, B:51:0x0151, B:52:0x0166, B:54:0x0170, B:56:0x0176), top: B:70:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ol2() {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponent.Ol2():void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void PT0() {
        C0SZ8 c0sz8F;
        ImageView imageViewF2;
        IViewPagerComponentAbility iViewPagerComponentAbilityBo = bo();
        if (iViewPagerComponentAbilityBo == null || (c0sz8F = iViewPagerComponentAbilityBo.F()) == null || (imageViewF2 = c0sz8F.F2()) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageViewF2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:22:0x005a, B:23:0x0066, B:25:0x006c, B:27:0x0074, B:29:0x0078, B:30:0x007c), top: B:44:0x005a }] */
    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cx1(boolean r7) {
        /*
            r6 = this;
            android.view.View r5 = r6.sR0()
            r3 = 0
            if (r5 == 0) goto L8e
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r6.bo()
            if (r0 == 0) goto L48
            X.0SZ8 r0 = r0.LJLIL()
        L11:
            r4 = 0
            if (r0 == 0) goto L46
            X.0Mup r0 = r0.x3()
            if (r0 == 0) goto L46
            boolean r1 = r0.Mg()
            r0 = 1
            if (r1 != r0) goto L46
        L21:
            r1 = 0
            if (r0 != 0) goto L4a
            if (r7 == 0) goto L4a
            X.C786410Ut5.LJLLLLLL(r4, r5)
            android.view.ViewPropertyAnimator r0 = r5.animate()
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            r0 = 100
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            Y.ARunnableS81S0200000_12 r1 = new Y.ARunnableS81S0200000_12
            r0 = 70
            r1.<init>(r6, r5, r0)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r1)
            r0.start()
            goto L5a
        L46:
            r0 = 0
            goto L21
        L48:
            r0 = r3
            goto L11
        L4a:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r5)
            r6.G31()
            r6.PT0()
            if (r7 != 0) goto L5a
            X.C786410Ut5.T4(r5, r1)
        L5a:
            java.util.List<X.0T1y> r0 = r6.LLIZ     // Catch: java.lang.Throwable -> L82
            java.util.List r0 = X.C0T6L.LIZIZ(r0)     // Catch: java.lang.Throwable -> L82
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L82
        L66:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L7c
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L82
            boolean r0 = r1 instanceof X.InterfaceC740240T1y     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L66
            X.0T1y r1 = (X.InterfaceC740240T1y) r1     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L66
            r1.LIZ(r4)     // Catch: java.lang.Throwable -> L82
            goto L66
        L7c:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L82
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L82
            goto L8e
        L82:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L8e:
            X.13kA r2 = r6.LLILLL
            X.0RJN r0 = r6.getPanelContext()
            androidx.fragment.app.Fragment r0 = r0.LJ
            if (r0 == 0) goto Lb7
            android.content.Context r1 = r0.getContext()
        L9c:
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r0 = r6.bo()
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.LJIIIIZZ()
        La6:
            X.C740250T1z.LIZ(r2, r1, r3)
            X.01GW r0 = r6.LLILZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility r0 = (com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility) r0
            if (r0 == 0) goto Lb6
            r0.Z5()
        Lb6:
            return
        Lb7:
            r1 = r3
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponent.cx1(boolean):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void oM2(InterfaceC740240T1y interfaceC740240T1y) {
        try {
            synchronized (this.LLIZ) {
                try {
                    if (!((ArrayList) this.LLIZ).contains(interfaceC740240T1y)) {
                        ((ArrayList) this.LLIZ).add(interfaceC740240T1y);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void sz0(InterfaceC740240T1y interfaceC740240T1y) {
        boolean zRemove;
        try {
            synchronized (this.LLIZ) {
                try {
                    zRemove = ((ArrayList) this.LLIZ).remove(interfaceC740240T1y);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C189200o6.m2constructorimpl(Boolean.valueOf(zRemove));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void z32(float f) {
        View viewSR0;
        View viewSR02 = sR0();
        if (viewSR02 != null) {
            C786410Ut5.T4(viewSR02, f);
        }
        if (f == 0.0f && (viewSR0 = sR0()) != null) {
            C786410Ut5.LJLLLLLL(8, viewSR0);
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        this.LLILLJJLI = true;
    }
}
