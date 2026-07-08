package com.ss.android.ugc.aweme.story.setting.ui.size;

import X.C09CT;
import X.C1608360rxK;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryAvatarConfigWrapper {

    @C09CT("badge_size")
    public final int badgeSize;

    @C09CT("badge_outline_width")
    public final int badgeStrokeWidth;

    @C09CT("circle_stroke_width")
    public final float circleStrokeWidth;

    @C09CT("circle_outline_width")
    public final float hollowOutlineWidth;

    public StoryAvatarConfigWrapper() {
        this(0.0f, 0.0f, 0, 0, 15, null);
    }

    public StoryAvatarConfigWrapper(float f, float f2, int i, int i2) {
        this.circleStrokeWidth = f;
        this.hollowOutlineWidth = f2;
        this.badgeSize = i;
        this.badgeStrokeWidth = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StoryAvatarConfigWrapper(float f, float f2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            float f3 = C1608360rxK.LJI;
            f = C1608360rxK.LJII;
        }
        if ((i3 & 2) != 0) {
            float f4 = C1608360rxK.LJI;
            f2 = C1608360rxK.LJI;
        }
        if ((i3 & 4) != 0) {
            float f5 = C1608360rxK.LJI;
            i = C1608360rxK.LJIIIIZZ;
        }
        if ((i3 & 8) != 0) {
            float f6 = C1608360rxK.LJI;
            i2 = C1608360rxK.LJIIIZ;
        }
        this(f, f2, i, i2);
    }
}
