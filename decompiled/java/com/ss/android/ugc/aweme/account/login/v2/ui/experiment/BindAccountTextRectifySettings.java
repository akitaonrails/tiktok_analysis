package com.ss.android.ugc.aweme.account.login.v2.ui.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes20.dex */
public final class BindAccountTextRectifySettings {
    public static final BindAccountTextRectifyModel LIZ = new BindAccountTextRectifyModel(true, true, true, false);

    public static final BindAccountTextRectifyModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BindAccountTextRectifyModel bindAccountTextRectifyModel = LIZ;
        BindAccountTextRectifyModel bindAccountTextRectifyModel2 = (BindAccountTextRectifyModel) settingsManagerLIZLLL.LJIIIIZZ("bind_account_text_rectify", BindAccountTextRectifyModel.class, bindAccountTextRectifyModel);
        return bindAccountTextRectifyModel2 != null ? bindAccountTextRectifyModel2 : bindAccountTextRectifyModel;
    }

    public static final class BindAccountTextRectifyModel {

        @C09CT("append_disclaimer")
        public final boolean appendDisclaimer;

        @C09CT("append_learn_more")
        public final boolean appendLearnMore;

        @C09CT("cold_launch_sheet_rectify")
        public final boolean coldLaunchSheetRectify;

        @C09CT("login_logout_page_rectify")
        public final boolean loginAndLogoutRectify;

        public BindAccountTextRectifyModel() {
            this(true, true, true, false);
        }

        public BindAccountTextRectifyModel(boolean z, boolean z2, boolean z3, boolean z4) {
            this.coldLaunchSheetRectify = z;
            this.appendLearnMore = z2;
            this.loginAndLogoutRectify = z3;
            this.appendDisclaimer = z4;
        }
    }
}
