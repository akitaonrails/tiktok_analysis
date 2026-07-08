package com.ss.android.ugc.aweme.live.feed.component;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedLiveETACollectorComponent extends BasePanelComponent {
    public boolean LL;

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        Fragment fragment;
        ILiveOuterService iLiveOuterService;
        super.onParentViewCreated();
        if (this.LL || (fragment = getPanelContext().LJ) == null || (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null) {
            return;
        }
        this.LL = true;
        iLiveOuterService.q4().r6(fragment);
    }
}
