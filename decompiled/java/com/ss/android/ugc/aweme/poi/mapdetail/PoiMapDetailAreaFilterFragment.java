package com.ss.android.ugc.aweme.poi.mapdetail;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20642515q3;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class PoiMapDetailAreaFilterFragment extends BasePage implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGE+KTUoLDHELIOSsyISliGSA6BSQ8DSonKSwgCD02KQMlJTs2OgM+KCg+LSs4";
    public LinearLayout LLIZLLLIL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String strLJI = C20642515q3.LJI(2131844702);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = strLJI;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 187));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            super.onViewCreated(r6, r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r2 = "map_detail_filter_data"
            r4 = 0
            if (r1 < r0) goto L45
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L27
            java.lang.Class<X.01De> r0 = X.C297201De.class
            java.io.Serializable r3 = r1.getSerializable(r2, r0)
            X.01De r3 = (X.C297201De) r3
        L1a:
            if (r3 == 0) goto L27
            X.0Q7z r2 = X.C1558360qeg.LJFF(r5, r4)
            java.lang.Class<X.01De> r1 = X.C297201De.class
            java.lang.String r0 = "source_default_key"
            X.C1554960qZC.LIZ(r2, r3, r1, r0)
        L27:
            r0 = 2131372815(0x7f0a2b0f, float:1.8365704E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.LLIZLLLIL = r0
            r0 = 2131372833(0x7f0a2b21, float:1.836574E38)
            r6.findViewById(r0)
            kotlin.jvm.internal.AwS583S0100000_4 r2 = new kotlin.jvm.internal.AwS583S0100000_4
            r0 = 370(0x172, float:5.18E-43)
            r2.<init>(r5, r0)
            r1 = 3
            r0 = 0
            X.C723850SaN.LIZ(r5, r0, r4, r2, r1)
            return
        L45:
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L56
            java.io.Serializable r3 = r0.getSerializable(r2)
        L4f:
            boolean r0 = r3 instanceof X.C297201De
            if (r0 == 0) goto L27
            X.01De r3 = (X.C297201De) r3
            goto L1a
        L56:
            r3 = r4
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailAreaFilterFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e4g, viewGroup, false);
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
