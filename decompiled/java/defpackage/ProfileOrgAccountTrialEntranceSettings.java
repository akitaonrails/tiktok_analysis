package defpackage;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileOrgAccountTrialEntranceSettings {
    public static final ProfileOrgAccountTrialEntranceModel LIZ = new ProfileOrgAccountTrialEntranceModel(Boolean.TRUE, "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Forg_account_c2b%2F%3Fuse_spark%3D1%26enter_from%3Dpersonal_homepage&keyboard_adjust=2&hide_nav_bar=1&append_common_params=1&disable_ttnet_proxy=0&hide_status_bar=1");

    public static final ProfileOrgAccountTrialEntranceModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ProfileOrgAccountTrialEntranceModel profileOrgAccountTrialEntranceModel = LIZ;
        ProfileOrgAccountTrialEntranceModel profileOrgAccountTrialEntranceModel2 = (ProfileOrgAccountTrialEntranceModel) settingsManagerLIZLLL.LJIIIIZZ("profile_org_account_trial_entrance", ProfileOrgAccountTrialEntranceModel.class, profileOrgAccountTrialEntranceModel);
        return profileOrgAccountTrialEntranceModel2 != null ? profileOrgAccountTrialEntranceModel2 : profileOrgAccountTrialEntranceModel;
    }

    public static final class ProfileOrgAccountTrialEntranceModel {

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("trial_entrance_url")
        public final String trialEntranceUrl;

        public ProfileOrgAccountTrialEntranceModel(Boolean bool, String str) {
            this.enable = bool;
            this.trialEntranceUrl = str;
        }
    }
}
