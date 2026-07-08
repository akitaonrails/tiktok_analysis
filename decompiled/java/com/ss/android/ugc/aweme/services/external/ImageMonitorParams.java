package com.ss.android.ugc.aweme.services.external;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageMonitorParams {
    public final Function0<Boolean> parentVisibleGetter;
    public final String scene;
    public final Function0<Long> startTimeGetter;

    public final Function0<Boolean> getParentVisibleGetter() {
        return this.parentVisibleGetter;
    }

    public final String getScene() {
        return this.scene;
    }

    public final Function0<Long> getStartTimeGetter() {
        return this.startTimeGetter;
    }

    public ImageMonitorParams(String str, Function0<Long> function0, Function0<Boolean> function02) {
        this.scene = str;
        this.startTimeGetter = function0;
        this.parentVisibleGetter = function02;
    }
}
