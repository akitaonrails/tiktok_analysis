package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("roma_client_redirect_to_web")
public final class RomaWebRedirectForCustomErrorSetting {
    public static final RomaWebRedirectForCustomErrorSetting INSTANCE = new RomaWebRedirectForCustomErrorSetting();
    public static final RomaRedirectData DEFAULT = new RomaRedirectData(null, 0, 3, null);
    public static final RomaRedirectData KYC_REDIRECT = new RomaRedirectData(C1697810uHb.LJIIJJI("42030", "42031", "42032", "4005265", "4005266", "4005267", "4005268", "4005269", "4005270", "4005271", "4005258", "4005259", "4005260", "4005322", "4005323", "4005324", "4005325"), 1);
    public static final RomaRedirectData DEFAULT_TO_ROMA = new RomaRedirectData(C13BV.INSTANCE, 2);

    private final RomaRedirectData getRedirectData() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RomaRedirectData romaRedirectData = DEFAULT;
        RomaRedirectData romaRedirectData2 = (RomaRedirectData) settingsManager.getValueSafely("roma_client_redirect_to_web", romaRedirectData);
        return romaRedirectData2 != null ? romaRedirectData2 : romaRedirectData;
    }

    public static final class RomaRedirectData {
        public static final TypeAdapter ADAPTER = new RomaWebRedirectForCustomErrorSetting_RomaRedirectData_OptTypeAdapter(NormalGson.singleton());

        @C09CT("error_codes_to_redirect")
        public List<String> errorList;

        @C09CT("redirect_type")
        public int redirectType;

        public RomaRedirectData() {
            this(null, 0, 3, null);
        }

        public final List<String> getErrorList() {
            return this.errorList;
        }

        public final int getRedirectType() {
            return this.redirectType;
        }

        public final void setErrorList(List<String> list) {
            this.errorList = list;
        }

        public final void setRedirectType(int i) {
            this.redirectType = i;
        }

        public RomaRedirectData(List<String> list, int i) {
            this.errorList = list;
            this.redirectType = i;
        }

        public RomaRedirectData(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i);
        }
    }

    public final RomaRedirectData getDEFAULT() {
        return DEFAULT;
    }

    public final RomaRedirectData getDEFAULT_TO_ROMA() {
        return DEFAULT_TO_ROMA;
    }

    public final RomaRedirectData getKYC_REDIRECT() {
        return KYC_REDIRECT;
    }

    public final boolean shouldRedirectToRoma(String str) {
        int redirectType = getRedirectData().getRedirectType();
        if (redirectType == 0) {
            return false;
        }
        if (redirectType != 1) {
            if (redirectType != 2) {
                return false;
            }
            return true;
        }
        return getRedirectData().getErrorList().contains(str);
    }
}
