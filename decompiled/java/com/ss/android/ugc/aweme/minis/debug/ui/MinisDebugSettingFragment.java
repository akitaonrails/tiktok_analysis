package com.ss.android.ugc.aweme.minis.debug.ui;

import X.C098200Yq;
import X.C127K;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C204574153c;
import X.C2195221Avo;
import X.C786410Ut5;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MinisDebugSettingFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZiEpHELIOSKzo0ZjAlZwI6Jiw/DSoxPSIfLDsnISsrDz0yLygpJzs=";
    public C204574153c LL;
    public C127K LLILLJJLI;
    public C127K LLILLL;
    public C127K LLILZ;
    public C127K LLILZIL;
    public C127K LLILZLL;
    public C127K LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public ConstraintLayout LLJ;
    public ConstraintLayout LLJI;
    public ConstraintLayout LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public ConstraintLayout LLJILJILJ;

    public static boolean NR() {
        String str;
        Map<String, String> map;
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData == null || (map = schemaParserData.paramsMap) == null || (str = map.get("debugMode")) == null) {
            str = "";
        }
        return Intrinsics.LJFF(str, "clientPreview");
    }

    public final Activity MR() {
        if (!isAdded() || isDetached() || getActivity() == null) {
            return null;
        }
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.debug.ui.MinisDebugSettingFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dmu, viewGroup, false);
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
