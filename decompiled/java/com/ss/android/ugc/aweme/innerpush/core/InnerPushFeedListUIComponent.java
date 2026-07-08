package com.ss.android.ugc.aweme.innerpush.core;

import X.C628500Oky;
import X.C630740Ooa;
import X.C741320T6c;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: loaded from: classes13.dex */
public final class InnerPushFeedListUIComponent extends BasePanelComponent {
    public final C630740Ooa LL = C628500Oky.LIZ(new C741320T6c(this));

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(InnerPushManager.INSTANCE);
        }
    }
}
