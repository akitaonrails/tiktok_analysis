package com.ss.android.ugc.aweme.legoImp;

import X.C01GW;
import X.C0CCZ;
import X.C0CD2;
import X.C0CG6;
import X.C0VU1;
import X.C0VZ0;
import X.C2456309jt;
import X.C274470ApJ;
import X.C285470BGv;
import X.C309220CAe;
import X.C309370CAt;
import X.C810670Vr7;
import X.EnumC309240CAg;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import X.InterfaceC799780VYy;
import android.content.Context;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20234614Fk
public class SPKevaPreloadTaskV3 implements C0CCZ, InterfaceC799780VYy, InterfaceC799590VYf {
    public Long LL = 500L;

    @Override // X.InterfaceC799780VYy
    public final void LJFF() {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SPKevaPreloadTaskV3";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799780VYy
    public final long LIZ() {
        return this.LL.longValue();
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Boolean) C0CG6.LJ.getValue()).booleanValue() || ((Boolean) C0CG6.LJFF.getValue()).booleanValue();
    }

    @Override // X.InterfaceC799780VYy
    public final C0VU1 threadType() {
        return ((Boolean) C0CD2.LJIIIIZZ.getValue()).booleanValue() ? C0VU1.IO : C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799780VYy
    public final void LJ(Long l) {
        this.LL = l;
    }

    public final void LJIIIZ(Context context) {
        LJIIIIZZ(context, 0, "applog_stats");
        LJIIIIZZ(context, 0, "prefs_feed_check");
        LJIIIIZZ(context, 0, "default_config");
        LJIIIIZZ(context, 0, "key_language_sp_key");
        LJIIIIZZ(context, 0, "sp_translation_cache");
        LJIIIIZZ(context, 0, "KEY_NEED_UPLOAD_LAUNCHLOG");
        LJIIIIZZ(context, 0, "HotSwapKey");
        LJIIIIZZ(context, 0, "preinsatll_appflyer");
        LJIIIIZZ(context, 0, "live-app-core-sdk");
        LJIIIIZZ(context, 0, "app_setting");
        LJIIIIZZ(context, 0, "av_ab_vesdk.xml");
        LJIIIIZZ(context, 0, "awemeInfo");
        LJIIIIZZ(context, 0, "performance_sp");
        LJIIIIZZ(context, 0, "account_sec_share_data");
        LJIIIIZZ(context, 0, "ttlive_tabs_cache_fyp");
        LJIIIIZZ(context, 0, "VideoRecord");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        JsonParseUtils.LIZIZ = ((Boolean) C285470BGv.LIZ.getValue()).booleanValue();
        if ((ColdBootPushStartupExperiment.LIZ().preloadKevaTask && (C2456309jt.LIZJ() || ColdBootPushStartupExperiment.LIZIZ())) || ((Boolean) C0CD2.LJJJZ.getValue()).booleanValue()) {
            return;
        }
        C01GW c01gw = C274470ApJ.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C309370CAt.LJII.getClass();
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                C309220CAe.LIZJ(EnumC309240CAg.KV, "frist_brush_keva");
            }
            C309220CAe.LJ(EnumC309240CAg.KV, "frist_brush_keva");
            if (((Boolean) C274470ApJ.LIZIZ.getValue()).booleanValue()) {
                LJIIIZ(context);
                return;
            }
            return;
        }
        LJIIIZ(context);
        if (((Boolean) C0CG6.LJ.getValue()).booleanValue()) {
            KevaImpl.getRepoSync("repo_ve_hook", 0);
            KevaImpl.getRepoFromSpSync(context, "com.vkontakte.android_pref_name", 0);
            KevaImpl.getRepoFromSpSync(context, "prefs_feed_check", 0);
            KevaImpl.getRepoSync("repo_new_version_journey", 0);
            KevaImpl.getRepoSync("repo_auto_volume", 0);
            KevaImpl.getRepoSync("compliance_setting", 0);
            KevaImpl.getRepoSync("tpc_consent", 0);
            KevaImpl.getRepoSync("new_user_journey", 0);
            KevaImpl.getRepoSync("eea_nonpersonalized_repo", 0);
            KevaImpl.getRepoSync("NewUserUtils", 0);
            KevaImpl.getRepoSync("new_user_journey", 0);
            KevaImpl.getRepoSync("praise_keva", 0);
            KevaImpl.getRepoSync("mandatory_login_repo", 0);
            KevaImpl.getRepoSync("event_hot_area", 0);
            KevaImpl.getRepoSync("repo_story_cold_start", 0);
            KevaImpl.getRepoSync("account_security_keva_name", 0);
            KevaImpl.getRepoSync("first_install_version", 0);
            KevaImpl.getRepoFromSpSync(context, "MTMainTabPreferences", 0);
            KevaImpl.getRepoFromSpSync(context, "InitialChooseLanguagePreferences", 0);
            KevaImpl.getRepoSync("guidance_progress_bar", 0);
            KevaImpl.getRepoSync("search_common", 0);
            KevaImpl.getRepoSync("money_growth", 0);
            KevaImpl.getRepoSync("not_interested_tutorial", 0);
            KevaImpl.getRepoSync("plugin_repo", 0);
            KevaImpl.getRepoFromSpSync(context, "tcm_pro_account", 0);
            KevaImpl.getRepoSync("keva_notice_count", 0);
            KevaImpl.getRepoSync("compliance_privacy_group_chat_cache", 0);
            KevaImpl.getRepoSync("age_gate_service_repo", 0);
            KevaImpl.getRepoSync("ies_im_core", 0);
            KevaImpl.getRepoSync("check_multi_account_repo", 0);
            KevaImpl.getRepoSync("password_status", 0);
            KevaImpl.getRepoSync("keva_aweme_account_user", 0);
            KevaImpl.getRepoSync("disable_im_under_sixteen_repo", 0);
            KevaImpl.getRepoSync("feed_ad_survey_repo", 0);
            KevaImpl.getRepoFromSpSync(context, "sp_stay_home_guide_cache", 0);
            KevaImpl.getRepoFromSpSync(context, "sp_show_share_guide_cache", 0);
            KevaImpl.getRepoSync("interest_select", 0);
            KevaImpl.getRepoSync("spec_act_debug_time", 0);
            KevaImpl.getRepoSync("deliverAdKeva", 0);
            KevaImpl.getRepoSync("keva_video_consume", 0);
            KevaImpl.getRepoSync("permission_dialog6774942497421984774", 0);
        } else if (((Boolean) C0CG6.LJFF.getValue()).booleanValue()) {
            KevaImpl.getRepoSync("repo_ve_hook", 0);
            KevaImpl.getRepoSync("repo_new_version_journey", 0);
            KevaImpl.getRepoSync("repo_auto_volume", 0);
            KevaImpl.getRepoSync("tpc_consent", 0);
            KevaImpl.getRepoSync("setting_from_server", 0);
            KevaImpl.getRepoSync("new_user_journey", 0);
            KevaImpl.getRepoSync("eea_nonpersonalized_repo", 0);
            KevaImpl.getRepoSync("NewUserUtils", 0);
            KevaImpl.getRepoSync("praise_keva", 0);
            KevaImpl.getRepoSync("mandatory_login_repo", 0);
            KevaImpl.getRepoSync("event_hot_area", 0);
            KevaImpl.getRepoSync("auto_translation_settings_cache", 0);
            KevaImpl.getRepoSync("TTSettingData", 0);
            KevaImpl.getRepoSync("repo_story_cold_start", 0);
            KevaImpl.getRepoSync("account_security_keva_name", 0);
            KevaImpl.getRepoSync("first_install_version", 0);
            KevaImpl.getRepoFromSpSync(context, "MTMainTabPreferences", 0);
            KevaImpl.getRepoSync("BaseListFragmentPanel", 0);
            KevaImpl.getRepoFromSpSync(context, "InitialChooseLanguagePreferences", 0);
            KevaImpl.getRepoSync("guidance_progress_bar", 0);
            KevaImpl.getRepoSync("search_common", 0);
            KevaImpl.getRepoSync("not_interested_tutorial", 0);
            KevaImpl.getRepoSync("plugin_repo", 0);
            KevaImpl.getRepoSync("keva_notice_count", 0);
            KevaImpl.getRepoSync("age_gate_service_repo", 0);
            KevaImpl.getRepoSync("compliance_privacy_group_chat_cache", 0);
            KevaImpl.getRepoSync("check_multi_account_repo", 0);
            KevaImpl.getRepoSync("password_status", 0);
            KevaImpl.getRepoSync("keva_aweme_account_user", 0);
            KevaImpl.getRepoSync("disable_im_under_sixteen_repo", 0);
            KevaImpl.getRepoSync("player_setting", 0);
            KevaImpl.getRepoSync("feed_ad_survey_repo", 0);
            KevaImpl.getRepoSync("video_gift_settings_keva_repo", 0);
            KevaImpl.getRepoSync("interest_select", 0);
            KevaImpl.getRepoSync("spec_act_debug_time", 0);
            KevaImpl.getRepoSync("deliverAdKeva", 0);
            KevaImpl.getRepoSync("keva_video_consume", 0);
            KevaImpl.getRepoSync("permission_dialog6774942497421984774", 0);
        }
        KevaImpl.getRepoSync("kevaUser", 0);
    }

    public final void LJIIIIZZ(Context context, int i, String str) {
        C810670Vr7.LIZJ(context, 0, str).getInt("tiktok", 0);
    }
}
