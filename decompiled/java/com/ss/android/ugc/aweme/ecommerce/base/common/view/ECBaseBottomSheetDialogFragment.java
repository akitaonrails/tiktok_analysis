package com.ss.android.ugc.aweme.ecommerce.base.common.view;

import X.AbstractC1760900vvM;
import X.C1389600mGU;
import X.C1722200uuw;
import X.C1748770vbn;
import X.C1756030vnV;
import X.C1756050vnX;
import X.C960603pE;
import X.C988803tm;
import X.DialogC1743790vTl;
import X.InterfaceC1294060jmO;
import X.InterfaceC1722210uux;
import X.InterfaceC1739450vMl;
import X.InterfaceC1748810vbr;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.RegionPickerDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public class ECBaseBottomSheetDialogFragment extends BottomSheetDialogFragment implements InterfaceC1739450vMl, InterfaceC1722210uux {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyw8HELIOSJSgjJ2ElISA7ZwoQCiQ/LA08PDEjJBw7LSA4DSYyJCorDz0yLygpJzs=";
    public boolean LL;

    public boolean MR() {
        return this instanceof RegionPickerDialogFragment;
    }

    public AbstractC1760900vvM OR() {
        return null;
    }

    @Override // X.InterfaceC1739450vMl
    public boolean Pp(Map<String, String> map) {
        return false;
    }

    public void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1722210uux
    @InterfaceC1294060jmO
    public final String getBtmCode() {
        return null;
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    @Override // X.InterfaceC1748810vbr
    public InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // X.InterfaceC1748820vbs
    public String getPageName() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() {
        /*
            r2 = this;
            boolean r0 = r2.NR()
            if (r0 != 0) goto L4d
            boolean r0 = r2.MR()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2a
            boolean r0 = X.C1508090pLb.LIZIZ()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2a
            android.app.Dialog r0 = r2.getDialog()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3f
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3f
            r0 = 2131887456(0x7f120560, float:1.940952E38)
            r1.setWindowAnimations(r0)     // Catch: java.lang.Throwable -> L41
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L41
        L26:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L41
            goto L4d
        L2a:
            android.app.Dialog r0 = r2.getDialog()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3f
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3f
            r0 = 2131887449(0x7f120559, float:1.9409505E38)
            r1.setWindowAnimations(r0)     // Catch: java.lang.Throwable -> L41
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L41
            goto L26
        L3f:
            r0 = 0
            goto L26
        L41:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L4d:
            super.onStart()
            android.app.Dialog r0 = r2.getDialog()
            if (r0 == 0) goto L6e
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L6e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L6e
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r1, r2)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r1, r2)
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r1.setTag(r0, r2)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.common.view.ECBaseBottomSheetDialogFragment.onStart():void");
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    public boolean NR() {
        return this.LL;
    }

    public void PR() {
        C1722200uuw.LIZ(this);
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1756030vnV.LIZ(this);
        PR();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1743790vTl dialogC1743790vTl = new DialogC1743790vTl(getContext(), getTheme());
        AbstractC1760900vvM abstractC1760900vvMOR = OR();
        if (abstractC1760900vvMOR != null) {
            dialogC1743790vTl.LLJILJIL = abstractC1760900vvMOR;
        }
        Window window = dialogC1743790vTl.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1743790vTl);
        return dialogC1743790vTl;
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mG(view, null);
        RR(view, null, null);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (!fragmentManager.LJL() && !fragmentManager.LJLJJI()) {
            super.show(fragmentManager, str);
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    public final void RR(View view, Function0<Unit> function0, Function0<Unit> function02) {
        C1756050vnX.LIZJ(view, this, function0, function02);
    }
}
