package com.ss.android.ugc.aweme.story.feed.guidecard;

import X.C03H5;
import X.C0RF0;
import X.C0SZ8;
import X.C1554610qYd;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C691400RAc;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryImmersiveRevealPromoCardProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryPanelVPCompatAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealPromoCardVH extends BasePostViewCell {
    public final C630740Ooa LLLLII;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LLJLLL() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 4;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_reveal_promo_card";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void e1() {
        StoryPanelVPCompatAbility storyPanelVPCompatAbility = (StoryPanelVPCompatAbility) this.LLLLII.getValue();
        if (storyPanelVPCompatAbility != null) {
            storyPanelVPCompatAbility.lQ2(this.LLJJIJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StoryImmersiveRevealPromoCardProtocol.class, false);
    }

    public StoryRevealPromoCardVH(C0RF0 c0rf0, C691400RAc c691400RAc) {
        super(c0rf0, c691400RAc);
        this.LLLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1507));
    }
}
