package com.ss.android.ugc.aweme.duet.ui;

import X.C1398410mUh;
import Y.ARunnableS121S0100000_21;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes22.dex */
public final class DuetAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiE5HELIOSLDt9PSxiDTo2PAQ7LCI2BCw/PQkhKSIhLCEn";

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.InterfaceC19400810vG
    public final void refresh() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS121S0100000_21(this, 65));
        }
        cb(false, false);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        return super.NR(c1398410mUh, aweme);
    }
}
