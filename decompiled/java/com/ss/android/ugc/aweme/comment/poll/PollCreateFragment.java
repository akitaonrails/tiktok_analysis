package com.ss.android.ugc.aweme.comment.poll;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0HU6;
import X.C0HV5;
import X.C0IDL;
import X.C0WZX;
import X.C0XQ7;
import X.C1169900gY8;
import X.C1209030hZF;
import X.C128Y;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1342130l1v;
import X.C1347410lAR;
import X.C1347570lAh;
import X.C1353500lKG;
import X.C1354730lMF;
import X.C13IQ;
import X.C13LE;
import X.C1401780ma8;
import X.C1402120mag;
import X.C14K9;
import X.C15438062q;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19746312Np;
import X.C19746412Nq;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C21578619ce;
import X.C21647019ng;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C427870Gq9;
import X.C438710HIf;
import X.C444920HcY;
import X.C447500Hgi;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19746112Nn;
import X.EnumC452301pR;
import X.InterfaceC1348540lCG;
import X.InterfaceC21641019mi;
import X.ViewOnLayoutChangeListenerC1401910maL;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS75S0200000_6;
import Y.ARunnableS90S0200000_21;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class PollCreateFragment extends AbsFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCHELIOSI2JjFiOSA/JGscJiM/CzcpKDs2DjctLiI2JjE=";
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C1353500lKG LLILZIL;
    public LinearLayout LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public View LLJI;
    public C21578619ce LLJIJIL;
    public View LLJILJIL;
    public C427870Gq9 LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public Integer LLJJIII;
    public long LLJJIJI;
    public ViewOnLayoutChangeListenerC1401910maL LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Integer LLJJJ;
    public Integer LLJJJIL;
    public Integer LLJJJJ;
    public C21647019ng LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public List<? extends View> LLJJL;
    public View LLJJLIIIJLLLLLLLZ;

    public PollCreateFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentPollCreateViewModel.class);
        this.LL = C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 823), AFwS259S0000000_21.get$arr$(388), (Function0) null, 4));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLJJLI = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(142));
        this.LLILLL = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(140));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, AFwS209S0000000_21.get$arr$(141));
    }

    public final void bS() {
        final String string;
        final int length;
        final TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView == null) {
            return;
        }
        String string2 = getString(VR().vQ2().LIZJ.getLabelRes());
        String string3 = getString(2131829086);
        if (a0.LJJIIZI(string3, "%1$s", false) || a0.LJJIIZI(string3, "%s", false)) {
            string = getString(2131829086, string2);
        } else if (a0.LJJIIZI(string3, "{s_duration}", false)) {
            string = u.LJJIFFI(string3, "{s_duration}", string2, false);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string3);
            sbLIZ.append(' ');
            sbLIZ.append(string2);
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        Integer numValueOf = Integer.valueOf(a0.LJJJJI(string, string2, 0, 6));
        if (numValueOf.intValue() >= 0) {
            length = numValueOf.intValue();
        } else {
            length = string.length() - string2.length();
            if (length < 0) {
                length = 0;
            }
        }
        tuxTextView.setSingleLine(false);
        tuxTextView.setMaxLines(2);
        tuxTextView.setText(NR(tuxTextView.getContext(), length, string2.length(), string));
        final int length2 = string2.length();
        ViewTreeObserver viewTreeObserver = tuxTextView.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0gJA
            /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onPreDraw() {
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnPreDrawListenerC1160620gJA.onPreDraw():boolean");
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
    }

    public final void OR() {
        C21647019ng c21647019ng = this.LLJJJJJIL;
        this.LLJJJJJIL = null;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        this.LLJJJJLIIL = false;
        List<? extends View> list = this.LLJJL;
        if (list != null) {
            Iterator<? extends View> it2 = list.iterator();
            while (it2.hasNext()) {
                C786410Ut5.ed(it2.next(), 0.0f);
            }
        }
        this.LLJJL = null;
        dS();
    }

    public final void PR() {
        if (this.LLJJIII == null) {
            return;
        }
        this.LLJJIII = null;
        this.LLJJIJI = 0L;
    }

    public final void UR() throws Throwable {
        C1353500lKG c1353500lKG = this.LLILZIL;
        if (c1353500lKG == null) {
            return;
        }
        c1353500lKG.requestFocus();
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrzIZn8M2Oe2vX6AkEDe3I8q2jYyI50=", null));
        c1353500lKG.setSelection(editableLLLZZIL != null ? editableLLLZZIL.length() : 0);
        hS(c1353500lKG);
    }

    public final CommentPollCreateViewModel VR() {
        return (CommentPollCreateViewModel) this.LL.getValue();
    }

    public final int ZR() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final void dS() {
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view == null) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        gS(-2, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height == -2) {
            return;
        }
        layoutParams.height = -2;
        C786410Ut5.W5(view, layoutParams);
    }

    public final void iS() {
        String str;
        C1353500lKG c1353500lKG = this.LLILZIL;
        if (c1353500lKG == null) {
            return;
        }
        View view = getView();
        View viewFindFocus = view != null ? view.findFocus() : null;
        if (!(viewFindFocus instanceof C1353500lKG) || viewFindFocus == null) {
            return;
        }
        Object tag = viewFindFocus.getTag();
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            return;
        }
        if (u.LJJIIJZLJL(str, "poll_option_input_", false)) {
            c1353500lKG.requestFocus();
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrzIZn8M2Oe2vX6AkEDe3I8q2jYyI50=", null));
            c1353500lKG.setSelection(editableLLLZZIL != null ? editableLLLZZIL.length() : 0);
            hS(c1353500lKG);
        }
    }

    public final void mS() {
        C197039127h c197039127h = this.LLJ;
        if (c197039127h == null) {
            return;
        }
        boolean zLIZ = VR().vQ2().LIZ();
        c197039127h.setEnabled(zLIZ);
        C786410Ut5.w5(c197039127h, zLIZ ? 1.0f : 0.4f);
    }

    public final void nS() {
        View view;
        C21578619ce c21578619ce;
        View view2;
        View view3;
        int height;
        int i;
        if (this.LLJJJJLIIL || (view = getView()) == null || (c21578619ce = this.LLJIJIL) == null || (view2 = this.LLJI) == null || (view3 = this.LLJILJIL) == null) {
            return;
        }
        View childAt = c21578619ce.getChildAt(0);
        if (childAt != null && (height = view.getHeight()) > 0 && (i = height - this.LLJILLL) >= 0 && i > 0) {
            int top = i - ((c21578619ce.getTop() + view3.getHeight()) + view2.getPaddingBottom());
            int i2 = top >= 0 ? top : 0;
            if (childAt.getMeasuredHeight() + c21578619ce.getPaddingTop() + c21578619ce.getPaddingBottom() <= i2) {
                i2 = -2;
            }
            ViewGroup.LayoutParams layoutParams = c21578619ce.getLayoutParams();
            if (layoutParams.height != i2) {
                layoutParams.height = i2;
                C786410Ut5.o6(c21578619ce, layoutParams);
            }
        }
    }

    public final void closePanel() {
        InterfaceC1348540lCG interfaceC1348540lCG;
        C128Y parentFragment = getParentFragment();
        if (!(parentFragment instanceof InterfaceC1348540lCG) || (interfaceC1348540lCG = (InterfaceC1348540lCG) parentFragment) == null) {
            getParentFragmentManager().LJLLILLLL();
        } else {
            interfaceC1348540lCG.bD();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        C1169900gY8 c1169900gY8;
        View view = getView();
        if (view != null) {
            C14K9.LJIJJ(view, null);
            ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL = this.LLJJIJIIJIL;
            if (viewOnLayoutChangeListenerC1401910maL != null) {
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
            }
            if ((view instanceof C1169900gY8) && (c1169900gY8 = (C1169900gY8) view) != null) {
                c1169900gY8.setOnBackPressedPreIme(null);
            }
        }
        this.LLJJIJIIJIL = null;
        View view2 = this.LLJI;
        if (view2 != null && (viewPropertyAnimatorAnimate = view2.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        OR();
        this.LLJJIJIL = false;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        super.onDestroyView();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJJI = true;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJI) {
            this.LLJJI = false;
            View view = getView();
            if (view == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS75S0200000_6(view, this, 24));
        }
    }

    public final void RR(int i) {
        C21578619ce c21578619ce;
        View viewFindViewWithTag;
        ViewGroup viewGroup;
        View view;
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout == null || (c21578619ce = this.LLJIJIL) == null || (viewFindViewWithTag = linearLayout.findViewWithTag(C447500Hgi.LIZIZ(i))) == null) {
            return;
        }
        Object parent = viewFindViewWithTag.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            viewFindViewWithTag = view;
        }
        View childAt = c21578619ce.getChildAt(0);
        if ((childAt instanceof ViewGroup) && (viewGroup = (ViewGroup) childAt) != null) {
            Rect rect = new Rect();
            viewFindViewWithTag.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(viewFindViewWithTag, rect);
            c21578619ce.requestChildRectangleOnScreen(viewGroup, rect, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ab A[PHI: r21
      0x01ab: PHI (r21v1 java.lang.Integer) = (r21v3 java.lang.Integer), (r21v4 java.lang.Integer) binds: [B:22:0x0050, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cS(java.lang.Integer r32) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.poll.PollCreateFragment.cS(java.lang.Integer):void");
    }

    public final void hS(C1353500lKG c1353500lKG) {
        InputMethodManager inputMethodManager;
        Context context = getContext();
        if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class)) != null) {
            inputMethodManager.showSoftInput(c1353500lKG, 1);
            HandlerHook.viewPost(c1353500lKG, new ARunnableS90S0200000_21(inputMethodManager, c1353500lKG, 8));
        }
    }

    public static Integer WR(View view, View view2) {
        ViewGroup viewGroup;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || view2.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view2.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view2, rect);
        return Integer.valueOf(rect.top);
    }

    public static void gS(int i, View view) {
        ViewGroup viewGroup;
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (childAt = viewGroup.getChildAt(0)) != null && (layoutParams = childAt.getLayoutParams()) != null && layoutParams.height != i) {
            layoutParams.height = i;
            C786410Ut5.W5(childAt, layoutParams);
        }
    }

    public final boolean SR(int i, boolean z) throws Throwable {
        C1353500lKG c1353500lKG;
        LinearLayout linearLayout = this.LLILZLL;
        int length = 0;
        if (linearLayout == null || (c1353500lKG = (C1353500lKG) linearLayout.findViewWithTag(C447500Hgi.LIZIZ(i))) == null) {
            return false;
        }
        c1353500lKG.requestFocus();
        if (!c1353500lKG.hasFocus()) {
            c1353500lKG.requestFocusFromTouch();
        }
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrzIZn8M2Oe2vX6AkEDe3I8q2jYyI50=", null));
        if (editableLLLZZIL != null) {
            length = editableLLLZZIL.length();
        }
        c1353500lKG.setSelection(length);
        boolean zHasFocus = c1353500lKG.hasFocus();
        if (z && zHasFocus) {
            hS(c1353500lKG);
        }
        return zHasFocus;
    }

    public final void aS(int i, C1353500lKG c1353500lKG) throws Throwable {
        int length;
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrzIZn8M2Oe2vX6AkEDe3I8q2jYyI50=", null));
        if (editableLLLZZIL != null) {
            length = editableLLLZZIL.length();
        } else {
            length = 0;
        }
        Integer num = this.LLJJIII;
        if (num != null && num.intValue() == i) {
            if (length > 0) {
                PR();
            } else {
                long j = this.LLJJIJI;
                if (j > 0 && SystemClock.uptimeMillis() - j > 700) {
                    PR();
                } else {
                    return;
                }
            }
        }
        C1347410lAR c1347410lARVQ2 = VR().vQ2();
        if (i < C1697810uHb.LJIIJ(c1347410lARVQ2.LIZIZ)) {
            SR(i + 1, false);
            return;
        }
        if (c1347410lARVQ2.LIZIZ.size() >= ZR()) {
            return;
        }
        iS();
        CommentPollCreateViewModel commentPollCreateViewModelVR = VR();
        if (commentPollCreateViewModelVR.vQ2().LIZIZ.size() < ZR()) {
            commentPollCreateViewModelVR.wQ2(AFwS259S0000000_21.get$arr$(93));
            this.LLJJIJIL = true;
            cS(Integer.valueOf(C1697810uHb.LJIIJ(VR().vQ2().LIZIZ)));
            mS();
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        RadiusLayout radiusLayout;
        float dimension;
        View view2;
        String string;
        UrlModel avatarThumb;
        View viewFindViewById;
        C1169900gY8 c1169900gY8;
        RadiusLayout radiusLayout2;
        RadiusLayout radiusLayout3;
        super.onViewCreated(view, bundle);
        CommentPollCreateViewModel commentPollCreateViewModelVR = VR();
        if (commentPollCreateViewModelVR.getState().LL == null) {
            commentPollCreateViewModelVR.setStateImmediate(AFwS259S0000000_21.get$arr$(95));
        }
        this.LLJI = view.findViewById(R.id.blv);
        this.LLJIJIL = (C21578619ce) view.findViewById(R.id.blx);
        this.LLJILJIL = view.findViewById(R.id.bln);
        this.LLJILJILJ = (C427870Gq9) view.findViewById(R.id.blm);
        this.LLILZIL = (C1353500lKG) view.findViewById(R.id.blw);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.blu);
        this.LLIZ = view.findViewById(R.id.bll);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.blq);
        this.LLJ = (C197039127h) view.findViewById(R.id.blk);
        View view3 = this.LLJI;
        if (view3 instanceof RadiusLayout) {
            radiusLayout = (RadiusLayout) view3;
        } else {
            radiusLayout = null;
        }
        if (radiusLayout != null) {
            radiusLayout.setSmoothRadius(true);
        }
        View view4 = this.LLIZ;
        if ((view4 instanceof RadiusLayout) && (radiusLayout3 = (RadiusLayout) view4) != null) {
            radiusLayout3.setSmoothRadius(true);
        }
        View view5 = this.LLJI;
        if (C1347570lAh.LIZIZ() && view5 != null) {
            dimension = view5.getResources().getDimension(R.dimen.jq);
        } else {
            dimension = -1.0f;
        }
        Float fValueOf = Float.valueOf(dimension);
        int length = 0;
        if (fValueOf.floatValue() >= 0.0f) {
            float fFloatValue = fValueOf.floatValue();
            View view6 = this.LLJI;
            if ((view6 instanceof RadiusLayout) && (radiusLayout2 = (RadiusLayout) view6) != null) {
                radiusLayout2.LIZ(fFloatValue, fFloatValue, 0.0f, 0.0f);
            }
        }
        C14K9.LJIJJ(view, new C1209030hZF(view, this, 0));
        View.OnLayoutChangeListener onLayoutChangeListener = this.LLJJIJIIJIL;
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL = new ViewOnLayoutChangeListenerC1401910maL(this, 2);
        this.LLJJIJIIJIL = viewOnLayoutChangeListenerC1401910maL;
        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
        if ((view instanceof C1169900gY8) && (c1169900gY8 = (C1169900gY8) view) != null) {
            c1169900gY8.setOnBackPressedPreIme(new AwS565S0100000_21(this, 217));
        }
        View view7 = getView();
        if (view7 != null && (viewFindViewById = view7.findViewById(R.id.blo)) != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 41), viewFindViewById);
        }
        View view8 = this.LLIZ;
        if (view8 != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 42), view8);
        }
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS155S0100000_21(this, 43));
        }
        C197039127h c197039127h = this.LLJ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(this, 44));
        }
        C427870Gq9 c427870Gq9 = this.LLJILJILJ;
        if (c427870Gq9 != null) {
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            if (curUser != null) {
                avatarThumb = curUser.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJ(c427870Gq9);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        C1353500lKG c1353500lKG = this.LLILZIL;
        if (c1353500lKG != null) {
            MR(c1353500lKG, ((Number) this.LLILLJJLI.getValue()).intValue(), new AwS550S0100000_6(this, 57));
            c1353500lKG.setSingleLine(false);
            c1353500lKG.setMaxLines(Integer.MAX_VALUE);
            c1353500lKG.setHorizontallyScrolling(false);
            c1353500lKG.setImeOptions(268435456);
            c1353500lKG.setOnEditorActionListener(new C0IDL(this, 0));
            c1353500lKG.addTextChangedListener(new C1402120mag(this, 4));
        }
        C1353500lKG c1353500lKG2 = this.LLILZIL;
        if (c1353500lKG2 != null && (view2 = this.LLJI) != null) {
            C1347410lAR c1347410lARVQ2 = VR().vQ2();
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrzIZn8M2Oe2vX6AkEDe3I8q2jYyI50=", null));
            if (editableLLLZZIL != null) {
                string = editableLLLZZIL.toString();
            } else {
                string = null;
            }
            if (!Intrinsics.LJFF(string, c1347410lARVQ2.LIZ)) {
                c1353500lKG2.setText(c1347410lARVQ2.LIZ);
                Editable editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaMrzIZn8M2Oe2vX6AkEDe3I8q2jYyI50=", null));
                if (editableLLLZZIL2 != null) {
                    length = editableLLLZZIL2.length();
                }
                c1353500lKG2.setSelection(length);
            }
            bS();
            cS(null);
            mS();
            HandlerHook.viewPost(view2, new ARunnableS75S0200000_6(view2, this, 29));
        }
        if (bundle != null) {
            HandlerHook.viewPost(view, new ARunnableS75S0200000_6(view, this, 25));
        }
        requireActivity().getOnBackPressedDispatcher().LIZ(getViewLifecycleOwner(), new C1401780ma8(this, 1));
    }

    public final void MR(C1353500lKG c1353500lKG, final int i, final Function0 function0) {
        c1353500lKG.setFilters(new InputFilter[]{new InputFilter() { // from class: X.07k1
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                Function0<Unit> function02;
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                for (int i6 = i2; i6 < i3; i6++) {
                    char cCharAt = charSequence.charAt(i6);
                    if (cCharAt != '\n' && cCharAt != '\r') {
                        sb.append(cCharAt);
                    } else if (i3 - i2 == 1) {
                        z = true;
                    }
                }
                String string = sb.toString();
                if (z && (function02 = function0) != null) {
                    function02.invoke();
                }
                if (string.length() == i3 - i2) {
                    return null;
                }
                return string;
            }
        }, new InputFilter() { // from class: X.0HZq
            /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[EDGE_INSN: B:17:0x0066->B:18:0x0067 BREAK  A[LOOP:0: B:13:0x005d->B:32:?], PHI: r7
              0x0067: PHI (r7v2 java.lang.String) = 
              (r7v1 java.lang.String)
              (r7v1 java.lang.String)
              (r7v1 java.lang.String)
              (r7v5 java.lang.String)
              (r7v6 java.lang.String)
             binds: [B:5:0x0014, B:7:0x003d, B:11:0x004c, B:25:0x0097, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.text.InputFilter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.CharSequence filter(java.lang.CharSequence r9, int r10, int r11, android.text.Spanned r12, int r13, int r14) {
                /*
                    r8 = this;
                    int r5 = r1
                    java.lang.CharSequence r0 = r9.subSequence(r10, r11)
                    java.lang.String r6 = r0.toString()
                    int r0 = r6.length()
                    r4 = 0
                    r3 = 1
                    if (r0 == 0) goto L9a
                    java.lang.String r7 = ""
                    if (r5 <= 0) goto L67
                    int r2 = r12.length()
                    int r0 = r14 - r13
                    int r2 = r2 - r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>(r2)
                    java.lang.CharSequence r0 = r12.subSequence(r4, r13)
                    r1.append(r0)
                    int r0 = r12.length()
                    java.lang.CharSequence r0 = r12.subSequence(r14, r0)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    int r0 = X.C443230HZp.LIZ(r0)
                    int r5 = r5 - r0
                    if (r5 <= 0) goto L67
                    int r0 = X.C443230HZp.LIZ(r6)
                    if (r0 <= r5) goto L9a
                    r6.toString()
                    int r0 = r6.length()
                    if (r0 == 0) goto L67
                    java.util.Locale r0 = java.util.Locale.getDefault()
                    java.text.BreakIterator r2 = java.text.BreakIterator.getCharacterInstance(r0)
                    r2.setText(r6)
                    int r1 = r2.first()
                L5d:
                    r0 = -1
                    if (r1 == r0) goto L93
                    int r1 = r2.next()
                    if (r1 != r0) goto L8e
                    r7 = r6
                L67:
                    if (r11 <= r10) goto L8d
                    X.0mGx r6 = new X.0mGx
                    com.ss.android.ugc.aweme.comment.poll.PollCreateFragment r0 = r2
                    r6.<init>(r0)
                    com.ss.android.ugc.aweme.comment.poll.PollCreateFragment r0 = r2
                    int r5 = r1
                    android.content.res.Resources r2 = r0.getResources()
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    java.lang.String r0 = java.lang.String.valueOf(r5)
                    r1[r4] = r0
                    r0 = 2131755155(0x7f100093, float:1.9141181E38)
                    java.lang.String r0 = r2.getQuantityString(r0, r5, r1)
                    r6.LJIIJ(r0)
                    r6.LJIIJJI()
                L8d:
                    return r7
                L8e:
                    int r5 = r5 + (-1)
                    if (r5 <= 0) goto L93
                    goto L5d
                L93:
                    java.lang.String r7 = r6.substring(r4, r1)
                    if (r7 == 0) goto L8d
                    goto L67
                L9a:
                    r7 = 0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C443240HZq.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
            }
        }});
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        boolean z = C1354730lMF.LIZ;
        View viewLIZIZ = C21146717pB.LIZIZ(C1354730lMF.LIZIZ(requireContext()), R.layout.a2c, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
            viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLIZIZ;
        }
    }

    public static CharSequence NR(Context context, int i, int i2, String str) {
        int i3 = i2 + i;
        int length = str.length();
        if (i3 > length) {
            i3 = length;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_down_small_fill;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (i < i3) {
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), i, i3, 33);
            }
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(41, false), i, i3, 33);
        }
        spannableStringBuilder.insert(i3, (CharSequence) "￼");
        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, i3, i3 + 1, 33);
        return spannableStringBuilder;
    }

    public final void kS(View view, float f, final List<? extends Pair<? extends View, Float>> list, final Function1<? super Float, Unit> function1, final Function0<Unit> function0) {
        ArrayList<Pair> arrayList = (ArrayList) list;
        if ((!arrayList.isEmpty() || function1 != null) && f != 0.0f) {
            for (Pair pair : arrayList) {
                C786410Ut5.ed((View) pair.getFirst(), ((Number) pair.getSecond()).floatValue());
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Pair) it2.next()).getFirst());
            }
            this.LLJJL = arrayList2;
            final C21647019ng c21647019ng = new C21647019ng(view.getContext(), view, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(37.7f)), Collections.singletonList(new C19746412Nq("poll_create_panel_translate", new C0HV5(f, 0.0f)))), false);
            c21647019ng.LIZJ("poll_create_panel_translate", new InterfaceC21641019mi() { // from class: X.0HaP
                @Override // X.InterfaceC21641019mi
                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    PollCreateFragment pollCreateFragment = this.LIZ;
                    if (pollCreateFragment.LLJJJJJIL != c21647019ng) {
                        return;
                    }
                    pollCreateFragment.LLJJJJJIL = null;
                    pollCreateFragment.LLJJJJLIIL = false;
                    Iterator<Pair<View, Float>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        C786410Ut5.ed(it3.next().getFirst(), 0.0f);
                    }
                    this.LIZ.LLJJL = null;
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                @Override // X.InterfaceC21641019mi
                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    if (this.LIZ.LLJJJJJIL != c21647019ng) {
                        return;
                    }
                    float fLIZLLL = C13LZ.LIZLLL(interfaceC1844880y6o.getProgress(), 0.0f, 1.0f);
                    Function1<Float, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Float.valueOf(fLIZLLL));
                    }
                    float f2 = 1.0f - fLIZLLL;
                    for (Pair<View, Float> pair2 : list) {
                        C786410Ut5.ed(pair2.getFirst(), pair2.getSecond().floatValue() * f2);
                    }
                }
            });
            this.LLJJJJJIL = c21647019ng;
            c21647019ng.LJI(true);
            return;
        }
        this.LLJJJJLIIL = false;
        if (function1 != null) {
            function1.invoke(Float.valueOf(1.0f));
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
