package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C123100dR;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1711100ud2;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C723850SaN;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.SecurityInfoItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS175S1100000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes27.dex */
public final class AutofillSecondaryFragment extends PipoCashierBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmsvJiI+JytiKDHELIOSonJyMlJSN9Kyo+LGE1OiQrJCo9PGsNPDs8LiwgJRw2KyoiLS4hMQM+KCg+LSs4";
    public C1711100ud2 LLJJJ;
    public AutofillFragment LLJJJIL;

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1250250idj c1250250idjAS = aS();
        if (c1250250idjAS != null) {
            c0om1.LIZJ = c1250250idjAS;
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1099));
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZJ(new AwS570S0100000_26(this, 1100));
        c0om1.LIZIZ(c1251150ifB2);
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final C1250250idj aS() {
        AutofillApi.CardNumberList cardNumberList;
        SecurityInfoItem securityInfoItem;
        AutofillApi.CardNumberList cardNumberList2;
        SecurityInfoItem securityInfoItem2;
        Context context = getContext();
        String str = null;
        if (context == null) {
            return null;
        }
        String string = getString(2131840341);
        C1711100ud2 c1711100ud2 = this.LLJJJ;
        String str2 = (c1711100ud2 == null || (cardNumberList2 = c1711100ud2.LLILLL) == null || (securityInfoItem2 = cardNumberList2.securityInfoItem) == null) ? null : securityInfoItem2.text;
        if (!C123100dR.LIZ(str2)) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            return c1250250idj;
        }
        C1711100ud2 c1711100ud22 = this.LLJJJ;
        if (c1711100ud22 != null && (cardNumberList = c1711100ud22.LLILLL) != null && (securityInfoItem = cardNumberList.securityInfoItem) != null) {
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
        }
        C1250250idj c1250250idj2 = new C1250250idj();
        c1250250idj2.LIZJ = string;
        c1250250idj2.LIZLLL = spannableString;
        c1250250idj2.LIZ(new AwS175S1100000_26(str, context, 3));
        return c1250250idj2;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        int iIntValue;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        View rootView = view.getRootView();
        if (rootView != null && (viewFindViewById = rootView.findViewById(R.id.spp)) != null) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            viewFindViewById.setBackgroundColor(iIntValue);
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 278), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvd, viewGroup, false);
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
