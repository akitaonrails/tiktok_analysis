package com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui;

import X.C01GW;
import X.C090F;
import X.C099F;
import X.C21415018rM;
import X.C23250099c;
import X.C271740Aku;
import X.C301340BrY;
import X.C301350BrZ;
import X.C417890Ga3;
import X.C418440Gaw;
import X.C426750GoL;
import X.C436300H8y;
import X.C452501pT;
import X.C650520PfO;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoKeyboardCustomButtonAssem extends BaseTakoFloatingButtonAssem {
    public C21415018rM LLJL;
    public int LLJLIL;
    public boolean LLJLL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 563));
    public final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2));
    public final C099F LLJLILLLLZIIL = C090F.LIZIZ();

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Lo() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Ho() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void bp() {
        View view;
        C417890Ga3 c417890Ga3 = new C417890Ga3();
        int iMp = mp(this.LLJLIL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        Context context = getContext();
        c417890Ga3.LIZ(iMp, context != null && C426750GoL.LIZLLL(context));
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setOutlineProvider(c417890Ga3);
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            view3.setClipToOutline(true);
        }
        if (!C301340BrY.LIZ() || ((Boolean) C271740Aku.LIZ.getValue()).booleanValue() || (view = this.LLJIJIL) == null) {
            return;
        }
        view.setElevation(C418440Gaw.LIZIZ(4));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void dp() {
        if (this.LLJLL) {
            return;
        }
        this.LLJLL = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), So().LIZIZ, null, new C436300H8y(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Jo() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public static int mp(int i) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) + i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final View Zo(ViewStub viewStub) {
        ViewParent parent;
        ViewGroup viewGroup;
        if (C301350BrZ.LIZ()) {
            Context context = getContext();
            if (context == null) {
                return null;
            }
            if (viewStub != null) {
                parent = viewStub.getParent();
            } else {
                parent = null;
            }
            if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                return null;
            }
            C650520PfO.LIZ.getClass();
            View viewLIZIZ = C650520PfO.LIZIZ(context, R.layout.eyi, null, false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            layoutParams.addRule(21, -1);
            layoutParams.addRule(12, -1);
            C786410Ut5.W5(viewLIZIZ, layoutParams);
            viewGroup.addView(viewLIZIZ);
            return viewLIZIZ;
        }
        if (viewStub == null) {
            return null;
        }
        viewStub.setLayoutResource(R.layout.eyi);
        return C786410Ut5.LJLLLL(viewStub);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cp(android.view.View r6) {
        /*
            r5 = this;
            super.cp(r6)
            boolean r0 = X.C301350BrZ.LIZ()
            r4 = 2
            if (r0 == 0) goto L1e
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.09U0 r0 = r5.So()
            X.1DEx r2 = r0.LIZJ
            X.0H8w r1 = new X.0H8w
            r0 = 0
            r1.<init>(r5, r6, r0)
            X.C23250099c.LIZLLL(r3, r2, r0, r1, r4)
            return
        L1e:
            com.bytedance.tux.icon.TuxIconView r1 = r5.LLJILJIL
            if (r1 == 0) goto L29
            int r0 = r5.Go()
            r1.setIconRes(r0)
        L29:
            r0 = 2131393718(0x7f0a7cb6, float:1.84081E38)
            android.view.View r0 = r6.findViewById(r0)
            X.18rM r0 = (X.C21415018rM) r0
            r5.LLJL = r0
            android.content.Context r1 = r5.getContext()
            r3 = 1
            if (r1 == 0) goto L4c
            int r0 = X.C1838007Hu.LIZ()
            if (r0 == r3) goto L93
            if (r0 != r4) goto L93
            r0 = 2131822521(0x7f1107b9, float:1.9277816E38)
        L46:
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L4e
        L4c:
            java.lang.String r0 = ""
        L4e:
            X.0HcP r2 = new X.0HcP
            r2.<init>()
            r2.LJIILIIL(r0)
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LOCALE
            X.0HcQ r0 = r2.LIZIZ
            r0.LJIIIZ = r1
            r0 = 42
            r2.LJII(r0)
            r2.LJIIIZ(r3)
            android.content.Context r1 = r5.getContext()
            r0 = 2131100624(0x7f0603d0, float:1.7813635E38)
            int r0 = X.C475630Ikz.LIZIZ(r0, r1)
            r2.LJIILJJIL(r0)
            android.text.Layout r1 = r2.LIZIZ()
            X.18rM r0 = r5.LLJL
            if (r0 == 0) goto L7d
            r0.setTextLayout(r1)
        L7d:
            int r0 = r1.getWidth()
            r5.LLJLIL = r0
            int r3 = mp(r0)
            android.view.View r2 = r5.LLJIJIL
            kotlin.jvm.internal.AwS21S0001000_6 r1 = new kotlin.jvm.internal.AwS21S0001000_6
            r0 = 2
            r1.<init>(r3, r0)
            X.C657990PrR.LIZJ(r2, r1)
            return
        L93:
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem.cp(android.view.View):void");
    }
}
