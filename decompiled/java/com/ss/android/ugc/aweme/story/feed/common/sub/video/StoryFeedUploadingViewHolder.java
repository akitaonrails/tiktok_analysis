package com.ss.android.ugc.aweme.story.feed.common.sub.video;

import X.C03H5;
import X.C0RF0;
import X.C1554610qYd;
import X.C690870R8b;
import X.C691420RAe;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StorySubCellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryFeedUploadingViewHolder extends StoryVideoViewHolder {
    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryVideoViewHolder, X.C0RGJ
    public final String gq() {
        return "cell_story_video_uploading";
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryVideoViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StorySubCellConfigurationProtocol.class, false);
    }

    public StoryFeedUploadingViewHolder(C0RF0 c0rf0, C691420RAe c691420RAe) {
        super(c0rf0, c691420RAe);
    }
}
