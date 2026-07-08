package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.track;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0J55;
import X.C0OB8;
import X.C0W17;
import X.C13LE;
import X.C1558520qew;
import X.C1610110s09;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1361270lWn;
import X.InterfaceC1554640qYg;
import X.InterfaceC2183451Acp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellLogicAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3LiveCellViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3LiveTrackAssem extends BaseFriendsV3CellLogicAssem<FriendsV3LiveTrackAssem, InterfaceC1361270lWn> implements FriendsV3LiveCellTrackAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public int LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public final C01GW LLJJJJ = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3LiveCellViewModel.class), AFwS279S0000000_33.get$arr$(147));
    public final C01GW LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(148));
    public final AssemVMLazy LLJJJJLIIL;
    public final AssemVMLazy LLJJL;
    public final C630740Ooa LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3LiveTrackAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3LiveTrackAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3LiveTrackAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ, 2257), AFwS279S0000000_33.get$arr$(145), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLJJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ2, 2258), AFwS279S0000000_33.get$arr$(146), null, true);
        this.LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2256));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1463205213) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellLogicAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJJI = 0;
        this.LLJJJ = 0L;
        this.LLJJJIL = 0L;
        this.LLJJIJIL = 0L;
        this.LLJJIII = 0L;
        this.LLJJIJI = 0L;
        this.LLJJIJIIJIL = 0L;
    }

    public final boolean Ao() {
        String str;
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        List<Long> list;
        Boolean boolB50;
        FriendsV3LivePlayerAbility friendsV3LivePlayerAbility = (FriendsV3LivePlayerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (friendsV3LivePlayerAbility != null && (boolB50 = friendsV3LivePlayerAbility.b50()) != null) {
            return boolB50.booleanValue();
        }
        LiveRoomStruct liveRoomStructZo = zo();
        if (liveRoomStructZo == null || (str = liveRoomStructZo.linkMic) == null) {
            return false;
        }
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService == null || (interfaceC2183451AcpX3 = iLiveOuterService.X3()) == null) {
                return false;
            }
            SlimRoom.LinkMic linkMicLJIIZILJ = interfaceC2183451AcpX3.LJIIZILJ(str);
            return (linkMicLJIIZILJ == null || (list = linkMicLJIIZILJ.audienceIdList) == null || list.size() <= 0) ? false : true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final String Bo() {
        FriendsV3LivePlayerAbility friendsV3LivePlayerAbility = (FriendsV3LivePlayerAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (friendsV3LivePlayerAbility != null) {
            return friendsV3LivePlayerAbility.z9();
        }
        return null;
    }

    public final void Eo() {
        Boolean bool = ((C1610110s09) ((AssemViewModel) this.LLJJJJ.getValue()).getState()).LLILLL;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : Ao();
        C0J55 c0j55 = C0J55.LIZ;
        LiveRoomStruct liveRoomStructZo = zo();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        long j = this.LLJJIII;
        int i = this.LLJJI;
        String strBo = Bo();
        c0j55.getClass();
        C2344009Gk c2344009GkLIZ = C0J55.LIZ(aweme, liveRoomStructZo);
        c2344009GkLIZ.LJIIIIZZ("enter_from_merge", "homepage_friends");
        c2344009GkLIZ.LJIIIIZZ("enter_method", "live_cell");
        c2344009GkLIZ.LJIIIIZZ("action_type", "click");
        c2344009GkLIZ.LIZLLL(j, "duration");
        c2344009GkLIZ.LIZJ(i, "room_position");
        c2344009GkLIZ.LJIIIIZZ("is_guest_connection", zBooleanValue ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009GkLIZ.LJIIIIZZ("connection_type", strBo);
        C20684815ws.LJIILLIIL("livesdk_live_window_duration_v2", c2344009GkLIZ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final void wL0() {
        C0J55 c0j55 = C0J55.LIZ;
        LiveRoomStruct liveRoomStructZo = zo();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        int i = this.LLJJI;
        c0j55.getClass();
        C2344009Gk c2344009GkLIZ = C0J55.LIZ(aweme, liveRoomStructZo);
        c2344009GkLIZ.LJIIIIZZ("enter_method", "live_cell");
        c2344009GkLIZ.LIZJ(i, "room_position");
        C20684815ws.LJIILLIIL("livesdk_finish_show", c2344009GkLIZ.LIZ);
    }

    public final LiveRoomStruct zo() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        RoomFeedCellStruct roomFeedCellStruct = ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getRoomFeedCellStruct();
        if (roomFeedCellStruct != null) {
            return roomFeedCellStruct.getNewLiveRoomData();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final long Qv2() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LiveRoomStruct liveRoomStructZo = zo();
        return jCurrentTimeMillis - (liveRoomStructZo != null ? liveRoomStructZo.create_time * 1000 : jCurrentTimeMillis);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final void eA() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJJ = jCurrentTimeMillis;
        long j = this.LLJJJIL;
        if (j > 0) {
            this.LLJJIJIIJIL = jCurrentTimeMillis - j;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLJJIJIL = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        this.LLJJIII += System.currentTimeMillis() - this.LLJJIJIL;
        this.LLJJIJIL = 0L;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final void vL0() {
        this.LLJJJIL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final int bM0() {
        return this.LLJJI;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    public final void Co(boolean z) {
        Object obj;
        String str;
        C0J55 c0j55 = C0J55.LIZ;
        LiveRoomStruct liveRoomStructZo = zo();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((C0OB8) obj).getAweme();
        int i = this.LLJJI;
        long j = this.LLJJIII;
        long j2 = this.LLJJIJI;
        long j3 = this.LLJJIJIIJIL;
        boolean zAo = Ao();
        String strBo = Bo();
        c0j55.getClass();
        C2344009Gk c2344009GkLIZ = C0J55.LIZ(aweme, liveRoomStructZo);
        c2344009GkLIZ.LJIIIIZZ("enter_method", "live_cell");
        c2344009GkLIZ.LIZJ(i, "room_position");
        String str2 = "1";
        if (zAo) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009GkLIZ.LJIIIIZZ("is_guest_connection", str);
        c2344009GkLIZ.LJIIIIZZ("connection_type", strBo);
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009GkLIZ.LJIIIIZZ("is_started_play", str2);
        c2344009GkLIZ.LIZLLL(j2, "duration_show_stream");
        c2344009GkLIZ.LIZLLL(j, "duration_show_total");
        c2344009GkLIZ.LIZLLL(j3, "duration_pull_stream");
        C20684815ws.LJIILLIIL("livesdk_live_card_friends_v3_full_link", c2344009GkLIZ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final void QP2(Map<String, String> map) {
        map.put("is_waterfall", "1");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility
    public final void oX1(boolean z) {
        Object obj;
        String str;
        if (z) {
            C0J55 c0j55 = C0J55.LIZ;
            LiveRoomStruct liveRoomStructZo = zo();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((C0OB8) obj).getAweme();
            int i = this.LLJJI;
            boolean zAo = Ao();
            String strBo = Bo();
            c0j55.getClass();
            C2344009Gk c2344009GkLIZ = C0J55.LIZ(aweme, liveRoomStructZo);
            c2344009GkLIZ.LJIIIIZZ("enter_method", "live_cell");
            c2344009GkLIZ.LIZJ(i, "room_position");
            if (zAo) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009GkLIZ.LJIIIIZZ("is_guest_connection", str);
            c2344009GkLIZ.LJIIIIZZ("connection_type", strBo);
            C20684815ws.LJIILLIIL("livesdk_user_mute_room", c2344009GkLIZ.LIZ);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C0W17.LIZJ("FriendV3LiveAssem", "onBind");
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hwW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1223430hwT) obj2).LLILZ;
            }
        }, null, new AwS647S0100000_33((InterfaceC1361270lWn) obj, 55), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0S7l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0SDJ) obj2).LLILLJJLI;
            }
        }, null, AFwS321S0000000_33.get$arr$(43), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0RqS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0SDJ) obj2).LLILLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(44), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0rGv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C0O2L) obj2).LLILLJJLI;
            }
        }, null, AFwS321S0000000_33.get$arr$(45), 6);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }
}
