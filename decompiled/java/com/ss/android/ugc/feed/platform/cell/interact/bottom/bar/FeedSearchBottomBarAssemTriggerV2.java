package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C03H5;
import X.C0PM7;
import X.C0Q3E;
import X.C1200530hLX;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1ER1;
import X.C20556615cC;
import X.C20684815ws;
import X.C2189821An6;
import X.C2344009Gk;
import X.C452501pT;
import X.C688460QzU;
import X.C688480QzW;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC688550Qzd;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS153S0110000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedSearchBottomBarAssemTriggerV2 extends BaseCellTriggerComponent<FeedSearchBottomBarAssemTriggerV2> implements BottomBarPriorityProtocol {
    public static final /* synthetic */ int LLJLIL = 0;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 916));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 915));

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_search_rs";
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(FeedSearchBottomBarAssemV2.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_banner_search_rs";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        if (!C20556615cC.LJII) {
            return new C700450Rdj(new AwS624S0100000_10(this, 90), null, null, 4);
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJL.getValue();
        return new C700450Rdj(new AwS153S0110000_10(cellAdaptionComponentAbility != null ? cellAdaptionComponentAbility.ZY1(false) : false, this, 1), null, null, 4);
    }

    public final void zp() {
        String tabName;
        C2189821An6 c2189821An6;
        String tabName2;
        C2189821An6 c2189821An62;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams.getAweme() == null) {
            return;
        }
        C688480QzW c688480QzWLIZIZ = C688460QzU.LIZIZ(0, videoItemParams);
        yp(EnumC688550Qzd.AFTER_AWEME_CHECK, c688480QzWLIZIZ.LIZ.length() == 0, 0);
        if (c688480QzWLIZIZ.LIZ.length() == 0) {
            return;
        }
        yp(EnumC688550Qzd.AFTER_KEYWORD_CHECK, false, 0);
        if (C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends").contains(videoItemParams.mEventType)) {
            C1ER1.LIZIZ.LLLLLIL(videoItemParams.getAweme().getGroupId(), videoItemParams.getAweme().getAid());
        }
        String str = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL;
        if (Intrinsics.LJFF("1", c688480QzWLIZIZ.LJ)) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Aweme aweme = videoItemParams.getAweme();
            String str2 = videoItemParams.mEventType;
            String str3 = c688480QzWLIZIZ.LIZIZ;
            String str4 = c688480QzWLIZIZ.LIZ;
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams == null || (c2189821An62 = baseFeedPageParams.param) == null || (tabName2 = c2189821An62.getTabName()) == null) {
                tabName2 = "";
            }
            String strValueOf = String.valueOf(0);
            String groupId = videoItemParams.getAweme().getGroupId();
            c1er1.LJJLIIIJ(aweme, null, str2, str3, str4, tabName2, strValueOf, groupId != null ? groupId : "", str, "");
            return;
        }
        C1ER1 c1er12 = C1ER1.LIZIZ;
        Aweme aweme2 = videoItemParams.getAweme();
        String str5 = videoItemParams.mEventType;
        String str6 = c688480QzWLIZIZ.LIZIZ;
        String str7 = c688480QzWLIZIZ.LIZ;
        BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams2 == null || (c2189821An6 = baseFeedPageParams2.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        String strValueOf2 = String.valueOf(0);
        String groupId2 = videoItemParams.getAweme().getGroupId();
        String str8 = groupId2 != null ? groupId2 : "";
        PromotionInfo promotionInfo = c688480QzWLIZIZ.LIZLLL;
        String str9 = c688480QzWLIZIZ.LJFF;
        String strLIZLLL = C1200530hLX.LIZLLL(Boolean.valueOf(c688480QzWLIZIZ.LIZ()));
        if (strLIZLLL == null) {
            strLIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        c1er12.LLLLLLZ(aweme2, str5, str6, str7, tabName, CardStruct.IStatusCode.DEFAULT, strValueOf2, str8, str, promotionInfo, str9, strLIZLLL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "related_search_anchor_v2");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        FeedBarSearchAbility feedBarSearchAbility = (FeedBarSearchAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FeedBarSearchAbility.class, null);
        if (feedBarSearchAbility != null) {
            feedBarSearchAbility.pw2();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new AwS589S0100000_10(this, videoItemParams, 373));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        return C688460QzU.LIZ(videoItemParams, C688460QzU.LIZIZ(0, videoItemParams));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme();
        System.currentTimeMillis();
    }

    public final void yp(EnumC688550Qzd enumC688550Qzd, boolean z, int i) {
        boolean z2;
        Object obj;
        String str;
        View viewFindViewById = LJJIJL().findViewById(R.id.ht1);
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("component_key", "bottom_banner_search_rs");
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) obj).mEventType);
        c2344009Gk.LJIIIIZZ("log_scene", enumC688550Qzd.getValue());
        c2344009Gk.LJ(Boolean.valueOf(z), "is_keyword_empty");
        c2344009Gk.LIZJ(i, "word_rank");
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_container_visible", str);
        C20684815ws.LJIILLIIL("search_banner_feed_bar_show", c2344009Gk.LIZ);
    }
}
