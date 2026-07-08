package com.ss.android.ugc.aweme.story.feed.guidecard.config;

import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardThoughtComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardThoughtCellConfig extends StoryGuideCardAbsCellConfig {
    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.config.StoryGuideCardAbsCellConfig
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(StoryGuideCardThoughtComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF(c690870R8b.LIZ(), "cell_story_guide_card_thought");
    }
}
