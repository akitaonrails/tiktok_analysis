package com.ss.android.ugc.aweme.tablet.impl.business.split.split;

import X.C1722300uv6;
import X.C1749280vcc;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class DefaultInitialSectionFragment extends DefaultSectionFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtKyM2PGslJD8/Zic5OiY9LTHELIOSY/ZzwjJCw4ZzwjJCw4Zws2LiQ5JTsaJiw4IC4/GyAvPSY8JgM+KCg+LSs4";
    public C1749280vcc LLILLL;

    @Override // com.ss.android.ugc.aweme.tablet.impl.business.split.split.DefaultSectionFragment, X.InterfaceC21613719iJ
    public final String xC() {
        return "default_initial_section";
    }

    static {
        new Object() { // from class: X.0DYP
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILLL = (C1749280vcc) viewFindViewById;
        }
        ((C1749280vcc) viewFindViewById).setStatus(new C1722300uv6());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILLL = (C1749280vcc) viewFindViewById;
        }
        ((C1749280vcc) viewFindViewById).LJ();
    }
}
