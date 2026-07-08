package com.ss.android.ugc.aweme.feed.collection.sub.component;

import X.C0RF0;
import X.C1558520qew;
import X.C628500Oky;
import X.C630740Ooa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.adapter.playerview.FeedVideoPlayerView;
import com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedVideoPlayerViewComponent extends BaseCellContentComponent<FeedVideoPlayerViewComponent> implements FeedVideoPlayerViewAbility {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 335));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 336));
    public FeedVideoPlayerView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FeedVideoPlayerViewAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.FeedVideoPlayerViewAbility
    public final BaseFeedPlayerView E() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLJJJJLIIL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FeedVideoPlayerViewAbility.class, null, null);
        }
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null) {
            return;
        }
        FeedVideoPlayerView feedVideoPlayerView = new FeedVideoPlayerView((ViewGroup) view, c0rf0);
        FeedPlayerViewInitAbility feedPlayerViewInitAbility = (FeedPlayerViewInitAbility) this.LLJJL.getValue();
        if (feedPlayerViewInitAbility != null) {
            feedPlayerViewInitAbility.Wo0(feedVideoPlayerView);
        }
        this.LLJJLIIIJLLLLLLLZ = feedVideoPlayerView;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
