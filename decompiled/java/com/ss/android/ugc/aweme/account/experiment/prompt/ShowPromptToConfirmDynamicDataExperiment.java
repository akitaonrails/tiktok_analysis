package com.ss.android.ugc.aweme.account.experiment.prompt;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ShowPromptToConfirmDynamicDataExperiment {
    public static final MetaData LIZ = new MetaData(C1697810uHb.LJIIJJI("US", "AU"), new Frequency(604800, 2, 4, 604800, 2, 3, 604800, 604800, 604800), new Strings("Reconfirm phone number", "Your phone number may be used to connect you to people you may know, improve ads, and more, based on your settings. If you don’t reconfirm, your phone number will remain on your account until you delete it. Learn more in the %s", "ROW popup update action for phone", "Confirm", "Reconfirm email", "Your email may be used to connect you to people you may know, improve ads, and more, based on your settings. If you don’t reconfirm, your email will remain on your account until you delete it. Learn more in the %s", "Update", "ROW popup confirm action for email", "Confirm use of phone", "Your phone number may be used to connect you to people you may know, improve ads, and more, based on your settings. Learn more in the %s", "Not now", "Confirm", "Confirm use of email", "Your email may be used to connect you to people you may know, improve ads, and more, based on your settings. Learn more in the %s", "Not now", "Confirm"));

    public static final MetaData LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MetaData metaData = LIZ;
        MetaData metaData2 = (MetaData) settingsManagerLIZLLL.LJIIIIZZ("confirm_email_phone_phase2", MetaData.class, metaData);
        return metaData2 != null ? metaData2 : metaData;
    }

    public static final class MetaData {

        @C09CT("non_auto_verify_countries")
        public final List<String> nonAutoVerifyCountries;

        @C09CT("verify_email_phone_frequency_control")
        public final Frequency verifyEmailPhoneFrequencyControl;

        @C09CT("verify_email_phone_popup_strings")
        public final Strings verifyEmailPhonePopupStrings;

        public MetaData(List<String> list, Frequency frequency, Strings strings) {
            this.nonAutoVerifyCountries = list;
            this.verifyEmailPhoneFrequencyControl = frequency;
            this.verifyEmailPhonePopupStrings = strings;
        }
    }

    public static final class Frequency {

        @C09CT("auto_confirm_adjusted_freq")
        public final int autoConfirmSysAdjustedFreq;

        @C09CT("auto_confirm_dismiss_soft_cap")
        public final int autoConfirmSysDismissSoftCap;

        @C09CT("auto_confirm_maximum_number_displayed")
        public final int autoConfirmSysMaxNumberDisplayed;

        @C09CT("auto_confirm_pop_freq")
        public final int autoConfirmSysPopFreq;

        @C09CT("non_auto_confirm_adjusted_freq")
        public final int nonAutoConfirmSysAdjustedFreq;

        @C09CT("non_auto_confirm_dismiss_soft_cap")
        public final int nonAutoConfirmSysDismissSoftCap;

        @C09CT("non_auto_confirm_maximum_number_displayed")
        public final int nonAutoConfirmSysMaxNumberDisplayed;

        @C09CT("non_auto_confirm_pop_freq")
        public final int nonAutoConfirmSysPopFreq;

        @C09CT("time_after_login")
        public final int timeAfterLogin;

        public Frequency(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.autoConfirmSysAdjustedFreq = i;
            this.autoConfirmSysDismissSoftCap = i2;
            this.autoConfirmSysMaxNumberDisplayed = i3;
            this.autoConfirmSysPopFreq = i4;
            this.nonAutoConfirmSysAdjustedFreq = i5;
            this.nonAutoConfirmSysDismissSoftCap = i6;
            this.nonAutoConfirmSysMaxNumberDisplayed = i7;
            this.nonAutoConfirmSysPopFreq = i8;
            this.timeAfterLogin = i9;
        }
    }

    public static final class Strings {

        @C09CT("auto_confirm_popup_body_email")
        public final String autoConfirmPopupBodyEmail;

        @C09CT("auto_confirm_popup_body_phone")
        public final String autoConfirmPopupBodyPhone;

        @C09CT("auto_confirm_popup_confirm_email")
        public final String autoConfirmPopupConfirmEmail;

        @C09CT("auto_confirm_popup_confirm_phone")
        public final String autoConfirmPopupConfirmPhone;

        @C09CT("auto_confirm_popup_header_email")
        public final String autoConfirmPopupHeaderEmail;

        @C09CT("auto_confirm_popup_header_phone")
        public final String autoConfirmPopupHeaderPhone;

        @C09CT("auto_confirm_popup_update_email")
        public final String autoConfirmPopupUpdateEmail;

        @C09CT("auto_confirm_popup_update_phone")
        public final String autoConfirmPopupUpdatePhone;

        @C09CT("non_auto_confirm_popup_body_email")
        public final String nonAutoConfirmPopupBodyEmail;

        @C09CT("non_auto_confirm_popup_body_phone")
        public final String nonAutoConfirmPopupBodyPhone;

        @C09CT("non_auto_confirm_popup_confirm_email")
        public final String nonAutoConfirmPopupConfirmEmail;

        @C09CT("non_auto_confirm_popup_confirm_phone")
        public final String nonAutoConfirmPopupConfirmPhone;

        @C09CT("non_auto_confirm_popup_header_email")
        public final String nonAutoConfirmPopupHeaderEmail;

        @C09CT("non_auto_confirm_popup_header_phone")
        public final String nonAutoConfirmPopupHeaderPhone;

        @C09CT("non_auto_confirm_popup_notnow_email")
        public final String nonAutoConfirmPopupNotnowEmail;

        @C09CT("non_auto_confirm_popup_notnow_phone")
        public final String nonAutoConfirmPopupNotnowPhone;

        public Strings(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
            this.autoConfirmPopupHeaderPhone = str;
            this.autoConfirmPopupBodyPhone = str2;
            this.autoConfirmPopupUpdatePhone = str3;
            this.autoConfirmPopupConfirmPhone = str4;
            this.autoConfirmPopupHeaderEmail = str5;
            this.autoConfirmPopupBodyEmail = str6;
            this.autoConfirmPopupUpdateEmail = str7;
            this.autoConfirmPopupConfirmEmail = str8;
            this.nonAutoConfirmPopupHeaderPhone = str9;
            this.nonAutoConfirmPopupBodyPhone = str10;
            this.nonAutoConfirmPopupNotnowPhone = str11;
            this.nonAutoConfirmPopupConfirmPhone = str12;
            this.nonAutoConfirmPopupHeaderEmail = str13;
            this.nonAutoConfirmPopupBodyEmail = str14;
            this.nonAutoConfirmPopupNotnowEmail = str15;
            this.nonAutoConfirmPopupConfirmEmail = str16;
        }
    }
}
