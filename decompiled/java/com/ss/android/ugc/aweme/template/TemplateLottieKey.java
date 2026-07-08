package com.ss.android.ugc.aweme.template;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateLottieKey {

    @C09CT("is_auto_play_first_time")
    public final boolean isAutoPlayFirstTime;

    @C09CT("is_quit_after_click")
    public final boolean isQuitAfterClick;

    @C09CT("is_show_end_frame")
    public final boolean isShowEndFrame;

    @C09CT("time_stamp")
    public final List<Long> timeStamp;

    public TemplateLottieKey() {
        this(false, false, false, null, 15, null);
    }

    public final boolean isAutoPlayFirstTime() {
        return this.isAutoPlayFirstTime;
    }

    public final boolean isQuitAfterClick() {
        return this.isQuitAfterClick;
    }

    public final boolean isShowEndFrame() {
        return this.isShowEndFrame;
    }

    public TemplateLottieKey(boolean z, boolean z2, boolean z3, List<Long> list) {
        this.isShowEndFrame = z;
        this.isAutoPlayFirstTime = z2;
        this.isQuitAfterClick = z3;
        this.timeStamp = list;
    }

    public TemplateLottieKey(boolean z, boolean z2, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
