package com.ss.android.ugc.aweme.behavior.popup;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1616750sAr;
import X.C1669670tYD;
import X.C1674120tfO;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.EnumC1616740sAq;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MarketplacePopupFragment extends Fragment implements InterfaceC344240DeY {
    public static EnumC1616740sAq LL = EnumC1616740sAq.HALF_SCREEN_SHEET;
    public static String LLILLJJLI = "";
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZicpIS4lISo+HELIOSZz88ODA8ZwIyOi4pPT8/KSYpGSAjPTUKOy40JSAiPQ==";

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        String path;
        Resources resources;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C1674120tfO c1674120tfO = C1674120tfO.LIZ;
        Context context = getContext();
        String str = LLILLJJLI;
        c1674120tfO.getClass();
        Uri uri = UriProtector.parse(str);
        if (!Intrinsics.LJFF(uri.getScheme(), "aweme") || !Intrinsics.LJFF(uri.getHost(), "pgc_m10n") || (path = uri.getPath()) == null || path.hashCode() != 472040178 || !path.equals("/series_refund_access") || context == null || (resources = context.getResources()) == null || (string = resources.getString(2131847398)) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 109));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1669670tYD.LJ((ComposeView) view.findViewById(R.id.eoa), EnumC1427810nG7.Auto, C1616750sAr.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.duj, viewGroup, false);
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
