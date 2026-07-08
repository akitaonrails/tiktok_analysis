package com.ss.android.ugc.aweme.ecommerce.common;

import X.AbstractActivityC1743740vTg;
import X.C1508090pLb;
import X.C1748770vbn;
import X.C1756030vnV;
import X.C1756050vnX;
import X.C960603pE;
import X.C988803tm;
import X.InterfaceC1739450vMl;
import X.InterfaceC1748810vbr;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public class ECBaseFragment extends AmeBaseFragment implements InterfaceC1739450vMl {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiHELIOSI+LTcvLGEwJyghJiF9DQYOKDw2DjctLiI2JjE=";
    public long LL = SystemClock.elapsedRealtime();
    public Function0<Unit> LLILLJJLI = AFwS215S0000000_26.get$arr$(154);

    public void MR() {
    }

    public void NR(C1748770vbn c1748770vbn) {
    }

    public boolean OR() {
        return this instanceof SeaPdpFragment;
    }

    public Function0<Unit> PR() {
        return null;
    }

    public boolean Pp(Map<String, String> map) {
        return false;
    }

    public void Q3(C1748770vbn c1748770vbn) {
    }

    public Function0<Unit> RR() {
        return null;
    }

    public void UR() {
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final long SR() {
        return SystemClock.elapsedRealtime() - this.LL;
    }

    public InterfaceC1748810vbr d8() {
        InterfaceC1748810vbr interfaceC1748810vbrLIZJ = C960603pE.LIZJ(this);
        if (interfaceC1748810vbrLIZJ != null) {
            return interfaceC1748810vbrLIZJ;
        }
        Context context = getContext();
        if (context instanceof AbstractActivityC1743740vTg) {
            return (AbstractActivityC1743740vTg) context;
        }
        return null;
    }

    public String getPageName() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MR();
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onStart() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        if (OR() && C1508090pLb.LIZIZ()) {
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(R.style.aal);
            }
        }
        this.LL = SystemClock.elapsedRealtime();
        super.onStart();
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1756030vnV.LIZ(this);
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mG(view, null);
        C1756050vnX.LIZJ(view, this, PR(), RR());
        UR();
    }
}
