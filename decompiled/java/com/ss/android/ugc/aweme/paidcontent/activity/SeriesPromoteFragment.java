package com.ss.android.ugc.aweme.paidcontent.activity;

import X.AbstractC848400XPy;
import X.C098200Yq;
import X.C0XQ7;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1572960r2E;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class SeriesPromoteFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUtICswJys4LCHELIOSEnZiQvPSYlITE1Zxw2OiwpOh8hJygjPSoVOiQrJCo9PA==";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        Intent intent;
        Intent intent2;
        NR(AFwS232S0000000_4.get$arr$(51));
        super.onCreate(bundle);
        long j = CastLongProtector.parseLong(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C19EG activity = getActivity();
        if (activity != null && (intent2 = activity.getIntent()) != null) {
            try {
                stringExtra = intent2.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        String string = UUID.randomUUID().toString();
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            intent = activity2.getIntent();
        } else {
            intent = null;
        }
        C1572960r2E c1572960r2E = new C1572960r2E(j, 1, stringExtra, string, intent, true, null, 3968);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1572960r2E, C1572960r2E.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new AwS370S0200000_4(this, c1572960r2E, 21), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bhk, viewGroup, false);
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
