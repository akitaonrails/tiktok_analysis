package com.ss.android.ugc.aweme.shortvideo.mvtemplate.ab;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import com.bytedance.keva.Keva;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CCDiversionEntConfig {
    public static final CCDiversionEntConfig LIZ = new CCDiversionEntConfig();
    public static final CCDiversionEntConfigBean LIZIZ = new CCDiversionEntConfigBean(null, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(134));

    public static CCDiversionEntConfigBean LIZ() {
        return (CCDiversionEntConfigBean) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        CapCutButtonBean capCutButtonBean;
        return (LIZ().capcutButton == null || (capCutButtonBean = LIZ().capcutButton) == null || capCutButtonBean.supportTargetApp == null) ? false : true;
    }

    public static final class CCDiversionEntConfigBean {

        @C09CT("capcut_banner")
        public final CapCutBannerBean capcutBanner;

        @C09CT("capcut_button")
        public final CapCutButtonBean capcutButton;

        public CCDiversionEntConfigBean() {
            this(null, null);
        }

        public CCDiversionEntConfigBean(CapCutButtonBean capCutButtonBean, CapCutBannerBean capCutBannerBean) {
            this.capcutButton = capCutButtonBean;
            this.capcutBanner = capCutBannerBean;
        }
    }

    public static final class CapCutButtonBean {

        @C09CT("onelink")
        public final String onelink;

        @C09CT("support_target_app")
        public final List<SupportTargetAppBean> supportTargetApp;

        @C09CT("title")
        public final String title;

        public CapCutButtonBean() {
            this(null, null, null, 7, null);
        }

        public CapCutButtonBean(String str, List<SupportTargetAppBean> list, String str2) {
            this.title = str;
            this.supportTargetApp = list;
            this.onelink = str2;
        }

        public CapCutButtonBean(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2);
        }
    }

    public static final class SupportTargetAppBean {

        @C09CT("action_android")
        public final String actionAndroid;

        @C09CT("extra")
        public final Map<String, Object> extra;

        @C09CT("max")
        public final long max;

        @C09CT("min")
        public final long min;

        public SupportTargetAppBean() {
            this(0L, 0L, "", null);
        }

        public SupportTargetAppBean(long j, long j2, String str, Map<String, ? extends Object> map) {
            this.min = j;
            this.max = j2;
            this.actionAndroid = str;
            this.extra = map;
        }
    }

    public static final class CapCutBannerBean {
        public static final C01GW<Keva> LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(133));

        @C09CT("action_android")
        public final String actionAndroid;

        @C09CT("btn_text")
        public final String btnText;

        @C09CT("max_close_times")
        public final int maxCloseTimes;

        @C09CT("max_show_times")
        public final int maxShowTimes;

        @C09CT("max_show_times_after_click")
        public final int maxShowTimesAfterClick;

        @C09CT("need_select")
        public final int needSelect;

        @C09CT("onelink")
        public final String onelink;

        @C09CT("position")
        public final String position;

        @C09CT("times_per_day")
        public final int timesPerDay;

        @C09CT("title")
        public final String title;

        public CapCutBannerBean(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5) {
            this.position = str;
            this.title = str2;
            this.btnText = str3;
            this.actionAndroid = str4;
            this.onelink = str5;
            this.needSelect = i;
            this.timesPerDay = i2;
            this.maxShowTimes = i3;
            this.maxCloseTimes = i4;
            this.maxShowTimesAfterClick = i5;
        }
    }
}
