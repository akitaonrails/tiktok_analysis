package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C1708610uZ1;
import X.C1710960uco;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C419910GdJ;
import X.C723850SaN;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1709310ua9;
import X.InterfaceC1711360udS;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.business.AutofillHostContent;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class AutofillFragment extends PipoCashierBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmsvJiI+HELIOSJytiKDonJyMlJSN9Kyo+LGE1OiQrJCo9PGsNPDs8LiwgJQkhKSIhLCEn";
    public C1710960uco LLJJJ;
    public AutofillApi.CardNumberItem LLJJJIL;
    public InterfaceC1711360udS LLJJJJ;

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZJ = aS();
        C419910GdJ c419910GdJ = new C419910GdJ();
        Context context = getContext();
        c419910GdJ.LIZ = (context == null || !C960203pA.LIZIZ(context)) ? R.raw.icon_color_tiktok_logo_dark : R.raw.icon_color_tiktok_logo_light;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c0om1.LJ(c1251150ifB);
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final C1250250idj aS() {
        String string = getString(2131840340);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        return c1250250idj;
    }

    public final void oS() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 53));
            return;
        }
        InterfaceC1711360udS interfaceC1711360udS = this.LLJJJJ;
        if (interfaceC1711360udS != null) {
            interfaceC1711360udS.LIZIZ(2, "", "");
        }
        this.LLJJJJ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        oS();
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void WR(String str) {
        super.WR(str);
        if (!TextUtils.equals(str, "auto_close")) {
            oS();
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        AutofillHostContent autofillHostContent;
        String str2;
        Object c098200Yq;
        super.onCreate(bundle);
        HashMap map = new HashMap();
        C1710960uco c1710960uco = this.LLJJJ;
        if (c1710960uco != null && (str2 = c1710960uco.LL) != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ("autofill");
        HashMap map2 = new HashMap();
        map2.putAll(map);
        C1710960uco c1710960uco2 = this.LLJJJ;
        if (c1710960uco2 == null || (autofillHostContent = c1710960uco2.LLILLL) == null || (str = autofillHostContent.merchantId) == null) {
            str = "";
        }
        map2.put("merchant_id", str);
        interfaceC1709310ua9LIZIZ.LIZ("ttls_pipo_autofill_show", map2);
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
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            viewFindViewById.setBackgroundColor(iIntValue);
        }
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 171), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvc, viewGroup, false);
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
