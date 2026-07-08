package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ai_beauty_camera_params")
public final class LiveAIBeautyCameraParams {
    public static final LiveAIBeautyCameraParams INSTANCE = new LiveAIBeautyCameraParams();
    public static final AIBeautyCameraParamList DEFAULT = new AIBeautyCameraParamList(null, null, null, null, null, null, null, null);

    /* JADX INFO: loaded from: classes19.dex */
    public static final class CameraParams {
        public static final TypeAdapter ADAPTER;

        @C09CT("max")
        public float max;

        @C09CT("min")
        public float min;

        @C09CT("value")
        public float value;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveAIBeautyCameraParams_CameraParams_OptTypeAdapter();
        }

        public CameraParams() {
            this(-999.0f, 0.0f, 0.0f);
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final void setMin(float f) {
            this.min = f;
        }

        public final void setValue(float f) {
            this.value = f;
        }

        public CameraParams(float f, float f2, float f3) {
            this.value = f;
            this.min = f2;
            this.max = f3;
        }
    }

    private final AIBeautyCameraParamList getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AIBeautyCameraParamList aIBeautyCameraParamList = DEFAULT;
        AIBeautyCameraParamList aIBeautyCameraParamList2 = (AIBeautyCameraParamList) settingsManager.getValueSafely("live_ai_beauty_camera_params", aIBeautyCameraParamList);
        return aIBeautyCameraParamList2 != null ? aIBeautyCameraParamList2 : aIBeautyCameraParamList;
    }

    public final AIBeautyCameraParamList getValue() {
        return getSettingValue();
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class AIBeautyCameraParamList {
        public static final TypeAdapter ADAPTER = new LiveAIBeautyCameraParams_AIBeautyCameraParamList_OptTypeAdapter(NormalGson.singleton());

        @C09CT("addColor")
        public CameraParams addColor;

        @C09CT("brightness")
        public CameraParams brightness;

        @C09CT("constrast")
        public CameraParams contrast;

        @C09CT("gamma")
        public CameraParams gamma;

        @C09CT("hueShift")
        public CameraParams hueShift;

        @C09CT("mulColor")
        public CameraParams mulColor;

        @C09CT("opacity")
        public CameraParams opacity;

        @C09CT("saturation")
        public CameraParams saturation;

        public AIBeautyCameraParamList() {
            this(null, null, null, null, null, null, null, null);
        }

        public final CameraParams getAddColor() {
            return this.addColor;
        }

        public final CameraParams getBrightness() {
            return this.brightness;
        }

        public final CameraParams getContrast() {
            return this.contrast;
        }

        public final CameraParams getGamma() {
            return this.gamma;
        }

        public final CameraParams getHueShift() {
            return this.hueShift;
        }

        public final CameraParams getMulColor() {
            return this.mulColor;
        }

        public final CameraParams getOpacity() {
            return this.opacity;
        }

        public final CameraParams getSaturation() {
            return this.saturation;
        }

        public final void setAddColor(CameraParams cameraParams) {
            this.addColor = cameraParams;
        }

        public final void setBrightness(CameraParams cameraParams) {
            this.brightness = cameraParams;
        }

        public final void setContrast(CameraParams cameraParams) {
            this.contrast = cameraParams;
        }

        public final void setGamma(CameraParams cameraParams) {
            this.gamma = cameraParams;
        }

        public final void setHueShift(CameraParams cameraParams) {
            this.hueShift = cameraParams;
        }

        public final void setMulColor(CameraParams cameraParams) {
            this.mulColor = cameraParams;
        }

        public final void setOpacity(CameraParams cameraParams) {
            this.opacity = cameraParams;
        }

        public final void setSaturation(CameraParams cameraParams) {
            this.saturation = cameraParams;
        }

        public AIBeautyCameraParamList(CameraParams cameraParams, CameraParams cameraParams2, CameraParams cameraParams3, CameraParams cameraParams4, CameraParams cameraParams5, CameraParams cameraParams6, CameraParams cameraParams7, CameraParams cameraParams8) {
            this.gamma = cameraParams;
            this.brightness = cameraParams2;
            this.contrast = cameraParams3;
            this.saturation = cameraParams4;
            this.hueShift = cameraParams5;
            this.opacity = cameraParams6;
            this.addColor = cameraParams7;
            this.mulColor = cameraParams8;
        }
    }
}
