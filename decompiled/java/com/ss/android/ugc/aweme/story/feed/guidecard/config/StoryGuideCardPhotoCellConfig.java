package com.ss.android.ugc.aweme.story.feed.guidecard.config;

import X.C03H5;
import X.C690870R8b;
import X.C723830SaL;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardPhotoCellConfig extends StoryGuideCardAbsCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF(c690870R8b.LIZ(), "cell_story_guide_card_photo");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.config.StoryGuideCardAbsCellConfig
    public final void LIZ(BaseCellContentComponent baseCellContentComponent) {
        C723830SaL.LIZ(baseCellContentComponent, null, new AwS590S0100000_11(baseCellContentComponent, (BaseCellContentComponent<? extends C03H5>) 504));
    }
}
