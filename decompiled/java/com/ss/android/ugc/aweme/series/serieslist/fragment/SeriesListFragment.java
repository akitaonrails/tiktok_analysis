package com.ss.android.ugc.aweme.series.serieslist.fragment;

import X.C098200Yq;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1572960r2E;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC587030N0r;
import X.InterfaceC1740760vOs;
import X.InterfaceC836760Ws6;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class SeriesListFragment extends BaseFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s/LD06HELIOSLTYgIDwnZiM+KCg+LSs4Zxw2OiwpOgM6OzEKOy40JSAiPQ==";
    public long LLIZ;
    public int LLIZLLLIL = 1;
    public final String LLJ = UUID.randomUUID().toString();
    public int LLJI;

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return C2097608Jq.LJIIJ(new Pair("sessionId", this.LLJ));
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC587030N0r.SERIES_LIST.getPageCode();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C2211631BhB.LJIIL(this, null);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int intExtra;
        int intExtra2;
        String stringExtra;
        Intent intent;
        boolean z;
        boolean booleanExtra;
        String stringExtra2;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        Intent intent7;
        NR(AFwS257S0000000_19.get$arr$(309));
        super.onCreate(bundle);
        C19EG activity = getActivity();
        long longExtra = 0;
        if (activity != null && (intent7 = activity.getIntent()) != null) {
            longExtra = intent7.getLongExtra("creator_uid", 0L);
        }
        this.LLIZ = longExtra;
        C19EG activity2 = getActivity();
        if (activity2 != null && (intent6 = activity2.getIntent()) != null) {
            intExtra = intent6.getIntExtra("list_source", 1);
        } else {
            intExtra = 1;
        }
        this.LLIZLLLIL = intExtra;
        C19EG activity3 = getActivity();
        if (activity3 != null && (intent5 = activity3.getIntent()) != null) {
            intExtra2 = intent5.getIntExtra("type", 0);
        } else {
            intExtra2 = 0;
        }
        this.LLJI = intExtra2;
        long j = this.LLIZ;
        int i = this.LLIZLLLIL;
        C19EG activity4 = getActivity();
        if (activity4 != null && (intent4 = activity4.getIntent()) != null) {
            try {
                stringExtra = intent4.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        String str = this.LLJ;
        C19EG activity5 = getActivity();
        if (activity5 != null) {
            intent = activity5.getIntent();
        } else {
            intent = null;
        }
        int i2 = this.LLJI;
        if (i2 == 55) {
            z = true;
        } else {
            z = false;
        }
        C19EG activity6 = getActivity();
        if (activity6 != null && (intent3 = activity6.getIntent()) != null) {
            booleanExtra = intent3.getBooleanExtra("is_ad", false);
        } else {
            booleanExtra = false;
        }
        C19EG activity7 = getActivity();
        if (activity7 != null && (intent2 = activity7.getIntent()) != null) {
            try {
                stringExtra2 = intent2.getStringExtra("drama_title");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
        } else {
            stringExtra2 = null;
        }
        C1572960r2E c1572960r2E = new C1572960r2E(j, i, stringExtra, str, intent, z, false, i2, booleanExtra, "2", stringExtra2, "personal_homepage_paid_series");
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1572960r2E, C1572960r2E.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new AwS385S0200000_19(this, c1572960r2E, 47), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bh_, viewGroup, false);
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
