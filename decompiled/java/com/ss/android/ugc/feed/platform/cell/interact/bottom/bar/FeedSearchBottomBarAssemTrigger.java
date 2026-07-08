package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C03H5;
import X.C0PEM;
import X.C0PM7;
import X.C0Q3E;
import X.C0QCK;
import X.C0QFY;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1AV3;
import X.C1EE1;
import X.C1ER1;
import X.C20556615cC;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C301480Brm;
import X.C452501pT;
import X.C631370Opb;
import X.C687700QyG;
import X.C688170Qz1;
import X.C688190Qz3;
import X.C688250Qz9;
import X.C688270QzB;
import X.C688570Qzf;
import X.C688580Qzg;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724270Sb3;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS153S0110000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedSearchBottomBarAssemTrigger extends BaseCellTriggerComponent<FeedSearchBottomBarAssemTrigger> implements BottomBarPriorityProtocol, InterfaceC700000Rd0, InterfaceC1146704e9 {
    public static final C688170Qz1 LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public C688190Qz3 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new C688570Qzf(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C688580Qzg(this));
    public final C0QCK LLJLILLLLZIIL = new C0QCK(FeedBarSearchAbility.class);
    public Boolean LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSearchBottomBarAssemTrigger.class, "feedBarSearchFixAbility", "getFeedBarSearchFixAbility()Ltiktok/communication/LazyAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLLIL = new C688170Qz1();
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_search_rs";
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLJLL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnselected aid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        sbLIZ.append(" keyword=");
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        sbLIZ.append(c688190Qz3 != null ? c688190Qz3.LIZJ : null);
        sbLIZ.append(" getItemPosition=");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        FeedBarSearchAbility feedBarSearchAbilityZp = zp();
        if (feedBarSearchAbilityZp != null) {
            feedBarSearchAbilityZp.TD();
        }
        FeedBarSearchAbility feedBarSearchAbilityZp2 = zp();
        if (feedBarSearchAbilityZp2 != null) {
            feedBarSearchAbilityZp2.g2();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(FeedSearchBottomBarAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_banner_search_rs";
    }

    public final void Ap() {
        String tabName;
        C2189821An6 c2189821An6;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams.getAweme() == null) {
            return;
        }
        FeedBarSearchAbility feedBarSearchAbilityZp = zp();
        int iYY0 = feedBarSearchAbilityZp != null ? feedBarSearchAbilityZp.YY0() : 0;
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz3 != null) {
            c688190Qz3.LIZLLL(iYY0);
        }
        C688190Qz3 c688190Qz3LIZ = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz3LIZ == null) {
            LLJLLIL.getClass();
            c688190Qz3LIZ = C688170Qz1.LIZ(iYY0, videoItemParams.getAweme());
        }
        if (c688190Qz3LIZ.LIZJ.length() == 0) {
            return;
        }
        if (C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends").contains(videoItemParams.mEventType)) {
            C1ER1.LIZIZ.LLLLLIL(videoItemParams.getAweme().getGroupId(), videoItemParams.getAweme().getAid());
        }
        String str = ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL;
        if (Intrinsics.LJFF("1", c688190Qz3LIZ.LJI)) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            Aweme aweme = videoItemParams.getAweme();
            String str2 = videoItemParams.mEventType;
            String str3 = c688190Qz3LIZ.LIZLLL;
            String str4 = c688190Qz3LIZ.LIZJ;
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                tabName = "";
            }
            String groupId = videoItemParams.getAweme().getGroupId();
            c1er1.LJJLIIIJ(aweme, Integer.valueOf(videoItemParams.mPageType), str2, str3, str4, tabName, CardStruct.IStatusCode.DEFAULT, groupId != null ? groupId : "", str, CardStruct.IStatusCode.DEFAULT);
            return;
        }
        FeedBarSearchAbility feedBarSearchAbilityZp2 = zp();
        C688270QzB c688270QzBVx = feedBarSearchAbilityZp2 != null ? feedBarSearchAbilityZp2.Vx() : null;
        Boolean bool = c688190Qz3LIZ.LJIIJJI;
        Integer numValueOf = bool != null ? Integer.valueOf(!Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0) : null;
        FeedBarSearchAbility feedBarSearchAbilityZp3 = zp();
        boolean z = feedBarSearchAbilityZp3 != null && feedBarSearchAbilityZp3.u62();
        FeedBarSearchAbility feedBarSearchAbilityZp4 = zp();
        C0QFY c0qfyCc1 = feedBarSearchAbilityZp4 != null ? feedBarSearchAbilityZp4.Cc1() : null;
        FeedBarSearchAbility feedBarSearchAbilityZp5 = zp();
        if (feedBarSearchAbilityZp5 != null) {
            feedBarSearchAbilityZp5.IE1();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C688250Qz9(null, c688270QzBVx, videoItemParams, c688190Qz3LIZ, str, iYY0, numValueOf, videoItemParams, this, c0qfyCc1, z), 3);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        if (!C20556615cC.LJII) {
            return new C700450Rdj(new AwS624S0100000_10(this, 88), new AwS624S0100000_10(this, 89), new AwS554S0100000_10(this, 914));
        }
        CellAdaptionComponentAbility cellAdaptionComponentAbility = (CellAdaptionComponentAbility) this.LLJLIL.getValue();
        return new C700450Rdj(new AwS153S0110000_10(cellAdaptionComponentAbility != null ? cellAdaptionComponentAbility.ZY1(false) : false, this, 0), null, null, 4);
    }

    public final Map<String, String> yp() {
        String str;
        WordStruct wordStruct;
        Word wordRecord;
        String wordsLabel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        String str2 = "";
        if (c688190Qz3 == null || (str = c688190Qz3.LIZJ) == null) {
            str = "";
        }
        linkedHashMap.put("query_name", str);
        C688190Qz3 c688190Qz32 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz32 != null && (wordStruct = c688190Qz32.LIZIZ) != null && (wordRecord = wordStruct.getWordRecord()) != null && (wordsLabel = wordRecord.getWordsLabel()) != null) {
            str2 = wordsLabel;
        }
        linkedHashMap.put("banner_type", str2);
        return linkedHashMap;
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    public final FeedBarSearchAbility zp() {
        return (FeedBarSearchAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FeedBarSearchAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderResume aid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        String str = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(((VideoItemParams) obj).getAweme().getAid());
        sbLIZ.append(" keyword=");
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz3 != null) {
            str = c688190Qz3.LIZJ;
        }
        sbLIZ.append(str);
        sbLIZ.append(" getItemPosition=");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        FeedBarSearchAbility feedBarSearchAbilityZp = zp();
        if (feedBarSearchAbilityZp != null) {
            feedBarSearchAbilityZp.LLLI(i);
        }
        FeedBarSearchAbility feedBarSearchAbilityZp2 = zp();
        if (feedBarSearchAbilityZp2 != null) {
            feedBarSearchAbilityZp2.pw2();
        }
    }

    @Override // X.InterfaceC700000Rd0
    public final void l0(boolean z) {
        Object obj;
        Object obj2;
        String aid;
        Object obj3;
        Object obj4;
        String str = null;
        if (Intrinsics.LJFF(this.LLJLL, Boolean.TRUE)) {
            this.LLJLL = Boolean.FALSE;
            if (C301480Brm.LIZ() && z) {
                C688170Qz1 c688170Qz1 = LLJLLIL;
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj3 = c724270Sb3.LL;
                } else {
                    obj3 = null;
                }
                Aweme aweme = ((VideoItemParams) obj3).getAweme();
                c688170Qz1.getClass();
                C688190Qz3 c688190Qz3LIZ = C688170Qz1.LIZ(0, aweme);
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                } else {
                    obj4 = null;
                }
                if (C688170Qz1.LIZIZ(c688190Qz3LIZ, ((VideoItemParams) obj4).getAweme())) {
                    C0QCK c0qck = this.LLJLILLLLZIIL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
                    c0qck.LIZ(this).LIZIZ(this, new AwS589S0100000_10(this, 372));
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPolicyResult isWin=");
        sbLIZ.append(z);
        sbLIZ.append(" position=");
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj = c724270Sb33.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(((VideoItemParams) obj).currentPosition);
        sbLIZ.append(" aid=");
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj2 = c724270Sb34.LL;
        } else {
            obj2 = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" feedBarSearchAbility=");
        sbLIZ.append(zp());
        sbLIZ.append(" keyword=");
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz3 != null) {
            str = c688190Qz3.LIZJ;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSearchBottomBarAssemTrigger-onBind aid=");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        sbLIZ.append(" keyword=");
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz3 != null) {
            str = c688190Qz3.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" getItemPosition=");
        sbLIZ.append(C631370Opb.LIZIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        C2180521AVm.LIZLLL(LJJIJL(), 8, C1AV3.LIZ(1, "Search", null, "bottombar"));
        if (!C1EE1.LIZIZ.LJJIJLIJ(videoItemParams.getAweme(), videoItemParams.mEventType) && lp(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJL.getValue()) != null) {
            priorityAbility.MJ(this, new AwS589S0100000_10(this, videoItemParams, 371));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if (C1EE1.LIZIZ.LJJIJLIJ(videoItemParams.getAweme(), videoItemParams.mEventType)) {
            return false;
        }
        C688190Qz3 c688190Qz3LIZJ = C688170Qz1.LIZJ(LLJLLIL, videoItemParams);
        this.LLJJLIIIJLLLLLLLZ = c688190Qz3LIZJ;
        return C688170Qz1.LIZIZ(c688190Qz3LIZJ, videoItemParams.getAweme());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        String aid;
        this.LLJLL = Boolean.TRUE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelected-Trigger position=");
        sbLIZ.append(i);
        sbLIZ.append(" aid=");
        String str = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" feedBarSearchAbility=");
        sbLIZ.append(zp());
        sbLIZ.append(" keyword=");
        C688190Qz3 c688190Qz3 = this.LLJJLIIIJLLLLLLLZ;
        if (c688190Qz3 != null) {
            str = c688190Qz3.LIZJ;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        FeedBarSearchAbility feedBarSearchAbilityZp = zp();
        if (feedBarSearchAbilityZp != null) {
            feedBarSearchAbilityZp.J1(i, aweme);
        }
    }
}
