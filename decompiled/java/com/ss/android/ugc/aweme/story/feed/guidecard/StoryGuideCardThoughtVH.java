package com.ss.android.ugc.aweme.story.feed.guidecard;

import X.C03H5;
import X.C0RF0;
import X.C0RF2;
import X.C1554610qYd;
import X.C690870R8b;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryGuideCardConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardThoughtVH extends BaseStoryGuideCardVH<StoryGuideCardThoughtVH> {
    @Override // X.C0RGM
    public final void LLI() {
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_guide_card_thought";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StoryGuideCardConfigurationProtocol.class, false);
    }

    public StoryGuideCardThoughtVH(C0RF0 c0rf0, C0RF2<StoryGuideCardThoughtVH, VideoItemParams> c0rf2) {
        super(c0rf0, c0rf2);
    }
}
