package com.bytedance.android.livesdk.adminsetting;

import X.C01C7;
import X.C01GW;
import X.C09JN;
import X.C0HB0;
import X.C0IJT;
import X.C0IUA;
import X.C0TYU;
import X.C0TZE;
import X.C0UF5;
import X.C0UIM;
import X.C0UX6;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C13E8;
import X.C13LP;
import X.C16F5;
import X.C1701940uOG;
import X.C1834150xpV;
import X.C20441214yg;
import X.C20484615Do;
import X.C20743716Ff;
import X.C23250099c;
import X.C292401Bi;
import X.C356901a3;
import X.C470590Icr;
import X.C474500IjA;
import X.C475020Ik0;
import X.C488040JBy;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751130TdH;
import X.C753430Tgz;
import X.C758130ToZ;
import X.C781520UlC;
import X.C786410Ut5;
import X.EnumC748580TYa;
import X.InterfaceC20484815Dq;
import X.InterfaceC499980JjA;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import Y.AfS63S0400000_12;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.EchoModeChannel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelRequest;
import com.bytedance.android.livesdk.chatroom.model.GetSettingPanelResponse;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAutoShareBBSwitchEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AiLiveSummarySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.highlight.LiveRecordingsSettingsEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.ReminderWordQueryStatusRequest;
import tikcast.api.anchor.ReminderWordQueryStatusResponse;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.InGameInfo;
import webcast.data.AnchorReminderWordStatus;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAdminSettingGuideAdapter implements InterfaceC499980JjA, GenericLifecycleObserver {
    public final Fragment LL;
    public final DataChannel LLILLJJLI;
    public final C20484615Do LLILLL;
    public final LifecycleOwner LLILZ;
    public final FragmentManager LLILZIL;
    public C0TYU LLILZLL;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJI;
    public boolean LLJIJIL;
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 89));
    public final C13E8<Pair<EnumC748580TYa, InterfaceC20484815Dq>> LLJ = new C13E8<>();

    @Override // X.InterfaceC499980JjA
    public final void init() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC499980JjA
    public final void CY0(View view) {
        if (LIZJ() && LiveMarkViewerOptimizationSetting.INSTANCE.getValue()) {
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            LIZLLL("show");
            if (view != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 77), view);
            }
        }
    }

    public final void LIZLLL(String str) {
        String str2;
        Room room;
        LiveMode streamType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_icon");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJ(str);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            str2 = streamType.logStreamingType;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    @Override // X.InterfaceC499980JjA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ON1(android.view.View r4) {
        /*
            r3 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LLILLJJLI
            r2 = 0
            if (r1 == 0) goto Ld
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r2 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
        Ld:
            if (r4 == 0) goto L57
            boolean r0 = r3.LIZJ()
            if (r0 == 0) goto L48
            if (r2 == 0) goto L48
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
            if (r0 == 0) goto L48
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
            r1 = 0
            if (r0 == 0) goto L4a
            int r0 = r0.getGiftRankSwitchStatus()
            if (r0 != 0) goto L4a
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
            if (r0 == 0) goto L4a
            int r0 = r0.ecRankSwitchStatus
            if (r0 != 0) goto L4a
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
            if (r0 == 0) goto L4a
            int r0 = r0.gamerankingswitch
            if (r0 != 0) goto L4a
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r2.getRoomAuthStatus()
            if (r0 == 0) goto L4a
            int r0 = r0.friendrankswitch
            if (r0 != 0) goto L4a
        L48:
            r1 = 8
        L4a:
            X.C786410Ut5.LJLLLLLL(r1, r4)
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 79
            r1.<init>(r3, r0)
            X.C786410Ut5.I7(r1, r4)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter.ON1(android.view.View):void");
    }

    @Override // X.InterfaceC499980JjA
    public final void OZ(View view) {
        boolean z;
        if (!LIZJ()) {
            if (C488040JBy.LIZ(3)) {
                LJI("show", "block_accounts");
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        C500260Jjc.LJLJLJ(view, z);
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 75), view);
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void Ol1(View view) {
        if (LIZJ() && LiveRecordingsSettingsEnableSetting.INSTANCE.enable()) {
            if (view != null) {
                C500260Jjc.LLFFF(view);
            }
            C01C7.LIZIZ(new ACListenerS147S0100000_12(this, 76), view);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_set_page_live_recording_show");
            c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_earphone_monitor_effective_switch");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII(Integer.valueOf(Boolean.compare(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getEchoHelper().LJI(), false)), "earphone_status");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC499980JjA
    public final void onHiddenChanged(boolean z) {
        int i;
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            C758130ToZ c758130ToZLJ = C0UF5.LJ();
            if (c758130ToZLJ != null && c758130ToZLJ.LIZ) {
                i = 2131851024;
            } else {
                i = 2131851023;
            }
            c16f5.setText(C497740JfY.LJIJI(i));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        int i;
        C16F5 c16f5;
        String strLJIJI;
        C20441214yg.LIZIZ("ShareBB", "onResume");
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
        if (autoShareLiveCardToBulletinBoard != null && (i = autoShareLiveCardToBulletinBoard.switchStatus) > 0 && (c16f5 = this.LLIZLLLIL) != null) {
            if (i == 1) {
                strLJIJI = C497740JfY.LJIJI(2131851474);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131851473);
            }
            c16f5.setText(strLJIJI);
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void onViewCreated(View view) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_set_page_show");
        c474500IjALIZ.LJIL();
        if (C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(this.LLILLJJLI)))) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
        if (LiveHostSettingsUIConfig.enable()) {
            this.LLILZLL = new C0TYU(this.LLILLJJLI, "LiveAdminSettingGuideAdapter", AFwS199S0000000_12.get$arr$(0));
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.BQ2(this.LL, BroadcastDialogPageChannel.class, new AwS591S0100000_12(this, 146));
            }
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void sh1(View view) {
        Boolean boolValueOf;
        CreateInfoResponse.ResponseData responseDataI92;
        InGameInfo inGameInfo;
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if (iGameService != null && (responseDataI92 = iGameService.I92()) != null && (inGameInfo = responseDataI92.inGameInfo) != null) {
            boolValueOf = Boolean.valueOf(inGameInfo.showInGameRank);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && view != null && C500260Jjc.LJJJI(Boolean.valueOf(C0UIM.LJII()))) {
            C500260Jjc.LLFFF(view);
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 73), view);
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void tp0(View view) {
        boolean z;
        if (!LIZJ()) {
            if (C488040JBy.LIZ(2)) {
                LJI("show", "mute_accounts");
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        C500260Jjc.LJLJLJ(view, z);
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 78), view);
        }
    }

    public final void LJ(String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_red_dot");
        c474500IjALIZ.LIZ();
    }

    public final void LJFF(View view, View view2) {
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).lU0();
        if (C500260Jjc.LJJJI(Boolean.valueOf(C753430Tgz.LJIIJJI(this.LLILLJJLI)))) {
            C500260Jjc.LJLJLJ(view, true);
            if (view2 != null) {
                RedDotExtensionKt.LJI(view2, this.LLILZ, null, C0UX6.RED_DOT_AUDIENCE_MODERATOR_GUESSING_GAME, null);
            }
            if (view != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 80), view);
            }
            LJI("show", "guessing_game");
            return;
        }
        C500260Jjc.LJLJLJ(view, false);
    }

    public final void LJI(String str, String str2) {
        if (Intrinsics.LJFF(str2, "multi_guest_fun_kit")) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).el0(str);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_settings_page_icon");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII(str2, "settings_name");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC499980JjA
    public final void Oj1(View view, View view2) {
        C500260Jjc.LJLJLJ(view, LIZJ());
        if (view != null) {
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, view2, 12), view);
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void Wm2(View view, C16F5 c16f5) {
        Context context;
        if (HostAddLocationSetting.INSTANCE.enable() && (context = this.LL.getContext()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C751130TdH(this, view, c16f5, context, null), 3);
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void di0(View view, C20743716Ff c20743716Ff) {
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        if (c20743716Ff != null) {
            c20743716Ff.setToggleEnabled(false);
        }
        if (c20743716Ff != null) {
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            c20743716Ff.setEnabled(false);
            c20743716Ff.setDisabledAlpha(1.0f);
        }
        C1834150xpV.LJIIJ(c20743716Ff, true);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.DQ2(EchoModeChannel.class, this, new AwS591S0100000_12(c20743716Ff, 144));
        }
        if (c20743716Ff != null) {
            C500260Jjc.LJLIIIL(500L, c20743716Ff, new AwS591S0100000_12(this, 145));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    @Override // X.InterfaceC499980JjA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qk1(android.view.View r6, android.view.View r7) {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LLILLJJLI
            if (r1 == 0) goto L81
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
        Lc:
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L7e
            com.bytedance.android.livesdk.message.proto.StarCommentConfig r0 = r0.starCommentConfig
            if (r0 == 0) goto L7e
            boolean r0 = r0.starCommentQualification
            if (r0 != r4) goto L7e
            X.14i1<java.util.Map<java.lang.String, java.lang.Boolean>> r0 = X.InterfaceC1106030et7.D4
            java.lang.Object r1 = r0.LIZIZ()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "1"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L7e
            if (r7 == 0) goto L51
            X.C500260Jjc.LLFFF(r7)
        L33:
            int r1 = r7.getVisibility()
            r0 = 8
            if (r1 != r0) goto L43
            X.0UX6 r2 = X.C0UX6.LIVE_BROADCAST_PREVIEW_COMMENT_SETTING
            androidx.lifecycle.LifecycleOwner r1 = r5.LLILZ
            r0 = 0
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJI(r7, r1, r0, r2, r0)
        L43:
            boolean r0 = r5.LIZJ()
            if (r0 == 0) goto L75
            X.0UX6 r2 = X.C0UX6.COMMUNITY_FLAG_COMMENT_SETTING
            androidx.lifecycle.LifecycleOwner r1 = r5.LLILZ
            r0 = 0
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJI(r7, r1, r0, r2, r0)
        L51:
            boolean r0 = r5.LIZJ()
            if (r0 != 0) goto L64
            boolean r0 = X.C488040JBy.LIZ(r4)
            if (r0 == 0) goto L65
            java.lang.String r1 = "show"
            java.lang.String r0 = "comment_settings"
            r5.LJI(r1, r0)
        L64:
            r3 = 1
        L65:
            X.C500260Jjc.LJLJLJ(r6, r3)
            if (r6 == 0) goto L74
            Y.ACListenerS116S0200000_12 r1 = new Y.ACListenerS116S0200000_12
            r0 = 11
            r1.<init>(r5, r7, r0)
            X.C786410Ut5.I7(r1, r6)
        L74:
            return
        L75:
            X.0UX6 r2 = X.C0UX6.COMMUNITY_FLAG_COMMENT_ADMIN_SETTING
            androidx.lifecycle.LifecycleOwner r1 = r5.LLILZ
            r0 = 0
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJI(r7, r1, r0, r2, r0)
            goto L51
        L7e:
            if (r7 == 0) goto L51
            goto L33
        L81:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter.qk1(android.view.View, android.view.View):void");
    }

    public final void LJII(View view, boolean z, boolean z2) {
        if (z && !LIZJ() && z2) {
            if (!C500260Jjc.LJJJJIZL(view)) {
                LJI("show", "multi_guest_fun_kit");
            }
            C500260Jjc.LJLJLJ(view, true);
            return;
        }
        C500260Jjc.LJLJLJ(view, false);
    }

    @Override // X.InterfaceC499980JjA
    public final void WN2(View view, View view2, C16F5 c16f5) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C0HB0(view, this, view2, c16f5, null), 3);
    }

    @Override // X.InterfaceC499980JjA
    public final void hd0(View view, C16F5 c16f5, C16F5 c16f52) {
        String str;
        List list;
        int i;
        if (AiLiveSummarySetting.INSTANCE.enable() && LIZJ()) {
            C500260Jjc.LLFFF(view);
            if (c16f5 != null) {
                C758130ToZ c758130ToZLJ = C0UF5.LJ();
                if (c758130ToZLJ != null && c758130ToZLJ.LIZ) {
                    i = 2131851024;
                } else {
                    i = 2131851023;
                }
                c16f5.setText(C497740JfY.LJIJI(i));
            }
            this.LLJI = c16f5;
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null && (list = (List) dataChannel.gg0(C0TZE.class)) != null) {
                str = (String) C13LP.LJJJLL(list);
            } else {
                str = null;
            }
            if (C500260Jjc.LJJIIZ(str)) {
                C500260Jjc.LLFFF(c16f52);
                if (c16f52 != null) {
                    c16f52.setText(C497740JfY.LJIJJ(2131851018, str));
                }
            }
            if (view != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 74), view);
            }
        }
    }

    @Override // X.InterfaceC499980JjA
    public final void ww1(View view, View view2, C16F5 c16f5) {
        LiveMode liveMode;
        this.LLIZLLLIL = c16f5;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            } else {
                liveMode = null;
            }
            if (C781520UlC.LJIIJJI(liveMode)) {
                AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
                if (autoShareLiveCardToBulletinBoard == null) {
                    IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                    GetSettingPanelRequest getSettingPanelRequest = new GetSettingPanelRequest();
                    getSettingPanelRequest.scene = 2;
                    C11NZ<C470590Icr<GetSettingPanelResponse>> settingPanelByType = iBroadcastService.getSettingPanelByType(getSettingPanelRequest);
                    if (settingPanelByType != null) {
                        settingPanelByType.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS63S0400000_12(view, this, c16f5, view2, 0));
                        return;
                    }
                    return;
                }
                LIZ(view, c16f5, view2, autoShareLiveCardToBulletinBoard);
            }
        }
    }

    public LiveAdminSettingGuideAdapter(Fragment fragment, DataChannel dataChannel, C20484615Do c20484615Do, LifecycleOwner lifecycleOwner) {
        this.LL = fragment;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c20484615Do;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = fragment.getChildFragmentManager();
    }

    public final void LIZ(View view, C16F5 c16f5, View view2, AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard) {
        String strLJIJI;
        if (view != null) {
            C500260Jjc.LLFFF(view);
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.BQ2(this.LLILZ, LiveAutoShareBBSwitchEvent.class, new AwS591S0100000_12(c16f5, 142));
            }
            RedDotExtensionKt.LJI(view2, this.LLILZ, null, C0UX6.SHARE_TO_BB_SETTING_REDDOT, new AwS591S0100000_12(this, 143));
            if (c16f5 != null) {
                if (autoShareLiveCardToBulletinBoard.switchStatus == 1) {
                    strLJIJI = C497740JfY.LJIJI(2131851474);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131851473);
                }
                c16f5.setText(strLJIJI);
            }
            C500260Jjc.LJLIIIL(500L, view, new AwS378S0200000_12(view2, this, 13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.view.View r7, X.C16F5 r8, android.content.Context r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C751140TdI
            if (r0 == 0) goto Lb8
            r5 = r10
            X.0TdI r5 = (X.C751140TdI) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r3 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r2 = 1
            if (r0 == 0) goto L9c
            if (r0 != r2) goto Lbf
            java.lang.Object r9 = r5.LLILLL
            android.content.Context r9 = (android.content.Context) r9
            X.16F5 r8 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            android.view.View r7 = (android.view.View) r7
            X.C155000ia.LIZIZ(r3)
        L2c:
            com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings r3 = (com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings) r3
            if (r3 == 0) goto L93
            X.0Tfs r1 = X.C752740Tfs.LIZ
            boolean r0 = r3.hideIcon
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.getClass()
            X.C752740Tfs.LIZLLL = r0
            boolean r0 = r3.hideIcon
            if (r0 != 0) goto L93
            X.0Tfs r1 = X.C752740Tfs.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.getClass()
            X.C752740Tfs.LIZLLL = r0
            java.lang.String r0 = r3.location
            X.C752740Tfs.LIZJ = r0
            X.C500260Jjc.LLFFF(r7)
            if (r7 == 0) goto L61
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 81
            r1.<init>(r6, r0)
            X.C786410Ut5.I7(r1, r7)
        L61:
            if (r9 == 0) goto L9a
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAppContext r0 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r0
            if (r0 == 0) goto L9a
            boolean r0 = r0.isLocationPermissionGranted(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L9a
            boolean r1 = r0.booleanValue()
        L7b:
            int r0 = X.C752740Tfs.LIZIZ
            if (r1 == 0) goto L96
            if (r0 == r2) goto L96
            java.lang.String r0 = r3.location
            int r0 = r0.length()
            if (r0 <= 0) goto L96
            X.C500260Jjc.LLFFF(r8)
            if (r8 == 0) goto L93
            java.lang.String r0 = r3.location
            r8.setText(r0)
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L96:
            X.C500260Jjc.LJIILIIL(r8)
            goto L93
        L9a:
            r1 = 0
            goto L7b
        L9c:
            X.C155000ia.LIZIZ(r3)
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r1 = (com.bytedance.android.live.function.IRoomFunctionService) r1
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LLILLJJLI
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILLL = r9
            r5.LLILZLL = r2
            java.lang.Object r3 = r1.Zq0(r0, r5)
            if (r3 != r4) goto L2c
            return r4
        Lb8:
            X.0TdI r5 = new X.0TdI
            r5.<init>(r6, r10)
            goto L12
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter.LJIIIIZZ(android.view.View, X.16F5, android.content.Context, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC499980JjA
    public final void ne2(final View view, final C16F5 c16f5, final C16F5 c16f52, final C20743716Ff c20743716Ff) {
        LiveMode liveMode;
        if (view != null) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            } else {
                liveMode = null;
            }
            if (C781520UlC.LJIIJJI(liveMode)) {
                AnchorReminderWordStatus anchorReminderWordStatus = C0UF5.LJ;
                if (anchorReminderWordStatus == null) {
                    IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                    ReminderWordQueryStatusRequest reminderWordQueryStatusRequest = new ReminderWordQueryStatusRequest();
                    reminderWordQueryStatusRequest.scene = "agency_platform";
                    C11NZ<ReminderWordQueryStatusResponse> reminderWordStatus = iBroadcastService.getReminderWordStatus(reminderWordQueryStatusRequest);
                    if (reminderWordStatus != null) {
                        reminderWordStatus.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0Tgg
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                AnchorReminderWordStatus anchorReminderWordStatus2;
                                AnchorReminderWordStatus anchorReminderWordStatus3;
                                C1C7U.LIZ("LiveAdminSettingGuideAdapter@ff9f.initManagerCue$result$1");
                                ReminderWordQueryStatusResponse.ResponseData responseData = ((ReminderWordQueryStatusResponse) obj).data;
                                if (responseData != null) {
                                    anchorReminderWordStatus2 = responseData.reminderWordStatus;
                                } else {
                                    anchorReminderWordStatus2 = null;
                                }
                                C0UF5.LJ = anchorReminderWordStatus2;
                                if (responseData != null && (anchorReminderWordStatus3 = responseData.reminderWordStatus) != null) {
                                    this.LL.LIZIZ(view, c16f5, c16f52, c20743716Ff, anchorReminderWordStatus3);
                                }
                                C1C7U.LIZIZ("LiveAdminSettingGuideAdapter@ff9f.initManagerCue$result$1");
                            }
                        });
                        return;
                    }
                    return;
                }
                LIZIZ(view, c16f5, c16f52, c20743716Ff, anchorReminderWordStatus);
            }
        }
    }

    public final void LIZIZ(View view, C16F5 c16f5, C16F5 c16f52, C20743716Ff c20743716Ff, AnchorReminderWordStatus anchorReminderWordStatus) {
        boolean z;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        if (c16f5 != null) {
            c16f5.setText(anchorReminderWordStatus.title);
        }
        if (c16f52 != null) {
            c16f52.setText(anchorReminderWordStatus.desc);
        }
        if (c20743716Ff != null) {
            c20743716Ff.setToggleEnabled(false);
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            if (anchorReminderWordStatus.status == 1) {
                z = true;
            } else {
                z = false;
            }
            c20743716Ff.setChecked(z);
            c20743716Ff.setEnabled(false);
            c20743716Ff.setDisabledAlpha(1.0f);
            C1834150xpV.LJIIJ(c20743716Ff, true);
            C500260Jjc.LJLIIIL(500L, c20743716Ff, new AwS221S0300000_12(c20743716Ff, this, anchorReminderWordStatus, 1));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_switch_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII("live_detail_setting", "event_page");
        c474500IjALIZ.LJJII(Integer.valueOf(anchorReminderWordStatus.status), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC499980JjA
    public final void cW1(View view, C16F5 c16f5, CompoundButton compoundButton, View view2, FragmentManager fragmentManager, C20484615Do c20484615Do, DataChannel dataChannel) {
        if (!HostAddLocationSetting.INSTANCE.enable()) {
            C475020Ik0.LIZ(true, view, c16f5, compoundButton, view2, fragmentManager, c20484615Do, dataChannel);
        }
    }
}
