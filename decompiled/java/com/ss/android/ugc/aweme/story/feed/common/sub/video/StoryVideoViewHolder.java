package com.ss.android.ugc.aweme.story.feed.common.sub.video;

import X.C03H5;
import X.C0R8E;
import X.C0RF0;
import X.C1360340lVI;
import X.C1480420ocy;
import X.C1482250ofv;
import X.C1554610qYd;
import X.C1888107aR;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C691420RAe;
import X.C707060RoO;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StorySubCellConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.component.StoryVideoCellRootComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class StoryVideoViewHolder extends BasePostViewCell {
    public final C0RF0 LLLLII;
    public final C630740Ooa LLLLIIIILLL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 4;
    }

    public String gq() {
        return "cell_story_video";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        StoryVideoCellRootComponent storyVideoCellRootComponent = new StoryVideoCellRootComponent(LLLIZZ(), new AwS590S0100000_11(this, 187));
        this.LLJJJ = storyVideoCellRootComponent;
        return storyVideoCellRootComponent;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StorySubCellConfigurationProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility
    public final void Wo0(BaseFeedPlayerView baseFeedPlayerView) {
        super.Wo0(baseFeedPlayerView);
        if ((!C1360340lVI.LIZ(this.LLLLII.LJ.param) && C707060RoO.LIZ(this.LLLLII.LIZJ)) || (C1360340lVI.LIZ(this.LLLLII.LJ.param) && C1888107aR.LIZ())) {
            VideoViewModel videoViewModelLLLLLLLLL = LLLLLLLLL();
            View videoView = baseFeedPlayerView.getVideoView();
            videoViewModelLLLLLLLLL.getClass();
            videoViewModelLLLLLLLLL.setState(new C0R8E(videoView));
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLLLIIIILLL.getValue();
        if (cellAdaptionComponentAbility != null) {
            BaseFeedPageParams baseFeedPageParams = this.LLLLII.LJ;
            String str = baseFeedPageParams.eventType;
            if (str == null) {
                str = "";
            }
            cellAdaptionComponentAbility.Ct2(str, Integer.valueOf(baseFeedPageParams.videoHeight), Integer.valueOf(this.LLLLII.LJ.videoWidth), getVideoView());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String sourceId;
        super.onRenderFirstFrame(c1480420ocy);
        try {
            Aweme aweme = this.LLJJIJIIJIL;
            if (aweme != null) {
                IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
                VideoUrlModel playAddr = null;
                if (c1480420ocy != null) {
                    sourceId = c1480420ocy.getSourceId();
                } else {
                    sourceId = null;
                }
                Video video = aweme.getVideo();
                if (video != null) {
                    playAddr = video.getPlayAddr();
                }
                C1482250ofv.LIZ(playAddr, sourceId);
                iFeedDebugService.LJJIJIL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public StoryVideoViewHolder(C0RF0 c0rf0, C691420RAe c691420RAe) {
        super(c0rf0, c691420RAe);
        this.LLLLII = c0rf0;
        this.LLLLIIIILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1391));
    }
}
