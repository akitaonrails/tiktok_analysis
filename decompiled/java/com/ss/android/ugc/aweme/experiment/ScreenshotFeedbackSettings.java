package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenshotFeedbackSettings {
    public static final ScreenFeedbackConfig LIZ = new ScreenFeedbackConfig(new String[]{"lark_inhouse", "local_test"}, "", 0, null, 0, 28, null);

    public static final class ScreenFeedbackConfig {

        @C09CT("avoid_in_app_push")
        public final int avoidInAppPush;

        @C09CT("black_page_list")
        public final List<String> blackPageList;

        @C09CT("feedback_url")
        public final String feedbackURL;

        @C09CT("feedback_useable")
        public final int feedbackUsable;

        @C09CT("valid_channel")
        public final String[] validChannel;

        public ScreenFeedbackConfig() {
            this(null, null, 0, null, 0, 31, null);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ScreenFeedbackConfig(validChannel=");
            sbLIZ.append(Arrays.toString(this.validChannel));
            sbLIZ.append(", feedbackURL=");
            sbLIZ.append(this.feedbackURL);
            sbLIZ.append(", feedbackUsable=");
            sbLIZ.append(this.feedbackUsable);
            sbLIZ.append(", blackPageList=");
            sbLIZ.append(this.blackPageList);
            sbLIZ.append(", avoidInAppPush=");
            sbLIZ.append(this.avoidInAppPush);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ScreenFeedbackConfig(String[] strArr, String str, int i, List<String> list, int i2) {
            this.validChannel = strArr;
            this.feedbackURL = str;
            this.feedbackUsable = i;
            this.blackPageList = list;
            this.avoidInAppPush = i2;
        }

        public ScreenFeedbackConfig(String[] strArr, String str, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? new String[0] : strArr, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? C13BV.INSTANCE : list, (i3 & 16) == 0 ? i2 : 0);
        }
    }
}
