package com.ss.android.ugc.aweme.story.feed.common.sub.photo;

import X.C01GW;
import X.C03H5;
import X.C0R8E;
import X.C0RF0;
import X.C1554610qYd;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C691400RAc;
import X.C707060RoO;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StorySubCellConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryVideoCellRootComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LiveShareStoryViewHolder extends BasePostViewCell {
    public final C0RF0 LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C630740Ooa LLLLIIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 4;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_live_share_story";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        StoryVideoCellRootComponent storyVideoCellRootComponent = new StoryVideoCellRootComponent(LLLIZZ(), new AwS590S0100000_11(this, 182));
        this.LLJJJ = storyVideoCellRootComponent;
        return storyVideoCellRootComponent;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StorySubCellConfigurationProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        super.LLLLIL(aweme);
        CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLLLIIIILLL.getValue();
        if (cellStickerComponentAbility != null) {
            cellStickerComponentAbility.LLLLIL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility
    public final void Wo0(BaseFeedPlayerView baseFeedPlayerView) {
        super.Wo0(baseFeedPlayerView);
        if (C707060RoO.LIZ(this.LLLLII.LIZJ)) {
            VideoViewModel videoViewModelLLLLLLLLL = LLLLLLLLL();
            View videoView = baseFeedPlayerView.getVideoView();
            videoViewModelLLLLLLLLL.getClass();
            videoViewModelLLLLLLLLL.setState(new C0R8E(videoView));
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLLLIIL.getValue();
        if (cellAdaptionComponentAbility != null) {
            BaseFeedPageParams baseFeedPageParams = this.LLLLII.LJ;
            String str = baseFeedPageParams.eventType;
            if (str == null) {
                str = "";
            }
            cellAdaptionComponentAbility.Ct2(str, Integer.valueOf(baseFeedPageParams.videoHeight), Integer.valueOf(this.LLLLII.LJ.videoWidth), getVideoView());
        }
    }

    public LiveShareStoryViewHolder(C0RF0 c0rf0, C691400RAc c691400RAc) {
        super(c0rf0, c691400RAc);
        this.LLLLII = c0rf0;
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1365));
        this.LLLLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1364));
    }
}
