package com.ss.android.ugc.aweme.tako.botpage.bottombox.view;

import X.C01GW;
import X.C07IF;
import X.C098200Yq;
import X.C09AY;
import X.C0DSB;
import X.C12KQ;
import X.C12P5;
import X.C1685300txQ;
import X.C1842270y2b;
import X.C1848410yCV;
import X.C1854440yME;
import X.C1855770yON;
import X.C1857750yRZ;
import X.C1864780ycu;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC197015126j;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS96S0200000_27;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import mf.a;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInputExpandTextViewFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsuJjsnHELIOSJyguJjd9PiwpPmEHKS4jACEjPTEJMT8yJiEYLDcnHiwpPgkhKSIhLCEn";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 689));
    public View LLIZLLLIL;
    public C21578619ce LLJ;
    public C1842270y2b LLJI;
    public TuxIconView LLJIJIL;
    public C1854440yME LLJILJIL;
    public C09AY LLJILJILJ;
    public C09AY LLJILLL;
    public C09AY LLJJ;
    public C09AY LLJJI;
    public C09AY LLJJIII;
    public AwS606S0100000_27 LLJJIJI;

    public final void SR(boolean z) {
        float f;
        TuxIconView tuxIconView = this.LLJIJIL;
        if (tuxIconView != null && tuxIconView.isEnabled() != z) {
            tuxIconView.setEnabled(z);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            if (z) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            C786410Ut5.x5(tuxIconView, f);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C1854440yME c1854440yME = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        } else {
            serializable = null;
        }
        if (serializable instanceof C1854440yME) {
            c1854440yME = (C1854440yME) serializable;
        }
        this.LLJILJIL = c1854440yME;
    }

    public final void gt2(final int i, final boolean z) {
        final C1842270y2b c1842270y2b;
        final C21578619ce c21578619ce;
        final Layout layout;
        if (i < 0 || (c1842270y2b = this.LLJI) == null || (c21578619ce = this.LLJ) == null || (layout = c1842270y2b.getLayout()) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c1842270y2b, new Runnable() { // from class: X.0yMD
            public final void LIZ() {
                int lineTop = layout.getLineTop(layout.getLineForOffset(i));
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                c1842270y2b.getLocationInWindow(iArr);
                c21578619ce.getLocationInWindow(iArr2);
                int paddingTop = (iArr[1] - iArr2[1]) + c1842270y2b.getPaddingTop() + lineTop;
                Rect rect = new Rect();
                View view = this.LLIZLLLIL;
                if (view != null) {
                    view.getWindowVisibleDisplayFrame(rect);
                }
                int i2 = rect.bottom - iArr2[1];
                int iLJ = C13LZ.LJ((paddingTop - ((i2 * 2) / 3)) + c21578619ce.getScrollY(), 0, Math.max(0, c21578619ce.getChildAt(0).getHeight() - i2));
                if (z) {
                    c21578619ce.smoothScrollTo(0, iLJ);
                } else {
                    c21578619ce.scrollTo(0, iLJ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TakoInputExpandTextViewFragment@4694.scrollToPosition$$inlined$postDelayed$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TakoInputExpandTextViewFragment@4694.scrollToPosition$$inlined$postDelayed$1");
            }
        }, 200L);
    }

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
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        String str2;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = view;
        C786410Ut5.O7((FrameLayout) view.findViewById(R.id.e62), new ACListenerS161S0100000_27(this, 58));
        C21578619ce c21578619ce = (C21578619ce) view.findViewById(R.id.u2r);
        C1855770yON.LIZ.getClass();
        if (C1855770yON.LIZIZ()) {
            C1857750yRZ.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), c21578619ce);
        }
        this.LLJ = c21578619ce;
        C1842270y2b c1842270y2b = (C1842270y2b) view.findViewById(R.id.grz);
        C1854440yME c1854440yME = this.LLJILJIL;
        if (c1854440yME == null || (str = c1854440yME.text) == null) {
            str = "";
        }
        TuxIconView tuxIconView = null;
        if (c1854440yME != null && (str2 = c1854440yME.hint) != null && str2.length() > 0) {
            c1842270y2b.setHint(str2);
        }
        c1842270y2b.setText(str);
        c1842270y2b.setSelection(str.length());
        if (Build.VERSION.SDK_INT >= 29) {
            if (C07IF.LIZ()) {
                i2 = R.drawable.den;
            } else {
                i2 = R.drawable.dem;
            }
            c1842270y2b.setTextCursorDrawable(i2);
        }
        HandlerHook.viewPost(c1842270y2b, new ARunnableS96S0200000_27(c1842270y2b, this, 9));
        View.OnClickListener aCListenerS129S0200000_27 = new ACListenerS129S0200000_27(this, c1842270y2b, 11);
        if (C1848410yCV.LIZ) {
            aCListenerS129S0200000_27 = new f(aCListenerS129S0200000_27);
        }
        a aVar = new a(aCListenerS129S0200000_27);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1842270y2b);
        }
        c1842270y2b.setOnClickListener(aVar);
        c1842270y2b.addTextChangedListener(new C1864780ycu(c1842270y2b, this, 0));
        c1842270y2b.setOnPasteListener(new AwS571S0100000_27(this, 690));
        this.LLJI = c1842270y2b;
        C786410Ut5.R7((LinearLayout) view.findViewById(R.id.nc2), new ACListenerS161S0100000_27(this, 59));
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.up8);
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0r);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView2.setTuxIcon(c419910GdJ);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            if (C07IF.LIZ()) {
                i = R.attr.a04;
            } else {
                i = R.attr.d5;
            }
            c384050F3z.LIZIZ = Integer.valueOf(i);
            tuxIconView2.setBackground(c384050F3z.LIZ(tuxIconView2.getContext()));
            C786410Ut5.a9(tuxIconView2, new ACListenerS129S0200000_27(tuxIconView2, this, 12));
            C427690Gpr.LJI(tuxIconView2, new AwS641S0100000_27(this, 42));
            tuxIconView = tuxIconView2;
        }
        this.LLJIJIL = tuxIconView;
        View viewFindViewById = view.findViewById(R.id.cev);
        C12P5 c12p5 = new C12P5();
        c12p5.LIZLLL = Integer.valueOf(R.attr.zm);
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJII = EnumC197015126j.LINEAR;
        c12p5.LJI = C12KQ.VERTICAL;
        viewFindViewById.setBackground(c12p5.LIZ(viewFindViewById.getContext()));
        if (C1855770yON.LIZIZ()) {
            C0DSB.LIZIZ(viewFindViewById);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fpg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
