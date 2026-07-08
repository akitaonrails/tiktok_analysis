package com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.assemble;

import X.C13LE;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsBannerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderStoryHighlightsComponent extends ProfileHeaderStoryHighlightsBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        if (!this.LLJILLL) {
            Ho("story_highlight_collection_base_item", C13LE.LIZ(HeaderStoryHighlightsOtherCollectionComponent.class), null, -1, false);
        } else {
            Ho("story_highlight_collection_base_item", C13LE.LIZ(HeaderStoryHighlightsMyCollectionComponent.class), null, -1, false);
            Ho("story_highlight_banner_base_item", C13LE.LIZ(HeaderStoryHighlightsBannerComponent.class), null, -1, false);
        }
    }
}
