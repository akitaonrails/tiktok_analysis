package com.ss.android.ugc.aweme.story.feed.common.sub.photo;

import X.C03H5;
import X.C0RF0;
import X.C1554610qYd;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C691390RAb;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StorySubCellConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.IStorySharedPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoCellRootComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryPhotoViewHolder extends BasePostViewCell {
    public final C630740Ooa LLLLII;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final void LLJJLIIIJLLLLLLLZ(BaseFeedPlayerView baseFeedPlayerView, boolean z) {
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_photo";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final BaseFeedPlayerView E() {
        IStorySharedPlayerViewAbility iStorySharedPlayerViewAbility = (IStorySharedPlayerViewAbility) this.LLLLII.getValue();
        if (iStorySharedPlayerViewAbility != null) {
            return iStorySharedPlayerViewAbility.lt0();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        StoryPhotoCellRootComponent storyPhotoCellRootComponent = new StoryPhotoCellRootComponent(LLLIZZ(), new AwS590S0100000_11(this, 184));
        this.LLJJJ = storyPhotoCellRootComponent;
        return storyPhotoCellRootComponent;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StorySubCellConfigurationProtocol.class, false);
    }

    public StoryPhotoViewHolder(C0RF0 c0rf0, C691390RAb c691390RAb) {
        super(c0rf0, c691390RAb);
        this.LLLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1366));
    }
}
