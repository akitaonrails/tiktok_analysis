package com.ss.android.ugc.aweme.ui.feed.collection;

import X.C0R8C;
import X.C0RF0;
import X.C1480420ocy;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1483410ohn;
import X.C1554610qYd;
import X.C583620Mum;
import X.C691430RAf;
import X.C708600Rqs;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.FriendsV3DetailCellConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import kotlin.jvm.internal.AwS5S0011000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailPhotoViewHolder extends PhotoViewHolderInCollection {
    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLFF() {
        LLLLZIL(true);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.VJ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLIZLLLIL() {
        LLLLLLZZ().zQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJJJIL() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            LLLLLLZZ().yQ2(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void Z1() {
        LLLLLLZZ().yQ2(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void sc() {
        LLLLLLZZ().yQ2(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void Ar(Aweme aweme) {
        LLLLLLLLL().yQ2(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void K1(boolean z) {
        VideoViewModel videoViewModelLLLLLLLLL = LLLLLLLLL();
        videoViewModelLLLLLLLLL.getClass();
        videoViewModelLLLLLLLLL.setState(new C0R8C(z));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJLIIIL(int i) {
        super.LJLIIIL(i);
        LLLLLLLLL().zQ2();
        if (i != 1 && i != 6) {
            if (i == 5) {
                LLLLLLZZ().zQ2();
            } else {
                LLLLLLZZ().xQ2(1);
            }
            LLLLLLLLL().zQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLLI(int i) {
        super.LLLI(i);
        if (i != 1 && i != 2) {
            return;
        }
        LLLLLLLLL().AQ2();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<FriendsV3DetailCellConfigurationProtocol> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, FriendsV3DetailCellConfigurationProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection, com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        super.onPausePlay(str);
        LLLLLLZZ().xQ2(2);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        C583620Mum.LJJIIJZLJL(this, f);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.collection.PhotoViewHolderInCollection, com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String sourceId;
        super.onRenderFirstFrame(c1480420ocy);
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        if (c1480420ocy != null) {
            sourceId = c1480420ocy.getSourceId();
        } else {
            sourceId = null;
        }
        videoPlayViewModelLLLLLLZZ.LJJIJIIJI(sourceId);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onRenderFirstFrame(c1480420ocy);
        }
    }

    public FriendsDetailPhotoViewHolder(C0RF0 c0rf0, C691430RAf c691430RAf) {
        super(c0rf0, c691430RAf);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LLJJ(int i, boolean z) {
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new AwS5S0011000_11(z, i, 1));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell
    /* JADX INFO: renamed from: LLLLILI */
    public final VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        VideoItemParams videoItemParamsLLLIILIL = super.LLLIILIL(aweme, z);
        BaseFeedPageParams baseFeedPageParams = this.LLLLII.LJ;
        videoItemParamsLLLIILIL.setRequestId(C708600Rqs.LIZ(baseFeedPageParams.pageType, aweme, baseFeedPageParams.param.getEnterMethodValue(), this.LLLLII.LJ.eventType));
        return videoItemParamsLLLIILIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void Z(int i, boolean z) {
        VideoPlayViewModel videoPlayViewModelLLLLLLZZ = LLLLLLZZ();
        videoPlayViewModelLLLLLLZZ.getClass();
        videoPlayViewModelLLLLLLZZ.setState(new AwS5S0011000_11(z, i, 0));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIJ(this, str, c1480430ocz);
        LLLLLLZZ().xQ2(2);
        LLLLLLZZ().onPausePlay(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i) {
        C583620Mum.LJIJJ(this, str, i);
        LLLLLLZZ().onPlayCompleted(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJIL(this, str, c1480430ocz);
        LLLLLLZZ().wQ2();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN) {
        C583620Mum.LJJ(this, str, c1481290oeN);
        LLLLLLZZ().xQ2(3);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJI(this, str, c1480430ocz);
        LLLLLLZZ().onPreparePlay(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJJL(this, str, c1480430ocz);
        LLLLLLZZ().onResumePlay(str);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        super.onPlayProgressChange(str, j, j2);
        BaseFeedPlayerView baseFeedPlayerView = this.LLLI;
        if (baseFeedPlayerView != null) {
            baseFeedPlayerView.onPlayProgressChange(str, j, j2);
        }
    }
}
