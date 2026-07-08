package com.bytedance.hybrid.spark.third.container;

import X.C098200Yq;
import X.C1052290dUR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1BHL;
import X.C1BHN;
import X.C1BHX;
import X.C2188811AlT;
import X.C2202311BHh;
import X.C786410Ut5;
import X.InterfaceC1051240dSk;
import X.InterfaceC1059280dfi;
import X.InterfaceC1542320qEo;
import X.InterfaceC2202301BHg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes35.dex */
public final class SparkThirdFragment extends Fragment implements InterfaceC1059280dfi, InterfaceC1051240dSk {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWskMC0hISFiOj8yOi5iPSc6OiHELIOSFiKiA9PCQlJyohZhY8KD04HC0lOysVOiQrJCo9PA==";
    public InterfaceC1542320qEo LL;
    public InterfaceC2202301BHg LLILLJJLI;
    public View LLILLL;
    public C1BHL LLILZ;
    public SparkThirdContext LLILZIL;

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    public final boolean MR() {
        C1BHX c1bhx;
        C1BHL c1bhl = this.LLILZ;
        if (c1bhl == null || !(c1bhl instanceof C1BHX) || (c1bhx = (C1BHX) c1bhl) == null || c1bhx.LLJILLL == null) {
            return false;
        }
        c1bhx.LIZLLL(true);
        return true;
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
        C1BHL c1bhl = this.LLILZ;
        if (c1bhl == null) {
            return;
        }
        c1bhl.reload();
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        Integer numValueOf;
        C19EH c19ehLJIIJ;
        try {
            FragmentManager fragmentManager = getFragmentManager();
            if (fragmentManager == null || (c19ehLJIIJ = fragmentManager.LJIIJ()) == null) {
                numValueOf = null;
            } else {
                c19ehLJIIJ.LJIIZILJ(this);
                numValueOf = Integer.valueOf(c19ehLJIIJ.LJIIJ());
            }
            C189200o6.m2constructorimpl(numValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        SparkThirdContext sparkThirdContext = this.LLILZIL;
        String str = sparkThirdContext != null ? sparkThirdContext.containerId : null;
        Map<String, SparkThirdContext> map = C1052290dUR.LIZ;
        if (str == null) {
            str = "";
        }
        map.remove(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        MR();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C1BHL c1bhl;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        C1BHL c1bhl2 = null;
        if (arguments == null || (string = arguments.getString("ContainerId")) == null) {
            if (bundle != null) {
                string = bundle.getString("ContainerId");
            } else {
                string = null;
            }
        }
        SparkThirdContext sparkThirdContextLIZ = C1052290dUR.LIZ(string);
        this.LLILZIL = sparkThirdContextLIZ;
        if (sparkThirdContextLIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("missing_context:containerId=");
            sbLIZ.append(string);
            C1BHN.LIZ(null, "fail", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (sparkThirdContextLIZ.container == null) {
            sparkThirdContextLIZ.container = this;
        }
        C1BHN.LIZ(sparkThirdContextLIZ, "success", null);
        C1BHL c1bhl3 = this.LLILZ;
        if (c1bhl3 == null) {
            c1bhl = null;
        } else {
            c1bhl = c1bhl3;
        }
        sparkThirdContextLIZ.webView = c1bhl;
        if (c1bhl3 != null) {
            c1bhl2 = c1bhl3;
        }
        c1bhl2.LIZ(sparkThirdContextLIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        if (this.LLILLL == null) {
            View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f_s, viewGroup, false);
            this.LLILLL = viewTd;
            if (viewTd == null) {
                viewTd = null;
            }
            C1BHL c1bhl = (C1BHL) viewTd.findViewById(R.id.vst);
            this.LLILZ = c1bhl;
            InterfaceC1542320qEo interfaceC1542320qEo = this.LL;
            if (interfaceC1542320qEo != null) {
                if (c1bhl == null) {
                    c1bhl = null;
                }
                c1bhl.setWebTitleCallback(interfaceC1542320qEo);
            }
            InterfaceC2202301BHg interfaceC2202301BHg = this.LLILLJJLI;
            if (interfaceC2202301BHg != null) {
                C1BHL c1bhl2 = this.LLILZ;
                if (c1bhl2 == null) {
                    c1bhl2 = null;
                }
                c1bhl2.setLoadCallback((C2202311BHh) interfaceC2202301BHg);
            }
        }
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}
