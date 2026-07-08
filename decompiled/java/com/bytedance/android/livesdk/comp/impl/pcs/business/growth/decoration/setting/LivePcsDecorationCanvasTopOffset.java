package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C418440Gaw;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_decoration_canvas_topoffset")
public final class LivePcsDecorationCanvasTopOffset {
    public static final int DEFAULT = 125;
    public static final LivePcsDecorationCanvasTopOffset INSTANCE = new LivePcsDecorationCanvasTopOffset();

    public final float getValue() {
        return C418440Gaw.LIZIZ(Integer.valueOf(SettingsManager.INSTANCE.getIntValue("live_pcs_decoration_canvas_topoffset", DEFAULT)));
    }
}
