package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.C0RF0;
import X.C1558520qew;
import X.C628500Oky;
import X.C630740Ooa;
import X.C729510SjV;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.adapter.playerview.FeedVideoPlayerView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StorySharedPlayerViewComponent extends BaseCellContentComponent<StorySharedPlayerViewComponent> implements IStorySharedPlayerViewAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 585));
    public FeedVideoPlayerView LLJJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, IStorySharedPlayerViewAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.component.IStorySharedPlayerViewAbility
    public final BaseFeedPlayerView lt0() {
        return this.LLJJL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, IStorySharedPlayerViewAbility.class, null, null);
        }
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null) {
            return;
        }
        this.LLJJL = new FeedVideoPlayerView((ViewGroup) view, c0rf0);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        int i;
        View viewLJJIJL = LJJIJL();
        if (C729510SjV.LJJJIL(videoItemParams.getAweme())) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
    }
}
