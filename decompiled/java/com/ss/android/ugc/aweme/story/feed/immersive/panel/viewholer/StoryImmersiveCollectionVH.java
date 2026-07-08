package com.ss.android.ugc.aweme.story.feed.immersive.panel.viewholer;

import X.C01GW;
import X.C03H5;
import X.C0RF0;
import X.C0RGJ;
import X.C0RGO;
import X.C0RGQ;
import X.C0RGR;
import X.C0S11;
import X.C0S1K;
import X.C0SUG;
import X.C0SZ8;
import X.C10EU;
import X.C1365870leD;
import X.C1389890mGx;
import X.C13LP;
import X.C1480420ocy;
import X.C1554610qYd;
import X.C1558420qem;
import X.C1558520qew;
import X.C1609930rzr;
import X.C1668306g5;
import X.C19719512Dh;
import X.C19EG;
import X.C2189821An6;
import X.C298520Bn0;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C693050RGl;
import X.C693070RGn;
import X.C729510SjV;
import X.C730000SkI;
import X.C735840Sti;
import X.InterfaceC665370Q7z;
import X.InterfaceC729990SkH;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StoryCollectionConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.aweme.story.ability.IStoryBubbleListAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveCollectionRootComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryCollectionVHCompatAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryPanelVPCompatAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.protocol.AdaptionProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryImmersiveCollectionVH extends BaseCollectionFeedVH<StoryImmersiveCollectionVH> implements StoryCollectionCellAbility, IStoryBubbleListAbility, StoryCollectionVHCompatAbility {
    public final C0RF0 LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C630740Ooa LLLLII;
    public Aweme LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;
    public final C630740Ooa LLLLIILLL;
    public Function0<Unit> LLLLIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final String LLLIIL() {
        return "cell_story_immersive_collection";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH
    public final void LLLLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.IStoryBubbleListAbility
    public final ViewGroup CW1() {
        return (ViewGroup) this.LLLJIL.LIZ.findViewById(R.id.i3s);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.bytedance.ext_power_list.AssemReusedContainer
    public final ReusedUIAssem<?> LLILLJJLI() {
        StoryImmersiveCollectionRootComponent storyImmersiveCollectionRootComponent = new StoryImmersiveCollectionRootComponent(LLLIZZ(), new AwS590S0100000_11(this, 263));
        this.LLJJJ = storyImmersiveCollectionRootComponent;
        return storyImmersiveCollectionRootComponent;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH
    public final String LLLLJI() {
        C735840Sti c735840Sti = C735840Sti.LIZ;
        BaseFeedPageParams baseFeedPageParams = this.LLLJIL.LJ;
        String str = baseFeedPageParams.eventType;
        String from = baseFeedPageParams.param.getFrom();
        Context context = this.LLJILJILJ.LIZ.getContext();
        c735840Sti.getClass();
        return C735840Sti.LJIIJ(context, str, from);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void e1() {
        StoryPanelVPCompatAbility storyPanelVPCompatAbility = (StoryPanelVPCompatAbility) this.LLLLIILLL.getValue();
        if (storyPanelVPCompatAbility != null) {
            storyPanelVPCompatAbility.lQ2(this.LLJJIJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryCollectionVHCompatAbility
    public final void vu0() {
        Function0<Unit> function0 = this.LLLLIL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8, X.C0SZA
    public final Aweme LJIIIIZZ() {
        Aweme aweme;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null && (aweme = c0sz8LLJLLL.getAweme()) != null) {
            return aweme;
        }
        Aweme aweme2 = this.LLJJIJIIJIL;
        return (aweme2 == null || C729510SjV.LJJIIZ(aweme2)) ? C729510SjV.LJFF(this.LLLLIIIILLL) : this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, X.C0RGM
    public final void LLI() {
        super.LLI();
        List listLIZIZ = C1554610qYd.LIZIZ(C1558420qem.LIZIZ(this), AdaptionProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((AdaptionProtocol) it2.next()).LJJIJLIJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, StoryCollectionCellAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, IStoryBubbleListAbility.class, null);
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, StoryCollectionVHCompatAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final Aweme getAweme() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final Aweme hm() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility
    public final Aweme o81() {
        return this.LLLLIIIILLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void Dk2(C693070RGn c693070RGn) {
        Z20(c693070RGn.LIZIZ, c693070RGn.LIZ);
        super.Dk2(c693070RGn);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility
    public final void LB0(C0RGR c0rgr) {
        if (((List) this.LLLLIILL.getValue()).contains(c0rgr)) {
            return;
        }
        ((List) this.LLLLIILL.getValue()).add(c0rgr);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJI(Aweme aweme) {
        super.LJI(aweme);
        InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) this.LLLJL.getValue();
        if (interfaceC729990SkH != null) {
            interfaceC729990SkH.LIZIZ(310);
        }
        if (C729510SjV.LJJIIZ(aweme)) {
            this.LLLLIIIILLL = aweme;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        User author;
        Integer numValueOf;
        Aweme item;
        User userLIZ;
        String uid;
        String string;
        User author2;
        String aid;
        String str;
        Map<String, String> extra = this.LLLJIL.LJ.param.getExtra();
        String uid2 = null;
        if (C19719512Dh.LJII(extra) && extra != null) {
            Aweme aweme = this.LLLLIIIILLL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, "reveal_story")) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            extra.put("is_centralized_avatar", str);
        }
        super.LJJIJIIJIL(i);
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ = LLLLLZ();
        if (feedCollectionViewPagerAbilityLLLLLZ != null) {
            feedCollectionViewPagerAbilityLLLLLZ.ee1(i, this.LLLLIIIILLL);
        }
        VideoViewModel videoViewModelLLLLLLZZ = LLLLLLZZ();
        Aweme aweme2 = this.LLLLIIIILLL;
        if (aweme2 != null) {
            author = aweme2.getAuthor();
        } else {
            author = null;
        }
        videoViewModelLLLLLLZZ.getClass();
        videoViewModelLLLLLLZZ.setState(new AwS590S0100000_11(author, 494));
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ2 = LLLLLZ();
        if (feedCollectionViewPagerAbilityLLLLLZ2 != null && (numValueOf = Integer.valueOf(feedCollectionViewPagerAbilityLLLLLZ2.LJIL())) != null) {
            int iIntValue = numValueOf.intValue();
            C0SZ8 c0sz8LLJLLL = LLJLLL();
            if (c0sz8LLJLLL != null) {
                c0sz8LLJLLL.LJJIJIIJIL(iIntValue);
            }
            numValueOf.intValue();
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbilityLLLLLZ3 = LLLLLZ();
            if (feedCollectionViewPagerAbilityLLLLLZ3 != null && (item = feedCollectionViewPagerAbilityLLLLLZ3.getItem(numValueOf.intValue())) != null) {
                if (C729510SjV.LJJIJIL(item) && C0RGO.LIZ()) {
                    PopupManager.LJIJI(new C0S11(item, this.LLLJIL.LJIIIZ, new AwS555S0100000_11(this, 1594), new AwS555S0100000_11(this, 1595), this.LLLJIL.LIZ), true);
                }
                if (C298520Bn0.LIZ() && !((StoryFeedViewModel) this.LLLLIIL.getValue()).LLJJIJIIJIL) {
                    C2189821An6 c2189821An6 = this.LLLJIL.LJ.param;
                    if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS") && Intrinsics.LJFF(c2189821An6.getEventType(), "notification_page") && Intrinsics.LJFF(C1609930rzr.LJIL(c2189821An6), "story_top_cell_anchor") && (userLIZ = C10EU.LIZ()) != null && (uid = userLIZ.getUid()) != null && (string = Integer.valueOf(uid.hashCode()).toString()) != null && !Keva.getRepo("story_highlights_consume").getBoolean(string, false)) {
                        Keva.getRepo("story_highlights_consume").storeBoolean(string, true);
                        Aweme aweme3 = this.LLJJIJIIJIL;
                        if (aweme3 != null && (author2 = aweme3.getAuthor()) != null) {
                            uid2 = author2.getUid();
                        }
                        PopupManager.LJIIZILJ(new C0SUG(uid2, new AwS555S0100000_11(this, 1592), new AwS555S0100000_11(this, 1593)), new C1668306g5("story_highlight_consumption_fresh_guide_pop"));
                        ((StoryFeedViewModel) this.LLLLIIL.getValue()).LLJJIJIIJIL = true;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StoryCollectionConfigurationProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH
    public final void LLLLZI(C693070RGn c693070RGn) {
        if (C729510SjV.LJJIJIL(LJIIIIZZ())) {
            VideoViewModel videoViewModelLLLLLLZZ = LLLLLLZZ();
            videoViewModelLLLLLLZZ.getClass();
            videoViewModelLLLLLLZZ.setState(new AwS590S0100000_11(c693070RGn, 487));
        } else {
            FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLLIZZ.getValue();
            if (fakePlayerAbility != null) {
                fakePlayerAbility.e10();
            }
            LLLLLLZZ().BQ2(this.LLJJIJIL, null);
        }
        BaseCellContentComponent baseCellContentComponent = this.LLJJJ;
        if (baseCellContentComponent != null) {
            baseCellContentComponent.J1(this.LLJJIJIL, this.LLLLIIIILLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility
    public final void Z50(C0RGR c0rgr) {
        ((List) this.LLLLIILL.getValue()).remove(c0rgr);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionViewHolder, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void h(boolean z) {
        super.h(z);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.h(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryCollectionVHCompatAbility
    public final void h30(AwS140S0400000_11 awS140S0400000_11) {
        this.LLLLIL = awS140S0400000_11;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String strGq;
        C0RGJ c0rgj;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (!(c0sz8LLJLLL instanceof C0RGJ) || (c0rgj = (C0RGJ) c0sz8LLJLLL) == null || (strGq = c0rgj.gq()) == null) {
            strGq = "";
        }
        c730000SkI.LIZ(249372176, strGq, "cell_type");
        c730000SkI.LIZLLL(249372176, true);
        super.onRenderFirstFrame(c1480420ocy);
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLILZLLLI.getValue();
        if (userFeedViewPagerAbility != null) {
            userFeedViewPagerAbility.jP();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final void p(int i) {
        super.p(1);
        C0SZ8 c0sz8LLJLLL = LLJLLL();
        if (c0sz8LLJLLL != null) {
            c0sz8LLJLLL.p(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0RGJ, X.C0SZ8
    public final void uq(C1365870leD c1365870leD) {
        C19EG c19eg;
        IMContact iMContact;
        Aweme awemeLJIIIIZZ;
        String nickname;
        User author;
        BaseContact baseContact;
        if (c1365870leD != null) {
            String str = c1365870leD.LJI;
            Aweme awemeLJIIIIZZ2 = LJIIIIZZ();
            String aid = null;
            if (awemeLJIIIIZZ2 != null) {
                aid = awemeLJIIIIZZ2.getAid();
            }
            if (Intrinsics.LJFF(str, aid)) {
                if ((Intrinsics.LJFF(c1365870leD.LJFF, "story_share_icon") || Intrinsics.LJFF(c1365870leD.LJFF, "more")) && (c19eg = this.LLJILLL) != null) {
                    C0S1K c0s1k = C0S1K.LIZIZ;
                    List<IMContact> list = c1365870leD.LIZIZ;
                    if ((list == null || (baseContact = (BaseContact) C13LP.LJJJLL(list)) == null || (nickname = baseContact.getNickName()) == null) && (((iMContact = c1365870leD.LIZ) == null || (nickname = iMContact.getNickName()) == null) && ((awemeLJIIIIZZ = LJIIIIZZ()) == null || (author = awemeLJIIIIZZ.getAuthor()) == null || (nickname = author.getNickname()) == null))) {
                        nickname = "";
                    }
                    C1389890mGx c1389890mGxLJIIIZ = c0s1k.LJIIIZ(c19eg, nickname);
                    if (c1389890mGxLJIIIZ != null) {
                        c1389890mGxLJIIIZ.LJIIJJI();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void xO2(C693050RGl c693050RGl) {
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null && AwemeBizExtKt.isStoryFakeAweme(aweme)) {
            Z20(this.LLJJIJIL, c693050RGl.LIZ);
        }
    }

    public StoryImmersiveCollectionVH(C0RF0 c0rf0, C0RGQ c0rgq) {
        super(c0rf0, c0rgq);
        this.LLLJIL = c0rf0;
        this.LLLJL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(478));
        this.LLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(477));
        this.LLLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 1596));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1597));
        this.LLLLIILL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(476));
        this.LLLLIILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 1598));
        C628500Oky.LIZ(new AwS555S0100000_11(this, 1599));
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, StoryCollectionCellAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, IStoryBubbleListAbility.class, null, null);
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, StoryCollectionVHCompatAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility
    public final void Z20(int i, Aweme aweme) {
        if (i != this.LLJJIJIL) {
            return;
        }
        Iterator it2 = C13LP.LJLJJLL((Iterable) this.LLLLIILL.getValue()).iterator();
        while (it2.hasNext()) {
            ((C0RGR) it2.next()).sl(LLLIILIL(aweme, false));
        }
        LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.BaseCollectionFeedVH, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        super.onPlayProgressChange(str, j, j2);
    }
}
