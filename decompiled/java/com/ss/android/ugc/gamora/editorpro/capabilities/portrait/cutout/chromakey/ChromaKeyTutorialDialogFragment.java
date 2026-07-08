package com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.chromakey;

import X.C01GW;
import X.C098200Yq;
import X.C0EGL;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C357270DzZ;
import X.C374620EmS;
import X.C374770Emh;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS140S0100000_5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Size;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class ChromaKeyTutorialDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCw4ICogZjUjOzshHELIOSKSw4ZywmPCo5PWEwIDcjJC44LTxiCichJygtAioqHDA4Jj06KSkIIC4/JyIKOy40JSAiPQ==";
    public Size LL;
    public C357270DzZ LLILLJJLI;
    public int LLILLL;
    public FrameLayout LLILZ;
    public C374620EmS LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 525));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 526));

    public final FrameLayout MR() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.e8o);
            this.LLILZ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C374620EmS c374620EmS = this.LLILZIL;
        if (c374620EmS != null) {
            c374620EmS.LIZ.C5();
            c374620EmS.LIZ.LLJJJJLIIL = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Window window;
        Unit unit;
        Window window2;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
            try {
                window.addFlags(Integer.MIN_VALUE);
                Integer numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), view.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    Dialog dialog2 = getDialog();
                    if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
                        window2.setNavigationBarColor(iIntValue);
                    }
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        FrameLayout frameLayoutMR = MR();
        if (frameLayoutMR != null && (layoutParams2 = frameLayoutMR.getLayoutParams()) != null) {
            layoutParams2.height = ((Number) this.LLILZLL.getValue()).intValue();
        }
        FrameLayout frameLayoutMR2 = MR();
        if (frameLayoutMR2 != null && (layoutParams = frameLayoutMR2.getLayoutParams()) != null) {
            layoutParams.width = ((Number) this.LLIZ.getValue()).intValue();
        }
        FrameLayout frameLayoutMR3 = MR();
        if (frameLayoutMR3 != null) {
            C426750GoL.LJIIIZ(frameLayoutMR3, null, Integer.valueOf((this.LLILLL - ((Number) this.LLILZLL.getValue()).intValue()) - ScreenUtils.getStatusBarHeight(view.getContext())), null, null, false, 29);
        }
        C374770Emh c374770Emh = (C374770Emh) view.findViewById(R.id.e8m);
        if (c374770Emh != null) {
            c374770Emh.setInitialColor$tools_camera_edit_release(0L);
            c374770Emh.setEnableTouchEvent(false);
        }
        View viewFindViewById = view.findViewById(R.id.yzk);
        Size size = this.LL;
        if (size != null) {
            int width = size.getWidth();
            if (viewFindViewById != null) {
                viewFindViewById.getLayoutParams().width = width;
                viewFindViewById.requestLayout();
            }
        }
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 50), view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c0c, viewGroup, false);
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
