package com.ss.android.ugc.aweme.story.feed.immersive.panel.config;

import X.C03H5;
import X.C1600750rl3;
import X.C2189821An6;
import X.C690870R8b;
import X.C723830SaL;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryCollectionConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveFeedCellConfig implements StoryCollectionConfigurationProtocol {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String from;
        if (!Intrinsics.LJFF(c690870R8b.LIZ(), "cell_story_immersive_feed") || (baseFeedPageParams = c690870R8b.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null || (from = c2189821An6.getFrom()) == null || !C1600750rl3.LJ(from)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void NS1(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        C723830SaL.LIZ(baseCellContentComponent, null, new AwS590S0100000_11((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C03H5>) 261));
    }
}
