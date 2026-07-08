package com.ss.android.ugc.feed.platform.cell.interact.next.debug;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class StdStandardTemplateData {
    public static final int $stable = 8;

    @C09CT("customDrawable")
    public CustomDrawable customDrawable;

    @C09CT("enableInterruptionEvent")
    public boolean enableInterruptionEvent;

    @C09CT("enableVOInterceptor")
    public boolean enableVOInterceptor;

    @C09CT("standardUI")
    public Map<String, ? extends Object> standardUI;

    public StdStandardTemplateData() {
        this(null, false, false, new CustomDrawable(false, "#FFFFFFFF"));
    }

    public final void setCustomDrawable(CustomDrawable customDrawable) {
        this.customDrawable = customDrawable;
    }

    public final void setEnableInterruptionEvent(boolean z) {
        this.enableInterruptionEvent = z;
    }

    public final void setEnableVOInterceptor(boolean z) {
        this.enableVOInterceptor = z;
    }

    public final void setStandardUI(Map<String, ? extends Object> map) {
        this.standardUI = map;
    }

    public StdStandardTemplateData(Map<String, ? extends Object> map, boolean z, boolean z2, CustomDrawable customDrawable) {
        this.standardUI = map;
        this.enableVOInterceptor = z;
        this.enableInterruptionEvent = z2;
        this.customDrawable = customDrawable;
    }
}
