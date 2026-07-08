package com.ss.android.ugc.aweme.captionsheet;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19GU;
import X.C786410Ut5;
import Y.ACListenerS139S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class LandscapeCaptionDialogFragment extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYtOTs6Jys/ISHELIOSo2PGsAKCE3OyYtOSoQKTU4ICA9DCwtJSA0DjctLiI2JjE=";
    public LandscapeCaptionPanelFragment LL;

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        final Context contextRequireContext = requireContext();
        C19GU c19gu = new C19GU(contextRequireContext) { // from class: X.0ll4
            {
                super(contextRequireContext, R.style.aca);
                LJJLL(1);
                Window window = getWindow();
                if (window != null) {
                    window.setFlags(1024, 1024);
                }
                if (C444960Hcc.LIZJ(contextRequireContext)) {
                    Window window2 = getWindow();
                    if (window2 != null) {
                        window2.setWindowAnimations(R.style.ads);
                        return;
                    }
                    return;
                }
                Window window3 = getWindow();
                if (window3 == null) {
                    return;
                }
                window3.setWindowAnimations(R.style.afn);
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void onCreate(Bundle bundle2) {
                super.onCreate(bundle2);
                final Window window = getWindow();
                if (window != null) {
                    if (C444960Hcc.LIZJ(window.getContext())) {
                        window.setGravity(3);
                    } else {
                        window.setGravity(5);
                    }
                    window.setLayout(-1, -1);
                    window.getDecorView().setSystemUiVisibility(6);
                    window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: X.0ll5
                        @Override // android.view.View.OnSystemUiVisibilityChangeListener
                        public final void onSystemUiVisibilityChange(int i) {
                            window.getDecorView().setSystemUiVisibility(5894);
                        }
                    });
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (Build.VERSION.SDK_INT >= 28) {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                }
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        LinearLayout linearLayout = new LinearLayout(getContext(), null);
        linearLayout.setGravity(8388613);
        linearLayout.setId(R.id.iiv);
        C786410Ut5.R7(linearLayout, new ACListenerS139S0100000_4(this, 9));
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        LandscapeCaptionPanelFragment landscapeCaptionPanelFragment = this.LL;
        if (landscapeCaptionPanelFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.iiv, landscapeCaptionPanelFragment, "Caption");
            c19ehLJIIJ.LJIIJ();
        }
        try {
            ViewTreeLifecycleOwner.set(linearLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(linearLayout, this);
            linearLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linearLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linearLayout;
        }
    }
}
