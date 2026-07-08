package com.ss.android.ugc.aweme.story.feed.common.collection.component;

import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0B0W;
import X.C0LAB;
import X.C0RD4;
import X.C0RF0;
import X.C0RMW;
import X.C0RQI;
import X.C0RSY;
import X.C0S21;
import X.C0SZ8;
import X.C0XQ7;
import X.C103000aC;
import X.C1189504l3;
import X.C1220000hqw;
import X.C123100dR;
import X.C1245204u2;
import X.C1256140inE;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1360340lVI;
import X.C1386360mBG;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1474810oTv;
import X.C1478160oZK;
import X.C1483340ohg;
import X.C1483390ohl;
import X.C15438062q;
import X.C1558420qem;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C259710AFt;
import X.C281310B0v;
import X.C287410BOh;
import X.C298520Bn0;
import X.C360660ECa;
import X.C438710HIf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C582980Mtk;
import X.C628500Oky;
import X.C630650OoR;
import X.C630740Ooa;
import X.C690870R8b;
import X.C693050RGl;
import X.C694840RNi;
import X.C711430RvR;
import X.C712000RwM;
import X.C712080RwU;
import X.C712830Rxh;
import X.C714430S0r;
import X.C723700Sa8;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C727100Sfc;
import X.C729510SjV;
import X.C735840Sti;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737030Svd;
import X.EnumC712090RwV;
import X.InterfaceC1618460sDc;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC693060RGm;
import X.InterfaceC713360RyY;
import X.InterfaceC729990SkH;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ability.IPhotoAutoScrollAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.ability.StoryDetailAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.CollectionVHAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.feed.panel.StoryFeedListHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.story.ability.FakePlayerAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryPlayerControlAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.effect.StoryUseThisEffectComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.ability.StoryCollectionVHCompatAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.ViewerListShareViewModel;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryCollectionViewPagerComponent extends BaseFeedCollectionViewPagerComponent implements StoryCollectionViewPagerAbility, StoryPlayerControlAbility, Observer<C0RD4> {
    public boolean LLLIZZ;
    public UserStory LLLJIL;
    public Aweme LLLJL;
    public boolean LLLLIIIILLL;
    public final C01GW LLLIIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 574));
    public final C630740Ooa LLLIIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 573));
    public final C630740Ooa LLLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 577));
    public final C630740Ooa LLLIILIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 581));
    public final C630740Ooa LLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 584));
    public final C01GW LLLILZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(146));
    public final C630740Ooa LLLILZJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 583));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 579));
    public boolean LLLJ = true;
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 575));
    public final Set<String> LLLLII = new LinkedHashSet();
    public final C01GW LLLLIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(145));
    public final C01GW LLLLIILL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(143));
    public final C736950SvV LLLLIILLL = new C736950SvV(C13LE.LIZ(ViewerListShareViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(318), new AwS555S0100000_11((AbstractC738140SxQ) this, 582), new C451610HnL(this, true, true), new C723700Sa8(this));
    public final C01GW LLLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(144));
    public final C630740Ooa LLLLILI = C628500Oky.LIZ(new AwS555S0100000_11(this, 580));
    public final C630740Ooa LLLLJ = C628500Oky.LIZ(new AwS555S0100000_11(this, 576));
    public final C01GW LLLLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 578));

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionViewPagerAbility
    public final void D61() {
        this.LLLIZZ = true;
        List<Aweme> listNQ2 = Ip().NQ2(this.LLJL, this.LLJLIL, false);
        if (listNQ2 != null) {
            int iJQ2 = Ip().JQ2(this.LLJL, this.LLJLIL, listNQ2);
            this.LLJLILLLLZIIL = iJQ2;
            lp().setData(listNQ2);
            ArrayList arrayList = (ArrayList) listNQ2;
            if (arrayList.size() > 0 && iJQ2 >= 0) {
                InterfaceC729990SkH interfaceC729990SkH = (InterfaceC729990SkH) this.LLLILZ.getValue();
                if (interfaceC729990SkH != null) {
                    interfaceC729990SkH.LIZIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                }
                int currentItem = mp().getCurrentItem();
                M32(iJQ2, null, null);
                if (currentItem == iJQ2) {
                    Jp(this, iJQ2, false, "bindViewPager", false, 24);
                }
            }
            FeedCollectionProgressBarAbility feedCollectionProgressBarAbilitySp = sp();
            if (feedCollectionProgressBarAbilitySp != null) {
                feedCollectionProgressBarAbilitySp.T90(arrayList.size());
            }
        }
        this.LLLIZZ = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent
    public final void kp() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent
    /* JADX INFO: renamed from: Ep, reason: merged with bridge method [inline-methods] */
    public final C711430RvR lp() {
        return (C711430RvR) this.LLLLJI.getValue();
    }

    public final int Gp() {
        UserStory userStory = this.LLLJIL;
        if (userStory == null || !userStory.getAllViewed()) {
            return lp().getCount() - mp().getCurrentItem();
        }
        return 0;
    }

    public final StoryFeedViewModel Ip() {
        return (StoryFeedViewModel) this.LLLIIIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryPlayerControlAbility
    public final void JL2() {
        StoryFeedListHelper storyFeedListHelperGc2;
        C0SZ8 c0sz8LJLIL;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        StoryFeedListHelper storyFeedListHelperGc22;
        C724270Sb3 c724270Sb3 = this.LLJI;
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (C729510SjV.LJJJIL(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme())) {
            FakePlayerAbility fakePlayerAbility = (FakePlayerAbility) this.LLLLJ.getValue();
            if (fakePlayerAbility != null) {
                fakePlayerAbility.F41();
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLLLILI.getValue();
            if (iFeedPanelPlatformAbility != null && (storyFeedListHelperGc22 = iFeedPanelPlatformAbility.Gc2()) != null) {
                storyFeedListHelperGc22.LL.LJIILL(0.0f);
            }
        } else {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLLLILI.getValue();
            if (iFeedPanelPlatformAbility2 != null && (storyFeedListHelperGc2 = iFeedPanelPlatformAbility2.Gc2()) != null) {
                storyFeedListHelperGc2.LL.LJIILL(0.0f);
            }
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (!C582980Mtk.LIZIZ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme()) || (c0sz8LJLIL = LJLIL()) == null) {
            return;
        }
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPhotoAutoScrollAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPhotoAutoScrollAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        IPhotoAutoScrollAbility iPhotoAutoScrollAbility = (IPhotoAutoScrollAbility) interfaceC494301wDLIZ2;
        if (iPhotoAutoScrollAbility != null) {
            iPhotoAutoScrollAbility.NE0();
        }
    }

    public final void Vp() {
        C0SZ8 c0sz8;
        IFeedDebugService iFeedDebugService;
        if (!this.LLJLLL || (c0sz8 = this.LLJJLIIIJLLLLLLLZ) == null || c0sz8.getAweme() == null || (iFeedDebugService = (IFeedDebugService) this.LLLLIILL.getValue()) == null) {
            return;
        }
        iFeedDebugService.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent
    public final void up() {
        Up("story_collection_play_finish");
    }

    private final void Qp() {
        StoryDetailAbility storyDetailAbility;
        User author;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected, oldNickname = ");
        Aweme aweme = (Aweme) C13LP.LJJJLL(lp().LJJJLZIJ());
        sbLIZ.append((aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getNickname());
        sbLIZ.append(", newNickName = ");
        C724270Sb3 c724270Sb3 = this.LLJI;
        User author2 = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author2 != null ? author2.getNickname() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLLII.clear();
        FeedCollectionProgressBarAbility feedCollectionProgressBarAbilitySp = sp();
        if (feedCollectionProgressBarAbilitySp != null) {
            feedCollectionProgressBarAbilitySp.T90(lp().getCount());
        }
        Jp(this, mp().getCurrentItem(), false, "onHolderSelected", true, 16);
        Up("story_collection_play");
        StoryDetailAbility storyDetailAbility2 = (StoryDetailAbility) this.LLLIL.getValue();
        if (storyDetailAbility2 == null || !storyDetailAbility2.cg0()) {
            PlayEnterBehaviorAbility playEnterBehaviorAbilityFp = Fp();
            if (playEnterBehaviorAbilityFp != null) {
                playEnterBehaviorAbilityFp.vS(this.LLLJ);
            } else if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getContext()) && this.LLLJ && (storyDetailAbility = (StoryDetailAbility) this.LLLIL.getValue()) != null) {
                storyDetailAbility.Xt2();
            }
        } else {
            PlayEnterBehaviorAbility playEnterBehaviorAbilityFp2 = Fp();
            if (playEnterBehaviorAbilityFp2 != null) {
                playEnterBehaviorAbilityFp2.KK("auto");
            }
        }
        this.LLLJ = false;
        StoryDetailAbility storyDetailAbility3 = (StoryDetailAbility) this.LLLIL.getValue();
        if (storyDetailAbility3 != null) {
            storyDetailAbility3.z61(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        if (r0 != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ap() {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent.Ap():void");
    }

    public final PlayEnterBehaviorAbility Fp() {
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        C0SZ8 c0sz8LJLIL = LJLIL();
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if (c0sz8LJLIL == null) {
            return null;
        }
        if (!(c0sz8LJLIL instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8LJLIL) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, PlayEnterBehaviorAbility.class, null)) == null) {
            C0SZ8 c0sz8LLJLLL = c0sz8LJLIL.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, PlayEnterBehaviorAbility.class, null);
            }
        } else {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        }
        return (PlayEnterBehaviorAbility) interfaceC494301wDLIZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent.LJL():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLLLL() {
        super.LJLLLL();
        this.LLLJL = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        super.Vo();
        if (this.LLJLLL) {
            Up("story_collection_play_end");
        }
        InterfaceC713360RyY interfaceC713360RyYFz2 = Fz2();
        if (interfaceC713360RyYFz2 != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ2, StoryCollectionViewPagerAbility.class, null);
        }
        InterfaceC713360RyY interfaceC713360RyYFz22 = Fz2();
        if (interfaceC713360RyYFz22 == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null) {
            return;
        }
        C1558520qew.LJIIJJI(interfaceC665370Q7zLIZIZ, StoryPlayerControlAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        super.onParentSet();
        InterfaceC713360RyY interfaceC713360RyYFz2 = Fz2();
        if (interfaceC713360RyYFz2 != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ2, this, StoryCollectionViewPagerAbility.class, null, null);
        }
        InterfaceC713360RyY interfaceC713360RyYFz22 = Fz2();
        if (interfaceC713360RyYFz22 == null || (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null) {
            return;
        }
        C1558520qew.LJII(interfaceC665370Q7zLIZIZ, this, StoryPlayerControlAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent
    public final void tp() {
        lp().LLJILJILJ = Fz2();
        super.tp();
        C0RMW c0rmw = C0RMW.LIZ;
        C0RF0 c0rf0 = jm().LIZLLL;
        boolean z = true;
        boolean z2 = c0rmw.LJJIIJZLJL(c0rf0 != null ? c0rf0.LIZJ : null) && C281310B0v.LIZ();
        C714430S0r c714430S0rMp = mp();
        if (z2) {
            C0RF0 c0rf02 = jm().LIZLLL;
            if (!Intrinsics.LJFF(c0rf02 != null ? c0rf02.LJIIIZ : null, "story_archive") || C1189504l3.LIZ()) {
                z = false;
            }
        }
        c714430S0rMp.setAllowScroll(z);
        mp().LIZLLL(new C360660ECa() { // from class: X.0RwK
            /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onPageSelected(int r10) {
                /*
                    r9 = this;
                    com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent r3 = r9.LL
                    boolean r2 = r3.LLLIZZ
                    r4 = r10
                    if (r2 == 0) goto Le
                    int r1 = r3.LLJLL
                    r0 = -1
                    if (r1 == r0) goto L60
                    if (r1 == r4) goto L60
                Le:
                    r5 = 1
                Lf:
                    r7 = r2 ^ 1
                    java.lang.String r6 = "onPageSelectedCallBack"
                    r8 = 16
                    com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent.Jp(r3, r4, r5, r6, r7, r8)
                    com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent r0 = r9.LL
                    X.0S0r r0 = r0.mp()
                    r4 = 2131367725(0x7f0a172d, float:1.835538E38)
                    java.lang.Object r3 = r0.getTag(r4)
                    boolean r1 = r3 instanceof java.lang.String
                    r0 = 0
                    if (r1 == 0) goto L5e
                    java.lang.String r3 = (java.lang.String) r3
                L2c:
                    java.lang.String r2 = "INVALID_TAG"
                    if (r3 == 0) goto L47
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r2)
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L47
                    com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent r0 = r9.LL
                    com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility r0 = r0.Fp()
                    if (r0 == 0) goto L47
                    r0.KK(r3)
                    kotlin.Unit r0 = kotlin.Unit.LIZ
                    if (r0 != 0) goto L54
                L47:
                    com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent r0 = r9.LL
                    com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility r1 = r0.Fp()
                    if (r1 == 0) goto L54
                    java.lang.String r0 = "slide"
                    r1.KK(r0)
                L54:
                    com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent r0 = r9.LL
                    X.0S0r r0 = r0.mp()
                    r0.setTag(r4, r2)
                    return
                L5e:
                    r3 = r0
                    goto L2c
                L60:
                    r5 = 0
                    goto Lf
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C711980RwK.onPageSelected(int):void");
            }
        });
        HandlerHook.viewPostDelay(mp(), new ARunnableS111S0100000_11(this, 47), 300L);
    }

    public final Integer Bp(List<? extends Aweme> list) {
        Story story;
        int i;
        Story story2;
        Aweme item = lp().getItem(mp().getCurrentItem());
        if (item == null || (story = item.getStory()) == null || !story.isPublishing()) {
            return null;
        }
        Iterator<? extends Aweme> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it2.hasNext()) {
                break;
            }
            Aweme next = it2.next();
            if (Intrinsics.LJFF(next.getAid(), item.getAid()) && (story2 = next.getStory()) != null && story2.isPublishing()) {
                if (i2 >= 0) {
                    return Integer.valueOf(i2);
                }
            } else {
                i2++;
            }
        }
        Iterator<? extends Aweme> it3 = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Story story3 = it3.next().getStory();
            if (story3 != null && story3.isPublishing()) {
                i = i3;
                break;
            }
            i3++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return numValueOf;
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility
    public final void En(String str) {
        UserStory userStory;
        Iterator<Aweme> it2 = lp().LJJJLZIJ().iterator();
        while (it2.hasNext() && !Intrinsics.LJFF(it2.next().getAid(), str)) {
        }
        StoryFeedViewModel storyFeedViewModelIp = Ip();
        String str2 = this.LLJL;
        Aweme aweme = (Aweme) ((LinkedHashMap) storyFeedViewModelIp.LLJILJIL).get(str2);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            List arrayList = (List) ((LinkedHashMap) storyFeedViewModelIp.LLJILJILJ).get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Iterator<Aweme> it3 = userStory.getStories().iterator();
            int i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Aweme next = it3.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if (TextUtils.equals(next.getAid(), str)) {
                        if (userStory.getStories() != null && i < userStory.getStories().size()) {
                            ListProtector.remove(userStory.getStories(), i);
                            userStory.setOriginTotalCount(userStory.getOriginTotalCount() - 1);
                        }
                        userStory.setTotalCount(userStory.getTotalCount() - 1);
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C630650OoR c630650OoR = (C630650OoR) it4.next();
                            if (TextUtils.equals(str, c630650OoR.LIZ)) {
                                arrayList.remove(c630650OoR);
                                break;
                            }
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Wp(this, null, 1);
        Jp(this, mp().getCurrentItem(), true, "onAwemeDelete", false, 8);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final void Es0(C0RQI c0rqi) {
        Story story;
        Aweme item = lp().getItem(mp().getCurrentItem());
        if (item != null && (story = item.getStory()) != null && story.isPublishing()) {
            this.LLJJL = C0RQI.LOOP_CURRENT_VIDEO;
        } else {
            this.LLJJL = c0rqi;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final void QA(String str) {
        ((VideoPlayViewModel) this.LLJZ.getValue()).onPlayCompleted(str);
        Ap();
    }

    public final void Up(String str) {
        String str2;
        Aweme aweme;
        Integer numValueOf;
        int currentPosition;
        int iIntValue;
        String aid;
        Aweme awemeCurrentStory;
        Integer numCurrentIndex;
        Aweme aweme2;
        Integer numValueOf2;
        String aid2;
        Aweme awemeCurrentStory2;
        Aweme aweme3;
        Integer numValueOf3;
        String aid3;
        Aweme awemeCurrentStory3;
        C0RF0 c0rf0;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C690870R8b c690870R8bJm = jm();
        if (c690870R8bJm != null && (c0rf0 = c690870R8bJm.LIZLLL) != null && (baseFeedPageParams = c0rf0.LJ) != null && (c2189821An6 = baseFeedPageParams.param) != null && C1360340lVI.LIZ(c2189821An6)) {
            str2 = "v3.0";
        } else {
            str2 = null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2015881337) {
            if (iHashCode != 1431203431) {
                if (iHashCode == 1753337067 && str.equals("story_collection_play") && (aweme3 = this.LLLJL) != null) {
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    int count = lp().getCount();
                    int iGp = Gp();
                    String str3 = op().LJIIIZ;
                    String str4 = (String) this.LLLL.getValue();
                    c735840Sti.getClass();
                    for (String str5 : C1697810uHb.LJIILJJIL("story_collection_play")) {
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("author_id", C729510SjV.LJIIIZ(aweme3));
                        c0lab.LJ("story_collection_id", C729510SjV.LJII(aweme3));
                        c0lab.LIZ(count, "item_cnt");
                        c0lab.LIZ(iGp, "unread_item_cnt");
                        c0lab.LJ("enter_from", str3);
                        c0lab.LJ("enter_method", C735840Sti.LIZIZ);
                        c0lab.LJ("request_id", aweme3.getRequestId());
                        C735840Sti c735840Sti2 = C735840Sti.LIZ;
                        User author = aweme3.getAuthor();
                        c735840Sti2.getClass();
                        c0lab.LIZ(C735840Sti.LJIIIIZZ(author), "follow_status");
                        User author2 = aweme3.getAuthor();
                        if (author2 != null) {
                            numValueOf3 = Integer.valueOf(author2.getFollowStatusRelation());
                        } else {
                            numValueOf3 = null;
                        }
                        c0lab.LIZLLL(numValueOf3, "follow_status_relation");
                        c0lab.LJ("enter_position", str4);
                        UserStory userStory = aweme3.getUserStory();
                        if (userStory == null || (awemeCurrentStory3 = UserStoryKt.currentStory(userStory)) == null || (aid3 = awemeCurrentStory3.getAid()) == null) {
                            aid3 = "";
                        }
                        c0lab.LJ("group_id", aid3);
                        c0lab.LJ("story_type", "story");
                        if (str2 != null) {
                            c0lab.LJ("friends_tab_version", str2);
                        }
                        C20684815ws.LJIILLIIL(str5, c0lab.LIZ);
                    }
                    return;
                }
                return;
            }
            if (str.equals("story_collection_play_finish") && (aweme2 = this.LLLJL) != null) {
                C735840Sti c735840Sti3 = C735840Sti.LIZ;
                int count2 = lp().getCount();
                int iGp2 = Gp();
                String str6 = op().LJIIIZ;
                String str7 = (String) this.LLLL.getValue();
                c735840Sti3.getClass();
                for (String str8 : C1697810uHb.LJIILJJIL("story_collection_play_finish")) {
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LJ("story_collection_id", C729510SjV.LJII(aweme2));
                    c0lab2.LIZ(count2, "item_cnt");
                    c0lab2.LIZ(iGp2, "unread_item_cnt");
                    c0lab2.LJ("enter_from", str6);
                    c0lab2.LJ("enter_method", C735840Sti.LIZIZ);
                    c0lab2.LJ("author_id", C729510SjV.LJIIIZ(aweme2));
                    c0lab2.LJ("request_id", aweme2.getRequestId());
                    C735840Sti c735840Sti4 = C735840Sti.LIZ;
                    User author3 = aweme2.getAuthor();
                    c735840Sti4.getClass();
                    c0lab2.LIZ(C735840Sti.LJIIIIZZ(author3), "follow_status");
                    User author4 = aweme2.getAuthor();
                    if (author4 != null) {
                        numValueOf2 = Integer.valueOf(author4.getFollowStatusRelation());
                    } else {
                        numValueOf2 = null;
                    }
                    c0lab2.LIZLLL(numValueOf2, "follow_status_relation");
                    c0lab2.LJ("enter_position", str7);
                    UserStory userStory2 = aweme2.getUserStory();
                    if (userStory2 == null || (awemeCurrentStory2 = UserStoryKt.currentStory(userStory2)) == null || (aid2 = awemeCurrentStory2.getAid()) == null) {
                        aid2 = "";
                    }
                    c0lab2.LJ("group_id", aid2);
                    c0lab2.LJ("story_type", "story");
                    if (str2 != null) {
                        c0lab2.LJ("friends_tab_version", str2);
                    }
                    C20684815ws.LJIILLIIL(str8, c0lab2.LIZ);
                }
                return;
            }
            return;
        }
        if (str.equals("story_collection_play_end") && (aweme = this.LLLJL) != null) {
            C735840Sti c735840Sti5 = C735840Sti.LIZ;
            int count3 = lp().getCount();
            int iGp3 = Gp();
            String str9 = op().LJIIIZ;
            int size = this.LLLLII.size();
            String str10 = (String) this.LLLL.getValue();
            c735840Sti5.getClass();
            for (String str11 : C1697810uHb.LJIILJJIL("story_collection_play_end")) {
                C0LAB c0lab3 = new C0LAB();
                c0lab3.LJ("story_collection_id", C729510SjV.LJII(aweme));
                c0lab3.LIZ(count3, "item_cnt");
                c0lab3.LIZ(iGp3, "unread_item_cnt");
                c0lab3.LJ("enter_from", str9);
                c0lab3.LJ("author_id", C729510SjV.LJIIIZ(aweme));
                c0lab3.LJ("enter_method", C735840Sti.LIZIZ);
                c0lab3.LJ("request_id", aweme.getRequestId());
                C735840Sti c735840Sti6 = C735840Sti.LIZ;
                User author5 = aweme.getAuthor();
                c735840Sti6.getClass();
                c0lab3.LIZ(C735840Sti.LJIIIIZZ(author5), "follow_status");
                User author6 = aweme.getAuthor();
                if (author6 != null) {
                    numValueOf = Integer.valueOf(author6.getFollowStatusRelation());
                } else {
                    numValueOf = null;
                }
                c0lab3.LIZLLL(numValueOf, "follow_status_relation");
                UserStory userStory3 = aweme.getUserStory();
                if (userStory3 != null) {
                    currentPosition = (int) userStory3.getCurrentPosition();
                } else {
                    currentPosition = 0;
                }
                c0lab3.LIZ(currentPosition, "story_start_num");
                UserStory userStory4 = aweme.getUserStory();
                if (userStory4 != null && (numCurrentIndex = UserStoryKt.currentIndex(userStory4)) != null) {
                    iIntValue = numCurrentIndex.intValue();
                } else {
                    iIntValue = 0;
                }
                c0lab3.LIZ(iIntValue, "story_current_num");
                UserStory userStory5 = aweme.getUserStory();
                if (userStory5 == null || (awemeCurrentStory = UserStoryKt.currentStory(userStory5)) == null || (aid = awemeCurrentStory.getAid()) == null) {
                    aid = "";
                }
                c0lab3.LJ("group_id", aid);
                c0lab3.LIZ(size, "read_cnt");
                c0lab3.LJ("enter_position", str10);
                c0lab3.LJ("story_type", "story");
                if (str2 != null) {
                    c0lab3.LJ("friends_tab_version", str2);
                }
                C20684815ws.LJIILLIIL(str11, c0lab3.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent
    public final C0RQI hp(int i) {
        Aweme item;
        Story story;
        if (i >= 0 && i < lp().getCount() && (item = lp().getItem(i)) != null && (story = item.getStory()) != null && story.isPublishing()) {
            return C0RQI.LOOP_CURRENT_VIDEO;
        }
        return C1618440sDa.LIZIZ.LJJIIJ().LIZLLL(op().LJIIIZ, op().LJ.param.getFrom());
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility
    public final void jd2(String str) {
        UserStory userStory;
        Iterator<Aweme> it2 = lp().LJJJLZIJ().iterator();
        while (it2.hasNext() && !Intrinsics.LJFF(it2.next().getAid(), str)) {
        }
        if (StoryFeedViewModel.FQ2(Ip(), this.LLJL, str) < 0) {
            List<Aweme> listLJJJLZIJ = lp().LJJJLZIJ();
            Iterator<Aweme> it3 = listLJJJLZIJ.iterator();
            int i = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next().getAid(), str)) {
                    if (i >= 0) {
                        ListProtector.remove(listLJJJLZIJ, i);
                    } else {
                        return;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        InterfaceC1618460sDc interfaceC1618460sDc = (InterfaceC1618460sDc) this.LLLLIIL.getValue();
        if (interfaceC1618460sDc != null) {
            interfaceC1618460sDc.LJIIJJI(str);
        }
        UserStory userStory2 = this.LLLJIL;
        if ((userStory2 == null || !C729510SjV.LJIIJJI(userStory2, !Ip().SQ2())) && !Intrinsics.LJFF(Ip().LLIZLLLIL.getFrom(), "STORY_ENTRANCE_DEFAULT")) {
            Aweme aweme = (Aweme) ((LinkedHashMap) Ip().LLJILJIL).get(this.LLJL);
            if (aweme == null || (userStory = aweme.getUserStory()) == null || !C729510SjV.LJIIJJI(userStory, !Ip().SQ2())) {
                Wp(this, null, 1);
                Jp(this, mp().getCurrentItem(), true, "onAwemeDelete", false, 8);
                return;
            }
        }
        UserFeedViewPagerAbility userFeedViewPagerAbility = (UserFeedViewPagerAbility) this.LLLIIIL.getValue();
        if (userFeedViewPagerAbility != null && userFeedViewPagerAbility.ix(this.LLJLIL) > 0) {
            return;
        }
        Tp(EnumC712090RwV.ON_DELETE_COLLECTION, new C712000RwM(this.LLJLLIL));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String authorUid;
        String strZc;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct anchorCommonStruct;
        UrlModel thumbnail;
        String strCY1;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        int currentItem;
        UserStoryCurrentInfo currentInfo;
        Integer num;
        Object obj;
        UserStory userStory;
        CollectionVHAbility collectionVHAbilityIp;
        String str2;
        StoryHighlightInfo storyHighlightInfo2;
        Aweme aweme;
        List<Aweme> stories;
        Aweme aweme2;
        StoryHighlightInfo storyHighlightInfo3;
        StoryHighlightCollection storyHighlightCollection2;
        List<Aweme> stories2;
        Aweme aweme3;
        StoryHighlightInfo storyHighlightInfo4;
        StoryHighlightCollection storyHighlightCollection3;
        C0RD4 c0rd42 = c0rd4;
        Aweme aweme4 = this.LLLJL;
        if (aweme4 != null) {
            String str3 = c0rd42.LIZ;
            String strCY12 = null;
            str = null;
            str = null;
            str = null;
            str = null;
            String str4 = null;
            Object obj2 = null;
            switch (str3.hashCode()) {
                case -1671541218:
                    if (!str3.equals("ON_NEW_STORY_AWEME")) {
                        return;
                    }
                    Object obj3 = c0rd42.LIZIZ;
                    if (obj3 == null) {
                        obj3 = null;
                    }
                    UserStory userStory2 = (UserStory) obj3;
                    int currentPosition = (int) userStory2.getCurrentPosition();
                    Aweme aweme5 = (Aweme) C13LP.LJJJLZIJ(0, userStory2.getStories());
                    if (aweme5 != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme5);
                    } else {
                        authorUid = null;
                    }
                    if (!Intrinsics.LJFF(authorUid, AwemeExtKt.getAuthorUid(aweme4))) {
                        return;
                    }
                    List<Aweme> stories3 = userStory2.getStories();
                    ArrayList<Pair> arrayList = new ArrayList(C15438062q.LJIJJ(stories3, 10));
                    int i = 0;
                    for (Aweme aweme6 : stories3) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            arrayList.add(new Pair(aweme6, Integer.valueOf(i + currentPosition)));
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    String str5 = this.LLJLIL;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLLIIL.getValue();
                    if (iFeedPanelPlatformAbility != null) {
                        strCY12 = iFeedPanelPlatformAbility.cY1();
                    }
                    String str6 = "";
                    String strLIZ = C712830Rxh.LIZ(strCY12, (String) this.LLLL.getValue(), "");
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LLLIIL.getValue();
                    if (iFeedPanelPlatformAbility2 == null || (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility2.x32()) == null || (strZc = iPlayerComponentAbilityX32.Zc()) == null) {
                        strZc = "";
                    }
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility3 = (IFeedPanelPlatformAbility) this.LLLIIL.getValue();
                    if (iFeedPanelPlatformAbility3 != null && (strCY1 = iFeedPanelPlatformAbility3.cY1()) != null) {
                        str6 = strCY1;
                    }
                    boolean zLIZ = C287410BOh.LIZ();
                    LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
                    if (!C1256140inE.LIZ(arrayList) && C1474810oTv.LLJJIJIIJIL()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Pair pair : arrayList) {
                            Aweme aweme7 = (Aweme) pair.first;
                            int iIntValue = ((Integer) pair.second).intValue();
                            if (C1483340ohg.LJIJJLI(aweme7) || ((Number) C259710AFt.LIZ.getValue()).intValue() != 0) {
                                SimVideoUrlModel simVideoUrlModelLJI = C1483340ohg.LJI(aweme7, strZc, str6);
                                if (simVideoUrlModelLJI != null) {
                                    simVideoUrlModelLJI.setFirstSubMediaId(str5);
                                    simVideoUrlModelLJI.setHVideoIndex(iIntValue);
                                    arrayList2.add(simVideoUrlModelLJI);
                                }
                            }
                        }
                        C1478160oZK.LIZ().LJIJ(strLIZ, arrayList2, false, false);
                        if (zLIZ) {
                            C1483390ohl.LIZ().LIZJ().LIZ(strLIZ, false, arrayList2);
                        }
                    }
                    C712080RwU c712080RwU = new Object() { // from class: X.0RwU
                    };
                    Context context = getContext();
                    C0RF0 c0rf0Op = op();
                    c712080RwU.getClass();
                    if (C0B0W.LIZ() && ((Number) C1245204u2.LIZ.getValue()).intValue() > 0) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Aweme aweme8 = (Aweme) ((Pair) it2.next()).first;
                            if (aweme8 != null) {
                                int i3 = StoryUseThisEffectComponent.LLLFZ;
                                if (C0S21.LIZ(aweme8) && (anchors = aweme8.getAnchors()) != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors)) != null && (thumbnail = anchorCommonStruct.getThumbnail()) != null) {
                                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(thumbnail));
                                    c1331670kl3LJIIIIZZ.LJJIJL(context);
                                    c1331670kl3LJIIIIZZ.LJJIII();
                                }
                            }
                        }
                    }
                    if (!C0B0W.LIZ() || !C298520Bn0.LIZ() || !Intrinsics.LJFF(c0rf0Op.LJ.param.getFrom(), "STORY_ENTRANCE_INBOX_TOP_LIST")) {
                        return;
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Aweme aweme9 = (Aweme) ((Pair) it3.next()).first;
                        if (aweme9 != null && C694840RNi.LIZIZ(aweme9) && (storyHighlightInfo = aweme9.storyHighlightInfo) != null && (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) != null && (urlModel = storyHighlightCollection.collectionCoverUrl) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                            c1331670kl3LJIIIIZZ2.LJJIJL(context);
                            c1331670kl3LJIIIIZZ2.LJJIII();
                        }
                    }
                    return;
                case 291667849:
                    if (!str3.equals("ON_CURRENT_INFO_CHANGED")) {
                        return;
                    }
                    Object obj4 = c0rd42.LIZIZ;
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    UserStory userStory3 = (UserStory) obj4;
                    if (!Intrinsics.LJFF(aweme4.getUserStory(), userStory3)) {
                        return;
                    }
                    this.LLLJIL = userStory3;
                    Integer numBp = Bp(lp().LJJJLZIJ());
                    if (numBp != null) {
                        currentItem = numBp.intValue();
                    } else if (userStory3 != null && (currentInfo = userStory3.getCurrentInfo()) != null && (num = currentInfo.currentIndex) != null) {
                        currentItem = num.intValue();
                    } else {
                        currentItem = mp().getCurrentItem();
                    }
                    if (lp().getCount() > 0) {
                        M32(C13LZ.LJ(currentItem, 0, lp().getCount() - 1), "auto", null);
                    }
                    Ip().dR2(mp().getCurrentItem(), this.LLJL, 5, this.LLJLIL);
                    return;
                case 1211050238:
                    if (!str3.equals("LOAD_USER_STORY_SUCCESS")) {
                        return;
                    }
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    if (C729510SjV.LJIILJJIL(AwemeExtKt.getAuthorUid(((VideoItemParams) obj).getAweme())) && ((Boolean) this.LLLILZLLLI.getValue()).booleanValue()) {
                        Aweme aweme10 = (Aweme) ((LinkedHashMap) Ip().LLJILJIL).get(this.LLJL);
                        if (aweme10 == null || (userStory = aweme10.getUserStory()) == null) {
                            return;
                        }
                    } else {
                        Object obj5 = c0rd42.LIZIZ;
                        if (obj5 != null) {
                            obj2 = obj5;
                        }
                        userStory = (UserStory) obj2;
                    }
                    if (!Intrinsics.LJFF(aweme4.getUserStory(), userStory)) {
                        return;
                    }
                    this.LLLJIL = userStory;
                    if (C729510SjV.LJIIJJI(userStory, !Ip().SQ2())) {
                        Tp(EnumC712090RwV.ON_DELETE_COLLECTION, new C712000RwM(this.LLJLLIL));
                        return;
                    }
                    lp().getItem(mp().getCurrentItem());
                    Wp(this, userStory.getCurrentInfo(), 2);
                    if (this.LLJLLL) {
                        Jp(this, mp().getCurrentItem(), true, "onDataUpdate", false, 8);
                    } else {
                        Jp(this, mp().getCurrentItem(), false, "onDataUpdate", false, 8);
                    }
                    Aweme item = lp().getItem(mp().getCurrentItem());
                    if (item != null && (collectionVHAbilityIp = ip()) != null) {
                        collectionVHAbilityIp.xO2(new C693050RGl(item, mp().getCurrentItem()));
                    }
                    Ip().dR2(mp().getCurrentItem(), this.LLJL, 5, this.LLJLIL);
                    return;
                case 1583383861:
                    if (!str3.equals("ON_STORY_HIGHLIGHTS_DATA_CHANGED")) {
                        return;
                    }
                    Object obj6 = c0rd42.LIZIZ;
                    if (obj6 == null) {
                        obj6 = null;
                    }
                    UserStory userStory4 = (UserStory) obj6;
                    UserStory userStory5 = this.LLLJIL;
                    if (userStory5 != null && (stories2 = userStory5.getStories()) != null && (aweme3 = (Aweme) C13LP.LJJJLL(stories2)) != null && (storyHighlightInfo4 = aweme3.storyHighlightInfo) != null && (storyHighlightCollection3 = storyHighlightInfo4.containerCollectionInfo) != null) {
                        str2 = storyHighlightCollection3.collectionId;
                    } else {
                        str2 = null;
                    }
                    if (userStory4 != null && (stories = userStory4.getStories()) != null && (aweme2 = (Aweme) C13LP.LJJJLL(stories)) != null && (storyHighlightInfo3 = aweme2.storyHighlightInfo) != null && (storyHighlightCollection2 = storyHighlightInfo3.containerCollectionInfo) != null) {
                        str4 = storyHighlightCollection2.collectionId;
                    }
                    if (!Intrinsics.LJFF(str2, str4)) {
                        return;
                    }
                    Aweme aweme11 = this.LLLJL;
                    if (aweme11 != null) {
                        aweme11.setUserStory(userStory4);
                    }
                    this.LLLJIL = userStory4;
                    Aweme aweme12 = (Aweme) ((LinkedHashMap) Ip().LLJILJIL).get(this.LLJL);
                    if (aweme12 != null && (storyHighlightInfo2 = aweme12.storyHighlightInfo) != null && (aweme = this.LLLJL) != null) {
                        aweme.storyHighlightInfo = storyHighlightInfo2;
                    }
                    if (C729510SjV.LJIIJJI(userStory4, !Ip().SQ2())) {
                        Tp(EnumC712090RwV.ON_DELETE_COLLECTION, new C712000RwM(this.LLJLLIL));
                        return;
                    }
                    lp().getItem(mp().getCurrentItem());
                    Wp(this, userStory4.getCurrentInfo(), 2);
                    if (this.LLJLLL) {
                        Jp(this, mp().getCurrentItem(), true, "onStoryHighlightsDataChanged", false, 8);
                    }
                    Ip().dR2(mp().getCurrentItem(), this.LLJL, 5, this.LLJLIL);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent
    public final void onPlayCompleted(String str) {
        Object obj;
        FeedCollectionProgressBarAbility feedCollectionProgressBarAbilitySp;
        super.onPlayCompleted(str);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!C582980Mtk.LIZIZ(((VideoItemParams) obj).getAweme()) && (feedCollectionProgressBarAbilitySp = sp()) != null) {
            feedCollectionProgressBarAbilitySp.aF1(1.0f, mp().getCurrentItem(), 300L);
        }
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
        if (iAutoAScrollAbilityLIZIZ != null) {
            iAutoAScrollAbilityLIZIZ.OE(mp().getCurrentItem(), lp().getCount());
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        }
        if (!C582980Mtk.LIZIZ(((VideoItemParams) obj2).getAweme())) {
            Ap();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        StoryFeedViewModel storyFeedViewModelIp = Ip();
        storyFeedViewModelIp.yQ2("LOAD_USER_STORY_SUCCESS", this, false);
        storyFeedViewModelIp.yQ2("ON_STORY_HIGHLIGHTS_DATA_CHANGED", this, false);
        storyFeedViewModelIp.yQ2("ON_NEW_STORY_AWEME", this, false);
        storyFeedViewModelIp.yQ2("ON_CURRENT_INFO_CHANGED", this, false);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0RnH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 48), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0RoB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 49), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLLLIILLL.getValue(), new C2217381BqS() { // from class: X.0RwP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C230500ul) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 50), 4);
        if (!op().LIZJ.isDetached() && ((Number) C103000aC.LIZ.getValue()).intValue() != 1) {
            String str = op().LJ.param.getExtra().get("story_extra_cell_preload_type");
            if (C123100dR.LIZ(str) && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                HandlerHook.viewPost(mp(), new ARunnableS111S0100000_11(this, 48));
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        String nickname;
        VideoItemParams videoItemParams2 = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind, this = ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", nickName = ");
        User author = videoItemParams2.getAweme().getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C729510SjV.LJJIIZ(videoItemParams2.getAweme())) {
            this.LLJJLIIIJLLLLLLLZ = null;
            this.LLJLLIL = videoItemParams2.currentPosition;
            Es0(hp(-1));
            this.LLLLII.clear();
            UserStory userStory = videoItemParams2.getAweme().getUserStory();
            if (userStory != null) {
                this.LLLJIL = userStory;
                this.LLJL = Ip().LQ2(videoItemParams2.getAweme());
                StoryFeedViewModel storyFeedViewModelIp = Ip();
                Aweme aweme = videoItemParams2.getAweme();
                storyFeedViewModelIp.getClass();
                this.LLJLIL = StoryFeedViewModel.MQ2(aweme);
                Ip().cR2(videoItemParams2.getAweme(), this.LLJL, this.LLJLIL);
                this.LLLJL = videoItemParams2.getAweme();
                D61();
                StoryCollectionVHCompatAbility storyCollectionVHCompatAbility = (StoryCollectionVHCompatAbility) this.LLLILZJ.getValue();
                if (storyCollectionVHCompatAbility != null) {
                    storyCollectionVHCompatAbility.vu0();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final void xd0(Map<String, ? extends Aweme> map) {
        List<Aweme> listLJJJLZIJ = lp().LJJJLZIJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJLZIJ, 10));
        for (Aweme aweme : listLJJJLZIJ) {
            Object obj = ((LinkedHashMap) map).get(aweme.getAid());
            if (obj != null) {
                aweme = obj;
            }
            arrayList.add(aweme);
        }
        lp().setData(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        if (((Boolean) this.LLLILZLLLI.getValue()).booleanValue()) {
            return;
        }
        super.J1(i, aweme);
        Qp();
    }

    public final void Tp(EnumC712090RwV enumC712090RwV, InterfaceC693060RGm interfaceC693060RGm) {
        op().LIZIZ.LLIIL(new C737030Svd(60, new C0RSY(enumC712090RwV, interfaceC693060RGm)));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent, com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility
    public final void ee1(int i, Aweme aweme) {
        zp(i);
        Qp();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionViewPagerAbility
    public final void onPageSelected(int i, boolean z) {
        Jp(this, i, false, "onPublishSuccess", false, 24);
    }

    public static void Wp(StoryCollectionViewPagerComponent storyCollectionViewPagerComponent, UserStoryCurrentInfo userStoryCurrentInfo, int i) {
        boolean z;
        int currentItem;
        if ((i & 1) != 0) {
            userStoryCurrentInfo = null;
        }
        int iIntValue = 0;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        List<Aweme> listNQ2 = storyCollectionViewPagerComponent.Ip().NQ2(storyCollectionViewPagerComponent.LLJL, storyCollectionViewPagerComponent.LLJLIL, false);
        if (listNQ2 != null) {
            if (z && Intrinsics.LJFF(storyCollectionViewPagerComponent.LLJLIL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                currentItem = storyCollectionViewPagerComponent.Ip().JQ2(storyCollectionViewPagerComponent.LLJL, storyCollectionViewPagerComponent.LLJLIL, listNQ2);
            } else {
                currentItem = storyCollectionViewPagerComponent.mp().getCurrentItem();
            }
            storyCollectionViewPagerComponent.lp().setData(listNQ2);
            FeedCollectionProgressBarAbility feedCollectionProgressBarAbilitySp = storyCollectionViewPagerComponent.sp();
            if (feedCollectionProgressBarAbilitySp != null) {
                feedCollectionProgressBarAbilitySp.T90(((ArrayList) listNQ2).size());
            }
            ArrayList arrayList = (ArrayList) listNQ2;
            if (arrayList.size() != 0) {
                Integer numBp = storyCollectionViewPagerComponent.Bp(listNQ2);
                if (numBp != null) {
                    currentItem = numBp.intValue();
                    storyCollectionViewPagerComponent.M32(currentItem, "auto", Boolean.FALSE);
                } else if (userStoryCurrentInfo != null && userStoryCurrentInfo.currentIndex != null) {
                    Integer num = userStoryCurrentInfo.currentIndex;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    if (iIntValue < arrayList.size() && iIntValue >= 0) {
                        storyCollectionViewPagerComponent.M32(iIntValue, "auto", Boolean.FALSE);
                        currentItem = iIntValue;
                    } else {
                        currentItem = arrayList.size() - 1;
                        storyCollectionViewPagerComponent.M32(currentItem, "auto", Boolean.FALSE);
                    }
                } else if (currentItem < arrayList.size() && currentItem >= 0) {
                    storyCollectionViewPagerComponent.M32(currentItem, "auto", Boolean.FALSE);
                } else {
                    currentItem = arrayList.size() - 1;
                    storyCollectionViewPagerComponent.M32(currentItem, "auto", Boolean.FALSE);
                }
                C727100Sfc c727100Sfc = storyCollectionViewPagerComponent.Ip().LLJJIII;
                String str = storyCollectionViewPagerComponent.LLJL;
                String str2 = storyCollectionViewPagerComponent.LLJLIL;
                UserStory userStory = storyCollectionViewPagerComponent.LLLJIL;
                Integer numValueOf = Integer.valueOf(currentItem);
                Aweme aweme = (Aweme) ListProtector.get(listNQ2, currentItem);
                c727100Sfc.getClass();
                C727100Sfc.LIZIZ(str, str2, userStory, numValueOf, aweme, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Jp(com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent r21, int r22, boolean r23, java.lang.String r24, boolean r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent.Jp(com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryCollectionViewPagerComponent, int, boolean, java.lang.String, boolean, int):void");
    }
}
