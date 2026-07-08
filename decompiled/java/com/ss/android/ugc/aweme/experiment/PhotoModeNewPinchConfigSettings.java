package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeNewPinchConfigSettings {
    public static final PhotoModeNewPinchConfig LIZ = new PhotoModeNewPinchConfig(0.5f, 4.0f, 6.0f, 1.1f, 1.1f, 0.9f, 1.0f, 0.65f);

    public static final class PhotoModeNewPinchConfig {

        @C09CT("clear_mode_enter_threshold")
        public final float clearModeEnterThreshold;

        @C09CT("clear_mode_exit_threshold")
        public final float clearModeExitThreshold;

        @C09CT("new_pinch_interactive_scale_max")
        public final float newPinchInteractiveScaleMax;

        @C09CT("new_pinch_scale_max")
        public final float newPinchScaleMax;

        @C09CT("new_pinch_scale_min")
        public final float newPinchScaleMin;

        @C09CT("zoom_fixed_direct_exit_threshold")
        public final float zoomFixedDirectExitThreshold;

        @C09CT("zoom_fixed_enter_threshold")
        public final float zoomFixedEnterThreshold;

        @C09CT("zoom_fixed_exit_threshold")
        public final float zoomFixedExitThreshold;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhotoModeNewPinchConfig)) {
                return false;
            }
            PhotoModeNewPinchConfig photoModeNewPinchConfig = (PhotoModeNewPinchConfig) obj;
            return Float.compare(this.newPinchScaleMin, photoModeNewPinchConfig.newPinchScaleMin) == 0 && Float.compare(this.newPinchScaleMax, photoModeNewPinchConfig.newPinchScaleMax) == 0 && Float.compare(this.newPinchInteractiveScaleMax, photoModeNewPinchConfig.newPinchInteractiveScaleMax) == 0 && Float.compare(this.clearModeEnterThreshold, photoModeNewPinchConfig.clearModeEnterThreshold) == 0 && Float.compare(this.zoomFixedEnterThreshold, photoModeNewPinchConfig.zoomFixedEnterThreshold) == 0 && Float.compare(this.clearModeExitThreshold, photoModeNewPinchConfig.clearModeExitThreshold) == 0 && Float.compare(this.zoomFixedExitThreshold, photoModeNewPinchConfig.zoomFixedExitThreshold) == 0 && Float.compare(this.zoomFixedDirectExitThreshold, photoModeNewPinchConfig.zoomFixedDirectExitThreshold) == 0;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PhotoModeNewPinchConfig(newPinchScaleMin=");
            sbLIZ.append(this.newPinchScaleMin);
            sbLIZ.append(", newPinchScaleMax=");
            sbLIZ.append(this.newPinchScaleMax);
            sbLIZ.append(", newPinchInteractiveScaleMax=");
            sbLIZ.append(this.newPinchInteractiveScaleMax);
            sbLIZ.append(", clearModeEnterThreshold=");
            sbLIZ.append(this.clearModeEnterThreshold);
            sbLIZ.append(", zoomFixedEnterThreshold=");
            sbLIZ.append(this.zoomFixedEnterThreshold);
            sbLIZ.append(", clearModeExitThreshold=");
            sbLIZ.append(this.clearModeExitThreshold);
            sbLIZ.append(", zoomFixedExitThreshold=");
            sbLIZ.append(this.zoomFixedExitThreshold);
            sbLIZ.append(", zoomFixedDirectExitThreshold=");
            sbLIZ.append(this.zoomFixedDirectExitThreshold);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PhotoModeNewPinchConfig() {
            this(0.5f, 4.0f, 6.0f, 1.1f, 1.1f, 0.9f, 1.0f, 0.65f);
        }

        public final int hashCode() {
            return (((((((((((((Float.floatToIntBits(this.newPinchScaleMin) * 31) + Float.floatToIntBits(this.newPinchScaleMax)) * 31) + Float.floatToIntBits(this.newPinchInteractiveScaleMax)) * 31) + Float.floatToIntBits(this.clearModeEnterThreshold)) * 31) + Float.floatToIntBits(this.zoomFixedEnterThreshold)) * 31) + Float.floatToIntBits(this.clearModeExitThreshold)) * 31) + Float.floatToIntBits(this.zoomFixedExitThreshold)) * 31) + Float.floatToIntBits(this.zoomFixedDirectExitThreshold);
        }

        public PhotoModeNewPinchConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.newPinchScaleMin = f;
            this.newPinchScaleMax = f2;
            this.newPinchInteractiveScaleMax = f3;
            this.clearModeEnterThreshold = f4;
            this.zoomFixedEnterThreshold = f5;
            this.clearModeExitThreshold = f6;
            this.zoomFixedExitThreshold = f7;
            this.zoomFixedDirectExitThreshold = f8;
        }
    }
}
