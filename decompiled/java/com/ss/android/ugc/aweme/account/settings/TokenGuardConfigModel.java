package com.ss.android.ugc.aweme.account.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class TokenGuardConfigModel {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("/passport/", "/aweme/comment/", "/aweme/v1/comment/", "/aweme/v2/comment/");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("/webcast/gift/send/", "/passport/account/info/v2/", "/passport/account/info/v2", "/aweme/v1/create/aweme/", "/aweme/v1/create/photo/", "/aweme/v1/commit/user/", "/v1/message/send", "/v1/message/send/", "/aweme/v1/commit/item/digg/", "/aweme/v1/commit/follow/user/", "/aweme/v1/instagram/bind/", "/v2/conversation/create/", "/v1/conversation/add_participants", "/v1/conversation/add_participants/", "/tiktok/v1/ba/set/wel_message/", "/aweme/v1/upload/hashcontacts/", "/tiktok/v1/upvote/batch_publish/", "/aweme/v1/comment/publish/", "/aweme/v1/comment/digg/", "/passport/mobile/send_code/v1/", "/passport/mobile/send_voice_code/", "/passport/mobile/send_code/", "/passport/password/change/", "/passport/mobile/change/v1/", "/passport/mobile/unbind/", "/passport/email/unbind/", "/passport/email/bind/", "/passport/email/change/", "/passport/cancel/post/", "/passport/cancel/confirm/", "/passport/email/send_code/", "/passport/shark/safe_verify/verification_manage/", "/passport/safe/two_step_verification/add_verification/", "/passport/safe/two_step_verification/remove_verification/", "/passport/safe/two_step_verification/remove_all/", "/passport/safe/two_step_verification/add_auth_device/", "/passport/safe/two_step_verification/remove_auth_device/", "/passport/totp/register/v2/", "/tiktok/v1/gift/send/", "/aweme/v1/commit/game/item/digg/", "/tiktok/v1/im/group/invite/accept/", "/tiktok/v1/im/group/invite/accept", "/tiktok/v1/im/group/invite/share/", "/tiktok/v1/im/group/invite/share", "/aweme/v1/aweme/collect/", "/money/v1/iap/pay/", "/money/v1/iap/pay", "/tiktok/music/commerce/trade/create/v2/", "/webcast/envelope/rush/", "/webcast/envelope/send/", "/webcast/game_revenue/guess/bet/", "/webcast/game_revenue/guess/bet", "/webcast/game_revenue/guess/claim_task_reward/", "/webcast/game_revenue/guess/claim_task_reward", "/webcast/game_revenue/guess/create_guess/", "/webcast/game_revenue/guess/create_guess", "/webcast/partnership/reward/drops_claim", "/webcast/partnership/reward/drops_claim/", "/game_station/benefit/claim/", "/game_station/benefit/claim", "/webcast/gift/send/", "/webcast/gift/send", "/webcast/goody_bag/send/", "/webcast/goody_bag/signup/", "/webcast/portal/send/", "/webcast/privilege/star_comment/purchase/", "/webcast/room/chat/", "/webcast/room/create/", "/webcast/room/enter/", "/webcast/room/like/", "/webcast/room/pin/", "/webcast/room/pin", "/webcast/room/share/", "/webcast/room/share", "/webcast/sub/contract/create/", "/webcast/sub/gift/contract_create/", "/webcast/user/relation/update/", "/webcast/wallet_api_tiktok/withdraw/get_withdraw_version/", "/webcast/wallet_api/diamond_buy/", "/webcast/wallet_api/diamond_exchange/", "/webcast/wallet_api/diamond_buy_external/", "/tiktok/v1/paid_content/product/create_order", "/tiktok/incentive/v1/task/done/gift_v1/support", "/tiktok/incentive/v1/task/done/activation", "/tiktok/incentive/v1/task/done/gift_watch", "/tiktok/v1/addyours/invite/", "/tiktok/v1/addyours/invite", "/tiktok/poi/review/post/v1", "/tiktok/poi/review/interact/v1", "/tiktok/region/change/precheck/get/v1/", "/tiktok/region/change/precheck/get/v1", "/aweme/v1/aweme/delete/", "/passport/email/bind_without_verify/", "/passport/token/beat/v2/", "/passport/token/beat/v2", "/aweme/v1/ad/pipo/client/certificate/query/", "/passport/cloud_token/enable/", "/passport/safe/login_device/list/v2/", "/passport/account/switch/", "/passport/mobile/bind_with_change_password/", "/passport/mobile/bind/", "/passport/mobile/bind/v1/", "/passport/mobile/bind/v2/", "/passport/mobile/scan_qrcode/", "/passport/mobile/confirm_qrcode/", "/passport/password/set/", "/passport/safe/login_device/del/", "/passport/safe/two_step_verification/get_verification_list/", "/passport/safe/recommend_device/list/", "/passport/safe/two_step_verification/get_auth_device_list/", "/passport/cloud_token/disable/", "/passport/user/logout/", "/passport/deactivation/post/", "/passport/deactivation/do/", "/passport/cancel/post/", "/passport/cancel/do/", "/passport/login_name/update/", "/passport/login_name/register/", "/passport/email/bind_with_change_password/", "/passport/email/change_with_update_password/", "/passport/region/change/submit/post/", "/passport/email/change_password/", "/passport/password/change/v2/", "/passport/account/switch/v2/", "/passport/account/switch/", "/passport/fido2/begin_user_registration/", "/passport/fido2/finish_user_registration/", "/passport/auth/get_token/", "/passport/transfer/get_token/", "/passport/sotl/app2web/confirm_auth_token/", "/passport/safe/two_step_verification/add_verification/v2/", "/passport/safe/two_step_verification/remove_verification/v2/", "/passport/safe/two_step_verification/add_auth_device/v2/", "/passport/web/scan_qrcode/", "/passport/web/confirm_qrcode/", "/aweme/v1/comment/poll/vote/", "/aweme/v1/comment/poll/create/");

    @C09CT("enable_full_path_track")
    public boolean enableFullPathTrack;

    @C09CT("enable_token_guard")
    public boolean enableTokenGuard;

    @C09CT("token_guard_path_prefix")
    public List<String> tokenGuardPathPrefix;

    @C09CT("token_guard_paths")
    public List<String> tokenGuardPaths;

    @C09CT("version")
    public Integer version;

    public TokenGuardConfigModel() {
        this(true, LIZIZ, true, LIZ, null);
    }

    public TokenGuardConfigModel(boolean z, List<String> list, boolean z2, List<String> list2, Integer num) {
        this.enableTokenGuard = z;
        this.tokenGuardPaths = list;
        this.enableFullPathTrack = z2;
        this.tokenGuardPathPrefix = list2;
        this.version = num;
    }
}
