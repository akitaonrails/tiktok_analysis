package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep;

import X.C098200Yq;
import X.C0D9L;
import X.C0DGJ;
import X.C0DGK;
import X.C0DGM;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C334520D9m;
import X.C334540D9o;
import X.C334600D9u;
import X.C336380DGq;
import X.C419910GdJ;
import X.C497820Jfg;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BaseBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class OnestepOrderSummaryBottomSheet extends BaseBottomSheetFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiPCwjZiwhOSN9HELIOSPSxiOS40LTZiJiE2OzEpOWEcJiA/PSojBzcoLD0APSghKD0qCio4PSA+Gy0pLDs=";

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.BaseBottomSheetFragment
    public final double NR() {
        return 0.6d;
    }

    public final int PR(int i) {
        return (int) (i * requireContext().getResources().getDisplayMetrics().density);
    }

    public static int RR(int i, int i2, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, i2);
            typedArrayObtainStyledAttributes.recycle();
            return color;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Serializable serializable;
        C334520D9m c334520D9m;
        Serializable serializable2;
        C334540D9o c334540D9o;
        String string;
        int i;
        int i2;
        int i3;
        int iIntValue;
        int i4;
        C19GS c19gs;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        Context contextRequireContext = requireContext();
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("arg_summary");
        } else {
            serializable = null;
        }
        if (serializable instanceof C334520D9m) {
            c334520D9m = (C334520D9m) serializable;
        } else {
            c334520D9m = null;
        }
        if (c334520D9m != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                serializable2 = arguments2.getSerializable("arg_deals");
            } else {
                serializable2 = null;
            }
            if (serializable2 instanceof C334540D9o) {
                c334540D9o = (C334540D9o) serializable2;
            } else {
                c334540D9o = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("arg_total_amount");
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            int iRR = RR(R.attr.zp, -460552, contextRequireContext);
            final float dimension = contextRequireContext.getResources().getDimension(R.dimen.b1);
            ScrollView scrollView = new ScrollView(contextRequireContext);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(scrollView);
            scrollView.setLayoutParams(layoutParams);
            scrollView.setFillViewport(true);
            scrollView.setClipToPadding(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{dimension, dimension, dimension, dimension, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setColor(iRR);
            scrollView.setBackground(gradientDrawable);
            scrollView.setClipToOutline(true);
            scrollView.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0Ga1
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Path path = new Path();
                        float f = dimension;
                        path.addRoundRect(new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight()), new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                        outline.setPath(path);
                        return;
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), dimension);
                }
            });
            scrollView.setPadding(0, 0, 0, 0);
            LinearLayout linearLayout = new LinearLayout(contextRequireContext);
            C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(iRR);
            LinearLayout linearLayout2 = new LinearLayout(contextRequireContext);
            C786410Ut5.d6(linearLayout2, new ViewGroup.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            linearLayout2.setBackgroundColor(RR(R.attr.zq, -1, contextRequireContext));
            FrameLayout frameLayout = new FrameLayout(contextRequireContext);
            C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(-1, PR(52)));
            TuxIconView tuxIconView = new TuxIconView(contextRequireContext, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(PR(52), PR(52));
            layoutParams2.gravity = 8388627;
            C786410Ut5.M6(tuxIconView, layoutParams2);
            tuxIconView.setContentDescription(null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_ltr;
            c419910GdJ.LIZIZ = PR(24);
            c419910GdJ.LIZJ = PR(24);
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS139S0100000_4(this, 75));
            frameLayout.addView(tuxIconView);
            TuxTextView tuxTextView = new TuxTextView(contextRequireContext, null, 6, 0);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            C786410Ut5.R6(tuxTextView, layoutParams3);
            tuxTextView.setTextAppearance(R.style.zu);
            tuxTextView.setTuxFont(33);
            tuxTextView.setTextColor(RR(R.attr.a1h, -15329245, contextRequireContext));
            tuxTextView.setText(C0D9L.LIZ(2131857502));
            frameLayout.addView(tuxTextView);
            linearLayout2.addView(frameLayout);
            View view = new View(contextRequireContext);
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C336380DGq.LIZ(contextRequireContext.getResources(), R.dimen.b2t)));
            view.setBackgroundColor(RR(R.attr.a02, 335544320, contextRequireContext));
            linearLayout2.addView(view);
            linearLayout.addView(linearLayout2);
            if (c334540D9o != null) {
                C0DGK c0dgkLIZ = C0DGK.LIZ(layoutInflater, null);
                int iRR2 = RR(R.attr.zq, -1, requireContext());
                C786410Ut5.d6(c0dgkLIZ.LL, new LinearLayout.LayoutParams(-1, -2));
                c0dgkLIZ.LL.setBackgroundColor(iRR2);
                View childAt = c0dgkLIZ.LL.getChildAt(0);
                if (!(childAt instanceof ViewGroup)) {
                    childAt = null;
                }
                if (childAt != null) {
                    childAt.setBackgroundColor(iRR2);
                }
                C786410Ut5.LJLLLLLL(8, c0dgkLIZ.LLILZ);
                ViewGroup.LayoutParams layoutParams4 = c0dgkLIZ.LLILLJJLI.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = 0;
                    C786410Ut5.R6(c0dgkLIZ.LLILLJJLI, marginLayoutParams);
                }
                List<String> list = c334540D9o.tags;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    if (!a0.LJJJIL(str)) {
                        arrayList.add(str);
                    }
                }
                c0dgkLIZ.LLILZ.setText(c334540D9o.title);
                C786410Ut5.LJJJJJL(c0dgkLIZ.LLILLL);
                if (!arrayList.isEmpty()) {
                    c0dgkLIZ.LLILLJJLI.setText(c334540D9o.summaryText);
                    C786410Ut5.LJLLLLLL(0, c0dgkLIZ.LLILLL);
                    int i5 = 0;
                    for (Object obj : arrayList) {
                        int i6 = i5 + 1;
                        if (i5 >= 0) {
                            String str2 = (String) obj;
                            LinearLayout linearLayout3 = c0dgkLIZ.LLILLL;
                            if (i5 > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Context context = c0dgkLIZ.LL.getContext();
                            TextView textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i3x, c0dgkLIZ.LLILLL, false);
                            textView.setText(str2);
                            textView.setMaxWidth(C497820Jfg.LIZIZ(context) - (C336380DGq.LIZ(context.getResources(), R.dimen.b39) * 2));
                            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                            if (z) {
                                layoutParams5.topMargin = C336380DGq.LIZ(context.getResources(), R.dimen.b3_);
                            }
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
                            textView.setLayoutParams(layoutParams5);
                            linearLayout3.addView(textView);
                            i5 = i6;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    c0dgkLIZ.LLILLJJLI.setText(C0D9L.LIZ(2131857487));
                    C786410Ut5.LJLLLLLL(8, c0dgkLIZ.LLILLL);
                }
                linearLayout.addView(c0dgkLIZ.LL);
            }
            C0DGJ c0dgjLIZ = C0DGJ.LIZ(layoutInflater, null);
            int iRR3 = RR(R.attr.zq, -1, requireContext());
            C786410Ut5.d6(c0dgjLIZ.LL, new LinearLayout.LayoutParams(-1, -2));
            c0dgjLIZ.LL.setBackgroundColor(iRR3);
            View childAt2 = c0dgjLIZ.LL.getChildAt(0);
            if (!(childAt2 instanceof ViewGroup)) {
                childAt2 = null;
            }
            if (childAt2 != null) {
                childAt2.setBackgroundColor(iRR3);
            }
            c0dgjLIZ.LLILZIL.setBackgroundColor(iRR3);
            C786410Ut5.LJLLLLLL(8, c0dgjLIZ.LLILZ);
            boolean zIsEmpty = c334520D9m.rows.isEmpty();
            if (a0.LJJJIL(string)) {
                string = c334520D9m.totalAmount.formatted();
            }
            LinearLayout linearLayout4 = c0dgjLIZ.LL;
            boolean z2 = !zIsEmpty;
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, linearLayout4);
            LinearLayout linearLayout5 = c0dgjLIZ.LLILLJJLI;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, linearLayout5);
            C786410Ut5.LJLLLLLL(8, c0dgjLIZ.LLILLL);
            LinearLayout linearLayout6 = c0dgjLIZ.LLILZIL;
            if (z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, linearLayout6);
            C786410Ut5.LJLLLLLL(8, c0dgjLIZ.LLILZLL);
            C786410Ut5.LJJJJJL(c0dgjLIZ.LLILLJJLI);
            if (zIsEmpty) {
                c0dgjLIZ.LLIZ.setText(string);
            } else {
                for (C334600D9u c334600D9u : c334520D9m.rows) {
                    C0DGM c0dgmLIZ = C0DGM.LIZ(C786410Ut5.ne(c0dgjLIZ.LL.getContext()), c0dgjLIZ.LLILLJJLI);
                    c0dgmLIZ.LLILLL.setText(c334600D9u.title);
                    c0dgmLIZ.LLILLJJLI.setText(c334600D9u.amountText);
                    Context context2 = c0dgjLIZ.LL.getContext();
                    if (c334600D9u.isEmphasized()) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -15329245;
                        }
                    } else {
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, context2);
                        if (numLIZJ2 != null) {
                            iIntValue = numLIZJ2.intValue();
                        } else {
                            iIntValue = -8158333;
                        }
                    }
                    if (c334600D9u.isEmphasized()) {
                        i4 = 52;
                    } else {
                        i4 = 51;
                    }
                    c0dgmLIZ.LLILLL.setTuxFont(i4);
                    c0dgmLIZ.LLILLJJLI.setTuxFont(i4);
                    c0dgmLIZ.LLILLL.setTextColor(iIntValue);
                    c0dgmLIZ.LLILLJJLI.setTextColor(iIntValue);
                    c0dgjLIZ.LLILLJJLI.addView(c0dgmLIZ.LL);
                }
                c0dgjLIZ.LLIZ.setText(string);
            }
            linearLayout.addView(c0dgjLIZ.LL);
            scrollView.addView(linearLayout);
            MR(scrollView, scrollView);
            try {
                ViewTreeLifecycleOwner.set(scrollView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(scrollView, this);
                scrollView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                } else {
                    c19gs = null;
                }
                C1685300txQ.LIZ(c19gs);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return scrollView;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return scrollView;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
