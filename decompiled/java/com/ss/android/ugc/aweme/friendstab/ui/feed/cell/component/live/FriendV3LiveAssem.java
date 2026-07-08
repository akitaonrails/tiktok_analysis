package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live;

import X.C01GW;
import X.C0IHI;
import X.C0J5O;
import X.C0OB8;
import X.C0W17;
import X.C1106200etO;
import X.C1106210etP;
import X.C123100dR;
import X.C1308910kAL;
import X.C1393100mM8;
import X.C13LE;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C14EU;
import X.C1558520qew;
import X.C1599640rjG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2493909px;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C621180OYa;
import X.C628500Oky;
import X.C630740Ooa;
import X.C704790Rkj;
import X.C705700RmC;
import X.C723830SaL;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C945320ahu;
import X.EnumC1913550ztZ;
import X.EnumC21697819vs;
import X.InterfaceC1106740euG;
import X.InterfaceC1361270lWn;
import X.InterfaceC1372610lp5;
import X.InterfaceC20673515v3;
import X.InterfaceC420801kM;
import X.InterfaceC472850IgV;
import X.InterfaceC665370Q7z;
import Y.ARunnableS116S0100000_16;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.cell.FriendsV3LiveCellTrackAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendV3LiveAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3LiveCellViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LiveReportToggleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendV3LiveAssem extends BaseFriendsV3CellUISlotAssem<FriendV3LiveAssem, InterfaceC1361270lWn> implements FriendsV3CellPlayHostAbility, FriendsV3LivePlayerHandleAbility, FriendsV3LiveShareAbility {
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2196));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2190));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2192));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2188));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2193));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2191));
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS279S0000000_33.get$arr$(135));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(320));
    public final C630740Ooa LLL = C628500Oky.LIZ(new AwS563S0100000_19(this, 1455));
    public final C630740Ooa LLLF = C628500Oky.LIZ(new AwS577S0100000_33(this, 2195));
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS577S0100000_33(this, 2197));
    public final C630740Ooa LLLFFI = C628500Oky.LIZ(new AwS563S0100000_19(this, 1456));
    public final C630740Ooa LLLFZ = C628500Oky.LIZ(new AwS577S0100000_33(this, 2189));
    public final C01GW LLLI = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3LiveCellViewModel.class), AFwS279S0000000_33.get$arr$(136));
    public InterfaceC420801kM LLLII;
    public long LLLIIII;

    @Override // X.InterfaceC2175541ACi
    public final Integer Dk() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final boolean E6() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void Hh(AwS107S1200000_24 awS107S1200000_24) {
    }

    @Override // X.InterfaceC2175541ACi
    public final boolean LLILLIZIL() {
        return false;
    }

    @Override // X.InterfaceC2175541ACi
    public final void LLLIL() {
    }

    @Override // X.InterfaceC2175541ACi
    public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
    }

    @Override // X.InterfaceC2175541ACi
    public final void LLLLLLIL() {
    }

    @Override // X.InterfaceC2175541ACi
    public final Object Md() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cb0;
    }

    @Override // X.InterfaceC2175541ACi
    public final void T5() {
    }

    @Override // X.InterfaceC2175541ACi
    public final void Th(int i, int i2, View view) {
    }

    @Override // X.InterfaceC2175541ACi
    public final boolean U1() {
        return false;
    }

    @Override // X.InterfaceC2175541ACi
    public final boolean We() {
        return false;
    }

    @Override // X.InterfaceC2175541ACi
    public final Object Y7() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void bk() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final Surface getSurface() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final View kG2() {
        return null;
    }

    @Override // X.InterfaceC2175541ACi
    public final void o() {
    }

    @Override // X.InterfaceC2175541ACi
    public final void oc(C945320ahu c945320ahu) {
    }

    @Override // X.InterfaceC2175541ACi
    public final void oe(String str) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlayFailed(String str, C1481290oeN c1481290oeN, C1480430ocz c1480430ocz) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final void onPlaying(String str, C1480430ocz c1480430ocz) {
    }

    @Override // X.InterfaceC2175541ACi
    public final void sk(String str) {
    }

    public final FriendsV3LiveCellViewModel Ap() {
        return (FriendsV3LiveCellViewModel) this.LLLI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Jh6] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveShareAbility
    public final void Au0() {
        Context context;
        Activity activityLIZ;
        C0W17.LIZJ("FriendV3LiveAssem", "shareLive");
        final LiveRoomStruct liveRoomStructBp = Bp();
        if (liveRoomStructBp == null || (context = getContext()) == null || (activityLIZ = C2493909px.LIZ(context)) == null) {
            return;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        C1106200etO c1106200etO = new C1106200etO(iLiveOuterService != null ? iLiveOuterService.t6(liveRoomStructBp) : null);
        c1106200etO.LJJI = "homepage_friends";
        c1106200etO.LJJIFFI = "live_cell";
        c1106200etO.LJIILIIL = false;
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        c1106200etO.LJIIIZ = iLiveOuterService2 != null ? iLiveOuterService2.j4(liveRoomStructBp) : null;
        c1106200etO.LJJJJIZL = new InterfaceC1106740euG() { // from class: X.0Jh7
            @Override // X.InterfaceC1106740euG
            public final void LIZ() {
                InterfaceC20673515v3 interfaceC20673515v3K4;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(liveRoomStructBp.owner.getUid());
                long jLongValue = lLJIILIIL != null ? lLJIILIIL.longValue() : 0L;
                String strLIZ = C354201Zc.LIZ(RoomStruct.getStreamType(liveRoomStructBp));
                ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService3 == null || (interfaceC20673515v3K4 = iLiveOuterService3.k4()) == null) {
                    return;
                }
                Context context2 = this.getContext();
                LiveRoomStruct liveRoomStruct = liveRoomStructBp;
                long j = liveRoomStruct.id;
                String secUid = liveRoomStruct.owner.getSecUid();
                String requestId = this.LJIIIIZZ().getRequestId();
                Boolean bool = Boolean.TRUE;
                Pair[] pairArr = new Pair[5];
                FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = this.Ep();
                pairArr[0] = new Pair("room_position", String.valueOf(friendsV3LiveCellTrackAbilityEp != null ? friendsV3LiveCellTrackAbilityEp.bM0() : 0));
                FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp2 = this.Ep();
                pairArr[1] = new Pair("room_golive_duration", String.valueOf(friendsV3LiveCellTrackAbilityEp2 != null ? friendsV3LiveCellTrackAbilityEp2.Qv2() : 0L));
                pairArr[2] = new Pair("follow_status", String.valueOf(liveRoomStructBp.owner.getFollowStatus()));
                pairArr[3] = new Pair("live_type", strLIZ);
                pairArr[4] = new Pair("request_page", "preview_press");
                interfaceC20673515v3K4.LJJLIIIJ(context2, j, jLongValue, jLongValue, secUid, "share", "homepage_friends", "report_anchor", requestId, strLIZ, bool, C2097608Jq.LJIIJ(pairArr));
            }
        };
        C1106210etP c1106210etP = new C1106210etP(c1106200etO);
        c1106210etP.LJJZ = true;
        c1106210etP.LJJZZI = "friends_v3_feeds";
        C1393100mM8.LJFF(liveRoomStructBp.owner);
        FriendsV3LiveReportToggleAbility friendsV3LiveReportToggleAbility = (FriendsV3LiveReportToggleAbility) this.LLLFFI.getValue();
        if (friendsV3LiveReportToggleAbility != null) {
            String aid = LJIIIIZZ().getAid();
            FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = Ep();
            friendsV3LiveReportToggleAbility.Ay0(friendsV3LiveCellTrackAbilityEp != null ? friendsV3LiveCellTrackAbilityEp.bM0() : -1, aid);
        }
        C621180OYa.LIZ.LJJIL(activityLIZ, c1106210etP, new InterfaceC1372610lp5() { // from class: X.0Jh6
            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZIZ(HashMap<String, String> map) {
                int iBM0;
                long jQv2;
                C0J55 c0j55 = C0J55.LIZ;
                FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp2 = this.Ep();
                if (friendsV3LiveCellTrackAbilityEp2 != null) {
                    iBM0 = friendsV3LiveCellTrackAbilityEp2.bM0();
                } else {
                    iBM0 = 0;
                }
                FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp3 = this.Ep();
                if (friendsV3LiveCellTrackAbilityEp3 != null) {
                    jQv2 = friendsV3LiveCellTrackAbilityEp3.Qv2();
                } else {
                    jQv2 = 0;
                }
                LiveRoomStruct liveRoomStruct = liveRoomStructBp;
                Aweme awemeLJIIIIZZ = this.LJIIIIZZ();
                c0j55.getClass();
                C0J55.LIZIZ(iBM0, jQv2, liveRoomStruct, awemeLJIIIIZZ, map);
            }

            @Override // X.InterfaceC1372610lp5
            public final void onShow(int i) {
                String uid;
                User currentUser;
                C0J55 c0j55 = C0J55.LIZ;
                String uid2 = liveRoomStructBp.owner.getUid();
                String strValueOf = String.valueOf(liveRoomStructBp.id);
                int followStatus = liveRoomStructBp.owner.getFollowStatus();
                c0j55.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_friends");
                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                c2344009Gk.LJIIIIZZ("action_type", "click");
                c2344009Gk.LJIIIIZZ("panel_source", "more");
                c2344009Gk.LJIIIIZZ("is_waterfall", "1");
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
                    uid = "";
                }
                c2344009Gk.LJIIIIZZ("user_id", uid);
                c2344009Gk.LJIIIIZZ("anchor_id", uid2);
                c2344009Gk.LJIIIIZZ("room_id", strValueOf);
                c2344009Gk.LJIIIIZZ("is_bubble_enter", "self_guide");
                c2344009Gk.LJIIIIZZ("follow_status", String.valueOf(followStatus));
                C20684815ws.LJIILLIIL("livesdk_share_panel_show", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str, String str2, Bundle bundle) {
                int iBM0;
                long jQv2;
                if (!Intrinsics.LJFF(str, "chat_merge")) {
                    C0J55 c0j55 = C0J55.LIZ;
                    FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp2 = this.Ep();
                    if (friendsV3LiveCellTrackAbilityEp2 != null) {
                        iBM0 = friendsV3LiveCellTrackAbilityEp2.bM0();
                    } else {
                        iBM0 = 0;
                    }
                    FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp3 = this.Ep();
                    if (friendsV3LiveCellTrackAbilityEp3 != null) {
                        jQv2 = friendsV3LiveCellTrackAbilityEp3.Qv2();
                    } else {
                        jQv2 = 0;
                    }
                    LiveRoomStruct liveRoomStruct = liveRoomStructBp;
                    Aweme awemeLJIIIIZZ = this.LJIIIIZZ();
                    c0j55.getClass();
                    C0J55.LIZIZ(iBM0, jQv2, liveRoomStruct, awemeLJIIIIZZ, null);
                }
            }
        }, liveRoomStructBp.owner);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cb0, new AwS577S0100000_33(this, 2194));
    }

    public final FriendsV3LiveCellTrackAbility Ep() {
        return (FriendsV3LiveCellTrackAbility) this.LLLFF.getValue();
    }

    public final void Fp() {
        C0J5O c0j5oZ5;
        User user;
        User user2;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "homepage_friends";
        roomsData.enterMethod = "live_cell";
        LiveRoomStruct liveRoomStructBp = Bp();
        roomsData.userId = (liveRoomStructBp == null || (user2 = liveRoomStructBp.owner) == null) ? null : user2.getUid();
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        LiveRoomStruct liveRoomStructBp2 = Bp();
        roomsData2.followStatus = String.valueOf((liveRoomStructBp2 == null || (user = liveRoomStructBp2.owner) == null) ? null : Integer.valueOf(user.getFollowStatus()));
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = Ep();
        int i = 0;
        logData.positionOutsideLiveRoom = friendsV3LiveCellTrackAbilityEp != null ? friendsV3LiveCellTrackAbilityEp.bM0() : 0;
        enterRoomConfig.mLogData.requestId = LJIIIIZZ().getRequestId();
        LiveRoomStruct liveRoomStructBp3 = Bp();
        if (liveRoomStructBp3 != null) {
            String strValueOf = String.valueOf(liveRoomStructBp3.create_time * 1000);
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("room_create_time_friends_v3", strValueOf);
            FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp2 = Ep();
            if (friendsV3LiveCellTrackAbilityEp2 != null) {
                friendsV3LiveCellTrackAbilityEp2.QP2(linkedHashMap);
            }
            logData2.singleRoomLogMap = linkedHashMap;
        }
        FriendsV3LiveReportToggleAbility friendsV3LiveReportToggleAbility = (FriendsV3LiveReportToggleAbility) this.LLLFFI.getValue();
        if (friendsV3LiveReportToggleAbility != null) {
            String aid = LJIIIIZZ().getAid();
            FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp3 = Ep();
            friendsV3LiveReportToggleAbility.Ay0(friendsV3LiveCellTrackAbilityEp3 != null ? friendsV3LiveCellTrackAbilityEp3.bM0() : -1, aid);
        }
        EnterRoomConfig.GuestUser guestUser = enterRoomConfig.mRoomsData.guestUser;
        if (guestUser != null) {
            FriendsV3LivePlayerAbility friendsV3LivePlayerAbility = (FriendsV3LivePlayerAbility) this.LLLF.getValue();
            if (friendsV3LivePlayerAbility != null && friendsV3LivePlayerAbility.be0() > 0) {
                i = 1;
            }
            guestUser.isGuestEnter = i;
        }
        EnterRoomConfig.GuestUser guestUser2 = enterRoomConfig.mRoomsData.guestUser;
        if (guestUser2 != null) {
            FriendsV3LivePlayerAbility friendsV3LivePlayerAbility2 = (FriendsV3LivePlayerAbility) this.LLLF.getValue();
            guestUser2.guestCnt = friendsV3LivePlayerAbility2 != null ? Integer.valueOf(friendsV3LivePlayerAbility2.be0()) : null;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (c0j5oZ5 = iLiveOuterService.z5()) == null) {
            return;
        }
        c0j5oZ5.LIZLLL(up().getContext(), Bp(), enterRoomConfig);
    }

    public final Aweme LJIIIIZZ() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.ability.FriendsV3CellPlayHostAbility
    public final FrameLayout M4() {
        return (FrameLayout) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3CellPlayHostAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3LivePlayerHandleAbility.class, null);
            C1558520qew.LJIIJJI(interfaceC665370Q7z, FriendsV3LiveShareAbility.class, null);
        }
    }

    public final RadiusLayout up() {
        return (RadiusLayout) this.LLJLL.getValue();
    }

    @Override // X.InterfaceC2175541ACi
    public final void v() {
        C0W17.LIZJ("FriendV3LiveAssem", "firstFrame");
        if (Ap().getState().LL == EnumC21697819vs.NORMAL) {
            C786410Ut5.LJLLLLLL(8, yp());
            FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = Ep();
            if (friendsV3LiveCellTrackAbilityEp != null) {
                friendsV3LiveCellTrackAbilityEp.eA();
            }
        }
    }

    public final RemoteImageView yp() {
        return (RemoteImageView) this.LLJLIL.getValue();
    }

    public final TuxTextView zp() {
        return (TuxTextView) this.LLJLILLLLZIIL.getValue();
    }

    public final LiveRoomStruct Bp() {
        RoomFeedCellStruct roomFeedCellStruct = LJIIIIZZ().getRoomFeedCellStruct();
        if (roomFeedCellStruct != null) {
            return roomFeedCellStruct.getNewLiveRoomData();
        }
        return null;
    }

    public final boolean Gp() {
        LiveRoomStruct liveRoomStructBp;
        MaskLayer maskLayer;
        Text text;
        MaskLayer maskLayer2;
        Text text2;
        LiveEventInfo liveEventInfo;
        LiveRoomStruct liveRoomStructBp2 = Bp();
        if ((liveRoomStructBp2 == null || (liveEventInfo = liveRoomStructBp2.liveEventInfo) == null || !Intrinsics.LJFF(liveEventInfo.isPaidEvent(), Boolean.TRUE)) && ((liveRoomStructBp = Bp()) == null || liveRoomStructBp.liveSubOnly != 1)) {
            LiveRoomStruct liveRoomStructBp3 = Bp();
            String str = null;
            if (!C123100dR.LIZ((liveRoomStructBp3 == null || (maskLayer2 = liveRoomStructBp3.maskLayer) == null || (text2 = maskLayer2.title) == null) ? null : text2.defaultPattern)) {
                LiveRoomStruct liveRoomStructBp4 = Bp();
                if (liveRoomStructBp4 != null && (maskLayer = liveRoomStructBp4.maskLayer) != null && (text = maskLayer.subTitle) != null) {
                    str = text.defaultPattern;
                }
                if (!C123100dR.LIZ(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility
    public final boolean Zr() {
        return Ap().getState().LL == EnumC21697819vs.NORMAL && !Gp();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility
    public final void bj2() {
        if (Zr()) {
            FriendsV3LiveCellViewModel friendsV3LiveCellViewModelAp = Ap();
            friendsV3LiveCellViewModelAp.getClass();
            friendsV3LiveCellViewModelAp.setState(new AwS603S0100000_24((Boolean) null, 13));
            FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = Ep();
            if (friendsV3LiveCellTrackAbilityEp != null) {
                friendsV3LiveCellTrackAbilityEp.vL0();
            }
        }
        tp(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLL.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3CellPlayHostAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3LivePlayerHandleAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3LiveShareAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7z, this, FriendsV3LiveShareAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unBind live cell ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" aid:");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((C0OB8) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        sbLIZ.append(" nickName:");
        C724270Sb3 c724270Sb32 = this.LLJI;
        User author = ((C0OB8) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAuthor();
        sbLIZ.append(author != null ? author.getNickname() : null);
        sbLIZ.append(",last aweme :");
        sbLIZ.append(LJIIIIZZ().getAid());
        C0W17.LIZJ("FriendV3LiveAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLLIIII = 0L;
        EventBus.LIZLLL().LJJI(this);
    }

    public static void tp(final FriendV3LiveAssem friendV3LiveAssem) {
        InterfaceC420801kM interfaceC420801kMLJI;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        LiveRoomStruct liveRoomStructBp = friendV3LiveAssem.Bp();
        if (liveRoomStructBp != null) {
            final long j = liveRoomStructBp.id;
            if (j > 0 && System.currentTimeMillis() - friendV3LiveAssem.LLLIIII >= 500) {
                friendV3LiveAssem.LLLIIII = System.currentTimeMillis();
                InterfaceC420801kM interfaceC420801kM = friendV3LiveAssem.LLLII;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add("pause");
                arrayList.add("end");
                String strJoin = TextUtils.join(",", arrayList);
                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                    interfaceC420801kMLJI = interfaceC20673515v3K4.LJI("friends_tab_v3_inspection", strJoin, j, new InterfaceC472850IgV() { // from class: X.19vu
                        @Override // X.InterfaceC472850IgV
                        public final void onFailed() {
                            C0W17.LIZ("FriendV3LiveAssem", "Failed to check room status");
                        }

                        @Override // X.InterfaceC472850IgV
                        public final void LIZ(FilterInfoData filterInfoData, boolean z) {
                            LiveRoomStruct liveRoomStructBp2;
                            LiveRoomStruct liveRoomStructBp3 = friendV3LiveAssem.Bp();
                            if (liveRoomStructBp3 != null && liveRoomStructBp3.id == j) {
                                if (!z) {
                                    EnumC21697819vs enumC21697819vs = EnumC21697819vs.FINISHED;
                                    if (enumC21697819vs != friendV3LiveAssem.Ap().getState().LL) {
                                        FriendsV3LiveCellViewModel friendsV3LiveCellViewModelAp = friendV3LiveAssem.Ap();
                                        friendsV3LiveCellViewModelAp.getClass();
                                        friendsV3LiveCellViewModelAp.setState(new AwS603S0100000_24(enumC21697819vs, 14));
                                        FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = friendV3LiveAssem.Ep();
                                        if (friendsV3LiveCellTrackAbilityEp != null) {
                                            friendsV3LiveCellTrackAbilityEp.wL0();
                                        }
                                    }
                                    LiveRoomStruct liveRoomStructBp4 = friendV3LiveAssem.Bp();
                                    if ((liveRoomStructBp4 != null && liveRoomStructBp4.isShow) || (liveRoomStructBp2 = friendV3LiveAssem.Bp()) == null || liveRoomStructBp2.id != j) {
                                        return;
                                    }
                                    C1599640rjG.LIZIZ.Yu(friendV3LiveAssem.LJIIIIZZ().getAid());
                                    return;
                                }
                                if (filterInfoData != null && filterInfoData.isFiltered && Intrinsics.LJFF(filterInfoData.reason, "pause")) {
                                    EnumC21697819vs enumC21697819vs2 = EnumC21697819vs.PAUSED;
                                    if (enumC21697819vs2 == friendV3LiveAssem.Ap().getState().LL) {
                                        return;
                                    }
                                    FriendsV3LiveCellViewModel friendsV3LiveCellViewModelAp2 = friendV3LiveAssem.Ap();
                                    friendsV3LiveCellViewModelAp2.getClass();
                                    friendsV3LiveCellViewModelAp2.setState(new AwS603S0100000_24(enumC21697819vs2, 14));
                                    return;
                                }
                                EnumC21697819vs enumC21697819vs3 = EnumC21697819vs.NORMAL;
                                if (enumC21697819vs3 == friendV3LiveAssem.Ap().getState().LL) {
                                    return;
                                }
                                FriendsV3LiveCellViewModel friendsV3LiveCellViewModelAp3 = friendV3LiveAssem.Ap();
                                friendsV3LiveCellViewModelAp3.getClass();
                                friendsV3LiveCellViewModelAp3.setState(new AwS603S0100000_24(enumC21697819vs3, 14));
                                FriendV3LiveAssem friendV3LiveAssem2 = friendV3LiveAssem;
                                if (!Intrinsics.LJFF(((C0SDJ) ((AssemViewModel) friendV3LiveAssem2.LLJZ.getValue()).getState()).LL, Boolean.TRUE) || friendV3LiveAssem2.Gp()) {
                                    return;
                                }
                                HandlerHook.viewPost(friendV3LiveAssem2.LJJIJL(), new ARunnableS116S0100000_16(friendV3LiveAssem2, 114));
                                FriendsV3LivePlayerAbility friendsV3LivePlayerAbility = (FriendsV3LivePlayerAbility) friendV3LiveAssem2.LLLF.getValue();
                                if (friendsV3LivePlayerAbility == null) {
                                    return;
                                }
                                friendsV3LivePlayerAbility.k71((InterfaceC1588310rQz) friendV3LiveAssem2.LLLFZ.getValue(), false);
                            }
                        }
                    });
                } else {
                    interfaceC420801kMLJI = null;
                }
                friendV3LiveAssem.LLLII = interfaceC420801kMLJI;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility
    public final void df(boolean z) {
        C786410Ut5.LJLLLLLL(0, yp());
        FriendsV3LiveCellViewModel friendsV3LiveCellViewModelAp = Ap();
        Boolean boolValueOf = Boolean.valueOf(z);
        friendsV3LiveCellViewModelAp.getClass();
        friendsV3LiveCellViewModelAp.setState(new AwS603S0100000_24(boolValueOf, 13));
    }

    @Override // X.InterfaceC2175541ACi
    /* JADX INFO: renamed from: if */
    public final void mo29if(String str) {
        C0W17.LIZJ("FriendV3LiveAssem", "playComplete");
        tp(this);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility
    public final void m0(boolean z) {
        FriendsV3LiveCellTrackAbility friendsV3LiveCellTrackAbilityEp = Ep();
        if (friendsV3LiveCellTrackAbilityEp != null) {
            friendsV3LiveCellTrackAbilityEp.oX1(z);
        }
    }

    @C14EU
    public final void onEvent(C0IHI c0ihi) {
        LiveRoomStruct liveRoomStructBp = Bp();
        if (liveRoomStructBp != null && liveRoomStructBp.id == c0ihi.LIZ) {
            C1599640rjG.LIZIZ.Yu(LJIIIIZZ().getAid());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated: load image ");
        sbLIZ.append(hashCode());
        C0W17.LIZJ("FriendV3LiveAssem", C2188811AlT.LIZIZ(sbLIZ));
        up().setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        RadiusLayout radiusLayoutUp = up();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        radiusLayoutUp.LIZIZ(iIntValue, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 0, 0);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 384));
        C426750GoL.LJIIIZ(LJJIJL(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0s0B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1610110s09) obj).LL;
            }
        }, null, AFwS321S0000000_33.get$arr$(22), 6);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0s0A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1610110s09) obj).LLILLJJLI);
            }
        }, null, AFwS300S0000000_16.get$arr$(54), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028c A[PHI: r4
      0x028c: PHI (r4v3 com.ss.android.ugc.aweme.base.model.UrlModel) = (r4v2 com.ss.android.ugc.aweme.base.model.UrlModel), (r4v4 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:18:0x00b9, B:79:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendV3LiveAssem.tp(java.lang.Object):void");
    }

    public final void sp(LiveRoomStruct liveRoomStruct) {
        String string;
        String str;
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJLLIL.getValue(), 0);
        if (liveRoomStruct != null && (str = liveRoomStruct.title) != null) {
            ((TextView) this.LLJLLIL.getValue()).setText(str);
            return;
        }
        TextView textView = (TextView) this.LLJLLIL.getValue();
        Context context = getContext();
        if (context != null) {
            string = context.getString(2131855012);
        } else {
            string = null;
        }
        textView.setText(string);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // X.InterfaceC2175541ACi
    public final void w9(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playerMediaError: ");
        sbLIZ.append(str);
        C0W17.LIZJ("FriendV3LiveAssem", C2188811AlT.LIZIZ(sbLIZ));
        tp(this);
    }
}
