package com.ss.android.ugc.aweme.im.actionbar.serviceimpl;

import X.C01GW;
import X.C0I0B;
import X.C0Z38;
import X.C0Z3V;
import X.C1400340mXo;
import X.C1697810uHb;
import X.C296650Bjz;
import X.C452501pT;
import X.C908980ZlI;
import X.C909030ZlN;
import X.C909080ZlS;
import X.EnumC909380Zlw;
import X.InterfaceC1364105Vn;
import X.InterfaceC1411705fn;
import X.InterfaceC1664506fT;
import X.InterfaceC1707406mO;
import X.InterfaceC898340ZMa;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService;
import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarMetaData;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarServiceImpl implements IActionBarService, IActionBarMetaDataService {
    public static final ActionBarServiceImpl LIZIZ = new ActionBarServiceImpl();
    public static final C01GW LIZJ;
    public final /* synthetic */ C909080ZlS LIZ = C909080ZlS.LIZ;

    public static final class ActionBarServiceManage implements IActionBarService {
        public final /* synthetic */ ActionBarServiceImpl LIZ = ActionBarServiceImpl.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final void LIZ() {
            this.LIZ.LIZ();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final Object LIZIZ(InterfaceC898340ZMa interfaceC898340ZMa, InterfaceC1707406mO interfaceC1707406mO, boolean z, InterfaceC1364105Vn<? super ActionBarStrategyConf> interfaceC1364105Vn) {
            return this.LIZ.LIZIZ(interfaceC898340ZMa, interfaceC1707406mO, z, interfaceC1364105Vn);
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final Object LIZJ(C909030ZlN c909030ZlN) {
            return this.LIZ.LIZJ(c909030ZlN);
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final void LIZLLL() {
            this.LIZ.LIZLLL();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService
        public final InterfaceC1707406mO LJ() {
            return this.LIZ.LJ();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService
        public final C908980ZlI LJFF() {
            return this.LIZ.LJFF();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final boolean LJI() {
            return this.LIZ.LJI();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final void LJII() {
            this.LIZ.LJII();
        }

        @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
        public final boolean canAutoRetry() {
            return this.LIZ.canAutoRetry();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService
    public final C908980ZlI LJFF() {
        return this.LIZ.LJFF();
    }

    static {
        LJIIIIZZ().LJFF().LJIIL(AFwS201S0000000_14.get$arr$(84));
        LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(328));
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    public final void LIZLLL() {
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) LIZJ.getValue();
        if (interfaceC1411705fn != null) {
            IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            long jLIZIZ = iMHostApi != null ? iMHostApi.LIZIZ() : System.currentTimeMillis();
            IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
            interfaceC1411705fn.LIZLLL(jLIZIZ, iMHostApi2 != null ? iMHostApi2.LIZIZ() : System.currentTimeMillis(), "");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMetaDataService
    public final InterfaceC1707406mO LJ() {
        this.LIZ.getClass();
        return new InterfaceC1707406mO() { // from class: X.1E0V
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(348));

            public static long LIZIZ(ActionBarMetaData actionBarMetaData) {
                if (((InterfaceC1513805wG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIJ()) {
                    return actionBarMetaData.currentLocaleTimeSecond;
                }
                return actionBarMetaData.currentServerTimeSecond;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC1707406mO
            public final Object LIZ(String str, InterfaceC898340ZMa interfaceC898340ZMa) {
                ActionBarMetaData actionBarMetaData;
                Object objValueOf;
                LightInteractionExitBean lightInteractionExitBean;
                long j;
                if ((interfaceC898340ZMa instanceof ActionBarMetaData) && (actionBarMetaData = (ActionBarMetaData) interfaceC898340ZMa) != null) {
                    switch (str.hashCode()) {
                        case -2127730462:
                            if (str.equals("streak_can_display_promotional_widget")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.streakCanDisplayPromotionalWidget);
                            }
                            break;
                        case -2126514314:
                            if (str.equals("is_streak_pet_widget_showing")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.isStreakPetWidgetShowing);
                            }
                            break;
                        case -2019257229:
                            if (str.equals("is_game_challenge_ab_enabled_on_client_single_chat")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.isGameChallengeABEnabledOnClientSingleChat);
                            }
                            break;
                        case -1936088432:
                            if (str.equals("group_live_action_type")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.groupLiveActionType);
                            }
                            break;
                        case -1917166356:
                            if (str.equals("biz_info_photo_swap_status")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.bizInfoPhotoSwapStatus);
                            }
                            break;
                        case -1738095284:
                            if (str.equals("has_streak_reminder_inline_msg")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.hasStreakReminderInlineMsg);
                            }
                            break;
                        case -1642177398:
                            if (str.equals("is_group_chat_valid")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.isGroupChatValid);
                            }
                            break;
                        case -1603428597:
                            if (str.equals("relative_date_time")) {
                                objValueOf = Long.valueOf(LIZIZ(actionBarMetaData));
                            }
                            break;
                        case -1571648937:
                            if (str.equals("current_user_dm_permission")) {
                                objValueOf = actionBarMetaData.currentUserDMPermission;
                            }
                            break;
                        case -1558398828:
                            if (str.equals("shared_feed_entrance_status")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.sharedFeedEntranceStatus);
                            }
                            break;
                        case -1379876657:
                            if (str.equals("effects_state_is_fetched")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.effectsStateIsFetched);
                            }
                            break;
                        case -1229667798:
                            if (str.equals("latest_message_type")) {
                                objValueOf = actionBarMetaData.latestMessageType;
                            }
                            break;
                        case -1082577644:
                            if (str.equals("is_game_challenge_ab_enabled_on_client_group_chat")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.isGameChallengeABEnabledOnClientGroupChat);
                            }
                            break;
                        case -1063828701:
                            if (str.equals("peer_user_can_messaged")) {
                                objValueOf = actionBarMetaData.peerUserCanMessaged;
                            }
                            break;
                        case -1026937230:
                            if (str.equals("biz_info_group_shot_status")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.bizInfoGroupShotStatus);
                            }
                            break;
                        case -768607937:
                            if (str.equals("push_type")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.innerPushType);
                            }
                            break;
                        case -676209736:
                            if (str.equals("peer_hit_streak_pet_hatching_exp")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.peerHitStreakPetHatchingExp);
                            }
                            break;
                        case -650386594:
                            if (str.equals("online_status")) {
                                objValueOf = actionBarMetaData.onlineStatus;
                            }
                            break;
                        case -639977744:
                            if (str.equals("im_bulletin_board_type")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.imBulletinBoardType);
                            }
                            break;
                        case -555304697:
                            if (str.equals("social_avatar_expressions")) {
                                objValueOf = actionBarMetaData.aiMojiExpressionList;
                            }
                            break;
                        case -442503373:
                            if (str.equals("follower_status")) {
                                objValueOf = actionBarMetaData.followerStatus;
                            }
                            break;
                        case -321901593:
                            if (str.equals("is_recommend")) {
                                objValueOf = actionBarMetaData.isRecommend;
                            }
                            break;
                        case -198127584:
                            if (str.equals("live_event_action_bar_enable")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.enableGroupLiveEvent);
                            }
                            break;
                        case -155849731:
                            if (str.equals("peer_user_have_birthday")) {
                                objValueOf = actionBarMetaData.peerUserHaveBirthday;
                            }
                            break;
                        case -144893975:
                            if (str.equals("should_move_group_live_to_last")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.shouldMoveGroupLiveToLast);
                            }
                            break;
                        case -131410047:
                            if (str.equals("peer_hit_ai_theater_exp")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.peerHitAITheaterExp);
                            }
                            break;
                        case -91046882:
                            if (str.equals("photo_swap_experiment_enabled")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.photoSwapExperimentEnabled);
                            }
                            break;
                        case -62921351:
                            if (str.equals("is_fan_group_chat")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.isFanGroupChat);
                            }
                            break;
                        case 80437536:
                            if (str.equals("entered_chat")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.enteredChat);
                            }
                            break;
                        case 80560026:
                            if (str.equals("from_path")) {
                                objValueOf = actionBarMetaData.fromPath;
                            }
                            break;
                        case 92525830:
                            if (str.equals("a_src")) {
                                objValueOf = actionBarMetaData.lastShowMsgAsrc;
                            }
                            break;
                        case 108801336:
                            if (str.equals("is_block")) {
                                objValueOf = actionBarMetaData.isBlock;
                            }
                            break;
                        case 169317686:
                            if (str.equals("conversation_has_active_streak")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.conversationHasActiveStreak);
                            }
                            break;
                        case 201926439:
                            if (str.equals("biz_info_camera_status")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.bizInfoCameraStatus);
                            }
                            break;
                        case 385183148:
                            if (str.equals("has_group_streak_egg_entrance")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.hasGroupStreakEggEntrance);
                            }
                            break;
                        case 445023077:
                            if (str.equals("peer_hit_streak_pet_exp")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.peerHitStreakPetExp);
                            }
                            break;
                        case 459374959:
                            if (str.equals("has_created_social_avatar")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.aiMojiIsReady);
                            }
                            break;
                        case 502138275:
                            if (str.equals("relative_day_time")) {
                                Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT).setTimeInMillis(LIZIZ(actionBarMetaData) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                objValueOf = Long.valueOf((r2.get(11) * 60 * 60) + (r2.get(12) * 60) + r2.get(13));
                            }
                            break;
                        case 757581174:
                            if (str.equals("conversation_type")) {
                                objValueOf = actionBarMetaData.conversationType;
                            }
                            break;
                        case 791675870:
                            if (str.equals("streak_group_pet")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.enableStreakGroupPet);
                            }
                            break;
                        case 820755284:
                            if (str.equals("biz_info_avatar_duo_status")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.bizInfoAvatarDuoStatus);
                            }
                            break;
                        case 885584774:
                            if (str.equals("latest_message_send_from_me")) {
                                objValueOf = actionBarMetaData.latestMessageSendFromMe;
                            }
                            break;
                        case 957045723:
                            if (str.equals("user_last_message_sending_time_diff_from_now")) {
                                objValueOf = actionBarMetaData.lastSendMessageTimeDiff;
                            }
                            break;
                        case 1007312400:
                            if (str.equals("ai_theater_social_enable")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.aiTheaterSocialEnable);
                            }
                            break;
                        case 1028143168:
                            if (str.equals("follow_status")) {
                                objValueOf = actionBarMetaData.followStatus;
                            }
                            break;
                        case 1052591083:
                            if (str.equals("is_stranger")) {
                                objValueOf = actionBarMetaData.isStranger;
                            }
                            break;
                        case 1123804964:
                            if (str.equals("light_interaction_frequency_control") && (lightInteractionExitBean = actionBarMetaData.lightInteractionExitBean) != null) {
                                if (((InterfaceC1513805wG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIJ()) {
                                    j = actionBarMetaData.currentLocaleTimeSecond;
                                } else {
                                    j = actionBarMetaData.currentServerTimeSecond;
                                }
                                return new C346070DhV(lightInteractionExitBean, j);
                            }
                            break;
                        case 1149462245:
                            if (str.equals("conv_group_type")) {
                                objValueOf = actionBarMetaData.convGroupType;
                            }
                            break;
                        case 1226862376:
                            if (str.equals("weekday")) {
                                Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
                                calendar.setTimeInMillis(LIZIZ(actionBarMetaData) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                int i = calendar.get(7);
                                objValueOf = Integer.valueOf(i != 1 ? i - 1 : 7);
                            }
                            break;
                        case 1389154121:
                            if (str.equals("hit_streak_pet_acb_button_expose_count_limit")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.hitStreakPetAcbButtonExposeCountLimit);
                            }
                            break;
                        case 1456149279:
                            if (str.equals("has_single_streak_egg_entrance")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.hasSingleStreakEggEntrance);
                            }
                            break;
                        case 1475278559:
                            if (str.equals("group_conv_user_role")) {
                                objValueOf = Integer.valueOf(actionBarMetaData.groupConvUserRole);
                            }
                            break;
                        case 1478872023:
                            if (str.equals("is_blocked")) {
                                objValueOf = actionBarMetaData.isBlocked;
                            }
                            break;
                        case 1667662228:
                            if (str.equals("has_created_avatar_duo")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.hasCreatedAvatarDuo);
                            }
                            break;
                        case 1748552932:
                            if (str.equals("shared_feed_entrance_impressions_limit")) {
                                objValueOf = Boolean.valueOf(actionBarMetaData.hitSharedFeedActionBarExposeCountLimit);
                            }
                            break;
                        case 1807406258:
                            if (str.equals("affinity_score_ranking")) {
                                objValueOf = actionBarMetaData.affinityScoreRanking;
                            }
                            break;
                        case 1949198463:
                            if (str.equals("unread_count")) {
                                objValueOf = actionBarMetaData.unreadCount;
                            }
                            break;
                        case 1950151569:
                            if (str.equals("latest_message_light_interaction_name")) {
                                objValueOf = actionBarMetaData.latestMessageLightInteractionName;
                            }
                            break;
                        case 2082056206:
                            if (str.equals("is_mute")) {
                                objValueOf = actionBarMetaData.isMute;
                            }
                            break;
                    }
                    if (objValueOf != null) {
                        return objValueOf;
                    }
                }
                return ((InterfaceC1707406mO) this.LIZ.getValue()).LIZ(str, interfaceC898340ZMa);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    public final boolean canAutoRetry() {
        InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) LIZJ.getValue();
        if (interfaceC1411705fn == null) {
            return true;
        }
        IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        return !interfaceC1411705fn.LIZIZ(iMHostApi != null ? iMHostApi.LIZIZ() : System.currentTimeMillis(), "");
    }

    public static IStrategyPlatformService LJIIIIZZ() {
        return (IStrategyPlatformService) ServiceManager.get().getService(IStrategyPlatformService.class);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    public final void LIZ() {
        for (EnumC909380Zlw enumC909380Zlw : C296650Bjz.LIZ() ? C1697810uHb.LJIIJJI(EnumC909380Zlw.ACTION_BAR_BASE_STATE, EnumC909380Zlw.ACTION_BAR_STATE_TRANSFER) : Collections.singletonList(EnumC909380Zlw.ACTION_BAR)) {
            InterfaceC1664506fT interfaceC1664506fTLIZJ = ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZJ(C0Z3V.DIMENSION_UID, true);
            interfaceC1664506fTLIZJ.LIZLLL(enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LJFF(enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LJ(enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LIZJ(enumC909380Zlw.getKey());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    public final boolean LJI() {
        return C296650Bjz.LIZ() ? LJIIIIZZ().LIZ(EnumC909380Zlw.ACTION_BAR_BASE_STATE) && LJIIIIZZ().LIZ(EnumC909380Zlw.ACTION_BAR_STATE_TRANSFER) : LJIIIIZZ().LIZ(EnumC909380Zlw.ACTION_BAR);
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    public final void LJII() {
        for (EnumC909380Zlw enumC909380Zlw : C296650Bjz.LIZ() ? C1697810uHb.LJIIJJI(EnumC909380Zlw.ACTION_BAR_BASE_STATE, EnumC909380Zlw.ACTION_BAR_STATE_TRANSFER) : Collections.singletonList(EnumC909380Zlw.ACTION_BAR)) {
            InterfaceC1664506fT interfaceC1664506fTLIZJ = ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZJ(C0Z3V.DIMENSION_UID, true);
            interfaceC1664506fTLIZJ.LIZ(enumC909380Zlw.getKey(), enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LIZIZ(enumC909380Zlw.getKey(), enumC909380Zlw.getKey(), C0Z38.MODE_FIRST_ONLY, LJIIIIZZ().LIZ(enumC909380Zlw));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    public final Object LIZJ(C909030ZlN c909030ZlN) {
        if (C296650Bjz.LIZ()) {
            IStrategyPlatformService iStrategyPlatformServiceLJIIIIZZ = LJIIIIZZ();
            List<? extends EnumC909380Zlw> listLJIIJJI = C1697810uHb.LJIIJJI(EnumC909380Zlw.ACTION_BAR_BASE_STATE, EnumC909380Zlw.ACTION_BAR_STATE_TRANSFER, EnumC909380Zlw.COMMON_LIGHT_INTERACTION);
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            return iStrategyPlatformServiceLJIIIIZZ.LJI(listLJIIJJI, curUserId, "enter_chat_page", c909030ZlN);
        }
        IStrategyPlatformService iStrategyPlatformServiceLJIIIIZZ2 = LJIIIIZZ();
        List<? extends EnumC909380Zlw> listLJIIJJI2 = C1697810uHb.LJIIJJI(EnumC909380Zlw.ACTION_BAR, EnumC909380Zlw.COMMON_LIGHT_INTERACTION);
        String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId2 == null) {
            curUserId2 = "";
        }
        return iStrategyPlatformServiceLJIIIIZZ2.LJI(listLJIIJJI2, curUserId2, "enter_chat_page", c909030ZlN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.13BV] */
    @Override // com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC898340ZMa r24, X.InterfaceC1707406mO r25, boolean r26, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarStrategyConf> r27) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarServiceImpl.LIZIZ(X.0ZMa, X.06mO, boolean, X.05Vn):java.lang.Object");
    }
}
