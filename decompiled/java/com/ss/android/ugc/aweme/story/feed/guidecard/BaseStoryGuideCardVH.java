package com.ss.android.ugc.aweme.story.feed.guidecard;

import X.C0RAF;
import X.C0RF0;
import X.C0RF2;
import X.C0RGM;
import X.C0SMO;
import X.C0SUL;
import X.C0SZ8;
import X.C13LP;
import X.C1440005kM;
import X.C1480430ocz;
import X.C1558420qem;
import X.C1558520qew;
import X.C2188811AlT;
import X.C583620Mum;
import X.C628500Oky;
import X.C630740Ooa;
import X.C712440Rx4;
import X.C714530S1b;
import X.C728750SiH;
import X.C729510SjV;
import X.C737030Svd;
import X.InterfaceC1294060jmO;
import X.InterfaceC582840MtW;
import X.InterfaceC583650Mup;
import X.InterfaceC689860R4e;
import X.InterfaceC690460R6m;
import X.InterfaceC713360RyY;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder;
import com.ss.android.ugc.aweme.feed.collection.sub.component.FeedVideoPlayerViewAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardVHAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseStoryGuideCardVH<R extends C0SMO<R, VideoItemParams>> extends BaseSubViewHolder<R, VideoItemParams> implements CommonCellAbility, IVideoCellAbility, C0RGM, InterfaceC582840MtW, FeedPlayerViewInitAbility, StoryGuideCardVHAbility {
    public final C0RF0 LLJJL;
    public Aweme LLJJLIIIJLLLLLLLZ;
    public final C630740Ooa LLJL;

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Es(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
    public final InterfaceC713360RyY Fz2() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void H8(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer Ia() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final InterfaceC689860R4e K9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LLJLLL() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Q5(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void R() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Uc() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void Vu() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View Vy1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final InterfaceC690460R6m Wn0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    @InterfaceC1294060jmO
    public final Integer br() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View by1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ek(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final RootCellCommonAbility gI() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Fragment getFragment() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void ii(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Aweme im() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void nO1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final C0SUL om() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void td(HashMap<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final InterfaceC583650Mup x3() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final boolean yE0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View yy0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final BaseFeedPlayerView E() {
        FeedVideoPlayerViewAbility feedVideoPlayerViewAbility = (FeedVideoPlayerViewAbility) this.LLJL.getValue();
        if (feedVideoPlayerViewAbility != null) {
            return feedVideoPlayerViewAbility.E();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final List<Aweme> VA1() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final BaseFeedPageParams nJ2() {
        return this.LLJJL.LJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        C1558520qew.LJIIJJI(C1558420qem.LIZIZ(this), CommonCellAbility.class, null);
        C1558520qew.LJIIJJI(C1558420qem.LIZIZ(this), IVideoCellAbility.class, null);
        C1558520qew.LJIIJJI(C1558420qem.LIZIZ(this), FeedPlayerViewInitAbility.class, null);
        C1558520qew.LJIIJJI(C1558420qem.LIZIZ(this), StoryGuideCardVHAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardVHAbility
    public final int gl() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final Aweme hm() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJI(Aweme aweme) {
        Aweme awemeLLLLILI;
        String aid;
        String aid2 = null;
        if (aweme != null) {
            awemeLLLLILI = LLLLILI(aweme);
        } else {
            awemeLLLLILI = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" bind, originAid: ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", subAid = ");
        if (awemeLLLLILI != null) {
            aid2 = awemeLLLLILI.getAid();
        }
        sbLIZ.append(aid2);
        sbLIZ.append(", this = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C728750SiH.LIZ.getClass();
        if (!((HashMap) C728750SiH.LJFF.getValue()).containsKey(C712440Rx4.LIZ(awemeLLLLILI))) {
            C728750SiH.LJIIJ(this.LLJJIJIL, aweme, "fallback");
        }
        super.LJI(awemeLLLLILI);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        String aid;
        super.LJJIJIIJIL(i);
        if (this.LLJJL.LJ.awemeFromPage == 1) {
            C1440005kM.LIZ(new C714530S1b(this.LLJJIJIIJIL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" onViewHolderSelected, subAwemeAid: ");
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", this = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C0SZ8 LJJIJIL(String str) {
        String aid;
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid) || str == null) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final void LLLL(Aweme aweme) {
        this.LLJJIJIIJIL = aweme;
    }

    public final Aweme LLLLILI(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        List<Aweme> stories2;
        if (C729510SjV.LJJIIZ(aweme)) {
            this.LLJJLIIIJLLLLLLLZ = aweme;
            C728750SiH c728750SiH = C728750SiH.LIZ;
            Integer numValueOf = Integer.valueOf(this.LLJJIJIL);
            c728750SiH.getClass();
            C728750SiH.LJIIIZ(aweme, numValueOf);
            UserStory userStory2 = aweme.getUserStory();
            if (userStory2 != null && (stories2 = userStory2.getStories()) != null) {
                return (Aweme) C13LP.LJJJLL(stories2);
            }
            return null;
        }
        if (!C729510SjV.LJJIJIL(aweme)) {
            this.LLJJLIIIJLLLLLLLZ = aweme;
            C728750SiH c728750SiH2 = C728750SiH.LIZ;
            Integer numValueOf2 = Integer.valueOf(this.LLJJIJIL);
            c728750SiH2.getClass();
            C728750SiH.LJIIIZ(aweme, numValueOf2);
            return aweme;
        }
        Aweme aweme3 = this.LLJJLIIIJLLLLLLLZ;
        if (aweme3 == null || (userStory = aweme3.getUserStory()) == null || (stories = userStory.getStories()) == null || (aweme2 = (Aweme) C13LP.LJJJLL(stories)) == null) {
            return aweme;
        }
        return aweme2;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.ability.FeedPlayerViewInitAbility
    public final void Wo0(BaseFeedPlayerView baseFeedPlayerView) {
        baseFeedPlayerView.Dn(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void h(boolean z) {
        String aid;
        super.h(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" onViewHolderUnSelected, subAwemeAid: ");
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", this = ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void h0(Aweme aweme) {
        Aweme awemeLLLLILI;
        if (aweme != null) {
            awemeLLLLILI = LLLLILI(aweme);
        } else {
            awemeLLLLILI = null;
        }
        super.h0(awemeLLLLILI);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(C1480430ocz c1480430ocz) {
        C583620Mum.LJJJJIZL(this, c1480430ocz);
        this.LLJJL.LIZIZ.LLIIL(new C737030Svd(53, this.LLJJIJIIJIL));
    }

    public BaseStoryGuideCardVH(C0RF0 c0rf0, C0RF2<R, VideoItemParams> c0rf2) {
        super(c0rf0, c0rf2);
        this.LLJJL = c0rf0;
        this.LLJL = C628500Oky.LIZ(new AwS555S0100000_11((BaseStoryGuideCardVH) this, 651));
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, CommonCellAbility.class, null, null);
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, IVideoCellAbility.class, null, null);
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, FeedPlayerViewInitAbility.class, null, null);
        C1558520qew.LJII(C1558420qem.LIZIZ(this), this, StoryGuideCardVHAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void L0(int i, Aweme aweme) {
        Aweme awemeLLLLILI;
        if (aweme != null) {
            awemeLLLLILI = LLLLILI(aweme);
        } else {
            awemeLLLLILI = null;
        }
        super.L0(i, awemeLLLLILI);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        VideoItemParams videoItemParamsLIZ = C0RAF.LIZ(this.LLJJL);
        videoItemParamsLIZ.setAweme(aweme);
        videoItemParamsLIZ.currentPosition = this.LLJJIJIL;
        return videoItemParamsLIZ;
    }
}
