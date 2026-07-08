package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.AbstractC2126608Uu;
import X.C040I;
import X.C09CT;
import X.C09S2;
import X.C1246660iXw;
import X.C15O7;
import X.C19278910bb;
import X.C813020Vuu;
import X.C844470XAv;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.callroom.api.model.VoiceCallNotificationSettingsResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.NotificationSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUIResponse;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.ShouldShowEdmPopupResp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes29.dex */
public final class PushSettingsApiManager {
    public static final PushUserSettingsApi LIZ = (PushUserSettingsApi) C09S2.LIZJ(PushUserSettingsApi.class, Api.LIZ);

    public interface PushUserSettingsApi {
        @InterfaceC1501240pAY("/tiktok/v1/notification/settings/set/")
        ListenableFuture<BaseResponse> LIZ(@InterfaceC1501120pAM("field") String str, @InterfaceC1501120pAM(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i);

        @InterfaceC1501240pAY("/notification/settings/email/popup")
        ListenableFuture<ShouldShowEdmPopupResp> LIZIZ();

        @InterfaceC1501200pAU("/tiktok/user/relation/social/data/check/v1")
        C15O7<SocialRelationDataCheckResponse> LIZJ(@InterfaceC1501120pAM("social_platform") int i);

        @InterfaceC1501200pAU("/aweme/v1/user/set/settings/")
        ListenableFuture<BaseResponse> LIZLLL(@InterfaceC1501120pAM("field") String str, @InterfaceC1501120pAM("private_setting") int i);

        @InterfaceC1501240pAY("/notification/settings/view")
        ListenableFuture<PushSettingDynamicUIResponse> LJ();

        @InterfaceC1501200pAU("/tiktok/v1/im/user/settings/get")
        ListenableFuture<VoiceCallNotificationSettingsResponse> LJFF(@InterfaceC1501120pAM("include_fields") List<Integer> list);

        @InterfaceC1501240pAY("/tiktok/user/relation/social/data/delete/v1")
        ListenableFuture<BaseResponse> LJI(@InterfaceC1501120pAM("social_platform") int i);

        @InterfaceC1501200pAU("/aweme/v1/user/set/settings/")
        ListenableFuture<BaseResponse> LJII(@InterfaceC1501120pAM("field") String str, @InterfaceC1501120pAM("private_setting") int i, @InterfaceC1501120pAM("enable_stitch") int i2);

        @InterfaceC1501240pAY("/tiktok/v1/im/user/settings")
        ListenableFuture<BaseResponse> LJIIIIZZ(@C040I ImVoiceCallSettingPatchRequest imVoiceCallSettingPatchRequest);

        @InterfaceC1501240pAY("/cloudpush/push_close_feedback_reason")
        ListenableFuture<FetchPushOffReasonsResp> LJIIIZ();

        @InterfaceC1501200pAU("/aweme/v1/user/set/settings/")
        ListenableFuture<BaseResponse> LJIIJ(@InterfaceC1501120pAM("field") String str, @InterfaceC1501120pAM("private_setting") int i, @InterfaceC1501120pAM("aweme_id") String str2);

        @InterfaceC1501200pAU("/tiktok/v1/notification/settings/")
        ListenableFuture<NotificationSettings> LJIIJJI();

        @InterfaceC1501200pAU("/aweme/v1/user/set/settings/")
        ListenableFuture<BaseResponse> LJIIL(@InterfaceC1501120pAM("field") String str, @InterfaceC1501120pAM("value") int i);

        @InterfaceC1501240pAY("/cloudpush/push_close_feedback")
        @InterfaceC1501300pAe
        ListenableFuture<BaseResponse> feedbackPushOffReasons(@InterfaceC1501050pAF("device_id") long j, @InterfaceC1501050pAF("user_id") long j2, @InterfaceC1501050pAF("close_switch") String str, @InterfaceC1501050pAF("reason_category_list") String str2, @InterfaceC1501050pAF("input_reason_text") String str3);

        @InterfaceC1501200pAU("/aweme/v1/user/settings/")
        ListenableFuture<PushSettings> getUserSettings(@InterfaceC1501120pAM("last_settings_version") String str);

        @InterfaceC1501240pAY("/cloudpush/user_set_setting")
        @InterfaceC1501300pAe
        ListenableFuture<BatchUpdatePushSwitchesResp> setItems(@InterfaceC1501050pAF("fields") String str, @InterfaceC1501050pAF("value") int i, @InterfaceC1501050pAF("close_other") boolean z, @InterfaceC1501050pAF("sec_uid") String str2);

        @InterfaceC1501240pAY("/cloudpush/user_set_setting")
        @InterfaceC1501300pAe
        ListenableFuture<BatchUpdatePushSwitchesResp> setItems(@InterfaceC1501050pAF("fields_value") String str, @InterfaceC1501050pAF("close_other") boolean z);
    }

    public static C1246660iXw LJII() {
        try {
            VoiceCallNotificationSettingsResponse voiceCallNotificationSettingsResponse = LIZ.LJFF(Arrays.asList(2, 3)).get();
            if (voiceCallNotificationSettingsResponse == null || voiceCallNotificationSettingsResponse.status_code != 0) {
                return null;
            }
            VoiceCallNotificationSettingsResponse.VoiceCallSettingsInner voiceCallSettingsInner = voiceCallNotificationSettingsResponse.settings;
            return voiceCallSettingsInner != null ? new C1246660iXw(voiceCallSettingsInner.voiceCallInAppPushStatus, voiceCallSettingsInner.voiceCallOutAppPushStatus) : new C1246660iXw(0, 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static PushSettingDynamicUI LJ() {
        try {
            return LIZ.LJ().get().uiData;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static NotificationSettings LJFF() {
        try {
            return LIZ.LJIIJJI().get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIIIZZ() {
        try {
            return LIZ.LJIIIZ().get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static ShouldShowEdmPopupResp LJIIZILJ() {
        try {
            return LIZ.LIZIZ().get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static PushSettings LJI() {
        boolean zLJI = MethodIDManager.LJI(202219);
        try {
            C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
            C844470XAv.LIZ.getClass();
            SharedPreferences sharedPreferencesLJ = c813020VuuLJIIL.LJ(C844470XAv.LIZ());
            PushSettings pushSettings = LIZ.getUserSettings(sharedPreferencesLJ == null ? null : sharedPreferencesLJ.getString("last_user_setting_version", "")).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return pushSettings;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            RuntimeException compatibleException = AbstractC2126608Uu.getCompatibleException(e);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            throw compatibleException;
        }
    }

    public static class ImVoiceCallSettingPatchRequest {

        @C09CT("settings_patch")
        public final Map<String, Integer> settingsPatch;

        public ImVoiceCallSettingPatchRequest(Map<String, Integer> map) {
            this.settingsPatch = map;
        }
    }

    public static C15O7<SocialRelationDataCheckResponse> LIZJ(int i) {
        return LIZ.LIZJ(i);
    }

    public static BaseResponse LJIIIZ(int i) {
        try {
            return LIZ.LJI(i).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static boolean LJIIJ(int i) {
        try {
            PushUserSettingsApi pushUserSettingsApi = LIZ;
            HashMap map = new HashMap();
            map.put("voice_call_in_app_push_status", Integer.valueOf(i));
            BaseResponse baseResponse = pushUserSettingsApi.LJIIIIZZ(new ImVoiceCallSettingPatchRequest(map)).get();
            if (baseResponse == null) {
                return false;
            }
            if (baseResponse.status_code != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LJIIJJI(int i) {
        try {
            PushUserSettingsApi pushUserSettingsApi = LIZ;
            HashMap map = new HashMap();
            map.put("voice_call_outapp_app_push_status", Integer.valueOf(i));
            BaseResponse baseResponse = pushUserSettingsApi.LJIIIIZZ(new ImVoiceCallSettingPatchRequest(map)).get();
            if (baseResponse == null) {
                return false;
            }
            if (baseResponse.status_code != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static BaseResponse LJIILIIL(int i, String str) {
        try {
            return LIZ.LIZLLL(str, i).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIILL(int i, String str) {
        try {
            return LIZ.LJIIL(str, i).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIILLIIL(int i, String str) {
        try {
            return LIZ.LIZ(str, i).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BatchUpdatePushSwitchesResp LIZIZ(String str, Boolean bool, C19278910bb c19278910bb) {
        try {
            return LIZ.setItems(str, bool.booleanValue()).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (Build.VERSION.SDK_INT >= 24 && c19278910bb != null) {
                c19278910bb.accept(e);
            }
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIIL(int i, int i2, String str) {
        try {
            return LIZ.LJII(str, i, i2).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BaseResponse LJIILJJIL(int i, String str, String str2) {
        try {
            return LIZ.LJIIJ(str, i, str2).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BatchUpdatePushSwitchesResp LIZ(String str, int i, boolean z, String str2, C19278910bb c19278910bb) {
        try {
            return LIZ.setItems(str, i, z, str2).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            if (Build.VERSION.SDK_INT >= 24 && c19278910bb != null) {
                c19278910bb.accept(e);
            }
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static BaseResponse LIZLLL(long j, long j2, String str, String str2, String str3) {
        try {
            return LIZ.feedbackPushOffReasons(j, j2, str, str2, str3).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
