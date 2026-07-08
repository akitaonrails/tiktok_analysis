package com.ss.android.ugc.aweme.compliance.common.hydrogen.configs;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
public final class AccountDeleteLibraSetting {
    public static final AccountDeleteSettingModel LIZ = new AccountDeleteSettingModel("aweme://webview?hide_nav_bar=1&__status_bar=true&use_spark=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm", "aweme://webview?hide_nav_bar=1&__status_bar=true&use_spark=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm_child", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm%2Fdownload", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm%2Fcheck", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fpassport", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fmobile", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Foauth", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fstatus", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Foptions", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Fdelete", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Freminder", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Fmobile", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete2Fpassport", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Foauth");

    public static final AccountDeleteSettingModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AccountDeleteSettingModel accountDeleteSettingModel = LIZ;
        AccountDeleteSettingModel accountDeleteSettingModel2 = (AccountDeleteSettingModel) settingsManagerLIZLLL.LJIIIIZZ("account_deletion", AccountDeleteSettingModel.class, accountDeleteSettingModel);
        if (accountDeleteSettingModel2 == null) {
            return accountDeleteSettingModel;
        }
        String str = accountDeleteSettingModel2.deleteConfirm;
        if (str == null) {
            str = accountDeleteSettingModel.deleteConfirm;
        }
        String str2 = accountDeleteSettingModel2.deleteConfirmChild;
        if (str2 == null) {
            str2 = accountDeleteSettingModel.deleteConfirmChild;
        }
        String str3 = accountDeleteSettingModel2.deleteConfirmDownload;
        if (str3 == null) {
            str3 = accountDeleteSettingModel.deleteConfirmDownload;
        }
        String str4 = accountDeleteSettingModel2.deleteConfirmCheck;
        if (str4 == null) {
            str4 = accountDeleteSettingModel.deleteConfirmCheck;
        }
        String str5 = accountDeleteSettingModel2.deletePassport;
        if (str5 == null) {
            str5 = accountDeleteSettingModel.deletePassport;
        }
        String str6 = accountDeleteSettingModel2.deleteMobile;
        if (str6 == null) {
            str6 = accountDeleteSettingModel.deleteMobile;
        }
        String str7 = accountDeleteSettingModel2.deleteOauth;
        if (str7 == null) {
            str7 = accountDeleteSettingModel.deleteOauth;
        }
        String str8 = accountDeleteSettingModel2.deleteStatus;
        if (str8 == null) {
            str8 = accountDeleteSettingModel.deleteStatus;
        }
        String str9 = accountDeleteSettingModel2.deactiveOptions;
        if (str9 == null) {
            str9 = accountDeleteSettingModel.deactiveOptions;
        }
        String str10 = accountDeleteSettingModel2.deactiveReminder;
        if (str10 == null) {
            str10 = accountDeleteSettingModel.deactiveReminder;
        }
        String str11 = accountDeleteSettingModel2.deactiveMobile;
        if (str11 == null) {
            str11 = accountDeleteSettingModel.deactiveMobile;
        }
        String str12 = accountDeleteSettingModel2.deactivePassport;
        if (str12 == null) {
            str12 = accountDeleteSettingModel.deactivePassport;
        }
        String str13 = accountDeleteSettingModel2.deactiveDelete;
        if (str13 == null) {
            str13 = accountDeleteSettingModel.deactiveDelete;
        }
        String str14 = accountDeleteSettingModel2.deactiveOauth;
        if (str14 == null) {
            str14 = accountDeleteSettingModel.deactiveOauth;
        }
        return new AccountDeleteSettingModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str13, str10, str11, str12, str14);
    }

    public static final class AccountDeleteSettingModel {

        @C09CT("ad_deactive_delete")
        public final String deactiveDelete;

        @C09CT("ad_deactive_mobile")
        public final String deactiveMobile;

        @C09CT("ad_deactive_oauth")
        public final String deactiveOauth;

        @C09CT("ad_deactive_options")
        public final String deactiveOptions;

        @C09CT("ad_deactive_passport")
        public final String deactivePassport;

        @C09CT("ad_deactive_reminder")
        public final String deactiveReminder;

        @C09CT("ad_delete_confirm")
        public final String deleteConfirm;

        @C09CT("ad_delete_confirm_check")
        public final String deleteConfirmCheck;

        @C09CT("ad_delete_confirm_child")
        public final String deleteConfirmChild;

        @C09CT("ad_delete_confirm_download")
        public final String deleteConfirmDownload;

        @C09CT("ad_delete_mobile")
        public final String deleteMobile;

        @C09CT("ad_delete_oauth")
        public final String deleteOauth;

        @C09CT("ad_delete_passport")
        public final String deletePassport;

        @C09CT("ad_delete_status")
        public final String deleteStatus;

        public AccountDeleteSettingModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.deleteConfirm = str;
            this.deleteConfirmChild = str2;
            this.deleteConfirmDownload = str3;
            this.deleteConfirmCheck = str4;
            this.deletePassport = str5;
            this.deleteMobile = str6;
            this.deleteOauth = str7;
            this.deleteStatus = str8;
            this.deactiveOptions = str9;
            this.deactiveDelete = str10;
            this.deactiveReminder = str11;
            this.deactiveMobile = str12;
            this.deactivePassport = str13;
            this.deactiveOauth = str14;
        }
    }
}
