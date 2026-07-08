package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes6.dex */
public final class TextMotionData {
    public String LIZ;
    public transient int LIZIZ;
    public Effect LIZJ;

    @C09CT("auto_set_line_break")
    public boolean autoWrapLine;

    @C09CT("animation_duration")
    public float motionDuration;

    @C09CT("animation_type")
    public int motionType;

    public TextMotionData() {
        this(0, 0.0f, "", false, 2, null);
    }

    public final boolean LIZ() {
        return this.LIZIZ == 1;
    }

    public TextMotionData(int i, float f, String str, boolean z, int i2, Effect effect) {
        this.motionType = i;
        this.motionDuration = f;
        this.LIZ = str;
        this.autoWrapLine = z;
        this.LIZIZ = i2;
        this.LIZJ = effect;
    }
}
