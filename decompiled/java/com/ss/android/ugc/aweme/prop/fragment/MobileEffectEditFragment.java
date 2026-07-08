package com.ss.android.ugc.aweme.prop.fragment;

import X.C098200Yq;
import X.C1252710ihh;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2277881EDy;
import X.C2400409as;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1733820vDg;
import X.InterfaceC1737690vJv;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class MobileEffectEditFragment extends Fragment implements InterfaceC1737690vJv {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LjHELIOSctLiI2JjFiBCAxISkpDCk1LSY4DCs6PAM+KCg+LSs4";

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        ((InterfaceC1733820vDg) C1252710ihh.LIZLLL(this, C13LE.LIZ(InterfaceC1733820vDg.class))).LJJLIIIJJIZ();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MobileEffectData mobileEffectData;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mobileEffectData = (MobileEffectData) arguments.getParcelable("effect_init_data");
        } else {
            mobileEffectData = null;
        }
        if ((mobileEffectData instanceof MobileEffectData) && mobileEffectData != null) {
            C723850SaN.LIZ(this, false, null, new AwS392S0200000_26(this, mobileEffectData, 66), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        Uri data2;
        super.onActivityResult(i, i2, intent);
        if (i != 10000) {
            if (i == 10001 && intent != null && (data2 = intent.getData()) != null) {
                ((InterfaceC1733820vDg) C1252710ihh.LIZLLL(this, C13LE.LIZ(InterfaceC1733820vDg.class))).LLLLZIL(data2);
                return;
            }
            return;
        }
        if (intent == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
        if (parcelableArrayListExtra == null || (data = (Uri) C13LP.LJJJLL(parcelableArrayListExtra)) == null) {
            data = intent.getData();
        }
        if (!C2400409as.LJIIIZ(requireContext(), data)) {
            return;
        }
        C2277881EDy.LIZIZ.gotoCropActivity(requireActivity(), String.valueOf(data), false, 1.0f, (int) C12ES.LIZJ(16.0f, requireContext()), 10001, 250, 250, 1101, false, null, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c92, viewGroup, false);
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
