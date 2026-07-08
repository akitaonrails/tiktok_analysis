package com.ss.android.ugc.aweme.story.feed.common.sub.video;

import X.C01GW;
import X.C03H5;
import X.C0RF0;
import X.C1554610qYd;
import X.C452501pT;
import X.C690870R8b;
import X.C691410RAd;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StorySubCellConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryInvisibleVideoViewHolder extends BasePostViewCell {
    public final C0RF0 LLLLII;
    public final C01GW LLLLIIIILLL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell
    public final void LLLLZ(BaseFeedPlayerView baseFeedPlayerView) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 4;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_invisible_video";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell
    public final BaseFeedPlayerView LLLLLLL() {
        return (BaseFeedPlayerView) this.LLLLIIIILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StorySubCellConfigurationProtocol.class, false);
    }

    public StoryInvisibleVideoViewHolder(C0RF0 c0rf0, C691410RAd c691410RAd) {
        super(c0rf0, c691410RAd);
        this.LLLLII = c0rf0;
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1390));
    }
}
