package com.ss.android.ugc.aweme.minis.payment.subscription.page;

import X.C08S3;
import X.C098200Yq;
import X.C1227904rF;
import X.C1232610iBH;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196291AxX;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC1232580iBE;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisSubscriptionConfirmGpStoreFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtMCI2JjFiOjoxOyY+ID8nHELIOSISoiZz8yLyBiBCY9ITYfPC0gKzclOTs6JysPJiE1ITchDj8APCo+LAkhKSIhLCEn";
    public InterfaceC1232580iBE LLIZ;
    public MinisSubscriptionInfo LLIZLLLIL;
    public final ACListenerS154S0100000_19 LLJ = new ACListenerS154S0100000_19(this, 117);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        int i = C2187451AjH.LIZ;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.onViewCreated(view, bundle);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated, view:");
        sbLIZ.append(view);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bindViews, view:");
        sbLIZ2.append(view);
        C2188811AlT.LIZIZ(sbLIZ2);
        view.findViewById(R.id.zbq);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.jzi);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, this.LLJ);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cqu);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, this.LLJ);
        }
        MinisSubscriptionInfo minisSubscriptionInfo = this.LLIZLLLIL;
        String str5 = "";
        if (minisSubscriptionInfo == null || (str = minisSubscriptionInfo.clientKey) == null) {
            str = "";
        }
        SchemaParserData.Companion.getClass();
        String strLIZ = C2196291AxX.LIZ(str);
        MinisSubscriptionInfo minisSubscriptionInfo2 = this.LLIZLLLIL;
        Integer num = null;
        if (minisSubscriptionInfo2 != null) {
            str2 = minisSubscriptionInfo2.symbol;
            str3 = minisSubscriptionInfo2.amount;
            num = minisSubscriptionInfo2.deductCycle;
        } else {
            str2 = null;
            str3 = null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str2);
        sbLIZ3.append(str3);
        sbLIZ3.append('/');
        sbLIZ3.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        MinisSubscriptionInfo minisSubscriptionInfo3 = this.LLIZLLLIL;
        if (minisSubscriptionInfo3 != null && (str4 = minisSubscriptionInfo3.tierId) != null) {
            str5 = str4;
        }
        C1232610iBH.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("minis_id", str);
        c2344009Gk.LJFF("minis_type", strLIZ);
        c2344009Gk.LJFF("product_id", str5);
        c2344009Gk.LJFF("product_name", strLIZIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onSubscriptionAutoRenewFailureRedirectPanelShow, ");
        C1227904rF c1227904rF = C1227904rF.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1227904rF.getClass();
        sbLIZ4.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ4);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map2 = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_subscription_auto_renew_failure_redirect_panel_show", map2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dnh, viewGroup, false);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateView, view:");
        sbLIZ.append(viewTd);
        C2188811AlT.LIZIZ(sbLIZ);
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
