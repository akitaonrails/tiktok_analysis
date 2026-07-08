package com.ss.android.ugc.aweme.ogc.news.sticker.consumer;

import X.AbstractC1554310qY9;
import X.C098200Yq;
import X.C1048030dNZ;
import X.C12Y5;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1591860rWi;
import X.C1685300txQ;
import X.C16G1;
import X.C189200o6;
import X.C197053127v;
import X.C19EG;
import X.C19GS;
import X.C19GU;
import X.C1BHX;
import X.C339190DRl;
import X.C786410Ut5;
import X.InterfaceC1542320qEo;
import X.InterfaceC19617411p6;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS238S0300000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ArticleLinkStickerIABSheet extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiorKmE9LTI/ZzwnISYnHELIOSLD19KyoiOjo+LTdiCD0nISYgLAM6Ji4fPSYwIyA+AA4RGy0pLDs=";
    public final C197053127v LL = new C197053127v();
    public BottomSheetBehavior<?> LLILLJJLI;
    public C1BHX LLILLL;
    public String LLILZ;
    public InterfaceC19617411p6 LLILZIL;

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLILLJJLI;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.LIZIZ(5, true);
        }
    }

    public final void MR() {
        super.dismiss();
        InterfaceC19617411p6 interfaceC19617411p6 = this.LLILZIL;
        if (interfaceC19617411p6 != null) {
            C197053127v c197053127v = this.LL;
            long jCurrentTimeMillis = c197053127v.LIZIZ + (System.currentTimeMillis() - c197053127v.LIZ);
            c197053127v.LIZIZ = 0L;
            c197053127v.LIZ = 0L;
            interfaceC19617411p6.LIZ(jCurrentTimeMillis);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C197053127v c197053127v = this.LL;
        c197053127v.LIZIZ += System.currentTimeMillis() - c197053127v.LIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C197053127v c197053127v = this.LL;
        c197053127v.getClass();
        c197053127v.LIZ = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C197053127v c197053127v = this.LL;
        c197053127v.getClass();
        c197053127v.LIZ = System.currentTimeMillis();
        c197053127v.LIZIZ = 0L;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        final Context contextRequireContext = requireContext();
        C19GU c19gu = new C19GU(contextRequireContext) { // from class: X.127q
            @Override // X.C19EK, android.app.Dialog
            public final void onBackPressed() {
                C1BHX c1bhx = this.LLILZLL.LLILLL;
                if (c1bhx == null || !c1bhx.canGoBack()) {
                    this.LLILZLL.dismiss();
                    return;
                }
                C1BHX c1bhx2 = this.LLILZLL.LLILLL;
                if (c1bhx2 != null) {
                    c1bhx2.LIZIZ();
                }
            }

            public final void LJJZ() {
                Window window = getWindow();
                if (window != null) {
                    window.getDecorView().setPadding(0, 0, 0, 0);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setStatusBarColor(0);
                }
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void onCreate(Bundle bundle2) {
                View viewFindViewById;
                super.onCreate(bundle2);
                if (Build.VERSION.SDK_INT >= 35 && (viewFindViewById = findViewById(R.id.ri8)) != null) {
                    C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0y1J
                        @Override // X.C0TVI
                        public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                            view.setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
                            return c20246014Ju;
                        }
                    });
                }
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void setContentView(int i) {
                super.setContentView(i);
                LJJZ();
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void setContentView(View view) {
                super.setContentView(view);
                LJJZ();
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
                super.setContentView(view, layoutParams);
                LJJZ();
            }
        };
        Window window = c19gu.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c19gu);
        return c19gu;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.ri2);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = (int) (ScreenUtils.getScreenHeight(viewFindViewById.getContext()) * 0.856f);
        C786410Ut5.W5(viewFindViewById, layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, viewFindViewById.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        float fLIZ = C339190DRl.LIZ(14);
        gradientDrawable.setCornerRadii(new float[]{fLIZ, fLIZ, fLIZ, fLIZ, 0.0f, 0.0f, 0.0f, 0.0f});
        viewFindViewById.setBackground(gradientDrawable);
        BottomSheetBehavior<?> bottomSheetBehavior = (BottomSheetBehavior) ((C16G1) viewFindViewById.getLayoutParams()).LIZ;
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setPeekHeight(0);
        AbstractC1554310qY9 abstractC1554310qY9 = new AbstractC1554310qY9() { // from class: X.127u
            @Override // X.AbstractC1554310qY9
            public final void LIZ(View view2, float f) {
            }

            @Override // X.AbstractC1554310qY9
            public final void LIZIZ(int i, View view2) {
                if (i != 4 && i != 5) {
                    return;
                }
                this.LIZ.MR();
            }
        };
        if (!bottomSheetBehavior.LJJIJLIJ.contains(abstractC1554310qY9)) {
            bottomSheetBehavior.LJJIJLIJ.add(abstractC1554310qY9);
        }
        this.LLILLJJLI = bottomSheetBehavior;
        final View viewFindViewById2 = view.findViewById(R.id.k44);
        C786410Ut5.LJLLLLLL(4, viewFindViewById2);
        C786410Ut5.I7(new C12Y5(this, 9), viewFindViewById2);
        final TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        final TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        C786410Ut5.I7(new C12Y5(this, 10), view.findViewById(R.id.k0c));
        C1048030dNZ c1048030dNZ = new C1048030dNZ();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.s8s);
        viewGroup.addView(c1048030dNZ.LIZIZ(viewGroup.getContext()), new FrameLayout.LayoutParams(-1, -2));
        final C1BHX c1bhx = (C1BHX) view.findViewById(R.id.webview);
        c1bhx.setWebTitleCallback(new InterfaceC1542320qEo() { // from class: X.127t
            @Override // X.InterfaceC1542320qEo
            public final void LIZJ(String str, boolean z) {
            }

            @Override // X.InterfaceC1542320qEo
            public final void LIZ(String str) {
                tuxTextView2.setText(str);
            }

            @Override // X.InterfaceC1542320qEo
            public final void LIZIZ(String str) {
                int i;
                tuxTextView.setText(str);
                View view2 = viewFindViewById2;
                if (c1bhx.canGoBack()) {
                    i = 0;
                } else {
                    i = 4;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
        });
        C1591860rWi.LIZ(c1bhx, new AwS238S0300000_29(this, c1bhx, c1048030dNZ, 7));
        this.LLILLL = c1bhx;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.rc, viewGroup, false);
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
