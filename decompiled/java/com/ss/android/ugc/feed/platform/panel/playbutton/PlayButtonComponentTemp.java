package com.ss.android.ugc.feed.platform.panel.playbutton;

import X.C01GW;
import X.C0BOS;
import X.C0SZ8;
import X.C0T10;
import X.C20096413kA;
import X.C452501pT;
import X.C739750T0b;
import X.C740220T1w;
import X.C740230T1x;
import X.C786410Ut5;
import X.InterfaceC740240T1y;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PlayButtonComponentTemp implements IPlayButtonAbility {
    public final BaseListFragmentPanel LL;
    public ImageView LLILLJJLI;
    public boolean LLILLL;
    public final C20096413kA LLILZ = new C20096413kA();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C0T10(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C739750T0b(this));
    public final C01GW LLIZ = C452501pT.LIZIZ(new C740220T1w(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C740230T1x(this));
    public final List<InterfaceC740240T1y> LLJ = new ArrayList();

    public final IPlayButtonAbility LIZ() {
        return (IPlayButtonAbility) this.LLILZIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final float Fb0() {
        if (!C0BOS.LIZ()) {
            return 0.3f;
        }
        IPlayButtonAbility iPlayButtonAbilityLIZ = LIZ();
        if (iPlayButtonAbilityLIZ != null) {
            return iPlayButtonAbilityLIZ.Fb0();
        }
        return 1.0f;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void G31() {
        ImageView imageViewF2;
        if (C0BOS.LIZ()) {
            IPlayButtonAbility iPlayButtonAbilityLIZ = LIZ();
            if (iPlayButtonAbilityLIZ != null) {
                iPlayButtonAbilityLIZ.G31();
                return;
            }
            return;
        }
        C0SZ8 c0sz8D = this.LL.D();
        if (c0sz8D == null || (imageViewF2 = c0sz8D.F2()) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageViewF2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final boolean Ol0() {
        if (!C0BOS.LIZ()) {
            View viewSR0 = sR0();
            return viewSR0 != null && viewSR0.getVisibility() == 0;
        }
        IPlayButtonAbility iPlayButtonAbilityLIZ = LIZ();
        if (iPlayButtonAbilityLIZ != null) {
            return iPlayButtonAbilityLIZ.Ol0();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ol2() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp.Ol2():void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void PT0() {
        ImageView imageViewF2;
        if (C0BOS.LIZ()) {
            IPlayButtonAbility iPlayButtonAbilityLIZ = LIZ();
            if (iPlayButtonAbilityLIZ != null) {
                iPlayButtonAbilityLIZ.PT0();
                return;
            }
            return;
        }
        C0SZ8 c0sz8F = this.LL.F();
        if (c0sz8F == null || (imageViewF2 = c0sz8F.F2()) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageViewF2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final View sR0() {
        if (C0BOS.LIZ()) {
            IPlayButtonAbility iPlayButtonAbilityLIZ = LIZ();
            if (iPlayButtonAbilityLIZ != null) {
                return iPlayButtonAbilityLIZ.sR0();
            }
            return null;
        }
        if (this.LLILLL && this.LL.LJLIL() != null) {
            C0SZ8 c0sz8LJLIL = this.LL.LJLIL();
            this.LLILLJJLI = c0sz8LJLIL != null ? c0sz8LJLIL.F2() : null;
        }
        return this.LLILLJJLI;
    }

    public PlayButtonComponentTemp(BaseListFragmentPanel baseListFragmentPanel) {
        this.LL = baseListFragmentPanel;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[LOOP:0: B:21:0x0058->B:23:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cx1(boolean r6) {
        /*
            r5 = this;
            boolean r0 = X.C0BOS.LIZ()
            if (r0 == 0) goto L10
            com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility r0 = r5.LIZ()
            if (r0 == 0) goto Lf
            r0.cx1(r6)
        Lf:
            return
        L10:
            android.view.View r4 = r5.sR0()
            if (r4 == 0) goto L7b
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r5.LL
            X.0SZ8 r0 = r0.LJLIL()
            r3 = 0
            if (r0 == 0) goto L79
            X.0Mup r0 = r0.x3()
            if (r0 == 0) goto L79
            boolean r1 = r0.Mg()
            r0 = 1
            if (r1 != r0) goto L79
        L2c:
            r1 = 0
            if (r0 != 0) goto L68
            if (r6 == 0) goto L68
            X.C786410Ut5.LJLLLLLL(r3, r4)
            android.view.ViewPropertyAnimator r0 = r4.animate()
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            r0 = 100
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            Y.ARunnableS81S0200000_12 r1 = new Y.ARunnableS81S0200000_12
            r0 = 71
            r1.<init>(r5, r4, r0)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r1)
            r0.start()
        L50:
            java.util.List<X.0T1y> r0 = r5.LLJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.next()
            X.0T1y r0 = (X.InterfaceC740240T1y) r0
            r0.LIZ(r3)
            goto L58
        L68:
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r4)
            r5.G31()
            r5.PT0()
            if (r6 != 0) goto L50
            X.C786410Ut5.T4(r4, r1)
            goto L50
        L79:
            r0 = 0
            goto L2c
        L7b:
            X.13kA r2 = r5.LLILZ
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r5.LL
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            if (r0 == 0) goto L98
            android.content.Context r1 = r0.getContext()
        L89:
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r5.LL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIIIIZZ()
            X.C740250T1z.LIZ(r2, r1, r0)
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r0 = r5.LL
            r0.getClass()
            return
        L98:
            r1 = 0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp.cx1(boolean):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void oM2(InterfaceC740240T1y interfaceC740240T1y) {
        ((ArrayList) this.LLJ).add(interfaceC740240T1y);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void sz0(InterfaceC740240T1y interfaceC740240T1y) {
        ((ArrayList) this.LLJ).remove(interfaceC740240T1y);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility
    public final void z32(float f) {
        View viewSR0;
        if (C0BOS.LIZ()) {
            IPlayButtonAbility iPlayButtonAbilityLIZ = LIZ();
            if (iPlayButtonAbilityLIZ != null) {
                iPlayButtonAbilityLIZ.z32(f);
                return;
            }
            return;
        }
        View viewSR02 = sR0();
        if (viewSR02 != null) {
            C786410Ut5.T4(viewSR02, f);
        }
        if (f != 0.0f || (viewSR0 = sR0()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewSR0);
    }
}
