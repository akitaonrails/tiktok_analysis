package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class OptValue {

    @C09CT("enable_home_tab_dynamic_text")
    public final Integer enableHomeTabDynamicText;

    @C09CT("enable_slide_title_animation")
    public final Integer enableSlideTitleAnimation;

    @C09CT("slide_params_opt")
    public final Integer isEnableSlideParamsOpt;

    @C09CT("enable_slide_toast")
    public final Integer isEnableSlideToast;

    @C09CT("toast_x_tab_max_days")
    public final int toastMaxDays;

    public OptValue() {
        this(0, 0, 0, 0, 0);
    }

    public OptValue(Integer num, Integer num2, int i, Integer num3, Integer num4) {
        this.isEnableSlideParamsOpt = num;
        this.isEnableSlideToast = num2;
        this.toastMaxDays = i;
        this.enableHomeTabDynamicText = num3;
        this.enableSlideTitleAnimation = num4;
    }
}
