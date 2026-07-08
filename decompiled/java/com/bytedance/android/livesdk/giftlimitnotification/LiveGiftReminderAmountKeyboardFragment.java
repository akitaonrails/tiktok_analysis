package com.bytedance.android.livesdk.giftlimitnotification;

import X.C098200Yq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C16FV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2262401Dgs;
import X.C250000xu;
import X.C250500xz;
import X.C251000y4;
import X.C497740JfY;
import X.C500260Jjc;
import X.C511701z1;
import X.C766270U4b;
import X.C786120Usc;
import X.C786410Ut5;
import X.InterfaceC250300xx;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS147S0100000_12;
import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormatSymbols;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGiftReminderAmountKeyboardFragment extends BaseFragment implements InterfaceC250300xx {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPSM6JSw4JyAnISMlHELIOSKi4nISoiZwM6PiALICknGiAhICE3LTcNJCAmJjEHLDYxJyQ+LQkhKSIhLCEn";
    public LinearLayout LL;
    public C16F5 LLILLJJLI;
    public ImageView LLILLL;
    public LiveEditText LLILZ;
    public C2262401Dgs LLILZIL;
    public C16FV LLILZLL;
    public C16FS LLIZ;
    public C16F5 LLIZLLLIL;
    public FrameLayout LLJ;
    public LinearLayout LLJI;
    public FrameLayout LLJIJIL;
    public boolean LLJILJIL;

    public final C16FS NR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cu4) : null;
            this.LLIZ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C16F5 OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m2h) : null;
            this.LLILLJJLI = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final C16FV PR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m2j) : null;
            this.LLILZLL = (C16FV) viewFindViewById;
        }
        return (C16FV) viewFindViewById;
    }

    public final LiveEditText RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m2i) : null;
            this.LLILZ = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final LinearLayout SR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m2v) : null;
            this.LLJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C16F5 UR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m31) : null;
            this.LLIZLLLIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // X.InterfaceC250300xx
    public final void onFailure() {
        C250000xu.LIZ.getClass();
        C766270U4b.LJIIJJI(C250000xu.LJJIFFI);
    }

    @Override // X.InterfaceC250300xx
    public final void onSuccess() {
        C250000xu.LIZ.getClass();
        C766270U4b.LJIIJJI(C250000xu.LJJI);
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.m2q) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        viewFindViewById.performClick();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    public static String VR(String str) {
        String strValueOf = String.valueOf(DecimalFormatSymbols.getInstance().getDecimalSeparator());
        String str2 = e3.d;
        if (Intrinsics.LJFF(strValueOf, e3.d)) {
            str2 = ",";
        }
        return u.LJJIFFI(str, str2, "", false);
    }

    public final void WR(String str) {
        int i;
        LiveEditText liveEditTextRR = RR();
        if (str.length() == 0) {
            i = 5;
        } else {
            i = 3;
        }
        liveEditTextRR.setTextDirection(i);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZ;
        String string;
        TextPaint paint;
        String strLJJIFFI;
        int i;
        int iLIZIZ;
        int iMeasureText;
        int iMeasureText2;
        String strLJIJI;
        DisplayMetrics displayMetrics;
        String str;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.m71);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LinearLayout) viewFindViewById;
        }
        LayoutTransition layoutTransition = ((ViewGroup) viewFindViewById).getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
        }
        C250000xu.LIZ.getClass();
        if (C250000xu.LJIILL) {
            C500260Jjc.LJIILIIL(OR());
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.lca);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (ImageView) viewFindViewById3;
            }
            C500260Jjc.LLFFF(viewFindViewById3);
        } else {
            C500260Jjc.LLFFF(OR());
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.lca);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (ImageView) viewFindViewById4;
            }
            C500260Jjc.LJIILIIL(viewFindViewById4);
            OR().setText(C250000xu.LJIIZILJ);
        }
        LiveEditText liveEditTextRR = RR();
        liveEditTextRR.setShowSoftInputOnFocus(false);
        liveEditTextRR.requestFocus();
        View viewFindViewById5 = this.LLILZIL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.m2o);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZIL = (C2262401Dgs) viewFindViewById5;
        }
        ((C2262401Dgs) viewFindViewById5).setInputConnection(liveEditTextRR.onCreateInputConnection(new EditorInfo()));
        SpannableString spannableString = new SpannableString(getString(2131841309));
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
        liveEditTextRR.setHint(new SpannableString(spannableString));
        Integer value = C250000xu.LJJ.getValue();
        int iLIZIZ2 = -1;
        if (value != null && value.intValue() == -1) {
            liveEditTextRR.setText("");
            NR().setEnabled(false);
            C500260Jjc.LJIILIIL(PR());
        } else {
            if (C250000xu.LJIILL) {
                numLIZ = Integer.valueOf(C250000xu.LJIL);
            } else {
                numLIZ = C250000xu.LIZ();
            }
            if (numLIZ != null && (string = numLIZ.toString()) != null) {
                String strLIZ = C251000y4.LIZ(string);
                liveEditTextRR.setText(strLIZ);
                WR(strLIZ);
                RR().setSelection(strLIZ.length());
                C500260Jjc.LLFFF(PR());
            }
        }
        String str2 = C250000xu.LJJIII;
        String strLJIJI2 = C497740JfY.LJIJI(2131843924);
        if (C250000xu.LJII()) {
            this.LLJILJIL = false;
            C16F5 c16f5UR = UR();
            if (c16f5UR != null) {
                C500260Jjc.LJIILIIL(c16f5UR);
            }
        } else {
            C16F5 c16f5UR2 = UR();
            if (c16f5UR2 != null) {
                paint = c16f5UR2.getPaint();
            } else {
                paint = null;
            }
            String strValueOf = String.valueOf(C250000xu.LIZIZ());
            if (C250000xu.LJIILL) {
                strLJJIFFI = u.LJJIFFI(str2, "{amount}", strValueOf, false);
            } else {
                strLJJIFFI = u.LJJIFFI(u.LJJIFFI(str2, "{currency}", C250000xu.LJIIZILJ, false), "{amount}", strValueOf, false);
            }
            Resources system = Resources.getSystem();
            if (system != null && (displayMetrics = system.getDisplayMetrics()) != null) {
                i = displayMetrics.widthPixels;
            } else {
                i = 1080;
            }
            if (i - ((int) C497740JfY.LIZIZ(32.0f)) == 0) {
                iLIZIZ = 874;
            } else {
                iLIZIZ = i - ((int) C497740JfY.LIZIZ(32.0f));
            }
            if (paint != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJIFFI);
                sbLIZ.append("  ");
                iMeasureText = ((int) paint.measureText(C2188811AlT.LIZIZ(sbLIZ))) / iLIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJJIFFI);
                sbLIZ2.append("  ");
                sbLIZ2.append(strLJIJI2);
                iMeasureText2 = ((int) paint.measureText(C2188811AlT.LIZIZ(sbLIZ2))) / iLIZIZ;
            } else {
                iMeasureText = 0;
                iMeasureText2 = 0;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLJJIFFI);
            if (iMeasureText2 > iMeasureText) {
                sbLIZ3.append("  \n");
            } else {
                sbLIZ3.append("  ");
            }
            sbLIZ3.append(strLJIJI2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            LiveEditText liveEditTextRR2 = RR();
            int iLIZIZ3 = C250000xu.LIZIZ();
            String strLIZ2 = C251000y4.LIZ(String.valueOf(iLIZIZ3));
            String strLJJIFFI2 = u.LJJIFFI(strLIZIZ, String.valueOf(iLIZIZ3), strLIZ2, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJJIFFI2);
            C511701z1 c511701z1 = new C511701z1(liveEditTextRR2, 3);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C497740JfY.LJFF(R.color.ct));
            StyleSpan styleSpan = new StyleSpan(1);
            int length = strLJJIFFI2.length() - strLJIJI2.length();
            int length2 = strLJJIFFI2.length();
            if (a0.LJJIIZI(strLJJIFFI2, strLJIJI2, false)) {
                C786410Ut5.q2(spannableStringBuilder, c511701z1, length, length2, 17);
                C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length, length2, 17);
                C786410Ut5.q2(spannableStringBuilder, styleSpan, length, length2, 17);
            }
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C497740JfY.LJFF(R.color.da));
            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C497740JfY.LJFF(R.color.da));
            if (C250000xu.LJIILL) {
                strLJIJI = C497740JfY.LJIJI(2131841255);
            } else {
                strLJIJI = C250000xu.LJIIZILJ;
            }
            if (a0.LJJIIZI(strLJJIFFI2, strLJIJI, false)) {
                C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, a0.LJJJ(strLJJIFFI2, strLJIJI, 0, false, 6), a0.LJJJ(strLJJIFFI2, strLJIJI, 0, false, 6) + strLJIJI.length(), 17);
            }
            if (a0.LJJIIZI(strLJJIFFI2, strLIZ2, false)) {
                C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan3, a0.LJJJJI(strLJJIFFI2, strLIZ2, 0, 6), a0.LJJJJI(strLJJIFFI2, strLIZ2, 0, 6) + strLIZ2.length(), 17);
            }
            this.LLJILJIL = true;
            UR().setText(spannableStringBuilder);
            UR().setMovementMethod(LinkMovementMethod.getInstance());
            UR().setHighlightColor(0);
            C16F5 c16f5UR3 = UR();
            if (c16f5UR3 != null) {
                C500260Jjc.LLFFF(c16f5UR3);
            }
        }
        boolean z = this.LLJILJIL;
        boolean zLJ = C250000xu.LJ();
        String str3 = C250000xu.LJJIJIIJI;
        String str4 = C250000xu.LJJIJIIJIL;
        if (C250000xu.LJIJI > C250000xu.LJIJJ) {
            str = "highest";
        } else {
            str = "suggest";
        }
        if (str.length() == 0) {
            str = "-1";
        }
        if (!C250000xu.LJII()) {
            iLIZIZ2 = C250000xu.LIZIZ();
        }
        C250500xz.LIZIZ(zLJ ? 1 : 0, z ? 1 : 0, iLIZIZ2, 2, str3, str4, str, C250000xu.LJIILIIL, C250000xu.LJIILL);
        View view6 = this.LLJ;
        if (view6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById2 = view7.findViewById(R.id.m2q);
            }
            this.LLJ = (FrameLayout) viewFindViewById2;
            view6 = viewFindViewById2;
        }
        C786410Ut5.O7((FrameLayout) view6, new ACListenerS147S0100000_12(this, 402));
        RR().addTextChangedListener(new C786120Usc(this, 18));
        C786410Ut5.m8(PR(), new ViewOnClickListenerC512201z6(this, 54));
        C786410Ut5.h8(NR(), new ViewOnClickListenerC512201z6(this, 34));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.goc, viewGroup, false);
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
