package com.ss.android.ugc.aweme.relation.base;

import X.C098200Yq;
import X.C1264140j08;
import X.C1391850mK7;
import X.C1685300txQ;
import X.C1766570w4V;
import X.C189200o6;
import X.C1896507bn;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class CustomDialogFragment extends BaseDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nHELIOSISoiZy0yOyBiCjogPCohDSYyJCorDz0yLygpJzs=";
    public View LLILLL;
    public Pair<Integer, Integer> LLILZ;
    public Function1<? super String, Unit> LLILZLL;
    public final List<Function1<Window, Unit>> LLILZIL = new ArrayList();
    public String LLIZ = "default";

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        TypedArray typedArrayObtainStyledAttributes;
        Window window2;
        super.onStart();
        C1391850mK7.LIZIZ(getDialog(), "follow_your_friends_dialog");
        Context context = getContext();
        if (context != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxDialog, R.attr.xt, 0)) != null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxDialog__tux_dialog_animWindow, 0);
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setWindowAnimations(resourceId);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void MR(Function1<? super Window, Unit> function1) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            function1.invoke(window);
            window.setAttributes(window.getAttributes());
        } else {
            ((ArrayList) this.LLILZIL).add(function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Pair<Integer, Integer> pair;
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        } else {
            if (getDialog() != null || (pair = this.LLILZ) == null) {
                return;
            }
            setStyle(pair.getFirst().intValue(), pair.getSecond().intValue());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Function1<? super String, Unit> function1 = this.LLILZLL;
        if (function1 != null) {
            function1.invoke(this.LLIZ);
        }
        C1264140j08.LIZ.getClass();
        String str = C1264140j08.LIZIZ;
        if (str != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("session_id", str);
            Long l = C1264140j08.LIZJ;
            if (l != null) {
                c2344009Gk.LIZLLL(System.currentTimeMillis() - l.longValue(), "display_duration_ms");
            }
            C20684815ws.LJIILLIIL("rec_user_dialog_dismiss", c2344009Gk.LIZ);
        }
        C1264140j08.LIZIZ = null;
        C1264140j08.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(window);
            }
            ((ArrayList) this.LLILZIL).clear();
            window.setAttributes(window.getAttributes());
        }
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (fragmentManager != null) {
            try {
                Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.FALSE);
                Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
                declaredField2.setAccessible(true);
                declaredField2.set(this, Boolean.TRUE);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            if (isAdded()) {
                c19ehLJIIJ.LJJIFFI(this);
            } else {
                c19ehLJIIJ.LIZLLL(this, str);
            }
            c19ehLJIIJ.LJIIJ();
            C1264140j08.LIZ.getClass();
            C1264140j08.LIZIZ = UUID.randomUUID().toString();
            C1264140j08.LIZJ = Long.valueOf(System.currentTimeMillis());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("session_id", C1264140j08.LIZIZ);
            C20684815ws.LJIILLIIL("rec_user_dialog_display", c2344009Gk.LIZ);
        }
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View view = this.LLILLL;
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                } else {
                    c19gs = null;
                }
                C1685300txQ.LIZ(c19gs);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return view;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
