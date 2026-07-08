package wh6;

import X.AbstractC759330TqV;
import X.AbstractViewOnClickListenerC1637610siV;
import X.C0IJT;
import X.C0IR5;
import X.C0TZ0;
import X.C0TZ7;
import X.C0TZA;
import X.C0U4R;
import X.C0UDG;
import X.C0UX6;
import X.C1087000eOQ;
import X.C1148180fz6;
import X.C1161920gLG;
import X.C1841350y17;
import X.C19322110iZ;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C354201Zc;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C748790TYv;
import X.C748880TZe;
import X.C754480Tig;
import X.C759320TqU;
import X.C766270U4b;
import X.C770750ULh;
import X.C774850UaR;
import X.C781270Ukn;
import X.C784310Uph;
import X.C784320Upi;
import X.C786410Ut5;
import X.EnumC748580TYa;
import X.InterfaceC1106030et7;
import X.InterfaceC748700TYm;
import X.RunnableC776140UcW;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.adminsetting.LiveAddHotCommentMuteRuleSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsOptFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveMuteDurationSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRuleDurationFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.MarkViewerNotionFragment;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInGameRankBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidgetV1;
import com.bytedance.android.livesdk.broadcast.preview.widget.livemode.PreviewLiveModeListSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewPracticeModeFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewVideoQualityFragmentSheet;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageCloseInternal;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameInGameRankDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentBlockUrlSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.markviewer.AddMarkedViewerFragmentSheet;
import com.bytedance.android.livesdk.markviewer.MarkedViewerListFragmentSheet;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.explore.common.ExplorePreviewFragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.invitelink.InviteLinkContainerAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.tns.mixed.business.aigc.likeness.LikenessDetectionBottomReportComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.MuteRule;

/* JADX INFO: loaded from: classes13.dex */
public class AbS694S0100000_12 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            case 30:
                LIZ$30(this, view);
                break;
            case 31:
                LIZ$31(this, view);
                break;
            case 32:
                LIZ$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                LIZ$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                LIZ$34(this, view);
                break;
            case 35:
                LIZ$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                LIZ$36(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS694S0100000_12(C754480Tig c754480Tig, int i) {
        super(1500L);
        this.$t = i;
        this.l0 = c754480Tig;
    }

    public static final void LIZ$0(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C0TZ0 c0tz0MR = ((LiveCommentAddBlockKeywordsOptFragment) abS694S0100000_12.l0).MR();
            if (c0tz0MR.LLILZLL) {
                C500260Jjc.LJIILJJIL(c0tz0MR.getBlockWordEditEtFromXml());
            }
            if (Intrinsics.LJFF(((LiveCommentAddBlockKeywordsOptFragment) abS694S0100000_12.l0).LL, "from_broadcast_end")) {
                DataChannel dataChannelLJ = C475510Ikn.LJ((LiveCommentAddBlockKeywordsOptFragment) abS694S0100000_12.l0);
                if (dataChannelLJ != null) {
                    dataChannelLJ.LC0(BroadcastDialogPageCloseInternal.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            DataChannel dataChannelLJ2 = C475510Ikn.LJ((LiveCommentAddBlockKeywordsOptFragment) abS694S0100000_12.l0);
            if (dataChannelLJ2 == null) {
                return;
            }
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.BLOCK_KEYWORDS_OPT;
            enumC748580TYa.pre();
            dataChannelLJ2.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
    }

    public static final void LIZ$1(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0).getClass();
            C0TZ7 c0tz7 = C0TZ7.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0);
            c0tz7.getClass();
            if (C0TZ7.LIZIZ(dataChannelLJ) && dataChannelLJ != null) {
                dataChannelLJ.SX0(C0TZA.class, null);
            }
            if (Intrinsics.LJFF(((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0).LL, "from_broadcast_end")) {
                DataChannel dataChannelLJ2 = C475510Ikn.LJ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0);
                if (dataChannelLJ2 != null) {
                    dataChannelLJ2.LC0(BroadcastDialogPageCloseInternal.class, Boolean.TRUE);
                    return;
                }
                return;
            }
            DataChannel dataChannelLJ3 = C475510Ikn.LJ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0);
            if (dataChannelLJ3 == null) {
                return;
            }
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.COMMENT_SETTING;
            enumC748580TYa.pre();
            dataChannelLJ3.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
    }

    public static final void LIZ$10(AbS694S0100000_12 abS694S0100000_12, View view) {
        DataChannel dataChannelLJ;
        if (view != null && (dataChannelLJ = C475510Ikn.LJ((CommunityFlaggedManageSheetFragment) abS694S0100000_12.l0)) != null) {
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.FILTER_COMMENT;
            enumC748580TYa.pre();
            dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$11(wh6.AbS694S0100000_12 r10, android.view.View r11) {
        /*
            if (r11 == 0) goto L90
            java.lang.Object r0 = r10.l0
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r0 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LLJLLL
            r3 = 0
            if (r1 == 0) goto L9f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel> r0 = com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel.class
            java.lang.Object r9 = r1.gg0(r0)
            X.0Toi r9 = (X.C758220Toi) r9
            if (r9 == 0) goto La0
            int r6 = r9.LIZ
        L17:
            java.lang.Object r0 = r10.l0
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r0 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LLJLLL
            r5 = 1
            if (r1 == 0) goto L9d
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.GroupChatGoLiveAutoApproveSwitch> r0 = com.bytedance.android.livesdk.dataChannel.GroupChatGoLiveAutoApproveSwitch.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L9d
            boolean r8 = r0.booleanValue()
        L2e:
            r7 = 2
            if (r6 != r7) goto L74
            java.lang.Object r0 = r10.l0
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r0 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r0
            boolean r0 = r0.LLLFF
            if (r0 != 0) goto L74
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.api.BroadcastRoomApi> r0 = com.bytedance.android.livesdk.api.BroadcastRoomApi.class
            r1.getClass()
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.api.BroadcastRoomApi r4 = (com.bytedance.android.livesdk.api.BroadcastRoomApi) r4
            com.bytedance.android.livesdk.chatroom.model.UpsertRoomVisibleScopeRequest r3 = new com.bytedance.android.livesdk.chatroom.model.UpsertRoomVisibleScopeRequest
            r3.<init>()
            com.bytedance.android.livesdkapi.depend.model.live.RoomVisibleScope r2 = new com.bytedance.android.livesdkapi.depend.model.live.RoomVisibleScope
            r2.<init>()
            r2.visibleScopeType = r7
            if (r9 == 0) goto L97
            java.util.List<java.lang.Long> r1 = r9.LIZIZ
            if (r1 == 0) goto L97
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
        L5f:
            r2.visibleUserIdList = r0
            if (r9 == 0) goto L91
            java.util.List<java.lang.Long> r1 = r9.LIZLLL
            if (r1 == 0) goto L91
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
        L6c:
            r2.visibleChatIdList = r0
            r3.visibleScope = r2
            X.11NZ r3 = r4.upsertRoomVisibleScope(r3)
        L74:
            java.lang.Object r0 = r10.l0
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r0 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r0
            X.0sYq<? super java.lang.Integer, ? super java.lang.Boolean, ? super X.11NZ<?>, kotlin.Unit> r2 = r0.LLLF
            if (r2 == 0) goto L87
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2.invoke(r1, r0, r3)
        L87:
            java.lang.Object r0 = r10.l0
            com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet r0 = (com.bytedance.android.livesdk.broadcast.preview.onetap.entrance.GroupChatGoLiveSettingSheet) r0
            X.15Do r0 = r0.LLJJIJIL
            r0.LIZ(r5)
        L90:
            return
        L91:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L6c
        L97:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L5f
        L9d:
            r8 = 1
            goto L2e
        L9f:
            r9 = r3
        La0:
            r6 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS694S0100000_12.LIZ$11(wh6.AbS694S0100000_12, android.view.View):void");
    }

    public static final void LIZ$12(AbS694S0100000_12 abS694S0100000_12, View view) {
        FragmentManager fragmentManager;
        if (view != null) {
            DataChannel dataChannel = ((PreviewInGameRankBannerWidget) abS694S0100000_12.l0).dataChannel;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                LiveDialogFragment liveDialogFragment = ((PreviewInGameRankBannerWidget) abS694S0100000_12.l0).LLJILJILJ;
                if (liveDialogFragment != null) {
                    liveDialogFragment.dismissAllowingStateLoss();
                }
                ((PreviewInGameRankBannerWidget) abS694S0100000_12.l0).LLJILJILJ = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).BQ1();
                LiveDialogFragment liveDialogFragment2 = ((PreviewInGameRankBannerWidget) abS694S0100000_12.l0).LLJILJILJ;
                if (liveDialogFragment2 != null) {
                    liveDialogFragment2.show(fragmentManager, "GameInGameRankDialog");
                }
            }
            if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
                ((PreviewInGameRankBannerWidget) abS694S0100000_12.l0).L1();
            }
        }
    }

    public static final void LIZ$13(AbS694S0100000_12 abS694S0100000_12, View view) {
        C19EG c19egLJ;
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        if (view != null && (c19egLJ = C500260Jjc.LJ(((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LL.getContext())) != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_click_live_recording_icon");
            c474500IjALIZ.LJIJJLI(((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI);
            DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI;
            if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "anchor_id");
            c474500IjALIZ.LIZ();
            if (Intrinsics.LJFF(((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLJILJILJ, "auto_scroll_item_live_recordings_settings_popup")) {
                RedDotExtensionKt.LIZ(C0UX6.LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_WITH_POPUP);
                ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LJJJJJ(c19egLJ);
            } else if (Intrinsics.LJFF(((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLJILJILJ, "auto_scroll_item_live_recordings_settings_red_dot")) {
                RedDotExtensionKt.LIZ(C0UX6.LIVE_AUTO_POST_LIVING_PREVIEW_SETTING_GUIDE_DIRECT);
                ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LJJJJJ(c19egLJ);
            } else {
                RedDotExtensionKt.LIZ(C0UX6.LIVE_REPLAY_SETTINGS_GUIDE);
                ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).getClass();
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openLiveReplaySettings(c19egLJ, 1, false, "livetake_icon");
            }
            ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLJILJILJ = "";
        }
    }

    public static final void LIZ$14(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            BasePreviewSettingMainFragmentSheetInitializer.LJIJJ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0, "click");
            MarkedViewerListFragmentSheet markedViewerListFragmentSheetI31 = C781270Ukn.LJIL().I31();
            if (markedViewerListFragmentSheetI31 != null) {
                ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLL.LJIIJ(markedViewerListFragmentSheetI31, "marked_viewer_list");
            }
        }
    }

    public static final void LIZ$15(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_setting_practice_mode_click");
            ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).getClass();
            c474500IjALIZ.LJJII("1", "is_new_anchor");
            ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).getClass();
            c474500IjALIZ.LJJII("1", "has_enter_trymode");
            c474500IjALIZ.LJJIJL();
            DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI;
            if (dataChannel != null && dataChannel.gg0(PreviewBlockInfoChannel.class) != null) {
                C0U4R c0u4r = new C0U4R();
                c0u4r.LIZLLL = 2131842602;
                c0u4r.LIZJ = "pm_liveTryMode_goLivePage_noAccessToast";
                c0u4r.LJII = ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI;
                c0u4r.LJFF = true;
                C766270U4b.LJIIJ(c0u4r);
                return;
            }
            ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLL.LJIIIZ(PreviewPracticeModeFragmentSheet.class, "practice_mode", null, null);
        }
    }

    public static final void LIZ$16(AbS694S0100000_12 abS694S0100000_12, View view) {
        String strLIZ;
        LiveMode liveMode;
        if (view != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ranking_icon_click");
            c474500IjALIZ.LJIJJLI(((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI);
            DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
                strLIZ = C354201Zc.LIZ(liveMode);
            } else {
                strLIZ = null;
            }
            c474500IjALIZ.LJJII(strLIZ, "live_type");
            c474500IjALIZ.LIZ();
            DataChannelGlobal.LLILZ.JQ2(C1148180fz6.class, "live_page_setting");
            DataChannel dataChannel2 = ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLJJLI;
            if (dataChannel2 != null && dataChannel2.gg0(BroadcastSettingResponseChannel.class) != null) {
                ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLL.LJIIJ(((IRankService) C1161920gLG.LIZJ(IRankService.class)).LV(), "preview_ranking_setting");
            }
        }
    }

    public static final void LIZ$17(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LLILLL.LJIIIZ(PreviewVideoQualityFragmentSheet.class, "preview_video_quality", null, null);
        }
    }

    public static final void LIZ$18(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            GameInGameRankDialog gameInGameRankDialogBQ1 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).BQ1();
            if (gameInGameRankDialogBQ1 != null) {
                gameInGameRankDialogBQ1.show(((BasePreviewSettingMainFragmentSheetInitializer) abS694S0100000_12.l0).LL.getChildFragmentManager(), "GameInGameRankDialog");
            }
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_PREVIEW_SETTING_IN_GAME_RANK);
        }
    }

    public static final void LIZ$19(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C1841350y17 c1841350y17 = ((LiveVisibleScopeSettingFragment) abS694S0100000_12.l0).LLILZLL;
            if (c1841350y17 != null && c1841350y17.isChecked()) {
                return;
            }
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12((LiveVisibleScopeSettingFragment) abS694S0100000_12.l0, 194);
            LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) abS694S0100000_12.l0;
            if (liveVisibleScopeSettingFragment.MR(liveVisibleScopeSettingFragment.LLILZLL, 3, null, true)) {
                return;
            }
            awS556S0100000_12.invoke();
        }
    }

    public static final void LIZ$2(AbS694S0100000_12 abS694S0100000_12, View view) {
        boolean zBooleanValue;
        if (view != null) {
            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
            Context context = ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0).getContext();
            if (context != null) {
                iActionHandlerService.handle(context, LiveCommentBlockUrlSetting.INSTANCE.getValue());
                C0TZ7 c0tz7 = C0TZ7.LIZ;
                if (((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0).OR() == null) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = ((Boolean) ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0).LLIZ.getValue()).booleanValue();
                }
                DataChannel dataChannelLJ = C475510Ikn.LJ((LiveCommentBlockKeywordsOptFragment) abS694S0100000_12.l0);
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("entrance", "view_keywords"));
                c0tz7.getClass();
                C0TZ7.LIZLLL(dataChannelLJ, "keyword_help_text_click", mapLIZJ, zBooleanValue);
            }
        }
    }

    public static final void LIZ$20(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((GameInGameRankDialog) abS694S0100000_12.l0).dismiss();
        }
    }

    public static final void LIZ$21(AbS694S0100000_12 abS694S0100000_12, View view) {
        Function1<? super Boolean, Unit> function1;
        if (view != null && (function1 = ((C754480Tig) abS694S0100000_12.l0).LLILLL) != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    public static final void LIZ$22(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            AddMarkedViewerFragmentSheet addMarkedViewerFragmentSheet = (AddMarkedViewerFragmentSheet) abS694S0100000_12.l0;
            if (addMarkedViewerFragmentSheet.LLJL == null) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(addMarkedViewerFragmentSheet);
                if (dataChannelLJ != null) {
                    EnumC748580TYa enumC748580TYa = EnumC748580TYa.MARKED_VIEWER_LIST;
                    enumC748580TYa.pre();
                    dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
                    return;
                }
                return;
            }
            addMarkedViewerFragmentSheet.sl();
        }
    }

    public static final void LIZ$23(AbS694S0100000_12 abS694S0100000_12, View view) {
        String str;
        String str2;
        LiveMode liveMode;
        if (view != null) {
            MarkedViewerListFragmentSheet markedViewerListFragmentSheet = (MarkedViewerListFragmentSheet) abS694S0100000_12.l0;
            markedViewerListFragmentSheet.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_pannel_faq_click");
            c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(markedViewerListFragmentSheet));
            DataChannel dataChannelLJ = C475510Ikn.LJ(markedViewerListFragmentSheet);
            if (dataChannelLJ != null && (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) != null) {
                str = liveMode.logStreamingType;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJ(str);
            if (markedViewerListFragmentSheet.LLLF) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_empty");
            c474500IjALIZ.LIZ();
            FragmentManager parentFragmentManager = ((MarkedViewerListFragmentSheet) abS694S0100000_12.l0).getParentFragmentManager();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "mark_viewer_panel", bundle);
            C19322110iZ.LIZLLL(parentFragmentManager, MarkViewerNotionFragment.class, "mark_viewer_notion", null, bundle);
        }
    }

    public static final void LIZ$24(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            MarkedViewerListFragmentSheet markedViewerListFragmentSheet = (MarkedViewerListFragmentSheet) abS694S0100000_12.l0;
            if (markedViewerListFragmentSheet.LLJL == null) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(markedViewerListFragmentSheet);
                if (dataChannelLJ != null) {
                    EnumC748580TYa enumC748580TYa = EnumC748580TYa.GUIDE;
                    enumC748580TYa.pre();
                    dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
                    return;
                }
                return;
            }
            markedViewerListFragmentSheet.sl();
        }
    }

    public static final void LIZ$25(AbS694S0100000_12 abS694S0100000_12, View view) {
        LikenessDetectionBottomReportComponent likenessDetectionBottomReportComponent;
        Context context;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        Aweme awemeLJIIIIZZ;
        Fragment fragmentLJI;
        FragmentManager childFragmentManager;
        if (view != null && (context = (likenessDetectionBottomReportComponent = (LikenessDetectionBottomReportComponent) abS694S0100000_12.l0).getContext()) != null && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) likenessDetectionBottomReportComponent.LL.getValue()) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null && (fragmentLJI = C724240Sb0.LJI(likenessDetectionBottomReportComponent)) != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            C20684815ws.LJIILLIIL("likeness_detection_report_bottom_sheet_show", C2097608Jq.LJIIIIZZ(new Pair("item_type", "posts"), new Pair("item_id", awemeLJIIIIZZ.getAid()), new Pair("from_source", "item_play_page")));
            C770750ULh c770750ULh = new C770750ULh();
            c770750ULh.LJ = context.getString(2131826261);
            c770750ULh.LJFF = context.getString(2131826260);
            c770750ULh.LJI(context.getString(2131826259), new AwS387S0200000_21(awemeLJIIIIZZ, likenessDetectionBottomReportComponent, 49));
            c770750ULh.LJII(context.getString(2131826258), new AwS378S0200000_12(awemeLJIIIIZZ, likenessDetectionBottomReportComponent, 54));
            c770750ULh.LIZIZ().LIZ.show(childFragmentManager, "likeness_report_sheet");
        }
    }

    public static final void LIZ$26(AbS694S0100000_12 abS694S0100000_12, View view) {
        Long lValueOf;
        String resourceId;
        int source;
        String str;
        if (view != null) {
            C0UDG c0udg = (C0UDG) abS694S0100000_12.l0;
            c0udg.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_info_click");
            c474500IjALIZ.LJIL();
            LiveEffect liveEffect = c0udg.LLILLJJLI;
            String name = null;
            if (liveEffect != null) {
                lValueOf = Long.valueOf(liveEffect.getEffectId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "sticker_id");
            LiveEffect liveEffect2 = c0udg.LLILLJJLI;
            if (liveEffect2 != null) {
                resourceId = liveEffect2.getResourceId();
            } else {
                resourceId = null;
            }
            c474500IjALIZ.LJJII(resourceId, "resource_id");
            LiveEffect liveEffect3 = c0udg.LLILLJJLI;
            if (liveEffect3 != null) {
                name = liveEffect3.getName();
            }
            c474500IjALIZ.LJJII(name, "sticker_name");
            LiveEffect liveEffect4 = c0udg.LLILLJJLI;
            if (liveEffect4 != null) {
                source = liveEffect4.getSource();
            } else {
                source = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(source), "source");
            if (c0udg.LLILZ) {
                str = "done";
            } else {
                str = "failed";
            }
            c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LIZ();
            Function0<Unit> function0 = ((C0UDG) abS694S0100000_12.l0).LLILLL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$27(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            InterfaceC748700TYm interfaceC748700TYm = ((C0TZ0) abS694S0100000_12.l0).LLJIJIL;
            if (interfaceC748700TYm != null) {
                interfaceC748700TYm.LIZIZ();
            }
            C0TZ7 c0tz7 = C0TZ7.LIZ;
            boolean z = ((C0TZ0) abS694S0100000_12.l0).LLJI;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("entrance", "add_keywords"));
            c0tz7.getClass();
            C0TZ7.LIZLLL(null, "keyword_help_text_click", mapLIZJ, z);
        }
    }

    public static final void LIZ$28(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C0TZ7 c0tz7 = C0TZ7.LIZ;
            boolean z = ((C748790TYv) abS694S0100000_12.l0).LLJJI;
            c0tz7.getClass();
            C0TZ7.LIZLLL(null, "keyword_search", null, z);
        }
    }

    public static final void LIZ$29(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((C748790TYv) abS694S0100000_12.l0).LJI();
        }
    }

    public static final void LIZ$3(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((C759320TqU) ((AbstractC759330TqV) abS694S0100000_12.l0)).LLIZLLLIL.setChecked(!((C759320TqU) r2).LLIZLLLIL.isChecked());
        }
    }

    public static final void LIZ$30(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((C748790TYv) abS694S0100000_12.l0).LJI();
        }
    }

    public static final void LIZ$31(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            PreviewLiveModeListSheetFragment previewLiveModeListSheetFragment = new PreviewLiveModeListSheetFragment();
            C19322110iZ.LJFF((FragmentManager) ((PreviewLiveModeWidgetV1) abS694S0100000_12.l0).dataChannel.gg0(C748880TZe.class), previewLiveModeListSheetFragment, "preview_live_mode_list", null, 0);
            ArrayList<C784310Uph> arrayList = ((PreviewLiveModeWidgetV1) abS694S0100000_12.l0).LLILZ;
            C784320Upi c784320Upi = (C784320Upi) previewLiveModeListSheetFragment.LLJZ.getValue();
            ((ArrayList) c784320Upi.LLILLL).clear();
            ((ArrayList) c784320Upi.LLILLL).addAll(arrayList);
            c784320Upi.notifyDataSetChanged();
            for (C784310Uph c784310Uph : arrayList) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_type_entrance_show");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LJJII(C354201Zc.LIZ(c784310Uph.LIZLLL), "show_live_type");
                c474500IjALIZ.LIZ();
            }
            C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_PREVIEW_VOICE_CHAT;
            RedDotExtensionKt.LJIIL(c0ux6, "fixed", c0ux6.getCurrentId());
            RedDotExtensionKt.LJI(null, previewLiveModeListSheetFragment, null, c0ux6, new AwS378S0200000_12((List) arrayList, (List<C784310Uph>) previewLiveModeListSheetFragment, (PreviewLiveModeListSheetFragment) 121));
        }
    }

    public static final void LIZ$32(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null && ((RunnableC776140UcW) abS694S0100000_12.l0).getCollapse()) {
            C774850UaR.LIZJ("unfold", true);
            ((RunnableC776140UcW) abS694S0100000_12.l0).LJFF();
        }
    }

    public static final void LIZ$33(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C774850UaR.LIZJ("ball", ((RunnableC776140UcW) abS694S0100000_12.l0).getCollapse());
            LiveRecordManager liveRecordManager = LiveRecordManager.LL;
            liveRecordManager.getClass();
            if (LiveRecordManager.LLILZ) {
                liveRecordManager.getClass();
                LiveRecordManager.LJ("manual", true, false);
            } else {
                LiveRecordManager.LIZJ(0, "floating_ball");
            }
        }
    }

    public static final void LIZ$34(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C774850UaR.LIZJ("cross", ((RunnableC776140UcW) abS694S0100000_12.l0).getCollapse());
            Function0<Unit> function0 = ((RunnableC776140UcW) abS694S0100000_12.l0).LLJJIJIIJIL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void LIZ$35(AbS694S0100000_12 abS694S0100000_12, View view) {
        C19EG activity;
        if (view != null && (activity = ((ExplorePreviewFragment) abS694S0100000_12.l0).getActivity()) != null) {
            activity.finish();
        }
    }

    public static final void LIZ$36(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((InviteLinkContainerAssem) abS694S0100000_12.l0).Go().yQ2();
        }
    }

    public static final void LIZ$4(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((LiveAddHotCommentMuteRuleSheet) abS694S0100000_12.l0).close(1);
        }
    }

    public static final void LIZ$5(AbS694S0100000_12 abS694S0100000_12, View view) {
        String string;
        if (view != null) {
            FragmentManager fragmentManager = ((LiveAddHotCommentMuteRuleSheet) abS694S0100000_12.l0).getFragmentManager();
            LiveMuteRuleDurationFragmentSheet liveMuteRuleDurationFragmentSheet = new LiveMuteRuleDurationFragmentSheet();
            MuteRule muteRule = new MuteRule();
            Bundle arguments = ((LiveAddHotCommentMuteRuleSheet) abS694S0100000_12.l0).getArguments();
            if (arguments == null || (string = arguments.getString("content")) == null) {
                string = "";
            }
            muteRule.content = string;
            LiveAddHotCommentMuteRuleSheet liveAddHotCommentMuteRuleSheet = (LiveAddHotCommentMuteRuleSheet) abS694S0100000_12.l0;
            muteRule.durationSecond = liveAddHotCommentMuteRuleSheet.LLJZ;
            liveMuteRuleDurationFragmentSheet.LLLFF = muteRule;
            liveMuteRuleDurationFragmentSheet.LLLFZ = true;
            liveMuteRuleDurationFragmentSheet.LLLFFI = liveAddHotCommentMuteRuleSheet;
            C19322110iZ.LJFF(fragmentManager, liveMuteRuleDurationFragmentSheet, "live_mute_rule_duration_dialog", null, 0);
        }
    }

    public static final void LIZ$6(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            C0TZ7 c0tz7 = C0TZ7.LIZ;
            DataChannel dataChannelLJ = C475510Ikn.LJ((LiveCommentSettingFragmentSheet) abS694S0100000_12.l0);
            c0tz7.getClass();
            if (C0TZ7.LIZIZ(dataChannelLJ)) {
                ((LiveCommentSettingFragmentSheet) abS694S0100000_12.l0).LLJJIJIL.LJIIIZ(LiveCommentBlockKeywordsOptFragmentSheet.class, "live_comment_block_keywords", null, null);
            } else {
                ((LiveCommentSettingFragmentSheet) abS694S0100000_12.l0).LLJJIJIL.LJIIIZ(LiveCommentBlockKeywordsFragmentSheet.class, "live_comment_block_keywords", null, null);
            }
        }
    }

    public static final void LIZ$7(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((LiveCommentSettingFragmentSheet) abS694S0100000_12.l0).LLJJIJIL.LJIIIZ(LiveMuteDurationSettingFragmentSheet.class, "live_mute_duration_setting", null, null);
            InterfaceC1106030et7.C4.LJFF(Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[PHI: r0
      0x0036: PHI (r0v6 android.view.View) = (r0v5 android.view.View), (r0v17 android.view.View) binds: [B:7:0x0023, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$8(wh6.AbS694S0100000_12 r5, android.view.View r6) {
        /*
            if (r6 == 0) goto L5b
            java.lang.String r0 = "livesdk_comment_filter_filter_access_click"
            X.0IjA r4 = X.C0IJT.LIZ(r0)
            r4.LJIL()
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet r0 = (com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet) r0
            boolean r0 = r0.ES()
            if (r0 == 0) goto L60
            java.lang.String r1 = "anchor"
        L17:
            java.lang.String r0 = "admin_type"
            r4.LJJII(r1, r0)
            java.lang.Object r2 = r5.l0
            com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet r2 = (com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet) r2
            android.view.View r0 = r2.LLLIIIL
            r3 = 0
            if (r0 != 0) goto L36
            android.view.View r1 = r2.getView()
            if (r1 == 0) goto L5e
            r0 = 2131372813(0x7f0a2b0d, float:1.83657E38)
            android.view.View r0 = r1.findViewById(r0)
        L32:
            r2.LLLIIIL = r0
            if (r0 == 0) goto L5c
        L36:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L5c
            r0 = 1
        L3d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "red_dot"
            r4.LJJII(r1, r0)
            r4.LIZ()
            java.lang.Object r0 = r5.l0
            com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet r0 = (com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet) r0
            X.15Do r2 = r0.LLJJIJIL
            java.lang.Class<com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew> r1 = com.bytedance.android.livesdk.adminsetting.comment.filter.LiveFilterCommentSettingFragmentNew.class
            java.lang.String r0 = "live_filter_comment_setting"
            r2.LJIIIZ(r1, r0, r3, r3)
            X.0UX6 r0 = X.C0UX6.LIVE_BROADCAST_PREVIEW_FILTER_COMMENT
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LIZ(r0)
        L5b:
            return
        L5c:
            r0 = 0
            goto L3d
        L5e:
            r0 = r3
            goto L32
        L60:
            java.lang.String r1 = "admin"
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS694S0100000_12.LIZ$8(wh6.AbS694S0100000_12, android.view.View):void");
    }

    public static final void LIZ$9(AbS694S0100000_12 abS694S0100000_12, View view) {
        if (view != null) {
            ((CommunityFlaggedManageSheetFragment) abS694S0100000_12.l0).LLJJIJIL.LJIIJJI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS694S0100000_12(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
