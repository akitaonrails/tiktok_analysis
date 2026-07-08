package com.ss.android.ugc.profile.business.ur.longpress;

import X.C1259060irw;
import X.C1259150is5;
import X.EnumC1259080iry;
import X.InterfaceC1220870hsL;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class LongPressAwemeGestureViewModel extends ViewModel {
    public final InterfaceC1220870hsL LL;

    public LongPressAwemeGestureViewModel(C1259150is5 c1259150is5) {
        InterfaceC1220870hsL interfaceC1220870hsL;
        EnumC1259080iry enumC1259080iry;
        AwemeRouteDetailPageParams awemeRouteDetailPageParams = c1259150is5.LIZ;
        if (C1259060irw.LIZ[((awemeRouteDetailPageParams == null || (enumC1259080iry = awemeRouteDetailPageParams.tabFrom) == null) ? EnumC1259080iry.UNKNOWN : enumC1259080iry).ordinal()] == 1) {
            final Bundle bundle = c1259150is5.LIZIZ;
            interfaceC1220870hsL = new InterfaceC1220870hsL(bundle) { // from class: X.0hsK
                public final Bundle LIZ;

                {
                    this.LIZ = bundle;
                }

                @Override // X.InterfaceC1220870hsL
                public final void LIZ(Context context) {
                    Bundle bundle2 = this.LIZ;
                    if (bundle2 == null) {
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    String string = bundle2.getString(FollowStatusChangeMethod.PARAM_UID);
                    if (string != null) {
                        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, string, bundle3);
                    }
                    String string2 = bundle2.getString("video_from");
                    if (string2 != null) {
                        C786410Ut5.LJJJI("video_from", string2, bundle3);
                    }
                    String string3 = bundle2.getString("enter_from");
                    if (string3 != null) {
                        C786410Ut5.LJJJI("enter_from", string3, bundle3);
                    }
                    String string4 = bundle2.getString("tab_name");
                    if (string4 != null) {
                        C786410Ut5.LJJJI("tab_name", string4, bundle3);
                    }
                    String string5 = bundle2.getString("from_activity_hash_code");
                    if (string5 != null) {
                        C786410Ut5.LJJJI("from_activity_hash_code", string5, bundle3);
                    }
                    String string6 = bundle2.getString("previous_page");
                    if (string6 != null) {
                        C786410Ut5.LJJJI("previous_page", string6, bundle3);
                    }
                    String string7 = bundle2.getString("from_profile_uid");
                    if (string7 != null) {
                        C786410Ut5.LJJJI("from_profile_uid", string7, bundle3);
                    }
                    bundle3.putInt("follow_status", bundle2.getInt("follow_status"));
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
                    smartRouteBuildRoute.withParam(bundle3);
                    smartRouteBuildRoute.withParam("activity_has_activity_options", true);
                    smartRouteBuildRoute.open();
                }
            };
        } else {
            final Bundle bundle2 = c1259150is5.LIZIZ;
            final AwemeRouteDetailPageParams awemeRouteDetailPageParams2 = c1259150is5.LIZ;
            interfaceC1220870hsL = new InterfaceC1220870hsL(bundle2, awemeRouteDetailPageParams2) { // from class: X.0irv
                public final Bundle LIZ;
                public final AwemeRouteDetailPageParams LIZIZ;

                @Override // X.InterfaceC1220870hsL
                public final void LIZ(Context context) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    Bundle bundle3;
                    int i;
                    Long l;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PublicTabRouteOperator onClickVideoCell start, awemeDetailPageParams != null is ");
                    if (this.LIZIZ != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(", awemeBundle != null is ");
                    if (this.LIZ != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ.append(z2);
                    sbLIZ.append(", detailPageParams.aweme != null is ");
                    AwemeRouteDetailPageParams awemeRouteDetailPageParams3 = this.LIZIZ;
                    if (awemeRouteDetailPageParams3 != null && awemeRouteDetailPageParams3.aweme != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    sbLIZ.append(z3);
                    C2188811AlT.LIZIZ(sbLIZ);
                    AwemeRouteDetailPageParams awemeRouteDetailPageParams4 = this.LIZIZ;
                    if (awemeRouteDetailPageParams4 == null || (bundle3 = this.LIZ) == null) {
                        return;
                    }
                    Bundle bundle4 = new Bundle();
                    String string = bundle3.getString("video_id");
                    if (string != null) {
                        C786410Ut5.LJJJI("video_id", string, bundle4);
                    }
                    String string2 = bundle3.getString(FollowStatusChangeMethod.PARAM_UID);
                    if (string2 != null) {
                        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, string2, bundle4);
                    }
                    String string3 = bundle3.getString("video_from");
                    if (string3 != null) {
                        C786410Ut5.LJJJI("video_from", string3, bundle4);
                    }
                    bundle4.putInt("video_type", bundle3.getInt("video_type"));
                    String string4 = bundle3.getString("userid");
                    if (string4 != null) {
                        C786410Ut5.LJJJI("userid", string4, bundle4);
                    }
                    String string5 = bundle3.getString("sec_userid");
                    if (string5 != null) {
                        C786410Ut5.LJJJI("sec_userid", string5, bundle4);
                    }
                    bundle4.putInt("profile_enterprise_type", bundle3.getInt("profile_enterprise_type"));
                    String string6 = bundle3.getString("enter_method");
                    if (string6 != null) {
                        C786410Ut5.LJJJI("enter_method", string6, bundle4);
                    }
                    String string7 = bundle3.getString("like_enter_method");
                    if (string7 != null) {
                        C786410Ut5.LJJJI("like_enter_method", string7, bundle4);
                    }
                    String string8 = bundle3.getString("content_source");
                    if (string8 != null) {
                        C786410Ut5.LJJJI("content_source", string8, bundle4);
                    }
                    String string9 = bundle3.getString("refer");
                    if (string9 != null) {
                        C786410Ut5.LJJJI("refer", string9, bundle4);
                    }
                    String string10 = bundle3.getString("previous_page");
                    if (string10 != null) {
                        C786410Ut5.LJJJI("previous_page", string10, bundle4);
                    }
                    String string11 = bundle3.getString("from_group_id");
                    if (string11 != null) {
                        C786410Ut5.LJJJI("from_group_id", string11, bundle4);
                    }
                    String string12 = bundle3.getString("extra_previous_page_position");
                    if (string12 != null) {
                        C786410Ut5.LJJJI("extra_previous_page_position", string12, bundle4);
                    }
                    String string13 = bundle3.getString("source_page");
                    if (string13 != null) {
                        C786410Ut5.LJJJI("source_page", string13, bundle4);
                    }
                    String string14 = bundle3.getString("tab_name");
                    if (string14 != null) {
                        C786410Ut5.LJJJI("tab_name", string14, bundle4);
                    }
                    String string15 = bundle3.getString("enter_from_request_id");
                    if (string15 != null) {
                        C786410Ut5.LJJJI("enter_from_request_id", string15, bundle4);
                    }
                    String string16 = bundle3.getString("feeds_aweme_id");
                    if (string16 != null) {
                        C786410Ut5.LJJJI("feeds_aweme_id", string16, bundle4);
                    }
                    bundle4.putInt("from_post_list", bundle3.getInt("from_post_list"));
                    String string17 = bundle3.getString("pre_event_type");
                    if (string17 != null) {
                        C786410Ut5.LJJJI("pre_event_type", string17, bundle4);
                    }
                    bundle4.putInt("follow_status", bundle3.getInt("follow_status"));
                    String string18 = bundle3.getString("enter_method");
                    if (string18 != null) {
                        C786410Ut5.LJJJI("enter_method", string18, bundle4);
                    }
                    String string19 = bundle3.getString("order");
                    if (string19 != null) {
                        C786410Ut5.LJJJI("order", string19, bundle4);
                    }
                    Serializable serializable = bundle3.getSerializable("matched_friend_strcut");
                    if (serializable != null) {
                        C786410Ut5.LJJIZ(bundle4, "matched_friend_strcut", serializable);
                    }
                    String string20 = bundle3.getString("impr_id");
                    if (string20 != null) {
                        C786410Ut5.LJJJI("impr_id", string20, bundle4);
                    }
                    bundle4.putBoolean("isNowType", bundle3.getBoolean("isNowType"));
                    Aweme aweme = awemeRouteDetailPageParams4.aweme;
                    if (aweme == null) {
                        return;
                    }
                    Bundle bundle5 = this.LIZ;
                    if (bundle5 != null) {
                        i = bundle5.getInt("video_type", 0);
                    } else {
                        i = 0;
                    }
                    IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) PluggableExtentionKt.pluggableSpi$default(IMSAdaptionService.class, false, false, false, 14, null);
                    if (iMSAdaptionService != null && iMSAdaptionService.LIZIZ(context)) {
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//duo");
                        smartRouteBuildRoute.withParam(bundle4);
                        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
                        smartRouteBuildRoute.withParam("video_from", "from_profile_other");
                        smartRouteBuildRoute.withParam("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
                        smartRouteBuildRoute.withParam("duo_type", "duo_detail");
                        smartRouteBuildRoute.open();
                        return;
                    }
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
                    smartRouteBuildRoute2.withParam(bundle4);
                    smartRouteBuildRoute2.withParam("activity_has_activity_options", true);
                    smartRouteBuildRoute2.withParam("is_show_follow_btn_on_bottom", awemeRouteDetailPageParams4.showFollowBtnOnBottom);
                    smartRouteBuildRoute2.withParam("rec_type", awemeRouteDetailPageParams4.userRecType);
                    smartRouteBuildRoute2.withParam("relation_type", awemeRouteDetailPageParams4.userRelationType);
                    smartRouteBuildRoute2.withParam("is_new_suggested", awemeRouteDetailPageParams4.isNewSuggest());
                    smartRouteBuildRoute2.withParam("relation_enter_from", awemeRouteDetailPageParams4.relationEnterFrom);
                    smartRouteBuildRoute2.withParam("rfevent_previous_page", awemeRouteDetailPageParams4.followRecPreviousPage);
                    smartRouteBuildRoute2.withParam("action_type", EnumC1260930iux.PROFILE_VIDEO_FOLLOW.getType());
                    if (i == 0) {
                        smartRouteBuildRoute2.withParam("show_quick_dm_box", aweme.getShowQuickDMBox());
                        if (aweme.getAuthor() != null) {
                            smartRouteBuildRoute2.withParam("follow_status", aweme.getAuthor().getFollowStatus());
                        }
                        smartRouteBuildRoute2.withParam("conversation_id", C1336205Ku.LIZ(false).getImChatService().LJJIIZ(AwemeExtKt.getAuthorUid(aweme)));
                    }
                    String str = awemeRouteDetailPageParams4.sourceBtmToken;
                    if (str != null) {
                        smartRouteBuildRoute2.withParam("source_btm_token", str);
                    }
                    if (awemeRouteDetailPageParams4.checkIsFromLive) {
                        smartRouteBuildRoute2.withParam("key_enter_from_live_room_id", awemeRouteDetailPageParams4.liveRoomId);
                        smartRouteBuildRoute2.withParam("key_enter_from_live_request_id", awemeRouteDetailPageParams4.liveRequestId);
                    }
                    if (C0SE1.LIZ() && (l = awemeRouteDetailPageParams4.currentUserLiveRoomId) != null) {
                        smartRouteBuildRoute2.withParam("key_current_profile_user_live_room_id", l.longValue());
                    }
                    smartRouteBuildRoute2.withParam("key_live_feed_enter_from", awemeRouteDetailPageParams4.liveFeedEnterFrom);
                    smartRouteBuildRoute2.withParam("key_live_enter_module", awemeRouteDetailPageParams4.liveEnterModule);
                    smartRouteBuildRoute2.open();
                }

                {
                    this.LIZ = bundle2;
                    this.LIZIZ = awemeRouteDetailPageParams2;
                }
            };
        }
        this.LL = interfaceC1220870hsL;
    }
}
