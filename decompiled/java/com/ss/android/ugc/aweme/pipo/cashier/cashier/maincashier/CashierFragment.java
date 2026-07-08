package com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C123100dR;
import X.C1250250idj;
import X.C1308910kAL;
import X.C1323690kYB;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1708610uZ1;
import X.C1709070uZl;
import X.C1709570uaZ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.EnumC1709190uZx;
import X.EnumC1709200uZy;
import X.InterfaceC1709310ua9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.RawTextAndIcon;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfoItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierFragment extends PipoCashierBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmHELIOSsvKDw7ISA+ZyIyISsvKDw7ISA+ZwwyOy0lLD0VOiQrJCo9PA==";
    public EnumC1709190uZx LLJJJ;
    public CashierEnterParams LLJJJIL;
    public final AssemVMLazy LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CashierFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/maincashier/CashierViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CashierFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CashierViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 1085);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(418);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1086), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new AwS570S0100000_26((Fragment) this, 1087), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS570S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1088), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void cS() {
        CashierEnterParams cashierEnterParams = this.LLJJJIL;
        C1708610uZ1.LIZIZ(cashierEnterParams != null ? cashierEnterParams.payRequestId : null).LIZIZ(getPageName(), C2097608Jq.LJ());
    }

    public final String getPageName() {
        C1709070uZl c1709070uZl;
        CashierEnterParams cashierEnterParams = this.LLJJJIL;
        return ((cashierEnterParams == null || (c1709070uZl = cashierEnterParams.LIZIZ) == null) ? null : c1709070uZl.LIZIZ) == EnumC1709200uZy.PAY_NOW ? "secondary_payment_method" : "payment_method";
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final C1250250idj aS() {
        C1709570uaZ c1709570uaZ;
        RawTextAndIcon rawTextAndIconLJJIIZI;
        SecurityInfo securityInfo;
        SecurityInfoItem securityInfoItem;
        C1709570uaZ c1709570uaZ2;
        RawTextAndIcon rawTextAndIconLJJIIZI2;
        SecurityInfo securityInfo2;
        SecurityInfoItem securityInfoItem2;
        Context context = getContext();
        String str = null;
        if (context == null) {
            return null;
        }
        String string = getString(2131857121);
        CashierEnterParams cashierEnterParams = this.LLJJJIL;
        String str2 = (cashierEnterParams == null || (c1709570uaZ2 = cashierEnterParams.paymentData) == null || (rawTextAndIconLJJIIZI2 = c1709570uaZ2.LJJIIZI()) == null || (securityInfo2 = rawTextAndIconLJJIIZI2.securityInfo) == null || (securityInfoItem2 = securityInfo2.topSecurityInfo) == null) ? null : securityInfoItem2.text;
        if (!C123100dR.LIZ(str2)) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            return c1250250idj;
        }
        CashierEnterParams cashierEnterParams2 = this.LLJJJIL;
        C1708610uZ1.LIZIZ(cashierEnterParams2 != null ? cashierEnterParams2.payRequestId : null).LJ(getPageName(), "security_and_privacy", Boolean.valueOf(bS()), C2097608Jq.LJ());
        CashierEnterParams cashierEnterParams3 = this.LLJJJIL;
        if (cashierEnterParams3 != null && (c1709570uaZ = cashierEnterParams3.paymentData) != null && (rawTextAndIconLJJIIZI = c1709570uaZ.LJJIIZI()) != null && (securityInfo = rawTextAndIconLJJIIZI.securityInfo) != null && (securityInfoItem = securityInfo.topSecurityInfo) != null) {
            str = securityInfoItem.url;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  ");
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        Context context2 = getContext();
        if (context2 != null) {
            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context2, R.raw.icon_shield_tick);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o9, context2);
            int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -16711936;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LJ(Float.valueOf(11.0f)));
            tuxIconDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
            tuxIconDrawable.LJFF(iIntValue);
            C786410Ut5.p2(spannableString, new ImageSpan(tuxIconDrawable, 2), 0, 1, 17);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 1, strLIZIZ.length() - 1, 33);
            TuxIconDrawable tuxIconDrawable2 = new TuxIconDrawable(context2, R.raw.icon_chevron_right_small_fill_ltr);
            tuxIconDrawable2.setBounds(0, 0, iLIZIZ, iLIZIZ);
            tuxIconDrawable2.LJFF(iIntValue);
            C786410Ut5.p2(spannableString, new ImageSpan(tuxIconDrawable2, 2), strLIZIZ.length() - 1, strLIZIZ.length(), 17);
        }
        C1250250idj c1250250idj2 = new C1250250idj();
        c1250250idj2.LIZJ = string;
        c1250250idj2.LIZLLL = spannableString;
        c1250250idj2.LIZ(new AwS141S1200000_26(str, context, this, 1));
        return c1250250idj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r4 = this;
            super.onDestroy()
            X.0uZx r3 = r4.LLJJJ
            if (r3 != 0) goto L9
            X.0uZx r3 = X.EnumC1709190uZx.CANCEL
        L9:
            java.lang.String r0 = "Cashier"
            X.0uZC r2 = X.C1708710uZB.LIZ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "dismiss cashier page with reason: "
            r1.append(r0)
            java.lang.String r0 = r3.name()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 3
            r2.LIZ(r0, r1)
            X.0uZx r0 = X.EnumC1709190uZx.CANCEL
            if (r3 != r0) goto L47
            com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams r2 = r4.LLJJJIL
            r1 = 0
            if (r2 == 0) goto L50
            X.0ua0 r0 = r2.LJ
            if (r0 == 0) goto L4a
            kotlin.jvm.functions.Function1<X.0uaZ, kotlin.Unit> r0 = r0.LJ
            if (r0 == 0) goto L48
            if (r2 == 0) goto L47
            X.0ua0 r0 = r2.LJ
            if (r0 == 0) goto L47
            kotlin.jvm.functions.Function1<X.0uaZ, kotlin.Unit> r1 = r0.LJ
            if (r1 == 0) goto L47
            X.0uaZ r0 = r2.paymentData
            r1.invoke(r0)
        L47:
            return
        L48:
            if (r2 == 0) goto L50
        L4a:
            X.0uZl r0 = r2.LIZIZ
            if (r0 == 0) goto L50
            X.0uZy r1 = r0.LIZIZ
        L50:
            X.0uZy r0 = X.EnumC1709200uZy.PAY_NOW
            if (r1 != r0) goto L47
            if (r2 == 0) goto L5a
            com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey r2 = r2.LIZ
            if (r2 != 0) goto L5c
        L5a:
            com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey r2 = X.C1710240ube.LIZ
        L5c:
            java.lang.String r1 = "fragment_destory"
            java.lang.String r0 = r3.name()
            X.C1707910uXt.LIZLLL(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment.onDestroy():void");
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void dS(long j, String str) {
        String str2;
        CashierEnterParams cashierEnterParams = this.LLJJJIL;
        if (cashierEnterParams != null) {
            str2 = cashierEnterParams.payRequestId;
        } else {
            str2 = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str2);
        String pageName = getPageName();
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        interfaceC1709310ua9LIZIZ.LJII(j, pageName, str, C2097608Jq.LJ(), ((CashierViewModel) assemVMLazy.getValue()).LLILZLL);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws JSONException {
        String str;
        String str2;
        View view2;
        View rootView;
        View viewFindViewById;
        C1709570uaZ c1709570uaZ;
        RawTextAndIcon rawTextAndIconLJJIIZI;
        SecurityInfo securityInfo;
        SecurityInfoItem securityInfoItem;
        super.onViewCreated(view, bundle);
        CashierEnterParams cashierEnterParams = this.LLJJJIL;
        if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null && (rawTextAndIconLJJIIZI = c1709570uaZ.LJJIIZI()) != null && (securityInfo = rawTextAndIconLJJIIZI.securityInfo) != null && (securityInfoItem = securityInfo.topSecurityInfo) != null) {
            str = securityInfoItem.text;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str) && (view2 = getView()) != null && (rootView = view2.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.v4n)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(9.0f)));
            C786410Ut5.W5(viewFindViewById, marginLayoutParams);
        }
        Context context = getContext();
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", getPageName());
            CashierEnterParams cashierEnterParams2 = this.LLJJJIL;
            if (cashierEnterParams2 != null) {
                str2 = cashierEnterParams2.payRequestId;
            } else {
                str2 = null;
            }
            Map<String, String> map = C1708610uZ1.LIZ.get(str2);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            C1323690kYB.LIZ(context).LIZIZ(C786410Ut5.J3(jSONObject), "pipo", "event_tracking_info");
        }
        C723850SaN.LIZ(this, false, null, new AwS605S0100000_26(this, 354), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvi, viewGroup, false);
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
