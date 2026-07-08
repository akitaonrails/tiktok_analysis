package kotlin.jvm.internal;

import X.AbstractC316870CbV;
import X.AnonymousClass0956;
import X.C09AY;
import X.C1210090hax;
import X.C1326850kdH;
import X.C1556460qbc;
import X.C1558520qew;
import X.C1561210qjH;
import X.C1563970qnj;
import X.C1564050qnr;
import X.C1569250qwF;
import X.C1595220rc8;
import X.C1596360rdy;
import X.C1618440sDa;
import X.C1720106oR;
import X.C19719612Di;
import X.C19EG;
import X.C20684815ws;
import X.C2097908Jt;
import X.C21202017y6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C2341109Fh;
import X.C2344809Gs;
import X.C496601wa;
import X.C496701wb;
import X.EnumC1260930iux;
import X.EnumC20538815Yk;
import X.InterfaceC1594910rbd;
import X.InterfaceC1595240rcA;
import X.InterfaceC1597970rgZ;
import X.InterfaceC1891350zJl;
import Y.ARunnableS112S0100000_12;
import android.util.LruCache;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.ability.ISkylightListAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.business.story.ui.cell.StorySkylightCell;
import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.ability.FriendBottomTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3SkylightBridgeAssem;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS173S1100000_24 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS173S1100000_24 awS173S1100000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPage: ");
        sbLIZ.append((EnumC20538815Yk) awS173S1100000_24.l1);
        sbLIZ.append(" from: ");
        sbLIZ.append(awS173S1100000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS173S1100000_24 awS173S1100000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPage: ");
        sbLIZ.append((EnumC20538815Yk) awS173S1100000_24.l1);
        sbLIZ.append(" from: ");
        sbLIZ.append(awS173S1100000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS173S1100000_24 awS173S1100000_24) {
        List<C1556460qbc> list = C1563970qnj.LIZ;
        C19719612Di.LJJIIJ(list, new AwS603S0100000_24((C21202017y6) awS173S1100000_24.l1, 452), true);
        String str = awS173S1100000_24.s0;
        if (str != null) {
            C19719612Di.LJJIIJ(list, new AwS74S1000000_24(str, 11), true);
            C1563970qnj.LJI.remove(awS173S1100000_24.s0);
            C1563970qnj.LJ.remove(awS173S1100000_24.s0);
            C1563970qnj.LJFF.remove(awS173S1100000_24.s0);
        }
        if (((ArrayList) list).isEmpty()) {
            C1563970qnj.LIZIZ = null;
            C1563970qnj.LIZJ = null;
            C1563970qnj.LJ.clear();
            C1563970qnj.LJFF.clear();
            ((LinkedHashMap) C1563970qnj.LJI).clear();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS173S1100000_24 awS173S1100000_24) {
        Long l;
        Integer numValueOf;
        List<C1556460qbc> list = C1563970qnj.LIZ;
        C1563970qnj.LIZJ = awS173S1100000_24.s0;
        C1563970qnj.LIZIZ = (C1564050qnr) awS173S1100000_24.l1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jyq_debug ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(" updateLatestData, popCardId:");
        C1564050qnr c1564050qnr = (C1564050qnr) awS173S1100000_24.l1;
        String str = null;
        if (c1564050qnr != null) {
            l = c1564050qnr.LIZJ;
        } else {
            l = null;
        }
        sbLIZ.append(l);
        sbLIZ.append(", cardType:");
        C1564050qnr c1564050qnr2 = (C1564050qnr) awS173S1100000_24.l1;
        if (c1564050qnr2 != null) {
            numValueOf = Integer.valueOf(c1564050qnr2.LIZIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", roomId:");
        C1564050qnr c1564050qnr3 = (C1564050qnr) awS173S1100000_24.l1;
        if (c1564050qnr3 != null) {
            str = c1564050qnr3.LIZ;
        }
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS173S1100000_24 awS173S1100000_24) {
        String str = awS173S1100000_24.s0;
        if (Intrinsics.LJFF(str, "refresh_force")) {
            RecyclerView recyclerView = (RecyclerView) ((FriendsV3SkylightBridgeAssem) awS173S1100000_24.l1).LLJILJILJ.getValue();
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            }
            ((FriendsV3SkylightBridgeAssem) awS173S1100000_24.l1).Go().LJ(true, false, true);
            View view = (View) ((FriendsV3SkylightBridgeAssem) awS173S1100000_24.l1).LLJILJILJ.getValue();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS112S0100000_12((FriendsV3SkylightBridgeAssem) awS173S1100000_24.l1, 261));
            }
        } else if (Intrinsics.LJFF(str, "scroll_to_top")) {
            RecyclerView recyclerView2 = (RecyclerView) ((FriendsV3SkylightBridgeAssem) awS173S1100000_24.l1).LLJILJILJ.getValue();
            if (recyclerView2 != null) {
                recyclerView2.scrollToPosition(0);
            }
            ((FriendsV3SkylightBridgeAssem) awS173S1100000_24.l1).Go().LJ(true, false, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS173S1100000_24 awS173S1100000_24) {
        Object objInvoke = ((Function0) awS173S1100000_24.l1).invoke();
        if (objInvoke != null && C1326850kdH.LIZ.scenes.contains(objInvoke)) {
            LruCache<String, Boolean> lruCache = C1561210qjH.LIZ;
            C1561210qjH.LIZJ(awS173S1100000_24.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS173S1100000_24 awS173S1100000_24) {
        C1558520qew.LJI((C19EG) awS173S1100000_24.l1, MainActivityScope.class, new FriendBottomTabAvatarAbility(awS173S1100000_24.s0, new WeakReference((C19EG) awS173S1100000_24.l1)), IBottomFriendsTabAvatarAbility.class, null, null);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS173S1100000_24 awS173S1100000_24) {
        InterfaceC1595240rcA interfaceC1595240rcA;
        int reRankSequence;
        InterfaceC1891350zJl item = ((PowerCell) awS173S1100000_24.l1).getItem();
        if (item instanceof InterfaceC1595240rcA) {
            interfaceC1595240rcA = (InterfaceC1595240rcA) item;
            if (interfaceC1595240rcA != null) {
                reRankSequence = interfaceC1595240rcA.getReRankSequence();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1595220rc8.LIZ.getClass();
            sbLIZ.append(C1595220rc8.LIZJ(interfaceC1595240rcA));
            sbLIZ.append(C1595220rc8.LIZLLL(interfaceC1595240rcA));
            sbLIZ.append(awS173S1100000_24.s0);
            sbLIZ.append(reRankSequence);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        interfaceC1595240rcA = null;
        reRankSequence = 0;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C1595220rc8.LIZ.getClass();
        sbLIZ2.append(C1595220rc8.LIZJ(interfaceC1595240rcA));
        sbLIZ2.append(C1595220rc8.LIZLLL(interfaceC1595240rcA));
        sbLIZ2.append(awS173S1100000_24.s0);
        sbLIZ2.append(reRankSequence);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final Object invoke$16(AwS173S1100000_24 awS173S1100000_24) {
        InterfaceC1891350zJl item;
        PowerCell powerCell = (PowerCell) awS173S1100000_24.l1;
        InterfaceC1595240rcA interfaceC1595240rcA = null;
        if (powerCell != null) {
            item = powerCell.getItem();
        } else {
            item = null;
        }
        if (item instanceof InterfaceC1595240rcA) {
            interfaceC1595240rcA = (InterfaceC1595240rcA) item;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1595220rc8.LIZ.getClass();
        sbLIZ.append(C1595220rc8.LIZJ(interfaceC1595240rcA));
        sbLIZ.append(C1595220rc8.LIZLLL(interfaceC1595240rcA));
        sbLIZ.append(awS173S1100000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$17(AwS173S1100000_24 awS173S1100000_24) {
        FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) awS173S1100000_24.l1;
        feedSkylightListViewModel.LLJJJJJIL = feedSkylightListViewModel.FQ2().LIZIZ(((FeedSkylightListViewModel) awS173S1100000_24.l1).HQ2(), awS173S1100000_24.s0);
        if (((FeedSkylightListViewModel) awS173S1100000_24.l1).LLJJJJJIL != null) {
            AbstractC316870CbV<String> abstractC316870CbV = ((FeedSkylightListViewModel) awS173S1100000_24.l1).LLJJJJJIL;
            ((FeedSkylightListViewModel) awS173S1100000_24.l1).LLJJJJJIL = null;
            FeedSkylightListViewModel feedSkylightListViewModel2 = (FeedSkylightListViewModel) awS173S1100000_24.l1;
            feedSkylightListViewModel2.WQ2(new AwS425S0200000_24(feedSkylightListViewModel2, (FeedSkylightListViewModel) abstractC316870CbV, (AbstractC316870CbV<String>) 74));
        } else {
            FeedSkylightListViewModel feedSkylightListViewModel3 = (FeedSkylightListViewModel) awS173S1100000_24.l1;
            feedSkylightListViewModel3.getClass();
            feedSkylightListViewModel3.WQ2(new AwS568S0100000_24(feedSkylightListViewModel3, 1753));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS173S1100000_24 awS173S1100000_24) {
        return Boolean.valueOf(((StoryInboxCell) awS173S1100000_24.l1).C6(awS173S1100000_24.s0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$19(AwS173S1100000_24 awS173S1100000_24) {
        String str;
        SlideGuideViewModel slideGuideViewModel = ((SlideGuideController) awS173S1100000_24.l1).LLIZLLLIL;
        if (slideGuideViewModel != null) {
            String str2 = awS173S1100000_24.s0;
            switch (str2.hashCode()) {
                case -1965615457:
                    if (str2.equals("Nearby")) {
                        str = "homepage_nearby";
                        C20684815ws.LJIILLIIL("homepage_copywriting_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    }
                    break;
                case -1525083535:
                    if (str2.equals("Following")) {
                        str = "homepage_follow";
                        C20684815ws.LJIILLIIL("homepage_copywriting_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    }
                    break;
                case -1309089240:
                    if (str2.equals("FRIENDS_FEED")) {
                        str = "homepage_friends";
                        C20684815ws.LJIILLIIL("homepage_copywriting_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    }
                    break;
                case 2576150:
                    if (str2.equals("Shop")) {
                        str = "shop_tab";
                        C20684815ws.LJIILLIIL("homepage_copywriting_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    }
                    break;
                case 984907784:
                    if (str2.equals("For You")) {
                        str = "homepage_hot";
                        C20684815ws.LJIILLIIL("homepage_copywriting_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    }
                    break;
                case 1270713017:
                    if (str2.equals("Popular")) {
                        str = "faq_page";
                        C20684815ws.LJIILLIIL("homepage_copywriting_show", C2097908Jt.LIZJ(new Pair("enter_from", str)));
                    }
                    break;
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" guide real show!");
            C1720106oR.LJI("SlideGuide", C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass0956 anonymousClass0956 = slideGuideViewModel.LLJILJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            slideGuideViewModel.LLJILJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slideGuideViewModel), slideGuideViewModel.LLILLL, null, new C496701wb(slideGuideViewModel, null), 2);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(slideGuideViewModel), slideGuideViewModel.LLILLL, null, new C496601wa(null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS173S1100000_24 awS173S1100000_24) {
        C1569250qwF c1569250qwF = (C1569250qwF) ((LinkedHashMap) LandscapeFeedMonitorImpl.LJI).get("landscape_feed_launch_performance");
        if (c1569250qwF != null) {
            c1569250qwF.LIZ("landscape_feed_launch_video_first_frame_rendered", null, awS173S1100000_24.s0, (Map) awS173S1100000_24.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[EDGE_INSN: B:68:0x00a0->B:47:0x00a0 BREAK  A[LOOP:1: B:34:0x0068->B:70:?]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$3(kotlin.jvm.internal.AwS173S1100000_24 r6) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS173S1100000_24.invoke$3(kotlin.jvm.internal.AwS173S1100000_24):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$4(kotlin.jvm.internal.AwS173S1100000_24 r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS173S1100000_24.invoke$4(kotlin.jvm.internal.AwS173S1100000_24):java.lang.Object");
    }

    public static final Object invoke$5(AwS173S1100000_24 awS173S1100000_24) {
        Map map = (Map) ((Function0) awS173S1100000_24.l1).invoke();
        if (map == null) {
            C20684815ws.onEventV3(awS173S1100000_24.s0);
        } else {
            C20684815ws.LJIILLIIL(awS173S1100000_24.s0, map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS173S1100000_24 awS173S1100000_24) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeAutoScroll: autoScrollState: ");
        sbLIZ.append(((AutoScrollComponent) awS173S1100000_24.l1).LLJJJ);
        sbLIZ.append(", ");
        sbLIZ.append(awS173S1100000_24.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS173S1100000_24 awS173S1100000_24) throws Exception {
        C2344809Gs.LIZIZ(awS173S1100000_24.s0, (Exception) awS173S1100000_24.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS173S1100000_24 awS173S1100000_24) {
        String authorUid;
        Aweme aweme;
        Aweme aweme2;
        C1596360rdy c1596360rdy = (C1596360rdy) ((StorySkylightCell) awS173S1100000_24.l1).getItem();
        int i = 0;
        if (c1596360rdy != null && c1596360rdy.LL && C1618440sDa.LIZIZ.LJJIFFI().LJIIIIZZ()) {
            return Boolean.FALSE;
        }
        ISkylightListAbility iSkylightListAbility = (ISkylightListAbility) ((StorySkylightCell) awS173S1100000_24.l1).LLILZIL.getValue();
        if (iSkylightListAbility != null) {
            iSkylightListAbility.nC0((InterfaceC1594910rbd) ((StorySkylightCell) awS173S1100000_24.l1).getItem());
        }
        InterfaceC1597970rgZ interfaceC1597970rgZLJJIJIL = C1618440sDa.LIZIZ.LJJIJIL();
        C1596360rdy c1596360rdy2 = (C1596360rdy) ((StorySkylightCell) awS173S1100000_24.l1).getItem();
        User author = null;
        if (c1596360rdy2 != null && (aweme2 = c1596360rdy2.LLILLJJLI) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        int iUH2 = ((StorySkylightCell) awS173S1100000_24.l1).uH2();
        if (iUH2 != 0) {
            if (iUH2 != 1) {
                if (iUH2 == 2) {
                    i = 3;
                }
            } else {
                i = 5;
            }
        } else {
            i = 2;
        }
        interfaceC1597970rgZLJJIJIL.LJ(i, authorUid);
        InterfaceC1597970rgZ interfaceC1597970rgZ = (InterfaceC1597970rgZ) ((StorySkylightCell) awS173S1100000_24.l1).LLJILLL.getValue();
        String str = awS173S1100000_24.s0;
        EnumC1260930iux enumC1260930iux = EnumC1260930iux.CLOSE;
        C1596360rdy c1596360rdy3 = (C1596360rdy) ((StorySkylightCell) awS173S1100000_24.l1).getItem();
        if (c1596360rdy3 != null && (aweme = c1596360rdy3.LLILLJJLI) != null) {
            author = aweme.getAuthor();
        }
        interfaceC1597970rgZ.LJFF(str, "top_cell", enumC1260930iux, author, null, true);
        return Boolean.TRUE;
    }

    public static final Object invoke$9(AwS173S1100000_24 awS173S1100000_24) {
        C1563970qnj.LJI.put(awS173S1100000_24.s0, (Function0) awS173S1100000_24.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(AwS425S0200000_24 awS425S0200000_24, int i) {
        super(0);
        this.$t = i;
        this.l1 = awS425S0200000_24;
        this.s0 = "refresh_homepage";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(AwS568S0100000_24 awS568S0100000_24, int i) {
        super(0);
        this.$t = i;
        this.s0 = "acting_area_bottom";
        this.l1 = awS568S0100000_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(C1210090hax c1210090hax, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1210090hax;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(EnumC20538815Yk enumC20538815Yk, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = enumC20538815Yk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(C19EG c19eg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19eg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS173S1100000_24(PowerCell powerCell, PowerCell<?> powerCell2, String str) {
        super(0);
        this.$t = str;
        this.l1 = powerCell;
        this.s0 = powerCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(FeedSkylightListViewModel feedSkylightListViewModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = feedSkylightListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(StorySkylightCell storySkylightCell, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = storySkylightCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(Aweme aweme, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(SlideGuideController slideGuideController, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = slideGuideController;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(StoryInboxCell storyInboxCell, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = storyInboxCell;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(AutoScrollComponent autoScrollComponent, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = autoScrollComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(String str, C1564050qnr c1564050qnr, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1564050qnr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(String str, FriendsV3SkylightBridgeAssem friendsV3SkylightBridgeAssem, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = friendsV3SkylightBridgeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS173S1100000_24(String str, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS173S1100000_24(Map map, Map<String, String> map2, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS173S1100000_24(Function0 function0, Function0<String> function02, String str) {
        super(0);
        this.$t = str;
        this.l1 = function0;
        this.s0 = function02;
    }
}
