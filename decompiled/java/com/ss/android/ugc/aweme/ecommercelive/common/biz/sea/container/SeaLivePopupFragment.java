package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.container;

import X.AbstractC1760410vuZ;
import X.C098200Yq;
import X.C0QSJ;
import X.C1391190mJ3;
import X.C1558360qeg;
import X.C1561410qjb;
import X.C1685300txQ;
import X.C1732860vC8;
import X.C1732870vC9;
import X.C1733300vCq;
import X.C1733370vCx;
import X.C1750060vds;
import X.C1760360vuU;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C343970De7;
import X.C599020NeW;
import X.C599380Nf6;
import X.C599810Nfn;
import X.C687700QyG;
import X.C786410Ut5;
import X.C958103op;
import X.InterfaceC1733310vCr;
import X.InterfaceC600380Ngi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.scope.LiveFragmentScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.container.SeaLivePopupFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaLivePopupFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKiA+HELIOSJSoiZy06Mms/LC59KyoiPS46JiA+Zxw2KQklPyoDJzU5OQkhKSIhLCEn";
    public C1760360vuU LL;
    public C1733300vCq LLILLJJLI;
    public ISeaLiveContextAbility LLILLL;
    public int LLILZ;

    public final void MR() {
        try {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void NR() {
        String string;
        InterfaceC600380Ngi interfaceC600380NgiCm0;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("popup_key")) == null) {
            string = "";
        }
        C599020NeW c599020NeW = new C599020NeW("ecLivePopupDidCloseEvent", C2097608Jq.LJIIIIZZ(new Pair("popup_key", string), new Pair("close_type", Integer.valueOf(this.LLILZ))), null, 12);
        ISeaLiveContextAbility iSeaLiveContextAbility = this.LLILLL;
        if (iSeaLiveContextAbility == null || (interfaceC600380NgiCm0 = iSeaLiveContextAbility.Cm0()) == null) {
            return;
        }
        interfaceC600380NgiCm0.LIZJ(this, c599020NeW);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C599810Nfn.LIZ.getClass();
        C599810Nfn.LIZ("EcSeaPopupFragment", "onDestroyView() called");
        try {
            NR();
            C1760360vuU c1760360vuU = this.LL;
            if (c1760360vuU != null) {
                c1760360vuU.hide();
            }
            ISeaLiveContextAbility iSeaLiveContextAbility = this.LLILLL;
            C1733300vCq c1733300vCq = this.LLILLJJLI;
            if (iSeaLiveContextAbility != null && c1733300vCq != null) {
                iSeaLiveContextAbility.JC2().LIZ().LIZJ(InterfaceC1733310vCr.class, c1733300vCq);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        C1760360vuU c1760360vuU2 = this.LL;
        if (c1760360vuU2 != null) {
            c1760360vuU2.LLD(true);
        }
        this.LL = null;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [X.0vC6, X.0vCq] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        final String string3;
        Object ability;
        View viewLIZIZ;
        C1732870vC9 c1732870vC9JC2;
        C1732860vC8 c1732860vC8LIZ;
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            C599380Nf6 c599380Nf6MF = null;
            if (arguments != null && (string = arguments.getString("lynx_url")) != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    string2 = arguments2.getString("data");
                } else {
                    string2 = null;
                }
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    string3 = arguments3.getString("popup_key");
                } else {
                    string3 = null;
                }
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this, null), LiveFragmentScope.class);
                if (c0qsjLIZJ != null) {
                    ability = c0qsjLIZJ.getAbility(ISeaLiveContextAbility.class);
                } else {
                    ability = null;
                }
                if (!(ability instanceof ISeaLiveContextAbility)) {
                    ability = null;
                }
                this.LLILLL = (ISeaLiveContextAbility) ability;
                C599810Nfn c599810Nfn = C599810Nfn.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onViewCreated, ability: ");
                sbLIZ.append(this.LLILLL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599810Nfn.getClass();
                C599810Nfn.LIZ("EcSeaPreviewPopupFragment", strLIZIZ);
                if (this.LLILLJJLI == null) {
                    ?? r2 = new InterfaceC1733310vCr() { // from class: X.0vCq
                        @Override // X.InterfaceC1733310vCr
                        public final void LLLLZI(Integer num, String str) {
                            int iIntValue;
                            String str2 = string3;
                            if (str2 == null || Intrinsics.LJFF(str2, str)) {
                                SeaLivePopupFragment seaLivePopupFragment = this;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                seaLivePopupFragment.LLILZ = iIntValue;
                                this.MR();
                            }
                        }
                    };
                    ISeaLiveContextAbility iSeaLiveContextAbility = this.LLILLL;
                    if (iSeaLiveContextAbility != null && (c1732870vC9JC2 = iSeaLiveContextAbility.JC2()) != null && (c1732860vC8LIZ = c1732870vC9JC2.LIZ()) != null) {
                        c1732860vC8LIZ.LIZIZ(InterfaceC1733310vCr.class, r2);
                    }
                    this.LLILLJJLI = r2;
                }
                C1750060vds c1750060vdsLIZ = C1733370vCx.LIZ(string, string2, new C1561410qjb("live_pop_card"), this.LLILLL, C2097608Jq.LJ());
                if (this.LL == null) {
                    ISeaLiveContextAbility iSeaLiveContextAbility2 = this.LLILLL;
                    if (iSeaLiveContextAbility2 != null) {
                        c599380Nf6MF = iSeaLiveContextAbility2.MF();
                    }
                    this.LL = new C1760360vuU(c599380Nf6MF);
                }
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ncr);
                AbstractC1760410vuZ abstractC1760410vuZ = new AbstractC1760410vuZ() { // from class: X.0vCp
                    @Override // X.AbstractC1760410vuZ
                    public final void LIZ(String str, C1561410qjb c1561410qjb) {
                        this.LIZ.MR();
                        C599810Nfn c599810Nfn2 = C599810Nfn.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onLoadFailed, errorMsg: ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", params: ");
                        sbLIZ2.append(c1561410qjb);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C599810Nfn.LIZIZ(c599810Nfn2);
                    }

                    @Override // X.AbstractC1760410vuZ
                    public final void LIZJ(C1561410qjb c1561410qjb, C1760360vuU c1760360vuU) {
                        C599810Nfn c599810Nfn2 = C599810Nfn.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onLoadSuccess, params: ");
                        sbLIZ2.append(c1561410qjb);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c599810Nfn2.getClass();
                        C599810Nfn.LIZ("EcSeaPopupFragment", strLIZIZ2);
                    }
                };
                C1760360vuU c1760360vuU = this.LL;
                if (c1760360vuU != null && (viewLIZIZ = c1760360vuU.LIZIZ(requireContext(), c1750060vdsLIZ, abstractC1760410vuZ)) != null) {
                    C786410Ut5.W5(viewLIZIZ, new LinearLayout.LayoutParams(-1, (int) C958103op.LJ()));
                    linearLayout.addView(viewLIZIZ);
                }
                C599810Nfn.LIZ("EcSeaPopupFragment", "start load lynxCard, waiting for gecko resource");
                C1760360vuU c1760360vuU2 = this.LL;
                if (c1760360vuU2 != null) {
                    c1760360vuU2.load();
                }
                C1760360vuU c1760360vuU3 = this.LL;
                if (c1760360vuU3 != null) {
                    c1760360vuU3.show();
                    return;
                }
                return;
            }
            MR();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C599810Nfn c599810Nfn2 = C599810Nfn.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to load lynx card: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C599810Nfn.LIZIZ(c599810Nfn2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bvo, viewGroup, false);
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
