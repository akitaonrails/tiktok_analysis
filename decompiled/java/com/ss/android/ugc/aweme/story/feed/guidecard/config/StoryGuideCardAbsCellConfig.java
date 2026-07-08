package com.ss.android.ugc.aweme.story.feed.guidecard.config;

import X.C03H5;
import X.C13LE;
import X.C19719912Dl;
import X.C690870R8b;
import X.C723830SaL;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryGuideCardConfigurationProtocol;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class StoryGuideCardAbsCellConfig implements StoryGuideCardConfigurationProtocol {
    public void LIZ(BaseCellContentComponent baseCellContentComponent) {
    }

    public C19719912Dl LIZJ() {
        return C13LE.LIZ(StoryGuideCardComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void NS1(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        C723830SaL.LIZ(baseCellContentComponent, null, new AwS377S0200000_11((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C03H5>) this, (StoryGuideCardAbsCellConfig) 143));
        LIZ(baseCellContentComponent);
    }
}
