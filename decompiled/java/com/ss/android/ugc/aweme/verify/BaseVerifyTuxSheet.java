package com.ss.android.ugc.aweme.verify;

import X.C098200Yq;
import X.C0PEM;
import X.C1238130iKB;
import X.C1391190mJ3;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2241808qO;
import X.C23250099c;
import X.C343970De7;
import X.C786410Ut5;
import X.InterfaceC1058150ddt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.verify.ab.PipoVerificationRetentionPopupSettings;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class BaseVerifyTuxSheet extends BaseFragment implements InterfaceC1058150ddt {
    public static boolean LLJI = false;
    public static boolean LLJIJIL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSMpOyY1MWsOKDw2HiA+ICkqHDA0Gic2LTE=";
    public BaseVerifyFragment LLIZ;
    public boolean LLIZLLLIL = true;
    public Function0<Unit> LLJ;

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    public final void SR() {
        LLJI = false;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        Context context = getContext();
        InputMethodManager inputMethodManager = (InputMethodManager) (context != null ? C786410Ut5.H2(context, "input_method") : null);
        View view = getView();
        inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        if (getContext() == null || !this.LLIZLLLIL) {
            Function0<Unit> function0 = this.LLJ;
            if (function0 != null) {
                function0.invoke();
            } else {
                BaseVerifyFragment baseVerifyFragment = this.LLIZ;
                if (baseVerifyFragment != null) {
                    baseVerifyFragment.onCancel(null);
                }
            }
            LLJI = false;
            SR();
            return false;
        }
        if (LLJI) {
            LLJI = false;
            BaseVerifyFragment baseVerifyFragment2 = this.LLIZ;
            if (baseVerifyFragment2 != null) {
                baseVerifyFragment2.onCancel(null);
            }
            return false;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(getContext());
        c1397580mTM.LJFF(2131840445);
        c1397580mTM.LIZ(2131840444);
        C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(this, 425));
        c1397580mTM.LJIILJJIL = PipoVerificationRetentionPopupSettings.LIZ().LIZ();
        new C1397510mTF(c1397580mTM).LIZLLL();
        BaseVerifyFragment baseVerifyFragment3 = this.LLIZ;
        if (baseVerifyFragment3 != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(baseVerifyFragment3), C0PEM.LIZJ, null, new C2241808qO(baseVerifyFragment3, null), 2);
        }
        LLJIJIL = true;
        LLJI = true;
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BaseVerifyFragment baseVerifyFragment = this.LLIZ;
        if (baseVerifyFragment != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.verify_sheet_container, baseVerifyFragment);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i7o, viewGroup, false);
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
