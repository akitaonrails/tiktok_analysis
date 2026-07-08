package com.ss.android.ugc.aweme.story.feed.immersive.panel.viewholer;

import X.C03H5;
import X.C0RF0;
import X.C0RGK;
import X.C1554610qYd;
import X.C690870R8b;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.collection.collection.BaseUserFeedVH;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryCollectionConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveUserFeedVH extends BaseUserFeedVH<StoryImmersiveUserFeedVH> {
    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_immersive_feed";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StoryCollectionConfigurationProtocol.class, false);
    }

    public StoryImmersiveUserFeedVH(C0RF0 c0rf0, C0RGK c0rgk) {
        super(c0rf0, c0rgk);
    }
}
