package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C1743810vTn;
import X.C1760810vvD;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20161913uj;
import X.C786410Ut5;
import X.InterfaceC1164530gPT;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceHybridBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class CommerceHybridBottomSheetDialogFragment extends CommerceBottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyw8JSgjJ2HELIOSElISA7Zww8JSgpOyw2ADwuOyY3Cio4PSA+Gy0pLDsXISQgJigVOiQrJCo9PA==";
    public FrameLayout LLJI;
    public C1760810vvD LLJIJIL;
    public boolean LLJILJIL;
    public final C1743810vTn LLJILJILJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0vTn] */
    public CommerceHybridBottomSheetDialogFragment() {
        super(0);
        this.LLJILJILJ = new InterfaceC1164530gPT() { // from class: X.0vTn
            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) {
                String str3;
                CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment = this.LL;
                if (commerceHybridBottomSheetDialogFragment.LLJILJIL) {
                    try {
                        String strOptString = new JSONObject(str2).optString("react_id");
                        CommerceHybridBottomSheetDialogFragment commerceHybridBottomSheetDialogFragment2 = this.LL;
                        C1760810vvD c1760810vvD = commerceHybridBottomSheetDialogFragment2.LLJIJIL;
                        if (c1760810vvD != null) {
                            SparkContext sparkContext = c1760810vvD.getSparkView().getSparkContext();
                            if (sparkContext != null) {
                                str3 = sparkContext.containerId;
                            } else {
                                str3 = null;
                            }
                            if (Intrinsics.LJFF(strOptString, str3)) {
                                commerceHybridBottomSheetDialogFragment2.dismiss();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                        return;
                    }
                }
                commerceHybridBottomSheetDialogFragment.dismiss();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_close_sheet", this.LLJILJILJ);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment
    public final boolean uH() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("enable_drag_close", true);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0vTo
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C1760810vvD c1760810vvD = this.LL.LLJIJIL;
                if (i == 4 && keyEvent.getAction() == 1 && c1760810vvD != null) {
                    c1760810vvD.LIZ();
                    return false;
                }
                return false;
            }
        });
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Uri uri;
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        boolean z = false;
        if (activity != null) {
            View viewFindViewById = this.LLJI;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.eqx);
                } else {
                    viewFindViewById = null;
                }
                this.LLJI = (FrameLayout) viewFindViewById;
            }
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            C1760810vvD c1760810vvD = new C1760810vvD(activity);
            this.LLJIJIL = c1760810vvD;
            Bundle arguments = getArguments();
            if (arguments != null && (uri = (Uri) arguments.getParcelable("url")) != null) {
                if (!uri.getBooleanQueryParameter("enable_draggable", true)) {
                    c1760810vvD.setDraggable(false);
                }
                c1760810vvD.LJ(activity, uri, false, C20161913uj.LIZIZ(activity));
            }
            c1760810vvD.LLILZLL = this;
            viewGroup.addView(c1760810vvD);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("use_react_id_close");
        }
        this.LLJILJIL = z;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_close_sheet", this.LLJILJILJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.al2, viewGroup, false);
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
