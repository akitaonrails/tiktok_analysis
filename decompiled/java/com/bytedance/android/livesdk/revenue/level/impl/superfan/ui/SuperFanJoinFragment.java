package com.bytedance.android.livesdk.revenue.level.impl.superfan.ui;

import X.C098200Yq;
import X.C0KSH;
import X.C0KT2;
import X.C0KT5;
import X.C1161920gLG;
import X.C1213340hgC;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C518180KTw;
import X.C786410Ut5;
import X.InterfaceC1095550ecD;
import X.InterfaceC517900KSu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS141S0201000_17;
import kotlin.jvm.internal.AwS17S0600000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperFanJoinFragment extends Fragment implements InterfaceC1095550ecD {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDHELIOSk2JGslJD8/ZjY5OSohLiQiZzo6ZhY5OSohDiQiAyA6JgM+KCg+LSs4";
    public SuperFanViewModel LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public AwS551S0100000_7 LLJI;
    public String LL = "";
    public final long LLILLL = System.currentTimeMillis();
    public final boolean LLILZLL = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c70();
    public boolean LLJ = true;

    public final C0KT5 MR() {
        return new C0KT5(1, getParentFragment() instanceof SuperFanJoinDialog ? C0KT2.INDEPENDENT_PURCHASE_PAGE : getParentFragment() instanceof FansClubJoinDialog ? C0KT2.JOIN_GUIDE_PAGE : C0KT2.OTHERS, this.LL, 0);
    }

    @Override // X.InterfaceC1095550ecD
    public final boolean J6() {
        View viewFindViewById;
        View view = getView();
        return (view == null || (viewFindViewById = view.findViewById(R.id.wpi)) == null || viewFindViewById.getVisibility() != 0) ? false : true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLIZ && (getParentFragment() instanceof FansClubJoinDialog)) {
            C518180KTw.LJJIJIL(this.LL, C475510Ikn.LJ(this), System.currentTimeMillis() - this.LLILLL, false, "", 0L, "superfan", false);
        }
        View view = getView();
        C16FS c16fs = view != null ? (C16FS) view.findViewById(R.id.si7) : null;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        C0KSH.LJII(System.currentTimeMillis() - this.LLILLL, dataChannelLJ, this.LL, c16fs != null && c16fs.LLJJIJI, this.LLJ);
    }

    @Override // X.InterfaceC1095550ecD
    public final void LLLLZLL(boolean z) {
        this.LLIZ = z;
        if (z) {
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 95);
            if (!this.LLJ) {
                awS551S0100000_7.invoke();
            } else {
                this.LLJI = awS551S0100000_7;
            }
        }
    }

    @Override // X.InterfaceC1095550ecD
    public final void TN(AwS141S0201000_17 awS141S0201000_17) {
        C1213340hgC c1213340hgC;
        View view = getView();
        if (view != null && (c1213340hgC = (C1213340hgC) view.findViewById(R.id.u3e)) != null) {
            if (c1213340hgC.getScrollY() == 0) {
                awS141S0201000_17.invoke();
                return;
            }
            c1213340hgC.LL = true;
            c1213340hgC.LLILLJJLI = awS141S0201000_17;
            c1213340hgC.smoothScrollTo(0, 0);
        }
    }

    @Override // X.InterfaceC1095550ecD
    public final void cp(boolean z) {
        View viewFindViewById;
        View viewFindViewById2;
        if (z) {
            View view = getView();
            if (view != null && (viewFindViewById2 = view.findViewById(R.id.jvk)) != null) {
                C500260Jjc.LLFFF(viewFindViewById2);
                return;
            }
            return;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(R.id.jvk)) == null) {
            return;
        }
        C500260Jjc.LJIILLIIL(viewFindViewById);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final View viewFindViewById = view.findViewById(R.id.nnp);
        final View viewFindViewById2 = view.findViewById(R.id.wpi);
        final View viewFindViewById3 = view.findViewById(R.id.hc6);
        C500260Jjc.LJIILIIL(viewFindViewById2);
        C500260Jjc.LJIILIIL(viewFindViewById3);
        C500260Jjc.LLFFF(viewFindViewById);
        C0KSH.LJIIIZ(C475510Ikn.LJ(this), this.LL);
        SuperFanViewModel superFanViewModel = this.LLILLJJLI;
        if (superFanViewModel != null) {
            superFanViewModel.vQ2(MR(), 0L, new InterfaceC517900KSu() { // from class: X.0KTa
                @Override // X.InterfaceC517900KSu
                public final void onFailure() {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS251S0300000_7(this.LIZ, viewFindViewById, viewFindViewById3, 14));
                }

                @Override // X.InterfaceC517900KSu
                public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS17S0600000_7(this.LIZ, (SuperFanJoinFragment) c0ks8, (C0KS8) viewFindViewById, viewFindViewById2, view, (View) c0ksy, (C0KSY<GetNonFansUserDataResponse.Data>) 1));
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.glz, viewGroup, false);
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
