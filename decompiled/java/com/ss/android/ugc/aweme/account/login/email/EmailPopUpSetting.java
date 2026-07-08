package com.ss.android.ugc.aweme.account.login.email;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailPopUpSetting {
    public static final PassportEmailPopupSettingsModel LIZ = new PassportEmailPopupSettingsModel(new PopupFrequencyInfo(604800, 2, 1814400), new AddEmailPopupStrings("", "", "", "", "", ""));

    public static final class PopupFrequencyInfo {

        @C09CT("email_pop_up_dismiss_soft_cap")
        public final long emailPopUpDismissSoftCap;

        @C09CT("email_popup_freq")
        public final long emailPopupFreq;

        @C09CT("email_popup_reduced_freq")
        public final long emailPopupReducedFreq;

        public PopupFrequencyInfo() {
            this(604800L, 2L, 1814400L);
        }

        public PopupFrequencyInfo(long j, long j2, long j3) {
            this.emailPopupFreq = j;
            this.emailPopUpDismissSoftCap = j2;
            this.emailPopupReducedFreq = j3;
        }
    }

    public static final PassportEmailPopupSettingsModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PassportEmailPopupSettingsModel passportEmailPopupSettingsModel = LIZ;
        PassportEmailPopupSettingsModel passportEmailPopupSettingsModel2 = (PassportEmailPopupSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("passport_email_popup_settings", PassportEmailPopupSettingsModel.class, passportEmailPopupSettingsModel);
        return passportEmailPopupSettingsModel2 != null ? passportEmailPopupSettingsModel2 : passportEmailPopupSettingsModel;
    }

    public static final class PassportEmailPopupSettingsModel {

        @C09CT("add_email_popup_strings")
        public final AddEmailPopupStrings addEmailPopupStrings;

        @C09CT("popup_frequency_info")
        public final PopupFrequencyInfo popupFrequencyInfo;

        public PassportEmailPopupSettingsModel(PopupFrequencyInfo popupFrequencyInfo, AddEmailPopupStrings addEmailPopupStrings) {
            this.popupFrequencyInfo = popupFrequencyInfo;
            this.addEmailPopupStrings = addEmailPopupStrings;
        }
    }

    public static final class AddEmailPopupStrings {

        @C09CT("action_sheet_place_holder")
        public final String actionSheetPlaceHolder;

        @C09CT("action_sheet_title")
        public final String actionSheetTitle;

        @C09CT("one_step_action_sheet_body")
        public final String oneStepActionSheetBody;

        @C09CT("popup_body")
        public final String popupBody;

        @C09CT("popup_title")
        public final String popupTitle;

        @C09CT("two_step_action_sheet_body")
        public final String twoStepActionSheetBody;

        public AddEmailPopupStrings(String str, String str2, String str3, String str4, String str5, String str6) {
            this.actionSheetPlaceHolder = str;
            this.actionSheetTitle = str2;
            this.twoStepActionSheetBody = str3;
            this.popupTitle = str4;
            this.oneStepActionSheetBody = str5;
            this.popupBody = str6;
        }
    }
}
