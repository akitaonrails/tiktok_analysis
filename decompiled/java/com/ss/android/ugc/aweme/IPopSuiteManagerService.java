package com.ss.android.ugc.aweme;

import X.AbstractC738140SxQ;
import X.C09CT;
import X.C13IQ;
import X.C21312218am;
import X.C21312318an;
import X.C21312418ao;
import X.C21312518ap;
import X.C2188811AlT;
import X.C443120HZe;
import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public interface IPopSuiteManagerService {
    boolean getPassportPopupConfig();

    C443120HZe<Boolean, C21312318an, String> isFreqControlSatisfied(String str, PopupFreqControlObject popupFreqControlObject, String str2, C21312518ap c21312518ap);

    boolean isPopupConfigPresent(String str);

    C13IQ<? extends AbstractC738140SxQ> popSuiteTabSwitchAssem();

    void popSuiteTriggerPopup(Activity activity, Function0<Unit> function0);

    boolean shouldShowPopSuitePopup(String str);

    DialogFragment showCommonTuxIntroPopSheet(Activity activity, C21312218am c21312218am);

    public static final class ButtonActionObject implements Serializable {

        @C09CT("action_type")
        public final int actionType;

        @C09CT("button_deeplink")
        public final String btnDeeplink;

        @C09CT("min_version")
        public final String minVersion;

        public ButtonActionObject(int i, String str, String str2) {
            this.actionType = i;
            this.btnDeeplink = str;
            this.minVersion = str2;
        }
    }

    public static final class PopupFreqControlObject {

        @C09CT("interval_day")
        public final int intervalDay;

        @C09CT("interval_hourly")
        public final int intervalHourly;

        @C09CT("max_count")
        public final int maxCount;

        @C09CT("max_count_day")
        public final int maxCountDay;

        @C09CT("max_count_month")
        public final int maxCountMonth;

        @C09CT("max_count_week")
        public final int maxCountWeek;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupFreqControlObject(intervalDay=");
            sbLIZ.append(this.intervalDay);
            sbLIZ.append(", intervalHourly=");
            sbLIZ.append(this.intervalHourly);
            sbLIZ.append(", maxCountDay=");
            sbLIZ.append(this.maxCountDay);
            sbLIZ.append(", maxCountWeek=");
            sbLIZ.append(this.maxCountWeek);
            sbLIZ.append(", maxCountMonth=");
            sbLIZ.append(this.maxCountMonth);
            sbLIZ.append(", maxCount=");
            sbLIZ.append(this.maxCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PopupFreqControlObject(int i, int i2, int i3, int i4, int i5, int i6) {
            this.intervalDay = i;
            this.intervalHourly = i2;
            this.maxCountDay = i3;
            this.maxCountWeek = i4;
            this.maxCountMonth = i5;
            this.maxCount = i6;
        }
    }

    public static final class PopupConfigObject implements Serializable {

        @C09CT("button_action")
        public final ButtonActionObject btnAction;

        @C09CT("button_string")
        public final String btnString;

        @C09CT("description_hyperlinks")
        public final Map<String, C21312418ao> descHyperlinks;

        @C09CT("description_string")
        public final String descString;

        @C09CT("icon_url")
        public final String iconUrl;

        @C09CT("interval_day")
        public final int intervalDay;

        @C09CT("interval_hourly")
        public final int intervalHourly;

        @C09CT("max_count")
        public final int maxCount;

        @C09CT("max_count_day")
        public final int maxCountDay;

        @C09CT("max_count_month")
        public final int maxCountMonth;

        @C09CT("max_count_week")
        public final int maxCountWeek;

        @C09CT("need_confirmation")
        public final boolean needConfirmation;

        @C09CT("popup_layout")
        public final String popupLayout;

        @C09CT("popup_name")
        public final String popupName;

        @C09CT("priority")
        public final int priority;

        @C09CT("secondary_button_action")
        public final ButtonActionObject secondaryButtonAction;

        @C09CT("secondary_button_string")
        public final String secondaryButtonString;

        @C09CT("title_string")
        public final String titleStr;

        public PopupConfigObject(String str, String str2, String str3, Map<String, C21312418ao> map, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, ButtonActionObject buttonActionObject, String str6, String str7, ButtonActionObject buttonActionObject2) {
            this.popupName = str;
            this.titleStr = str2;
            this.descString = str3;
            this.descHyperlinks = map;
            this.btnString = str4;
            this.iconUrl = str5;
            this.priority = i;
            this.intervalDay = i2;
            this.intervalHourly = i3;
            this.maxCountDay = i4;
            this.maxCountWeek = i5;
            this.maxCountMonth = i6;
            this.maxCount = i7;
            this.needConfirmation = z;
            this.btnAction = buttonActionObject;
            this.popupLayout = str6;
            this.secondaryButtonString = str7;
            this.secondaryButtonAction = buttonActionObject2;
        }
    }
}
