package com.ss.android.ugc.aweme.autofill.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenAutofillSettingsSettings {
    public static final OpenAutofillSettingsModel LIZ;

    static {
        new OpenAutofillSettingsSettings();
        LIZ = new OpenAutofillSettingsModel(null, null, null, null, false, 31, null);
    }

    public static final OpenAutofillSettingsModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            OpenAutofillSettingsModel openAutofillSettingsModel = LIZ;
            OpenAutofillSettingsModel openAutofillSettingsModel2 = (OpenAutofillSettingsModel) settingsManagerLIZLLL.LJIIIIZZ("open_autofill_settings", OpenAutofillSettingsModel.class, openAutofillSettingsModel);
            return openAutofillSettingsModel2 != null ? openAutofillSettingsModel2 : openAutofillSettingsModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class OpenAutofillSettingsModel {

        @C09CT("allowed_domains")
        public final List<String> allowedDomains;

        @C09CT("autofill_popup_schema")
        public final String autofillPopupSchema;

        @C09CT("autofill_learnmore_link")
        public final String learnMoreLink;

        @C09CT("autofill_save_popup_schema")
        public final String savePopupSchema;

        @C09CT("ttop_dfid_check_enabled")
        public final boolean ttopDFIDCheckEnabled;

        public OpenAutofillSettingsModel() {
            this(null, null, null, null, false, 31, null);
        }

        public OpenAutofillSettingsModel(List<String> list, String str, String str2, String str3, boolean z) {
            this.allowedDomains = list;
            this.learnMoreLink = str;
            this.autofillPopupSchema = str2;
            this.savePopupSchema = str3;
            this.ttopDFIDCheckEnabled = z;
        }

        public OpenAutofillSettingsModel(List list, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? false : z);
        }
    }
}
