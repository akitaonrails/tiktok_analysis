package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C0HAX;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class AnimationConfig implements Serializable {
    public static final C0HAX Companion = new Object() { // from class: X.0HAX
    };

    @C09CT("enter_animation_type")
    public final int enterAnimationType;

    @C09CT("exit_click_x_animation_type")
    public final int exitClickXAnimationType;

    @C09CT("exit_slide_animation_type")
    public final int exitSlideAnimationType;

    public AnimationConfig() {
        this(2, 2, 2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationConfig)) {
            return false;
        }
        AnimationConfig animationConfig = (AnimationConfig) obj;
        return this.enterAnimationType == animationConfig.enterAnimationType && this.exitSlideAnimationType == animationConfig.exitSlideAnimationType && this.exitClickXAnimationType == animationConfig.exitClickXAnimationType;
    }

    public int hashCode() {
        return (((this.enterAnimationType * 31) + this.exitSlideAnimationType) * 31) + this.exitClickXAnimationType;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationConfig(enterAnimationType=");
        sbLIZ.append(this.enterAnimationType);
        sbLIZ.append(", exitSlideAnimationType=");
        sbLIZ.append(this.exitSlideAnimationType);
        sbLIZ.append(", exitClickXAnimationType=");
        sbLIZ.append(this.exitClickXAnimationType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final int effectiveMiddleEnterType(AnimationConfig animationConfig) {
        Companion.getClass();
        if (animationConfig != null) {
            return animationConfig.enterAnimationType;
        }
        return 1;
    }

    public static final int effectiveMiddleExitClickXType(AnimationConfig animationConfig) {
        Companion.getClass();
        if (animationConfig != null) {
            return animationConfig.exitClickXAnimationType;
        }
        return 1;
    }

    public static final int effectiveMiddleExitSlideType(AnimationConfig animationConfig) {
        Companion.getClass();
        if (animationConfig != null) {
            return animationConfig.exitSlideAnimationType;
        }
        return 2;
    }

    public AnimationConfig(int i, int i2, int i3) {
        this.enterAnimationType = i;
        this.exitSlideAnimationType = i2;
        this.exitClickXAnimationType = i3;
    }
}
