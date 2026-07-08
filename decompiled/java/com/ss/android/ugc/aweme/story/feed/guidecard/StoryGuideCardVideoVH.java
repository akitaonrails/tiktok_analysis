package com.ss.android.ugc.aweme.story.feed.guidecard;

import X.C03H5;
import X.C0RF0;
import X.C0RF2;
import X.C1480420ocy;
import X.C1554610qYd;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryGuideCardConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardVideoVH extends BaseStoryGuideCardVH<StoryGuideCardVideoVH> {
    public final C630740Ooa LLJLIL;

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_story_guide_card_video";
    }

    public final StoryVideoAbility LLLLJI() {
        return (StoryVideoAbility) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void G() {
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            storyVideoAbilityLLLLJI.G();
        }
    }

    @Override // X.C0RGM
    public final void LLI() {
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            storyVideoAbilityLLLLJI.LLI();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StoryGuideCardConfigurationProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            storyVideoAbilityLLLLJI.LLLLIL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        C583620Mum.LJI(this, z);
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            storyVideoAbilityLLLLJI.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        C583620Mum.LJJJ(this, str);
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            storyVideoAbilityLLLLJI.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String sourceId;
        C583620Mum.LJJJJ(this, c1480420ocy);
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            if (c1480420ocy != null) {
                sourceId = c1480420ocy.getSourceId();
            } else {
                sourceId = null;
            }
            storyVideoAbilityLLLLJI.LJJIJIIJI(sourceId);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C583620Mum.LJJJJJ(this, str);
        StoryVideoAbility storyVideoAbilityLLLLJI = LLLLJI();
        if (storyVideoAbilityLLLLJI != null) {
            storyVideoAbilityLLLLJI.onResumePlay(str);
        }
    }

    public StoryGuideCardVideoVH(C0RF0 c0rf0, C0RF2<StoryGuideCardVideoVH, VideoItemParams> c0rf2) {
        super(c0rf0, c0rf2);
        this.LLJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 652));
    }
}
