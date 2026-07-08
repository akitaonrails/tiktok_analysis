package com.ss.android.ugc.aweme.tablet.impl.business.feed.bottombar;

import X.C16HM;
import X.C19EG;
import X.C1D0G;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.feed.bottombar.IFeedBottomBarFacade;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.ITabletBottomControlBar;

/* JADX INFO: loaded from: classes32.dex */
public final class TabletBottomControlBarServiceImpl implements ITabletBottomControlBar {
    @Override // com.ss.android.ugc.aweme.tablet.api.helper.feed.ITabletBottomControlBar
    public final C1D0G LIZ(C19EG c19eg) {
        IFeedBottomBarFacade iFeedBottomBarFacade = (IFeedBottomBarFacade) PluggableExtentionKt.pluggableSpi$default(IFeedBottomBarFacade.class, false, false, false, 14, null);
        if (iFeedBottomBarFacade == null) {
            return null;
        }
        return new C1D0G(c19eg, (TabletBottomControlBarViewModel) new ViewModelProvider(c19eg, new C16HM(iFeedBottomBarFacade, 1)).get(TabletBottomControlBarViewModel.class));
    }
}
