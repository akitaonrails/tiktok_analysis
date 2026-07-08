package com.ss.android.ugc.aweme.live;

import X.C098200Yq;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsServicePlusOptinSAFFragment extends PcsSAFTikTokFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9HELIOSGCY/GiohPiwvLB8/PTYDOTs6JhYNDwkhKSIhLCEn";
    public PcsServicePlusOptinPageParams LLJILLL;

    public PcsServicePlusOptinSAFFragment() {
        aS(AFwS264S0000000_24.get$arr$(196));
        this.LLJILLL = new PcsServicePlusOptinPageParams("", "", "", 0L, "", new HashMap());
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParams;
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            Bundle arguments = getArguments();
            Serializable serializable = null;
            if (arguments != null) {
                serializable = arguments.getSerializable("params");
            }
            if (!(serializable instanceof PcsServicePlusOptinPageParams) || (pcsServicePlusOptinPageParams = (PcsServicePlusOptinPageParams) serializable) == null) {
                pcsServicePlusOptinPageParams = new PcsServicePlusOptinPageParams("", "", "", 0L, "", new HashMap());
            }
            this.LLJILLL = pcsServicePlusOptinPageParams;
            PcsServicePlusOptinFragment pcsServicePlusOptinFragmentLIZ = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZ(this.LLJILLL);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJJLI(0, 0, 0, 0);
            c19ehLJIIJ.LIZIZ(R.id.drg, pcsServicePlusOptinFragmentLIZ);
            c19ehLJIIJ.LJIIIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflaterCloneInContext;
        Context context = getContext();
        if (context != null && (layoutInflaterCloneInContext = layoutInflater.cloneInContext(context)) != null) {
            layoutInflater = layoutInflaterCloneInContext;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gky, viewGroup, false);
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
